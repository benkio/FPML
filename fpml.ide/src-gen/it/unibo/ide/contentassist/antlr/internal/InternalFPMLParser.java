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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_EMPTY_FUNCTION_BODY", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Effects'", "':'", "'('", "')'", "'+'", "'*'", "'def'", "'IO'", "'main'", "'|>'", "'>>='", "'ref'", "'Int'", "'String'", "'Unit'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_EMPTY_FUNCTION_BODY=6;
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


    // $ANTLR start "entryRuleCompositionFunctionBodyPure"
    // InternalFPML.g:478:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:480:1: ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:487:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__CompositionFunctionBodyPure__Group__0 ) ) )
            // InternalFPML.g:492:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            {
            // InternalFPML.g:492:2: ( ( rule__CompositionFunctionBodyPure__Group__0 ) )
            // InternalFPML.g:493:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup()); 
            // InternalFPML.g:494:3: ( rule__CompositionFunctionBodyPure__Group__0 )
            // InternalFPML.g:494:4: rule__CompositionFunctionBodyPure__Group__0
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
    // InternalFPML.g:503:1: entryRuleCompositionFunctionBodyEffect : ruleCompositionFunctionBodyEffect EOF ;
    public final void entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:505:1: ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:512:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__CompositionFunctionBodyEffect__Group__0 ) ) )
            // InternalFPML.g:517:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            {
            // InternalFPML.g:517:2: ( ( rule__CompositionFunctionBodyEffect__Group__0 ) )
            // InternalFPML.g:518:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup()); 
            // InternalFPML.g:519:3: ( rule__CompositionFunctionBodyEffect__Group__0 )
            // InternalFPML.g:519:4: rule__CompositionFunctionBodyEffect__Group__0
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
    // InternalFPML.g:528:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( ruleIOType EOF )
            // InternalFPML.g:530:1: ruleIOType EOF
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
    // InternalFPML.g:537:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:542:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:542:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:543:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:544:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:544:4: rule__IOType__Group__0
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
    // InternalFPML.g:553:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleValueType EOF )
            // InternalFPML.g:555:1: ruleValueType EOF
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
    // InternalFPML.g:562:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:567:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:567:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:568:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:569:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:569:4: rule__ValueType__Alternatives
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
    // InternalFPML.g:578:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:579:1: ( ruleType EOF )
            // InternalFPML.g:580:1: ruleType EOF
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
    // InternalFPML.g:587:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:592:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:592:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:593:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:594:3: ( rule__Type__Alternatives )
            // InternalFPML.g:594:4: rule__Type__Alternatives
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
    // InternalFPML.g:603:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleIntegerType EOF )
            // InternalFPML.g:605:1: ruleIntegerType EOF
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
    // InternalFPML.g:612:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:617:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:617:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:618:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:619:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:619:4: rule__IntegerType__Group__0
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
    // InternalFPML.g:628:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleStringType EOF )
            // InternalFPML.g:630:1: ruleStringType EOF
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
    // InternalFPML.g:637:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:642:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:642:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:643:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:644:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:644:4: rule__StringType__Group__0
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
    // InternalFPML.g:653:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( ruleUnitType EOF )
            // InternalFPML.g:655:1: ruleUnitType EOF
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
    // InternalFPML.g:662:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:667:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:667:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:668:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:669:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:669:4: rule__UnitType__Group__0
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
    // InternalFPML.g:678:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleDataType EOF )
            // InternalFPML.g:680:1: ruleDataType EOF
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
    // InternalFPML.g:687:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:692:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:692:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:693:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:694:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:694:4: rule__DataType__Group__0
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
    // InternalFPML.g:703:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( ruleValue EOF )
            // InternalFPML.g:705:1: ruleValue EOF
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
    // InternalFPML.g:712:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalFPML.g:717:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalFPML.g:717:2: ( ( rule__Value__Alternatives ) )
            // InternalFPML.g:718:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalFPML.g:719:3: ( rule__Value__Alternatives )
            // InternalFPML.g:719:4: rule__Value__Alternatives
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
    // InternalFPML.g:728:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleIntValue EOF )
            // InternalFPML.g:730:1: ruleIntValue EOF
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
    // InternalFPML.g:737:1: ruleIntValue : ( RULE_INT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( RULE_INT ) )
            // InternalFPML.g:742:2: ( RULE_INT )
            {
            // InternalFPML.g:742:2: ( RULE_INT )
            // InternalFPML.g:743:3: RULE_INT
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
    // InternalFPML.g:753:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleStringValue EOF )
            // InternalFPML.g:755:1: ruleStringValue EOF
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
    // InternalFPML.g:762:1: ruleStringValue : ( RULE_STRING ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( RULE_STRING ) )
            // InternalFPML.g:767:2: ( RULE_STRING )
            {
            // InternalFPML.g:767:2: ( RULE_STRING )
            // InternalFPML.g:768:3: RULE_STRING
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
    // InternalFPML.g:778:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleUnitValue EOF )
            // InternalFPML.g:780:1: ruleUnitValue EOF
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
    // InternalFPML.g:787:1: ruleUnitValue : ( '()' ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( '()' ) )
            // InternalFPML.g:792:2: ( '()' )
            {
            // InternalFPML.g:792:2: ( '()' )
            // InternalFPML.g:793:3: '()'
            {
             before(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword()); 
            match(input,12,FOLLOW_2); 
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
    // InternalFPML.g:802:1: rule__Adt__Alternatives : ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) );
    public final void rule__Adt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:806:1: ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalFPML.g:807:2: ( ruleArgument )
                    {
                    // InternalFPML.g:807:2: ( ruleArgument )
                    // InternalFPML.g:808:3: ruleArgument
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
                    // InternalFPML.g:813:2: ( ruleValue )
                    {
                    // InternalFPML.g:813:2: ( ruleValue )
                    // InternalFPML.g:814:3: ruleValue
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
                    // InternalFPML.g:819:2: ( ruleSumType )
                    {
                    // InternalFPML.g:819:2: ( ruleSumType )
                    // InternalFPML.g:820:3: ruleSumType
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
                    // InternalFPML.g:825:2: ( ruleProdType )
                    {
                    // InternalFPML.g:825:2: ( ruleProdType )
                    // InternalFPML.g:826:3: ruleProdType
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
    // InternalFPML.g:835:1: rule__SumType__SumAdtElementsAlternatives_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__SumType__SumAdtElementsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:839:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=29 && LA2_0<=31)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFPML.g:840:2: ( ruleValueType )
                    {
                    // InternalFPML.g:840:2: ( ruleValueType )
                    // InternalFPML.g:841:3: ruleValueType
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
                    // InternalFPML.g:846:2: ( ruleValue )
                    {
                    // InternalFPML.g:846:2: ( ruleValue )
                    // InternalFPML.g:847:3: ruleValue
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
    // InternalFPML.g:856:1: rule__SumType__SumAdtElementsAlternatives_2_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__SumType__SumAdtElementsAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:860:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=31)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFPML.g:861:2: ( ruleValueType )
                    {
                    // InternalFPML.g:861:2: ( ruleValueType )
                    // InternalFPML.g:862:3: ruleValueType
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
                    // InternalFPML.g:867:2: ( ruleValue )
                    {
                    // InternalFPML.g:867:2: ( ruleValue )
                    // InternalFPML.g:868:3: ruleValue
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
    // InternalFPML.g:877:1: rule__ProdType__ProdAdtElementsAlternatives_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__ProdType__ProdAdtElementsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:881:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:882:2: ( ruleValueType )
                    {
                    // InternalFPML.g:882:2: ( ruleValueType )
                    // InternalFPML.g:883:3: ruleValueType
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
                    // InternalFPML.g:888:2: ( ruleValue )
                    {
                    // InternalFPML.g:888:2: ( ruleValue )
                    // InternalFPML.g:889:3: ruleValue
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
    // InternalFPML.g:898:1: rule__ProdType__ProdAdtElementsAlternatives_2_1_0 : ( ( ruleValueType ) | ( ruleValue ) );
    public final void rule__ProdType__ProdAdtElementsAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:902:1: ( ( ruleValueType ) | ( ruleValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=29 && LA5_0<=31)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:903:2: ( ruleValueType )
                    {
                    // InternalFPML.g:903:2: ( ruleValueType )
                    // InternalFPML.g:904:3: ruleValueType
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
                    // InternalFPML.g:909:2: ( ruleValue )
                    {
                    // InternalFPML.g:909:2: ( ruleValue )
                    // InternalFPML.g:910:3: ruleValue
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
    // InternalFPML.g:919:1: rule__Function__Alternatives : ( ( rulePureFunction ) | ( ruleEffectFullFunction ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:923:1: ( ( rulePureFunction ) | ( ruleEffectFullFunction ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=29 && LA6_1<=31)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==25) ) {
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
                    // InternalFPML.g:924:2: ( rulePureFunction )
                    {
                    // InternalFPML.g:924:2: ( rulePureFunction )
                    // InternalFPML.g:925:3: rulePureFunction
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
                    // InternalFPML.g:930:2: ( ruleEffectFullFunction )
                    {
                    // InternalFPML.g:930:2: ( ruleEffectFullFunction )
                    // InternalFPML.g:931:3: ruleEffectFullFunction
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
    // InternalFPML.g:940:1: rule__FunctionBodyPure__Alternatives : ( ( ( rule__FunctionBodyPure__Group_0__0 ) ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:944:1: ( ( ( rule__FunctionBodyPure__Group_0__0 ) ) | ( ruleCompositionFunctionBodyPure ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_EMPTY_FUNCTION_BODY) ) {
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
                    // InternalFPML.g:945:2: ( ( rule__FunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:945:2: ( ( rule__FunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:946:3: ( rule__FunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:947:3: ( rule__FunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:947:4: rule__FunctionBodyPure__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionBodyPure__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionBodyPureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:951:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:951:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:952:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:961:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ( rule__FunctionBodyEffectFull__Group_0__0 ) ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:965:1: ( ( ( rule__FunctionBodyEffectFull__Group_0__0 ) ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EMPTY_FUNCTION_BODY) ) {
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
                    // InternalFPML.g:966:2: ( ( rule__FunctionBodyEffectFull__Group_0__0 ) )
                    {
                    // InternalFPML.g:966:2: ( ( rule__FunctionBodyEffectFull__Group_0__0 ) )
                    // InternalFPML.g:967:3: ( rule__FunctionBodyEffectFull__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionBodyEffectFullAccess().getGroup_0()); 
                    // InternalFPML.g:968:3: ( rule__FunctionBodyEffectFull__Group_0__0 )
                    // InternalFPML.g:968:4: rule__FunctionBodyEffectFull__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionBodyEffectFull__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionBodyEffectFullAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:972:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:972:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:973:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:982:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:986:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) )
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
                    // InternalFPML.g:987:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:987:2: ( ruleIntegerType )
                    // InternalFPML.g:988:3: ruleIntegerType
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
                    // InternalFPML.g:993:2: ( ruleStringType )
                    {
                    // InternalFPML.g:993:2: ( ruleStringType )
                    // InternalFPML.g:994:3: ruleStringType
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
                    // InternalFPML.g:999:2: ( ruleDataType )
                    {
                    // InternalFPML.g:999:2: ( ruleDataType )
                    // InternalFPML.g:1000:3: ruleDataType
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
    // InternalFPML.g:1009:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1013:1: ( ( ruleValueType ) | ( ruleUnitType ) )
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
                    // InternalFPML.g:1014:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1014:2: ( ruleValueType )
                    // InternalFPML.g:1015:3: ruleValueType
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
                    // InternalFPML.g:1020:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1020:2: ( ruleUnitType )
                    // InternalFPML.g:1021:3: ruleUnitType
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
    // InternalFPML.g:1030:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1034:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) )
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
            case 12:
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
                    // InternalFPML.g:1035:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1035:2: ( ruleIntValue )
                    // InternalFPML.g:1036:3: ruleIntValue
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
                    // InternalFPML.g:1041:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1041:2: ( ruleStringValue )
                    // InternalFPML.g:1042:3: ruleStringValue
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
                    // InternalFPML.g:1047:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:1047:2: ( ruleUnitValue )
                    // InternalFPML.g:1048:3: ruleUnitValue
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
    // InternalFPML.g:1057:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1061:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1062:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:1069:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1073:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1074:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1074:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1075:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1076:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1076:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:1084:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1088:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1089:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:1095:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1099:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:1100:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:1100:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:1101:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:1102:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:1102:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:1111:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1115:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:1116:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:1123:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1127:1: ( ( 'Pure' ) )
            // InternalFPML.g:1128:1: ( 'Pure' )
            {
            // InternalFPML.g:1128:1: ( 'Pure' )
            // InternalFPML.g:1129:2: 'Pure'
            {
             before(grammarAccess.getPureBlockAccess().getPureKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFPML.g:1138:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1142:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:1143:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:1150:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1154:1: ( ( '{' ) )
            // InternalFPML.g:1155:1: ( '{' )
            {
            // InternalFPML.g:1155:1: ( '{' )
            // InternalFPML.g:1156:2: '{'
            {
             before(grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:1165:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1169:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:1170:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:1177:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1181:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:1182:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:1182:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:1183:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1184:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:1184:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:1192:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1196:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:1197:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:1204:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1208:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:1209:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:1209:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:1210:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:1211:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:1211:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:1219:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1223:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:1224:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:1230:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1234:1: ( ( '}' ) )
            // InternalFPML.g:1235:1: ( '}' )
            {
            // InternalFPML.g:1235:1: ( '}' )
            // InternalFPML.g:1236:2: '}'
            {
             before(grammarAccess.getPureBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:1246:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1250:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:1251:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFPML.g:1258:1: rule__PureFunctionBlock__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1262:1: ( ( () ) )
            // InternalFPML.g:1263:1: ( () )
            {
            // InternalFPML.g:1263:1: ( () )
            // InternalFPML.g:1264:2: ()
            {
             before(grammarAccess.getPureFunctionBlockAccess().getPureFunctionBlockAction_0()); 
            // InternalFPML.g:1265:2: ()
            // InternalFPML.g:1265:3: 
            {
            }

             after(grammarAccess.getPureFunctionBlockAccess().getPureFunctionBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__0__Impl"


    // $ANTLR start "rule__PureFunctionBlock__Group__1"
    // InternalFPML.g:1273:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1277:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:1278:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFPML.g:1285:1: rule__PureFunctionBlock__Group__1__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1289:1: ( ( 'Functions' ) )
            // InternalFPML.g:1290:1: ( 'Functions' )
            {
            // InternalFPML.g:1290:1: ( 'Functions' )
            // InternalFPML.g:1291:2: 'Functions'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_1()); 

            }


            }

        }
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
    // InternalFPML.g:1300:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1304:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:1305:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:1312:1: rule__PureFunctionBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1316:1: ( ( '{' ) )
            // InternalFPML.g:1317:1: ( '{' )
            {
            // InternalFPML.g:1317:1: ( '{' )
            // InternalFPML.g:1318:2: '{'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalFPML.g:1327:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl rule__PureFunctionBlock__Group__4 ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1331:1: ( rule__PureFunctionBlock__Group__3__Impl rule__PureFunctionBlock__Group__4 )
            // InternalFPML.g:1332:2: rule__PureFunctionBlock__Group__3__Impl rule__PureFunctionBlock__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PureFunctionBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__4();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:1339:1: rule__PureFunctionBlock__Group__3__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_3 )* ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1343:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_3 )* ) )
            // InternalFPML.g:1344:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_3 )* )
            {
            // InternalFPML.g:1344:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_3 )* )
            // InternalFPML.g:1345:2: ( rule__PureFunctionBlock__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_3()); 
            // InternalFPML.g:1346:2: ( rule__PureFunctionBlock__FeaturesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFPML.g:1346:3: rule__PureFunctionBlock__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__PureFunctionBlock__Group__4"
    // InternalFPML.g:1354:1: rule__PureFunctionBlock__Group__4 : rule__PureFunctionBlock__Group__4__Impl ;
    public final void rule__PureFunctionBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1358:1: ( rule__PureFunctionBlock__Group__4__Impl )
            // InternalFPML.g:1359:2: rule__PureFunctionBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__4"


    // $ANTLR start "rule__PureFunctionBlock__Group__4__Impl"
    // InternalFPML.g:1365:1: rule__PureFunctionBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1369:1: ( ( '}' ) )
            // InternalFPML.g:1370:1: ( '}' )
            {
            // InternalFPML.g:1370:1: ( '}' )
            // InternalFPML.g:1371:2: '}'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__4__Impl"


    // $ANTLR start "rule__DataBlock__Group__0"
    // InternalFPML.g:1381:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1385:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:1386:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFPML.g:1393:1: rule__DataBlock__Group__0__Impl : ( () ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1397:1: ( ( () ) )
            // InternalFPML.g:1398:1: ( () )
            {
            // InternalFPML.g:1398:1: ( () )
            // InternalFPML.g:1399:2: ()
            {
             before(grammarAccess.getDataBlockAccess().getDataBlockAction_0()); 
            // InternalFPML.g:1400:2: ()
            // InternalFPML.g:1400:3: 
            {
            }

             after(grammarAccess.getDataBlockAccess().getDataBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__0__Impl"


    // $ANTLR start "rule__DataBlock__Group__1"
    // InternalFPML.g:1408:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1412:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:1413:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFPML.g:1420:1: rule__DataBlock__Group__1__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1424:1: ( ( 'Data' ) )
            // InternalFPML.g:1425:1: ( 'Data' )
            {
            // InternalFPML.g:1425:1: ( 'Data' )
            // InternalFPML.g:1426:2: 'Data'
            {
             before(grammarAccess.getDataBlockAccess().getDataKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getDataKeyword_1()); 

            }


            }

        }
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
    // InternalFPML.g:1435:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1439:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:1440:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
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
    // InternalFPML.g:1447:1: rule__DataBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1451:1: ( ( '{' ) )
            // InternalFPML.g:1452:1: ( '{' )
            {
            // InternalFPML.g:1452:1: ( '{' )
            // InternalFPML.g:1453:2: '{'
            {
             before(grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalFPML.g:1462:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1466:1: ( rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 )
            // InternalFPML.g:1467:2: rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalFPML.g:1474:1: rule__DataBlock__Group__3__Impl : ( ( rule__DataBlock__ElementsAssignment_3 )* ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1478:1: ( ( ( rule__DataBlock__ElementsAssignment_3 )* ) )
            // InternalFPML.g:1479:1: ( ( rule__DataBlock__ElementsAssignment_3 )* )
            {
            // InternalFPML.g:1479:1: ( ( rule__DataBlock__ElementsAssignment_3 )* )
            // InternalFPML.g:1480:2: ( rule__DataBlock__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:1481:2: ( rule__DataBlock__ElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFPML.g:1481:3: rule__DataBlock__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataBlockAccess().getElementsAssignment_3()); 

            }


            }

        }
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
    // InternalFPML.g:1489:1: rule__DataBlock__Group__4 : rule__DataBlock__Group__4__Impl ;
    public final void rule__DataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1493:1: ( rule__DataBlock__Group__4__Impl )
            // InternalFPML.g:1494:2: rule__DataBlock__Group__4__Impl
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
    // InternalFPML.g:1500:1: rule__DataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1504:1: ( ( '}' ) )
            // InternalFPML.g:1505:1: ( '}' )
            {
            // InternalFPML.g:1505:1: ( '}' )
            // InternalFPML.g:1506:2: '}'
            {
             before(grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__EffectFullBlock__Group__0"
    // InternalFPML.g:1516:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1520:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:1521:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:1528:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1532:1: ( ( 'Effects' ) )
            // InternalFPML.g:1533:1: ( 'Effects' )
            {
            // InternalFPML.g:1533:1: ( 'Effects' )
            // InternalFPML.g:1534:2: 'Effects'
            {
             before(grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFPML.g:1543:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1547:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:1548:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
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
    // InternalFPML.g:1555:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1559:1: ( ( '{' ) )
            // InternalFPML.g:1560:1: ( '{' )
            {
            // InternalFPML.g:1560:1: ( '{' )
            // InternalFPML.g:1561:2: '{'
            {
             before(grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:1570:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1574:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:1575:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
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
    // InternalFPML.g:1582:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1586:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:1587:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:1587:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:1588:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:1589:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFPML.g:1589:3: rule__EffectFullBlock__FeaturesAssignment_2
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
    // InternalFPML.g:1597:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1601:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:1602:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:1609:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1613:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:1614:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:1614:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:1615:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:1616:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:1616:3: rule__EffectFullBlock__MainAssignment_3
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
    // InternalFPML.g:1624:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1628:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:1629:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:1635:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1639:1: ( ( '}' ) )
            // InternalFPML.g:1640:1: ( '}' )
            {
            // InternalFPML.g:1640:1: ( '}' )
            // InternalFPML.g:1641:2: '}'
            {
             before(grammarAccess.getEffectFullBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:1651:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1655:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:1656:2: rule__Data__Group__0__Impl rule__Data__Group__1
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
    // InternalFPML.g:1663:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1667:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:1668:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:1668:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:1669:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:1670:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:1670:3: rule__Data__NameAssignment_0
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
    // InternalFPML.g:1678:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1682:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:1683:2: rule__Data__Group__1__Impl rule__Data__Group__2
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
    // InternalFPML.g:1690:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1694:1: ( ( ':' ) )
            // InternalFPML.g:1695:1: ( ':' )
            {
            // InternalFPML.g:1695:1: ( ':' )
            // InternalFPML.g:1696:2: ':'
            {
             before(grammarAccess.getDataAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:1705:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1709:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:1710:2: rule__Data__Group__2__Impl
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
    // InternalFPML.g:1716:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1720:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:1721:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:1721:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:1722:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:1723:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:1723:3: rule__Data__ContentAssignment_2
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
    // InternalFPML.g:1732:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1736:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:1737:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
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
    // InternalFPML.g:1744:1: rule__SumType__Group__0__Impl : ( '(' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1748:1: ( ( '(' ) )
            // InternalFPML.g:1749:1: ( '(' )
            {
            // InternalFPML.g:1749:1: ( '(' )
            // InternalFPML.g:1750:2: '('
            {
             before(grammarAccess.getSumTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:1759:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl rule__SumType__Group__2 ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1763:1: ( rule__SumType__Group__1__Impl rule__SumType__Group__2 )
            // InternalFPML.g:1764:2: rule__SumType__Group__1__Impl rule__SumType__Group__2
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
    // InternalFPML.g:1771:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__SumAdtElementsAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1775:1: ( ( ( rule__SumType__SumAdtElementsAssignment_1 ) ) )
            // InternalFPML.g:1776:1: ( ( rule__SumType__SumAdtElementsAssignment_1 ) )
            {
            // InternalFPML.g:1776:1: ( ( rule__SumType__SumAdtElementsAssignment_1 ) )
            // InternalFPML.g:1777:2: ( rule__SumType__SumAdtElementsAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_1()); 
            // InternalFPML.g:1778:2: ( rule__SumType__SumAdtElementsAssignment_1 )
            // InternalFPML.g:1778:3: rule__SumType__SumAdtElementsAssignment_1
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
    // InternalFPML.g:1786:1: rule__SumType__Group__2 : rule__SumType__Group__2__Impl rule__SumType__Group__3 ;
    public final void rule__SumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1790:1: ( rule__SumType__Group__2__Impl rule__SumType__Group__3 )
            // InternalFPML.g:1791:2: rule__SumType__Group__2__Impl rule__SumType__Group__3
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
    // InternalFPML.g:1798:1: rule__SumType__Group__2__Impl : ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) ) ;
    public final void rule__SumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1802:1: ( ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) ) )
            // InternalFPML.g:1803:1: ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) )
            {
            // InternalFPML.g:1803:1: ( ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* ) )
            // InternalFPML.g:1804:2: ( ( rule__SumType__Group_2__0 ) ) ( ( rule__SumType__Group_2__0 )* )
            {
            // InternalFPML.g:1804:2: ( ( rule__SumType__Group_2__0 ) )
            // InternalFPML.g:1805:3: ( rule__SumType__Group_2__0 )
            {
             before(grammarAccess.getSumTypeAccess().getGroup_2()); 
            // InternalFPML.g:1806:3: ( rule__SumType__Group_2__0 )
            // InternalFPML.g:1806:4: rule__SumType__Group_2__0
            {
            pushFollow(FOLLOW_18);
            rule__SumType__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getGroup_2()); 

            }

            // InternalFPML.g:1809:2: ( ( rule__SumType__Group_2__0 )* )
            // InternalFPML.g:1810:3: ( rule__SumType__Group_2__0 )*
            {
             before(grammarAccess.getSumTypeAccess().getGroup_2()); 
            // InternalFPML.g:1811:3: ( rule__SumType__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFPML.g:1811:4: rule__SumType__Group_2__0
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
    // InternalFPML.g:1820:1: rule__SumType__Group__3 : rule__SumType__Group__3__Impl ;
    public final void rule__SumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1824:1: ( rule__SumType__Group__3__Impl )
            // InternalFPML.g:1825:2: rule__SumType__Group__3__Impl
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
    // InternalFPML.g:1831:1: rule__SumType__Group__3__Impl : ( ')' ) ;
    public final void rule__SumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1835:1: ( ( ')' ) )
            // InternalFPML.g:1836:1: ( ')' )
            {
            // InternalFPML.g:1836:1: ( ')' )
            // InternalFPML.g:1837:2: ')'
            {
             before(grammarAccess.getSumTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFPML.g:1847:1: rule__SumType__Group_2__0 : rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1 ;
    public final void rule__SumType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1851:1: ( rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1 )
            // InternalFPML.g:1852:2: rule__SumType__Group_2__0__Impl rule__SumType__Group_2__1
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
    // InternalFPML.g:1859:1: rule__SumType__Group_2__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1863:1: ( ( '+' ) )
            // InternalFPML.g:1864:1: ( '+' )
            {
            // InternalFPML.g:1864:1: ( '+' )
            // InternalFPML.g:1865:2: '+'
            {
             before(grammarAccess.getSumTypeAccess().getPlusSignKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFPML.g:1874:1: rule__SumType__Group_2__1 : rule__SumType__Group_2__1__Impl ;
    public final void rule__SumType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1878:1: ( rule__SumType__Group_2__1__Impl )
            // InternalFPML.g:1879:2: rule__SumType__Group_2__1__Impl
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
    // InternalFPML.g:1885:1: rule__SumType__Group_2__1__Impl : ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) ) ;
    public final void rule__SumType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1889:1: ( ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) ) )
            // InternalFPML.g:1890:1: ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) )
            {
            // InternalFPML.g:1890:1: ( ( rule__SumType__SumAdtElementsAssignment_2_1 ) )
            // InternalFPML.g:1891:2: ( rule__SumType__SumAdtElementsAssignment_2_1 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAssignment_2_1()); 
            // InternalFPML.g:1892:2: ( rule__SumType__SumAdtElementsAssignment_2_1 )
            // InternalFPML.g:1892:3: rule__SumType__SumAdtElementsAssignment_2_1
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
    // InternalFPML.g:1901:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1905:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:1906:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
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
    // InternalFPML.g:1913:1: rule__ProdType__Group__0__Impl : ( '(' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1917:1: ( ( '(' ) )
            // InternalFPML.g:1918:1: ( '(' )
            {
            // InternalFPML.g:1918:1: ( '(' )
            // InternalFPML.g:1919:2: '('
            {
             before(grammarAccess.getProdTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:1928:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl rule__ProdType__Group__2 ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1932:1: ( rule__ProdType__Group__1__Impl rule__ProdType__Group__2 )
            // InternalFPML.g:1933:2: rule__ProdType__Group__1__Impl rule__ProdType__Group__2
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
    // InternalFPML.g:1940:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1944:1: ( ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) ) )
            // InternalFPML.g:1945:1: ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) )
            {
            // InternalFPML.g:1945:1: ( ( rule__ProdType__ProdAdtElementsAssignment_1 ) )
            // InternalFPML.g:1946:2: ( rule__ProdType__ProdAdtElementsAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_1()); 
            // InternalFPML.g:1947:2: ( rule__ProdType__ProdAdtElementsAssignment_1 )
            // InternalFPML.g:1947:3: rule__ProdType__ProdAdtElementsAssignment_1
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
    // InternalFPML.g:1955:1: rule__ProdType__Group__2 : rule__ProdType__Group__2__Impl rule__ProdType__Group__3 ;
    public final void rule__ProdType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1959:1: ( rule__ProdType__Group__2__Impl rule__ProdType__Group__3 )
            // InternalFPML.g:1960:2: rule__ProdType__Group__2__Impl rule__ProdType__Group__3
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
    // InternalFPML.g:1967:1: rule__ProdType__Group__2__Impl : ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) ) ;
    public final void rule__ProdType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1971:1: ( ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) ) )
            // InternalFPML.g:1972:1: ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) )
            {
            // InternalFPML.g:1972:1: ( ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* ) )
            // InternalFPML.g:1973:2: ( ( rule__ProdType__Group_2__0 ) ) ( ( rule__ProdType__Group_2__0 )* )
            {
            // InternalFPML.g:1973:2: ( ( rule__ProdType__Group_2__0 ) )
            // InternalFPML.g:1974:3: ( rule__ProdType__Group_2__0 )
            {
             before(grammarAccess.getProdTypeAccess().getGroup_2()); 
            // InternalFPML.g:1975:3: ( rule__ProdType__Group_2__0 )
            // InternalFPML.g:1975:4: rule__ProdType__Group_2__0
            {
            pushFollow(FOLLOW_20);
            rule__ProdType__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getGroup_2()); 

            }

            // InternalFPML.g:1978:2: ( ( rule__ProdType__Group_2__0 )* )
            // InternalFPML.g:1979:3: ( rule__ProdType__Group_2__0 )*
            {
             before(grammarAccess.getProdTypeAccess().getGroup_2()); 
            // InternalFPML.g:1980:3: ( rule__ProdType__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFPML.g:1980:4: rule__ProdType__Group_2__0
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
    // InternalFPML.g:1989:1: rule__ProdType__Group__3 : rule__ProdType__Group__3__Impl ;
    public final void rule__ProdType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1993:1: ( rule__ProdType__Group__3__Impl )
            // InternalFPML.g:1994:2: rule__ProdType__Group__3__Impl
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
    // InternalFPML.g:2000:1: rule__ProdType__Group__3__Impl : ( ')' ) ;
    public final void rule__ProdType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2004:1: ( ( ')' ) )
            // InternalFPML.g:2005:1: ( ')' )
            {
            // InternalFPML.g:2005:1: ( ')' )
            // InternalFPML.g:2006:2: ')'
            {
             before(grammarAccess.getProdTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFPML.g:2016:1: rule__ProdType__Group_2__0 : rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1 ;
    public final void rule__ProdType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2020:1: ( rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1 )
            // InternalFPML.g:2021:2: rule__ProdType__Group_2__0__Impl rule__ProdType__Group_2__1
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
    // InternalFPML.g:2028:1: rule__ProdType__Group_2__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2032:1: ( ( '*' ) )
            // InternalFPML.g:2033:1: ( '*' )
            {
            // InternalFPML.g:2033:1: ( '*' )
            // InternalFPML.g:2034:2: '*'
            {
             before(grammarAccess.getProdTypeAccess().getAsteriskKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFPML.g:2043:1: rule__ProdType__Group_2__1 : rule__ProdType__Group_2__1__Impl ;
    public final void rule__ProdType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2047:1: ( rule__ProdType__Group_2__1__Impl )
            // InternalFPML.g:2048:2: rule__ProdType__Group_2__1__Impl
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
    // InternalFPML.g:2054:1: rule__ProdType__Group_2__1__Impl : ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) ) ;
    public final void rule__ProdType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2058:1: ( ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) ) )
            // InternalFPML.g:2059:1: ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) )
            {
            // InternalFPML.g:2059:1: ( ( rule__ProdType__ProdAdtElementsAssignment_2_1 ) )
            // InternalFPML.g:2060:2: ( rule__ProdType__ProdAdtElementsAssignment_2_1 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAssignment_2_1()); 
            // InternalFPML.g:2061:2: ( rule__ProdType__ProdAdtElementsAssignment_2_1 )
            // InternalFPML.g:2061:3: rule__ProdType__ProdAdtElementsAssignment_2_1
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
    // InternalFPML.g:2070:1: rule__PureFunction__Group__0 : rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 ;
    public final void rule__PureFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2074:1: ( rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1 )
            // InternalFPML.g:2075:2: rule__PureFunction__Group__0__Impl rule__PureFunction__Group__1
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
    // InternalFPML.g:2082:1: rule__PureFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2086:1: ( ( 'def' ) )
            // InternalFPML.g:2087:1: ( 'def' )
            {
            // InternalFPML.g:2087:1: ( 'def' )
            // InternalFPML.g:2088:2: 'def'
            {
             before(grammarAccess.getPureFunctionAccess().getDefKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFPML.g:2097:1: rule__PureFunction__Group__1 : rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 ;
    public final void rule__PureFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2101:1: ( rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2 )
            // InternalFPML.g:2102:2: rule__PureFunction__Group__1__Impl rule__PureFunction__Group__2
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
    // InternalFPML.g:2109:1: rule__PureFunction__Group__1__Impl : ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2113:1: ( ( ( rule__PureFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2114:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2114:1: ( ( rule__PureFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2115:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2116:2: ( rule__PureFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2116:3: rule__PureFunction__ReturnTypeAssignment_1
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
    // InternalFPML.g:2124:1: rule__PureFunction__Group__2 : rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 ;
    public final void rule__PureFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2128:1: ( rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3 )
            // InternalFPML.g:2129:2: rule__PureFunction__Group__2__Impl rule__PureFunction__Group__3
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
    // InternalFPML.g:2136:1: rule__PureFunction__Group__2__Impl : ( ( rule__PureFunction__NameAssignment_2 ) ) ;
    public final void rule__PureFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2140:1: ( ( ( rule__PureFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2141:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2141:1: ( ( rule__PureFunction__NameAssignment_2 ) )
            // InternalFPML.g:2142:2: ( rule__PureFunction__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2143:2: ( rule__PureFunction__NameAssignment_2 )
            // InternalFPML.g:2143:3: rule__PureFunction__NameAssignment_2
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
    // InternalFPML.g:2151:1: rule__PureFunction__Group__3 : rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 ;
    public final void rule__PureFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2155:1: ( rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4 )
            // InternalFPML.g:2156:2: rule__PureFunction__Group__3__Impl rule__PureFunction__Group__4
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
    // InternalFPML.g:2163:1: rule__PureFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2167:1: ( ( '(' ) )
            // InternalFPML.g:2168:1: ( '(' )
            {
            // InternalFPML.g:2168:1: ( '(' )
            // InternalFPML.g:2169:2: '('
            {
             before(grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:2178:1: rule__PureFunction__Group__4 : rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 ;
    public final void rule__PureFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2182:1: ( rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5 )
            // InternalFPML.g:2183:2: rule__PureFunction__Group__4__Impl rule__PureFunction__Group__5
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
    // InternalFPML.g:2190:1: rule__PureFunction__Group__4__Impl : ( ( rule__PureFunction__ArgAssignment_4 ) ) ;
    public final void rule__PureFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2194:1: ( ( ( rule__PureFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2195:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2195:1: ( ( rule__PureFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2196:2: ( rule__PureFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2197:2: ( rule__PureFunction__ArgAssignment_4 )
            // InternalFPML.g:2197:3: rule__PureFunction__ArgAssignment_4
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
    // InternalFPML.g:2205:1: rule__PureFunction__Group__5 : rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 ;
    public final void rule__PureFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2209:1: ( rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6 )
            // InternalFPML.g:2210:2: rule__PureFunction__Group__5__Impl rule__PureFunction__Group__6
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
    // InternalFPML.g:2217:1: rule__PureFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__PureFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2221:1: ( ( ')' ) )
            // InternalFPML.g:2222:1: ( ')' )
            {
            // InternalFPML.g:2222:1: ( ')' )
            // InternalFPML.g:2223:2: ')'
            {
             before(grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFPML.g:2232:1: rule__PureFunction__Group__6 : rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 ;
    public final void rule__PureFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2236:1: ( rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7 )
            // InternalFPML.g:2237:2: rule__PureFunction__Group__6__Impl rule__PureFunction__Group__7
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
    // InternalFPML.g:2244:1: rule__PureFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__PureFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2248:1: ( ( ':' ) )
            // InternalFPML.g:2249:1: ( ':' )
            {
            // InternalFPML.g:2249:1: ( ':' )
            // InternalFPML.g:2250:2: ':'
            {
             before(grammarAccess.getPureFunctionAccess().getColonKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:2259:1: rule__PureFunction__Group__7 : rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 ;
    public final void rule__PureFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2263:1: ( rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8 )
            // InternalFPML.g:2264:2: rule__PureFunction__Group__7__Impl rule__PureFunction__Group__8
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
    // InternalFPML.g:2271:1: rule__PureFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__PureFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2275:1: ( ( '{' ) )
            // InternalFPML.g:2276:1: ( '{' )
            {
            // InternalFPML.g:2276:1: ( '{' )
            // InternalFPML.g:2277:2: '{'
            {
             before(grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2286:1: rule__PureFunction__Group__8 : rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 ;
    public final void rule__PureFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2290:1: ( rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9 )
            // InternalFPML.g:2291:2: rule__PureFunction__Group__8__Impl rule__PureFunction__Group__9
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
    // InternalFPML.g:2298:1: rule__PureFunction__Group__8__Impl : ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__PureFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2302:1: ( ( ( rule__PureFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2303:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2303:1: ( ( rule__PureFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2304:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getPureFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2305:2: ( rule__PureFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2305:3: rule__PureFunction__FunctionBodyAssignment_8
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
    // InternalFPML.g:2313:1: rule__PureFunction__Group__9 : rule__PureFunction__Group__9__Impl ;
    public final void rule__PureFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2317:1: ( rule__PureFunction__Group__9__Impl )
            // InternalFPML.g:2318:2: rule__PureFunction__Group__9__Impl
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
    // InternalFPML.g:2324:1: rule__PureFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__PureFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2328:1: ( ( '}' ) )
            // InternalFPML.g:2329:1: ( '}' )
            {
            // InternalFPML.g:2329:1: ( '}' )
            // InternalFPML.g:2330:2: '}'
            {
             before(grammarAccess.getPureFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:2340:1: rule__EffectFullFunction__Group__0 : rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 ;
    public final void rule__EffectFullFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2344:1: ( rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1 )
            // InternalFPML.g:2345:2: rule__EffectFullFunction__Group__0__Impl rule__EffectFullFunction__Group__1
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
    // InternalFPML.g:2352:1: rule__EffectFullFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2356:1: ( ( 'def' ) )
            // InternalFPML.g:2357:1: ( 'def' )
            {
            // InternalFPML.g:2357:1: ( 'def' )
            // InternalFPML.g:2358:2: 'def'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getDefKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFPML.g:2367:1: rule__EffectFullFunction__Group__1 : rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 ;
    public final void rule__EffectFullFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2371:1: ( rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2 )
            // InternalFPML.g:2372:2: rule__EffectFullFunction__Group__1__Impl rule__EffectFullFunction__Group__2
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
    // InternalFPML.g:2379:1: rule__EffectFullFunction__Group__1__Impl : ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2383:1: ( ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2384:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2384:1: ( ( rule__EffectFullFunction__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2385:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2386:2: ( rule__EffectFullFunction__ReturnTypeAssignment_1 )
            // InternalFPML.g:2386:3: rule__EffectFullFunction__ReturnTypeAssignment_1
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
    // InternalFPML.g:2394:1: rule__EffectFullFunction__Group__2 : rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 ;
    public final void rule__EffectFullFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2398:1: ( rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3 )
            // InternalFPML.g:2399:2: rule__EffectFullFunction__Group__2__Impl rule__EffectFullFunction__Group__3
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
    // InternalFPML.g:2406:1: rule__EffectFullFunction__Group__2__Impl : ( ( rule__EffectFullFunction__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2410:1: ( ( ( rule__EffectFullFunction__NameAssignment_2 ) ) )
            // InternalFPML.g:2411:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            {
            // InternalFPML.g:2411:1: ( ( rule__EffectFullFunction__NameAssignment_2 ) )
            // InternalFPML.g:2412:2: ( rule__EffectFullFunction__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2413:2: ( rule__EffectFullFunction__NameAssignment_2 )
            // InternalFPML.g:2413:3: rule__EffectFullFunction__NameAssignment_2
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
    // InternalFPML.g:2421:1: rule__EffectFullFunction__Group__3 : rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 ;
    public final void rule__EffectFullFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2425:1: ( rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4 )
            // InternalFPML.g:2426:2: rule__EffectFullFunction__Group__3__Impl rule__EffectFullFunction__Group__4
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
    // InternalFPML.g:2433:1: rule__EffectFullFunction__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2437:1: ( ( '(' ) )
            // InternalFPML.g:2438:1: ( '(' )
            {
            // InternalFPML.g:2438:1: ( '(' )
            // InternalFPML.g:2439:2: '('
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFPML.g:2448:1: rule__EffectFullFunction__Group__4 : rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 ;
    public final void rule__EffectFullFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2452:1: ( rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5 )
            // InternalFPML.g:2453:2: rule__EffectFullFunction__Group__4__Impl rule__EffectFullFunction__Group__5
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
    // InternalFPML.g:2460:1: rule__EffectFullFunction__Group__4__Impl : ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2464:1: ( ( ( rule__EffectFullFunction__ArgAssignment_4 ) ) )
            // InternalFPML.g:2465:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            {
            // InternalFPML.g:2465:1: ( ( rule__EffectFullFunction__ArgAssignment_4 ) )
            // InternalFPML.g:2466:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getArgAssignment_4()); 
            // InternalFPML.g:2467:2: ( rule__EffectFullFunction__ArgAssignment_4 )
            // InternalFPML.g:2467:3: rule__EffectFullFunction__ArgAssignment_4
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
    // InternalFPML.g:2475:1: rule__EffectFullFunction__Group__5 : rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 ;
    public final void rule__EffectFullFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2479:1: ( rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6 )
            // InternalFPML.g:2480:2: rule__EffectFullFunction__Group__5__Impl rule__EffectFullFunction__Group__6
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
    // InternalFPML.g:2487:1: rule__EffectFullFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__EffectFullFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2491:1: ( ( ')' ) )
            // InternalFPML.g:2492:1: ( ')' )
            {
            // InternalFPML.g:2492:1: ( ')' )
            // InternalFPML.g:2493:2: ')'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFPML.g:2502:1: rule__EffectFullFunction__Group__6 : rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 ;
    public final void rule__EffectFullFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2506:1: ( rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7 )
            // InternalFPML.g:2507:2: rule__EffectFullFunction__Group__6__Impl rule__EffectFullFunction__Group__7
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
    // InternalFPML.g:2514:1: rule__EffectFullFunction__Group__6__Impl : ( ':' ) ;
    public final void rule__EffectFullFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2518:1: ( ( ':' ) )
            // InternalFPML.g:2519:1: ( ':' )
            {
            // InternalFPML.g:2519:1: ( ':' )
            // InternalFPML.g:2520:2: ':'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getColonKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:2529:1: rule__EffectFullFunction__Group__7 : rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 ;
    public final void rule__EffectFullFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2533:1: ( rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8 )
            // InternalFPML.g:2534:2: rule__EffectFullFunction__Group__7__Impl rule__EffectFullFunction__Group__8
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
    // InternalFPML.g:2541:1: rule__EffectFullFunction__Group__7__Impl : ( '{' ) ;
    public final void rule__EffectFullFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2545:1: ( ( '{' ) )
            // InternalFPML.g:2546:1: ( '{' )
            {
            // InternalFPML.g:2546:1: ( '{' )
            // InternalFPML.g:2547:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2556:1: rule__EffectFullFunction__Group__8 : rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 ;
    public final void rule__EffectFullFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2560:1: ( rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9 )
            // InternalFPML.g:2561:2: rule__EffectFullFunction__Group__8__Impl rule__EffectFullFunction__Group__9
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
    // InternalFPML.g:2568:1: rule__EffectFullFunction__Group__8__Impl : ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) ;
    public final void rule__EffectFullFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2572:1: ( ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:2573:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:2573:1: ( ( rule__EffectFullFunction__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:2574:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:2575:2: ( rule__EffectFullFunction__FunctionBodyAssignment_8 )
            // InternalFPML.g:2575:3: rule__EffectFullFunction__FunctionBodyAssignment_8
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
    // InternalFPML.g:2583:1: rule__EffectFullFunction__Group__9 : rule__EffectFullFunction__Group__9__Impl ;
    public final void rule__EffectFullFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2587:1: ( rule__EffectFullFunction__Group__9__Impl )
            // InternalFPML.g:2588:2: rule__EffectFullFunction__Group__9__Impl
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
    // InternalFPML.g:2594:1: rule__EffectFullFunction__Group__9__Impl : ( '}' ) ;
    public final void rule__EffectFullFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2598:1: ( ( '}' ) )
            // InternalFPML.g:2599:1: ( '}' )
            {
            // InternalFPML.g:2599:1: ( '}' )
            // InternalFPML.g:2600:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:2610:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2614:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:2615:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
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
    // InternalFPML.g:2622:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2626:1: ( ( 'IO' ) )
            // InternalFPML.g:2627:1: ( 'IO' )
            {
            // InternalFPML.g:2627:1: ( 'IO' )
            // InternalFPML.g:2628:2: 'IO'
            {
             before(grammarAccess.getMainFuncAccess().getIOKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFPML.g:2637:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2641:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:2642:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
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
    // InternalFPML.g:2649:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2653:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2654:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2654:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2655:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2656:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:2656:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:2664:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2668:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:2669:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:2676:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2680:1: ( ( 'main' ) )
            // InternalFPML.g:2681:1: ( 'main' )
            {
            // InternalFPML.g:2681:1: ( 'main' )
            // InternalFPML.g:2682:2: 'main'
            {
             before(grammarAccess.getMainFuncAccess().getMainKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFPML.g:2691:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2695:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:2696:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:2703:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2707:1: ( ( ':' ) )
            // InternalFPML.g:2708:1: ( ':' )
            {
            // InternalFPML.g:2708:1: ( ':' )
            // InternalFPML.g:2709:2: ':'
            {
             before(grammarAccess.getMainFuncAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFPML.g:2718:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2722:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:2723:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
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
    // InternalFPML.g:2730:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2734:1: ( ( '{' ) )
            // InternalFPML.g:2735:1: ( '{' )
            {
            // InternalFPML.g:2735:1: ( '{' )
            // InternalFPML.g:2736:2: '{'
            {
             before(grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalFPML.g:2745:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2749:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:2750:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:2757:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2761:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:2762:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:2762:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:2763:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:2764:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:2764:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:2772:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2776:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:2777:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:2783:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2787:1: ( ( '}' ) )
            // InternalFPML.g:2788:1: ( '}' )
            {
            // InternalFPML.g:2788:1: ( '}' )
            // InternalFPML.g:2789:2: '}'
            {
             before(grammarAccess.getMainFuncAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFPML.g:2799:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2803:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:2804:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
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
    // InternalFPML.g:2811:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2815:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:2816:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:2816:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:2817:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:2818:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:2818:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:2826:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2830:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:2831:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:2837:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 )? ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2841:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 )? ) )
            // InternalFPML.g:2842:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            {
            // InternalFPML.g:2842:1: ( ( rule__EffectFullArgument__NameAssignment_1 )? )
            // InternalFPML.g:2843:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:2844:2: ( rule__EffectFullArgument__NameAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:2844:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:2853:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2857:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:2858:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalFPML.g:2865:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2869:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:2870:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:2870:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:2871:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:2872:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:2872:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:2880:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2884:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:2885:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:2891:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2895:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:2896:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:2896:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:2897:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:2898:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:2898:3: rule__Argument__NameAssignment_1
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


    // $ANTLR start "rule__FunctionBodyPure__Group_0__0"
    // InternalFPML.g:2907:1: rule__FunctionBodyPure__Group_0__0 : rule__FunctionBodyPure__Group_0__0__Impl rule__FunctionBodyPure__Group_0__1 ;
    public final void rule__FunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2911:1: ( rule__FunctionBodyPure__Group_0__0__Impl rule__FunctionBodyPure__Group_0__1 )
            // InternalFPML.g:2912:2: rule__FunctionBodyPure__Group_0__0__Impl rule__FunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__FunctionBodyPure__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionBodyPure__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyPure__Group_0__0"


    // $ANTLR start "rule__FunctionBodyPure__Group_0__0__Impl"
    // InternalFPML.g:2919:1: rule__FunctionBodyPure__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2923:1: ( ( () ) )
            // InternalFPML.g:2924:1: ( () )
            {
            // InternalFPML.g:2924:1: ( () )
            // InternalFPML.g:2925:2: ()
            {
             before(grammarAccess.getFunctionBodyPureAccess().getFunctionBodyPureAction_0_0()); 
            // InternalFPML.g:2926:2: ()
            // InternalFPML.g:2926:3: 
            {
            }

             after(grammarAccess.getFunctionBodyPureAccess().getFunctionBodyPureAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyPure__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionBodyPure__Group_0__1"
    // InternalFPML.g:2934:1: rule__FunctionBodyPure__Group_0__1 : rule__FunctionBodyPure__Group_0__1__Impl ;
    public final void rule__FunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2938:1: ( rule__FunctionBodyPure__Group_0__1__Impl )
            // InternalFPML.g:2939:2: rule__FunctionBodyPure__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBodyPure__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyPure__Group_0__1"


    // $ANTLR start "rule__FunctionBodyPure__Group_0__1__Impl"
    // InternalFPML.g:2945:1: rule__FunctionBodyPure__Group_0__1__Impl : ( RULE_EMPTY_FUNCTION_BODY ) ;
    public final void rule__FunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2949:1: ( ( RULE_EMPTY_FUNCTION_BODY ) )
            // InternalFPML.g:2950:1: ( RULE_EMPTY_FUNCTION_BODY )
            {
            // InternalFPML.g:2950:1: ( RULE_EMPTY_FUNCTION_BODY )
            // InternalFPML.g:2951:2: RULE_EMPTY_FUNCTION_BODY
            {
             before(grammarAccess.getFunctionBodyPureAccess().getEMPTY_FUNCTION_BODYTerminalRuleCall_0_1()); 
            match(input,RULE_EMPTY_FUNCTION_BODY,FOLLOW_2); 
             after(grammarAccess.getFunctionBodyPureAccess().getEMPTY_FUNCTION_BODYTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyPure__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionBodyEffectFull__Group_0__0"
    // InternalFPML.g:2961:1: rule__FunctionBodyEffectFull__Group_0__0 : rule__FunctionBodyEffectFull__Group_0__0__Impl rule__FunctionBodyEffectFull__Group_0__1 ;
    public final void rule__FunctionBodyEffectFull__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2965:1: ( rule__FunctionBodyEffectFull__Group_0__0__Impl rule__FunctionBodyEffectFull__Group_0__1 )
            // InternalFPML.g:2966:2: rule__FunctionBodyEffectFull__Group_0__0__Impl rule__FunctionBodyEffectFull__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__FunctionBodyEffectFull__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionBodyEffectFull__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyEffectFull__Group_0__0"


    // $ANTLR start "rule__FunctionBodyEffectFull__Group_0__0__Impl"
    // InternalFPML.g:2973:1: rule__FunctionBodyEffectFull__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionBodyEffectFull__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2977:1: ( ( () ) )
            // InternalFPML.g:2978:1: ( () )
            {
            // InternalFPML.g:2978:1: ( () )
            // InternalFPML.g:2979:2: ()
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getFunctionBodyEffectFullAction_0_0()); 
            // InternalFPML.g:2980:2: ()
            // InternalFPML.g:2980:3: 
            {
            }

             after(grammarAccess.getFunctionBodyEffectFullAccess().getFunctionBodyEffectFullAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyEffectFull__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionBodyEffectFull__Group_0__1"
    // InternalFPML.g:2988:1: rule__FunctionBodyEffectFull__Group_0__1 : rule__FunctionBodyEffectFull__Group_0__1__Impl ;
    public final void rule__FunctionBodyEffectFull__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2992:1: ( rule__FunctionBodyEffectFull__Group_0__1__Impl )
            // InternalFPML.g:2993:2: rule__FunctionBodyEffectFull__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBodyEffectFull__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyEffectFull__Group_0__1"


    // $ANTLR start "rule__FunctionBodyEffectFull__Group_0__1__Impl"
    // InternalFPML.g:2999:1: rule__FunctionBodyEffectFull__Group_0__1__Impl : ( RULE_EMPTY_FUNCTION_BODY ) ;
    public final void rule__FunctionBodyEffectFull__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3003:1: ( ( RULE_EMPTY_FUNCTION_BODY ) )
            // InternalFPML.g:3004:1: ( RULE_EMPTY_FUNCTION_BODY )
            {
            // InternalFPML.g:3004:1: ( RULE_EMPTY_FUNCTION_BODY )
            // InternalFPML.g:3005:2: RULE_EMPTY_FUNCTION_BODY
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getEMPTY_FUNCTION_BODYTerminalRuleCall_0_1()); 
            match(input,RULE_EMPTY_FUNCTION_BODY,FOLLOW_2); 
             after(grammarAccess.getFunctionBodyEffectFullAccess().getEMPTY_FUNCTION_BODYTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyEffectFull__Group_0__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group__0"
    // InternalFPML.g:3015:1: rule__CompositionFunctionBodyPure__Group__0 : rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 ;
    public final void rule__CompositionFunctionBodyPure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3019:1: ( rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1 )
            // InternalFPML.g:3020:2: rule__CompositionFunctionBodyPure__Group__0__Impl rule__CompositionFunctionBodyPure__Group__1
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
    // InternalFPML.g:3027:1: rule__CompositionFunctionBodyPure__Group__0__Impl : ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3031:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) )
            // InternalFPML.g:3032:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            {
            // InternalFPML.g:3032:1: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
            // InternalFPML.g:3033:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
            // InternalFPML.g:3034:2: ( rule__CompositionFunctionBodyPure__Group_0__0 )
            // InternalFPML.g:3034:3: rule__CompositionFunctionBodyPure__Group_0__0
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
    // InternalFPML.g:3042:1: rule__CompositionFunctionBodyPure__Group__1 : rule__CompositionFunctionBodyPure__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3046:1: ( rule__CompositionFunctionBodyPure__Group__1__Impl )
            // InternalFPML.g:3047:2: rule__CompositionFunctionBodyPure__Group__1__Impl
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
    // InternalFPML.g:3053:1: rule__CompositionFunctionBodyPure__Group__1__Impl : ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyPure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3057:1: ( ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* ) )
            // InternalFPML.g:3058:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            {
            // InternalFPML.g:3058:1: ( ( rule__CompositionFunctionBodyPure__Group_1__0 )* )
            // InternalFPML.g:3059:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
            // InternalFPML.g:3060:2: ( rule__CompositionFunctionBodyPure__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFPML.g:3060:3: rule__CompositionFunctionBodyPure__Group_1__0
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
    // InternalFPML.g:3069:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3073:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:3074:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
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
    // InternalFPML.g:3081:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3085:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) ) )
            // InternalFPML.g:3086:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) )
            {
            // InternalFPML.g:3086:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 ) )
            // InternalFPML.g:3087:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_0()); 
            // InternalFPML.g:3088:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 )
            // InternalFPML.g:3088:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0
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
    // InternalFPML.g:3096:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3100:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 )
            // InternalFPML.g:3101:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2
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
    // InternalFPML.g:3108:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3112:1: ( ( '|>' ) )
            // InternalFPML.g:3113:1: ( '|>' )
            {
            // InternalFPML.g:3113:1: ( '|>' )
            // InternalFPML.g:3114:2: '|>'
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
    // InternalFPML.g:3123:1: rule__CompositionFunctionBodyPure__Group_0__2 : rule__CompositionFunctionBodyPure__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3127:1: ( rule__CompositionFunctionBodyPure__Group_0__2__Impl )
            // InternalFPML.g:3128:2: rule__CompositionFunctionBodyPure__Group_0__2__Impl
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
    // InternalFPML.g:3134:1: rule__CompositionFunctionBodyPure__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3138:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3139:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3139:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3140:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3141:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3141:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2
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
    // InternalFPML.g:3150:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3154:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:3155:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
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
    // InternalFPML.g:3162:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3166:1: ( ( '|>' ) )
            // InternalFPML.g:3167:1: ( '|>' )
            {
            // InternalFPML.g:3167:1: ( '|>' )
            // InternalFPML.g:3168:2: '|>'
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
    // InternalFPML.g:3177:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3181:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:3182:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
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
    // InternalFPML.g:3188:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3192:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3193:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3193:1: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3194:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3195:2: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3195:3: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
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
    // InternalFPML.g:3204:1: rule__CompositionFunctionBodyEffect__Group__0 : rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3208:1: ( rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1 )
            // InternalFPML.g:3209:2: rule__CompositionFunctionBodyEffect__Group__0__Impl rule__CompositionFunctionBodyEffect__Group__1
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
    // InternalFPML.g:3216:1: rule__CompositionFunctionBodyEffect__Group__0__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3220:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) )
            // InternalFPML.g:3221:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            {
            // InternalFPML.g:3221:1: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
            // InternalFPML.g:3222:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
            // InternalFPML.g:3223:2: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
            // InternalFPML.g:3223:3: rule__CompositionFunctionBodyEffect__Group_0__0
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
    // InternalFPML.g:3231:1: rule__CompositionFunctionBodyEffect__Group__1 : rule__CompositionFunctionBodyEffect__Group__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3235:1: ( rule__CompositionFunctionBodyEffect__Group__1__Impl )
            // InternalFPML.g:3236:2: rule__CompositionFunctionBodyEffect__Group__1__Impl
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
    // InternalFPML.g:3242:1: rule__CompositionFunctionBodyEffect__Group__1__Impl : ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) ;
    public final void rule__CompositionFunctionBodyEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3246:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* ) )
            // InternalFPML.g:3247:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            {
            // InternalFPML.g:3247:1: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 )* )
            // InternalFPML.g:3248:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
            // InternalFPML.g:3249:2: ( rule__CompositionFunctionBodyEffect__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFPML.g:3249:3: rule__CompositionFunctionBodyEffect__Group_1__0
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
    // InternalFPML.g:3258:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3262:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:3263:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
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
    // InternalFPML.g:3270:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3274:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) ) )
            // InternalFPML.g:3275:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            {
            // InternalFPML.g:3275:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 ) )
            // InternalFPML.g:3276:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_0()); 
            // InternalFPML.g:3277:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 )
            // InternalFPML.g:3277:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0
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
    // InternalFPML.g:3285:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3289:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 )
            // InternalFPML.g:3290:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2
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
    // InternalFPML.g:3297:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3301:1: ( ( '>>=' ) )
            // InternalFPML.g:3302:1: ( '>>=' )
            {
            // InternalFPML.g:3302:1: ( '>>=' )
            // InternalFPML.g:3303:2: '>>='
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
    // InternalFPML.g:3312:1: rule__CompositionFunctionBodyEffect__Group_0__2 : rule__CompositionFunctionBodyEffect__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3316:1: ( rule__CompositionFunctionBodyEffect__Group_0__2__Impl )
            // InternalFPML.g:3317:2: rule__CompositionFunctionBodyEffect__Group_0__2__Impl
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
    // InternalFPML.g:3323:1: rule__CompositionFunctionBodyEffect__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3327:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) ) )
            // InternalFPML.g:3328:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            {
            // InternalFPML.g:3328:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 ) )
            // InternalFPML.g:3329:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_2()); 
            // InternalFPML.g:3330:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 )
            // InternalFPML.g:3330:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2
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
    // InternalFPML.g:3339:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3343:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:3344:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
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
    // InternalFPML.g:3351:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3355:1: ( ( '>>=' ) )
            // InternalFPML.g:3356:1: ( '>>=' )
            {
            // InternalFPML.g:3356:1: ( '>>=' )
            // InternalFPML.g:3357:2: '>>='
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
    // InternalFPML.g:3366:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3370:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:3371:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
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
    // InternalFPML.g:3377:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3381:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) )
            // InternalFPML.g:3382:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            {
            // InternalFPML.g:3382:1: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3383:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3384:2: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3384:3: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
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
    // InternalFPML.g:3393:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3397:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:3398:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
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
    // InternalFPML.g:3405:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3409:1: ( ( 'IO' ) )
            // InternalFPML.g:3410:1: ( 'IO' )
            {
            // InternalFPML.g:3410:1: ( 'IO' )
            // InternalFPML.g:3411:2: 'IO'
            {
             before(grammarAccess.getIOTypeAccess().getIOKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFPML.g:3420:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3424:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:3425:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:3431:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3435:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3436:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3436:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:3437:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3438:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:3438:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:3447:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3451:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:3452:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
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
    // InternalFPML.g:3459:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3463:1: ( ( () ) )
            // InternalFPML.g:3464:1: ( () )
            {
            // InternalFPML.g:3464:1: ( () )
            // InternalFPML.g:3465:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:3466:2: ()
            // InternalFPML.g:3466:3: 
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
    // InternalFPML.g:3474:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3478:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:3479:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:3485:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3489:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3490:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3490:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:3491:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3492:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:3492:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:3501:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3505:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:3506:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
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
    // InternalFPML.g:3513:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3517:1: ( ( () ) )
            // InternalFPML.g:3518:1: ( () )
            {
            // InternalFPML.g:3518:1: ( () )
            // InternalFPML.g:3519:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:3520:2: ()
            // InternalFPML.g:3520:3: 
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
    // InternalFPML.g:3528:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3532:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:3533:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:3539:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3543:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3544:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3544:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:3545:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3546:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:3546:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:3555:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3559:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:3560:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
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
    // InternalFPML.g:3567:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3571:1: ( ( () ) )
            // InternalFPML.g:3572:1: ( () )
            {
            // InternalFPML.g:3572:1: ( () )
            // InternalFPML.g:3573:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:3574:2: ()
            // InternalFPML.g:3574:3: 
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
    // InternalFPML.g:3582:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3586:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:3587:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:3593:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3597:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:3598:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:3598:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:3599:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:3600:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:3600:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:3609:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3613:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:3614:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalFPML.g:3621:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3625:1: ( ( () ) )
            // InternalFPML.g:3626:1: ( () )
            {
            // InternalFPML.g:3626:1: ( () )
            // InternalFPML.g:3627:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:3628:2: ()
            // InternalFPML.g:3628:3: 
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
    // InternalFPML.g:3636:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3640:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:3641:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
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
    // InternalFPML.g:3648:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3652:1: ( ( 'ref' ) )
            // InternalFPML.g:3653:1: ( 'ref' )
            {
            // InternalFPML.g:3653:1: ( 'ref' )
            // InternalFPML.g:3654:2: 'ref'
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
    // InternalFPML.g:3663:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3667:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:3668:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:3674:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3678:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:3679:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:3679:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:3680:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:3681:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:3681:3: rule__DataType__TypeAssignment_2
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
    // InternalFPML.g:3690:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3694:1: ( ( rulePureBlock ) )
            // InternalFPML.g:3695:2: ( rulePureBlock )
            {
            // InternalFPML.g:3695:2: ( rulePureBlock )
            // InternalFPML.g:3696:3: rulePureBlock
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
    // InternalFPML.g:3705:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3709:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:3710:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:3710:2: ( ruleEffectFullBlock )
            // InternalFPML.g:3711:3: ruleEffectFullBlock
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
    // InternalFPML.g:3720:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3724:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:3725:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:3725:2: ( rulePureFunctionBlock )
            // InternalFPML.g:3726:3: rulePureFunctionBlock
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
    // InternalFPML.g:3735:1: rule__PureBlock__ElementsAssignment_3 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3739:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:3740:2: ( ruleDataBlock )
            {
            // InternalFPML.g:3740:2: ( ruleDataBlock )
            // InternalFPML.g:3741:3: ruleDataBlock
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


    // $ANTLR start "rule__PureFunctionBlock__FeaturesAssignment_3"
    // InternalFPML.g:3750:1: rule__PureFunctionBlock__FeaturesAssignment_3 : ( rulePureFunction ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3754:1: ( ( rulePureFunction ) )
            // InternalFPML.g:3755:2: ( rulePureFunction )
            {
            // InternalFPML.g:3755:2: ( rulePureFunction )
            // InternalFPML.g:3756:3: rulePureFunction
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunction();

            state._fsp--;

             after(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__FeaturesAssignment_3"


    // $ANTLR start "rule__DataBlock__ElementsAssignment_3"
    // InternalFPML.g:3765:1: rule__DataBlock__ElementsAssignment_3 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3769:1: ( ( ruleData ) )
            // InternalFPML.g:3770:2: ( ruleData )
            {
            // InternalFPML.g:3770:2: ( ruleData )
            // InternalFPML.g:3771:3: ruleData
            {
             before(grammarAccess.getDataBlockAccess().getElementsDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataBlockAccess().getElementsDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__ElementsAssignment_3"


    // $ANTLR start "rule__EffectFullBlock__FeaturesAssignment_2"
    // InternalFPML.g:3780:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunction ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3784:1: ( ( ruleEffectFullFunction ) )
            // InternalFPML.g:3785:2: ( ruleEffectFullFunction )
            {
            // InternalFPML.g:3785:2: ( ruleEffectFullFunction )
            // InternalFPML.g:3786:3: ruleEffectFullFunction
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
    // InternalFPML.g:3795:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3799:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:3800:2: ( ruleMainFunc )
            {
            // InternalFPML.g:3800:2: ( ruleMainFunc )
            // InternalFPML.g:3801:3: ruleMainFunc
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
    // InternalFPML.g:3810:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3814:1: ( ( RULE_ID ) )
            // InternalFPML.g:3815:2: ( RULE_ID )
            {
            // InternalFPML.g:3815:2: ( RULE_ID )
            // InternalFPML.g:3816:3: RULE_ID
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
    // InternalFPML.g:3825:1: rule__Data__ContentAssignment_2 : ( ruleAdt ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3829:1: ( ( ruleAdt ) )
            // InternalFPML.g:3830:2: ( ruleAdt )
            {
            // InternalFPML.g:3830:2: ( ruleAdt )
            // InternalFPML.g:3831:3: ruleAdt
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
    // InternalFPML.g:3840:1: rule__SumType__SumAdtElementsAssignment_1 : ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) ) ;
    public final void rule__SumType__SumAdtElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3844:1: ( ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) ) )
            // InternalFPML.g:3845:2: ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) )
            {
            // InternalFPML.g:3845:2: ( ( rule__SumType__SumAdtElementsAlternatives_1_0 ) )
            // InternalFPML.g:3846:3: ( rule__SumType__SumAdtElementsAlternatives_1_0 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_1_0()); 
            // InternalFPML.g:3847:3: ( rule__SumType__SumAdtElementsAlternatives_1_0 )
            // InternalFPML.g:3847:4: rule__SumType__SumAdtElementsAlternatives_1_0
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
    // InternalFPML.g:3855:1: rule__SumType__SumAdtElementsAssignment_2_1 : ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) ) ;
    public final void rule__SumType__SumAdtElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3859:1: ( ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) ) )
            // InternalFPML.g:3860:2: ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) )
            {
            // InternalFPML.g:3860:2: ( ( rule__SumType__SumAdtElementsAlternatives_2_1_0 ) )
            // InternalFPML.g:3861:3: ( rule__SumType__SumAdtElementsAlternatives_2_1_0 )
            {
             before(grammarAccess.getSumTypeAccess().getSumAdtElementsAlternatives_2_1_0()); 
            // InternalFPML.g:3862:3: ( rule__SumType__SumAdtElementsAlternatives_2_1_0 )
            // InternalFPML.g:3862:4: rule__SumType__SumAdtElementsAlternatives_2_1_0
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
    // InternalFPML.g:3870:1: rule__ProdType__ProdAdtElementsAssignment_1 : ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) ) ;
    public final void rule__ProdType__ProdAdtElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3874:1: ( ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) ) )
            // InternalFPML.g:3875:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) )
            {
            // InternalFPML.g:3875:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_1_0 ) )
            // InternalFPML.g:3876:3: ( rule__ProdType__ProdAdtElementsAlternatives_1_0 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_1_0()); 
            // InternalFPML.g:3877:3: ( rule__ProdType__ProdAdtElementsAlternatives_1_0 )
            // InternalFPML.g:3877:4: rule__ProdType__ProdAdtElementsAlternatives_1_0
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
    // InternalFPML.g:3885:1: rule__ProdType__ProdAdtElementsAssignment_2_1 : ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) ) ;
    public final void rule__ProdType__ProdAdtElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3889:1: ( ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) ) )
            // InternalFPML.g:3890:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) )
            {
            // InternalFPML.g:3890:2: ( ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 ) )
            // InternalFPML.g:3891:3: ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 )
            {
             before(grammarAccess.getProdTypeAccess().getProdAdtElementsAlternatives_2_1_0()); 
            // InternalFPML.g:3892:3: ( rule__ProdType__ProdAdtElementsAlternatives_2_1_0 )
            // InternalFPML.g:3892:4: rule__ProdType__ProdAdtElementsAlternatives_2_1_0
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
    // InternalFPML.g:3900:1: rule__PureFunction__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3904:1: ( ( ruleValueType ) )
            // InternalFPML.g:3905:2: ( ruleValueType )
            {
            // InternalFPML.g:3905:2: ( ruleValueType )
            // InternalFPML.g:3906:3: ruleValueType
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
    // InternalFPML.g:3915:1: rule__PureFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3919:1: ( ( RULE_ID ) )
            // InternalFPML.g:3920:2: ( RULE_ID )
            {
            // InternalFPML.g:3920:2: ( RULE_ID )
            // InternalFPML.g:3921:3: RULE_ID
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
    // InternalFPML.g:3930:1: rule__PureFunction__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3934:1: ( ( ruleArgument ) )
            // InternalFPML.g:3935:2: ( ruleArgument )
            {
            // InternalFPML.g:3935:2: ( ruleArgument )
            // InternalFPML.g:3936:3: ruleArgument
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
    // InternalFPML.g:3945:1: rule__PureFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3949:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:3950:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:3950:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:3951:3: ruleFunctionBodyPure
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
    // InternalFPML.g:3960:1: rule__EffectFullFunction__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunction__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3964:1: ( ( ruleIOType ) )
            // InternalFPML.g:3965:2: ( ruleIOType )
            {
            // InternalFPML.g:3965:2: ( ruleIOType )
            // InternalFPML.g:3966:3: ruleIOType
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
    // InternalFPML.g:3975:1: rule__EffectFullFunction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3979:1: ( ( RULE_ID ) )
            // InternalFPML.g:3980:2: ( RULE_ID )
            {
            // InternalFPML.g:3980:2: ( RULE_ID )
            // InternalFPML.g:3981:3: RULE_ID
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
    // InternalFPML.g:3990:1: rule__EffectFullFunction__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunction__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3994:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:3995:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:3995:2: ( ruleEffectFullArgument )
            // InternalFPML.g:3996:3: ruleEffectFullArgument
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
    // InternalFPML.g:4005:1: rule__EffectFullFunction__FunctionBodyAssignment_8 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunction__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4009:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:4010:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:4010:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:4011:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:4020:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4024:1: ( ( ruleUnitType ) )
            // InternalFPML.g:4025:2: ( ruleUnitType )
            {
            // InternalFPML.g:4025:2: ( ruleUnitType )
            // InternalFPML.g:4026:3: ruleUnitType
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
    // InternalFPML.g:4035:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4039:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:4040:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:4040:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:4041:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:4050:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4054:1: ( ( ruleType ) )
            // InternalFPML.g:4055:2: ( ruleType )
            {
            // InternalFPML.g:4055:2: ( ruleType )
            // InternalFPML.g:4056:3: ruleType
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
    // InternalFPML.g:4065:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4069:1: ( ( RULE_ID ) )
            // InternalFPML.g:4070:2: ( RULE_ID )
            {
            // InternalFPML.g:4070:2: ( RULE_ID )
            // InternalFPML.g:4071:3: RULE_ID
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
    // InternalFPML.g:4080:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4084:1: ( ( ruleValueType ) )
            // InternalFPML.g:4085:2: ( ruleValueType )
            {
            // InternalFPML.g:4085:2: ( ruleValueType )
            // InternalFPML.g:4086:3: ruleValueType
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
    // InternalFPML.g:4095:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4099:1: ( ( RULE_ID ) )
            // InternalFPML.g:4100:2: ( RULE_ID )
            {
            // InternalFPML.g:4100:2: ( RULE_ID )
            // InternalFPML.g:4101:3: RULE_ID
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
    // InternalFPML.g:4110:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4114:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4115:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4115:2: ( ( RULE_ID ) )
            // InternalFPML.g:4116:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4117:3: ( RULE_ID )
            // InternalFPML.g:4118:4: RULE_ID
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
    // InternalFPML.g:4129:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4133:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4134:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4134:2: ( ( RULE_ID ) )
            // InternalFPML.g:4135:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0()); 
            // InternalFPML.g:4136:3: ( RULE_ID )
            // InternalFPML.g:4137:4: RULE_ID
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
    // InternalFPML.g:4148:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4152:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4153:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4153:2: ( ( RULE_ID ) )
            // InternalFPML.g:4154:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0()); 
            // InternalFPML.g:4155:3: ( RULE_ID )
            // InternalFPML.g:4156:4: RULE_ID
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
    // InternalFPML.g:4167:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4171:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4172:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4172:2: ( ( RULE_ID ) )
            // InternalFPML.g:4173:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:4174:3: ( RULE_ID )
            // InternalFPML.g:4175:4: RULE_ID
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
    // InternalFPML.g:4186:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4190:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4191:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4191:2: ( ( RULE_ID ) )
            // InternalFPML.g:4192:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0()); 
            // InternalFPML.g:4193:3: ( RULE_ID )
            // InternalFPML.g:4194:4: RULE_ID
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
    // InternalFPML.g:4205:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4209:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4210:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4210:2: ( ( RULE_ID ) )
            // InternalFPML.g:4211:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0()); 
            // InternalFPML.g:4212:3: ( RULE_ID )
            // InternalFPML.g:4213:4: RULE_ID
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
    // InternalFPML.g:4224:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4228:1: ( ( ruleType ) )
            // InternalFPML.g:4229:2: ( ruleType )
            {
            // InternalFPML.g:4229:2: ( ruleType )
            // InternalFPML.g:4230:3: ruleType
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
    // InternalFPML.g:4239:1: rule__IntegerType__TypeAssignment_1 : ( ( 'Int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4243:1: ( ( ( 'Int' ) ) )
            // InternalFPML.g:4244:2: ( ( 'Int' ) )
            {
            // InternalFPML.g:4244:2: ( ( 'Int' ) )
            // InternalFPML.g:4245:3: ( 'Int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:4246:3: ( 'Int' )
            // InternalFPML.g:4247:4: 'Int'
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
    // InternalFPML.g:4258:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4262:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:4263:2: ( ( 'String' ) )
            {
            // InternalFPML.g:4263:2: ( ( 'String' ) )
            // InternalFPML.g:4264:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:4265:3: ( 'String' )
            // InternalFPML.g:4266:4: 'String'
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
    // InternalFPML.g:4277:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4281:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:4282:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:4282:2: ( ( 'Unit' ) )
            // InternalFPML.g:4283:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:4284:3: ( 'Unit' )
            // InternalFPML.g:4285:4: 'Unit'
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
    // InternalFPML.g:4296:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4300:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:4301:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:4301:2: ( ( RULE_ID ) )
            // InternalFPML.g:4302:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:4303:3: ( RULE_ID )
            // InternalFPML.g:4304:4: RULE_ID
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
    static final String dfa_2s = "\1\4\2\uffff\1\4\2\26\1\7\3\26\2\uffff\1\26";
    static final String dfa_3s = "\1\37\2\uffff\1\37\2\27\1\7\3\27\2\uffff\1\27";
    static final String dfa_4s = "\1\uffff\1\1\1\2\7\uffff\1\3\1\4\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\6\uffff\1\2\7\uffff\1\3\10\uffff\3\1",
            "",
            "",
            "\1\7\1\10\6\uffff\1\11\20\uffff\1\6\1\4\1\5",
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
            return "802:1: rule__Adt__Alternatives : ( ( ruleArgument ) | ( ruleValue ) | ( ruleSumType ) | ( ruleProdType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0101030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E0001030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});

}