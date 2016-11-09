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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'ref'", "'()'", "'int'", "'String'", "'Unit'"
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


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:328:1: entryRulePureFunction : rulePureFunction EOF ;
    public final void entryRulePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:329:1: ( rulePureFunction EOF )
            // InternalFPML.g:330:1: rulePureFunction EOF
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
    // InternalFPML.g:337:1: rulePureFunction : ( ( rule__PureFunction__Group__0 ) ) ;
    public final void rulePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:341:2: ( ( ( rule__PureFunction__Group__0 ) ) )
            // InternalFPML.g:342:2: ( ( rule__PureFunction__Group__0 ) )
            {
            // InternalFPML.g:342:2: ( ( rule__PureFunction__Group__0 ) )
            // InternalFPML.g:343:3: ( rule__PureFunction__Group__0 )
            {
             before(grammarAccess.getPureFunctionAccess().getGroup()); 
            // InternalFPML.g:344:3: ( rule__PureFunction__Group__0 )
            // InternalFPML.g:344:4: rule__PureFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getGroup()); 

            }


            }

        }
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
    // InternalFPML.g:353:1: entryRuleEffectFullFunction : ruleEffectFullFunction EOF ;
    public final void entryRuleEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:354:1: ( ruleEffectFullFunction EOF )
            // InternalFPML.g:355:1: ruleEffectFullFunction EOF
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
    // InternalFPML.g:362:1: ruleEffectFullFunction : ( ( rule__EffectFullFunction__Group__0 ) ) ;
    public final void ruleEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:366:2: ( ( ( rule__EffectFullFunction__Group__0 ) ) )
            // InternalFPML.g:367:2: ( ( rule__EffectFullFunction__Group__0 ) )
            {
            // InternalFPML.g:367:2: ( ( rule__EffectFullFunction__Group__0 ) )
            // InternalFPML.g:368:3: ( rule__EffectFullFunction__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getGroup()); 
            // InternalFPML.g:369:3: ( rule__EffectFullFunction__Group__0 )
            // InternalFPML.g:369:4: rule__EffectFullFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:428:1: entryRuleEffectFullArgument : ruleEffectFullArgument EOF ;
    public final void entryRuleEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:429:1: ( ruleEffectFullArgument EOF )
            // InternalFPML.g:430:1: ruleEffectFullArgument EOF
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
    // InternalFPML.g:437:1: ruleEffectFullArgument : ( ( rule__EffectFullArgument__Group__0 ) ) ;
    public final void ruleEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:441:2: ( ( ( rule__EffectFullArgument__Group__0 ) ) )
            // InternalFPML.g:442:2: ( ( rule__EffectFullArgument__Group__0 ) )
            {
            // InternalFPML.g:442:2: ( ( rule__EffectFullArgument__Group__0 ) )
            // InternalFPML.g:443:3: ( rule__EffectFullArgument__Group__0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getGroup()); 
            // InternalFPML.g:444:3: ( rule__EffectFullArgument__Group__0 )
            // InternalFPML.g:444:4: rule__EffectFullArgument__Group__0
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
    // InternalFPML.g:453:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFPML.g:454:1: ( ruleArgument EOF )
            // InternalFPML.g:455:1: ruleArgument EOF
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
    // InternalFPML.g:462:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:466:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalFPML.g:467:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalFPML.g:467:2: ( ( rule__Argument__Group__0 ) )
            // InternalFPML.g:468:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalFPML.g:469:3: ( rule__Argument__Group__0 )
            // InternalFPML.g:469:4: rule__Argument__Group__0
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
    // InternalFPML.g:478:1: entryRuleFunctionBodyPure : ruleFunctionBodyPure EOF ;
    public final void entryRuleFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleFunctionBodyPure EOF )
            // InternalFPML.g:480:1: ruleFunctionBodyPure EOF
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
    // InternalFPML.g:487:1: ruleFunctionBodyPure : ( ( rule__FunctionBodyPure__Alternatives ) ) ;
    public final void ruleFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__FunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:492:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:492:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            // InternalFPML.g:493:3: ( rule__FunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:494:3: ( rule__FunctionBodyPure__Alternatives )
            // InternalFPML.g:494:4: rule__FunctionBodyPure__Alternatives
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
    // InternalFPML.g:503:1: entryRuleFunctionBodyEffectFull : ruleFunctionBodyEffectFull EOF ;
    public final void entryRuleFunctionBodyEffectFull() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:505:1: ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:512:1: ruleFunctionBodyEffectFull : ( ( rule__FunctionBodyEffectFull__Alternatives ) ) ;
    public final void ruleFunctionBodyEffectFull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__FunctionBodyEffectFull__Alternatives ) ) )
            // InternalFPML.g:517:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            {
            // InternalFPML.g:517:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            // InternalFPML.g:518:3: ( rule__FunctionBodyEffectFull__Alternatives )
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 
            // InternalFPML.g:519:3: ( rule__FunctionBodyEffectFull__Alternatives )
            // InternalFPML.g:519:4: rule__FunctionBodyEffectFull__Alternatives
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
    // InternalFPML.g:528:1: entryRuleEmptyFunctionBody : ruleEmptyFunctionBody EOF ;
    public final void entryRuleEmptyFunctionBody() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( ruleEmptyFunctionBody EOF )
            // InternalFPML.g:530:1: ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:537:1: ruleEmptyFunctionBody : ( ( rule__EmptyFunctionBody__Group__0 ) ) ;
    public final void ruleEmptyFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__EmptyFunctionBody__Group__0 ) ) )
            // InternalFPML.g:542:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            {
            // InternalFPML.g:542:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            // InternalFPML.g:543:3: ( rule__EmptyFunctionBody__Group__0 )
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 
            // InternalFPML.g:544:3: ( rule__EmptyFunctionBody__Group__0 )
            // InternalFPML.g:544:4: rule__EmptyFunctionBody__Group__0
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
    // InternalFPML.g:553:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:555:1: ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:562:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) )
            // InternalFPML.g:567:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            {
            // InternalFPML.g:567:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            // InternalFPML.g:568:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup()); 
            // InternalFPML.g:569:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            // InternalFPML.g:569:4: rule__CompositionFunctionBodyPure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup()); 

            }


            }

        }
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
    // InternalFPML.g:587:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) )
            // InternalFPML.g:592:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            {
            // InternalFPML.g:592:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            // InternalFPML.g:593:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup()); 
            // InternalFPML.g:594:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            // InternalFPML.g:594:4: rule__CompositionFunctionBodyEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:603:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleIOType EOF )
            // InternalFPML.g:605:1: ruleIOType EOF
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
    // InternalFPML.g:612:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:617:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:617:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:618:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:619:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:619:4: rule__IOType__Group__0
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
    // InternalFPML.g:628:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleValueType EOF )
            // InternalFPML.g:630:1: ruleValueType EOF
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
    // InternalFPML.g:637:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:642:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:642:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:643:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:644:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:644:4: rule__ValueType__Alternatives
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
    // InternalFPML.g:653:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( ruleType EOF )
            // InternalFPML.g:655:1: ruleType EOF
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
    // InternalFPML.g:662:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:667:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:667:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:668:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:669:3: ( rule__Type__Alternatives )
            // InternalFPML.g:669:4: rule__Type__Alternatives
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
    // InternalFPML.g:678:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleIntegerType EOF )
            // InternalFPML.g:680:1: ruleIntegerType EOF
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
    // InternalFPML.g:687:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:692:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:692:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:693:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:694:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:694:4: rule__IntegerType__Group__0
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
    // InternalFPML.g:703:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( ruleStringType EOF )
            // InternalFPML.g:705:1: ruleStringType EOF
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
    // InternalFPML.g:712:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:717:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:717:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:718:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:719:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:719:4: rule__StringType__Group__0
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
    // InternalFPML.g:728:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleUnitType EOF )
            // InternalFPML.g:730:1: ruleUnitType EOF
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
    // InternalFPML.g:737:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:742:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:742:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:743:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:744:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:744:4: rule__UnitType__Group__0
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
    // InternalFPML.g:753:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleDataType EOF )
            // InternalFPML.g:755:1: ruleDataType EOF
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
    // InternalFPML.g:762:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:767:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:767:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:768:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:769:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:769:4: rule__DataType__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:778:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleExpression EOF )
            // InternalFPML.g:780:1: ruleExpression EOF
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
    // InternalFPML.g:787:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFPML.g:792:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFPML.g:792:2: ( ( rule__Expression__Alternatives ) )
            // InternalFPML.g:793:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFPML.g:794:3: ( rule__Expression__Alternatives )
            // InternalFPML.g:794:4: rule__Expression__Alternatives
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
    // InternalFPML.g:803:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:804:1: ( ruleIntValue EOF )
            // InternalFPML.g:805:1: ruleIntValue EOF
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
    // InternalFPML.g:812:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:816:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalFPML.g:817:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalFPML.g:817:2: ( ( rule__IntValue__Group__0 ) )
            // InternalFPML.g:818:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalFPML.g:819:3: ( rule__IntValue__Group__0 )
            // InternalFPML.g:819:4: rule__IntValue__Group__0
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
    // InternalFPML.g:828:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:829:1: ( ruleStringValue EOF )
            // InternalFPML.g:830:1: ruleStringValue EOF
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
    // InternalFPML.g:837:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:841:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalFPML.g:842:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalFPML.g:842:2: ( ( rule__StringValue__Group__0 ) )
            // InternalFPML.g:843:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalFPML.g:844:3: ( rule__StringValue__Group__0 )
            // InternalFPML.g:844:4: rule__StringValue__Group__0
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
    // InternalFPML.g:853:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalFPML.g:854:1: ( ruleUnitValue EOF )
            // InternalFPML.g:855:1: ruleUnitValue EOF
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
    // InternalFPML.g:862:1: ruleUnitValue : ( ( rule__UnitValue__Group__0 ) ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:866:2: ( ( ( rule__UnitValue__Group__0 ) ) )
            // InternalFPML.g:867:2: ( ( rule__UnitValue__Group__0 ) )
            {
            // InternalFPML.g:867:2: ( ( rule__UnitValue__Group__0 ) )
            // InternalFPML.g:868:3: ( rule__UnitValue__Group__0 )
            {
             before(grammarAccess.getUnitValueAccess().getGroup()); 
            // InternalFPML.g:869:3: ( rule__UnitValue__Group__0 )
            // InternalFPML.g:869:4: rule__UnitValue__Group__0
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


    // $ANTLR start "entryRuleDataValue"
    // InternalFPML.g:878:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalFPML.g:879:1: ( ruleDataValue EOF )
            // InternalFPML.g:880:1: ruleDataValue EOF
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
    // InternalFPML.g:887:1: ruleDataValue : ( ( rule__DataValue__Group__0 ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:891:2: ( ( ( rule__DataValue__Group__0 ) ) )
            // InternalFPML.g:892:2: ( ( rule__DataValue__Group__0 ) )
            {
            // InternalFPML.g:892:2: ( ( rule__DataValue__Group__0 ) )
            // InternalFPML.g:893:3: ( rule__DataValue__Group__0 )
            {
             before(grammarAccess.getDataValueAccess().getGroup()); 
            // InternalFPML.g:894:3: ( rule__DataValue__Group__0 )
            // InternalFPML.g:894:4: rule__DataValue__Group__0
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


    // $ANTLR start "entryRuleAdtValue"
    // InternalFPML.g:903:1: entryRuleAdtValue : ruleAdtValue EOF ;
    public final void entryRuleAdtValue() throws RecognitionException {
        try {
            // InternalFPML.g:904:1: ( ruleAdtValue EOF )
            // InternalFPML.g:905:1: ruleAdtValue EOF
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
    // InternalFPML.g:912:1: ruleAdtValue : ( ( rule__AdtValue__Alternatives ) ) ;
    public final void ruleAdtValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:916:2: ( ( ( rule__AdtValue__Alternatives ) ) )
            // InternalFPML.g:917:2: ( ( rule__AdtValue__Alternatives ) )
            {
            // InternalFPML.g:917:2: ( ( rule__AdtValue__Alternatives ) )
            // InternalFPML.g:918:3: ( rule__AdtValue__Alternatives )
            {
             before(grammarAccess.getAdtValueAccess().getAlternatives()); 
            // InternalFPML.g:919:3: ( rule__AdtValue__Alternatives )
            // InternalFPML.g:919:4: rule__AdtValue__Alternatives
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


    // $ANTLR start "entryRuleProdTypeValue"
    // InternalFPML.g:928:1: entryRuleProdTypeValue : ruleProdTypeValue EOF ;
    public final void entryRuleProdTypeValue() throws RecognitionException {
        try {
            // InternalFPML.g:929:1: ( ruleProdTypeValue EOF )
            // InternalFPML.g:930:1: ruleProdTypeValue EOF
            {
             before(grammarAccess.getProdTypeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleProdTypeValue();

            state._fsp--;

             after(grammarAccess.getProdTypeValueRule()); 
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
    // $ANTLR end "entryRuleProdTypeValue"


    // $ANTLR start "ruleProdTypeValue"
    // InternalFPML.g:937:1: ruleProdTypeValue : ( ( rule__ProdTypeValue__Group__0 ) ) ;
    public final void ruleProdTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:941:2: ( ( ( rule__ProdTypeValue__Group__0 ) ) )
            // InternalFPML.g:942:2: ( ( rule__ProdTypeValue__Group__0 ) )
            {
            // InternalFPML.g:942:2: ( ( rule__ProdTypeValue__Group__0 ) )
            // InternalFPML.g:943:3: ( rule__ProdTypeValue__Group__0 )
            {
             before(grammarAccess.getProdTypeValueAccess().getGroup()); 
            // InternalFPML.g:944:3: ( rule__ProdTypeValue__Group__0 )
            // InternalFPML.g:944:4: rule__ProdTypeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProdTypeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProdTypeValue"


    // $ANTLR start "rule__AdtType__Alternatives"
    // InternalFPML.g:952:1: rule__AdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) );
    public final void rule__AdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:956:1: ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31||(LA1_0>=33 && LA1_0<=34)) ) {
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
                    // InternalFPML.g:957:2: ( ruleValueType )
                    {
                    // InternalFPML.g:957:2: ( ruleValueType )
                    // InternalFPML.g:958:3: ruleValueType
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
                    // InternalFPML.g:963:2: ( ( rule__AdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:963:2: ( ( rule__AdtType__Group_1__0 ) )
                    // InternalFPML.g:964:3: ( rule__AdtType__Group_1__0 )
                    {
                     before(grammarAccess.getAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:965:3: ( rule__AdtType__Group_1__0 )
                    // InternalFPML.g:965:4: rule__AdtType__Group_1__0
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
    // InternalFPML.g:973:1: rule__AdtType__AdtElement2Alternatives_1_2_0 : ( ( ruleSumType ) | ( ruleProdType ) );
    public final void rule__AdtType__AdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:977:1: ( ( ruleSumType ) | ( ruleProdType ) )
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
                    // InternalFPML.g:978:2: ( ruleSumType )
                    {
                    // InternalFPML.g:978:2: ( ruleSumType )
                    // InternalFPML.g:979:3: ruleSumType
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
                    // InternalFPML.g:984:2: ( ruleProdType )
                    {
                    // InternalFPML.g:984:2: ( ruleProdType )
                    // InternalFPML.g:985:3: ruleProdType
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
    // InternalFPML.g:994:1: rule__Function__Alternatives : ( ( rulePureFunction ) | ( ruleEffectFullFunction ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:998:1: ( ( rulePureFunction ) | ( ruleEffectFullFunction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==31||(LA3_1>=33 && LA3_1<=34)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==26) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFPML.g:999:2: ( rulePureFunction )
                    {
                    // InternalFPML.g:999:2: ( rulePureFunction )
                    // InternalFPML.g:1000:3: rulePureFunction
                    {
                     before(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePureFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1005:2: ( ruleEffectFullFunction )
                    {
                    // InternalFPML.g:1005:2: ( ruleEffectFullFunction )
                    // InternalFPML.g:1006:3: ruleEffectFullFunction
                    {
                     before(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_1()); 

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


    // $ANTLR start "rule__FunctionBodyPure__Alternatives"
    // InternalFPML.g:1015:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1019:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:1020:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1020:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1021:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1026:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:1026:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:1027:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1036:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1040:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:1041:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1041:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1042:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1047:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:1047:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:1048:3: ruleCompositionFunctionBodyEffect
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


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalFPML.g:1057:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1061:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFPML.g:1062:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:1062:2: ( ruleIntegerType )
                    // InternalFPML.g:1063:3: ruleIntegerType
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
                    // InternalFPML.g:1068:2: ( ruleStringType )
                    {
                    // InternalFPML.g:1068:2: ( ruleStringType )
                    // InternalFPML.g:1069:3: ruleStringType
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
                    // InternalFPML.g:1074:2: ( ruleDataType )
                    {
                    // InternalFPML.g:1074:2: ( ruleDataType )
                    // InternalFPML.g:1075:3: ruleDataType
                    {
                     before(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2()); 

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
    // InternalFPML.g:1084:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1088:1: ( ( ruleValueType ) | ( ruleUnitType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31||(LA7_0>=33 && LA7_0<=34)) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1089:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1089:2: ( ruleValueType )
                    // InternalFPML.g:1090:3: ruleValueType
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
                    // InternalFPML.g:1095:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1095:2: ( ruleUnitType )
                    // InternalFPML.g:1096:3: ruleUnitType
                    {
                     before(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1()); 

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
    // InternalFPML.g:1105:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1109:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1110:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1110:2: ( ruleIntValue )
                    // InternalFPML.g:1111:3: ruleIntValue
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
                    // InternalFPML.g:1116:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1116:2: ( ruleStringValue )
                    // InternalFPML.g:1117:3: ruleStringValue
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
                    // InternalFPML.g:1122:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:1122:2: ( ruleUnitValue )
                    // InternalFPML.g:1123:3: ruleUnitValue
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
                    // InternalFPML.g:1128:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1128:2: ( ruleDataValue )
                    // InternalFPML.g:1129:3: ruleDataValue
                    {
                     before(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3()); 

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
    // InternalFPML.g:1138:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ( rule__AdtValue__Group_3__0 ) ) );
    public final void rule__AdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1142:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ( rule__AdtValue__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1143:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1143:2: ( ruleIntValue )
                    // InternalFPML.g:1144:3: ruleIntValue
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
                    // InternalFPML.g:1149:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1149:2: ( ruleStringValue )
                    // InternalFPML.g:1150:3: ruleStringValue
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
                    // InternalFPML.g:1155:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1155:2: ( ruleDataValue )
                    // InternalFPML.g:1156:3: ruleDataValue
                    {
                     before(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1161:2: ( ( rule__AdtValue__Group_3__0 ) )
                    {
                    // InternalFPML.g:1161:2: ( ( rule__AdtValue__Group_3__0 ) )
                    // InternalFPML.g:1162:3: ( rule__AdtValue__Group_3__0 )
                    {
                     before(grammarAccess.getAdtValueAccess().getGroup_3()); 
                    // InternalFPML.g:1163:3: ( rule__AdtValue__Group_3__0 )
                    // InternalFPML.g:1163:4: rule__AdtValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdtValue__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdtValueAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalFPML.g:1171:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1175:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1176:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:1183:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1187:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1188:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1188:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1189:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1190:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1190:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:1198:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1202:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1203:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:1209:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1213:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:1214:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:1214:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:1215:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:1216:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:1216:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:1225:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1229:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:1230:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:1237:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1241:1: ( ( 'Pure' ) )
            // InternalFPML.g:1242:1: ( 'Pure' )
            {
            // InternalFPML.g:1242:1: ( 'Pure' )
            // InternalFPML.g:1243:2: 'Pure'
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
    // InternalFPML.g:1252:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1256:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:1257:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:1264:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1268:1: ( ( '{' ) )
            // InternalFPML.g:1269:1: ( '{' )
            {
            // InternalFPML.g:1269:1: ( '{' )
            // InternalFPML.g:1270:2: '{'
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
    // InternalFPML.g:1279:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1283:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:1284:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:1291:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1295:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:1296:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:1296:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:1297:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1298:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:1298:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:1306:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1310:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:1311:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:1318:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1322:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:1323:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:1323:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:1324:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:1325:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:1325:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:1333:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1337:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:1338:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:1344:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1348:1: ( ( '}' ) )
            // InternalFPML.g:1349:1: ( '}' )
            {
            // InternalFPML.g:1349:1: ( '}' )
            // InternalFPML.g:1350:2: '}'
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
    // InternalFPML.g:1360:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1364:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:1365:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:1372:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1376:1: ( ( 'Functions' ) )
            // InternalFPML.g:1377:1: ( 'Functions' )
            {
            // InternalFPML.g:1377:1: ( 'Functions' )
            // InternalFPML.g:1378:2: 'Functions'
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
    // InternalFPML.g:1387:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1391:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:1392:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:1399:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1403:1: ( ( '{' ) )
            // InternalFPML.g:1404:1: ( '{' )
            {
            // InternalFPML.g:1404:1: ( '{' )
            // InternalFPML.g:1405:2: '{'
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
    // InternalFPML.g:1414:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1418:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:1419:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:1426:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1430:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:1431:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:1431:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:1432:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:1433:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFPML.g:1433:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalFPML.g:1441:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1445:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:1446:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:1452:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1456:1: ( ( '}' ) )
            // InternalFPML.g:1457:1: ( '}' )
            {
            // InternalFPML.g:1457:1: ( '}' )
            // InternalFPML.g:1458:2: '}'
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
    // InternalFPML.g:1468:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1472:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:1473:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
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
    // InternalFPML.g:1480:1: rule__DataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1484:1: ( ( 'Data' ) )
            // InternalFPML.g:1485:1: ( 'Data' )
            {
            // InternalFPML.g:1485:1: ( 'Data' )
            // InternalFPML.g:1486:2: 'Data'
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
    // InternalFPML.g:1495:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1499:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:1500:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
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
    // InternalFPML.g:1507:1: rule__DataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1511:1: ( ( '{' ) )
            // InternalFPML.g:1512:1: ( '{' )
            {
            // InternalFPML.g:1512:1: ( '{' )
            // InternalFPML.g:1513:2: '{'
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
    // InternalFPML.g:1522:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1526:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:1527:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
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
    // InternalFPML.g:1534:1: rule__DataBlock__Group__2__Impl : ( ( rule__DataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1538:1: ( ( ( rule__DataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:1539:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:1539:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:1540:2: ( rule__DataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1541:2: ( rule__DataBlock__ElementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFPML.g:1541:3: rule__DataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalFPML.g:1549:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1553:1: ( rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 )
            // InternalFPML.g:1554:2: rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4
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
    // InternalFPML.g:1561:1: rule__DataBlock__Group__3__Impl : ( ( rule__DataBlock__ValueAssignment_3 ) ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1565:1: ( ( ( rule__DataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:1566:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:1566:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:1567:2: ( rule__DataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:1568:2: ( rule__DataBlock__ValueAssignment_3 )
            // InternalFPML.g:1568:3: rule__DataBlock__ValueAssignment_3
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
    // InternalFPML.g:1576:1: rule__DataBlock__Group__4 : rule__DataBlock__Group__4__Impl ;
    public final void rule__DataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1580:1: ( rule__DataBlock__Group__4__Impl )
            // InternalFPML.g:1581:2: rule__DataBlock__Group__4__Impl
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
    // InternalFPML.g:1587:1: rule__DataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1591:1: ( ( '}' ) )
            // InternalFPML.g:1592:1: ( '}' )
            {
            // InternalFPML.g:1592:1: ( '}' )
            // InternalFPML.g:1593:2: '}'
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
    // InternalFPML.g:1603:1: rule__ValueBlock__Group__0 : rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 ;
    public final void rule__ValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1607:1: ( rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 )
            // InternalFPML.g:1608:2: rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1
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
    // InternalFPML.g:1615:1: rule__ValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__ValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1619:1: ( ( 'Value' ) )
            // InternalFPML.g:1620:1: ( 'Value' )
            {
            // InternalFPML.g:1620:1: ( 'Value' )
            // InternalFPML.g:1621:2: 'Value'
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
    // InternalFPML.g:1630:1: rule__ValueBlock__Group__1 : rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 ;
    public final void rule__ValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1634:1: ( rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 )
            // InternalFPML.g:1635:2: rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2
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
    // InternalFPML.g:1642:1: rule__ValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1646:1: ( ( '{' ) )
            // InternalFPML.g:1647:1: ( '{' )
            {
            // InternalFPML.g:1647:1: ( '{' )
            // InternalFPML.g:1648:2: '{'
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
    // InternalFPML.g:1657:1: rule__ValueBlock__Group__2 : rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 ;
    public final void rule__ValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1661:1: ( rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 )
            // InternalFPML.g:1662:2: rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3
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
    // InternalFPML.g:1669:1: rule__ValueBlock__Group__2__Impl : ( ( rule__ValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__ValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1673:1: ( ( ( rule__ValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:1674:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:1674:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:1675:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1676:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFPML.g:1676:3: rule__ValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFPML.g:1684:1: rule__ValueBlock__Group__3 : rule__ValueBlock__Group__3__Impl ;
    public final void rule__ValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1688:1: ( rule__ValueBlock__Group__3__Impl )
            // InternalFPML.g:1689:2: rule__ValueBlock__Group__3__Impl
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
    // InternalFPML.g:1695:1: rule__ValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__ValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1699:1: ( ( '}' ) )
            // InternalFPML.g:1700:1: ( '}' )
            {
            // InternalFPML.g:1700:1: ( '}' )
            // InternalFPML.g:1701:2: '}'
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
    // InternalFPML.g:1711:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1715:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:1716:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:1723:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1727:1: ( ( 'Effects' ) )
            // InternalFPML.g:1728:1: ( 'Effects' )
            {
            // InternalFPML.g:1728:1: ( 'Effects' )
            // InternalFPML.g:1729:2: 'Effects'
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
    // InternalFPML.g:1738:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1742:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:1743:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
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
    // InternalFPML.g:1750:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1754:1: ( ( '{' ) )
            // InternalFPML.g:1755:1: ( '{' )
            {
            // InternalFPML.g:1755:1: ( '{' )
            // InternalFPML.g:1756:2: '{'
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
    // InternalFPML.g:1765:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1769:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:1770:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
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
    // InternalFPML.g:1777:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1781:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:1782:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:1782:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:1783:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:1784:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFPML.g:1784:3: rule__EffectFullBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFPML.g:1792:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1796:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:1797:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:1804:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1808:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:1809:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:1809:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:1810:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:1811:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:1811:3: rule__EffectFullBlock__MainAssignment_3
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
    // InternalFPML.g:1819:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1823:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:1824:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:1830:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1834:1: ( ( '}' ) )
            // InternalFPML.g:1835:1: ( '}' )
            {
            // InternalFPML.g:1835:1: ( '}' )
            // InternalFPML.g:1836:2: '}'
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
    // InternalFPML.g:1846:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1850:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:1851:2: rule__Data__Group__0__Impl rule__Data__Group__1
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
    // InternalFPML.g:1858:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1862:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:1863:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:1863:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:1864:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:1865:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:1865:3: rule__Data__NameAssignment_0
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
    // InternalFPML.g:1873:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1877:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:1878:2: rule__Data__Group__1__Impl rule__Data__Group__2
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
    // InternalFPML.g:1885:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1889:1: ( ( ':' ) )
            // InternalFPML.g:1890:1: ( ':' )
            {
            // InternalFPML.g:1890:1: ( ':' )
            // InternalFPML.g:1891:2: ':'
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
    // InternalFPML.g:1900:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1904:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:1905:2: rule__Data__Group__2__Impl
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
    // InternalFPML.g:1911:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1915:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:1916:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:1916:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:1917:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:1918:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:1918:3: rule__Data__ContentAssignment_2
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
    // InternalFPML.g:1927:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1931:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalFPML.g:1932:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalFPML.g:1939:1: rule__Value__Group__0__Impl : ( ( rule__Value__NameAssignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1943:1: ( ( ( rule__Value__NameAssignment_0 ) ) )
            // InternalFPML.g:1944:1: ( ( rule__Value__NameAssignment_0 ) )
            {
            // InternalFPML.g:1944:1: ( ( rule__Value__NameAssignment_0 ) )
            // InternalFPML.g:1945:2: ( rule__Value__NameAssignment_0 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_0()); 
            // InternalFPML.g:1946:2: ( rule__Value__NameAssignment_0 )
            // InternalFPML.g:1946:3: rule__Value__NameAssignment_0
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
    // InternalFPML.g:1954:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1958:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalFPML.g:1959:2: rule__Value__Group__1__Impl rule__Value__Group__2
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
    // InternalFPML.g:1966:1: rule__Value__Group__1__Impl : ( ':' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1970:1: ( ( ':' ) )
            // InternalFPML.g:1971:1: ( ':' )
            {
            // InternalFPML.g:1971:1: ( ':' )
            // InternalFPML.g:1972:2: ':'
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
    // InternalFPML.g:1981:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1985:1: ( rule__Value__Group__2__Impl )
            // InternalFPML.g:1986:2: rule__Value__Group__2__Impl
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
    // InternalFPML.g:1992:1: rule__Value__Group__2__Impl : ( ( rule__Value__ValueAssignment_2 ) ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1996:1: ( ( ( rule__Value__ValueAssignment_2 ) ) )
            // InternalFPML.g:1997:1: ( ( rule__Value__ValueAssignment_2 ) )
            {
            // InternalFPML.g:1997:1: ( ( rule__Value__ValueAssignment_2 ) )
            // InternalFPML.g:1998:2: ( rule__Value__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_2()); 
            // InternalFPML.g:1999:2: ( rule__Value__ValueAssignment_2 )
            // InternalFPML.g:1999:3: rule__Value__ValueAssignment_2
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
    // InternalFPML.g:2008:1: rule__AdtType__Group_1__0 : rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 ;
    public final void rule__AdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2012:1: ( rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 )
            // InternalFPML.g:2013:2: rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1
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
    // InternalFPML.g:2020:1: rule__AdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2024:1: ( ( '[' ) )
            // InternalFPML.g:2025:1: ( '[' )
            {
            // InternalFPML.g:2025:1: ( '[' )
            // InternalFPML.g:2026:2: '['
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
    // InternalFPML.g:2035:1: rule__AdtType__Group_1__1 : rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 ;
    public final void rule__AdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2039:1: ( rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 )
            // InternalFPML.g:2040:2: rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2
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
    // InternalFPML.g:2047:1: rule__AdtType__Group_1__1__Impl : ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) ;
    public final void rule__AdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2051:1: ( ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:2052:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:2052:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            // InternalFPML.g:2053:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1()); 
            // InternalFPML.g:2054:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            // InternalFPML.g:2054:3: rule__AdtType__AdtElement1Assignment_1_1
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
    // InternalFPML.g:2062:1: rule__AdtType__Group_1__2 : rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 ;
    public final void rule__AdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2066:1: ( rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 )
            // InternalFPML.g:2067:2: rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3
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
    // InternalFPML.g:2074:1: rule__AdtType__Group_1__2__Impl : ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) ;
    public final void rule__AdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2078:1: ( ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:2079:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:2079:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            // InternalFPML.g:2080:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2()); 
            // InternalFPML.g:2081:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            // InternalFPML.g:2081:3: rule__AdtType__AdtElement2Assignment_1_2
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
    // InternalFPML.g:2089:1: rule__AdtType__Group_1__3 : rule__AdtType__Group_1__3__Impl ;
    public final void rule__AdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2093:1: ( rule__AdtType__Group_1__3__Impl )
            // InternalFPML.g:2094:2: rule__AdtType__Group_1__3__Impl
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
    // InternalFPML.g:2100:1: rule__AdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2104:1: ( ( ']' ) )
            // InternalFPML.g:2105:1: ( ']' )
            {
            // InternalFPML.g:2105:1: ( ']' )
            // InternalFPML.g:2106:2: ']'
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
    // InternalFPML.g:2116:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2120:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:2121:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
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
    // InternalFPML.g:2128:1: rule__SumType__Group__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2132:1: ( ( '+' ) )
            // InternalFPML.g:2133:1: ( '+' )
            {
            // InternalFPML.g:2133:1: ( '+' )
            // InternalFPML.g:2134:2: '+'
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
    // InternalFPML.g:2143:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2147:1: ( rule__SumType__Group__1__Impl )
            // InternalFPML.g:2148:2: rule__SumType__Group__1__Impl
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
    // InternalFPML.g:2154:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__AdtElementAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2158:1: ( ( ( rule__SumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2159:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2159:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2160:2: ( rule__SumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2161:2: ( rule__SumType__AdtElementAssignment_1 )
            // InternalFPML.g:2161:3: rule__SumType__AdtElementAssignment_1
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
    // InternalFPML.g:2170:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2174:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:2175:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
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
    // InternalFPML.g:2182:1: rule__ProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2186:1: ( ( '*' ) )
            // InternalFPML.g:2187:1: ( '*' )
            {
            // InternalFPML.g:2187:1: ( '*' )
            // InternalFPML.g:2188:2: '*'
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
    // InternalFPML.g:2197:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2201:1: ( rule__ProdType__Group__1__Impl )
            // InternalFPML.g:2202:2: rule__ProdType__Group__1__Impl
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
    // InternalFPML.g:2208:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2212:1: ( ( ( rule__ProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2213:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2213:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2214:2: ( rule__ProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2215:2: ( rule__ProdType__AdtElementAssignment_1 )
            // InternalFPML.g:2215:3: rule__ProdType__AdtElementAssignment_1
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


    // $ANTLR start "rule__PureFunction__Group__0"
    // InternalFPML.g:2224:1: rule__PureFunction__Group__0 : rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 ;
    public final void rule__PureFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2228:1: ( rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 )
            // InternalFPML.g:2229:2: rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PureFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__0"


    // $ANTLR start "rule__PureFunction__Group__0__Impl"
    // InternalFPML.g:2236:1: rule__PureFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2240:1: ( ( 'def' ) )
            // InternalFPML.g:2241:1: ( 'def' )
            {
            // InternalFPML.g:2241:1: ( 'def' )
            // InternalFPML.g:2242:2: 'def'
            {
             before(grammarAccess.getPureFunctionAccess().getDefKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__0__Impl"


    // $ANTLR start "rule__PureFunction__Group__1"
    // InternalFPML.g:2251:1: rule__PureFunction__Group__1 : rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 ;
    public final void rule__PureFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2255:1: ( rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 )
            // InternalFPML.g:2256:2: rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__PureFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__1"


    // $ANTLR start "rule__PureFunction__Group__1__Impl"
    // InternalFPML.g:2263:1: rule__PureFunction__Group__1__Impl : ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2267:1: ( ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2268:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2268:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2269:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2270:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2270:3: rule__PureFunction__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__1__Impl"


    // $ANTLR start "rule__PureFunction__Group__2"
    // InternalFPML.g:2278:1: rule__PureFunction__Group__2 : rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 ;
    public final void rule__PureFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2282:1: ( rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 )
            // InternalFPML.g:2283:2: rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PureFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__2"


    // $ANTLR start "rule__PureFunction__Group__2__Impl"
    // InternalFPML.g:2290:1: rule__PureFunction__Group__2__Impl : ( ( rule__PureFunction__NameAssignment_2 ) ) ;
    public final void rule__PureFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2294:1: ( ( ( rule__PureFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2295:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2295:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            // InternalFPML.g:2296:2: ( rule__PureFunction__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2297:2: ( rule__PureFunction__NameAssignment_2 )
            // InternalFPML.g:2297:3: rule__PureFunction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__2__Impl"


    // $ANTLR start "rule__PureFunction__Group__3"
    // InternalFPML.g:2305:1: rule__PureFunction__Group__3 : rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 ;
    public final void rule__PureFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2309:1: ( rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 )
            // InternalFPML.g:2310:2: rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__PureFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__3"


    // $ANTLR start "rule__PureFunction__Group__3__Impl"
    // InternalFPML.g:2317:1: rule__PureFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2321:1: ( ( '(' ) )
            // InternalFPML.g:2322:1: ( '(' )
            {
            // InternalFPML.g:2322:1: ( '(' )
            // InternalFPML.g:2323:2: '('
            {
             before(grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__3__Impl"


    // $ANTLR start "rule__PureFunction__Group__4"
    // InternalFPML.g:2332:1: rule__PureFunction__Group__4 : rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 ;
    public final void rule__PureFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2336:1: ( rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 )
            // InternalFPML.g:2337:2: rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__PureFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__4"


    // $ANTLR start "rule__PureFunction__Group__4__Impl"
    // InternalFPML.g:2344:1: rule__PureFunction__Group__4__Impl : ( ( rule__PureFunction__ArgAssignment_4 ) ) ;
    public final void rule__PureFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2348:1: ( ( ( rule__PureFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2349:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2349:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2350:2: ( rule__PureFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2351:2: ( rule__PureFunction__ArgAssignment_4 )
            // InternalFPML.g:2351:3: rule__PureFunction__ArgAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__ArgAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getArgAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__4__Impl"


    // $ANTLR start "rule__PureFunction__Group__5"
    // InternalFPML.g:2359:1: rule__PureFunction__Group__5 : rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 ;
    public final void rule__PureFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2363:1: ( rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 )
            // InternalFPML.g:2364:2: rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PureFunction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__5"


    // $ANTLR start "rule__PureFunction__Group__5__Impl"
    // InternalFPML.g:2371:1: rule__PureFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__PureFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2375:1: ( ( ')' ) )
            // InternalFPML.g:2376:1: ( ')' )
            {
            // InternalFPML.g:2376:1: ( ')' )
            // InternalFPML.g:2377:2: ')'
            {
             before(grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__5__Impl"


    // $ANTLR start "rule__PureFunction__Group__6"
    // InternalFPML.g:2386:1: rule__PureFunction__Group__6 : rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 ;
    public final void rule__PureFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2390:1: ( rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 )
            // InternalFPML.g:2391:2: rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__PureFunction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__6"


    // $ANTLR start "rule__PureFunction__Group__6__Impl"
    // InternalFPML.g:2398:1: rule__PureFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__PureFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2402:1: ( ( ':' ) )
            // InternalFPML.g:2403:1: ( ':' )
            {
            // InternalFPML.g:2403:1: ( ':' )
            // InternalFPML.g:2404:2: ':'
            {
             before(grammarAccess.getPureFunctionAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__6__Impl"


    // $ANTLR start "rule__PureFunction__Group__7"
    // InternalFPML.g:2413:1: rule__PureFunction__Group__7 : rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 ;
    public final void rule__PureFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2417:1: ( rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 )
            // InternalFPML.g:2418:2: rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__PureFunction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__7"


    // $ANTLR start "rule__PureFunction__Group__7__Impl"
    // InternalFPML.g:2425:1: rule__PureFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__PureFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2429:1: ( ( '{' ) )
            // InternalFPML.g:2430:1: ( '{' )
            {
            // InternalFPML.g:2430:1: ( '{' )
            // InternalFPML.g:2431:2: '{'
            {
             before(grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__7__Impl"


    // $ANTLR start "rule__PureFunction__Group__8"
    // InternalFPML.g:2440:1: rule__PureFunction__Group__8 : rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 ;
    public final void rule__PureFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2444:1: ( rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 )
            // InternalFPML.g:2445:2: rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__PureFunction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__8"


    // $ANTLR start "rule__PureFunction__Group__8__Impl"
    // InternalFPML.g:2452:1: rule__PureFunction__Group__8__Impl : ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__PureFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2456:1: ( ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2457:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2457:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2458:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getPureFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2459:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2459:3: rule__PureFunction__FunctionBodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__FunctionBodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getFunctionBodyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__8__Impl"


    // $ANTLR start "rule__PureFunction__Group__9"
    // InternalFPML.g:2467:1: rule__PureFunction__Group__9 : rule__PureFunction__Group__9__Impl ;
    public final void rule__PureFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2471:1: ( rule__PureFunction__Group__9__Impl )
            // InternalFPML.g:2472:2: rule__PureFunction__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__9"


    // $ANTLR start "rule__PureFunction__Group__9__Impl"
    // InternalFPML.g:2478:1: rule__PureFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__PureFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2482:1: ( ( '}' ) )
            // InternalFPML.g:2483:1: ( '}' )
            {
            // InternalFPML.g:2483:1: ( '}' )
            // InternalFPML.g:2484:2: '}'
            {
             before(grammarAccess.getPureFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__Group__9__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__0"
    // InternalFPML.g:2494:1: rule__EffectFullFunction__Group__0 : rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 ;
    public final void rule__EffectFullFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2498:1: ( rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 )
            // InternalFPML.g:2499:2: rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EffectFullFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__0"


    // $ANTLR start "rule__EffectFullFunction__Group__0__Impl"
    // InternalFPML.g:2506:1: rule__EffectFullFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2510:1: ( ( 'def' ) )
            // InternalFPML.g:2511:1: ( 'def' )
            {
            // InternalFPML.g:2511:1: ( 'def' )
            // InternalFPML.g:2512:2: 'def'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getDefKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__0__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__1"
    // InternalFPML.g:2521:1: rule__EffectFullFunction__Group__1 : rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 ;
    public final void rule__EffectFullFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2525:1: ( rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 )
            // InternalFPML.g:2526:2: rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__1"


    // $ANTLR start "rule__EffectFullFunction__Group__1__Impl"
    // InternalFPML.g:2533:1: rule__EffectFullFunction__Group__1__Impl : ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2537:1: ( ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2538:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2538:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2539:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2540:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2540:3: rule__EffectFullFunction__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__1__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__2"
    // InternalFPML.g:2548:1: rule__EffectFullFunction__Group__2 : rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 ;
    public final void rule__EffectFullFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2552:1: ( rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 )
            // InternalFPML.g:2553:2: rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__EffectFullFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__2"


    // $ANTLR start "rule__EffectFullFunction__Group__2__Impl"
    // InternalFPML.g:2560:1: rule__EffectFullFunction__Group__2__Impl : ( ( rule__EffectFullFunction__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2564:1: ( ( ( rule__EffectFullFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2565:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2565:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            // InternalFPML.g:2566:2: ( rule__EffectFullFunction__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2567:2: ( rule__EffectFullFunction__NameAssignment_2 )
            // InternalFPML.g:2567:3: rule__EffectFullFunction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__2__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__3"
    // InternalFPML.g:2575:1: rule__EffectFullFunction__Group__3 : rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 ;
    public final void rule__EffectFullFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2579:1: ( rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 )
            // InternalFPML.g:2580:2: rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__3"


    // $ANTLR start "rule__EffectFullFunction__Group__3__Impl"
    // InternalFPML.g:2587:1: rule__EffectFullFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2591:1: ( ( '(' ) )
            // InternalFPML.g:2592:1: ( '(' )
            {
            // InternalFPML.g:2592:1: ( '(' )
            // InternalFPML.g:2593:2: '('
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__3__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__4"
    // InternalFPML.g:2602:1: rule__EffectFullFunction__Group__4 : rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 ;
    public final void rule__EffectFullFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2606:1: ( rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 )
            // InternalFPML.g:2607:2: rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__EffectFullFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__4"


    // $ANTLR start "rule__EffectFullFunction__Group__4__Impl"
    // InternalFPML.g:2614:1: rule__EffectFullFunction__Group__4__Impl : ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2618:1: ( ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2619:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2619:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2620:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2621:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            // InternalFPML.g:2621:3: rule__EffectFullFunction__ArgAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__ArgAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getArgAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__4__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__5"
    // InternalFPML.g:2629:1: rule__EffectFullFunction__Group__5 : rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 ;
    public final void rule__EffectFullFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2633:1: ( rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 )
            // InternalFPML.g:2634:2: rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullFunction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__5"


    // $ANTLR start "rule__EffectFullFunction__Group__5__Impl"
    // InternalFPML.g:2641:1: rule__EffectFullFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__EffectFullFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2645:1: ( ( ')' ) )
            // InternalFPML.g:2646:1: ( ')' )
            {
            // InternalFPML.g:2646:1: ( ')' )
            // InternalFPML.g:2647:2: ')'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__5__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__6"
    // InternalFPML.g:2656:1: rule__EffectFullFunction__Group__6 : rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 ;
    public final void rule__EffectFullFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2660:1: ( rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 )
            // InternalFPML.g:2661:2: rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullFunction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__6"


    // $ANTLR start "rule__EffectFullFunction__Group__6__Impl"
    // InternalFPML.g:2668:1: rule__EffectFullFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__EffectFullFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2672:1: ( ( ':' ) )
            // InternalFPML.g:2673:1: ( ':' )
            {
            // InternalFPML.g:2673:1: ( ':' )
            // InternalFPML.g:2674:2: ':'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__6__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__7"
    // InternalFPML.g:2683:1: rule__EffectFullFunction__Group__7 : rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 ;
    public final void rule__EffectFullFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2687:1: ( rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 )
            // InternalFPML.g:2688:2: rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__EffectFullFunction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__7"


    // $ANTLR start "rule__EffectFullFunction__Group__7__Impl"
    // InternalFPML.g:2695:1: rule__EffectFullFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__EffectFullFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2699:1: ( ( '{' ) )
            // InternalFPML.g:2700:1: ( '{' )
            {
            // InternalFPML.g:2700:1: ( '{' )
            // InternalFPML.g:2701:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__7__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__8"
    // InternalFPML.g:2710:1: rule__EffectFullFunction__Group__8 : rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 ;
    public final void rule__EffectFullFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2714:1: ( rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 )
            // InternalFPML.g:2715:2: rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullFunction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__8"


    // $ANTLR start "rule__EffectFullFunction__Group__8__Impl"
    // InternalFPML.g:2722:1: rule__EffectFullFunction__Group__8__Impl : ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__EffectFullFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2726:1: ( ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2727:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2727:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2728:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2729:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2729:3: rule__EffectFullFunction__FunctionBodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__FunctionBodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__8__Impl"


    // $ANTLR start "rule__EffectFullFunction__Group__9"
    // InternalFPML.g:2737:1: rule__EffectFullFunction__Group__9 : rule__EffectFullFunction__Group__9__Impl ;
    public final void rule__EffectFullFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2741:1: ( rule__EffectFullFunction__Group__9__Impl )
            // InternalFPML.g:2742:2: rule__EffectFullFunction__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__9"


    // $ANTLR start "rule__EffectFullFunction__Group__9__Impl"
    // InternalFPML.g:2748:1: rule__EffectFullFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__EffectFullFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2752:1: ( ( '}' ) )
            // InternalFPML.g:2753:1: ( '}' )
            {
            // InternalFPML.g:2753:1: ( '}' )
            // InternalFPML.g:2754:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__Group__9__Impl"


    // $ANTLR start "rule__MainFunc__Group__0"
    // InternalFPML.g:2764:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2768:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:2769:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:2776:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2780:1: ( ( 'IO' ) )
            // InternalFPML.g:2781:1: ( 'IO' )
            {
            // InternalFPML.g:2781:1: ( 'IO' )
            // InternalFPML.g:2782:2: 'IO'
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
    // InternalFPML.g:2791:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2795:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:2796:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:2803:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2807:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2808:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2808:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2809:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2810:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:2810:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:2818:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2822:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:2823:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:2830:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2834:1: ( ( 'main' ) )
            // InternalFPML.g:2835:1: ( 'main' )
            {
            // InternalFPML.g:2835:1: ( 'main' )
            // InternalFPML.g:2836:2: 'main'
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
    // InternalFPML.g:2845:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2849:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:2850:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:2857:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2861:1: ( ( ':' ) )
            // InternalFPML.g:2862:1: ( ':' )
            {
            // InternalFPML.g:2862:1: ( ':' )
            // InternalFPML.g:2863:2: ':'
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
    // InternalFPML.g:2872:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2876:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:2877:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:2884:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2888:1: ( ( '{' ) )
            // InternalFPML.g:2889:1: ( '{' )
            {
            // InternalFPML.g:2889:1: ( '{' )
            // InternalFPML.g:2890:2: '{'
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
    // InternalFPML.g:2899:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2903:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:2904:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:2911:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2915:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:2916:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:2916:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:2917:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:2918:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:2918:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:2926:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2930:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:2931:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:2937:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2941:1: ( ( '}' ) )
            // InternalFPML.g:2942:1: ( '}' )
            {
            // InternalFPML.g:2942:1: ( '}' )
            // InternalFPML.g:2943:2: '}'
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
    // InternalFPML.g:2953:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2957:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:2958:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
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
    // InternalFPML.g:2965:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2969:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:2970:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:2970:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:2971:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:2972:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:2972:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:2980:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2984:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:2985:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:2991:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 )? ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2995:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 )? ) )
            // InternalFPML.g:2996:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            {
            // InternalFPML.g:2996:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            // InternalFPML.g:2997:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:2998:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:2998:3: rule__EffectFullArgument__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullArgument__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // InternalFPML.g:3007:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3011:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:3012:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalFPML.g:3019:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3023:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3024:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3024:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:3025:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3026:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:3026:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:3034:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3038:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:3039:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:3045:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3049:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:3050:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3050:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:3051:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3052:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:3052:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:3061:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3065:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:3066:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:3073:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3077:1: ( ( () ) )
            // InternalFPML.g:3078:1: ( () )
            {
            // InternalFPML.g:3078:1: ( () )
            // InternalFPML.g:3079:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:3080:2: ()
            // InternalFPML.g:3080:3: 
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
    // InternalFPML.g:3088:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3092:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:3093:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:3099:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3103:1: ( ( 'Undefined' ) )
            // InternalFPML.g:3104:1: ( 'Undefined' )
            {
            // InternalFPML.g:3104:1: ( 'Undefined' )
            // InternalFPML.g:3105:2: 'Undefined'
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


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group__0"
    // InternalFPML.g:3115:1: rule__CompositionFunctionBodyPure__Group__0 : rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 ;
    public final void rule__CompositionFunctionBodyPure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3119:1: ( rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 )
            // InternalFPML.g:3120:2: rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CompositionFunctionBodyPure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group__0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group__0__Impl"
    // InternalFPML.g:3127:1: rule__CompositionFunctionBodyPure__Group__0__Impl : ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3131:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) )
            // InternalFPML.g:3132:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            {
            // InternalFPML.g:3132:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            // InternalFPML.g:3133:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
            // InternalFPML.g:3134:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            // InternalFPML.g:3134:3: rule__CompositionFunctionBodyPure__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group__1"
    // InternalFPML.g:3142:1: rule__CompositionFunctionBodyPure__Group__1 : rule__CompositionFunctionBodyPure__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3146:1: ( rule__CompositionFunctionBodyPure__Group__1__Impl )
            // InternalFPML.g:3147:2: rule__CompositionFunctionBodyPure__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group__1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group__1__Impl"
    // InternalFPML.g:3153:1: rule__CompositionFunctionBodyPure__Group__1__Impl : ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyPure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3157:1: ( ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) )
            // InternalFPML.g:3158:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            {
            // InternalFPML.g:3158:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            // InternalFPML.g:3159:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
            // InternalFPML.g:3160:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFPML.g:3160:3: rule__CompositionFunctionBodyPure__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__CompositionFunctionBodyPure__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__0"
    // InternalFPML.g:3169:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3173:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:3174:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:3181:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3185:1: ( ( ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 ) ) )
            // InternalFPML.g:3186:1: ( ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 ) )
            {
            // InternalFPML.g:3186:1: ( ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 ) )
            // InternalFPML.g:3187:2: ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementAssignment_0_0()); 
            // InternalFPML.g:3188:2: ( rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 )
            // InternalFPML.g:3188:3: rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementAssignment_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:3196:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3200:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 )
            // InternalFPML.g:3201:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3208:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3212:1: ( ( '|>' ) )
            // InternalFPML.g:3213:1: ( '|>' )
            {
            // InternalFPML.g:3213:1: ( '|>' )
            // InternalFPML.g:3214:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_0_1()); 

            }


            }

        }
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
    // InternalFPML.g:3223:1: rule__CompositionFunctionBodyPure__Group_0__2 : rule__CompositionFunctionBodyPure__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3227:1: ( rule__CompositionFunctionBodyPure__Group_0__2__Impl )
            // InternalFPML.g:3228:2: rule__CompositionFunctionBodyPure__Group_0__2__Impl
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
    // InternalFPML.g:3234:1: rule__CompositionFunctionBodyPure__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3238:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3239:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3239:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3240:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3241:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3241:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_2()); 

            }


            }

        }
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
    // InternalFPML.g:3250:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3254:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:3255:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3262:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3266:1: ( ( '|>' ) )
            // InternalFPML.g:3267:1: ( '|>' )
            {
            // InternalFPML.g:3267:1: ( '|>' )
            // InternalFPML.g:3268:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 

            }


            }

        }
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
    // InternalFPML.g:3277:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3281:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:3282:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
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
    // InternalFPML.g:3288:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3292:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3293:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3293:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3294:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3295:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3295:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group__0"
    // InternalFPML.g:3304:1: rule__CompositionFunctionBodyEffect__Group__0 : rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3308:1: ( rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 )
            // InternalFPML.g:3309:2: rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CompositionFunctionBodyEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group__0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group__0__Impl"
    // InternalFPML.g:3316:1: rule__CompositionFunctionBodyEffect__Group__0__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3320:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) )
            // InternalFPML.g:3321:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            {
            // InternalFPML.g:3321:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            // InternalFPML.g:3322:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
            // InternalFPML.g:3323:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            // InternalFPML.g:3323:3: rule__CompositionFunctionBodyEffect__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group__1"
    // InternalFPML.g:3331:1: rule__CompositionFunctionBodyEffect__Group__1 : rule__CompositionFunctionBodyEffect__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3335:1: ( rule__CompositionFunctionBodyEffect__Group__1__Impl )
            // InternalFPML.g:3336:2: rule__CompositionFunctionBodyEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group__1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group__1__Impl"
    // InternalFPML.g:3342:1: rule__CompositionFunctionBodyEffect__Group__1__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3346:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) )
            // InternalFPML.g:3347:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            {
            // InternalFPML.g:3347:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            // InternalFPML.g:3348:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
            // InternalFPML.g:3349:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFPML.g:3349:3: rule__CompositionFunctionBodyEffect__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CompositionFunctionBodyEffect__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__0"
    // InternalFPML.g:3358:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3362:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:3363:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFPML.g:3370:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3374:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) )
            // InternalFPML.g:3375:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            {
            // InternalFPML.g:3375:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            // InternalFPML.g:3376:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_0()); 
            // InternalFPML.g:3377:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            // InternalFPML.g:3377:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:3385:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3389:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 )
            // InternalFPML.g:3390:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3397:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3401:1: ( ( '>>=' ) )
            // InternalFPML.g:3402:1: ( '>>=' )
            {
            // InternalFPML.g:3402:1: ( '>>=' )
            // InternalFPML.g:3403:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_1()); 

            }


            }

        }
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
    // InternalFPML.g:3412:1: rule__CompositionFunctionBodyEffect__Group_0__2 : rule__CompositionFunctionBodyEffect__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3416:1: ( rule__CompositionFunctionBodyEffect__Group_0__2__Impl )
            // InternalFPML.g:3417:2: rule__CompositionFunctionBodyEffect__Group_0__2__Impl
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
    // InternalFPML.g:3423:1: rule__CompositionFunctionBodyEffect__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3427:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3428:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3428:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3429:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3430:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3430:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_2()); 

            }


            }

        }
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
    // InternalFPML.g:3439:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3443:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:3444:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3451:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3455:1: ( ( '>>=' ) )
            // InternalFPML.g:3456:1: ( '>>=' )
            {
            // InternalFPML.g:3456:1: ( '>>=' )
            // InternalFPML.g:3457:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 

            }


            }

        }
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
    // InternalFPML.g:3466:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3470:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:3471:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
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
    // InternalFPML.g:3477:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3481:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3482:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3482:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3483:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3484:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3484:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__IOType__Group__0"
    // InternalFPML.g:3493:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3497:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:3498:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
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
    // InternalFPML.g:3505:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3509:1: ( ( 'IO' ) )
            // InternalFPML.g:3510:1: ( 'IO' )
            {
            // InternalFPML.g:3510:1: ( 'IO' )
            // InternalFPML.g:3511:2: 'IO'
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
    // InternalFPML.g:3520:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3524:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:3525:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:3531:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3535:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3536:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3536:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:3537:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3538:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:3538:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:3547:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3551:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:3552:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFPML.g:3559:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3563:1: ( ( () ) )
            // InternalFPML.g:3564:1: ( () )
            {
            // InternalFPML.g:3564:1: ( () )
            // InternalFPML.g:3565:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:3566:2: ()
            // InternalFPML.g:3566:3: 
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
    // InternalFPML.g:3574:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3578:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:3579:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:3585:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3589:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3590:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3590:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:3591:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3592:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:3592:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:3601:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3605:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:3606:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFPML.g:3613:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3617:1: ( ( () ) )
            // InternalFPML.g:3618:1: ( () )
            {
            // InternalFPML.g:3618:1: ( () )
            // InternalFPML.g:3619:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:3620:2: ()
            // InternalFPML.g:3620:3: 
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
    // InternalFPML.g:3628:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3632:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:3633:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:3639:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3643:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3644:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3644:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:3645:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3646:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:3646:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:3655:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3659:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:3660:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:3667:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3671:1: ( ( () ) )
            // InternalFPML.g:3672:1: ( () )
            {
            // InternalFPML.g:3672:1: ( () )
            // InternalFPML.g:3673:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:3674:2: ()
            // InternalFPML.g:3674:3: 
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
    // InternalFPML.g:3682:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3686:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:3687:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:3693:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3697:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3698:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3698:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:3699:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3700:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:3700:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:3709:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3713:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:3714:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFPML.g:3721:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3725:1: ( ( () ) )
            // InternalFPML.g:3726:1: ( () )
            {
            // InternalFPML.g:3726:1: ( () )
            // InternalFPML.g:3727:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:3728:2: ()
            // InternalFPML.g:3728:3: 
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
    // InternalFPML.g:3736:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3740:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:3741:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
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
    // InternalFPML.g:3748:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3752:1: ( ( 'ref' ) )
            // InternalFPML.g:3753:1: ( 'ref' )
            {
            // InternalFPML.g:3753:1: ( 'ref' )
            // InternalFPML.g:3754:2: 'ref'
            {
             before(grammarAccess.getDataTypeAccess().getRefKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFPML.g:3763:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3767:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:3768:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:3774:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3778:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:3779:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:3779:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:3780:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:3781:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:3781:3: rule__DataType__TypeAssignment_2
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


    // $ANTLR start "rule__IntValue__Group__0"
    // InternalFPML.g:3790:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3794:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:3795:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:3802:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3806:1: ( ( () ) )
            // InternalFPML.g:3807:1: ( () )
            {
            // InternalFPML.g:3807:1: ( () )
            // InternalFPML.g:3808:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:3809:2: ()
            // InternalFPML.g:3809:3: 
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
    // InternalFPML.g:3817:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3821:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:3822:2: rule__IntValue__Group__1__Impl
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
    // InternalFPML.g:3828:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3832:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:3833:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:3833:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:3834:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:3835:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:3835:3: rule__IntValue__ValueAssignment_1
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
    // InternalFPML.g:3844:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3848:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:3849:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFPML.g:3856:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3860:1: ( ( () ) )
            // InternalFPML.g:3861:1: ( () )
            {
            // InternalFPML.g:3861:1: ( () )
            // InternalFPML.g:3862:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:3863:2: ()
            // InternalFPML.g:3863:3: 
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
    // InternalFPML.g:3871:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3875:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:3876:2: rule__StringValue__Group__1__Impl
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
    // InternalFPML.g:3882:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3886:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:3887:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:3887:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:3888:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:3889:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:3889:3: rule__StringValue__ValueAssignment_1
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
    // InternalFPML.g:3898:1: rule__UnitValue__Group__0 : rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 ;
    public final void rule__UnitValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3902:1: ( rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 )
            // InternalFPML.g:3903:2: rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFPML.g:3910:1: rule__UnitValue__Group__0__Impl : ( () ) ;
    public final void rule__UnitValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3914:1: ( ( () ) )
            // InternalFPML.g:3915:1: ( () )
            {
            // InternalFPML.g:3915:1: ( () )
            // InternalFPML.g:3916:2: ()
            {
             before(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:3917:2: ()
            // InternalFPML.g:3917:3: 
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
    // InternalFPML.g:3925:1: rule__UnitValue__Group__1 : rule__UnitValue__Group__1__Impl ;
    public final void rule__UnitValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3929:1: ( rule__UnitValue__Group__1__Impl )
            // InternalFPML.g:3930:2: rule__UnitValue__Group__1__Impl
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
    // InternalFPML.g:3936:1: rule__UnitValue__Group__1__Impl : ( '()' ) ;
    public final void rule__UnitValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3940:1: ( ( '()' ) )
            // InternalFPML.g:3941:1: ( '()' )
            {
            // InternalFPML.g:3941:1: ( '()' )
            // InternalFPML.g:3942:2: '()'
            {
             before(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFPML.g:3952:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3956:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:3957:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFPML.g:3964:1: rule__DataValue__Group__0__Impl : ( ( rule__DataValue__TypeAssignment_0 ) ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3968:1: ( ( ( rule__DataValue__TypeAssignment_0 ) ) )
            // InternalFPML.g:3969:1: ( ( rule__DataValue__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3969:1: ( ( rule__DataValue__TypeAssignment_0 ) )
            // InternalFPML.g:3970:2: ( rule__DataValue__TypeAssignment_0 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3971:2: ( rule__DataValue__TypeAssignment_0 )
            // InternalFPML.g:3971:3: rule__DataValue__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__0__Impl"


    // $ANTLR start "rule__DataValue__Group__1"
    // InternalFPML.g:3979:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3983:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:3984:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalFPML.g:3991:1: rule__DataValue__Group__1__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3995:1: ( ( '(' ) )
            // InternalFPML.g:3996:1: ( '(' )
            {
            // InternalFPML.g:3996:1: ( '(' )
            // InternalFPML.g:3997:2: '('
            {
             before(grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalFPML.g:4006:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4010:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:4011:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:4018:1: rule__DataValue__Group__2__Impl : ( ( rule__DataValue__ValueAssignment_2 ) ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4022:1: ( ( ( rule__DataValue__ValueAssignment_2 ) ) )
            // InternalFPML.g:4023:1: ( ( rule__DataValue__ValueAssignment_2 ) )
            {
            // InternalFPML.g:4023:1: ( ( rule__DataValue__ValueAssignment_2 ) )
            // InternalFPML.g:4024:2: ( rule__DataValue__ValueAssignment_2 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_2()); 
            // InternalFPML.g:4025:2: ( rule__DataValue__ValueAssignment_2 )
            // InternalFPML.g:4025:3: rule__DataValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // InternalFPML.g:4033:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4037:1: ( rule__DataValue__Group__3__Impl )
            // InternalFPML.g:4038:2: rule__DataValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:4044:1: rule__DataValue__Group__3__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4048:1: ( ( ')' ) )
            // InternalFPML.g:4049:1: ( ')' )
            {
            // InternalFPML.g:4049:1: ( ')' )
            // InternalFPML.g:4050:2: ')'
            {
             before(grammarAccess.getDataValueAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AdtValue__Group_3__0"
    // InternalFPML.g:4060:1: rule__AdtValue__Group_3__0 : rule__AdtValue__Group_3__0__Impl rule__AdtValue__Group_3__1 ;
    public final void rule__AdtValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4064:1: ( rule__AdtValue__Group_3__0__Impl rule__AdtValue__Group_3__1 )
            // InternalFPML.g:4065:2: rule__AdtValue__Group_3__0__Impl rule__AdtValue__Group_3__1
            {
            pushFollow(FOLLOW_37);
            rule__AdtValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__0"


    // $ANTLR start "rule__AdtValue__Group_3__0__Impl"
    // InternalFPML.g:4072:1: rule__AdtValue__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AdtValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4076:1: ( ( '(' ) )
            // InternalFPML.g:4077:1: ( '(' )
            {
            // InternalFPML.g:4077:1: ( '(' )
            // InternalFPML.g:4078:2: '('
            {
             before(grammarAccess.getAdtValueAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAdtValueAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__0__Impl"


    // $ANTLR start "rule__AdtValue__Group_3__1"
    // InternalFPML.g:4087:1: rule__AdtValue__Group_3__1 : rule__AdtValue__Group_3__1__Impl rule__AdtValue__Group_3__2 ;
    public final void rule__AdtValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4091:1: ( rule__AdtValue__Group_3__1__Impl rule__AdtValue__Group_3__2 )
            // InternalFPML.g:4092:2: rule__AdtValue__Group_3__1__Impl rule__AdtValue__Group_3__2
            {
            pushFollow(FOLLOW_38);
            rule__AdtValue__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtValue__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__1"


    // $ANTLR start "rule__AdtValue__Group_3__1__Impl"
    // InternalFPML.g:4099:1: rule__AdtValue__Group_3__1__Impl : ( ( rule__AdtValue__AdtElementsAssignment_3_1 ) ) ;
    public final void rule__AdtValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4103:1: ( ( ( rule__AdtValue__AdtElementsAssignment_3_1 ) ) )
            // InternalFPML.g:4104:1: ( ( rule__AdtValue__AdtElementsAssignment_3_1 ) )
            {
            // InternalFPML.g:4104:1: ( ( rule__AdtValue__AdtElementsAssignment_3_1 ) )
            // InternalFPML.g:4105:2: ( rule__AdtValue__AdtElementsAssignment_3_1 )
            {
             before(grammarAccess.getAdtValueAccess().getAdtElementsAssignment_3_1()); 
            // InternalFPML.g:4106:2: ( rule__AdtValue__AdtElementsAssignment_3_1 )
            // InternalFPML.g:4106:3: rule__AdtValue__AdtElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AdtValue__AdtElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAdtValueAccess().getAdtElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__1__Impl"


    // $ANTLR start "rule__AdtValue__Group_3__2"
    // InternalFPML.g:4114:1: rule__AdtValue__Group_3__2 : rule__AdtValue__Group_3__2__Impl rule__AdtValue__Group_3__3 ;
    public final void rule__AdtValue__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4118:1: ( rule__AdtValue__Group_3__2__Impl rule__AdtValue__Group_3__3 )
            // InternalFPML.g:4119:2: rule__AdtValue__Group_3__2__Impl rule__AdtValue__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__AdtValue__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtValue__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__2"


    // $ANTLR start "rule__AdtValue__Group_3__2__Impl"
    // InternalFPML.g:4126:1: rule__AdtValue__Group_3__2__Impl : ( ( rule__AdtValue__AdtElementsAssignment_3_2 ) ) ;
    public final void rule__AdtValue__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4130:1: ( ( ( rule__AdtValue__AdtElementsAssignment_3_2 ) ) )
            // InternalFPML.g:4131:1: ( ( rule__AdtValue__AdtElementsAssignment_3_2 ) )
            {
            // InternalFPML.g:4131:1: ( ( rule__AdtValue__AdtElementsAssignment_3_2 ) )
            // InternalFPML.g:4132:2: ( rule__AdtValue__AdtElementsAssignment_3_2 )
            {
             before(grammarAccess.getAdtValueAccess().getAdtElementsAssignment_3_2()); 
            // InternalFPML.g:4133:2: ( rule__AdtValue__AdtElementsAssignment_3_2 )
            // InternalFPML.g:4133:3: rule__AdtValue__AdtElementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AdtValue__AdtElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAdtValueAccess().getAdtElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__2__Impl"


    // $ANTLR start "rule__AdtValue__Group_3__3"
    // InternalFPML.g:4141:1: rule__AdtValue__Group_3__3 : rule__AdtValue__Group_3__3__Impl ;
    public final void rule__AdtValue__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4145:1: ( rule__AdtValue__Group_3__3__Impl )
            // InternalFPML.g:4146:2: rule__AdtValue__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdtValue__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__3"


    // $ANTLR start "rule__AdtValue__Group_3__3__Impl"
    // InternalFPML.g:4152:1: rule__AdtValue__Group_3__3__Impl : ( ')' ) ;
    public final void rule__AdtValue__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4156:1: ( ( ')' ) )
            // InternalFPML.g:4157:1: ( ')' )
            {
            // InternalFPML.g:4157:1: ( ')' )
            // InternalFPML.g:4158:2: ')'
            {
             before(grammarAccess.getAdtValueAccess().getRightParenthesisKeyword_3_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdtValueAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Group_3__3__Impl"


    // $ANTLR start "rule__ProdTypeValue__Group__0"
    // InternalFPML.g:4168:1: rule__ProdTypeValue__Group__0 : rule__ProdTypeValue__Group__0__Impl rule__ProdTypeValue__Group__1 ;
    public final void rule__ProdTypeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4172:1: ( rule__ProdTypeValue__Group__0__Impl rule__ProdTypeValue__Group__1 )
            // InternalFPML.g:4173:2: rule__ProdTypeValue__Group__0__Impl rule__ProdTypeValue__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ProdTypeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdTypeValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdTypeValue__Group__0"


    // $ANTLR start "rule__ProdTypeValue__Group__0__Impl"
    // InternalFPML.g:4180:1: rule__ProdTypeValue__Group__0__Impl : ( '*' ) ;
    public final void rule__ProdTypeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4184:1: ( ( '*' ) )
            // InternalFPML.g:4185:1: ( '*' )
            {
            // InternalFPML.g:4185:1: ( '*' )
            // InternalFPML.g:4186:2: '*'
            {
             before(grammarAccess.getProdTypeValueAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProdTypeValueAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdTypeValue__Group__0__Impl"


    // $ANTLR start "rule__ProdTypeValue__Group__1"
    // InternalFPML.g:4195:1: rule__ProdTypeValue__Group__1 : rule__ProdTypeValue__Group__1__Impl ;
    public final void rule__ProdTypeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4199:1: ( rule__ProdTypeValue__Group__1__Impl )
            // InternalFPML.g:4200:2: rule__ProdTypeValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProdTypeValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdTypeValue__Group__1"


    // $ANTLR start "rule__ProdTypeValue__Group__1__Impl"
    // InternalFPML.g:4206:1: rule__ProdTypeValue__Group__1__Impl : ( ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 ) ) ;
    public final void rule__ProdTypeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4210:1: ( ( ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 ) ) )
            // InternalFPML.g:4211:1: ( ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 ) )
            {
            // InternalFPML.g:4211:1: ( ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 ) )
            // InternalFPML.g:4212:2: ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 )
            {
             before(grammarAccess.getProdTypeValueAccess().getProdAdtElementsAssignment_1()); 
            // InternalFPML.g:4213:2: ( rule__ProdTypeValue__ProdAdtElementsAssignment_1 )
            // InternalFPML.g:4213:3: rule__ProdTypeValue__ProdAdtElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProdTypeValue__ProdAdtElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeValueAccess().getProdAdtElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdTypeValue__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalFPML.g:4222:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4226:1: ( ( rulePureBlock ) )
            // InternalFPML.g:4227:2: ( rulePureBlock )
            {
            // InternalFPML.g:4227:2: ( rulePureBlock )
            // InternalFPML.g:4228:3: rulePureBlock
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
    // InternalFPML.g:4237:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4241:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:4242:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:4242:2: ( ruleEffectFullBlock )
            // InternalFPML.g:4243:3: ruleEffectFullBlock
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
    // InternalFPML.g:4252:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4256:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:4257:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:4257:2: ( rulePureFunctionBlock )
            // InternalFPML.g:4258:3: rulePureFunctionBlock
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
    // InternalFPML.g:4267:1: rule__PureBlock__ElementsAssignment_3 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4271:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:4272:2: ( ruleDataBlock )
            {
            // InternalFPML.g:4272:2: ( ruleDataBlock )
            // InternalFPML.g:4273:3: ruleDataBlock
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
    // InternalFPML.g:4282:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunction ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4286:1: ( ( rulePureFunction ) )
            // InternalFPML.g:4287:2: ( rulePureFunction )
            {
            // InternalFPML.g:4287:2: ( rulePureFunction )
            // InternalFPML.g:4288:3: rulePureFunction
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunction();

            state._fsp--;

             after(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalFPML.g:4297:1: rule__DataBlock__ElementsAssignment_2 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4301:1: ( ( ruleData ) )
            // InternalFPML.g:4302:2: ( ruleData )
            {
            // InternalFPML.g:4302:2: ( ruleData )
            // InternalFPML.g:4303:3: ruleData
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
    // InternalFPML.g:4312:1: rule__DataBlock__ValueAssignment_3 : ( ruleValueBlock ) ;
    public final void rule__DataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4316:1: ( ( ruleValueBlock ) )
            // InternalFPML.g:4317:2: ( ruleValueBlock )
            {
            // InternalFPML.g:4317:2: ( ruleValueBlock )
            // InternalFPML.g:4318:3: ruleValueBlock
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
    // InternalFPML.g:4327:1: rule__ValueBlock__ElementsAssignment_2 : ( ruleValue ) ;
    public final void rule__ValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4331:1: ( ( ruleValue ) )
            // InternalFPML.g:4332:2: ( ruleValue )
            {
            // InternalFPML.g:4332:2: ( ruleValue )
            // InternalFPML.g:4333:3: ruleValue
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
    // InternalFPML.g:4342:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunction ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4346:1: ( ( ruleEffectFullFunction ) )
            // InternalFPML.g:4347:2: ( ruleEffectFullFunction )
            {
            // InternalFPML.g:4347:2: ( ruleEffectFullFunction )
            // InternalFPML.g:4348:3: ruleEffectFullFunction
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalFPML.g:4357:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4361:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:4362:2: ( ruleMainFunc )
            {
            // InternalFPML.g:4362:2: ( ruleMainFunc )
            // InternalFPML.g:4363:3: ruleMainFunc
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
    // InternalFPML.g:4372:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4376:1: ( ( RULE_ID ) )
            // InternalFPML.g:4377:2: ( RULE_ID )
            {
            // InternalFPML.g:4377:2: ( RULE_ID )
            // InternalFPML.g:4378:3: RULE_ID
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
    // InternalFPML.g:4387:1: rule__Data__ContentAssignment_2 : ( ruleAdtType ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4391:1: ( ( ruleAdtType ) )
            // InternalFPML.g:4392:2: ( ruleAdtType )
            {
            // InternalFPML.g:4392:2: ( ruleAdtType )
            // InternalFPML.g:4393:3: ruleAdtType
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
    // InternalFPML.g:4402:1: rule__Value__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Value__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4406:1: ( ( RULE_ID ) )
            // InternalFPML.g:4407:2: ( RULE_ID )
            {
            // InternalFPML.g:4407:2: ( RULE_ID )
            // InternalFPML.g:4408:3: RULE_ID
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
    // InternalFPML.g:4417:1: rule__Value__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Value__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4421:1: ( ( ruleExpression ) )
            // InternalFPML.g:4422:2: ( ruleExpression )
            {
            // InternalFPML.g:4422:2: ( ruleExpression )
            // InternalFPML.g:4423:3: ruleExpression
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
    // InternalFPML.g:4432:1: rule__AdtType__AdtElement1Assignment_1_1 : ( ruleAdtType ) ;
    public final void rule__AdtType__AdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4436:1: ( ( ruleAdtType ) )
            // InternalFPML.g:4437:2: ( ruleAdtType )
            {
            // InternalFPML.g:4437:2: ( ruleAdtType )
            // InternalFPML.g:4438:3: ruleAdtType
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
    // InternalFPML.g:4447:1: rule__AdtType__AdtElement2Assignment_1_2 : ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__AdtType__AdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4451:1: ( ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:4452:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:4452:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:4453:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:4454:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:4454:4: rule__AdtType__AdtElement2Alternatives_1_2_0
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
    // InternalFPML.g:4462:1: rule__SumType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__SumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4466:1: ( ( ruleAdtType ) )
            // InternalFPML.g:4467:2: ( ruleAdtType )
            {
            // InternalFPML.g:4467:2: ( ruleAdtType )
            // InternalFPML.g:4468:3: ruleAdtType
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
    // InternalFPML.g:4477:1: rule__ProdType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__ProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4481:1: ( ( ruleAdtType ) )
            // InternalFPML.g:4482:2: ( ruleAdtType )
            {
            // InternalFPML.g:4482:2: ( ruleAdtType )
            // InternalFPML.g:4483:3: ruleAdtType
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


    // $ANTLR start "rule__PureFunction__ReturnTypeAssignment_1"
    // InternalFPML.g:4492:1: rule__PureFunction__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4496:1: ( ( ruleValueType ) )
            // InternalFPML.g:4497:2: ( ruleValueType )
            {
            // InternalFPML.g:4497:2: ( ruleValueType )
            // InternalFPML.g:4498:3: ruleValueType
            {
             before(grammarAccess.getPureFunctionAccess().getReturnTypeValueTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getPureFunctionAccess().getReturnTypeValueTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__ReturnTypeAssignment_1"


    // $ANTLR start "rule__PureFunction__NameAssignment_2"
    // InternalFPML.g:4507:1: rule__PureFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4511:1: ( ( RULE_ID ) )
            // InternalFPML.g:4512:2: ( RULE_ID )
            {
            // InternalFPML.g:4512:2: ( RULE_ID )
            // InternalFPML.g:4513:3: RULE_ID
            {
             before(grammarAccess.getPureFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureFunctionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__NameAssignment_2"


    // $ANTLR start "rule__PureFunction__ArgAssignment_4"
    // InternalFPML.g:4522:1: rule__PureFunction__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4526:1: ( ( ruleArgument ) )
            // InternalFPML.g:4527:2: ( ruleArgument )
            {
            // InternalFPML.g:4527:2: ( ruleArgument )
            // InternalFPML.g:4528:3: ruleArgument
            {
             before(grammarAccess.getPureFunctionAccess().getArgArgumentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getPureFunctionAccess().getArgArgumentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__ArgAssignment_4"


    // $ANTLR start "rule__PureFunction__FunctionBodyAssignment_8"
    // InternalFPML.g:4537:1: rule__PureFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4541:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:4542:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:4542:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:4543:3: ruleFunctionBodyPure
            {
             before(grammarAccess.getPureFunctionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getPureFunctionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunction__FunctionBodyAssignment_8"


    // $ANTLR start "rule__EffectFullFunction__ReturnTypeAssignment_1"
    // InternalFPML.g:4552:1: rule__EffectFullFunction__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4556:1: ( ( ruleIOType ) )
            // InternalFPML.g:4557:2: ( ruleIOType )
            {
            // InternalFPML.g:4557:2: ( ruleIOType )
            // InternalFPML.g:4558:3: ruleIOType
            {
             before(grammarAccess.getEffectFullFunctionAccess().getReturnTypeIOTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIOType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionAccess().getReturnTypeIOTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__ReturnTypeAssignment_1"


    // $ANTLR start "rule__EffectFullFunction__NameAssignment_2"
    // InternalFPML.g:4567:1: rule__EffectFullFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4571:1: ( ( RULE_ID ) )
            // InternalFPML.g:4572:2: ( RULE_ID )
            {
            // InternalFPML.g:4572:2: ( RULE_ID )
            // InternalFPML.g:4573:3: RULE_ID
            {
             before(grammarAccess.getEffectFullFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__NameAssignment_2"


    // $ANTLR start "rule__EffectFullFunction__ArgAssignment_4"
    // InternalFPML.g:4582:1: rule__EffectFullFunction__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4586:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:4587:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:4587:2: ( ruleEffectFullArgument )
            // InternalFPML.g:4588:3: ruleEffectFullArgument
            {
             before(grammarAccess.getEffectFullFunctionAccess().getArgEffectFullArgumentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionAccess().getArgEffectFullArgumentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__ArgAssignment_4"


    // $ANTLR start "rule__EffectFullFunction__FunctionBodyAssignment_8"
    // InternalFPML.g:4597:1: rule__EffectFullFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4601:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:4602:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:4602:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:4603:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunction__FunctionBodyAssignment_8"


    // $ANTLR start "rule__MainFunc__ReturnTypeAssignment_1"
    // InternalFPML.g:4612:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4616:1: ( ( ruleUnitType ) )
            // InternalFPML.g:4617:2: ( ruleUnitType )
            {
            // InternalFPML.g:4617:2: ( ruleUnitType )
            // InternalFPML.g:4618:3: ruleUnitType
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
    // InternalFPML.g:4627:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4631:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:4632:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:4632:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:4633:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:4642:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4646:1: ( ( ruleType ) )
            // InternalFPML.g:4647:2: ( ruleType )
            {
            // InternalFPML.g:4647:2: ( ruleType )
            // InternalFPML.g:4648:3: ruleType
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
    // InternalFPML.g:4657:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4661:1: ( ( RULE_ID ) )
            // InternalFPML.g:4662:2: ( RULE_ID )
            {
            // InternalFPML.g:4662:2: ( RULE_ID )
            // InternalFPML.g:4663:3: RULE_ID
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
    // InternalFPML.g:4672:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4676:1: ( ( ruleValueType ) )
            // InternalFPML.g:4677:2: ( ruleValueType )
            {
            // InternalFPML.g:4677:2: ( ruleValueType )
            // InternalFPML.g:4678:3: ruleValueType
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
    // InternalFPML.g:4687:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4691:1: ( ( RULE_ID ) )
            // InternalFPML.g:4692:2: ( RULE_ID )
            {
            // InternalFPML.g:4692:2: ( RULE_ID )
            // InternalFPML.g:4693:3: RULE_ID
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


    // $ANTLR start "rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0"
    // InternalFPML.g:4702:1: rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4706:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4707:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4707:2: ( ( RULE_ID ) )
            // InternalFPML.g:4708:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementInitialPureChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4709:3: ( RULE_ID )
            // InternalFPML.g:4710:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementInitialPureChainElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementInitialPureChainElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementInitialPureChainElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__InitialElementAssignment_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2"
    // InternalFPML.g:4721:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4725:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4726:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4726:2: ( ( RULE_ID ) )
            // InternalFPML.g:4727:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0()); 
            // InternalFPML.g:4728:3: ( RULE_ID )
            // InternalFPML.g:4729:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2"


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1"
    // InternalFPML.g:4740:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4744:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4745:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4745:2: ( ( RULE_ID ) )
            // InternalFPML.g:4746:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0()); 
            // InternalFPML.g:4747:3: ( RULE_ID )
            // InternalFPML.g:4748:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0"
    // InternalFPML.g:4759:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4763:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4764:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4764:2: ( ( RULE_ID ) )
            // InternalFPML.g:4765:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4766:3: ( RULE_ID )
            // InternalFPML.g:4767:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2"
    // InternalFPML.g:4778:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4782:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4783:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4783:2: ( ( RULE_ID ) )
            // InternalFPML.g:4784:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0()); 
            // InternalFPML.g:4785:3: ( RULE_ID )
            // InternalFPML.g:4786:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1"
    // InternalFPML.g:4797:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4801:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4802:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4802:2: ( ( RULE_ID ) )
            // InternalFPML.g:4803:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0()); 
            // InternalFPML.g:4804:3: ( RULE_ID )
            // InternalFPML.g:4805:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__IOType__TypeAssignment_1"
    // InternalFPML.g:4816:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4820:1: ( ( ruleType ) )
            // InternalFPML.g:4821:2: ( ruleType )
            {
            // InternalFPML.g:4821:2: ( ruleType )
            // InternalFPML.g:4822:3: ruleType
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
    // InternalFPML.g:4831:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4835:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:4836:2: ( ( 'int' ) )
            {
            // InternalFPML.g:4836:2: ( ( 'int' ) )
            // InternalFPML.g:4837:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:4838:3: ( 'int' )
            // InternalFPML.g:4839:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFPML.g:4850:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4854:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:4855:2: ( ( 'String' ) )
            {
            // InternalFPML.g:4855:2: ( ( 'String' ) )
            // InternalFPML.g:4856:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:4857:3: ( 'String' )
            // InternalFPML.g:4858:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalFPML.g:4869:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4873:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:4874:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:4874:2: ( ( 'Unit' ) )
            // InternalFPML.g:4875:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:4876:3: ( 'Unit' )
            // InternalFPML.g:4877:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFPML.g:4888:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4892:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4893:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4893:2: ( ( RULE_ID ) )
            // InternalFPML.g:4894:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:4895:3: ( RULE_ID )
            // InternalFPML.g:4896:4: RULE_ID
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


    // $ANTLR start "rule__IntValue__ValueAssignment_1"
    // InternalFPML.g:4907:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4911:1: ( ( RULE_INT ) )
            // InternalFPML.g:4912:2: ( RULE_INT )
            {
            // InternalFPML.g:4912:2: ( RULE_INT )
            // InternalFPML.g:4913:3: RULE_INT
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
    // InternalFPML.g:4922:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4926:1: ( ( RULE_STRING ) )
            // InternalFPML.g:4927:2: ( RULE_STRING )
            {
            // InternalFPML.g:4927:2: ( RULE_STRING )
            // InternalFPML.g:4928:3: RULE_STRING
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


    // $ANTLR start "rule__DataValue__TypeAssignment_0"
    // InternalFPML.g:4937:1: rule__DataValue__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4941:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4942:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4942:2: ( ( RULE_ID ) )
            // InternalFPML.g:4943:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypeDataCrossReference_0_0()); 
            // InternalFPML.g:4944:3: ( RULE_ID )
            // InternalFPML.g:4945:4: RULE_ID
            {
             before(grammarAccess.getDataValueAccess().getTypeDataIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getTypeDataIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDataValueAccess().getTypeDataCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__TypeAssignment_0"


    // $ANTLR start "rule__DataValue__ValueAssignment_2"
    // InternalFPML.g:4956:1: rule__DataValue__ValueAssignment_2 : ( ruleAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4960:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:4961:2: ( ruleAdtValue )
            {
            // InternalFPML.g:4961:2: ( ruleAdtValue )
            // InternalFPML.g:4962:3: ruleAdtValue
            {
             before(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__ValueAssignment_2"


    // $ANTLR start "rule__AdtValue__AdtElementsAssignment_3_1"
    // InternalFPML.g:4971:1: rule__AdtValue__AdtElementsAssignment_3_1 : ( ruleAdtValue ) ;
    public final void rule__AdtValue__AdtElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4975:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:4976:2: ( ruleAdtValue )
            {
            // InternalFPML.g:4976:2: ( ruleAdtValue )
            // InternalFPML.g:4977:3: ruleAdtValue
            {
             before(grammarAccess.getAdtValueAccess().getAdtElementsAdtValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getAdtValueAccess().getAdtElementsAdtValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__AdtElementsAssignment_3_1"


    // $ANTLR start "rule__AdtValue__AdtElementsAssignment_3_2"
    // InternalFPML.g:4986:1: rule__AdtValue__AdtElementsAssignment_3_2 : ( ruleProdTypeValue ) ;
    public final void rule__AdtValue__AdtElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4990:1: ( ( ruleProdTypeValue ) )
            // InternalFPML.g:4991:2: ( ruleProdTypeValue )
            {
            // InternalFPML.g:4991:2: ( ruleProdTypeValue )
            // InternalFPML.g:4992:3: ruleProdTypeValue
            {
             before(grammarAccess.getAdtValueAccess().getAdtElementsProdTypeValueParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProdTypeValue();

            state._fsp--;

             after(grammarAccess.getAdtValueAccess().getAdtElementsProdTypeValueParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__AdtElementsAssignment_3_2"


    // $ANTLR start "rule__ProdTypeValue__ProdAdtElementsAssignment_1"
    // InternalFPML.g:5001:1: rule__ProdTypeValue__ProdAdtElementsAssignment_1 : ( ruleAdtValue ) ;
    public final void rule__ProdTypeValue__ProdAdtElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5005:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:5006:2: ( ruleAdtValue )
            {
            // InternalFPML.g:5006:2: ( ruleAdtValue )
            // InternalFPML.g:5007:3: ruleAdtValue
            {
             before(grammarAccess.getProdTypeValueAccess().getProdAdtElementsAdtValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getProdTypeValueAccess().getProdAdtElementsAdtValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdTypeValue__ProdAdtElementsAssignment_1"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000680080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000E80000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000101000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400000L});

}