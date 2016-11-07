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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Effects'", "':'", "'('", "')'", "'+'", "'*'", "'def'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'ref'", "'int'", "'String'", "'Unit'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleEffectFullBlock"
    // InternalFPML.g:153:1: entryRuleEffectFullBlock : ruleEffectFullBlock EOF ;
    public final void entryRuleEffectFullBlock() throws RecognitionException {
        try {
            // InternalFPML.g:154:1: ( ruleEffectFullBlock EOF )
            // InternalFPML.g:155:1: ruleEffectFullBlock EOF
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
    // InternalFPML.g:162:1: ruleEffectFullBlock : ( ( rule__EffectFullBlock__Group__0 ) ) ;
    public final void ruleEffectFullBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:166:2: ( ( ( rule__EffectFullBlock__Group__0 ) ) )
            // InternalFPML.g:167:2: ( ( rule__EffectFullBlock__Group__0 ) )
            {
            // InternalFPML.g:167:2: ( ( rule__EffectFullBlock__Group__0 ) )
            // InternalFPML.g:168:3: ( rule__EffectFullBlock__Group__0 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getGroup()); 
            // InternalFPML.g:169:3: ( rule__EffectFullBlock__Group__0 )
            // InternalFPML.g:169:4: rule__EffectFullBlock__Group__0
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
    // InternalFPML.g:178:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalFPML.g:179:1: ( ruleData EOF )
            // InternalFPML.g:180:1: ruleData EOF
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
    // InternalFPML.g:187:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:191:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalFPML.g:192:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalFPML.g:192:2: ( ( rule__Data__Group__0 ) )
            // InternalFPML.g:193:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalFPML.g:194:3: ( rule__Data__Group__0 )
            // InternalFPML.g:194:4: rule__Data__Group__0
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


    // $ANTLR start "entryRuleAdt"
    // InternalFPML.g:203:1: entryRuleAdt : ruleAdt EOF ;
    public final void entryRuleAdt() throws RecognitionException {
        try {
            // InternalFPML.g:204:1: ( ruleAdt EOF )
            // InternalFPML.g:205:1: ruleAdt EOF
            {
             before(grammarAccess.getAdtRule()); 
            pushFollow(FOLLOW_1);
            ruleAdt();

            state._fsp--;

             after(grammarAccess.getAdtRule()); 
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
    // $ANTLR end "entryRuleAdt"


    // $ANTLR start "ruleAdt"
    // InternalFPML.g:212:1: ruleAdt : ( ( rule__Adt__Alternatives ) ) ;
    public final void ruleAdt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:216:2: ( ( ( rule__Adt__Alternatives ) ) )
            // InternalFPML.g:217:2: ( ( rule__Adt__Alternatives ) )
            {
            // InternalFPML.g:217:2: ( ( rule__Adt__Alternatives ) )
            // InternalFPML.g:218:3: ( rule__Adt__Alternatives )
            {
             before(grammarAccess.getAdtAccess().getAlternatives()); 
            // InternalFPML.g:219:3: ( rule__Adt__Alternatives )
            // InternalFPML.g:219:4: rule__Adt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Adt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdt"


    // $ANTLR start "entryRuleSumType"
    // InternalFPML.g:228:1: entryRuleSumType : ruleSumType EOF ;
    public final void entryRuleSumType() throws RecognitionException {
        try {
            // InternalFPML.g:229:1: ( ruleSumType EOF )
            // InternalFPML.g:230:1: ruleSumType EOF
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
    // InternalFPML.g:237:1: ruleSumType : ( ( rule__SumType__Group__0 ) ) ;
    public final void ruleSumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:241:2: ( ( ( rule__SumType__Group__0 ) ) )
            // InternalFPML.g:242:2: ( ( rule__SumType__Group__0 ) )
            {
            // InternalFPML.g:242:2: ( ( rule__SumType__Group__0 ) )
            // InternalFPML.g:243:3: ( rule__SumType__Group__0 )
            {
             before(grammarAccess.getSumTypeAccess().getGroup()); 
            // InternalFPML.g:244:3: ( rule__SumType__Group__0 )
            // InternalFPML.g:244:4: rule__SumType__Group__0
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
    // InternalFPML.g:253:1: entryRuleProdType : ruleProdType EOF ;
    public final void entryRuleProdType() throws RecognitionException {
        try {
            // InternalFPML.g:254:1: ( ruleProdType EOF )
            // InternalFPML.g:255:1: ruleProdType EOF
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
    // InternalFPML.g:262:1: ruleProdType : ( ( rule__ProdType__Group__0 ) ) ;
    public final void ruleProdType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:266:2: ( ( ( rule__ProdType__Group__0 ) ) )
            // InternalFPML.g:267:2: ( ( rule__ProdType__Group__0 ) )
            {
            // InternalFPML.g:267:2: ( ( rule__ProdType__Group__0 ) )
            // InternalFPML.g:268:3: ( rule__ProdType__Group__0 )
            {
             before(grammarAccess.getProdTypeAccess().getGroup()); 
            // InternalFPML.g:269:3: ( rule__ProdType__Group__0 )
            // InternalFPML.g:269:4: rule__ProdType__Group__0
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
    // InternalFPML.g:278:1: entryRulePureFunction : rulePureFunction EOF ;
    public final void entryRulePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:279:1: ( rulePureFunction EOF )
            // InternalFPML.g:280:1: rulePureFunction EOF
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
    // InternalFPML.g:287:1: rulePureFunction : ( ( rule__PureFunction__Group__0 ) ) ;
    public final void rulePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:291:2: ( ( ( rule__PureFunction__Group__0 ) ) )
            // InternalFPML.g:292:2: ( ( rule__PureFunction__Group__0 ) )
            {
            // InternalFPML.g:292:2: ( ( rule__PureFunction__Group__0 ) )
            // InternalFPML.g:293:3: ( rule__PureFunction__Group__0 )
            {
             before(grammarAccess.getPureFunctionAccess().getGroup()); 
            // InternalFPML.g:294:3: ( rule__PureFunction__Group__0 )
            // InternalFPML.g:294:4: rule__PureFunction__Group__0
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
    // InternalFPML.g:303:1: entryRuleEffectFullFunction : ruleEffectFullFunction EOF ;
    public final void entryRuleEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:304:1: ( ruleEffectFullFunction EOF )
            // InternalFPML.g:305:1: ruleEffectFullFunction EOF
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
    // InternalFPML.g:312:1: ruleEffectFullFunction : ( ( rule__EffectFullFunction__Group__0 ) ) ;
    public final void ruleEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:316:2: ( ( ( rule__EffectFullFunction__Group__0 ) ) )
            // InternalFPML.g:317:2: ( ( rule__EffectFullFunction__Group__0 ) )
            {
            // InternalFPML.g:317:2: ( ( rule__EffectFullFunction__Group__0 ) )
            // InternalFPML.g:318:3: ( rule__EffectFullFunction__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getGroup()); 
            // InternalFPML.g:319:3: ( rule__EffectFullFunction__Group__0 )
            // InternalFPML.g:319:4: rule__EffectFullFunction__Group__0
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
    // InternalFPML.g:328:1: entryRuleMainFunc : ruleMainFunc EOF ;
    public final void entryRuleMainFunc() throws RecognitionException {
        try {
            // InternalFPML.g:329:1: ( ruleMainFunc EOF )
            // InternalFPML.g:330:1: ruleMainFunc EOF
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
    // InternalFPML.g:337:1: ruleMainFunc : ( ( rule__MainFunc__Group__0 ) ) ;
    public final void ruleMainFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:341:2: ( ( ( rule__MainFunc__Group__0 ) ) )
            // InternalFPML.g:342:2: ( ( rule__MainFunc__Group__0 ) )
            {
            // InternalFPML.g:342:2: ( ( rule__MainFunc__Group__0 ) )
            // InternalFPML.g:343:3: ( rule__MainFunc__Group__0 )
            {
             before(grammarAccess.getMainFuncAccess().getGroup()); 
            // InternalFPML.g:344:3: ( rule__MainFunc__Group__0 )
            // InternalFPML.g:344:4: rule__MainFunc__Group__0
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
    // InternalFPML.g:353:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalFPML.g:354:1: ( ruleFunction EOF )
            // InternalFPML.g:355:1: ruleFunction EOF
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
    // InternalFPML.g:362:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:366:2: ( ( ( rule__Function__Alternatives ) ) )
            // InternalFPML.g:367:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalFPML.g:367:2: ( ( rule__Function__Alternatives ) )
            // InternalFPML.g:368:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalFPML.g:369:3: ( rule__Function__Alternatives )
            // InternalFPML.g:369:4: rule__Function__Alternatives
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
    // InternalFPML.g:378:1: entryRuleEffectFullArgument : ruleEffectFullArgument EOF ;
    public final void entryRuleEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:379:1: ( ruleEffectFullArgument EOF )
            // InternalFPML.g:380:1: ruleEffectFullArgument EOF
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
    // InternalFPML.g:387:1: ruleEffectFullArgument : ( ( rule__EffectFullArgument__Group__0 ) ) ;
    public final void ruleEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:391:2: ( ( ( rule__EffectFullArgument__Group__0 ) ) )
            // InternalFPML.g:392:2: ( ( rule__EffectFullArgument__Group__0 ) )
            {
            // InternalFPML.g:392:2: ( ( rule__EffectFullArgument__Group__0 ) )
            // InternalFPML.g:393:3: ( rule__EffectFullArgument__Group__0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getGroup()); 
            // InternalFPML.g:394:3: ( rule__EffectFullArgument__Group__0 )
            // InternalFPML.g:394:4: rule__EffectFullArgument__Group__0
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
    // InternalFPML.g:403:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFPML.g:404:1: ( ruleArgument EOF )
            // InternalFPML.g:405:1: ruleArgument EOF
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
    // InternalFPML.g:412:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:416:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalFPML.g:417:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalFPML.g:417:2: ( ( rule__Argument__Group__0 ) )
            // InternalFPML.g:418:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalFPML.g:419:3: ( rule__Argument__Group__0 )
            // InternalFPML.g:419:4: rule__Argument__Group__0
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
    // InternalFPML.g:428:1: entryRuleFunctionBodyPure : ruleFunctionBodyPure EOF ;
    public final void entryRuleFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:429:1: ( ruleFunctionBodyPure EOF )
            // InternalFPML.g:430:1: ruleFunctionBodyPure EOF
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
    // InternalFPML.g:437:1: ruleFunctionBodyPure : ( ( rule__FunctionBodyPure__Alternatives ) ) ;
    public final void ruleFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:441:2: ( ( ( rule__FunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:442:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:442:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            // InternalFPML.g:443:3: ( rule__FunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:444:3: ( rule__FunctionBodyPure__Alternatives )
            // InternalFPML.g:444:4: rule__FunctionBodyPure__Alternatives
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
    // InternalFPML.g:453:1: entryRuleFunctionBodyEffectFull : ruleFunctionBodyEffectFull EOF ;
    public final void entryRuleFunctionBodyEffectFull() throws RecognitionException {
        try {
            // InternalFPML.g:454:1: ( ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:455:1: ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:462:1: ruleFunctionBodyEffectFull : ( ( rule__FunctionBodyEffectFull__Alternatives ) ) ;
    public final void ruleFunctionBodyEffectFull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:466:2: ( ( ( rule__FunctionBodyEffectFull__Alternatives ) ) )
            // InternalFPML.g:467:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            {
            // InternalFPML.g:467:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            // InternalFPML.g:468:3: ( rule__FunctionBodyEffectFull__Alternatives )
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 
            // InternalFPML.g:469:3: ( rule__FunctionBodyEffectFull__Alternatives )
            // InternalFPML.g:469:4: rule__FunctionBodyEffectFull__Alternatives
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
    // InternalFPML.g:478:1: entryRuleEmptyFunctionBody : ruleEmptyFunctionBody EOF ;
    public final void entryRuleEmptyFunctionBody() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleEmptyFunctionBody EOF )
            // InternalFPML.g:480:1: ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:487:1: ruleEmptyFunctionBody : ( ( rule__EmptyFunctionBody__Group__0 ) ) ;
    public final void ruleEmptyFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__EmptyFunctionBody__Group__0 ) ) )
            // InternalFPML.g:492:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            {
            // InternalFPML.g:492:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            // InternalFPML.g:493:3: ( rule__EmptyFunctionBody__Group__0 )
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 
            // InternalFPML.g:494:3: ( rule__EmptyFunctionBody__Group__0 )
            // InternalFPML.g:494:4: rule__EmptyFunctionBody__Group__0
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
    // InternalFPML.g:503:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:505:1: ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:512:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) )
            // InternalFPML.g:517:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            {
            // InternalFPML.g:517:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            // InternalFPML.g:518:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup()); 
            // InternalFPML.g:519:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            // InternalFPML.g:519:4: rule__CompositionFunctionBodyPure__Group__0
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
    // InternalFPML.g:528:1: entryRuleCompositionFunctionBodyEffect : ruleCompositionFunctionBodyEffect EOF ;
    public final void entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:530:1: ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:537:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) )
            // InternalFPML.g:542:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            {
            // InternalFPML.g:542:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            // InternalFPML.g:543:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup()); 
            // InternalFPML.g:544:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            // InternalFPML.g:544:4: rule__CompositionFunctionBodyEffect__Group__0
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
    // InternalFPML.g:553:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleIOType EOF )
            // InternalFPML.g:555:1: ruleIOType EOF
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
    // InternalFPML.g:562:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:567:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:567:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:568:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:569:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:569:4: rule__IOType__Group__0
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
    // InternalFPML.g:578:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:579:1: ( ruleValueType EOF )
            // InternalFPML.g:580:1: ruleValueType EOF
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
    // InternalFPML.g:587:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:592:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:592:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:593:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:594:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:594:4: rule__ValueType__Alternatives
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
    // InternalFPML.g:603:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleType EOF )
            // InternalFPML.g:605:1: ruleType EOF
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
    // InternalFPML.g:612:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:617:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:617:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:618:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:619:3: ( rule__Type__Alternatives )
            // InternalFPML.g:619:4: rule__Type__Alternatives
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
    // InternalFPML.g:628:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleIntegerType EOF )
            // InternalFPML.g:630:1: ruleIntegerType EOF
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
    // InternalFPML.g:637:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:642:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:642:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:643:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:644:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:644:4: rule__IntegerType__Group__0
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
    // InternalFPML.g:653:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( ruleStringType EOF )
            // InternalFPML.g:655:1: ruleStringType EOF
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
    // InternalFPML.g:662:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:667:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:667:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:668:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:669:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:669:4: rule__StringType__Group__0
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
    // InternalFPML.g:678:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleUnitType EOF )
            // InternalFPML.g:680:1: ruleUnitType EOF
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
    // InternalFPML.g:687:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:692:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:692:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:693:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:694:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:694:4: rule__UnitType__Group__0
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
    // InternalFPML.g:703:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( ruleDataType EOF )
            // InternalFPML.g:705:1: ruleDataType EOF
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
    // InternalFPML.g:712:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:717:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:717:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:718:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:719:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:719:4: rule__DataType__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalFPML.g:728:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleValue EOF )
            // InternalFPML.g:730:1: ruleValue EOF
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
    // InternalFPML.g:737:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalFPML.g:742:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalFPML.g:742:2: ( ( rule__Value__Alternatives ) )
            // InternalFPML.g:743:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalFPML.g:744:3: ( rule__Value__Alternatives )
            // InternalFPML.g:744:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIntValue"
    // InternalFPML.g:753:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleIntValue EOF )
            // InternalFPML.g:755:1: ruleIntValue EOF
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
    // InternalFPML.g:762:1: ruleIntValue : ( RULE_INT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( RULE_INT ) )
            // InternalFPML.g:767:2: ( RULE_INT )
            {
            // InternalFPML.g:767:2: ( RULE_INT )
            // InternalFPML.g:768:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 

            }


            }

        }
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
    // InternalFPML.g:778:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleStringValue EOF )
            // InternalFPML.g:780:1: ruleStringValue EOF
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
    // InternalFPML.g:787:1: ruleStringValue : ( RULE_STRING ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( RULE_STRING ) )
            // InternalFPML.g:792:2: ( RULE_STRING )
            {
            // InternalFPML.g:792:2: ( RULE_STRING )
            // InternalFPML.g:793:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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
    // InternalFPML.g:803:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalFPML.g:804:1: ( ruleUnitValue EOF )
            // InternalFPML.g:805:1: ruleUnitValue EOF
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
    // InternalFPML.g:812:1: ruleUnitValue : ( '()' ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:816:2: ( ( '()' ) )
            // InternalFPML.g:817:2: ( '()' )
            {
            // InternalFPML.g:817:2: ( '()' )
            // InternalFPML.g:818:3: '()'
            {
             before(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword()); 

            }


            }

        }
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


    // $ANTLR start "rule__Adt__Alternatives"
    // InternalFPML.g:827:1: rule__Adt__Alternatives : ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) );
    public final void rule__Adt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:831:1: ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalFPML.g:832:2: ( ruleArgument )
                    {
                    // InternalFPML.g:832:2: ( ruleArgument )
                    // InternalFPML.g:833:3: ruleArgument
                    {
                     before(grammarAccess.getAdtAccess().getArgumentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArgument();

                    state._fsp--;

                     after(grammarAccess.getAdtAccess().getArgumentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:838:2: ( ruleValue )
                    {
                    // InternalFPML.g:838:2: ( ruleValue )
                    // InternalFPML.g:839:3: ruleValue
                    {
                     before(grammarAccess.getAdtAccess().getValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getAdtAccess().getValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:844:2: ( ruleSumType )
                    {
                    // InternalFPML.g:844:2: ( ruleSumType )
                    // InternalFPML.g:845:3: ruleSumType
                    {
                     before(grammarAccess.getAdtAccess().getSumTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSumType();

                    state._fsp--;

                     after(grammarAccess.getAdtAccess().getSumTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:850:2: ( ruleProdType )
                    {
                    // InternalFPML.g:850:2: ( ruleProdType )
                    // InternalFPML.g:851:3: ruleProdType
                    {
                     before(grammarAccess.getAdtAccess().getProdTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleProdType();

                    state._fsp--;

                     after(grammarAccess.getAdtAccess().getProdTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__Adt__Alternatives"


    // $ANTLR start "rule__SumType__SumAdtElementsAlternatives_1_0"
    // InternalFPML.g:860:1: rule__SumType__SumAdtElementsAlternatives_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__SumType__SumAdtElementsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:864:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=29 && LA2_0<=31)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFPML.g:865:2: ( ruleValueType )
                    {
                    // InternalFPML.g:865:2: ( ruleValueType )
                    // InternalFPML.g:866:3: ruleValueType
                    {
                     before(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:871:2: ( ruleValue )
                    {
                    // InternalFPML.g:871:2: ( ruleValue )
                    // InternalFPML.g:872:3: ruleValue
                    {
                     before(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__SumType__SumAdtElementsAlternatives_1_0"


    // $ANTLR start "rule__SumType__SumAdtElementsAlternatives_2_1_0"
    // InternalFPML.g:881:1: rule__SumType__SumAdtElementsAlternatives_2_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__SumType__SumAdtElementsAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:885:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=31)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFPML.g:886:2: ( ruleValueType )
                    {
                    // InternalFPML.g:886:2: ( ruleValueType )
                    // InternalFPML.g:887:3: ruleValueType
                    {
                     before(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_2_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:892:2: ( ruleValue )
                    {
                    // InternalFPML.g:892:2: ( ruleValue )
                    // InternalFPML.g:893:3: ruleValue
                    {
                     before(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_2_1_0_1()); 

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
    // $ANTLR end "rule__SumType__SumAdtElementsAlternatives_2_1_0"


    // $ANTLR start "rule__ProdType__ProdAdtElementsAlternatives_1_0"
    // InternalFPML.g:902:1: rule__ProdType__ProdAdtElementsAlternatives_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__ProdType__ProdAdtElementsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:906:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:907:2: ( ruleValueType )
                    {
                    // InternalFPML.g:907:2: ( ruleValueType )
                    // InternalFPML.g:908:3: ruleValueType
                    {
                     before(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:913:2: ( ruleValue )
                    {
                    // InternalFPML.g:913:2: ( ruleValue )
                    // InternalFPML.g:914:3: ruleValue
                    {
                     before(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__ProdType__ProdAdtElementsAlternatives_1_0"


    // $ANTLR start "rule__ProdType__ProdAdtElementsAlternatives_2_1_0"
    // InternalFPML.g:923:1: rule__ProdType__ProdAdtElementsAlternatives_2_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__ProdType__ProdAdtElementsAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:927:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=29 && LA5_0<=31)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:928:2: ( ruleValueType )
                    {
                    // InternalFPML.g:928:2: ( ruleValueType )
                    // InternalFPML.g:929:3: ruleValueType
                    {
                     before(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_2_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:934:2: ( ruleValue )
                    {
                    // InternalFPML.g:934:2: ( ruleValue )
                    // InternalFPML.g:935:3: ruleValue
                    {
                     before(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_2_1_0_1()); 

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
    // $ANTLR end "rule__ProdType__ProdAdtElementsAlternatives_2_1_0"


    // $ANTLR start "rule__Function__Alternatives"
    // InternalFPML.g:944:1: rule__Function__Alternatives : ( ( rulePureFunction ) | ( ruleEffectFullFunction ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:948:1: ( ( rulePureFunction ) | ( ruleEffectFullFunction ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==24) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=29 && LA6_1<=31)) ) {
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
                    // InternalFPML.g:949:2: ( rulePureFunction )
                    {
                    // InternalFPML.g:949:2: ( rulePureFunction )
                    // InternalFPML.g:950:3: rulePureFunction
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
                    // InternalFPML.g:955:2: ( ruleEffectFullFunction )
                    {
                    // InternalFPML.g:955:2: ( ruleEffectFullFunction )
                    // InternalFPML.g:956:3: ruleEffectFullFunction
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
    // InternalFPML.g:965:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:969:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:970:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:970:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:971:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:976:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:976:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:977:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:986:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:990:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:991:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:991:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:992:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:997:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:997:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:998:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1007:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1011:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1012:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:1012:2: ( ruleIntegerType )
                    // InternalFPML.g:1013:3: ruleIntegerType
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
                    // InternalFPML.g:1018:2: ( ruleStringType )
                    {
                    // InternalFPML.g:1018:2: ( ruleStringType )
                    // InternalFPML.g:1019:3: ruleStringType
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
                    // InternalFPML.g:1024:2: ( ruleDataType )
                    {
                    // InternalFPML.g:1024:2: ( ruleDataType )
                    // InternalFPML.g:1025:3: ruleDataType
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
    // InternalFPML.g:1034:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1038:1: ( ( ruleValueType ) | ( ruleUnitType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=29 && LA10_0<=31)) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1039:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1039:2: ( ruleValueType )
                    // InternalFPML.g:1040:3: ruleValueType
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
                    // InternalFPML.g:1045:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1045:2: ( ruleUnitType )
                    // InternalFPML.g:1046:3: ruleUnitType
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalFPML.g:1055:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1059:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case 11:
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
                    // InternalFPML.g:1060:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1060:2: ( ruleIntValue )
                    // InternalFPML.g:1061:3: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1066:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1066:2: ( ruleStringValue )
                    // InternalFPML.g:1067:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1072:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:1072:2: ( ruleUnitValue )
                    // InternalFPML.g:1073:3: ruleUnitValue
                    {
                     before(grammarAccess.getValueAccess().getUnitValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getUnitValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFPML.g:1082:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1086:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1087:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:1094:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1098:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1099:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1099:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1100:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1101:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1101:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:1109:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1113:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1114:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:1120:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1124:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:1125:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:1125:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:1126:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:1127:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:1127:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:1136:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1140:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:1141:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:1148:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1152:1: ( ( 'Pure' ) )
            // InternalFPML.g:1153:1: ( 'Pure' )
            {
            // InternalFPML.g:1153:1: ( 'Pure' )
            // InternalFPML.g:1154:2: 'Pure'
            {
             before(grammarAccess.getPureBlockAccess().getPureKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalFPML.g:1163:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1167:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:1168:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:1175:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1179:1: ( ( '{' ) )
            // InternalFPML.g:1180:1: ( '{' )
            {
            // InternalFPML.g:1180:1: ( '{' )
            // InternalFPML.g:1181:2: '{'
            {
             before(grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:1190:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1194:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:1195:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:1202:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1206:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:1207:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:1207:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:1208:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1209:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:1209:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:1217:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1221:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:1222:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:1229:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1233:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:1234:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:1234:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:1235:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:1236:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:1236:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:1244:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1248:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:1249:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:1255:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1259:1: ( ( '}' ) )
            // InternalFPML.g:1260:1: ( '}' )
            {
            // InternalFPML.g:1260:1: ( '}' )
            // InternalFPML.g:1261:2: '}'
            {
             before(grammarAccess.getPureBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:1271:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1275:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:1276:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:1283:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1287:1: ( ( 'Functions' ) )
            // InternalFPML.g:1288:1: ( 'Functions' )
            {
            // InternalFPML.g:1288:1: ( 'Functions' )
            // InternalFPML.g:1289:2: 'Functions'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:1298:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1302:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:1303:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:1310:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1314:1: ( ( '{' ) )
            // InternalFPML.g:1315:1: ( '{' )
            {
            // InternalFPML.g:1315:1: ( '{' )
            // InternalFPML.g:1316:2: '{'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:1325:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1329:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:1330:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:1337:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1341:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:1342:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:1342:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:1343:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:1344:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFPML.g:1344:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFPML.g:1352:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1356:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:1357:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:1363:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1367:1: ( ( '}' ) )
            // InternalFPML.g:1368:1: ( '}' )
            {
            // InternalFPML.g:1368:1: ( '}' )
            // InternalFPML.g:1369:2: '}'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:1379:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1383:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:1384:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
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
    // InternalFPML.g:1391:1: rule__DataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1395:1: ( ( 'Data' ) )
            // InternalFPML.g:1396:1: ( 'Data' )
            {
            // InternalFPML.g:1396:1: ( 'Data' )
            // InternalFPML.g:1397:2: 'Data'
            {
             before(grammarAccess.getDataBlockAccess().getDataKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFPML.g:1406:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1410:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:1411:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
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
    // InternalFPML.g:1418:1: rule__DataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1422:1: ( ( '{' ) )
            // InternalFPML.g:1423:1: ( '{' )
            {
            // InternalFPML.g:1423:1: ( '{' )
            // InternalFPML.g:1424:2: '{'
            {
             before(grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:1433:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1437:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:1438:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
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
    // InternalFPML.g:1445:1: rule__DataBlock__Group__2__Impl : ( ( rule__DataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1449:1: ( ( ( rule__DataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:1450:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:1450:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:1451:2: ( rule__DataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1452:2: ( rule__DataBlock__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFPML.g:1452:3: rule__DataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFPML.g:1460:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1464:1: ( rule__DataBlock__Group__3__Impl )
            // InternalFPML.g:1465:2: rule__DataBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:1471:1: rule__DataBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1475:1: ( ( '}' ) )
            // InternalFPML.g:1476:1: ( '}' )
            {
            // InternalFPML.g:1476:1: ( '}' )
            // InternalFPML.g:1477:2: '}'
            {
             before(grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectFullBlock__Group__0"
    // InternalFPML.g:1487:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1491:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:1492:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:1499:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1503:1: ( ( 'Effects' ) )
            // InternalFPML.g:1504:1: ( 'Effects' )
            {
            // InternalFPML.g:1504:1: ( 'Effects' )
            // InternalFPML.g:1505:2: 'Effects'
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
    // InternalFPML.g:1514:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1518:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:1519:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalFPML.g:1526:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1530:1: ( ( '{' ) )
            // InternalFPML.g:1531:1: ( '{' )
            {
            // InternalFPML.g:1531:1: ( '{' )
            // InternalFPML.g:1532:2: '{'
            {
             before(grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:1541:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1545:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:1546:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalFPML.g:1553:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1557:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:1558:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:1558:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:1559:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:1560:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFPML.g:1560:3: rule__EffectFullBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFPML.g:1568:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1572:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:1573:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:1580:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1584:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:1585:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:1585:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:1586:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:1587:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:1587:3: rule__EffectFullBlock__MainAssignment_3
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
    // InternalFPML.g:1595:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1599:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:1600:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:1606:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1610:1: ( ( '}' ) )
            // InternalFPML.g:1611:1: ( '}' )
            {
            // InternalFPML.g:1611:1: ( '}' )
            // InternalFPML.g:1612:2: '}'
            {
             before(grammarAccess.getEffectFullBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:1622:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1626:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:1627:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalFPML.g:1634:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1638:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:1639:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:1639:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:1640:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:1641:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:1641:3: rule__Data__NameAssignment_0
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
    // InternalFPML.g:1649:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1653:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:1654:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFPML.g:1661:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1665:1: ( ( ':' ) )
            // InternalFPML.g:1666:1: ( ':' )
            {
            // InternalFPML.g:1666:1: ( ':' )
            // InternalFPML.g:1667:2: ':'
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
    // InternalFPML.g:1676:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1680:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:1681:2: rule__Data__Group__2__Impl
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
    // InternalFPML.g:1687:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1691:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:1692:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:1692:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:1693:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:1694:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:1694:3: rule__Data__ContentAssignment_2
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


    // $ANTLR start "rule__SumType__Group__0"
    // InternalFPML.g:1703:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1707:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:1708:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
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
    // InternalFPML.g:1715:1: rule__SumType__Group__0__Impl : ( '(' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1719:1: ( ( '(' ) )
            // InternalFPML.g:1720:1: ( '(' )
            {
            // InternalFPML.g:1720:1: ( '(' )
            // InternalFPML.g:1721:2: '('
            {
             before(grammarAccess.getSumTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSumTypeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // InternalFPML.g:1730:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl rule__SumType__Group__2 ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1734:1: ( rule__SumType__Group__1__Impl rule__SumType__Group__2 )
            // InternalFPML.g:1735:2: rule__SumType__Group__1__Impl rule__SumType__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:1742:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__SumAdtElementsAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1746:1: ( ( ( rule__SumType__SumAdtElementsAssignment_1 ) ) )
            // InternalFPML.g:1747:1: ( ( rule__SumType__SumAdtElementsAssignment_1 ) )
            {
            // InternalFPML.g:1747:1: ( ( rule__SumType__SumAdtElementsAssignment_1 ) )
            // InternalFPML.g:1748:2: ( rule__SumType__SumAdtElementsAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_1()); 
            // InternalFPML.g:1749:2: ( rule__SumType__SumAdtElementsAssignment_1 )
            // InternalFPML.g:1749:3: rule__SumType__SumAdtElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SumType__SumAdtElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SumType__Group__2"
    // InternalFPML.g:1757:1: rule__SumType__Group__2 : rule__SumType__Group__2__Impl rule__SumType__Group__3 ;
    public final void rule__SumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1761:1: ( rule__SumType__Group__2__Impl rule__SumType__Group__3 )
            // InternalFPML.g:1762:2: rule__SumType__Group__2__Impl rule__SumType__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__2"


    // $ANTLR start "rule__SumType__Group__2__Impl"
    // InternalFPML.g:1769:1: rule__SumType__Group__2__Impl : ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) ) ;
    public final void rule__SumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1773:1: ( ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) ) )
            // InternalFPML.g:1774:1: ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) )
            {
            // InternalFPML.g:1774:1: ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) )
            // InternalFPML.g:1775:2: ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* )
            {
            // InternalFPML.g:1775:2: ( ( rule__SumType__Group_2__0 ) )
            // InternalFPML.g:1776:3: ( rule__SumType__Group_2__0 )
            {
             before(grammarAccess.getSumTypeAccess().getGroup_2()); 
            // InternalFPML.g:1777:3: ( rule__SumType__Group_2__0 )
            // InternalFPML.g:1777:4: rule__SumType__Group_2__0
            {
            pushFollow(FOLLOW_18);
            rule__SumType__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getGroup_2()); 

            }

            // InternalFPML.g:1780:2: ( ( rule__SumType__Group_2__0 )* )
            // InternalFPML.g:1781:3: ( rule__SumType__Group_2__0 )*
            {
             before(grammarAccess.getSumTypeAccess().getGroup_2()); 
            // InternalFPML.g:1782:3: ( rule__SumType__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFPML.g:1782:4: rule__SumType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SumType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSumTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SumType__Group__2__Impl"


    // $ANTLR start "rule__SumType__Group__3"
    // InternalFPML.g:1791:1: rule__SumType__Group__3 : rule__SumType__Group__3__Impl ;
    public final void rule__SumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1795:1: ( rule__SumType__Group__3__Impl )
            // InternalFPML.g:1796:2: rule__SumType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__3"


    // $ANTLR start "rule__SumType__Group__3__Impl"
    // InternalFPML.g:1802:1: rule__SumType__Group__3__Impl : ( ')' ) ;
    public final void rule__SumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1806:1: ( ( ')' ) )
            // InternalFPML.g:1807:1: ( ')' )
            {
            // InternalFPML.g:1807:1: ( ')' )
            // InternalFPML.g:1808:2: ')'
            {
             before(grammarAccess.getSumTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSumTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__3__Impl"


    // $ANTLR start "rule__SumType__Group_2__0"
    // InternalFPML.g:1818:1: rule__SumType__Group_2__0 : rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1 ;
    public final void rule__SumType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1822:1: ( rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1 )
            // InternalFPML.g:1823:2: rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__SumType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group_2__0"


    // $ANTLR start "rule__SumType__Group_2__0__Impl"
    // InternalFPML.g:1830:1: rule__SumType__Group_2__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1834:1: ( ( '+' ) )
            // InternalFPML.g:1835:1: ( '+' )
            {
            // InternalFPML.g:1835:1: ( '+' )
            // InternalFPML.g:1836:2: '+'
            {
             before(grammarAccess.getSumTypeAccess().getPlusSignKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSumTypeAccess().getPlusSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group_2__0__Impl"


    // $ANTLR start "rule__SumType__Group_2__1"
    // InternalFPML.g:1845:1: rule__SumType__Group_2__1 : rule__SumType__Group_2__1__Impl ;
    public final void rule__SumType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1849:1: ( rule__SumType__Group_2__1__Impl )
            // InternalFPML.g:1850:2: rule__SumType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group_2__1"


    // $ANTLR start "rule__SumType__Group_2__1__Impl"
    // InternalFPML.g:1856:1: rule__SumType__Group_2__1__Impl : ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) ) ;
    public final void rule__SumType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1860:1: ( ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) ) )
            // InternalFPML.g:1861:1: ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) )
            {
            // InternalFPML.g:1861:1: ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) )
            // InternalFPML.g:1862:2: ( rule__SumType__SumAdtElementsAssignment_2_1 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_2_1()); 
            // InternalFPML.g:1863:2: ( rule__SumType__SumAdtElementsAssignment_2_1 )
            // InternalFPML.g:1863:3: rule__SumType__SumAdtElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SumType__SumAdtElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group_2__1__Impl"


    // $ANTLR start "rule__ProdType__Group__0"
    // InternalFPML.g:1872:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1876:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:1877:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
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
    // InternalFPML.g:1884:1: rule__ProdType__Group__0__Impl : ( '(' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1888:1: ( ( '(' ) )
            // InternalFPML.g:1889:1: ( '(' )
            {
            // InternalFPML.g:1889:1: ( '(' )
            // InternalFPML.g:1890:2: '('
            {
             before(grammarAccess.getProdTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProdTypeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // InternalFPML.g:1899:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl rule__ProdType__Group__2 ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1903:1: ( rule__ProdType__Group__1__Impl rule__ProdType__Group__2 )
            // InternalFPML.g:1904:2: rule__ProdType__Group__1__Impl rule__ProdType__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ProdType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:1911:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1915:1: ( ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) ) )
            // InternalFPML.g:1916:1: ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) )
            {
            // InternalFPML.g:1916:1: ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) )
            // InternalFPML.g:1917:2: ( rule__ProdType__ProdAdtElementsAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_1()); 
            // InternalFPML.g:1918:2: ( rule__ProdType__ProdAdtElementsAssignment_1 )
            // InternalFPML.g:1918:3: rule__ProdType__ProdAdtElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__ProdAdtElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProdType__Group__2"
    // InternalFPML.g:1926:1: rule__ProdType__Group__2 : rule__ProdType__Group__2__Impl rule__ProdType__Group__3 ;
    public final void rule__ProdType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1930:1: ( rule__ProdType__Group__2__Impl rule__ProdType__Group__3 )
            // InternalFPML.g:1931:2: rule__ProdType__Group__2__Impl rule__ProdType__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ProdType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__2"


    // $ANTLR start "rule__ProdType__Group__2__Impl"
    // InternalFPML.g:1938:1: rule__ProdType__Group__2__Impl : ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) ) ;
    public final void rule__ProdType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1942:1: ( ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) ) )
            // InternalFPML.g:1943:1: ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) )
            {
            // InternalFPML.g:1943:1: ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) )
            // InternalFPML.g:1944:2: ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* )
            {
            // InternalFPML.g:1944:2: ( ( rule__ProdType__Group_2__0 ) )
            // InternalFPML.g:1945:3: ( rule__ProdType__Group_2__0 )
            {
             before(grammarAccess.getProdTypeAccess().getGroup_2()); 
            // InternalFPML.g:1946:3: ( rule__ProdType__Group_2__0 )
            // InternalFPML.g:1946:4: rule__ProdType__Group_2__0
            {
            pushFollow(FOLLOW_20);
            rule__ProdType__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getGroup_2()); 

            }

            // InternalFPML.g:1949:2: ( ( rule__ProdType__Group_2__0 )* )
            // InternalFPML.g:1950:3: ( rule__ProdType__Group_2__0 )*
            {
             before(grammarAccess.getProdTypeAccess().getGroup_2()); 
            // InternalFPML.g:1951:3: ( rule__ProdType__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFPML.g:1951:4: rule__ProdType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ProdType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getProdTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ProdType__Group__2__Impl"


    // $ANTLR start "rule__ProdType__Group__3"
    // InternalFPML.g:1960:1: rule__ProdType__Group__3 : rule__ProdType__Group__3__Impl ;
    public final void rule__ProdType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1964:1: ( rule__ProdType__Group__3__Impl )
            // InternalFPML.g:1965:2: rule__ProdType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__3"


    // $ANTLR start "rule__ProdType__Group__3__Impl"
    // InternalFPML.g:1971:1: rule__ProdType__Group__3__Impl : ( ')' ) ;
    public final void rule__ProdType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1975:1: ( ( ')' ) )
            // InternalFPML.g:1976:1: ( ')' )
            {
            // InternalFPML.g:1976:1: ( ')' )
            // InternalFPML.g:1977:2: ')'
            {
             before(grammarAccess.getProdTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProdTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__3__Impl"


    // $ANTLR start "rule__ProdType__Group_2__0"
    // InternalFPML.g:1987:1: rule__ProdType__Group_2__0 : rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1 ;
    public final void rule__ProdType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1991:1: ( rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1 )
            // InternalFPML.g:1992:2: rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__ProdType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group_2__0"


    // $ANTLR start "rule__ProdType__Group_2__0__Impl"
    // InternalFPML.g:1999:1: rule__ProdType__Group_2__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2003:1: ( ( '*' ) )
            // InternalFPML.g:2004:1: ( '*' )
            {
            // InternalFPML.g:2004:1: ( '*' )
            // InternalFPML.g:2005:2: '*'
            {
             before(grammarAccess.getProdTypeAccess().getAsteriskKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProdTypeAccess().getAsteriskKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group_2__0__Impl"


    // $ANTLR start "rule__ProdType__Group_2__1"
    // InternalFPML.g:2014:1: rule__ProdType__Group_2__1 : rule__ProdType__Group_2__1__Impl ;
    public final void rule__ProdType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2018:1: ( rule__ProdType__Group_2__1__Impl )
            // InternalFPML.g:2019:2: rule__ProdType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group_2__1"


    // $ANTLR start "rule__ProdType__Group_2__1__Impl"
    // InternalFPML.g:2025:1: rule__ProdType__Group_2__1__Impl : ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) ) ;
    public final void rule__ProdType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2029:1: ( ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) ) )
            // InternalFPML.g:2030:1: ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) )
            {
            // InternalFPML.g:2030:1: ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) )
            // InternalFPML.g:2031:2: ( rule__ProdType__ProdAdtElementsAssignment_2_1 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_2_1()); 
            // InternalFPML.g:2032:2: ( rule__ProdType__ProdAdtElementsAssignment_2_1 )
            // InternalFPML.g:2032:3: rule__ProdType__ProdAdtElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__ProdAdtElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group_2__1__Impl"


    // $ANTLR start "rule__PureFunction__Group__0"
    // InternalFPML.g:2041:1: rule__PureFunction__Group__0 : rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 ;
    public final void rule__PureFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2045:1: ( rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 )
            // InternalFPML.g:2046:2: rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFPML.g:2053:1: rule__PureFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2057:1: ( ( 'def' ) )
            // InternalFPML.g:2058:1: ( 'def' )
            {
            // InternalFPML.g:2058:1: ( 'def' )
            // InternalFPML.g:2059:2: 'def'
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
    // InternalFPML.g:2068:1: rule__PureFunction__Group__1 : rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 ;
    public final void rule__PureFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2072:1: ( rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 )
            // InternalFPML.g:2073:2: rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:2080:1: rule__PureFunction__Group__1__Impl : ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2084:1: ( ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2085:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2085:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2086:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2087:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2087:3: rule__PureFunction__ReturnTypeAssignment_1
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
    // InternalFPML.g:2095:1: rule__PureFunction__Group__2 : rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 ;
    public final void rule__PureFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2099:1: ( rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 )
            // InternalFPML.g:2100:2: rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:2107:1: rule__PureFunction__Group__2__Impl : ( ( rule__PureFunction__NameAssignment_2 ) ) ;
    public final void rule__PureFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2111:1: ( ( ( rule__PureFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2112:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2112:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            // InternalFPML.g:2113:2: ( rule__PureFunction__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2114:2: ( rule__PureFunction__NameAssignment_2 )
            // InternalFPML.g:2114:3: rule__PureFunction__NameAssignment_2
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
    // InternalFPML.g:2122:1: rule__PureFunction__Group__3 : rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 ;
    public final void rule__PureFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2126:1: ( rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 )
            // InternalFPML.g:2127:2: rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalFPML.g:2134:1: rule__PureFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2138:1: ( ( '(' ) )
            // InternalFPML.g:2139:1: ( '(' )
            {
            // InternalFPML.g:2139:1: ( '(' )
            // InternalFPML.g:2140:2: '('
            {
             before(grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:2149:1: rule__PureFunction__Group__4 : rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 ;
    public final void rule__PureFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2153:1: ( rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 )
            // InternalFPML.g:2154:2: rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFPML.g:2161:1: rule__PureFunction__Group__4__Impl : ( ( rule__PureFunction__ArgAssignment_4 ) ) ;
    public final void rule__PureFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2165:1: ( ( ( rule__PureFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2166:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2166:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2167:2: ( rule__PureFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2168:2: ( rule__PureFunction__ArgAssignment_4 )
            // InternalFPML.g:2168:3: rule__PureFunction__ArgAssignment_4
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
    // InternalFPML.g:2176:1: rule__PureFunction__Group__5 : rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 ;
    public final void rule__PureFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2180:1: ( rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 )
            // InternalFPML.g:2181:2: rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalFPML.g:2188:1: rule__PureFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__PureFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2192:1: ( ( ')' ) )
            // InternalFPML.g:2193:1: ( ')' )
            {
            // InternalFPML.g:2193:1: ( ')' )
            // InternalFPML.g:2194:2: ')'
            {
             before(grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:2203:1: rule__PureFunction__Group__6 : rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 ;
    public final void rule__PureFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2207:1: ( rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 )
            // InternalFPML.g:2208:2: rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7
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
    // InternalFPML.g:2215:1: rule__PureFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__PureFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2219:1: ( ( ':' ) )
            // InternalFPML.g:2220:1: ( ':' )
            {
            // InternalFPML.g:2220:1: ( ':' )
            // InternalFPML.g:2221:2: ':'
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
    // InternalFPML.g:2230:1: rule__PureFunction__Group__7 : rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 ;
    public final void rule__PureFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2234:1: ( rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 )
            // InternalFPML.g:2235:2: rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:2242:1: rule__PureFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__PureFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2246:1: ( ( '{' ) )
            // InternalFPML.g:2247:1: ( '{' )
            {
            // InternalFPML.g:2247:1: ( '{' )
            // InternalFPML.g:2248:2: '{'
            {
             before(grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:2257:1: rule__PureFunction__Group__8 : rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 ;
    public final void rule__PureFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2261:1: ( rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 )
            // InternalFPML.g:2262:2: rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9
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
    // InternalFPML.g:2269:1: rule__PureFunction__Group__8__Impl : ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__PureFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2273:1: ( ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2274:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2274:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2275:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getPureFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2276:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2276:3: rule__PureFunction__FunctionBodyAssignment_8
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
    // InternalFPML.g:2284:1: rule__PureFunction__Group__9 : rule__PureFunction__Group__9__Impl ;
    public final void rule__PureFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2288:1: ( rule__PureFunction__Group__9__Impl )
            // InternalFPML.g:2289:2: rule__PureFunction__Group__9__Impl
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
    // InternalFPML.g:2295:1: rule__PureFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__PureFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2299:1: ( ( '}' ) )
            // InternalFPML.g:2300:1: ( '}' )
            {
            // InternalFPML.g:2300:1: ( '}' )
            // InternalFPML.g:2301:2: '}'
            {
             before(grammarAccess.getPureFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2311:1: rule__EffectFullFunction__Group__0 : rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 ;
    public final void rule__EffectFullFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2315:1: ( rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 )
            // InternalFPML.g:2316:2: rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:2323:1: rule__EffectFullFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2327:1: ( ( 'def' ) )
            // InternalFPML.g:2328:1: ( 'def' )
            {
            // InternalFPML.g:2328:1: ( 'def' )
            // InternalFPML.g:2329:2: 'def'
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
    // InternalFPML.g:2338:1: rule__EffectFullFunction__Group__1 : rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 ;
    public final void rule__EffectFullFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2342:1: ( rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 )
            // InternalFPML.g:2343:2: rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:2350:1: rule__EffectFullFunction__Group__1__Impl : ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2354:1: ( ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2355:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2355:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2356:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2357:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2357:3: rule__EffectFullFunction__ReturnTypeAssignment_1
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
    // InternalFPML.g:2365:1: rule__EffectFullFunction__Group__2 : rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 ;
    public final void rule__EffectFullFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2369:1: ( rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 )
            // InternalFPML.g:2370:2: rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:2377:1: rule__EffectFullFunction__Group__2__Impl : ( ( rule__EffectFullFunction__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2381:1: ( ( ( rule__EffectFullFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2382:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2382:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            // InternalFPML.g:2383:2: ( rule__EffectFullFunction__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2384:2: ( rule__EffectFullFunction__NameAssignment_2 )
            // InternalFPML.g:2384:3: rule__EffectFullFunction__NameAssignment_2
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
    // InternalFPML.g:2392:1: rule__EffectFullFunction__Group__3 : rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 ;
    public final void rule__EffectFullFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2396:1: ( rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 )
            // InternalFPML.g:2397:2: rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:2404:1: rule__EffectFullFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2408:1: ( ( '(' ) )
            // InternalFPML.g:2409:1: ( '(' )
            {
            // InternalFPML.g:2409:1: ( '(' )
            // InternalFPML.g:2410:2: '('
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:2419:1: rule__EffectFullFunction__Group__4 : rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 ;
    public final void rule__EffectFullFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2423:1: ( rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 )
            // InternalFPML.g:2424:2: rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFPML.g:2431:1: rule__EffectFullFunction__Group__4__Impl : ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2435:1: ( ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2436:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2436:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2437:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2438:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            // InternalFPML.g:2438:3: rule__EffectFullFunction__ArgAssignment_4
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
    // InternalFPML.g:2446:1: rule__EffectFullFunction__Group__5 : rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 ;
    public final void rule__EffectFullFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2450:1: ( rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 )
            // InternalFPML.g:2451:2: rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalFPML.g:2458:1: rule__EffectFullFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__EffectFullFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2462:1: ( ( ')' ) )
            // InternalFPML.g:2463:1: ( ')' )
            {
            // InternalFPML.g:2463:1: ( ')' )
            // InternalFPML.g:2464:2: ')'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:2473:1: rule__EffectFullFunction__Group__6 : rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 ;
    public final void rule__EffectFullFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2477:1: ( rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 )
            // InternalFPML.g:2478:2: rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7
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
    // InternalFPML.g:2485:1: rule__EffectFullFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__EffectFullFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2489:1: ( ( ':' ) )
            // InternalFPML.g:2490:1: ( ':' )
            {
            // InternalFPML.g:2490:1: ( ':' )
            // InternalFPML.g:2491:2: ':'
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
    // InternalFPML.g:2500:1: rule__EffectFullFunction__Group__7 : rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 ;
    public final void rule__EffectFullFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2504:1: ( rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 )
            // InternalFPML.g:2505:2: rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:2512:1: rule__EffectFullFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__EffectFullFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2516:1: ( ( '{' ) )
            // InternalFPML.g:2517:1: ( '{' )
            {
            // InternalFPML.g:2517:1: ( '{' )
            // InternalFPML.g:2518:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:2527:1: rule__EffectFullFunction__Group__8 : rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 ;
    public final void rule__EffectFullFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2531:1: ( rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 )
            // InternalFPML.g:2532:2: rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9
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
    // InternalFPML.g:2539:1: rule__EffectFullFunction__Group__8__Impl : ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__EffectFullFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2543:1: ( ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2544:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2544:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2545:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2546:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2546:3: rule__EffectFullFunction__FunctionBodyAssignment_8
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
    // InternalFPML.g:2554:1: rule__EffectFullFunction__Group__9 : rule__EffectFullFunction__Group__9__Impl ;
    public final void rule__EffectFullFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2558:1: ( rule__EffectFullFunction__Group__9__Impl )
            // InternalFPML.g:2559:2: rule__EffectFullFunction__Group__9__Impl
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
    // InternalFPML.g:2565:1: rule__EffectFullFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__EffectFullFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2569:1: ( ( '}' ) )
            // InternalFPML.g:2570:1: ( '}' )
            {
            // InternalFPML.g:2570:1: ( '}' )
            // InternalFPML.g:2571:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2581:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2585:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:2586:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:2593:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2597:1: ( ( 'IO' ) )
            // InternalFPML.g:2598:1: ( 'IO' )
            {
            // InternalFPML.g:2598:1: ( 'IO' )
            // InternalFPML.g:2599:2: 'IO'
            {
             before(grammarAccess.getMainFuncAccess().getIOKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFPML.g:2608:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2612:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:2613:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:2620:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2624:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2625:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2625:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2626:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2627:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:2627:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:2635:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2639:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:2640:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalFPML.g:2647:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2651:1: ( ( 'main' ) )
            // InternalFPML.g:2652:1: ( 'main' )
            {
            // InternalFPML.g:2652:1: ( 'main' )
            // InternalFPML.g:2653:2: 'main'
            {
             before(grammarAccess.getMainFuncAccess().getMainKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFPML.g:2662:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2666:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:2667:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:2674:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2678:1: ( ( ':' ) )
            // InternalFPML.g:2679:1: ( ':' )
            {
            // InternalFPML.g:2679:1: ( ':' )
            // InternalFPML.g:2680:2: ':'
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
    // InternalFPML.g:2689:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2693:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:2694:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:2701:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2705:1: ( ( '{' ) )
            // InternalFPML.g:2706:1: ( '{' )
            {
            // InternalFPML.g:2706:1: ( '{' )
            // InternalFPML.g:2707:2: '{'
            {
             before(grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:2716:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2720:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:2721:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:2728:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2732:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:2733:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:2733:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:2734:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:2735:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:2735:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:2743:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2747:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:2748:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:2754:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2758:1: ( ( '}' ) )
            // InternalFPML.g:2759:1: ( '}' )
            {
            // InternalFPML.g:2759:1: ( '}' )
            // InternalFPML.g:2760:2: '}'
            {
             before(grammarAccess.getMainFuncAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2770:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2774:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:2775:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:2782:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2786:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:2787:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:2787:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:2788:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:2789:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:2789:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:2797:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2801:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:2802:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:2808:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 )? ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2812:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 )? ) )
            // InternalFPML.g:2813:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            {
            // InternalFPML.g:2813:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            // InternalFPML.g:2814:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:2815:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:2815:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:2824:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2828:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:2829:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:2836:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2840:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:2841:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:2841:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:2842:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:2843:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:2843:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:2851:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2855:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:2856:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:2862:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2866:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:2867:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:2867:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:2868:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:2869:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:2869:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:2878:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2882:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:2883:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:2890:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2894:1: ( ( () ) )
            // InternalFPML.g:2895:1: ( () )
            {
            // InternalFPML.g:2895:1: ( () )
            // InternalFPML.g:2896:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:2897:2: ()
            // InternalFPML.g:2897:3: 
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
    // InternalFPML.g:2905:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2909:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:2910:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:2916:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2920:1: ( ( 'Undefined' ) )
            // InternalFPML.g:2921:1: ( 'Undefined' )
            {
            // InternalFPML.g:2921:1: ( 'Undefined' )
            // InternalFPML.g:2922:2: 'Undefined'
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getUndefinedKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFPML.g:2932:1: rule__CompositionFunctionBodyPure__Group__0 : rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 ;
    public final void rule__CompositionFunctionBodyPure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2936:1: ( rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 )
            // InternalFPML.g:2937:2: rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFPML.g:2944:1: rule__CompositionFunctionBodyPure__Group__0__Impl : ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2948:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) )
            // InternalFPML.g:2949:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            {
            // InternalFPML.g:2949:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            // InternalFPML.g:2950:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
            // InternalFPML.g:2951:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            // InternalFPML.g:2951:3: rule__CompositionFunctionBodyPure__Group_0__0
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
    // InternalFPML.g:2959:1: rule__CompositionFunctionBodyPure__Group__1 : rule__CompositionFunctionBodyPure__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2963:1: ( rule__CompositionFunctionBodyPure__Group__1__Impl )
            // InternalFPML.g:2964:2: rule__CompositionFunctionBodyPure__Group__1__Impl
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
    // InternalFPML.g:2970:1: rule__CompositionFunctionBodyPure__Group__1__Impl : ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyPure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2974:1: ( ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) )
            // InternalFPML.g:2975:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            {
            // InternalFPML.g:2975:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            // InternalFPML.g:2976:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
            // InternalFPML.g:2977:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFPML.g:2977:3: rule__CompositionFunctionBodyPure__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__CompositionFunctionBodyPure__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalFPML.g:2986:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2990:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:2991:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFPML.g:2998:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3002:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) ) )
            // InternalFPML.g:3003:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) )
            {
            // InternalFPML.g:3003:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) )
            // InternalFPML.g:3004:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_0()); 
            // InternalFPML.g:3005:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 )
            // InternalFPML.g:3005:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:3013:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3017:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 )
            // InternalFPML.g:3018:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3025:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3029:1: ( ( '|>' ) )
            // InternalFPML.g:3030:1: ( '|>' )
            {
            // InternalFPML.g:3030:1: ( '|>' )
            // InternalFPML.g:3031:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFPML.g:3040:1: rule__CompositionFunctionBodyPure__Group_0__2 : rule__CompositionFunctionBodyPure__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3044:1: ( rule__CompositionFunctionBodyPure__Group_0__2__Impl )
            // InternalFPML.g:3045:2: rule__CompositionFunctionBodyPure__Group_0__2__Impl
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
    // InternalFPML.g:3051:1: rule__CompositionFunctionBodyPure__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3055:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3056:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3056:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3057:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3058:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3058:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2
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
    // InternalFPML.g:3067:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3071:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:3072:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3079:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3083:1: ( ( '|>' ) )
            // InternalFPML.g:3084:1: ( '|>' )
            {
            // InternalFPML.g:3084:1: ( '|>' )
            // InternalFPML.g:3085:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFPML.g:3094:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3098:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:3099:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
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
    // InternalFPML.g:3105:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3109:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3110:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3110:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3111:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3112:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3112:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
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
    // InternalFPML.g:3121:1: rule__CompositionFunctionBodyEffect__Group__0 : rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3125:1: ( rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 )
            // InternalFPML.g:3126:2: rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFPML.g:3133:1: rule__CompositionFunctionBodyEffect__Group__0__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3137:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) )
            // InternalFPML.g:3138:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            {
            // InternalFPML.g:3138:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            // InternalFPML.g:3139:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
            // InternalFPML.g:3140:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            // InternalFPML.g:3140:3: rule__CompositionFunctionBodyEffect__Group_0__0
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
    // InternalFPML.g:3148:1: rule__CompositionFunctionBodyEffect__Group__1 : rule__CompositionFunctionBodyEffect__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3152:1: ( rule__CompositionFunctionBodyEffect__Group__1__Impl )
            // InternalFPML.g:3153:2: rule__CompositionFunctionBodyEffect__Group__1__Impl
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
    // InternalFPML.g:3159:1: rule__CompositionFunctionBodyEffect__Group__1__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3163:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) )
            // InternalFPML.g:3164:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            {
            // InternalFPML.g:3164:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            // InternalFPML.g:3165:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
            // InternalFPML.g:3166:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFPML.g:3166:3: rule__CompositionFunctionBodyEffect__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyEffect__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalFPML.g:3175:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3179:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:3180:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFPML.g:3187:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3191:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) )
            // InternalFPML.g:3192:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            {
            // InternalFPML.g:3192:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            // InternalFPML.g:3193:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_0()); 
            // InternalFPML.g:3194:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            // InternalFPML.g:3194:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0
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
    // InternalFPML.g:3202:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3206:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 )
            // InternalFPML.g:3207:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3214:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3218:1: ( ( '>>=' ) )
            // InternalFPML.g:3219:1: ( '>>=' )
            {
            // InternalFPML.g:3219:1: ( '>>=' )
            // InternalFPML.g:3220:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFPML.g:3229:1: rule__CompositionFunctionBodyEffect__Group_0__2 : rule__CompositionFunctionBodyEffect__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3233:1: ( rule__CompositionFunctionBodyEffect__Group_0__2__Impl )
            // InternalFPML.g:3234:2: rule__CompositionFunctionBodyEffect__Group_0__2__Impl
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
    // InternalFPML.g:3240:1: rule__CompositionFunctionBodyEffect__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3244:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3245:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3245:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3246:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3247:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3247:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2
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
    // InternalFPML.g:3256:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3260:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:3261:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3268:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3272:1: ( ( '>>=' ) )
            // InternalFPML.g:3273:1: ( '>>=' )
            {
            // InternalFPML.g:3273:1: ( '>>=' )
            // InternalFPML.g:3274:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFPML.g:3283:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3287:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:3288:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
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
    // InternalFPML.g:3294:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3298:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3299:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3299:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3300:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3301:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3301:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
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
    // InternalFPML.g:3310:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3314:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:3315:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:3322:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3326:1: ( ( 'IO' ) )
            // InternalFPML.g:3327:1: ( 'IO' )
            {
            // InternalFPML.g:3327:1: ( 'IO' )
            // InternalFPML.g:3328:2: 'IO'
            {
             before(grammarAccess.getIOTypeAccess().getIOKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFPML.g:3337:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3341:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:3342:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:3348:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3352:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3353:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3353:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:3354:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3355:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:3355:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:3364:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3368:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:3369:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFPML.g:3376:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3380:1: ( ( () ) )
            // InternalFPML.g:3381:1: ( () )
            {
            // InternalFPML.g:3381:1: ( () )
            // InternalFPML.g:3382:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:3383:2: ()
            // InternalFPML.g:3383:3: 
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
    // InternalFPML.g:3391:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3395:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:3396:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:3402:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3406:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3407:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3407:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:3408:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3409:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:3409:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:3418:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3422:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:3423:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:3430:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3434:1: ( ( () ) )
            // InternalFPML.g:3435:1: ( () )
            {
            // InternalFPML.g:3435:1: ( () )
            // InternalFPML.g:3436:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:3437:2: ()
            // InternalFPML.g:3437:3: 
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
    // InternalFPML.g:3445:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3449:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:3450:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:3456:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3460:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3461:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3461:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:3462:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3463:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:3463:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:3472:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3476:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:3477:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:3484:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3488:1: ( ( () ) )
            // InternalFPML.g:3489:1: ( () )
            {
            // InternalFPML.g:3489:1: ( () )
            // InternalFPML.g:3490:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:3491:2: ()
            // InternalFPML.g:3491:3: 
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
    // InternalFPML.g:3499:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3503:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:3504:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:3510:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3514:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3515:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3515:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:3516:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3517:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:3517:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:3526:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3530:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:3531:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFPML.g:3538:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3542:1: ( ( () ) )
            // InternalFPML.g:3543:1: ( () )
            {
            // InternalFPML.g:3543:1: ( () )
            // InternalFPML.g:3544:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:3545:2: ()
            // InternalFPML.g:3545:3: 
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
    // InternalFPML.g:3553:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3557:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:3558:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3565:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3569:1: ( ( 'ref' ) )
            // InternalFPML.g:3570:1: ( 'ref' )
            {
            // InternalFPML.g:3570:1: ( 'ref' )
            // InternalFPML.g:3571:2: 'ref'
            {
             before(grammarAccess.getDataTypeAccess().getRefKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFPML.g:3580:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3584:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:3585:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:3591:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3595:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:3596:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:3596:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:3597:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:3598:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:3598:3: rule__DataType__TypeAssignment_2
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


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalFPML.g:3607:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3611:1: ( ( rulePureBlock ) )
            // InternalFPML.g:3612:2: ( rulePureBlock )
            {
            // InternalFPML.g:3612:2: ( rulePureBlock )
            // InternalFPML.g:3613:3: rulePureBlock
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
    // InternalFPML.g:3622:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3626:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:3627:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:3627:2: ( ruleEffectFullBlock )
            // InternalFPML.g:3628:3: ruleEffectFullBlock
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
    // InternalFPML.g:3637:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3641:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:3642:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:3642:2: ( rulePureFunctionBlock )
            // InternalFPML.g:3643:3: rulePureFunctionBlock
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
    // InternalFPML.g:3652:1: rule__PureBlock__ElementsAssignment_3 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3656:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:3657:2: ( ruleDataBlock )
            {
            // InternalFPML.g:3657:2: ( ruleDataBlock )
            // InternalFPML.g:3658:3: ruleDataBlock
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
    // InternalFPML.g:3667:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunction ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3671:1: ( ( rulePureFunction ) )
            // InternalFPML.g:3672:2: ( rulePureFunction )
            {
            // InternalFPML.g:3672:2: ( rulePureFunction )
            // InternalFPML.g:3673:3: rulePureFunction
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
    // InternalFPML.g:3682:1: rule__DataBlock__ElementsAssignment_2 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3686:1: ( ( ruleData ) )
            // InternalFPML.g:3687:2: ( ruleData )
            {
            // InternalFPML.g:3687:2: ( ruleData )
            // InternalFPML.g:3688:3: ruleData
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


    // $ANTLR start "rule__EffectFullBlock__FeaturesAssignment_2"
    // InternalFPML.g:3697:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunction ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3701:1: ( ( ruleEffectFullFunction ) )
            // InternalFPML.g:3702:2: ( ruleEffectFullFunction )
            {
            // InternalFPML.g:3702:2: ( ruleEffectFullFunction )
            // InternalFPML.g:3703:3: ruleEffectFullFunction
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
    // InternalFPML.g:3712:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3716:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:3717:2: ( ruleMainFunc )
            {
            // InternalFPML.g:3717:2: ( ruleMainFunc )
            // InternalFPML.g:3718:3: ruleMainFunc
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
    // InternalFPML.g:3727:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3731:1: ( ( RULE_ID ) )
            // InternalFPML.g:3732:2: ( RULE_ID )
            {
            // InternalFPML.g:3732:2: ( RULE_ID )
            // InternalFPML.g:3733:3: RULE_ID
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
    // InternalFPML.g:3742:1: rule__Data__ContentAssignment_2 : ( ruleAdt ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3746:1: ( ( ruleAdt ) )
            // InternalFPML.g:3747:2: ( ruleAdt )
            {
            // InternalFPML.g:3747:2: ( ruleAdt )
            // InternalFPML.g:3748:3: ruleAdt
            {
             before(grammarAccess.getDataAccess().getContentAdtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdt();

            state._fsp--;

             after(grammarAccess.getDataAccess().getContentAdtParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SumType__SumAdtElementsAssignment_1"
    // InternalFPML.g:3757:1: rule__SumType__SumAdtElementsAssignment_1 : ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) ) ;
    public final void rule__SumType__SumAdtElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3761:1: ( ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) ) )
            // InternalFPML.g:3762:2: ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) )
            {
            // InternalFPML.g:3762:2: ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) )
            // InternalFPML.g:3763:3: ( rule__SumType__SumAdtElementsAlternatives_1_0 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_1_0()); 
            // InternalFPML.g:3764:3: ( rule__SumType__SumAdtElementsAlternatives_1_0 )
            // InternalFPML.g:3764:4: rule__SumType__SumAdtElementsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SumType__SumAdtElementsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__SumAdtElementsAssignment_1"


    // $ANTLR start "rule__SumType__SumAdtElementsAssignment_2_1"
    // InternalFPML.g:3772:1: rule__SumType__SumAdtElementsAssignment_2_1 : ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) ) ;
    public final void rule__SumType__SumAdtElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3776:1: ( ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) ) )
            // InternalFPML.g:3777:2: ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) )
            {
            // InternalFPML.g:3777:2: ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) )
            // InternalFPML.g:3778:3: ( rule__SumType__SumAdtElementsAlternatives_2_1_0 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_2_1_0()); 
            // InternalFPML.g:3779:3: ( rule__SumType__SumAdtElementsAlternatives_2_1_0 )
            // InternalFPML.g:3779:4: rule__SumType__SumAdtElementsAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SumType__SumAdtElementsAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__SumAdtElementsAssignment_2_1"


    // $ANTLR start "rule__ProdType__ProdAdtElementsAssignment_1"
    // InternalFPML.g:3787:1: rule__ProdType__ProdAdtElementsAssignment_1 : ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) ) ;
    public final void rule__ProdType__ProdAdtElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3791:1: ( ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) ) )
            // InternalFPML.g:3792:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) )
            {
            // InternalFPML.g:3792:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) )
            // InternalFPML.g:3793:3: ( rule__ProdType__ProdAdtElementsAlternatives_1_0 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_1_0()); 
            // InternalFPML.g:3794:3: ( rule__ProdType__ProdAdtElementsAlternatives_1_0 )
            // InternalFPML.g:3794:4: rule__ProdType__ProdAdtElementsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__ProdAdtElementsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__ProdAdtElementsAssignment_1"


    // $ANTLR start "rule__ProdType__ProdAdtElementsAssignment_2_1"
    // InternalFPML.g:3802:1: rule__ProdType__ProdAdtElementsAssignment_2_1 : ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) ) ;
    public final void rule__ProdType__ProdAdtElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3806:1: ( ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) ) )
            // InternalFPML.g:3807:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) )
            {
            // InternalFPML.g:3807:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) )
            // InternalFPML.g:3808:3: ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_2_1_0()); 
            // InternalFPML.g:3809:3: ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 )
            // InternalFPML.g:3809:4: rule__ProdType__ProdAdtElementsAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__ProdAdtElementsAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__ProdAdtElementsAssignment_2_1"


    // $ANTLR start "rule__PureFunction__ReturnTypeAssignment_1"
    // InternalFPML.g:3817:1: rule__PureFunction__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3821:1: ( ( ruleValueType ) )
            // InternalFPML.g:3822:2: ( ruleValueType )
            {
            // InternalFPML.g:3822:2: ( ruleValueType )
            // InternalFPML.g:3823:3: ruleValueType
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
    // InternalFPML.g:3832:1: rule__PureFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3836:1: ( ( RULE_ID ) )
            // InternalFPML.g:3837:2: ( RULE_ID )
            {
            // InternalFPML.g:3837:2: ( RULE_ID )
            // InternalFPML.g:3838:3: RULE_ID
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
    // InternalFPML.g:3847:1: rule__PureFunction__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3851:1: ( ( ruleArgument ) )
            // InternalFPML.g:3852:2: ( ruleArgument )
            {
            // InternalFPML.g:3852:2: ( ruleArgument )
            // InternalFPML.g:3853:3: ruleArgument
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
    // InternalFPML.g:3862:1: rule__PureFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3866:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:3867:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:3867:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:3868:3: ruleFunctionBodyPure
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
    // InternalFPML.g:3877:1: rule__EffectFullFunction__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3881:1: ( ( ruleIOType ) )
            // InternalFPML.g:3882:2: ( ruleIOType )
            {
            // InternalFPML.g:3882:2: ( ruleIOType )
            // InternalFPML.g:3883:3: ruleIOType
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
    // InternalFPML.g:3892:1: rule__EffectFullFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3896:1: ( ( RULE_ID ) )
            // InternalFPML.g:3897:2: ( RULE_ID )
            {
            // InternalFPML.g:3897:2: ( RULE_ID )
            // InternalFPML.g:3898:3: RULE_ID
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
    // InternalFPML.g:3907:1: rule__EffectFullFunction__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3911:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:3912:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:3912:2: ( ruleEffectFullArgument )
            // InternalFPML.g:3913:3: ruleEffectFullArgument
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
    // InternalFPML.g:3922:1: rule__EffectFullFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3926:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:3927:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:3927:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:3928:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:3937:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3941:1: ( ( ruleUnitType ) )
            // InternalFPML.g:3942:2: ( ruleUnitType )
            {
            // InternalFPML.g:3942:2: ( ruleUnitType )
            // InternalFPML.g:3943:3: ruleUnitType
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
    // InternalFPML.g:3952:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3956:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:3957:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:3957:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:3958:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:3967:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3971:1: ( ( ruleType ) )
            // InternalFPML.g:3972:2: ( ruleType )
            {
            // InternalFPML.g:3972:2: ( ruleType )
            // InternalFPML.g:3973:3: ruleType
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
    // InternalFPML.g:3982:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3986:1: ( ( RULE_ID ) )
            // InternalFPML.g:3987:2: ( RULE_ID )
            {
            // InternalFPML.g:3987:2: ( RULE_ID )
            // InternalFPML.g:3988:3: RULE_ID
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
    // InternalFPML.g:3997:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4001:1: ( ( ruleValueType ) )
            // InternalFPML.g:4002:2: ( ruleValueType )
            {
            // InternalFPML.g:4002:2: ( ruleValueType )
            // InternalFPML.g:4003:3: ruleValueType
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
    // InternalFPML.g:4012:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4016:1: ( ( RULE_ID ) )
            // InternalFPML.g:4017:2: ( RULE_ID )
            {
            // InternalFPML.g:4017:2: ( RULE_ID )
            // InternalFPML.g:4018:3: RULE_ID
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


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0"
    // InternalFPML.g:4027:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4031:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4032:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4032:2: ( ( RULE_ID ) )
            // InternalFPML.g:4033:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4034:3: ( RULE_ID )
            // InternalFPML.g:4035:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2"
    // InternalFPML.g:4046:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4050:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4051:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4051:2: ( ( RULE_ID ) )
            // InternalFPML.g:4052:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0()); 
            // InternalFPML.g:4053:3: ( RULE_ID )
            // InternalFPML.g:4054:4: RULE_ID
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
    // InternalFPML.g:4065:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4069:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4070:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4070:2: ( ( RULE_ID ) )
            // InternalFPML.g:4071:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0()); 
            // InternalFPML.g:4072:3: ( RULE_ID )
            // InternalFPML.g:4073:4: RULE_ID
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
    // InternalFPML.g:4084:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4088:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4089:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4089:2: ( ( RULE_ID ) )
            // InternalFPML.g:4090:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4091:3: ( RULE_ID )
            // InternalFPML.g:4092:4: RULE_ID
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
    // InternalFPML.g:4103:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4107:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4108:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4108:2: ( ( RULE_ID ) )
            // InternalFPML.g:4109:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0()); 
            // InternalFPML.g:4110:3: ( RULE_ID )
            // InternalFPML.g:4111:4: RULE_ID
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
    // InternalFPML.g:4122:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4126:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4127:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4127:2: ( ( RULE_ID ) )
            // InternalFPML.g:4128:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0()); 
            // InternalFPML.g:4129:3: ( RULE_ID )
            // InternalFPML.g:4130:4: RULE_ID
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
    // InternalFPML.g:4141:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4145:1: ( ( ruleType ) )
            // InternalFPML.g:4146:2: ( ruleType )
            {
            // InternalFPML.g:4146:2: ( ruleType )
            // InternalFPML.g:4147:3: ruleType
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
    // InternalFPML.g:4156:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4160:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:4161:2: ( ( 'int' ) )
            {
            // InternalFPML.g:4161:2: ( ( 'int' ) )
            // InternalFPML.g:4162:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:4163:3: ( 'int' )
            // InternalFPML.g:4164:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFPML.g:4175:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4179:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:4180:2: ( ( 'String' ) )
            {
            // InternalFPML.g:4180:2: ( ( 'String' ) )
            // InternalFPML.g:4181:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:4182:3: ( 'String' )
            // InternalFPML.g:4183:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFPML.g:4194:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4198:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:4199:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:4199:2: ( ( 'Unit' ) )
            // InternalFPML.g:4200:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:4201:3: ( 'Unit' )
            // InternalFPML.g:4202:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFPML.g:4213:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4217:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4218:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4218:2: ( ( RULE_ID ) )
            // InternalFPML.g:4219:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:4220:3: ( RULE_ID )
            // InternalFPML.g:4221:4: RULE_ID
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\2\25\1\6\3\25\2\uffff\1\25";
    static final String dfa_3s = "\1\37\2\uffff\1\37\2\26\1\6\3\26\2\uffff\1\26";
    static final String dfa_4s = "\1\uffff\1\1\1\2\7\uffff\1\3\1\4\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\5\uffff\1\2\7\uffff\1\3\11\uffff\3\1",
            "",
            "",
            "\1\7\1\10\5\uffff\1\11\21\uffff\1\6\1\4\1\5",
            "\1\12\1\13",
            "\1\12\1\13",
            "\1\14",
            "\1\12\1\13",
            "\1\12\1\13",
            "\1\12\1\13",
            "",
            "",
            "\1\12\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "827:1: rule__Adt__Alternatives : ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0080830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E0000830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});

}