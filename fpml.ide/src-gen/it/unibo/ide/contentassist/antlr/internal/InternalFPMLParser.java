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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "','", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'randomInt'", "'return'", "'currentTime'", "'applyFIO'", "'int'", "'String'", "'Unit'"
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


    // $ANTLR start "entryRulePureDataBlock"
    // InternalFPML.g:128:1: entryRulePureDataBlock : rulePureDataBlock EOF ;
    public final void entryRulePureDataBlock() throws RecognitionException {
        try {
            // InternalFPML.g:129:1: ( rulePureDataBlock EOF )
            // InternalFPML.g:130:1: rulePureDataBlock EOF
            {
             before(grammarAccess.getPureDataBlockRule()); 
            pushFollow(FOLLOW_1);
            rulePureDataBlock();

            state._fsp--;

             after(grammarAccess.getPureDataBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureDataBlock"


    // $ANTLR start "rulePureDataBlock"
    // InternalFPML.g:137:1: rulePureDataBlock : ( ( rule__PureDataBlock__Group__0 ) ) ;
    public final void rulePureDataBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:141:2: ( ( ( rule__PureDataBlock__Group__0 ) ) )
            // InternalFPML.g:142:2: ( ( rule__PureDataBlock__Group__0 ) )
            {
            // InternalFPML.g:142:2: ( ( rule__PureDataBlock__Group__0 ) )
            // InternalFPML.g:143:3: ( rule__PureDataBlock__Group__0 )
            {
             before(grammarAccess.getPureDataBlockAccess().getGroup()); 
            // InternalFPML.g:144:3: ( rule__PureDataBlock__Group__0 )
            // InternalFPML.g:144:4: rule__PureDataBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureDataBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureDataBlock"


    // $ANTLR start "entryRulePureValueBlock"
    // InternalFPML.g:153:1: entryRulePureValueBlock : rulePureValueBlock EOF ;
    public final void entryRulePureValueBlock() throws RecognitionException {
        try {
            // InternalFPML.g:154:1: ( rulePureValueBlock EOF )
            // InternalFPML.g:155:1: rulePureValueBlock EOF
            {
             before(grammarAccess.getPureValueBlockRule()); 
            pushFollow(FOLLOW_1);
            rulePureValueBlock();

            state._fsp--;

             after(grammarAccess.getPureValueBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureValueBlock"


    // $ANTLR start "rulePureValueBlock"
    // InternalFPML.g:162:1: rulePureValueBlock : ( ( rule__PureValueBlock__Group__0 ) ) ;
    public final void rulePureValueBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:166:2: ( ( ( rule__PureValueBlock__Group__0 ) ) )
            // InternalFPML.g:167:2: ( ( rule__PureValueBlock__Group__0 ) )
            {
            // InternalFPML.g:167:2: ( ( rule__PureValueBlock__Group__0 ) )
            // InternalFPML.g:168:3: ( rule__PureValueBlock__Group__0 )
            {
             before(grammarAccess.getPureValueBlockAccess().getGroup()); 
            // InternalFPML.g:169:3: ( rule__PureValueBlock__Group__0 )
            // InternalFPML.g:169:4: rule__PureValueBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureValueBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureValueBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureValueBlock"


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


    // $ANTLR start "entryRuleEffectFullDataBlock"
    // InternalFPML.g:203:1: entryRuleEffectFullDataBlock : ruleEffectFullDataBlock EOF ;
    public final void entryRuleEffectFullDataBlock() throws RecognitionException {
        try {
            // InternalFPML.g:204:1: ( ruleEffectFullDataBlock EOF )
            // InternalFPML.g:205:1: ruleEffectFullDataBlock EOF
            {
             before(grammarAccess.getEffectFullDataBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullDataBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullDataBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullDataBlock"


    // $ANTLR start "ruleEffectFullDataBlock"
    // InternalFPML.g:212:1: ruleEffectFullDataBlock : ( ( rule__EffectFullDataBlock__Group__0 ) ) ;
    public final void ruleEffectFullDataBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:216:2: ( ( ( rule__EffectFullDataBlock__Group__0 ) ) )
            // InternalFPML.g:217:2: ( ( rule__EffectFullDataBlock__Group__0 ) )
            {
            // InternalFPML.g:217:2: ( ( rule__EffectFullDataBlock__Group__0 ) )
            // InternalFPML.g:218:3: ( rule__EffectFullDataBlock__Group__0 )
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getGroup()); 
            // InternalFPML.g:219:3: ( rule__EffectFullDataBlock__Group__0 )
            // InternalFPML.g:219:4: rule__EffectFullDataBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullDataBlock"


    // $ANTLR start "entryRuleEffectFullValueBlock"
    // InternalFPML.g:228:1: entryRuleEffectFullValueBlock : ruleEffectFullValueBlock EOF ;
    public final void entryRuleEffectFullValueBlock() throws RecognitionException {
        try {
            // InternalFPML.g:229:1: ( ruleEffectFullValueBlock EOF )
            // InternalFPML.g:230:1: ruleEffectFullValueBlock EOF
            {
             before(grammarAccess.getEffectFullValueBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullValueBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullValueBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullValueBlock"


    // $ANTLR start "ruleEffectFullValueBlock"
    // InternalFPML.g:237:1: ruleEffectFullValueBlock : ( ( rule__EffectFullValueBlock__Group__0 ) ) ;
    public final void ruleEffectFullValueBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:241:2: ( ( ( rule__EffectFullValueBlock__Group__0 ) ) )
            // InternalFPML.g:242:2: ( ( rule__EffectFullValueBlock__Group__0 ) )
            {
            // InternalFPML.g:242:2: ( ( rule__EffectFullValueBlock__Group__0 ) )
            // InternalFPML.g:243:3: ( rule__EffectFullValueBlock__Group__0 )
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getGroup()); 
            // InternalFPML.g:244:3: ( rule__EffectFullValueBlock__Group__0 )
            // InternalFPML.g:244:4: rule__EffectFullValueBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValueBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullValueBlock"


    // $ANTLR start "entryRuleEffectFullFunctionBlock"
    // InternalFPML.g:253:1: entryRuleEffectFullFunctionBlock : ruleEffectFullFunctionBlock EOF ;
    public final void entryRuleEffectFullFunctionBlock() throws RecognitionException {
        try {
            // InternalFPML.g:254:1: ( ruleEffectFullFunctionBlock EOF )
            // InternalFPML.g:255:1: ruleEffectFullFunctionBlock EOF
            {
             before(grammarAccess.getEffectFullFunctionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullFunctionBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullFunctionBlock"


    // $ANTLR start "ruleEffectFullFunctionBlock"
    // InternalFPML.g:262:1: ruleEffectFullFunctionBlock : ( ( rule__EffectFullFunctionBlock__Group__0 ) ) ;
    public final void ruleEffectFullFunctionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:266:2: ( ( ( rule__EffectFullFunctionBlock__Group__0 ) ) )
            // InternalFPML.g:267:2: ( ( rule__EffectFullFunctionBlock__Group__0 ) )
            {
            // InternalFPML.g:267:2: ( ( rule__EffectFullFunctionBlock__Group__0 ) )
            // InternalFPML.g:268:3: ( rule__EffectFullFunctionBlock__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getGroup()); 
            // InternalFPML.g:269:3: ( rule__EffectFullFunctionBlock__Group__0 )
            // InternalFPML.g:269:4: rule__EffectFullFunctionBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullFunctionBlock"


    // $ANTLR start "entryRulePureData"
    // InternalFPML.g:278:1: entryRulePureData : rulePureData EOF ;
    public final void entryRulePureData() throws RecognitionException {
        try {
            // InternalFPML.g:279:1: ( rulePureData EOF )
            // InternalFPML.g:280:1: rulePureData EOF
            {
             before(grammarAccess.getPureDataRule()); 
            pushFollow(FOLLOW_1);
            rulePureData();

            state._fsp--;

             after(grammarAccess.getPureDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureData"


    // $ANTLR start "rulePureData"
    // InternalFPML.g:287:1: rulePureData : ( ( rule__PureData__Group__0 ) ) ;
    public final void rulePureData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:291:2: ( ( ( rule__PureData__Group__0 ) ) )
            // InternalFPML.g:292:2: ( ( rule__PureData__Group__0 ) )
            {
            // InternalFPML.g:292:2: ( ( rule__PureData__Group__0 ) )
            // InternalFPML.g:293:3: ( rule__PureData__Group__0 )
            {
             before(grammarAccess.getPureDataAccess().getGroup()); 
            // InternalFPML.g:294:3: ( rule__PureData__Group__0 )
            // InternalFPML.g:294:4: rule__PureData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureData"


    // $ANTLR start "entryRulePureValue"
    // InternalFPML.g:303:1: entryRulePureValue : rulePureValue EOF ;
    public final void entryRulePureValue() throws RecognitionException {
        try {
            // InternalFPML.g:304:1: ( rulePureValue EOF )
            // InternalFPML.g:305:1: rulePureValue EOF
            {
             before(grammarAccess.getPureValueRule()); 
            pushFollow(FOLLOW_1);
            rulePureValue();

            state._fsp--;

             after(grammarAccess.getPureValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureValue"


    // $ANTLR start "rulePureValue"
    // InternalFPML.g:312:1: rulePureValue : ( ( rule__PureValue__Group__0 ) ) ;
    public final void rulePureValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:316:2: ( ( ( rule__PureValue__Group__0 ) ) )
            // InternalFPML.g:317:2: ( ( rule__PureValue__Group__0 ) )
            {
            // InternalFPML.g:317:2: ( ( rule__PureValue__Group__0 ) )
            // InternalFPML.g:318:3: ( rule__PureValue__Group__0 )
            {
             before(grammarAccess.getPureValueAccess().getGroup()); 
            // InternalFPML.g:319:3: ( rule__PureValue__Group__0 )
            // InternalFPML.g:319:4: rule__PureValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureValue"


    // $ANTLR start "entryRulePureAdtType"
    // InternalFPML.g:328:1: entryRulePureAdtType : rulePureAdtType EOF ;
    public final void entryRulePureAdtType() throws RecognitionException {
        try {
            // InternalFPML.g:329:1: ( rulePureAdtType EOF )
            // InternalFPML.g:330:1: rulePureAdtType EOF
            {
             before(grammarAccess.getPureAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePureAdtType();

            state._fsp--;

             after(grammarAccess.getPureAdtTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureAdtType"


    // $ANTLR start "rulePureAdtType"
    // InternalFPML.g:337:1: rulePureAdtType : ( ( rule__PureAdtType__Alternatives ) ) ;
    public final void rulePureAdtType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:341:2: ( ( ( rule__PureAdtType__Alternatives ) ) )
            // InternalFPML.g:342:2: ( ( rule__PureAdtType__Alternatives ) )
            {
            // InternalFPML.g:342:2: ( ( rule__PureAdtType__Alternatives ) )
            // InternalFPML.g:343:3: ( rule__PureAdtType__Alternatives )
            {
             before(grammarAccess.getPureAdtTypeAccess().getAlternatives()); 
            // InternalFPML.g:344:3: ( rule__PureAdtType__Alternatives )
            // InternalFPML.g:344:4: rule__PureAdtType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPureAdtTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureAdtType"


    // $ANTLR start "entryRulePureSumType"
    // InternalFPML.g:353:1: entryRulePureSumType : rulePureSumType EOF ;
    public final void entryRulePureSumType() throws RecognitionException {
        try {
            // InternalFPML.g:354:1: ( rulePureSumType EOF )
            // InternalFPML.g:355:1: rulePureSumType EOF
            {
             before(grammarAccess.getPureSumTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePureSumType();

            state._fsp--;

             after(grammarAccess.getPureSumTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureSumType"


    // $ANTLR start "rulePureSumType"
    // InternalFPML.g:362:1: rulePureSumType : ( ( rule__PureSumType__Group__0 ) ) ;
    public final void rulePureSumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:366:2: ( ( ( rule__PureSumType__Group__0 ) ) )
            // InternalFPML.g:367:2: ( ( rule__PureSumType__Group__0 ) )
            {
            // InternalFPML.g:367:2: ( ( rule__PureSumType__Group__0 ) )
            // InternalFPML.g:368:3: ( rule__PureSumType__Group__0 )
            {
             before(grammarAccess.getPureSumTypeAccess().getGroup()); 
            // InternalFPML.g:369:3: ( rule__PureSumType__Group__0 )
            // InternalFPML.g:369:4: rule__PureSumType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureSumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureSumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureSumType"


    // $ANTLR start "entryRulePureProdType"
    // InternalFPML.g:378:1: entryRulePureProdType : rulePureProdType EOF ;
    public final void entryRulePureProdType() throws RecognitionException {
        try {
            // InternalFPML.g:379:1: ( rulePureProdType EOF )
            // InternalFPML.g:380:1: rulePureProdType EOF
            {
             before(grammarAccess.getPureProdTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePureProdType();

            state._fsp--;

             after(grammarAccess.getPureProdTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureProdType"


    // $ANTLR start "rulePureProdType"
    // InternalFPML.g:387:1: rulePureProdType : ( ( rule__PureProdType__Group__0 ) ) ;
    public final void rulePureProdType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:391:2: ( ( ( rule__PureProdType__Group__0 ) ) )
            // InternalFPML.g:392:2: ( ( rule__PureProdType__Group__0 ) )
            {
            // InternalFPML.g:392:2: ( ( rule__PureProdType__Group__0 ) )
            // InternalFPML.g:393:3: ( rule__PureProdType__Group__0 )
            {
             before(grammarAccess.getPureProdTypeAccess().getGroup()); 
            // InternalFPML.g:394:3: ( rule__PureProdType__Group__0 )
            // InternalFPML.g:394:4: rule__PureProdType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureProdType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureProdTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureProdType"


    // $ANTLR start "entryRuleEffectFullData"
    // InternalFPML.g:403:1: entryRuleEffectFullData : ruleEffectFullData EOF ;
    public final void entryRuleEffectFullData() throws RecognitionException {
        try {
            // InternalFPML.g:404:1: ( ruleEffectFullData EOF )
            // InternalFPML.g:405:1: ruleEffectFullData EOF
            {
             before(grammarAccess.getEffectFullDataRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullData();

            state._fsp--;

             after(grammarAccess.getEffectFullDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullData"


    // $ANTLR start "ruleEffectFullData"
    // InternalFPML.g:412:1: ruleEffectFullData : ( ( rule__EffectFullData__Group__0 ) ) ;
    public final void ruleEffectFullData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:416:2: ( ( ( rule__EffectFullData__Group__0 ) ) )
            // InternalFPML.g:417:2: ( ( rule__EffectFullData__Group__0 ) )
            {
            // InternalFPML.g:417:2: ( ( rule__EffectFullData__Group__0 ) )
            // InternalFPML.g:418:3: ( rule__EffectFullData__Group__0 )
            {
             before(grammarAccess.getEffectFullDataAccess().getGroup()); 
            // InternalFPML.g:419:3: ( rule__EffectFullData__Group__0 )
            // InternalFPML.g:419:4: rule__EffectFullData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullData"


    // $ANTLR start "entryRuleEffectFullValue"
    // InternalFPML.g:428:1: entryRuleEffectFullValue : ruleEffectFullValue EOF ;
    public final void entryRuleEffectFullValue() throws RecognitionException {
        try {
            // InternalFPML.g:429:1: ( ruleEffectFullValue EOF )
            // InternalFPML.g:430:1: ruleEffectFullValue EOF
            {
             before(grammarAccess.getEffectFullValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullValue();

            state._fsp--;

             after(grammarAccess.getEffectFullValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullValue"


    // $ANTLR start "ruleEffectFullValue"
    // InternalFPML.g:437:1: ruleEffectFullValue : ( ( rule__EffectFullValue__Group__0 ) ) ;
    public final void ruleEffectFullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:441:2: ( ( ( rule__EffectFullValue__Group__0 ) ) )
            // InternalFPML.g:442:2: ( ( rule__EffectFullValue__Group__0 ) )
            {
            // InternalFPML.g:442:2: ( ( rule__EffectFullValue__Group__0 ) )
            // InternalFPML.g:443:3: ( rule__EffectFullValue__Group__0 )
            {
             before(grammarAccess.getEffectFullValueAccess().getGroup()); 
            // InternalFPML.g:444:3: ( rule__EffectFullValue__Group__0 )
            // InternalFPML.g:444:4: rule__EffectFullValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullValue"


    // $ANTLR start "entryRuleEffectFullAdtType"
    // InternalFPML.g:453:1: entryRuleEffectFullAdtType : ruleEffectFullAdtType EOF ;
    public final void entryRuleEffectFullAdtType() throws RecognitionException {
        try {
            // InternalFPML.g:454:1: ( ruleEffectFullAdtType EOF )
            // InternalFPML.g:455:1: ruleEffectFullAdtType EOF
            {
             before(grammarAccess.getEffectFullAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullAdtType();

            state._fsp--;

             after(grammarAccess.getEffectFullAdtTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullAdtType"


    // $ANTLR start "ruleEffectFullAdtType"
    // InternalFPML.g:462:1: ruleEffectFullAdtType : ( ( rule__EffectFullAdtType__Alternatives ) ) ;
    public final void ruleEffectFullAdtType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:466:2: ( ( ( rule__EffectFullAdtType__Alternatives ) ) )
            // InternalFPML.g:467:2: ( ( rule__EffectFullAdtType__Alternatives ) )
            {
            // InternalFPML.g:467:2: ( ( rule__EffectFullAdtType__Alternatives ) )
            // InternalFPML.g:468:3: ( rule__EffectFullAdtType__Alternatives )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getAlternatives()); 
            // InternalFPML.g:469:3: ( rule__EffectFullAdtType__Alternatives )
            // InternalFPML.g:469:4: rule__EffectFullAdtType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullAdtTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullAdtType"


    // $ANTLR start "entryRuleEffectFullSumType"
    // InternalFPML.g:478:1: entryRuleEffectFullSumType : ruleEffectFullSumType EOF ;
    public final void entryRuleEffectFullSumType() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleEffectFullSumType EOF )
            // InternalFPML.g:480:1: ruleEffectFullSumType EOF
            {
             before(grammarAccess.getEffectFullSumTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullSumType();

            state._fsp--;

             after(grammarAccess.getEffectFullSumTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullSumType"


    // $ANTLR start "ruleEffectFullSumType"
    // InternalFPML.g:487:1: ruleEffectFullSumType : ( ( rule__EffectFullSumType__Group__0 ) ) ;
    public final void ruleEffectFullSumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__EffectFullSumType__Group__0 ) ) )
            // InternalFPML.g:492:2: ( ( rule__EffectFullSumType__Group__0 ) )
            {
            // InternalFPML.g:492:2: ( ( rule__EffectFullSumType__Group__0 ) )
            // InternalFPML.g:493:3: ( rule__EffectFullSumType__Group__0 )
            {
             before(grammarAccess.getEffectFullSumTypeAccess().getGroup()); 
            // InternalFPML.g:494:3: ( rule__EffectFullSumType__Group__0 )
            // InternalFPML.g:494:4: rule__EffectFullSumType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullSumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullSumType"


    // $ANTLR start "entryRuleEffectFullProdType"
    // InternalFPML.g:503:1: entryRuleEffectFullProdType : ruleEffectFullProdType EOF ;
    public final void entryRuleEffectFullProdType() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleEffectFullProdType EOF )
            // InternalFPML.g:505:1: ruleEffectFullProdType EOF
            {
             before(grammarAccess.getEffectFullProdTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullProdType();

            state._fsp--;

             after(grammarAccess.getEffectFullProdTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullProdType"


    // $ANTLR start "ruleEffectFullProdType"
    // InternalFPML.g:512:1: ruleEffectFullProdType : ( ( rule__EffectFullProdType__Group__0 ) ) ;
    public final void ruleEffectFullProdType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__EffectFullProdType__Group__0 ) ) )
            // InternalFPML.g:517:2: ( ( rule__EffectFullProdType__Group__0 ) )
            {
            // InternalFPML.g:517:2: ( ( rule__EffectFullProdType__Group__0 ) )
            // InternalFPML.g:518:3: ( rule__EffectFullProdType__Group__0 )
            {
             before(grammarAccess.getEffectFullProdTypeAccess().getGroup()); 
            // InternalFPML.g:519:3: ( rule__EffectFullProdType__Group__0 )
            // InternalFPML.g:519:4: rule__EffectFullProdType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullProdTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullProdType"


    // $ANTLR start "entryRulePureFunctionDefinition"
    // InternalFPML.g:528:1: entryRulePureFunctionDefinition : rulePureFunctionDefinition EOF ;
    public final void entryRulePureFunctionDefinition() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( rulePureFunctionDefinition EOF )
            // InternalFPML.g:530:1: rulePureFunctionDefinition EOF
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
    // InternalFPML.g:537:1: rulePureFunctionDefinition : ( ( rule__PureFunctionDefinition__Group__0 ) ) ;
    public final void rulePureFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__PureFunctionDefinition__Group__0 ) ) )
            // InternalFPML.g:542:2: ( ( rule__PureFunctionDefinition__Group__0 ) )
            {
            // InternalFPML.g:542:2: ( ( rule__PureFunctionDefinition__Group__0 ) )
            // InternalFPML.g:543:3: ( rule__PureFunctionDefinition__Group__0 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getGroup()); 
            // InternalFPML.g:544:3: ( rule__PureFunctionDefinition__Group__0 )
            // InternalFPML.g:544:4: rule__PureFunctionDefinition__Group__0
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
    // InternalFPML.g:553:1: entryRuleEffectFullFunctionDefinition : ruleEffectFullFunctionDefinition EOF ;
    public final void entryRuleEffectFullFunctionDefinition() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleEffectFullFunctionDefinition EOF )
            // InternalFPML.g:555:1: ruleEffectFullFunctionDefinition EOF
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
    // InternalFPML.g:562:1: ruleEffectFullFunctionDefinition : ( ( rule__EffectFullFunctionDefinition__Group__0 ) ) ;
    public final void ruleEffectFullFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__EffectFullFunctionDefinition__Group__0 ) ) )
            // InternalFPML.g:567:2: ( ( rule__EffectFullFunctionDefinition__Group__0 ) )
            {
            // InternalFPML.g:567:2: ( ( rule__EffectFullFunctionDefinition__Group__0 ) )
            // InternalFPML.g:568:3: ( rule__EffectFullFunctionDefinition__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup()); 
            // InternalFPML.g:569:3: ( rule__EffectFullFunctionDefinition__Group__0 )
            // InternalFPML.g:569:4: rule__EffectFullFunctionDefinition__Group__0
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
    // InternalFPML.g:578:1: entryRuleMainFunc : ruleMainFunc EOF ;
    public final void entryRuleMainFunc() throws RecognitionException {
        try {
            // InternalFPML.g:579:1: ( ruleMainFunc EOF )
            // InternalFPML.g:580:1: ruleMainFunc EOF
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
    // InternalFPML.g:587:1: ruleMainFunc : ( ( rule__MainFunc__Group__0 ) ) ;
    public final void ruleMainFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__MainFunc__Group__0 ) ) )
            // InternalFPML.g:592:2: ( ( rule__MainFunc__Group__0 ) )
            {
            // InternalFPML.g:592:2: ( ( rule__MainFunc__Group__0 ) )
            // InternalFPML.g:593:3: ( rule__MainFunc__Group__0 )
            {
             before(grammarAccess.getMainFuncAccess().getGroup()); 
            // InternalFPML.g:594:3: ( rule__MainFunc__Group__0 )
            // InternalFPML.g:594:4: rule__MainFunc__Group__0
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


    // $ANTLR start "entryRuleAdditionalPureArgument"
    // InternalFPML.g:603:1: entryRuleAdditionalPureArgument : ruleAdditionalPureArgument EOF ;
    public final void entryRuleAdditionalPureArgument() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleAdditionalPureArgument EOF )
            // InternalFPML.g:605:1: ruleAdditionalPureArgument EOF
            {
             before(grammarAccess.getAdditionalPureArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalPureArgument();

            state._fsp--;

             after(grammarAccess.getAdditionalPureArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalPureArgument"


    // $ANTLR start "ruleAdditionalPureArgument"
    // InternalFPML.g:612:1: ruleAdditionalPureArgument : ( ( rule__AdditionalPureArgument__Arg2Assignment ) ) ;
    public final void ruleAdditionalPureArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__AdditionalPureArgument__Arg2Assignment ) ) )
            // InternalFPML.g:617:2: ( ( rule__AdditionalPureArgument__Arg2Assignment ) )
            {
            // InternalFPML.g:617:2: ( ( rule__AdditionalPureArgument__Arg2Assignment ) )
            // InternalFPML.g:618:3: ( rule__AdditionalPureArgument__Arg2Assignment )
            {
             before(grammarAccess.getAdditionalPureArgumentAccess().getArg2Assignment()); 
            // InternalFPML.g:619:3: ( rule__AdditionalPureArgument__Arg2Assignment )
            // InternalFPML.g:619:4: rule__AdditionalPureArgument__Arg2Assignment
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalPureArgument__Arg2Assignment();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalPureArgumentAccess().getArg2Assignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalPureArgument"


    // $ANTLR start "entryRuleAdditionalEffectFullArgument"
    // InternalFPML.g:628:1: entryRuleAdditionalEffectFullArgument : ruleAdditionalEffectFullArgument EOF ;
    public final void entryRuleAdditionalEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleAdditionalEffectFullArgument EOF )
            // InternalFPML.g:630:1: ruleAdditionalEffectFullArgument EOF
            {
             before(grammarAccess.getAdditionalEffectFullArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getAdditionalEffectFullArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalEffectFullArgument"


    // $ANTLR start "ruleAdditionalEffectFullArgument"
    // InternalFPML.g:637:1: ruleAdditionalEffectFullArgument : ( ( rule__AdditionalEffectFullArgument__Arg2Assignment ) ) ;
    public final void ruleAdditionalEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__AdditionalEffectFullArgument__Arg2Assignment ) ) )
            // InternalFPML.g:642:2: ( ( rule__AdditionalEffectFullArgument__Arg2Assignment ) )
            {
            // InternalFPML.g:642:2: ( ( rule__AdditionalEffectFullArgument__Arg2Assignment ) )
            // InternalFPML.g:643:3: ( rule__AdditionalEffectFullArgument__Arg2Assignment )
            {
             before(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2Assignment()); 
            // InternalFPML.g:644:3: ( rule__AdditionalEffectFullArgument__Arg2Assignment )
            // InternalFPML.g:644:4: rule__AdditionalEffectFullArgument__Arg2Assignment
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalEffectFullArgument__Arg2Assignment();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2Assignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalEffectFullArgument"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:653:1: entryRulePureFunction : rulePureFunction EOF ;
    public final void entryRulePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( rulePureFunction EOF )
            // InternalFPML.g:655:1: rulePureFunction EOF
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
    // InternalFPML.g:662:1: rulePureFunction : ( ( rule__PureFunction__Alternatives ) ) ;
    public final void rulePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__PureFunction__Alternatives ) ) )
            // InternalFPML.g:667:2: ( ( rule__PureFunction__Alternatives ) )
            {
            // InternalFPML.g:667:2: ( ( rule__PureFunction__Alternatives ) )
            // InternalFPML.g:668:3: ( rule__PureFunction__Alternatives )
            {
             before(grammarAccess.getPureFunctionAccess().getAlternatives()); 
            // InternalFPML.g:669:3: ( rule__PureFunction__Alternatives )
            // InternalFPML.g:669:4: rule__PureFunction__Alternatives
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
    // InternalFPML.g:678:1: entryRuleEffectFullFunction : ruleEffectFullFunction EOF ;
    public final void entryRuleEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleEffectFullFunction EOF )
            // InternalFPML.g:680:1: ruleEffectFullFunction EOF
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
    // InternalFPML.g:687:1: ruleEffectFullFunction : ( ( rule__EffectFullFunction__Alternatives ) ) ;
    public final void ruleEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__EffectFullFunction__Alternatives ) ) )
            // InternalFPML.g:692:2: ( ( rule__EffectFullFunction__Alternatives ) )
            {
            // InternalFPML.g:692:2: ( ( rule__EffectFullFunction__Alternatives ) )
            // InternalFPML.g:693:3: ( rule__EffectFullFunction__Alternatives )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getAlternatives()); 
            // InternalFPML.g:694:3: ( rule__EffectFullFunction__Alternatives )
            // InternalFPML.g:694:4: rule__EffectFullFunction__Alternatives
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


    // $ANTLR start "entryRulePrimitiveFunction"
    // InternalFPML.g:703:1: entryRulePrimitiveFunction : rulePrimitiveFunction EOF ;
    public final void entryRulePrimitiveFunction() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( rulePrimitiveFunction EOF )
            // InternalFPML.g:705:1: rulePrimitiveFunction EOF
            {
             before(grammarAccess.getPrimitiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveFunction();

            state._fsp--;

             after(grammarAccess.getPrimitiveFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveFunction"


    // $ANTLR start "rulePrimitiveFunction"
    // InternalFPML.g:712:1: rulePrimitiveFunction : ( ( rule__PrimitiveFunction__Alternatives ) ) ;
    public final void rulePrimitiveFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__PrimitiveFunction__Alternatives ) ) )
            // InternalFPML.g:717:2: ( ( rule__PrimitiveFunction__Alternatives ) )
            {
            // InternalFPML.g:717:2: ( ( rule__PrimitiveFunction__Alternatives ) )
            // InternalFPML.g:718:3: ( rule__PrimitiveFunction__Alternatives )
            {
             before(grammarAccess.getPrimitiveFunctionAccess().getAlternatives()); 
            // InternalFPML.g:719:3: ( rule__PrimitiveFunction__Alternatives )
            // InternalFPML.g:719:4: rule__PrimitiveFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveFunction"


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:728:1: entryRuleEffectFullArgument : ruleEffectFullArgument EOF ;
    public final void entryRuleEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleEffectFullArgument EOF )
            // InternalFPML.g:730:1: ruleEffectFullArgument EOF
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
    // InternalFPML.g:737:1: ruleEffectFullArgument : ( ( rule__EffectFullArgument__Group__0 ) ) ;
    public final void ruleEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( ( rule__EffectFullArgument__Group__0 ) ) )
            // InternalFPML.g:742:2: ( ( rule__EffectFullArgument__Group__0 ) )
            {
            // InternalFPML.g:742:2: ( ( rule__EffectFullArgument__Group__0 ) )
            // InternalFPML.g:743:3: ( rule__EffectFullArgument__Group__0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getGroup()); 
            // InternalFPML.g:744:3: ( rule__EffectFullArgument__Group__0 )
            // InternalFPML.g:744:4: rule__EffectFullArgument__Group__0
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
    // InternalFPML.g:753:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleArgument EOF )
            // InternalFPML.g:755:1: ruleArgument EOF
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
    // InternalFPML.g:762:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalFPML.g:767:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalFPML.g:767:2: ( ( rule__Argument__Group__0 ) )
            // InternalFPML.g:768:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalFPML.g:769:3: ( rule__Argument__Group__0 )
            // InternalFPML.g:769:4: rule__Argument__Group__0
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
    // InternalFPML.g:778:1: entryRuleFunctionBodyPure : ruleFunctionBodyPure EOF ;
    public final void entryRuleFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleFunctionBodyPure EOF )
            // InternalFPML.g:780:1: ruleFunctionBodyPure EOF
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
    // InternalFPML.g:787:1: ruleFunctionBodyPure : ( ( rule__FunctionBodyPure__Alternatives ) ) ;
    public final void ruleFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( ( rule__FunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:792:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:792:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            // InternalFPML.g:793:3: ( rule__FunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:794:3: ( rule__FunctionBodyPure__Alternatives )
            // InternalFPML.g:794:4: rule__FunctionBodyPure__Alternatives
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
    // InternalFPML.g:803:1: entryRuleFunctionBodyEffectFull : ruleFunctionBodyEffectFull EOF ;
    public final void entryRuleFunctionBodyEffectFull() throws RecognitionException {
        try {
            // InternalFPML.g:804:1: ( ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:805:1: ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:812:1: ruleFunctionBodyEffectFull : ( ( rule__FunctionBodyEffectFull__Alternatives ) ) ;
    public final void ruleFunctionBodyEffectFull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:816:2: ( ( ( rule__FunctionBodyEffectFull__Alternatives ) ) )
            // InternalFPML.g:817:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            {
            // InternalFPML.g:817:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            // InternalFPML.g:818:3: ( rule__FunctionBodyEffectFull__Alternatives )
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 
            // InternalFPML.g:819:3: ( rule__FunctionBodyEffectFull__Alternatives )
            // InternalFPML.g:819:4: rule__FunctionBodyEffectFull__Alternatives
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
    // InternalFPML.g:828:1: entryRuleEmptyFunctionBody : ruleEmptyFunctionBody EOF ;
    public final void entryRuleEmptyFunctionBody() throws RecognitionException {
        try {
            // InternalFPML.g:829:1: ( ruleEmptyFunctionBody EOF )
            // InternalFPML.g:830:1: ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:837:1: ruleEmptyFunctionBody : ( ( rule__EmptyFunctionBody__Group__0 ) ) ;
    public final void ruleEmptyFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:841:2: ( ( ( rule__EmptyFunctionBody__Group__0 ) ) )
            // InternalFPML.g:842:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            {
            // InternalFPML.g:842:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            // InternalFPML.g:843:3: ( rule__EmptyFunctionBody__Group__0 )
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 
            // InternalFPML.g:844:3: ( rule__EmptyFunctionBody__Group__0 )
            // InternalFPML.g:844:4: rule__EmptyFunctionBody__Group__0
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
    // InternalFPML.g:853:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:854:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:855:1: ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:862:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:866:2: ( ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:867:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:867:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            // InternalFPML.g:868:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:869:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            // InternalFPML.g:869:4: rule__CompositionFunctionBodyPure__Alternatives
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
    // InternalFPML.g:878:1: entryRuleCompositionFunctionBodyPureFactor : ruleCompositionFunctionBodyPureFactor EOF ;
    public final void entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        try {
            // InternalFPML.g:879:1: ( ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:880:1: ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:887:1: ruleCompositionFunctionBodyPureFactor : ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPureFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:891:2: ( ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) )
            // InternalFPML.g:892:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            {
            // InternalFPML.g:892:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            // InternalFPML.g:893:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives()); 
            // InternalFPML.g:894:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            // InternalFPML.g:894:4: rule__CompositionFunctionBodyPureFactor__Alternatives
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
    // InternalFPML.g:903:1: entryRuleCompositionFunctionBodyEffect : ruleCompositionFunctionBodyEffect EOF ;
    public final void entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        try {
            // InternalFPML.g:904:1: ( ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:905:1: ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:912:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:916:2: ( ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) )
            // InternalFPML.g:917:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            {
            // InternalFPML.g:917:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            // InternalFPML.g:918:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives()); 
            // InternalFPML.g:919:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            // InternalFPML.g:919:4: rule__CompositionFunctionBodyEffect__Alternatives
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
    // InternalFPML.g:928:1: entryRuleCompositionFunctionBodyEffectFullFactor : ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final void entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        try {
            // InternalFPML.g:929:1: ( ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:930:1: ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:937:1: ruleCompositionFunctionBodyEffectFullFactor : ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:941:2: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) )
            // InternalFPML.g:942:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            {
            // InternalFPML.g:942:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            // InternalFPML.g:943:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives()); 
            // InternalFPML.g:944:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            // InternalFPML.g:944:4: rule__CompositionFunctionBodyEffectFullFactor__Alternatives
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
    // InternalFPML.g:953:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:954:1: ( ruleIOType EOF )
            // InternalFPML.g:955:1: ruleIOType EOF
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
    // InternalFPML.g:962:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:966:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:967:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:967:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:968:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:969:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:969:4: rule__IOType__Group__0
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
    // InternalFPML.g:978:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:979:1: ( ruleValueType EOF )
            // InternalFPML.g:980:1: ruleValueType EOF
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
    // InternalFPML.g:987:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:991:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:992:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:992:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:993:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:994:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:994:4: rule__ValueType__Alternatives
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
    // InternalFPML.g:1003:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:1004:1: ( ruleType EOF )
            // InternalFPML.g:1005:1: ruleType EOF
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
    // InternalFPML.g:1012:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1016:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:1017:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:1017:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:1018:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:1019:3: ( rule__Type__Alternatives )
            // InternalFPML.g:1019:4: rule__Type__Alternatives
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
    // InternalFPML.g:1028:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:1029:1: ( ruleIntegerType EOF )
            // InternalFPML.g:1030:1: ruleIntegerType EOF
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
    // InternalFPML.g:1037:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1041:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:1042:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:1042:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:1043:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:1044:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:1044:4: rule__IntegerType__Group__0
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
    // InternalFPML.g:1053:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:1054:1: ( ruleStringType EOF )
            // InternalFPML.g:1055:1: ruleStringType EOF
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
    // InternalFPML.g:1062:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1066:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:1067:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:1067:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:1068:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:1069:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:1069:4: rule__StringType__Group__0
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
    // InternalFPML.g:1078:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:1079:1: ( ruleUnitType EOF )
            // InternalFPML.g:1080:1: ruleUnitType EOF
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
    // InternalFPML.g:1087:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1091:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:1092:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:1092:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:1093:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:1094:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:1094:4: rule__UnitType__Group__0
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
    // InternalFPML.g:1103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:1104:1: ( ruleDataType EOF )
            // InternalFPML.g:1105:1: ruleDataType EOF
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
    // InternalFPML.g:1112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:1117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:1117:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:1118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:1119:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:1119:4: rule__DataType__Group__0
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


    // $ANTLR start "entryRuleEffectFullDataType"
    // InternalFPML.g:1128:1: entryRuleEffectFullDataType : ruleEffectFullDataType EOF ;
    public final void entryRuleEffectFullDataType() throws RecognitionException {
        try {
            // InternalFPML.g:1129:1: ( ruleEffectFullDataType EOF )
            // InternalFPML.g:1130:1: ruleEffectFullDataType EOF
            {
             before(grammarAccess.getEffectFullDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullDataType();

            state._fsp--;

             after(grammarAccess.getEffectFullDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullDataType"


    // $ANTLR start "ruleEffectFullDataType"
    // InternalFPML.g:1137:1: ruleEffectFullDataType : ( ( rule__EffectFullDataType__Group__0 ) ) ;
    public final void ruleEffectFullDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1141:2: ( ( ( rule__EffectFullDataType__Group__0 ) ) )
            // InternalFPML.g:1142:2: ( ( rule__EffectFullDataType__Group__0 ) )
            {
            // InternalFPML.g:1142:2: ( ( rule__EffectFullDataType__Group__0 ) )
            // InternalFPML.g:1143:3: ( rule__EffectFullDataType__Group__0 )
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getGroup()); 
            // InternalFPML.g:1144:3: ( rule__EffectFullDataType__Group__0 )
            // InternalFPML.g:1144:4: rule__EffectFullDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullDataType"


    // $ANTLR start "entryRulePureFunctionType"
    // InternalFPML.g:1153:1: entryRulePureFunctionType : rulePureFunctionType EOF ;
    public final void entryRulePureFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:1154:1: ( rulePureFunctionType EOF )
            // InternalFPML.g:1155:1: rulePureFunctionType EOF
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
    // InternalFPML.g:1162:1: rulePureFunctionType : ( ( rule__PureFunctionType__Group__0 ) ) ;
    public final void rulePureFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1166:2: ( ( ( rule__PureFunctionType__Group__0 ) ) )
            // InternalFPML.g:1167:2: ( ( rule__PureFunctionType__Group__0 ) )
            {
            // InternalFPML.g:1167:2: ( ( rule__PureFunctionType__Group__0 ) )
            // InternalFPML.g:1168:3: ( rule__PureFunctionType__Group__0 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:1169:3: ( rule__PureFunctionType__Group__0 )
            // InternalFPML.g:1169:4: rule__PureFunctionType__Group__0
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
    // InternalFPML.g:1178:1: entryRuleEffectFullFunctionType : ruleEffectFullFunctionType EOF ;
    public final void entryRuleEffectFullFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:1179:1: ( ruleEffectFullFunctionType EOF )
            // InternalFPML.g:1180:1: ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:1187:1: ruleEffectFullFunctionType : ( ( rule__EffectFullFunctionType__Group__0 ) ) ;
    public final void ruleEffectFullFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1191:2: ( ( ( rule__EffectFullFunctionType__Group__0 ) ) )
            // InternalFPML.g:1192:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            {
            // InternalFPML.g:1192:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            // InternalFPML.g:1193:3: ( rule__EffectFullFunctionType__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:1194:3: ( rule__EffectFullFunctionType__Group__0 )
            // InternalFPML.g:1194:4: rule__EffectFullFunctionType__Group__0
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


    // $ANTLR start "entryRuleEffectFullExpression"
    // InternalFPML.g:1203:1: entryRuleEffectFullExpression : ruleEffectFullExpression EOF ;
    public final void entryRuleEffectFullExpression() throws RecognitionException {
        try {
            // InternalFPML.g:1204:1: ( ruleEffectFullExpression EOF )
            // InternalFPML.g:1205:1: ruleEffectFullExpression EOF
            {
             before(grammarAccess.getEffectFullExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullExpression();

            state._fsp--;

             after(grammarAccess.getEffectFullExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullExpression"


    // $ANTLR start "ruleEffectFullExpression"
    // InternalFPML.g:1212:1: ruleEffectFullExpression : ( ( rule__EffectFullExpression__Alternatives ) ) ;
    public final void ruleEffectFullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1216:2: ( ( ( rule__EffectFullExpression__Alternatives ) ) )
            // InternalFPML.g:1217:2: ( ( rule__EffectFullExpression__Alternatives ) )
            {
            // InternalFPML.g:1217:2: ( ( rule__EffectFullExpression__Alternatives ) )
            // InternalFPML.g:1218:3: ( rule__EffectFullExpression__Alternatives )
            {
             before(grammarAccess.getEffectFullExpressionAccess().getAlternatives()); 
            // InternalFPML.g:1219:3: ( rule__EffectFullExpression__Alternatives )
            // InternalFPML.g:1219:4: rule__EffectFullExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullExpression"


    // $ANTLR start "entryRuleUnitValue"
    // InternalFPML.g:1228:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalFPML.g:1229:1: ( ruleUnitValue EOF )
            // InternalFPML.g:1230:1: ruleUnitValue EOF
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
    // InternalFPML.g:1237:1: ruleUnitValue : ( ( rule__UnitValue__Group__0 ) ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1241:2: ( ( ( rule__UnitValue__Group__0 ) ) )
            // InternalFPML.g:1242:2: ( ( rule__UnitValue__Group__0 ) )
            {
            // InternalFPML.g:1242:2: ( ( rule__UnitValue__Group__0 ) )
            // InternalFPML.g:1243:3: ( rule__UnitValue__Group__0 )
            {
             before(grammarAccess.getUnitValueAccess().getGroup()); 
            // InternalFPML.g:1244:3: ( rule__UnitValue__Group__0 )
            // InternalFPML.g:1244:4: rule__UnitValue__Group__0
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


    // $ANTLR start "entryRuleEffectFullFunctionValue"
    // InternalFPML.g:1253:1: entryRuleEffectFullFunctionValue : ruleEffectFullFunctionValue EOF ;
    public final void entryRuleEffectFullFunctionValue() throws RecognitionException {
        try {
            // InternalFPML.g:1254:1: ( ruleEffectFullFunctionValue EOF )
            // InternalFPML.g:1255:1: ruleEffectFullFunctionValue EOF
            {
             before(grammarAccess.getEffectFullFunctionValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullFunctionValue();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullFunctionValue"


    // $ANTLR start "ruleEffectFullFunctionValue"
    // InternalFPML.g:1262:1: ruleEffectFullFunctionValue : ( ( rule__EffectFullFunctionValue__ValueAssignment ) ) ;
    public final void ruleEffectFullFunctionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1266:2: ( ( ( rule__EffectFullFunctionValue__ValueAssignment ) ) )
            // InternalFPML.g:1267:2: ( ( rule__EffectFullFunctionValue__ValueAssignment ) )
            {
            // InternalFPML.g:1267:2: ( ( rule__EffectFullFunctionValue__ValueAssignment ) )
            // InternalFPML.g:1268:3: ( rule__EffectFullFunctionValue__ValueAssignment )
            {
             before(grammarAccess.getEffectFullFunctionValueAccess().getValueAssignment()); 
            // InternalFPML.g:1269:3: ( rule__EffectFullFunctionValue__ValueAssignment )
            // InternalFPML.g:1269:4: rule__EffectFullFunctionValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullFunctionValue"


    // $ANTLR start "entryRuleEffectFullValueRef"
    // InternalFPML.g:1278:1: entryRuleEffectFullValueRef : ruleEffectFullValueRef EOF ;
    public final void entryRuleEffectFullValueRef() throws RecognitionException {
        try {
            // InternalFPML.g:1279:1: ( ruleEffectFullValueRef EOF )
            // InternalFPML.g:1280:1: ruleEffectFullValueRef EOF
            {
             before(grammarAccess.getEffectFullValueRefRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullValueRef();

            state._fsp--;

             after(grammarAccess.getEffectFullValueRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullValueRef"


    // $ANTLR start "ruleEffectFullValueRef"
    // InternalFPML.g:1287:1: ruleEffectFullValueRef : ( ( rule__EffectFullValueRef__Group__0 ) ) ;
    public final void ruleEffectFullValueRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1291:2: ( ( ( rule__EffectFullValueRef__Group__0 ) ) )
            // InternalFPML.g:1292:2: ( ( rule__EffectFullValueRef__Group__0 ) )
            {
            // InternalFPML.g:1292:2: ( ( rule__EffectFullValueRef__Group__0 ) )
            // InternalFPML.g:1293:3: ( rule__EffectFullValueRef__Group__0 )
            {
             before(grammarAccess.getEffectFullValueRefAccess().getGroup()); 
            // InternalFPML.g:1294:3: ( rule__EffectFullValueRef__Group__0 )
            // InternalFPML.g:1294:4: rule__EffectFullValueRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValueRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullValueRef"


    // $ANTLR start "entryRuleEffectFullLambda"
    // InternalFPML.g:1303:1: entryRuleEffectFullLambda : ruleEffectFullLambda EOF ;
    public final void entryRuleEffectFullLambda() throws RecognitionException {
        try {
            // InternalFPML.g:1304:1: ( ruleEffectFullLambda EOF )
            // InternalFPML.g:1305:1: ruleEffectFullLambda EOF
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
    // InternalFPML.g:1312:1: ruleEffectFullLambda : ( ( rule__EffectFullLambda__Alternatives ) ) ;
    public final void ruleEffectFullLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1316:2: ( ( ( rule__EffectFullLambda__Alternatives ) ) )
            // InternalFPML.g:1317:2: ( ( rule__EffectFullLambda__Alternatives ) )
            {
            // InternalFPML.g:1317:2: ( ( rule__EffectFullLambda__Alternatives ) )
            // InternalFPML.g:1318:3: ( rule__EffectFullLambda__Alternatives )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getAlternatives()); 
            // InternalFPML.g:1319:3: ( rule__EffectFullLambda__Alternatives )
            // InternalFPML.g:1319:4: rule__EffectFullLambda__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:1328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFPML.g:1329:1: ( ruleExpression EOF )
            // InternalFPML.g:1330:1: ruleExpression EOF
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
    // InternalFPML.g:1337:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1341:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFPML.g:1342:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFPML.g:1342:2: ( ( rule__Expression__Alternatives ) )
            // InternalFPML.g:1343:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFPML.g:1344:3: ( rule__Expression__Alternatives )
            // InternalFPML.g:1344:4: rule__Expression__Alternatives
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
    // InternalFPML.g:1353:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:1354:1: ( ruleIntValue EOF )
            // InternalFPML.g:1355:1: ruleIntValue EOF
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
    // InternalFPML.g:1362:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1366:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalFPML.g:1367:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalFPML.g:1367:2: ( ( rule__IntValue__Group__0 ) )
            // InternalFPML.g:1368:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalFPML.g:1369:3: ( rule__IntValue__Group__0 )
            // InternalFPML.g:1369:4: rule__IntValue__Group__0
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
    // InternalFPML.g:1378:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:1379:1: ( ruleStringValue EOF )
            // InternalFPML.g:1380:1: ruleStringValue EOF
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
    // InternalFPML.g:1387:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1391:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalFPML.g:1392:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalFPML.g:1392:2: ( ( rule__StringValue__Group__0 ) )
            // InternalFPML.g:1393:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalFPML.g:1394:3: ( rule__StringValue__Group__0 )
            // InternalFPML.g:1394:4: rule__StringValue__Group__0
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
    // InternalFPML.g:1403:1: entryRuleFunctionValue : ruleFunctionValue EOF ;
    public final void entryRuleFunctionValue() throws RecognitionException {
        try {
            // InternalFPML.g:1404:1: ( ruleFunctionValue EOF )
            // InternalFPML.g:1405:1: ruleFunctionValue EOF
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
    // InternalFPML.g:1412:1: ruleFunctionValue : ( ( rule__FunctionValue__ValueAssignment ) ) ;
    public final void ruleFunctionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1416:2: ( ( ( rule__FunctionValue__ValueAssignment ) ) )
            // InternalFPML.g:1417:2: ( ( rule__FunctionValue__ValueAssignment ) )
            {
            // InternalFPML.g:1417:2: ( ( rule__FunctionValue__ValueAssignment ) )
            // InternalFPML.g:1418:3: ( rule__FunctionValue__ValueAssignment )
            {
             before(grammarAccess.getFunctionValueAccess().getValueAssignment()); 
            // InternalFPML.g:1419:3: ( rule__FunctionValue__ValueAssignment )
            // InternalFPML.g:1419:4: rule__FunctionValue__ValueAssignment
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
    // InternalFPML.g:1428:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalFPML.g:1429:1: ( ruleDataValue EOF )
            // InternalFPML.g:1430:1: ruleDataValue EOF
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
    // InternalFPML.g:1437:1: ruleDataValue : ( ( rule__DataValue__Group__0 ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1441:2: ( ( ( rule__DataValue__Group__0 ) ) )
            // InternalFPML.g:1442:2: ( ( rule__DataValue__Group__0 ) )
            {
            // InternalFPML.g:1442:2: ( ( rule__DataValue__Group__0 ) )
            // InternalFPML.g:1443:3: ( rule__DataValue__Group__0 )
            {
             before(grammarAccess.getDataValueAccess().getGroup()); 
            // InternalFPML.g:1444:3: ( rule__DataValue__Group__0 )
            // InternalFPML.g:1444:4: rule__DataValue__Group__0
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


    // $ANTLR start "entryRuleEffectFullDataValue"
    // InternalFPML.g:1453:1: entryRuleEffectFullDataValue : ruleEffectFullDataValue EOF ;
    public final void entryRuleEffectFullDataValue() throws RecognitionException {
        try {
            // InternalFPML.g:1454:1: ( ruleEffectFullDataValue EOF )
            // InternalFPML.g:1455:1: ruleEffectFullDataValue EOF
            {
             before(grammarAccess.getEffectFullDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullDataValue();

            state._fsp--;

             after(grammarAccess.getEffectFullDataValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullDataValue"


    // $ANTLR start "ruleEffectFullDataValue"
    // InternalFPML.g:1462:1: ruleEffectFullDataValue : ( ( rule__EffectFullDataValue__Group__0 ) ) ;
    public final void ruleEffectFullDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1466:2: ( ( ( rule__EffectFullDataValue__Group__0 ) ) )
            // InternalFPML.g:1467:2: ( ( rule__EffectFullDataValue__Group__0 ) )
            {
            // InternalFPML.g:1467:2: ( ( rule__EffectFullDataValue__Group__0 ) )
            // InternalFPML.g:1468:3: ( rule__EffectFullDataValue__Group__0 )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getGroup()); 
            // InternalFPML.g:1469:3: ( rule__EffectFullDataValue__Group__0 )
            // InternalFPML.g:1469:4: rule__EffectFullDataValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullDataValue"


    // $ANTLR start "entryRulePureValueRef"
    // InternalFPML.g:1478:1: entryRulePureValueRef : rulePureValueRef EOF ;
    public final void entryRulePureValueRef() throws RecognitionException {
        try {
            // InternalFPML.g:1479:1: ( rulePureValueRef EOF )
            // InternalFPML.g:1480:1: rulePureValueRef EOF
            {
             before(grammarAccess.getPureValueRefRule()); 
            pushFollow(FOLLOW_1);
            rulePureValueRef();

            state._fsp--;

             after(grammarAccess.getPureValueRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureValueRef"


    // $ANTLR start "rulePureValueRef"
    // InternalFPML.g:1487:1: rulePureValueRef : ( ( rule__PureValueRef__Group__0 ) ) ;
    public final void rulePureValueRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1491:2: ( ( ( rule__PureValueRef__Group__0 ) ) )
            // InternalFPML.g:1492:2: ( ( rule__PureValueRef__Group__0 ) )
            {
            // InternalFPML.g:1492:2: ( ( rule__PureValueRef__Group__0 ) )
            // InternalFPML.g:1493:3: ( rule__PureValueRef__Group__0 )
            {
             before(grammarAccess.getPureValueRefAccess().getGroup()); 
            // InternalFPML.g:1494:3: ( rule__PureValueRef__Group__0 )
            // InternalFPML.g:1494:4: rule__PureValueRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureValueRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureValueRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureValueRef"


    // $ANTLR start "entryRulePureLambda"
    // InternalFPML.g:1503:1: entryRulePureLambda : rulePureLambda EOF ;
    public final void entryRulePureLambda() throws RecognitionException {
        try {
            // InternalFPML.g:1504:1: ( rulePureLambda EOF )
            // InternalFPML.g:1505:1: rulePureLambda EOF
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
    // InternalFPML.g:1512:1: rulePureLambda : ( ( rule__PureLambda__Group__0 ) ) ;
    public final void rulePureLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1516:2: ( ( ( rule__PureLambda__Group__0 ) ) )
            // InternalFPML.g:1517:2: ( ( rule__PureLambda__Group__0 ) )
            {
            // InternalFPML.g:1517:2: ( ( rule__PureLambda__Group__0 ) )
            // InternalFPML.g:1518:3: ( rule__PureLambda__Group__0 )
            {
             before(grammarAccess.getPureLambdaAccess().getGroup()); 
            // InternalFPML.g:1519:3: ( rule__PureLambda__Group__0 )
            // InternalFPML.g:1519:4: rule__PureLambda__Group__0
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


    // $ANTLR start "entryRulePureAdtValue"
    // InternalFPML.g:1528:1: entryRulePureAdtValue : rulePureAdtValue EOF ;
    public final void entryRulePureAdtValue() throws RecognitionException {
        try {
            // InternalFPML.g:1529:1: ( rulePureAdtValue EOF )
            // InternalFPML.g:1530:1: rulePureAdtValue EOF
            {
             before(grammarAccess.getPureAdtValueRule()); 
            pushFollow(FOLLOW_1);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getPureAdtValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureAdtValue"


    // $ANTLR start "rulePureAdtValue"
    // InternalFPML.g:1537:1: rulePureAdtValue : ( ( rule__PureAdtValue__Alternatives ) ) ;
    public final void rulePureAdtValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1541:2: ( ( ( rule__PureAdtValue__Alternatives ) ) )
            // InternalFPML.g:1542:2: ( ( rule__PureAdtValue__Alternatives ) )
            {
            // InternalFPML.g:1542:2: ( ( rule__PureAdtValue__Alternatives ) )
            // InternalFPML.g:1543:3: ( rule__PureAdtValue__Alternatives )
            {
             before(grammarAccess.getPureAdtValueAccess().getAlternatives()); 
            // InternalFPML.g:1544:3: ( rule__PureAdtValue__Alternatives )
            // InternalFPML.g:1544:4: rule__PureAdtValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPureAdtValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureAdtValue"


    // $ANTLR start "entryRulePureProdValue"
    // InternalFPML.g:1553:1: entryRulePureProdValue : rulePureProdValue EOF ;
    public final void entryRulePureProdValue() throws RecognitionException {
        try {
            // InternalFPML.g:1554:1: ( rulePureProdValue EOF )
            // InternalFPML.g:1555:1: rulePureProdValue EOF
            {
             before(grammarAccess.getPureProdValueRule()); 
            pushFollow(FOLLOW_1);
            rulePureProdValue();

            state._fsp--;

             after(grammarAccess.getPureProdValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureProdValue"


    // $ANTLR start "rulePureProdValue"
    // InternalFPML.g:1562:1: rulePureProdValue : ( ( rule__PureProdValue__Group__0 ) ) ;
    public final void rulePureProdValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1566:2: ( ( ( rule__PureProdValue__Group__0 ) ) )
            // InternalFPML.g:1567:2: ( ( rule__PureProdValue__Group__0 ) )
            {
            // InternalFPML.g:1567:2: ( ( rule__PureProdValue__Group__0 ) )
            // InternalFPML.g:1568:3: ( rule__PureProdValue__Group__0 )
            {
             before(grammarAccess.getPureProdValueAccess().getGroup()); 
            // InternalFPML.g:1569:3: ( rule__PureProdValue__Group__0 )
            // InternalFPML.g:1569:4: rule__PureProdValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureProdValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureProdValue"


    // $ANTLR start "entryRulePureSumValue"
    // InternalFPML.g:1578:1: entryRulePureSumValue : rulePureSumValue EOF ;
    public final void entryRulePureSumValue() throws RecognitionException {
        try {
            // InternalFPML.g:1579:1: ( rulePureSumValue EOF )
            // InternalFPML.g:1580:1: rulePureSumValue EOF
            {
             before(grammarAccess.getPureSumValueRule()); 
            pushFollow(FOLLOW_1);
            rulePureSumValue();

            state._fsp--;

             after(grammarAccess.getPureSumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureSumValue"


    // $ANTLR start "rulePureSumValue"
    // InternalFPML.g:1587:1: rulePureSumValue : ( ( rule__PureSumValue__Alternatives ) ) ;
    public final void rulePureSumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1591:2: ( ( ( rule__PureSumValue__Alternatives ) ) )
            // InternalFPML.g:1592:2: ( ( rule__PureSumValue__Alternatives ) )
            {
            // InternalFPML.g:1592:2: ( ( rule__PureSumValue__Alternatives ) )
            // InternalFPML.g:1593:3: ( rule__PureSumValue__Alternatives )
            {
             before(grammarAccess.getPureSumValueAccess().getAlternatives()); 
            // InternalFPML.g:1594:3: ( rule__PureSumValue__Alternatives )
            // InternalFPML.g:1594:4: rule__PureSumValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PureSumValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPureSumValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureSumValue"


    // $ANTLR start "entryRuleEffectFullAdtValue"
    // InternalFPML.g:1603:1: entryRuleEffectFullAdtValue : ruleEffectFullAdtValue EOF ;
    public final void entryRuleEffectFullAdtValue() throws RecognitionException {
        try {
            // InternalFPML.g:1604:1: ( ruleEffectFullAdtValue EOF )
            // InternalFPML.g:1605:1: ruleEffectFullAdtValue EOF
            {
             before(grammarAccess.getEffectFullAdtValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullAdtValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullAdtValue"


    // $ANTLR start "ruleEffectFullAdtValue"
    // InternalFPML.g:1612:1: ruleEffectFullAdtValue : ( ( rule__EffectFullAdtValue__Alternatives ) ) ;
    public final void ruleEffectFullAdtValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1616:2: ( ( ( rule__EffectFullAdtValue__Alternatives ) ) )
            // InternalFPML.g:1617:2: ( ( rule__EffectFullAdtValue__Alternatives ) )
            {
            // InternalFPML.g:1617:2: ( ( rule__EffectFullAdtValue__Alternatives ) )
            // InternalFPML.g:1618:3: ( rule__EffectFullAdtValue__Alternatives )
            {
             before(grammarAccess.getEffectFullAdtValueAccess().getAlternatives()); 
            // InternalFPML.g:1619:3: ( rule__EffectFullAdtValue__Alternatives )
            // InternalFPML.g:1619:4: rule__EffectFullAdtValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullAdtValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullAdtValue"


    // $ANTLR start "entryRuleEffectFullProdValue"
    // InternalFPML.g:1628:1: entryRuleEffectFullProdValue : ruleEffectFullProdValue EOF ;
    public final void entryRuleEffectFullProdValue() throws RecognitionException {
        try {
            // InternalFPML.g:1629:1: ( ruleEffectFullProdValue EOF )
            // InternalFPML.g:1630:1: ruleEffectFullProdValue EOF
            {
             before(grammarAccess.getEffectFullProdValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullProdValue();

            state._fsp--;

             after(grammarAccess.getEffectFullProdValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullProdValue"


    // $ANTLR start "ruleEffectFullProdValue"
    // InternalFPML.g:1637:1: ruleEffectFullProdValue : ( ( rule__EffectFullProdValue__Group__0 ) ) ;
    public final void ruleEffectFullProdValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1641:2: ( ( ( rule__EffectFullProdValue__Group__0 ) ) )
            // InternalFPML.g:1642:2: ( ( rule__EffectFullProdValue__Group__0 ) )
            {
            // InternalFPML.g:1642:2: ( ( rule__EffectFullProdValue__Group__0 ) )
            // InternalFPML.g:1643:3: ( rule__EffectFullProdValue__Group__0 )
            {
             before(grammarAccess.getEffectFullProdValueAccess().getGroup()); 
            // InternalFPML.g:1644:3: ( rule__EffectFullProdValue__Group__0 )
            // InternalFPML.g:1644:4: rule__EffectFullProdValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullProdValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullProdValue"


    // $ANTLR start "entryRuleEffectFullSumValue"
    // InternalFPML.g:1653:1: entryRuleEffectFullSumValue : ruleEffectFullSumValue EOF ;
    public final void entryRuleEffectFullSumValue() throws RecognitionException {
        try {
            // InternalFPML.g:1654:1: ( ruleEffectFullSumValue EOF )
            // InternalFPML.g:1655:1: ruleEffectFullSumValue EOF
            {
             before(grammarAccess.getEffectFullSumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullSumValue();

            state._fsp--;

             after(grammarAccess.getEffectFullSumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullSumValue"


    // $ANTLR start "ruleEffectFullSumValue"
    // InternalFPML.g:1662:1: ruleEffectFullSumValue : ( ( rule__EffectFullSumValue__Alternatives ) ) ;
    public final void ruleEffectFullSumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1666:2: ( ( ( rule__EffectFullSumValue__Alternatives ) ) )
            // InternalFPML.g:1667:2: ( ( rule__EffectFullSumValue__Alternatives ) )
            {
            // InternalFPML.g:1667:2: ( ( rule__EffectFullSumValue__Alternatives ) )
            // InternalFPML.g:1668:3: ( rule__EffectFullSumValue__Alternatives )
            {
             before(grammarAccess.getEffectFullSumValueAccess().getAlternatives()); 
            // InternalFPML.g:1669:3: ( rule__EffectFullSumValue__Alternatives )
            // InternalFPML.g:1669:4: rule__EffectFullSumValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullSumValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullSumValue"


    // $ANTLR start "entryRulePrimitivePureFunction"
    // InternalFPML.g:1678:1: entryRulePrimitivePureFunction : rulePrimitivePureFunction EOF ;
    public final void entryRulePrimitivePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1679:1: ( rulePrimitivePureFunction EOF )
            // InternalFPML.g:1680:1: rulePrimitivePureFunction EOF
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
    // InternalFPML.g:1687:1: rulePrimitivePureFunction : ( ( rule__PrimitivePureFunction__Alternatives ) ) ;
    public final void rulePrimitivePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1691:2: ( ( ( rule__PrimitivePureFunction__Alternatives ) ) )
            // InternalFPML.g:1692:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            {
            // InternalFPML.g:1692:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            // InternalFPML.g:1693:3: ( rule__PrimitivePureFunction__Alternatives )
            {
             before(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1694:3: ( rule__PrimitivePureFunction__Alternatives )
            // InternalFPML.g:1694:4: rule__PrimitivePureFunction__Alternatives
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
    // InternalFPML.g:1703:1: entryRuleIntToString : ruleIntToString EOF ;
    public final void entryRuleIntToString() throws RecognitionException {
        try {
            // InternalFPML.g:1704:1: ( ruleIntToString EOF )
            // InternalFPML.g:1705:1: ruleIntToString EOF
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
    // InternalFPML.g:1712:1: ruleIntToString : ( ( rule__IntToString__Group__0 ) ) ;
    public final void ruleIntToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1716:2: ( ( ( rule__IntToString__Group__0 ) ) )
            // InternalFPML.g:1717:2: ( ( rule__IntToString__Group__0 ) )
            {
            // InternalFPML.g:1717:2: ( ( rule__IntToString__Group__0 ) )
            // InternalFPML.g:1718:3: ( rule__IntToString__Group__0 )
            {
             before(grammarAccess.getIntToStringAccess().getGroup()); 
            // InternalFPML.g:1719:3: ( rule__IntToString__Group__0 )
            // InternalFPML.g:1719:4: rule__IntToString__Group__0
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
    // InternalFPML.g:1728:1: entryRuleIntPow : ruleIntPow EOF ;
    public final void entryRuleIntPow() throws RecognitionException {
        try {
            // InternalFPML.g:1729:1: ( ruleIntPow EOF )
            // InternalFPML.g:1730:1: ruleIntPow EOF
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
    // InternalFPML.g:1737:1: ruleIntPow : ( ( rule__IntPow__Group__0 ) ) ;
    public final void ruleIntPow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1741:2: ( ( ( rule__IntPow__Group__0 ) ) )
            // InternalFPML.g:1742:2: ( ( rule__IntPow__Group__0 ) )
            {
            // InternalFPML.g:1742:2: ( ( rule__IntPow__Group__0 ) )
            // InternalFPML.g:1743:3: ( rule__IntPow__Group__0 )
            {
             before(grammarAccess.getIntPowAccess().getGroup()); 
            // InternalFPML.g:1744:3: ( rule__IntPow__Group__0 )
            // InternalFPML.g:1744:4: rule__IntPow__Group__0
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
    // InternalFPML.g:1753:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalFPML.g:1754:1: ( rulePlus EOF )
            // InternalFPML.g:1755:1: rulePlus EOF
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
    // InternalFPML.g:1762:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1766:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalFPML.g:1767:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalFPML.g:1767:2: ( ( rule__Plus__Group__0 ) )
            // InternalFPML.g:1768:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalFPML.g:1769:3: ( rule__Plus__Group__0 )
            // InternalFPML.g:1769:4: rule__Plus__Group__0
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
    // InternalFPML.g:1778:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalFPML.g:1779:1: ( ruleMinus EOF )
            // InternalFPML.g:1780:1: ruleMinus EOF
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
    // InternalFPML.g:1787:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1791:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalFPML.g:1792:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalFPML.g:1792:2: ( ( rule__Minus__Group__0 ) )
            // InternalFPML.g:1793:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalFPML.g:1794:3: ( rule__Minus__Group__0 )
            // InternalFPML.g:1794:4: rule__Minus__Group__0
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
    // InternalFPML.g:1803:1: entryRuleTimes : ruleTimes EOF ;
    public final void entryRuleTimes() throws RecognitionException {
        try {
            // InternalFPML.g:1804:1: ( ruleTimes EOF )
            // InternalFPML.g:1805:1: ruleTimes EOF
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
    // InternalFPML.g:1812:1: ruleTimes : ( ( rule__Times__Group__0 ) ) ;
    public final void ruleTimes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1816:2: ( ( ( rule__Times__Group__0 ) ) )
            // InternalFPML.g:1817:2: ( ( rule__Times__Group__0 ) )
            {
            // InternalFPML.g:1817:2: ( ( rule__Times__Group__0 ) )
            // InternalFPML.g:1818:3: ( rule__Times__Group__0 )
            {
             before(grammarAccess.getTimesAccess().getGroup()); 
            // InternalFPML.g:1819:3: ( rule__Times__Group__0 )
            // InternalFPML.g:1819:4: rule__Times__Group__0
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
    // InternalFPML.g:1828:1: entryRuleMod : ruleMod EOF ;
    public final void entryRuleMod() throws RecognitionException {
        try {
            // InternalFPML.g:1829:1: ( ruleMod EOF )
            // InternalFPML.g:1830:1: ruleMod EOF
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
    // InternalFPML.g:1837:1: ruleMod : ( ( rule__Mod__Group__0 ) ) ;
    public final void ruleMod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1841:2: ( ( ( rule__Mod__Group__0 ) ) )
            // InternalFPML.g:1842:2: ( ( rule__Mod__Group__0 ) )
            {
            // InternalFPML.g:1842:2: ( ( rule__Mod__Group__0 ) )
            // InternalFPML.g:1843:3: ( rule__Mod__Group__0 )
            {
             before(grammarAccess.getModAccess().getGroup()); 
            // InternalFPML.g:1844:3: ( rule__Mod__Group__0 )
            // InternalFPML.g:1844:4: rule__Mod__Group__0
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
    // InternalFPML.g:1853:1: entryRuleApplyF : ruleApplyF EOF ;
    public final void entryRuleApplyF() throws RecognitionException {
        try {
            // InternalFPML.g:1854:1: ( ruleApplyF EOF )
            // InternalFPML.g:1855:1: ruleApplyF EOF
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
    // InternalFPML.g:1862:1: ruleApplyF : ( ( rule__ApplyF__Group__0 ) ) ;
    public final void ruleApplyF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1866:2: ( ( ( rule__ApplyF__Group__0 ) ) )
            // InternalFPML.g:1867:2: ( ( rule__ApplyF__Group__0 ) )
            {
            // InternalFPML.g:1867:2: ( ( rule__ApplyF__Group__0 ) )
            // InternalFPML.g:1868:3: ( rule__ApplyF__Group__0 )
            {
             before(grammarAccess.getApplyFAccess().getGroup()); 
            // InternalFPML.g:1869:3: ( rule__ApplyF__Group__0 )
            // InternalFPML.g:1869:4: rule__ApplyF__Group__0
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
    // InternalFPML.g:1878:1: entryRulePrimitiveEffectFullFunction : rulePrimitiveEffectFullFunction EOF ;
    public final void entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1879:1: ( rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:1880:1: rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:1887:1: rulePrimitiveEffectFullFunction : ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) ;
    public final void rulePrimitiveEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1891:2: ( ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) )
            // InternalFPML.g:1892:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            {
            // InternalFPML.g:1892:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            // InternalFPML.g:1893:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            {
             before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1894:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            // InternalFPML.g:1894:4: rule__PrimitiveEffectFullFunction__Alternatives
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
    // InternalFPML.g:1903:1: entryRulePrimitivePrint : rulePrimitivePrint EOF ;
    public final void entryRulePrimitivePrint() throws RecognitionException {
        try {
            // InternalFPML.g:1904:1: ( rulePrimitivePrint EOF )
            // InternalFPML.g:1905:1: rulePrimitivePrint EOF
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
    // InternalFPML.g:1912:1: rulePrimitivePrint : ( ( rule__PrimitivePrint__Group__0 ) ) ;
    public final void rulePrimitivePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1916:2: ( ( ( rule__PrimitivePrint__Group__0 ) ) )
            // InternalFPML.g:1917:2: ( ( rule__PrimitivePrint__Group__0 ) )
            {
            // InternalFPML.g:1917:2: ( ( rule__PrimitivePrint__Group__0 ) )
            // InternalFPML.g:1918:3: ( rule__PrimitivePrint__Group__0 )
            {
             before(grammarAccess.getPrimitivePrintAccess().getGroup()); 
            // InternalFPML.g:1919:3: ( rule__PrimitivePrint__Group__0 )
            // InternalFPML.g:1919:4: rule__PrimitivePrint__Group__0
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


    // $ANTLR start "entryRulePrimitiveEffectFullValue"
    // InternalFPML.g:1928:1: entryRulePrimitiveEffectFullValue : rulePrimitiveEffectFullValue EOF ;
    public final void entryRulePrimitiveEffectFullValue() throws RecognitionException {
        try {
            // InternalFPML.g:1929:1: ( rulePrimitiveEffectFullValue EOF )
            // InternalFPML.g:1930:1: rulePrimitiveEffectFullValue EOF
            {
             before(grammarAccess.getPrimitiveEffectFullValueRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveEffectFullValue();

            state._fsp--;

             after(grammarAccess.getPrimitiveEffectFullValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveEffectFullValue"


    // $ANTLR start "rulePrimitiveEffectFullValue"
    // InternalFPML.g:1937:1: rulePrimitiveEffectFullValue : ( ( rule__PrimitiveEffectFullValue__Alternatives ) ) ;
    public final void rulePrimitiveEffectFullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1941:2: ( ( ( rule__PrimitiveEffectFullValue__Alternatives ) ) )
            // InternalFPML.g:1942:2: ( ( rule__PrimitiveEffectFullValue__Alternatives ) )
            {
            // InternalFPML.g:1942:2: ( ( rule__PrimitiveEffectFullValue__Alternatives ) )
            // InternalFPML.g:1943:3: ( rule__PrimitiveEffectFullValue__Alternatives )
            {
             before(grammarAccess.getPrimitiveEffectFullValueAccess().getAlternatives()); 
            // InternalFPML.g:1944:3: ( rule__PrimitiveEffectFullValue__Alternatives )
            // InternalFPML.g:1944:4: rule__PrimitiveEffectFullValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveEffectFullValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveEffectFullValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveEffectFullValue"


    // $ANTLR start "entryRulePrimitiveRandom"
    // InternalFPML.g:1953:1: entryRulePrimitiveRandom : rulePrimitiveRandom EOF ;
    public final void entryRulePrimitiveRandom() throws RecognitionException {
        try {
            // InternalFPML.g:1954:1: ( rulePrimitiveRandom EOF )
            // InternalFPML.g:1955:1: rulePrimitiveRandom EOF
            {
             before(grammarAccess.getPrimitiveRandomRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveRandom();

            state._fsp--;

             after(grammarAccess.getPrimitiveRandomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveRandom"


    // $ANTLR start "rulePrimitiveRandom"
    // InternalFPML.g:1962:1: rulePrimitiveRandom : ( ( rule__PrimitiveRandom__Group__0 ) ) ;
    public final void rulePrimitiveRandom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1966:2: ( ( ( rule__PrimitiveRandom__Group__0 ) ) )
            // InternalFPML.g:1967:2: ( ( rule__PrimitiveRandom__Group__0 ) )
            {
            // InternalFPML.g:1967:2: ( ( rule__PrimitiveRandom__Group__0 ) )
            // InternalFPML.g:1968:3: ( rule__PrimitiveRandom__Group__0 )
            {
             before(grammarAccess.getPrimitiveRandomAccess().getGroup()); 
            // InternalFPML.g:1969:3: ( rule__PrimitiveRandom__Group__0 )
            // InternalFPML.g:1969:4: rule__PrimitiveRandom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveRandom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveRandomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveRandom"


    // $ANTLR start "entryRulePrimitiveReturn"
    // InternalFPML.g:1978:1: entryRulePrimitiveReturn : rulePrimitiveReturn EOF ;
    public final void entryRulePrimitiveReturn() throws RecognitionException {
        try {
            // InternalFPML.g:1979:1: ( rulePrimitiveReturn EOF )
            // InternalFPML.g:1980:1: rulePrimitiveReturn EOF
            {
             before(grammarAccess.getPrimitiveReturnRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveReturn();

            state._fsp--;

             after(grammarAccess.getPrimitiveReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveReturn"


    // $ANTLR start "rulePrimitiveReturn"
    // InternalFPML.g:1987:1: rulePrimitiveReturn : ( ( rule__PrimitiveReturn__Group__0 ) ) ;
    public final void rulePrimitiveReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1991:2: ( ( ( rule__PrimitiveReturn__Group__0 ) ) )
            // InternalFPML.g:1992:2: ( ( rule__PrimitiveReturn__Group__0 ) )
            {
            // InternalFPML.g:1992:2: ( ( rule__PrimitiveReturn__Group__0 ) )
            // InternalFPML.g:1993:3: ( rule__PrimitiveReturn__Group__0 )
            {
             before(grammarAccess.getPrimitiveReturnAccess().getGroup()); 
            // InternalFPML.g:1994:3: ( rule__PrimitiveReturn__Group__0 )
            // InternalFPML.g:1994:4: rule__PrimitiveReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveReturn"


    // $ANTLR start "entryRulePrimitiveTime"
    // InternalFPML.g:2003:1: entryRulePrimitiveTime : rulePrimitiveTime EOF ;
    public final void entryRulePrimitiveTime() throws RecognitionException {
        try {
            // InternalFPML.g:2004:1: ( rulePrimitiveTime EOF )
            // InternalFPML.g:2005:1: rulePrimitiveTime EOF
            {
             before(grammarAccess.getPrimitiveTimeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTime();

            state._fsp--;

             after(grammarAccess.getPrimitiveTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveTime"


    // $ANTLR start "rulePrimitiveTime"
    // InternalFPML.g:2012:1: rulePrimitiveTime : ( ( rule__PrimitiveTime__Group__0 ) ) ;
    public final void rulePrimitiveTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2016:2: ( ( ( rule__PrimitiveTime__Group__0 ) ) )
            // InternalFPML.g:2017:2: ( ( rule__PrimitiveTime__Group__0 ) )
            {
            // InternalFPML.g:2017:2: ( ( rule__PrimitiveTime__Group__0 ) )
            // InternalFPML.g:2018:3: ( rule__PrimitiveTime__Group__0 )
            {
             before(grammarAccess.getPrimitiveTimeAccess().getGroup()); 
            // InternalFPML.g:2019:3: ( rule__PrimitiveTime__Group__0 )
            // InternalFPML.g:2019:4: rule__PrimitiveTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTime"


    // $ANTLR start "entryRuleApplyFIO"
    // InternalFPML.g:2028:1: entryRuleApplyFIO : ruleApplyFIO EOF ;
    public final void entryRuleApplyFIO() throws RecognitionException {
        try {
            // InternalFPML.g:2029:1: ( ruleApplyFIO EOF )
            // InternalFPML.g:2030:1: ruleApplyFIO EOF
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
    // InternalFPML.g:2037:1: ruleApplyFIO : ( ( rule__ApplyFIO__Group__0 ) ) ;
    public final void ruleApplyFIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2041:2: ( ( ( rule__ApplyFIO__Group__0 ) ) )
            // InternalFPML.g:2042:2: ( ( rule__ApplyFIO__Group__0 ) )
            {
            // InternalFPML.g:2042:2: ( ( rule__ApplyFIO__Group__0 ) )
            // InternalFPML.g:2043:3: ( rule__ApplyFIO__Group__0 )
            {
             before(grammarAccess.getApplyFIOAccess().getGroup()); 
            // InternalFPML.g:2044:3: ( rule__ApplyFIO__Group__0 )
            // InternalFPML.g:2044:4: rule__ApplyFIO__Group__0
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


    // $ANTLR start "entryRuleApplyFIOFactor"
    // InternalFPML.g:2053:1: entryRuleApplyFIOFactor : ruleApplyFIOFactor EOF ;
    public final void entryRuleApplyFIOFactor() throws RecognitionException {
        try {
            // InternalFPML.g:2054:1: ( ruleApplyFIOFactor EOF )
            // InternalFPML.g:2055:1: ruleApplyFIOFactor EOF
            {
             before(grammarAccess.getApplyFIOFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleApplyFIOFactor();

            state._fsp--;

             after(grammarAccess.getApplyFIOFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyFIOFactor"


    // $ANTLR start "ruleApplyFIOFactor"
    // InternalFPML.g:2062:1: ruleApplyFIOFactor : ( ( rule__ApplyFIOFactor__Alternatives ) ) ;
    public final void ruleApplyFIOFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2066:2: ( ( ( rule__ApplyFIOFactor__Alternatives ) ) )
            // InternalFPML.g:2067:2: ( ( rule__ApplyFIOFactor__Alternatives ) )
            {
            // InternalFPML.g:2067:2: ( ( rule__ApplyFIOFactor__Alternatives ) )
            // InternalFPML.g:2068:3: ( rule__ApplyFIOFactor__Alternatives )
            {
             before(grammarAccess.getApplyFIOFactorAccess().getAlternatives()); 
            // InternalFPML.g:2069:3: ( rule__ApplyFIOFactor__Alternatives )
            // InternalFPML.g:2069:4: rule__ApplyFIOFactor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIOFactor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplyFIOFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyFIOFactor"


    // $ANTLR start "rule__PureAdtType__Alternatives"
    // InternalFPML.g:2077:1: rule__PureAdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__PureAdtType__Group_1__0 ) ) );
    public final void rule__PureAdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2081:1: ( ( ruleValueType ) | ( ( rule__PureAdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32||LA1_0==34||(LA1_0>=51 && LA1_0<=52)) ) {
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
                    // InternalFPML.g:2082:2: ( ruleValueType )
                    {
                    // InternalFPML.g:2082:2: ( ruleValueType )
                    // InternalFPML.g:2083:3: ruleValueType
                    {
                     before(grammarAccess.getPureAdtTypeAccess().getValueTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getPureAdtTypeAccess().getValueTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2088:2: ( ( rule__PureAdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:2088:2: ( ( rule__PureAdtType__Group_1__0 ) )
                    // InternalFPML.g:2089:3: ( rule__PureAdtType__Group_1__0 )
                    {
                     before(grammarAccess.getPureAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:2090:3: ( rule__PureAdtType__Group_1__0 )
                    // InternalFPML.g:2090:4: rule__PureAdtType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureAdtType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPureAdtTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PureAdtType__Alternatives"


    // $ANTLR start "rule__PureAdtType__PureAdtElement2Alternatives_1_2_0"
    // InternalFPML.g:2098:1: rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 : ( ( rulePureSumType ) | ( rulePureProdType ) );
    public final void rule__PureAdtType__PureAdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2102:1: ( ( rulePureSumType ) | ( rulePureProdType ) )
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
                    // InternalFPML.g:2103:2: ( rulePureSumType )
                    {
                    // InternalFPML.g:2103:2: ( rulePureSumType )
                    // InternalFPML.g:2104:3: rulePureSumType
                    {
                     before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureSumTypeParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePureSumType();

                    state._fsp--;

                     after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureSumTypeParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2109:2: ( rulePureProdType )
                    {
                    // InternalFPML.g:2109:2: ( rulePureProdType )
                    // InternalFPML.g:2110:3: rulePureProdType
                    {
                     before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureProdTypeParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePureProdType();

                    state._fsp--;

                     after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureProdTypeParserRuleCall_1_2_0_1()); 

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
    // $ANTLR end "rule__PureAdtType__PureAdtElement2Alternatives_1_2_0"


    // $ANTLR start "rule__EffectFullAdtType__Alternatives"
    // InternalFPML.g:2119:1: rule__EffectFullAdtType__Alternatives : ( ( ruleIOType ) | ( ( rule__EffectFullAdtType__Group_1__0 ) ) );
    public final void rule__EffectFullAdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2123:1: ( ( ruleIOType ) | ( ( rule__EffectFullAdtType__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFPML.g:2124:2: ( ruleIOType )
                    {
                    // InternalFPML.g:2124:2: ( ruleIOType )
                    // InternalFPML.g:2125:3: ruleIOType
                    {
                     before(grammarAccess.getEffectFullAdtTypeAccess().getIOTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIOType();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtTypeAccess().getIOTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2130:2: ( ( rule__EffectFullAdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:2130:2: ( ( rule__EffectFullAdtType__Group_1__0 ) )
                    // InternalFPML.g:2131:3: ( rule__EffectFullAdtType__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:2132:3: ( rule__EffectFullAdtType__Group_1__0 )
                    // InternalFPML.g:2132:4: rule__EffectFullAdtType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullAdtType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullAdtTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EffectFullAdtType__Alternatives"


    // $ANTLR start "rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0"
    // InternalFPML.g:2140:1: rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 : ( ( ruleEffectFullSumType ) | ( ruleEffectFullProdType ) );
    public final void rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2144:1: ( ( ruleEffectFullSumType ) | ( ruleEffectFullProdType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:2145:2: ( ruleEffectFullSumType )
                    {
                    // InternalFPML.g:2145:2: ( ruleEffectFullSumType )
                    // InternalFPML.g:2146:3: ruleEffectFullSumType
                    {
                     before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullSumTypeParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullSumType();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullSumTypeParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2151:2: ( ruleEffectFullProdType )
                    {
                    // InternalFPML.g:2151:2: ( ruleEffectFullProdType )
                    // InternalFPML.g:2152:3: ruleEffectFullProdType
                    {
                     before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullProdTypeParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullProdType();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullProdTypeParserRuleCall_1_2_0_1()); 

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
    // $ANTLR end "rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0"


    // $ANTLR start "rule__PureFunction__Alternatives"
    // InternalFPML.g:2161:1: rule__PureFunction__Alternatives : ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) );
    public final void rule__PureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2165:1: ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
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
                    // InternalFPML.g:2166:2: ( rulePureFunctionDefinition )
                    {
                    // InternalFPML.g:2166:2: ( rulePureFunctionDefinition )
                    // InternalFPML.g:2167:3: rulePureFunctionDefinition
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
                    // InternalFPML.g:2172:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2172:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:2173:3: rulePrimitivePureFunction
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
    // InternalFPML.g:2182:1: rule__EffectFullFunction__Alternatives : ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) );
    public final void rule__EffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2186:1: ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==46||LA6_0==50) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFPML.g:2187:2: ( ruleEffectFullFunctionDefinition )
                    {
                    // InternalFPML.g:2187:2: ( ruleEffectFullFunctionDefinition )
                    // InternalFPML.g:2188:3: ruleEffectFullFunctionDefinition
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
                    // InternalFPML.g:2193:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:2193:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:2194:3: rulePrimitiveEffectFullFunction
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


    // $ANTLR start "rule__PrimitiveFunction__Alternatives"
    // InternalFPML.g:2203:1: rule__PrimitiveFunction__Alternatives : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) | ( rulePrimitiveEffectFullValue ) );
    public final void rule__PrimitiveFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2207:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) | ( rulePrimitiveEffectFullValue ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 46:
            case 50:
                {
                alt7=1;
                }
                break;
            case 21:
            case 22:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt7=2;
                }
                break;
            case 47:
            case 48:
            case 49:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFPML.g:2208:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:2208:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:2209:3: rulePrimitiveEffectFullFunction
                    {
                     before(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2214:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2214:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:2215:3: rulePrimitivePureFunction
                    {
                     before(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePureFunction();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2220:2: ( rulePrimitiveEffectFullValue )
                    {
                    // InternalFPML.g:2220:2: ( rulePrimitiveEffectFullValue )
                    // InternalFPML.g:2221:3: rulePrimitiveEffectFullValue
                    {
                     before(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveEffectFullValue();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__PrimitiveFunction__Alternatives"


    // $ANTLR start "rule__FunctionBodyPure__Alternatives"
    // InternalFPML.g:2230:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2234:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=22)||(LA8_0>=41 && LA8_0<=45)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:2235:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:2235:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:2236:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:2241:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:2241:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:2242:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:2251:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2255:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||(LA9_0>=21 && LA9_0<=22)||(LA9_0>=41 && LA9_0<=50)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFPML.g:2256:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:2256:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:2257:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:2262:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:2262:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:2263:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:2272:1: rule__CompositionFunctionBodyPure__Alternatives : ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2276:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
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
                    // InternalFPML.g:2277:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:2277:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:2278:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:2279:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:2279:4: rule__CompositionFunctionBodyPure__Group_0__0
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
                    // InternalFPML.g:2283:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    {
                    // InternalFPML.g:2283:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    // InternalFPML.g:2284:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
                    // InternalFPML.g:2285:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    // InternalFPML.g:2285:4: rule__CompositionFunctionBodyPure__Group_1__0
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
    // InternalFPML.g:2293:1: rule__CompositionFunctionBodyPureFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPureFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2297:1: ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=21 && LA11_1<=22)||(LA11_1>=41 && LA11_1<=45)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID) ) {
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
                    // InternalFPML.g:2298:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:2298:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    // InternalFPML.g:2299:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 
                    // InternalFPML.g:2300:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    // InternalFPML.g:2300:4: rule__CompositionFunctionBodyPureFactor__Group_0__0
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
                    // InternalFPML.g:2304:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:2304:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    // InternalFPML.g:2305:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 
                    // InternalFPML.g:2306:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    // InternalFPML.g:2306:4: rule__CompositionFunctionBodyPureFactor__Group_1__0
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
    // InternalFPML.g:2314:1: rule__CompositionFunctionBodyEffect__Alternatives : ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2318:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=21 && LA12_0<=22)||(LA12_0>=41 && LA12_0<=50)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:2319:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    {
                    // InternalFPML.g:2319:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    // InternalFPML.g:2320:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
                    // InternalFPML.g:2321:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    // InternalFPML.g:2321:4: rule__CompositionFunctionBodyEffect__Group_0__0
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
                    // InternalFPML.g:2325:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    {
                    // InternalFPML.g:2325:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    // InternalFPML.g:2326:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
                    // InternalFPML.g:2327:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    // InternalFPML.g:2327:4: rule__CompositionFunctionBodyEffect__Group_1__0
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
    // InternalFPML.g:2335:1: rule__CompositionFunctionBodyEffectFullFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2339:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=21 && LA13_1<=22)||(LA13_1>=41 && LA13_1<=50)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:2340:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:2340:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    // InternalFPML.g:2341:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 
                    // InternalFPML.g:2342:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    // InternalFPML.g:2342:4: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0
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
                    // InternalFPML.g:2346:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:2346:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    // InternalFPML.g:2347:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 
                    // InternalFPML.g:2348:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    // InternalFPML.g:2348:4: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0
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


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalFPML.g:2356:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2360:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt14=1;
                }
                break;
            case 52:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 34:
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
                    // InternalFPML.g:2361:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:2361:2: ( ruleIntegerType )
                    // InternalFPML.g:2362:3: ruleIntegerType
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
                    // InternalFPML.g:2367:2: ( ruleStringType )
                    {
                    // InternalFPML.g:2367:2: ( ruleStringType )
                    // InternalFPML.g:2368:3: ruleStringType
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
                    // InternalFPML.g:2373:2: ( ruleDataType )
                    {
                    // InternalFPML.g:2373:2: ( ruleDataType )
                    // InternalFPML.g:2374:3: ruleDataType
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
                    // InternalFPML.g:2379:2: ( rulePureFunctionType )
                    {
                    // InternalFPML.g:2379:2: ( rulePureFunctionType )
                    // InternalFPML.g:2380:3: rulePureFunctionType
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
    // InternalFPML.g:2389:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) | ( ruleEffectFullDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2393:1: ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) | ( ruleEffectFullDataType ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
            case 51:
            case 52:
                {
                alt15=1;
                }
                break;
            case 53:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 33:
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
                    // InternalFPML.g:2394:2: ( ruleValueType )
                    {
                    // InternalFPML.g:2394:2: ( ruleValueType )
                    // InternalFPML.g:2395:3: ruleValueType
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
                    // InternalFPML.g:2400:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:2400:2: ( ruleUnitType )
                    // InternalFPML.g:2401:3: ruleUnitType
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
                    // InternalFPML.g:2406:2: ( ruleEffectFullFunctionType )
                    {
                    // InternalFPML.g:2406:2: ( ruleEffectFullFunctionType )
                    // InternalFPML.g:2407:3: ruleEffectFullFunctionType
                    {
                     before(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunctionType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:2412:2: ( ruleEffectFullDataType )
                    {
                    // InternalFPML.g:2412:2: ( ruleEffectFullDataType )
                    // InternalFPML.g:2413:3: ruleEffectFullDataType
                    {
                     before(grammarAccess.getTypeAccess().getEffectFullDataTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEffectFullDataTypeParserRuleCall_3()); 

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


    // $ANTLR start "rule__EffectFullExpression__Alternatives"
    // InternalFPML.g:2422:1: rule__EffectFullExpression__Alternatives : ( ( ( rule__EffectFullExpression__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullDataValue ) );
    public final void rule__EffectFullExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2426:1: ( ( ( rule__EffectFullExpression__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullDataValue ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 19:
            case 21:
            case 22:
            case 29:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==31) ) {
                    alt16=3;
                }
                else if ( (LA16_4==24) ) {
                    alt16=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFPML.g:2427:2: ( ( rule__EffectFullExpression__Group_0__0 ) )
                    {
                    // InternalFPML.g:2427:2: ( ( rule__EffectFullExpression__Group_0__0 ) )
                    // InternalFPML.g:2428:3: ( rule__EffectFullExpression__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullExpressionAccess().getGroup_0()); 
                    // InternalFPML.g:2429:3: ( rule__EffectFullExpression__Group_0__0 )
                    // InternalFPML.g:2429:4: rule__EffectFullExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2433:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:2433:2: ( ruleUnitValue )
                    // InternalFPML.g:2434:3: ruleUnitValue
                    {
                     before(grammarAccess.getEffectFullExpressionAccess().getUnitValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullExpressionAccess().getUnitValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2439:2: ( ruleEffectFullFunctionValue )
                    {
                    // InternalFPML.g:2439:2: ( ruleEffectFullFunctionValue )
                    // InternalFPML.g:2440:3: ruleEffectFullFunctionValue
                    {
                     before(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:2445:2: ( ruleEffectFullDataValue )
                    {
                    // InternalFPML.g:2445:2: ( ruleEffectFullDataValue )
                    // InternalFPML.g:2446:3: ruleEffectFullDataValue
                    {
                     before(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullDataValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_3()); 

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
    // $ANTLR end "rule__EffectFullExpression__Alternatives"


    // $ANTLR start "rule__EffectFullLambda__Alternatives"
    // InternalFPML.g:2455:1: rule__EffectFullLambda__Alternatives : ( ( ( rule__EffectFullLambda__Group_0__0 ) ) | ( ( rule__EffectFullLambda__Group_1__0 ) ) );
    public final void rule__EffectFullLambda__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2459:1: ( ( ( rule__EffectFullLambda__Group_0__0 ) ) | ( ( rule__EffectFullLambda__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||(LA17_0>=21 && LA17_0<=22)||LA17_0==29||(LA17_0>=41 && LA17_0<=50)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:2460:2: ( ( rule__EffectFullLambda__Group_0__0 ) )
                    {
                    // InternalFPML.g:2460:2: ( ( rule__EffectFullLambda__Group_0__0 ) )
                    // InternalFPML.g:2461:3: ( rule__EffectFullLambda__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullLambdaAccess().getGroup_0()); 
                    // InternalFPML.g:2462:3: ( rule__EffectFullLambda__Group_0__0 )
                    // InternalFPML.g:2462:4: rule__EffectFullLambda__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullLambda__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullLambdaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2466:2: ( ( rule__EffectFullLambda__Group_1__0 ) )
                    {
                    // InternalFPML.g:2466:2: ( ( rule__EffectFullLambda__Group_1__0 ) )
                    // InternalFPML.g:2467:3: ( rule__EffectFullLambda__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullLambdaAccess().getGroup_1()); 
                    // InternalFPML.g:2468:3: ( rule__EffectFullLambda__Group_1__0 )
                    // InternalFPML.g:2468:4: rule__EffectFullLambda__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullLambda__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullLambdaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EffectFullLambda__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFPML.g:2476:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2480:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_STRING:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
                {
                alt18=3;
                }
                break;
            case 24:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalFPML.g:2481:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:2481:2: ( ruleIntValue )
                    // InternalFPML.g:2482:3: ruleIntValue
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
                    // InternalFPML.g:2487:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:2487:2: ( ruleStringValue )
                    // InternalFPML.g:2488:3: ruleStringValue
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
                    // InternalFPML.g:2493:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:2493:2: ( ruleDataValue )
                    // InternalFPML.g:2494:3: ruleDataValue
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
                    // InternalFPML.g:2499:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:2499:2: ( ruleFunctionValue )
                    // InternalFPML.g:2500:3: ruleFunctionValue
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


    // $ANTLR start "rule__PureAdtValue__Alternatives"
    // InternalFPML.g:2509:1: rule__PureAdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) );
    public final void rule__PureAdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2513:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) )
            int alt19=7;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFPML.g:2514:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:2514:2: ( ruleIntValue )
                    // InternalFPML.g:2515:3: ruleIntValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2520:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:2520:2: ( ruleStringValue )
                    // InternalFPML.g:2521:3: ruleStringValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2526:2: ( rulePureValueRef )
                    {
                    // InternalFPML.g:2526:2: ( rulePureValueRef )
                    // InternalFPML.g:2527:3: rulePureValueRef
                    {
                     before(grammarAccess.getPureAdtValueAccess().getPureValueRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePureValueRef();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getPureValueRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:2532:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:2532:2: ( ruleDataValue )
                    // InternalFPML.g:2533:3: ruleDataValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getDataValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getDataValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:2538:2: ( rulePureSumValue )
                    {
                    // InternalFPML.g:2538:2: ( rulePureSumValue )
                    // InternalFPML.g:2539:3: rulePureSumValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getPureSumValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePureSumValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getPureSumValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFPML.g:2544:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:2544:2: ( ruleFunctionValue )
                    // InternalFPML.g:2545:3: ruleFunctionValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getFunctionValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getFunctionValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFPML.g:2550:2: ( rulePureProdValue )
                    {
                    // InternalFPML.g:2550:2: ( rulePureProdValue )
                    // InternalFPML.g:2551:3: rulePureProdValue
                    {
                     before(grammarAccess.getPureAdtValueAccess().getPureProdValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    rulePureProdValue();

                    state._fsp--;

                     after(grammarAccess.getPureAdtValueAccess().getPureProdValueParserRuleCall_6()); 

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
    // $ANTLR end "rule__PureAdtValue__Alternatives"


    // $ANTLR start "rule__PureSumValue__Alternatives"
    // InternalFPML.g:2560:1: rule__PureSumValue__Alternatives : ( ( ( rule__PureSumValue__Group_0__0 ) ) | ( ( rule__PureSumValue__Group_1__0 ) ) );
    public final void rule__PureSumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2564:1: ( ( ( rule__PureSumValue__Group_0__0 ) ) | ( ( rule__PureSumValue__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFPML.g:2565:2: ( ( rule__PureSumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2565:2: ( ( rule__PureSumValue__Group_0__0 ) )
                    // InternalFPML.g:2566:3: ( rule__PureSumValue__Group_0__0 )
                    {
                     before(grammarAccess.getPureSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:2567:3: ( rule__PureSumValue__Group_0__0 )
                    // InternalFPML.g:2567:4: rule__PureSumValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureSumValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPureSumValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2571:2: ( ( rule__PureSumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:2571:2: ( ( rule__PureSumValue__Group_1__0 ) )
                    // InternalFPML.g:2572:3: ( rule__PureSumValue__Group_1__0 )
                    {
                     before(grammarAccess.getPureSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:2573:3: ( rule__PureSumValue__Group_1__0 )
                    // InternalFPML.g:2573:4: rule__PureSumValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureSumValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPureSumValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PureSumValue__Alternatives"


    // $ANTLR start "rule__EffectFullAdtValue__Alternatives"
    // InternalFPML.g:2581:1: rule__EffectFullAdtValue__Alternatives : ( ( ( rule__EffectFullAdtValue__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullProdValue ) | ( ruleEffectFullValueRef ) | ( ruleEffectFullSumValue ) );
    public final void rule__EffectFullAdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2585:1: ( ( ( rule__EffectFullAdtValue__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullProdValue ) | ( ruleEffectFullValueRef ) | ( ruleEffectFullSumValue ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 19:
            case 21:
            case 22:
            case 29:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                int LA21_4 = input.LA(2);

                if ( (LA21_4==31) ) {
                    alt21=3;
                }
                else if ( (LA21_4==EOF||(LA21_4>=25 && LA21_4<=26)) ) {
                    alt21=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt21=4;
                }
                break;
            case 39:
            case 40:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFPML.g:2586:2: ( ( rule__EffectFullAdtValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2586:2: ( ( rule__EffectFullAdtValue__Group_0__0 ) )
                    // InternalFPML.g:2587:3: ( rule__EffectFullAdtValue__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getGroup_0()); 
                    // InternalFPML.g:2588:3: ( rule__EffectFullAdtValue__Group_0__0 )
                    // InternalFPML.g:2588:4: rule__EffectFullAdtValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullAdtValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullAdtValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2592:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:2592:2: ( ruleUnitValue )
                    // InternalFPML.g:2593:3: ruleUnitValue
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getUnitValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtValueAccess().getUnitValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2598:2: ( ruleEffectFullFunctionValue )
                    {
                    // InternalFPML.g:2598:2: ( ruleEffectFullFunctionValue )
                    // InternalFPML.g:2599:3: ruleEffectFullFunctionValue
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getEffectFullFunctionValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtValueAccess().getEffectFullFunctionValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:2604:2: ( ruleEffectFullProdValue )
                    {
                    // InternalFPML.g:2604:2: ( ruleEffectFullProdValue )
                    // InternalFPML.g:2605:3: ruleEffectFullProdValue
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getEffectFullProdValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullProdValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtValueAccess().getEffectFullProdValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:2610:2: ( ruleEffectFullValueRef )
                    {
                    // InternalFPML.g:2610:2: ( ruleEffectFullValueRef )
                    // InternalFPML.g:2611:3: ruleEffectFullValueRef
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getEffectFullValueRefParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullValueRef();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtValueAccess().getEffectFullValueRefParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFPML.g:2616:2: ( ruleEffectFullSumValue )
                    {
                    // InternalFPML.g:2616:2: ( ruleEffectFullSumValue )
                    // InternalFPML.g:2617:3: ruleEffectFullSumValue
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getEffectFullSumValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullSumValue();

                    state._fsp--;

                     after(grammarAccess.getEffectFullAdtValueAccess().getEffectFullSumValueParserRuleCall_5()); 

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
    // $ANTLR end "rule__EffectFullAdtValue__Alternatives"


    // $ANTLR start "rule__EffectFullSumValue__Alternatives"
    // InternalFPML.g:2626:1: rule__EffectFullSumValue__Alternatives : ( ( ( rule__EffectFullSumValue__Group_0__0 ) ) | ( ( rule__EffectFullSumValue__Group_1__0 ) ) );
    public final void rule__EffectFullSumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2630:1: ( ( ( rule__EffectFullSumValue__Group_0__0 ) ) | ( ( rule__EffectFullSumValue__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFPML.g:2631:2: ( ( rule__EffectFullSumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2631:2: ( ( rule__EffectFullSumValue__Group_0__0 ) )
                    // InternalFPML.g:2632:3: ( rule__EffectFullSumValue__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:2633:3: ( rule__EffectFullSumValue__Group_0__0 )
                    // InternalFPML.g:2633:4: rule__EffectFullSumValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullSumValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullSumValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2637:2: ( ( rule__EffectFullSumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:2637:2: ( ( rule__EffectFullSumValue__Group_1__0 ) )
                    // InternalFPML.g:2638:3: ( rule__EffectFullSumValue__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:2639:3: ( rule__EffectFullSumValue__Group_1__0 )
                    // InternalFPML.g:2639:4: rule__EffectFullSumValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullSumValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectFullSumValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EffectFullSumValue__Alternatives"


    // $ANTLR start "rule__PrimitivePureFunction__Alternatives"
    // InternalFPML.g:2647:1: rule__PrimitivePureFunction__Alternatives : ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) );
    public final void rule__PrimitivePureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2651:1: ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt23=1;
                }
                break;
            case 42:
                {
                alt23=2;
                }
                break;
            case 21:
                {
                alt23=3;
                }
                break;
            case 43:
                {
                alt23=4;
                }
                break;
            case 22:
                {
                alt23=5;
                }
                break;
            case 44:
                {
                alt23=6;
                }
                break;
            case 45:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFPML.g:2652:2: ( ruleIntToString )
                    {
                    // InternalFPML.g:2652:2: ( ruleIntToString )
                    // InternalFPML.g:2653:3: ruleIntToString
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
                    // InternalFPML.g:2658:2: ( ruleIntPow )
                    {
                    // InternalFPML.g:2658:2: ( ruleIntPow )
                    // InternalFPML.g:2659:3: ruleIntPow
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
                    // InternalFPML.g:2664:2: ( rulePlus )
                    {
                    // InternalFPML.g:2664:2: ( rulePlus )
                    // InternalFPML.g:2665:3: rulePlus
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
                    // InternalFPML.g:2670:2: ( ruleMinus )
                    {
                    // InternalFPML.g:2670:2: ( ruleMinus )
                    // InternalFPML.g:2671:3: ruleMinus
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
                    // InternalFPML.g:2676:2: ( ruleTimes )
                    {
                    // InternalFPML.g:2676:2: ( ruleTimes )
                    // InternalFPML.g:2677:3: ruleTimes
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
                    // InternalFPML.g:2682:2: ( ruleMod )
                    {
                    // InternalFPML.g:2682:2: ( ruleMod )
                    // InternalFPML.g:2683:3: ruleMod
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
                    // InternalFPML.g:2688:2: ( ruleApplyF )
                    {
                    // InternalFPML.g:2688:2: ( ruleApplyF )
                    // InternalFPML.g:2689:3: ruleApplyF
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
    // InternalFPML.g:2698:1: rule__PrimitiveEffectFullFunction__Alternatives : ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) );
    public final void rule__PrimitiveEffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2702:1: ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2703:2: ( rulePrimitivePrint )
                    {
                    // InternalFPML.g:2703:2: ( rulePrimitivePrint )
                    // InternalFPML.g:2704:3: rulePrimitivePrint
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
                    // InternalFPML.g:2709:2: ( ruleApplyFIO )
                    {
                    // InternalFPML.g:2709:2: ( ruleApplyFIO )
                    // InternalFPML.g:2710:3: ruleApplyFIO
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


    // $ANTLR start "rule__PrimitiveEffectFullValue__Alternatives"
    // InternalFPML.g:2719:1: rule__PrimitiveEffectFullValue__Alternatives : ( ( rulePrimitiveRandom ) | ( rulePrimitiveReturn ) | ( rulePrimitiveTime ) );
    public final void rule__PrimitiveEffectFullValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2723:1: ( ( rulePrimitiveRandom ) | ( rulePrimitiveReturn ) | ( rulePrimitiveTime ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt25=1;
                }
                break;
            case 48:
                {
                alt25=2;
                }
                break;
            case 49:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2724:2: ( rulePrimitiveRandom )
                    {
                    // InternalFPML.g:2724:2: ( rulePrimitiveRandom )
                    // InternalFPML.g:2725:3: rulePrimitiveRandom
                    {
                     before(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveRandom();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2730:2: ( rulePrimitiveReturn )
                    {
                    // InternalFPML.g:2730:2: ( rulePrimitiveReturn )
                    // InternalFPML.g:2731:3: rulePrimitiveReturn
                    {
                     before(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveReturnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveReturn();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveReturnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2736:2: ( rulePrimitiveTime )
                    {
                    // InternalFPML.g:2736:2: ( rulePrimitiveTime )
                    // InternalFPML.g:2737:3: rulePrimitiveTime
                    {
                     before(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveTimeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveTime();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveTimeParserRuleCall_2()); 

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
    // $ANTLR end "rule__PrimitiveEffectFullValue__Alternatives"


    // $ANTLR start "rule__ApplyFIOFactor__Alternatives"
    // InternalFPML.g:2746:1: rule__ApplyFIOFactor__Alternatives : ( ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) ) | ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) ) );
    public final void rule__ApplyFIOFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2750:1: ( ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) ) | ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=47 && LA26_0<=49)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFPML.g:2751:2: ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) )
                    {
                    // InternalFPML.g:2751:2: ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) )
                    // InternalFPML.g:2752:3: ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 )
                    {
                     before(grammarAccess.getApplyFIOFactorAccess().getValueReferenceAssignment_0()); 
                    // InternalFPML.g:2753:3: ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 )
                    // InternalFPML.g:2753:4: rule__ApplyFIOFactor__ValueReferenceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFIOFactor__ValueReferenceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyFIOFactorAccess().getValueReferenceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2757:2: ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) )
                    {
                    // InternalFPML.g:2757:2: ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) )
                    // InternalFPML.g:2758:3: ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 )
                    {
                     before(grammarAccess.getApplyFIOFactorAccess().getValuePrimitiveAssignment_1()); 
                    // InternalFPML.g:2759:3: ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 )
                    // InternalFPML.g:2759:4: rule__ApplyFIOFactor__ValuePrimitiveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFIOFactor__ValuePrimitiveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyFIOFactorAccess().getValuePrimitiveAssignment_1()); 

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
    // $ANTLR end "rule__ApplyFIOFactor__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFPML.g:2767:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2771:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:2772:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:2779:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2783:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:2784:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:2784:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:2785:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:2786:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:2786:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:2794:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2798:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:2799:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:2805:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2809:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:2810:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:2810:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:2811:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:2812:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:2812:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:2821:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2825:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:2826:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:2833:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2837:1: ( ( 'Pure' ) )
            // InternalFPML.g:2838:1: ( 'Pure' )
            {
            // InternalFPML.g:2838:1: ( 'Pure' )
            // InternalFPML.g:2839:2: 'Pure'
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
    // InternalFPML.g:2848:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2852:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:2853:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:2860:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2864:1: ( ( '{' ) )
            // InternalFPML.g:2865:1: ( '{' )
            {
            // InternalFPML.g:2865:1: ( '{' )
            // InternalFPML.g:2866:2: '{'
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
    // InternalFPML.g:2875:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2879:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:2880:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:2887:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2891:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:2892:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:2892:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:2893:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2894:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:2894:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:2902:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2906:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:2907:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:2914:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2918:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:2919:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:2919:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:2920:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:2921:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:2921:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:2929:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2933:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:2934:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:2940:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2944:1: ( ( '}' ) )
            // InternalFPML.g:2945:1: ( '}' )
            {
            // InternalFPML.g:2945:1: ( '}' )
            // InternalFPML.g:2946:2: '}'
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
    // InternalFPML.g:2956:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2960:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:2961:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:2968:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2972:1: ( ( 'Functions' ) )
            // InternalFPML.g:2973:1: ( 'Functions' )
            {
            // InternalFPML.g:2973:1: ( 'Functions' )
            // InternalFPML.g:2974:2: 'Functions'
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
    // InternalFPML.g:2983:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2987:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:2988:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:2995:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2999:1: ( ( '{' ) )
            // InternalFPML.g:3000:1: ( '{' )
            {
            // InternalFPML.g:3000:1: ( '{' )
            // InternalFPML.g:3001:2: '{'
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
    // InternalFPML.g:3010:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3014:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:3015:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:3022:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3026:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:3027:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:3027:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:3028:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:3029:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFPML.g:3029:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalFPML.g:3037:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3041:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:3042:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:3048:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3052:1: ( ( '}' ) )
            // InternalFPML.g:3053:1: ( '}' )
            {
            // InternalFPML.g:3053:1: ( '}' )
            // InternalFPML.g:3054:2: '}'
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


    // $ANTLR start "rule__PureDataBlock__Group__0"
    // InternalFPML.g:3064:1: rule__PureDataBlock__Group__0 : rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1 ;
    public final void rule__PureDataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3068:1: ( rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1 )
            // InternalFPML.g:3069:2: rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PureDataBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__0"


    // $ANTLR start "rule__PureDataBlock__Group__0__Impl"
    // InternalFPML.g:3076:1: rule__PureDataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__PureDataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3080:1: ( ( 'Data' ) )
            // InternalFPML.g:3081:1: ( 'Data' )
            {
            // InternalFPML.g:3081:1: ( 'Data' )
            // InternalFPML.g:3082:2: 'Data'
            {
             before(grammarAccess.getPureDataBlockAccess().getDataKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPureDataBlockAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__0__Impl"


    // $ANTLR start "rule__PureDataBlock__Group__1"
    // InternalFPML.g:3091:1: rule__PureDataBlock__Group__1 : rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2 ;
    public final void rule__PureDataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3095:1: ( rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2 )
            // InternalFPML.g:3096:2: rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PureDataBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__1"


    // $ANTLR start "rule__PureDataBlock__Group__1__Impl"
    // InternalFPML.g:3103:1: rule__PureDataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureDataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3107:1: ( ( '{' ) )
            // InternalFPML.g:3108:1: ( '{' )
            {
            // InternalFPML.g:3108:1: ( '{' )
            // InternalFPML.g:3109:2: '{'
            {
             before(grammarAccess.getPureDataBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureDataBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__1__Impl"


    // $ANTLR start "rule__PureDataBlock__Group__2"
    // InternalFPML.g:3118:1: rule__PureDataBlock__Group__2 : rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3 ;
    public final void rule__PureDataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3122:1: ( rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3 )
            // InternalFPML.g:3123:2: rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PureDataBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__2"


    // $ANTLR start "rule__PureDataBlock__Group__2__Impl"
    // InternalFPML.g:3130:1: rule__PureDataBlock__Group__2__Impl : ( ( rule__PureDataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__PureDataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3134:1: ( ( ( rule__PureDataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3135:1: ( ( rule__PureDataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3135:1: ( ( rule__PureDataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3136:2: ( rule__PureDataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPureDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3137:2: ( rule__PureDataBlock__ElementsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFPML.g:3137:3: rule__PureDataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PureDataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPureDataBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__2__Impl"


    // $ANTLR start "rule__PureDataBlock__Group__3"
    // InternalFPML.g:3145:1: rule__PureDataBlock__Group__3 : rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4 ;
    public final void rule__PureDataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3149:1: ( rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4 )
            // InternalFPML.g:3150:2: rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PureDataBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__3"


    // $ANTLR start "rule__PureDataBlock__Group__3__Impl"
    // InternalFPML.g:3157:1: rule__PureDataBlock__Group__3__Impl : ( ( rule__PureDataBlock__ValueAssignment_3 ) ) ;
    public final void rule__PureDataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3161:1: ( ( ( rule__PureDataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:3162:1: ( ( rule__PureDataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3162:1: ( ( rule__PureDataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:3163:2: ( rule__PureDataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getPureDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:3164:2: ( rule__PureDataBlock__ValueAssignment_3 )
            // InternalFPML.g:3164:3: rule__PureDataBlock__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PureDataBlock__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPureDataBlockAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__3__Impl"


    // $ANTLR start "rule__PureDataBlock__Group__4"
    // InternalFPML.g:3172:1: rule__PureDataBlock__Group__4 : rule__PureDataBlock__Group__4__Impl ;
    public final void rule__PureDataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3176:1: ( rule__PureDataBlock__Group__4__Impl )
            // InternalFPML.g:3177:2: rule__PureDataBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureDataBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__4"


    // $ANTLR start "rule__PureDataBlock__Group__4__Impl"
    // InternalFPML.g:3183:1: rule__PureDataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureDataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3187:1: ( ( '}' ) )
            // InternalFPML.g:3188:1: ( '}' )
            {
            // InternalFPML.g:3188:1: ( '}' )
            // InternalFPML.g:3189:2: '}'
            {
             before(grammarAccess.getPureDataBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureDataBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__Group__4__Impl"


    // $ANTLR start "rule__PureValueBlock__Group__0"
    // InternalFPML.g:3199:1: rule__PureValueBlock__Group__0 : rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1 ;
    public final void rule__PureValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3203:1: ( rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1 )
            // InternalFPML.g:3204:2: rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PureValueBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValueBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__0"


    // $ANTLR start "rule__PureValueBlock__Group__0__Impl"
    // InternalFPML.g:3211:1: rule__PureValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__PureValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3215:1: ( ( 'Value' ) )
            // InternalFPML.g:3216:1: ( 'Value' )
            {
            // InternalFPML.g:3216:1: ( 'Value' )
            // InternalFPML.g:3217:2: 'Value'
            {
             before(grammarAccess.getPureValueBlockAccess().getValueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPureValueBlockAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__0__Impl"


    // $ANTLR start "rule__PureValueBlock__Group__1"
    // InternalFPML.g:3226:1: rule__PureValueBlock__Group__1 : rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2 ;
    public final void rule__PureValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3230:1: ( rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2 )
            // InternalFPML.g:3231:2: rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PureValueBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValueBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__1"


    // $ANTLR start "rule__PureValueBlock__Group__1__Impl"
    // InternalFPML.g:3238:1: rule__PureValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3242:1: ( ( '{' ) )
            // InternalFPML.g:3243:1: ( '{' )
            {
            // InternalFPML.g:3243:1: ( '{' )
            // InternalFPML.g:3244:2: '{'
            {
             before(grammarAccess.getPureValueBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureValueBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__1__Impl"


    // $ANTLR start "rule__PureValueBlock__Group__2"
    // InternalFPML.g:3253:1: rule__PureValueBlock__Group__2 : rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3 ;
    public final void rule__PureValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3257:1: ( rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3 )
            // InternalFPML.g:3258:2: rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PureValueBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValueBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__2"


    // $ANTLR start "rule__PureValueBlock__Group__2__Impl"
    // InternalFPML.g:3265:1: rule__PureValueBlock__Group__2__Impl : ( ( rule__PureValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__PureValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3269:1: ( ( ( rule__PureValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3270:1: ( ( rule__PureValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3270:1: ( ( rule__PureValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3271:2: ( rule__PureValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPureValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3272:2: ( rule__PureValueBlock__ElementsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFPML.g:3272:3: rule__PureValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PureValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPureValueBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__2__Impl"


    // $ANTLR start "rule__PureValueBlock__Group__3"
    // InternalFPML.g:3280:1: rule__PureValueBlock__Group__3 : rule__PureValueBlock__Group__3__Impl ;
    public final void rule__PureValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3284:1: ( rule__PureValueBlock__Group__3__Impl )
            // InternalFPML.g:3285:2: rule__PureValueBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureValueBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__3"


    // $ANTLR start "rule__PureValueBlock__Group__3__Impl"
    // InternalFPML.g:3291:1: rule__PureValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3295:1: ( ( '}' ) )
            // InternalFPML.g:3296:1: ( '}' )
            {
            // InternalFPML.g:3296:1: ( '}' )
            // InternalFPML.g:3297:2: '}'
            {
             before(grammarAccess.getPureValueBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureValueBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__0"
    // InternalFPML.g:3307:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3311:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:3312:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:3319:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3323:1: ( ( 'Effects' ) )
            // InternalFPML.g:3324:1: ( 'Effects' )
            {
            // InternalFPML.g:3324:1: ( 'Effects' )
            // InternalFPML.g:3325:2: 'Effects'
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
    // InternalFPML.g:3334:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3338:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:3339:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalFPML.g:3346:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3350:1: ( ( '{' ) )
            // InternalFPML.g:3351:1: ( '{' )
            {
            // InternalFPML.g:3351:1: ( '{' )
            // InternalFPML.g:3352:2: '{'
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
    // InternalFPML.g:3361:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3365:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:3366:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalFPML.g:3373:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__ElementsAssignment_2 ) ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3377:1: ( ( ( rule__EffectFullBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:3378:1: ( ( rule__EffectFullBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:3378:1: ( ( rule__EffectFullBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:3379:2: ( rule__EffectFullBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3380:2: ( rule__EffectFullBlock__ElementsAssignment_2 )
            // InternalFPML.g:3380:3: rule__EffectFullBlock__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // InternalFPML.g:3388:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3392:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:3393:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:3400:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__ElementsAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3404:1: ( ( ( rule__EffectFullBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:3405:1: ( ( rule__EffectFullBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:3405:1: ( ( rule__EffectFullBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:3406:2: ( rule__EffectFullBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:3407:2: ( rule__EffectFullBlock__ElementsAssignment_3 )
            // InternalFPML.g:3407:3: rule__EffectFullBlock__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_3()); 

            }


            }

        }
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
    // InternalFPML.g:3415:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3419:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:3420:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:3426:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3430:1: ( ( '}' ) )
            // InternalFPML.g:3431:1: ( '}' )
            {
            // InternalFPML.g:3431:1: ( '}' )
            // InternalFPML.g:3432:2: '}'
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


    // $ANTLR start "rule__EffectFullDataBlock__Group__0"
    // InternalFPML.g:3442:1: rule__EffectFullDataBlock__Group__0 : rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1 ;
    public final void rule__EffectFullDataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3446:1: ( rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1 )
            // InternalFPML.g:3447:2: rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullDataBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__0"


    // $ANTLR start "rule__EffectFullDataBlock__Group__0__Impl"
    // InternalFPML.g:3454:1: rule__EffectFullDataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__EffectFullDataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3458:1: ( ( 'Data' ) )
            // InternalFPML.g:3459:1: ( 'Data' )
            {
            // InternalFPML.g:3459:1: ( 'Data' )
            // InternalFPML.g:3460:2: 'Data'
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getDataKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataBlockAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__0__Impl"


    // $ANTLR start "rule__EffectFullDataBlock__Group__1"
    // InternalFPML.g:3469:1: rule__EffectFullDataBlock__Group__1 : rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2 ;
    public final void rule__EffectFullDataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3473:1: ( rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2 )
            // InternalFPML.g:3474:2: rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EffectFullDataBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__1"


    // $ANTLR start "rule__EffectFullDataBlock__Group__1__Impl"
    // InternalFPML.g:3481:1: rule__EffectFullDataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullDataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3485:1: ( ( '{' ) )
            // InternalFPML.g:3486:1: ( '{' )
            {
            // InternalFPML.g:3486:1: ( '{' )
            // InternalFPML.g:3487:2: '{'
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__1__Impl"


    // $ANTLR start "rule__EffectFullDataBlock__Group__2"
    // InternalFPML.g:3496:1: rule__EffectFullDataBlock__Group__2 : rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3 ;
    public final void rule__EffectFullDataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3500:1: ( rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3 )
            // InternalFPML.g:3501:2: rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EffectFullDataBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__2"


    // $ANTLR start "rule__EffectFullDataBlock__Group__2__Impl"
    // InternalFPML.g:3508:1: rule__EffectFullDataBlock__Group__2__Impl : ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__EffectFullDataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3512:1: ( ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3513:1: ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3513:1: ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3514:2: ( rule__EffectFullDataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3515:2: ( rule__EffectFullDataBlock__ElementsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFPML.g:3515:3: rule__EffectFullDataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EffectFullDataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEffectFullDataBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__2__Impl"


    // $ANTLR start "rule__EffectFullDataBlock__Group__3"
    // InternalFPML.g:3523:1: rule__EffectFullDataBlock__Group__3 : rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4 ;
    public final void rule__EffectFullDataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3527:1: ( rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4 )
            // InternalFPML.g:3528:2: rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullDataBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__3"


    // $ANTLR start "rule__EffectFullDataBlock__Group__3__Impl"
    // InternalFPML.g:3535:1: rule__EffectFullDataBlock__Group__3__Impl : ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullDataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3539:1: ( ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:3540:1: ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3540:1: ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:3541:2: ( rule__EffectFullDataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:3542:2: ( rule__EffectFullDataBlock__ValueAssignment_3 )
            // InternalFPML.g:3542:3: rule__EffectFullDataBlock__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataBlockAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullDataBlock__Group__4"
    // InternalFPML.g:3550:1: rule__EffectFullDataBlock__Group__4 : rule__EffectFullDataBlock__Group__4__Impl ;
    public final void rule__EffectFullDataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3554:1: ( rule__EffectFullDataBlock__Group__4__Impl )
            // InternalFPML.g:3555:2: rule__EffectFullDataBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__4"


    // $ANTLR start "rule__EffectFullDataBlock__Group__4__Impl"
    // InternalFPML.g:3561:1: rule__EffectFullDataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullDataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3565:1: ( ( '}' ) )
            // InternalFPML.g:3566:1: ( '}' )
            {
            // InternalFPML.g:3566:1: ( '}' )
            // InternalFPML.g:3567:2: '}'
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__Group__4__Impl"


    // $ANTLR start "rule__EffectFullValueBlock__Group__0"
    // InternalFPML.g:3577:1: rule__EffectFullValueBlock__Group__0 : rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1 ;
    public final void rule__EffectFullValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3581:1: ( rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1 )
            // InternalFPML.g:3582:2: rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullValueBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValueBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__0"


    // $ANTLR start "rule__EffectFullValueBlock__Group__0__Impl"
    // InternalFPML.g:3589:1: rule__EffectFullValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__EffectFullValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3593:1: ( ( 'Value' ) )
            // InternalFPML.g:3594:1: ( 'Value' )
            {
            // InternalFPML.g:3594:1: ( 'Value' )
            // InternalFPML.g:3595:2: 'Value'
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getValueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueBlockAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__0__Impl"


    // $ANTLR start "rule__EffectFullValueBlock__Group__1"
    // InternalFPML.g:3604:1: rule__EffectFullValueBlock__Group__1 : rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2 ;
    public final void rule__EffectFullValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3608:1: ( rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2 )
            // InternalFPML.g:3609:2: rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EffectFullValueBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValueBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__1"


    // $ANTLR start "rule__EffectFullValueBlock__Group__1__Impl"
    // InternalFPML.g:3616:1: rule__EffectFullValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3620:1: ( ( '{' ) )
            // InternalFPML.g:3621:1: ( '{' )
            {
            // InternalFPML.g:3621:1: ( '{' )
            // InternalFPML.g:3622:2: '{'
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__1__Impl"


    // $ANTLR start "rule__EffectFullValueBlock__Group__2"
    // InternalFPML.g:3631:1: rule__EffectFullValueBlock__Group__2 : rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3 ;
    public final void rule__EffectFullValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3635:1: ( rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3 )
            // InternalFPML.g:3636:2: rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EffectFullValueBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValueBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__2"


    // $ANTLR start "rule__EffectFullValueBlock__Group__2__Impl"
    // InternalFPML.g:3643:1: rule__EffectFullValueBlock__Group__2__Impl : ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__EffectFullValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3647:1: ( ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3648:1: ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3648:1: ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3649:2: ( rule__EffectFullValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3650:2: ( rule__EffectFullValueBlock__ElementsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFPML.g:3650:3: rule__EffectFullValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EffectFullValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEffectFullValueBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__2__Impl"


    // $ANTLR start "rule__EffectFullValueBlock__Group__3"
    // InternalFPML.g:3658:1: rule__EffectFullValueBlock__Group__3 : rule__EffectFullValueBlock__Group__3__Impl ;
    public final void rule__EffectFullValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3662:1: ( rule__EffectFullValueBlock__Group__3__Impl )
            // InternalFPML.g:3663:2: rule__EffectFullValueBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValueBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__3"


    // $ANTLR start "rule__EffectFullValueBlock__Group__3__Impl"
    // InternalFPML.g:3669:1: rule__EffectFullValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__EffectFullValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3673:1: ( ( '}' ) )
            // InternalFPML.g:3674:1: ( '}' )
            {
            // InternalFPML.g:3674:1: ( '}' )
            // InternalFPML.g:3675:2: '}'
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__0"
    // InternalFPML.g:3685:1: rule__EffectFullFunctionBlock__Group__0 : rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1 ;
    public final void rule__EffectFullFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3689:1: ( rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1 )
            // InternalFPML.g:3690:2: rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullFunctionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__0"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__0__Impl"
    // InternalFPML.g:3697:1: rule__EffectFullFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__EffectFullFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3701:1: ( ( 'Functions' ) )
            // InternalFPML.g:3702:1: ( 'Functions' )
            {
            // InternalFPML.g:3702:1: ( 'Functions' )
            // InternalFPML.g:3703:2: 'Functions'
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getFunctionsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionBlockAccess().getFunctionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__0__Impl"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__1"
    // InternalFPML.g:3712:1: rule__EffectFullFunctionBlock__Group__1 : rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2 ;
    public final void rule__EffectFullFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3716:1: ( rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2 )
            // InternalFPML.g:3717:2: rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EffectFullFunctionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__1"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__1__Impl"
    // InternalFPML.g:3724:1: rule__EffectFullFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3728:1: ( ( '{' ) )
            // InternalFPML.g:3729:1: ( '{' )
            {
            // InternalFPML.g:3729:1: ( '{' )
            // InternalFPML.g:3730:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__1__Impl"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__2"
    // InternalFPML.g:3739:1: rule__EffectFullFunctionBlock__Group__2 : rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3 ;
    public final void rule__EffectFullFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3743:1: ( rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3 )
            // InternalFPML.g:3744:2: rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EffectFullFunctionBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__2"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__2__Impl"
    // InternalFPML.g:3751:1: rule__EffectFullFunctionBlock__Group__2__Impl : ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3755:1: ( ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:3756:1: ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:3756:1: ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:3757:2: ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:3758:2: ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalFPML.g:3758:3: rule__EffectFullFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__2__Impl"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__3"
    // InternalFPML.g:3766:1: rule__EffectFullFunctionBlock__Group__3 : rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4 ;
    public final void rule__EffectFullFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3770:1: ( rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4 )
            // InternalFPML.g:3771:2: rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullFunctionBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__3"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__3__Impl"
    // InternalFPML.g:3778:1: rule__EffectFullFunctionBlock__Group__3__Impl : ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3782:1: ( ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:3783:1: ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:3783:1: ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) )
            // InternalFPML.g:3784:2: ( rule__EffectFullFunctionBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:3785:2: ( rule__EffectFullFunctionBlock__MainAssignment_3 )
            // InternalFPML.g:3785:3: rule__EffectFullFunctionBlock__MainAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__MainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionBlockAccess().getMainAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__4"
    // InternalFPML.g:3793:1: rule__EffectFullFunctionBlock__Group__4 : rule__EffectFullFunctionBlock__Group__4__Impl ;
    public final void rule__EffectFullFunctionBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3797:1: ( rule__EffectFullFunctionBlock__Group__4__Impl )
            // InternalFPML.g:3798:2: rule__EffectFullFunctionBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__4"


    // $ANTLR start "rule__EffectFullFunctionBlock__Group__4__Impl"
    // InternalFPML.g:3804:1: rule__EffectFullFunctionBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3808:1: ( ( '}' ) )
            // InternalFPML.g:3809:1: ( '}' )
            {
            // InternalFPML.g:3809:1: ( '}' )
            // InternalFPML.g:3810:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__Group__4__Impl"


    // $ANTLR start "rule__PureData__Group__0"
    // InternalFPML.g:3820:1: rule__PureData__Group__0 : rule__PureData__Group__0__Impl rule__PureData__Group__1 ;
    public final void rule__PureData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3824:1: ( rule__PureData__Group__0__Impl rule__PureData__Group__1 )
            // InternalFPML.g:3825:2: rule__PureData__Group__0__Impl rule__PureData__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PureData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__0"


    // $ANTLR start "rule__PureData__Group__0__Impl"
    // InternalFPML.g:3832:1: rule__PureData__Group__0__Impl : ( ( rule__PureData__NameAssignment_0 ) ) ;
    public final void rule__PureData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3836:1: ( ( ( rule__PureData__NameAssignment_0 ) ) )
            // InternalFPML.g:3837:1: ( ( rule__PureData__NameAssignment_0 ) )
            {
            // InternalFPML.g:3837:1: ( ( rule__PureData__NameAssignment_0 ) )
            // InternalFPML.g:3838:2: ( rule__PureData__NameAssignment_0 )
            {
             before(grammarAccess.getPureDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:3839:2: ( rule__PureData__NameAssignment_0 )
            // InternalFPML.g:3839:3: rule__PureData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PureData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPureDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__0__Impl"


    // $ANTLR start "rule__PureData__Group__1"
    // InternalFPML.g:3847:1: rule__PureData__Group__1 : rule__PureData__Group__1__Impl rule__PureData__Group__2 ;
    public final void rule__PureData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3851:1: ( rule__PureData__Group__1__Impl rule__PureData__Group__2 )
            // InternalFPML.g:3852:2: rule__PureData__Group__1__Impl rule__PureData__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PureData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__1"


    // $ANTLR start "rule__PureData__Group__1__Impl"
    // InternalFPML.g:3859:1: rule__PureData__Group__1__Impl : ( ':' ) ;
    public final void rule__PureData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3863:1: ( ( ':' ) )
            // InternalFPML.g:3864:1: ( ':' )
            {
            // InternalFPML.g:3864:1: ( ':' )
            // InternalFPML.g:3865:2: ':'
            {
             before(grammarAccess.getPureDataAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureDataAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__1__Impl"


    // $ANTLR start "rule__PureData__Group__2"
    // InternalFPML.g:3874:1: rule__PureData__Group__2 : rule__PureData__Group__2__Impl ;
    public final void rule__PureData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3878:1: ( rule__PureData__Group__2__Impl )
            // InternalFPML.g:3879:2: rule__PureData__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureData__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__2"


    // $ANTLR start "rule__PureData__Group__2__Impl"
    // InternalFPML.g:3885:1: rule__PureData__Group__2__Impl : ( ( rule__PureData__ContentAssignment_2 ) ) ;
    public final void rule__PureData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3889:1: ( ( ( rule__PureData__ContentAssignment_2 ) ) )
            // InternalFPML.g:3890:1: ( ( rule__PureData__ContentAssignment_2 ) )
            {
            // InternalFPML.g:3890:1: ( ( rule__PureData__ContentAssignment_2 ) )
            // InternalFPML.g:3891:2: ( rule__PureData__ContentAssignment_2 )
            {
             before(grammarAccess.getPureDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:3892:2: ( rule__PureData__ContentAssignment_2 )
            // InternalFPML.g:3892:3: rule__PureData__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureData__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureDataAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__Group__2__Impl"


    // $ANTLR start "rule__PureValue__Group__0"
    // InternalFPML.g:3901:1: rule__PureValue__Group__0 : rule__PureValue__Group__0__Impl rule__PureValue__Group__1 ;
    public final void rule__PureValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3905:1: ( rule__PureValue__Group__0__Impl rule__PureValue__Group__1 )
            // InternalFPML.g:3906:2: rule__PureValue__Group__0__Impl rule__PureValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__PureValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__0"


    // $ANTLR start "rule__PureValue__Group__0__Impl"
    // InternalFPML.g:3913:1: rule__PureValue__Group__0__Impl : ( () ) ;
    public final void rule__PureValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3917:1: ( ( () ) )
            // InternalFPML.g:3918:1: ( () )
            {
            // InternalFPML.g:3918:1: ( () )
            // InternalFPML.g:3919:2: ()
            {
             before(grammarAccess.getPureValueAccess().getPureValueAction_0()); 
            // InternalFPML.g:3920:2: ()
            // InternalFPML.g:3920:3: 
            {
            }

             after(grammarAccess.getPureValueAccess().getPureValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__0__Impl"


    // $ANTLR start "rule__PureValue__Group__1"
    // InternalFPML.g:3928:1: rule__PureValue__Group__1 : rule__PureValue__Group__1__Impl rule__PureValue__Group__2 ;
    public final void rule__PureValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3932:1: ( rule__PureValue__Group__1__Impl rule__PureValue__Group__2 )
            // InternalFPML.g:3933:2: rule__PureValue__Group__1__Impl rule__PureValue__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PureValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__1"


    // $ANTLR start "rule__PureValue__Group__1__Impl"
    // InternalFPML.g:3940:1: rule__PureValue__Group__1__Impl : ( ( rule__PureValue__NameAssignment_1 ) ) ;
    public final void rule__PureValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3944:1: ( ( ( rule__PureValue__NameAssignment_1 ) ) )
            // InternalFPML.g:3945:1: ( ( rule__PureValue__NameAssignment_1 ) )
            {
            // InternalFPML.g:3945:1: ( ( rule__PureValue__NameAssignment_1 ) )
            // InternalFPML.g:3946:2: ( rule__PureValue__NameAssignment_1 )
            {
             before(grammarAccess.getPureValueAccess().getNameAssignment_1()); 
            // InternalFPML.g:3947:2: ( rule__PureValue__NameAssignment_1 )
            // InternalFPML.g:3947:3: rule__PureValue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__1__Impl"


    // $ANTLR start "rule__PureValue__Group__2"
    // InternalFPML.g:3955:1: rule__PureValue__Group__2 : rule__PureValue__Group__2__Impl rule__PureValue__Group__3 ;
    public final void rule__PureValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3959:1: ( rule__PureValue__Group__2__Impl rule__PureValue__Group__3 )
            // InternalFPML.g:3960:2: rule__PureValue__Group__2__Impl rule__PureValue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PureValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__2"


    // $ANTLR start "rule__PureValue__Group__2__Impl"
    // InternalFPML.g:3967:1: rule__PureValue__Group__2__Impl : ( ':' ) ;
    public final void rule__PureValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3971:1: ( ( ':' ) )
            // InternalFPML.g:3972:1: ( ':' )
            {
            // InternalFPML.g:3972:1: ( ':' )
            // InternalFPML.g:3973:2: ':'
            {
             before(grammarAccess.getPureValueAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureValueAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__2__Impl"


    // $ANTLR start "rule__PureValue__Group__3"
    // InternalFPML.g:3982:1: rule__PureValue__Group__3 : rule__PureValue__Group__3__Impl ;
    public final void rule__PureValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3986:1: ( rule__PureValue__Group__3__Impl )
            // InternalFPML.g:3987:2: rule__PureValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__3"


    // $ANTLR start "rule__PureValue__Group__3__Impl"
    // InternalFPML.g:3993:1: rule__PureValue__Group__3__Impl : ( ( rule__PureValue__ValueAssignment_3 ) ) ;
    public final void rule__PureValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3997:1: ( ( ( rule__PureValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:3998:1: ( ( rule__PureValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3998:1: ( ( rule__PureValue__ValueAssignment_3 ) )
            // InternalFPML.g:3999:2: ( rule__PureValue__ValueAssignment_3 )
            {
             before(grammarAccess.getPureValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:4000:2: ( rule__PureValue__ValueAssignment_3 )
            // InternalFPML.g:4000:3: rule__PureValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PureValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPureValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__Group__3__Impl"


    // $ANTLR start "rule__PureAdtType__Group_1__0"
    // InternalFPML.g:4009:1: rule__PureAdtType__Group_1__0 : rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1 ;
    public final void rule__PureAdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4013:1: ( rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1 )
            // InternalFPML.g:4014:2: rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__PureAdtType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureAdtType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__0"


    // $ANTLR start "rule__PureAdtType__Group_1__0__Impl"
    // InternalFPML.g:4021:1: rule__PureAdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__PureAdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4025:1: ( ( '[' ) )
            // InternalFPML.g:4026:1: ( '[' )
            {
            // InternalFPML.g:4026:1: ( '[' )
            // InternalFPML.g:4027:2: '['
            {
             before(grammarAccess.getPureAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPureAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__0__Impl"


    // $ANTLR start "rule__PureAdtType__Group_1__1"
    // InternalFPML.g:4036:1: rule__PureAdtType__Group_1__1 : rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2 ;
    public final void rule__PureAdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4040:1: ( rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2 )
            // InternalFPML.g:4041:2: rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__PureAdtType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureAdtType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__1"


    // $ANTLR start "rule__PureAdtType__Group_1__1__Impl"
    // InternalFPML.g:4048:1: rule__PureAdtType__Group_1__1__Impl : ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) ) ;
    public final void rule__PureAdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4052:1: ( ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:4053:1: ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:4053:1: ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) )
            // InternalFPML.g:4054:2: ( rule__PureAdtType__PureAdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1Assignment_1_1()); 
            // InternalFPML.g:4055:2: ( rule__PureAdtType__PureAdtElement1Assignment_1_1 )
            // InternalFPML.g:4055:3: rule__PureAdtType__PureAdtElement1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtType__PureAdtElement1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__1__Impl"


    // $ANTLR start "rule__PureAdtType__Group_1__2"
    // InternalFPML.g:4063:1: rule__PureAdtType__Group_1__2 : rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3 ;
    public final void rule__PureAdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4067:1: ( rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3 )
            // InternalFPML.g:4068:2: rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__PureAdtType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureAdtType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__2"


    // $ANTLR start "rule__PureAdtType__Group_1__2__Impl"
    // InternalFPML.g:4075:1: rule__PureAdtType__Group_1__2__Impl : ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) ) ;
    public final void rule__PureAdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4079:1: ( ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:4080:1: ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:4080:1: ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:4081:2: ( rule__PureAdtType__PureAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Assignment_1_2()); 
            // InternalFPML.g:4082:2: ( rule__PureAdtType__PureAdtElement2Assignment_1_2 )
            // InternalFPML.g:4082:3: rule__PureAdtType__PureAdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtType__PureAdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__2__Impl"


    // $ANTLR start "rule__PureAdtType__Group_1__3"
    // InternalFPML.g:4090:1: rule__PureAdtType__Group_1__3 : rule__PureAdtType__Group_1__3__Impl ;
    public final void rule__PureAdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4094:1: ( rule__PureAdtType__Group_1__3__Impl )
            // InternalFPML.g:4095:2: rule__PureAdtType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__3"


    // $ANTLR start "rule__PureAdtType__Group_1__3__Impl"
    // InternalFPML.g:4101:1: rule__PureAdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PureAdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4105:1: ( ( ']' ) )
            // InternalFPML.g:4106:1: ( ']' )
            {
            // InternalFPML.g:4106:1: ( ']' )
            // InternalFPML.g:4107:2: ']'
            {
             before(grammarAccess.getPureAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPureAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__Group_1__3__Impl"


    // $ANTLR start "rule__PureSumType__Group__0"
    // InternalFPML.g:4117:1: rule__PureSumType__Group__0 : rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1 ;
    public final void rule__PureSumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4121:1: ( rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1 )
            // InternalFPML.g:4122:2: rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PureSumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumType__Group__0"


    // $ANTLR start "rule__PureSumType__Group__0__Impl"
    // InternalFPML.g:4129:1: rule__PureSumType__Group__0__Impl : ( '+' ) ;
    public final void rule__PureSumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4133:1: ( ( '+' ) )
            // InternalFPML.g:4134:1: ( '+' )
            {
            // InternalFPML.g:4134:1: ( '+' )
            // InternalFPML.g:4135:2: '+'
            {
             before(grammarAccess.getPureSumTypeAccess().getPlusSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPureSumTypeAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumType__Group__0__Impl"


    // $ANTLR start "rule__PureSumType__Group__1"
    // InternalFPML.g:4144:1: rule__PureSumType__Group__1 : rule__PureSumType__Group__1__Impl ;
    public final void rule__PureSumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4148:1: ( rule__PureSumType__Group__1__Impl )
            // InternalFPML.g:4149:2: rule__PureSumType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureSumType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumType__Group__1"


    // $ANTLR start "rule__PureSumType__Group__1__Impl"
    // InternalFPML.g:4155:1: rule__PureSumType__Group__1__Impl : ( ( rule__PureSumType__AdtElementAssignment_1 ) ) ;
    public final void rule__PureSumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4159:1: ( ( ( rule__PureSumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4160:1: ( ( rule__PureSumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4160:1: ( ( rule__PureSumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4161:2: ( rule__PureSumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getPureSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4162:2: ( rule__PureSumType__AdtElementAssignment_1 )
            // InternalFPML.g:4162:3: rule__PureSumType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureSumType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureSumTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumType__Group__1__Impl"


    // $ANTLR start "rule__PureProdType__Group__0"
    // InternalFPML.g:4171:1: rule__PureProdType__Group__0 : rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1 ;
    public final void rule__PureProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4175:1: ( rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1 )
            // InternalFPML.g:4176:2: rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PureProdType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureProdType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdType__Group__0"


    // $ANTLR start "rule__PureProdType__Group__0__Impl"
    // InternalFPML.g:4183:1: rule__PureProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__PureProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4187:1: ( ( '*' ) )
            // InternalFPML.g:4188:1: ( '*' )
            {
            // InternalFPML.g:4188:1: ( '*' )
            // InternalFPML.g:4189:2: '*'
            {
             before(grammarAccess.getPureProdTypeAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPureProdTypeAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdType__Group__0__Impl"


    // $ANTLR start "rule__PureProdType__Group__1"
    // InternalFPML.g:4198:1: rule__PureProdType__Group__1 : rule__PureProdType__Group__1__Impl ;
    public final void rule__PureProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4202:1: ( rule__PureProdType__Group__1__Impl )
            // InternalFPML.g:4203:2: rule__PureProdType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureProdType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdType__Group__1"


    // $ANTLR start "rule__PureProdType__Group__1__Impl"
    // InternalFPML.g:4209:1: rule__PureProdType__Group__1__Impl : ( ( rule__PureProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__PureProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4213:1: ( ( ( rule__PureProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4214:1: ( ( rule__PureProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4214:1: ( ( rule__PureProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4215:2: ( rule__PureProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getPureProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4216:2: ( rule__PureProdType__AdtElementAssignment_1 )
            // InternalFPML.g:4216:3: rule__PureProdType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureProdType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureProdTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdType__Group__1__Impl"


    // $ANTLR start "rule__EffectFullData__Group__0"
    // InternalFPML.g:4225:1: rule__EffectFullData__Group__0 : rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1 ;
    public final void rule__EffectFullData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4229:1: ( rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1 )
            // InternalFPML.g:4230:2: rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__0"


    // $ANTLR start "rule__EffectFullData__Group__0__Impl"
    // InternalFPML.g:4237:1: rule__EffectFullData__Group__0__Impl : ( ( rule__EffectFullData__NameAssignment_0 ) ) ;
    public final void rule__EffectFullData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4241:1: ( ( ( rule__EffectFullData__NameAssignment_0 ) ) )
            // InternalFPML.g:4242:1: ( ( rule__EffectFullData__NameAssignment_0 ) )
            {
            // InternalFPML.g:4242:1: ( ( rule__EffectFullData__NameAssignment_0 ) )
            // InternalFPML.g:4243:2: ( rule__EffectFullData__NameAssignment_0 )
            {
             before(grammarAccess.getEffectFullDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:4244:2: ( rule__EffectFullData__NameAssignment_0 )
            // InternalFPML.g:4244:3: rule__EffectFullData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__0__Impl"


    // $ANTLR start "rule__EffectFullData__Group__1"
    // InternalFPML.g:4252:1: rule__EffectFullData__Group__1 : rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2 ;
    public final void rule__EffectFullData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4256:1: ( rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2 )
            // InternalFPML.g:4257:2: rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__1"


    // $ANTLR start "rule__EffectFullData__Group__1__Impl"
    // InternalFPML.g:4264:1: rule__EffectFullData__Group__1__Impl : ( ':' ) ;
    public final void rule__EffectFullData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4268:1: ( ( ':' ) )
            // InternalFPML.g:4269:1: ( ':' )
            {
            // InternalFPML.g:4269:1: ( ':' )
            // InternalFPML.g:4270:2: ':'
            {
             before(grammarAccess.getEffectFullDataAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__1__Impl"


    // $ANTLR start "rule__EffectFullData__Group__2"
    // InternalFPML.g:4279:1: rule__EffectFullData__Group__2 : rule__EffectFullData__Group__2__Impl ;
    public final void rule__EffectFullData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4283:1: ( rule__EffectFullData__Group__2__Impl )
            // InternalFPML.g:4284:2: rule__EffectFullData__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullData__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__2"


    // $ANTLR start "rule__EffectFullData__Group__2__Impl"
    // InternalFPML.g:4290:1: rule__EffectFullData__Group__2__Impl : ( ( rule__EffectFullData__ContentAssignment_2 ) ) ;
    public final void rule__EffectFullData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4294:1: ( ( ( rule__EffectFullData__ContentAssignment_2 ) ) )
            // InternalFPML.g:4295:1: ( ( rule__EffectFullData__ContentAssignment_2 ) )
            {
            // InternalFPML.g:4295:1: ( ( rule__EffectFullData__ContentAssignment_2 ) )
            // InternalFPML.g:4296:2: ( rule__EffectFullData__ContentAssignment_2 )
            {
             before(grammarAccess.getEffectFullDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:4297:2: ( rule__EffectFullData__ContentAssignment_2 )
            // InternalFPML.g:4297:3: rule__EffectFullData__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullData__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__Group__2__Impl"


    // $ANTLR start "rule__EffectFullValue__Group__0"
    // InternalFPML.g:4306:1: rule__EffectFullValue__Group__0 : rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1 ;
    public final void rule__EffectFullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4310:1: ( rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1 )
            // InternalFPML.g:4311:2: rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EffectFullValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__0"


    // $ANTLR start "rule__EffectFullValue__Group__0__Impl"
    // InternalFPML.g:4318:1: rule__EffectFullValue__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4322:1: ( ( () ) )
            // InternalFPML.g:4323:1: ( () )
            {
            // InternalFPML.g:4323:1: ( () )
            // InternalFPML.g:4324:2: ()
            {
             before(grammarAccess.getEffectFullValueAccess().getEffectFullValueAction_0()); 
            // InternalFPML.g:4325:2: ()
            // InternalFPML.g:4325:3: 
            {
            }

             after(grammarAccess.getEffectFullValueAccess().getEffectFullValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__0__Impl"


    // $ANTLR start "rule__EffectFullValue__Group__1"
    // InternalFPML.g:4333:1: rule__EffectFullValue__Group__1 : rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2 ;
    public final void rule__EffectFullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4337:1: ( rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2 )
            // InternalFPML.g:4338:2: rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__1"


    // $ANTLR start "rule__EffectFullValue__Group__1__Impl"
    // InternalFPML.g:4345:1: rule__EffectFullValue__Group__1__Impl : ( ( rule__EffectFullValue__NameAssignment_1 ) ) ;
    public final void rule__EffectFullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4349:1: ( ( ( rule__EffectFullValue__NameAssignment_1 ) ) )
            // InternalFPML.g:4350:1: ( ( rule__EffectFullValue__NameAssignment_1 ) )
            {
            // InternalFPML.g:4350:1: ( ( rule__EffectFullValue__NameAssignment_1 ) )
            // InternalFPML.g:4351:2: ( rule__EffectFullValue__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullValueAccess().getNameAssignment_1()); 
            // InternalFPML.g:4352:2: ( rule__EffectFullValue__NameAssignment_1 )
            // InternalFPML.g:4352:3: rule__EffectFullValue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__1__Impl"


    // $ANTLR start "rule__EffectFullValue__Group__2"
    // InternalFPML.g:4360:1: rule__EffectFullValue__Group__2 : rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3 ;
    public final void rule__EffectFullValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4364:1: ( rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3 )
            // InternalFPML.g:4365:2: rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__EffectFullValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__2"


    // $ANTLR start "rule__EffectFullValue__Group__2__Impl"
    // InternalFPML.g:4372:1: rule__EffectFullValue__Group__2__Impl : ( ':' ) ;
    public final void rule__EffectFullValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4376:1: ( ( ':' ) )
            // InternalFPML.g:4377:1: ( ':' )
            {
            // InternalFPML.g:4377:1: ( ':' )
            // InternalFPML.g:4378:2: ':'
            {
             before(grammarAccess.getEffectFullValueAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__2__Impl"


    // $ANTLR start "rule__EffectFullValue__Group__3"
    // InternalFPML.g:4387:1: rule__EffectFullValue__Group__3 : rule__EffectFullValue__Group__3__Impl ;
    public final void rule__EffectFullValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4391:1: ( rule__EffectFullValue__Group__3__Impl )
            // InternalFPML.g:4392:2: rule__EffectFullValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__3"


    // $ANTLR start "rule__EffectFullValue__Group__3__Impl"
    // InternalFPML.g:4398:1: rule__EffectFullValue__Group__3__Impl : ( ( rule__EffectFullValue__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4402:1: ( ( ( rule__EffectFullValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:4403:1: ( ( rule__EffectFullValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:4403:1: ( ( rule__EffectFullValue__ValueAssignment_3 ) )
            // InternalFPML.g:4404:2: ( rule__EffectFullValue__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:4405:2: ( rule__EffectFullValue__ValueAssignment_3 )
            // InternalFPML.g:4405:3: rule__EffectFullValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__Group__3__Impl"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__0"
    // InternalFPML.g:4414:1: rule__EffectFullAdtType__Group_1__0 : rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1 ;
    public final void rule__EffectFullAdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4418:1: ( rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1 )
            // InternalFPML.g:4419:2: rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullAdtType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__0"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__0__Impl"
    // InternalFPML.g:4426:1: rule__EffectFullAdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__EffectFullAdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4430:1: ( ( '[' ) )
            // InternalFPML.g:4431:1: ( '[' )
            {
            // InternalFPML.g:4431:1: ( '[' )
            // InternalFPML.g:4432:2: '['
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEffectFullAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__0__Impl"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__1"
    // InternalFPML.g:4441:1: rule__EffectFullAdtType__Group_1__1 : rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2 ;
    public final void rule__EffectFullAdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4445:1: ( rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2 )
            // InternalFPML.g:4446:2: rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__EffectFullAdtType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__1"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__1__Impl"
    // InternalFPML.g:4453:1: rule__EffectFullAdtType__Group_1__1__Impl : ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) ) ;
    public final void rule__EffectFullAdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4457:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:4458:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:4458:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) )
            // InternalFPML.g:4459:2: ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1Assignment_1_1()); 
            // InternalFPML.g:4460:2: ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 )
            // InternalFPML.g:4460:3: rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__1__Impl"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__2"
    // InternalFPML.g:4468:1: rule__EffectFullAdtType__Group_1__2 : rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3 ;
    public final void rule__EffectFullAdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4472:1: ( rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3 )
            // InternalFPML.g:4473:2: rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__EffectFullAdtType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__2"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__2__Impl"
    // InternalFPML.g:4480:1: rule__EffectFullAdtType__Group_1__2__Impl : ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) ) ;
    public final void rule__EffectFullAdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4484:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:4485:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:4485:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:4486:2: ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Assignment_1_2()); 
            // InternalFPML.g:4487:2: ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 )
            // InternalFPML.g:4487:3: rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__2__Impl"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__3"
    // InternalFPML.g:4495:1: rule__EffectFullAdtType__Group_1__3 : rule__EffectFullAdtType__Group_1__3__Impl ;
    public final void rule__EffectFullAdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4499:1: ( rule__EffectFullAdtType__Group_1__3__Impl )
            // InternalFPML.g:4500:2: rule__EffectFullAdtType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__3"


    // $ANTLR start "rule__EffectFullAdtType__Group_1__3__Impl"
    // InternalFPML.g:4506:1: rule__EffectFullAdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__EffectFullAdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4510:1: ( ( ']' ) )
            // InternalFPML.g:4511:1: ( ']' )
            {
            // InternalFPML.g:4511:1: ( ']' )
            // InternalFPML.g:4512:2: ']'
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEffectFullAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__Group_1__3__Impl"


    // $ANTLR start "rule__EffectFullSumType__Group__0"
    // InternalFPML.g:4522:1: rule__EffectFullSumType__Group__0 : rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1 ;
    public final void rule__EffectFullSumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4526:1: ( rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1 )
            // InternalFPML.g:4527:2: rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullSumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumType__Group__0"


    // $ANTLR start "rule__EffectFullSumType__Group__0__Impl"
    // InternalFPML.g:4534:1: rule__EffectFullSumType__Group__0__Impl : ( '+' ) ;
    public final void rule__EffectFullSumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4538:1: ( ( '+' ) )
            // InternalFPML.g:4539:1: ( '+' )
            {
            // InternalFPML.g:4539:1: ( '+' )
            // InternalFPML.g:4540:2: '+'
            {
             before(grammarAccess.getEffectFullSumTypeAccess().getPlusSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumTypeAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumType__Group__0__Impl"


    // $ANTLR start "rule__EffectFullSumType__Group__1"
    // InternalFPML.g:4549:1: rule__EffectFullSumType__Group__1 : rule__EffectFullSumType__Group__1__Impl ;
    public final void rule__EffectFullSumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4553:1: ( rule__EffectFullSumType__Group__1__Impl )
            // InternalFPML.g:4554:2: rule__EffectFullSumType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumType__Group__1"


    // $ANTLR start "rule__EffectFullSumType__Group__1__Impl"
    // InternalFPML.g:4560:1: rule__EffectFullSumType__Group__1__Impl : ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) ) ;
    public final void rule__EffectFullSumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4564:1: ( ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4565:1: ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4565:1: ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4566:2: ( rule__EffectFullSumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getEffectFullSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4567:2: ( rule__EffectFullSumType__AdtElementAssignment_1 )
            // InternalFPML.g:4567:3: rule__EffectFullSumType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullSumTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumType__Group__1__Impl"


    // $ANTLR start "rule__EffectFullProdType__Group__0"
    // InternalFPML.g:4576:1: rule__EffectFullProdType__Group__0 : rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1 ;
    public final void rule__EffectFullProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4580:1: ( rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1 )
            // InternalFPML.g:4581:2: rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullProdType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullProdType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdType__Group__0"


    // $ANTLR start "rule__EffectFullProdType__Group__0__Impl"
    // InternalFPML.g:4588:1: rule__EffectFullProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__EffectFullProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4592:1: ( ( '*' ) )
            // InternalFPML.g:4593:1: ( '*' )
            {
            // InternalFPML.g:4593:1: ( '*' )
            // InternalFPML.g:4594:2: '*'
            {
             before(grammarAccess.getEffectFullProdTypeAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEffectFullProdTypeAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdType__Group__0__Impl"


    // $ANTLR start "rule__EffectFullProdType__Group__1"
    // InternalFPML.g:4603:1: rule__EffectFullProdType__Group__1 : rule__EffectFullProdType__Group__1__Impl ;
    public final void rule__EffectFullProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4607:1: ( rule__EffectFullProdType__Group__1__Impl )
            // InternalFPML.g:4608:2: rule__EffectFullProdType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdType__Group__1"


    // $ANTLR start "rule__EffectFullProdType__Group__1__Impl"
    // InternalFPML.g:4614:1: rule__EffectFullProdType__Group__1__Impl : ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__EffectFullProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4618:1: ( ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4619:1: ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4619:1: ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4620:2: ( rule__EffectFullProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getEffectFullProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4621:2: ( rule__EffectFullProdType__AdtElementAssignment_1 )
            // InternalFPML.g:4621:3: rule__EffectFullProdType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullProdTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdType__Group__1__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__0"
    // InternalFPML.g:4630:1: rule__PureFunctionDefinition__Group__0 : rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 ;
    public final void rule__PureFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4634:1: ( rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 )
            // InternalFPML.g:4635:2: rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:4642:1: rule__PureFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4646:1: ( ( 'def' ) )
            // InternalFPML.g:4647:1: ( 'def' )
            {
            // InternalFPML.g:4647:1: ( 'def' )
            // InternalFPML.g:4648:2: 'def'
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
    // InternalFPML.g:4657:1: rule__PureFunctionDefinition__Group__1 : rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 ;
    public final void rule__PureFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4661:1: ( rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 )
            // InternalFPML.g:4662:2: rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2
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
    // InternalFPML.g:4669:1: rule__PureFunctionDefinition__Group__1__Impl : ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4673:1: ( ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:4674:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:4674:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:4675:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:4676:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:4676:3: rule__PureFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:4684:1: rule__PureFunctionDefinition__Group__2 : rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 ;
    public final void rule__PureFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4688:1: ( rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 )
            // InternalFPML.g:4689:2: rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:4696:1: rule__PureFunctionDefinition__Group__2__Impl : ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__PureFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4700:1: ( ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:4701:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:4701:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:4702:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:4703:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:4703:3: rule__PureFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:4711:1: rule__PureFunctionDefinition__Group__3 : rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 ;
    public final void rule__PureFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4715:1: ( rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 )
            // InternalFPML.g:4716:2: rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:4723:1: rule__PureFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4727:1: ( ( '(' ) )
            // InternalFPML.g:4728:1: ( '(' )
            {
            // InternalFPML.g:4728:1: ( '(' )
            // InternalFPML.g:4729:2: '('
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
    // InternalFPML.g:4738:1: rule__PureFunctionDefinition__Group__4 : rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 ;
    public final void rule__PureFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4742:1: ( rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 )
            // InternalFPML.g:4743:2: rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:4750:1: rule__PureFunctionDefinition__Group__4__Impl : ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__PureFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4754:1: ( ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:4755:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:4755:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:4756:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:4757:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:4757:3: rule__PureFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:4765:1: rule__PureFunctionDefinition__Group__5 : rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 ;
    public final void rule__PureFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4769:1: ( rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 )
            // InternalFPML.g:4770:2: rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:4777:1: rule__PureFunctionDefinition__Group__5__Impl : ( ( rule__PureFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__PureFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4781:1: ( ( ( rule__PureFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:4782:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:4782:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:4783:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:4784:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFPML.g:4784:3: rule__PureFunctionDefinition__Group_5__0
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
    // InternalFPML.g:4792:1: rule__PureFunctionDefinition__Group__6 : rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 ;
    public final void rule__PureFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4796:1: ( rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 )
            // InternalFPML.g:4797:2: rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7
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
    // InternalFPML.g:4804:1: rule__PureFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__PureFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4808:1: ( ( ')' ) )
            // InternalFPML.g:4809:1: ( ')' )
            {
            // InternalFPML.g:4809:1: ( ')' )
            // InternalFPML.g:4810:2: ')'
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
    // InternalFPML.g:4819:1: rule__PureFunctionDefinition__Group__7 : rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 ;
    public final void rule__PureFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4823:1: ( rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 )
            // InternalFPML.g:4824:2: rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8
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
    // InternalFPML.g:4831:1: rule__PureFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__PureFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4835:1: ( ( ':' ) )
            // InternalFPML.g:4836:1: ( ':' )
            {
            // InternalFPML.g:4836:1: ( ':' )
            // InternalFPML.g:4837:2: ':'
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
    // InternalFPML.g:4846:1: rule__PureFunctionDefinition__Group__8 : rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 ;
    public final void rule__PureFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4850:1: ( rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 )
            // InternalFPML.g:4851:2: rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:4858:1: rule__PureFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__PureFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4862:1: ( ( '{' ) )
            // InternalFPML.g:4863:1: ( '{' )
            {
            // InternalFPML.g:4863:1: ( '{' )
            // InternalFPML.g:4864:2: '{'
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
    // InternalFPML.g:4873:1: rule__PureFunctionDefinition__Group__9 : rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 ;
    public final void rule__PureFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4877:1: ( rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 )
            // InternalFPML.g:4878:2: rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10
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
    // InternalFPML.g:4885:1: rule__PureFunctionDefinition__Group__9__Impl : ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__PureFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4889:1: ( ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:4890:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:4890:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:4891:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:4892:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:4892:3: rule__PureFunctionDefinition__FunctionBodyAssignment_9
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
    // InternalFPML.g:4900:1: rule__PureFunctionDefinition__Group__10 : rule__PureFunctionDefinition__Group__10__Impl ;
    public final void rule__PureFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4904:1: ( rule__PureFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:4905:2: rule__PureFunctionDefinition__Group__10__Impl
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
    // InternalFPML.g:4911:1: rule__PureFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__PureFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4915:1: ( ( '}' ) )
            // InternalFPML.g:4916:1: ( '}' )
            {
            // InternalFPML.g:4916:1: ( '}' )
            // InternalFPML.g:4917:2: '}'
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
    // InternalFPML.g:4927:1: rule__PureFunctionDefinition__Group_5__0 : rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 ;
    public final void rule__PureFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4931:1: ( rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 )
            // InternalFPML.g:4932:2: rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:4939:1: rule__PureFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__PureFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4943:1: ( ( ',' ) )
            // InternalFPML.g:4944:1: ( ',' )
            {
            // InternalFPML.g:4944:1: ( ',' )
            // InternalFPML.g:4945:2: ','
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
    // InternalFPML.g:4954:1: rule__PureFunctionDefinition__Group_5__1 : rule__PureFunctionDefinition__Group_5__1__Impl ;
    public final void rule__PureFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4958:1: ( rule__PureFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:4959:2: rule__PureFunctionDefinition__Group_5__1__Impl
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
    // InternalFPML.g:4965:1: rule__PureFunctionDefinition__Group_5__1__Impl : ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4969:1: ( ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) )
            // InternalFPML.g:4970:1: ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            {
            // InternalFPML.g:4970:1: ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            // InternalFPML.g:4971:2: ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 
            // InternalFPML.g:4972:2: ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 )
            // InternalFPML.g:4972:3: rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 

            }


            }

        }
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
    // InternalFPML.g:4981:1: rule__EffectFullFunctionDefinition__Group__0 : rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 ;
    public final void rule__EffectFullFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4985:1: ( rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 )
            // InternalFPML.g:4986:2: rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:4993:1: rule__EffectFullFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4997:1: ( ( 'def' ) )
            // InternalFPML.g:4998:1: ( 'def' )
            {
            // InternalFPML.g:4998:1: ( 'def' )
            // InternalFPML.g:4999:2: 'def'
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
    // InternalFPML.g:5008:1: rule__EffectFullFunctionDefinition__Group__1 : rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 ;
    public final void rule__EffectFullFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5012:1: ( rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 )
            // InternalFPML.g:5013:2: rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2
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
    // InternalFPML.g:5020:1: rule__EffectFullFunctionDefinition__Group__1__Impl : ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5024:1: ( ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:5025:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:5025:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:5026:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:5027:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:5027:3: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:5035:1: rule__EffectFullFunctionDefinition__Group__2 : rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 ;
    public final void rule__EffectFullFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5039:1: ( rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 )
            // InternalFPML.g:5040:2: rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:5047:1: rule__EffectFullFunctionDefinition__Group__2__Impl : ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5051:1: ( ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:5052:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:5052:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:5053:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:5054:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:5054:3: rule__EffectFullFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:5062:1: rule__EffectFullFunctionDefinition__Group__3 : rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 ;
    public final void rule__EffectFullFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5066:1: ( rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 )
            // InternalFPML.g:5067:2: rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:5074:1: rule__EffectFullFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5078:1: ( ( '(' ) )
            // InternalFPML.g:5079:1: ( '(' )
            {
            // InternalFPML.g:5079:1: ( '(' )
            // InternalFPML.g:5080:2: '('
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
    // InternalFPML.g:5089:1: rule__EffectFullFunctionDefinition__Group__4 : rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 ;
    public final void rule__EffectFullFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5093:1: ( rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 )
            // InternalFPML.g:5094:2: rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:5101:1: rule__EffectFullFunctionDefinition__Group__4__Impl : ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5105:1: ( ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:5106:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:5106:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:5107:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:5108:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:5108:3: rule__EffectFullFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:5116:1: rule__EffectFullFunctionDefinition__Group__5 : rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 ;
    public final void rule__EffectFullFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5120:1: ( rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 )
            // InternalFPML.g:5121:2: rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:5128:1: rule__EffectFullFunctionDefinition__Group__5__Impl : ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__EffectFullFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5132:1: ( ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:5133:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:5133:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:5134:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:5135:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFPML.g:5135:3: rule__EffectFullFunctionDefinition__Group_5__0
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
    // InternalFPML.g:5143:1: rule__EffectFullFunctionDefinition__Group__6 : rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 ;
    public final void rule__EffectFullFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5147:1: ( rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 )
            // InternalFPML.g:5148:2: rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7
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
    // InternalFPML.g:5155:1: rule__EffectFullFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5159:1: ( ( ')' ) )
            // InternalFPML.g:5160:1: ( ')' )
            {
            // InternalFPML.g:5160:1: ( ')' )
            // InternalFPML.g:5161:2: ')'
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
    // InternalFPML.g:5170:1: rule__EffectFullFunctionDefinition__Group__7 : rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 ;
    public final void rule__EffectFullFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5174:1: ( rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 )
            // InternalFPML.g:5175:2: rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8
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
    // InternalFPML.g:5182:1: rule__EffectFullFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5186:1: ( ( ':' ) )
            // InternalFPML.g:5187:1: ( ':' )
            {
            // InternalFPML.g:5187:1: ( ':' )
            // InternalFPML.g:5188:2: ':'
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
    // InternalFPML.g:5197:1: rule__EffectFullFunctionDefinition__Group__8 : rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 ;
    public final void rule__EffectFullFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5201:1: ( rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 )
            // InternalFPML.g:5202:2: rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:5209:1: rule__EffectFullFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5213:1: ( ( '{' ) )
            // InternalFPML.g:5214:1: ( '{' )
            {
            // InternalFPML.g:5214:1: ( '{' )
            // InternalFPML.g:5215:2: '{'
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
    // InternalFPML.g:5224:1: rule__EffectFullFunctionDefinition__Group__9 : rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 ;
    public final void rule__EffectFullFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5228:1: ( rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 )
            // InternalFPML.g:5229:2: rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10
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
    // InternalFPML.g:5236:1: rule__EffectFullFunctionDefinition__Group__9__Impl : ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5240:1: ( ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:5241:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:5241:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:5242:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:5243:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:5243:3: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9
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
    // InternalFPML.g:5251:1: rule__EffectFullFunctionDefinition__Group__10 : rule__EffectFullFunctionDefinition__Group__10__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5255:1: ( rule__EffectFullFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:5256:2: rule__EffectFullFunctionDefinition__Group__10__Impl
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
    // InternalFPML.g:5262:1: rule__EffectFullFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5266:1: ( ( '}' ) )
            // InternalFPML.g:5267:1: ( '}' )
            {
            // InternalFPML.g:5267:1: ( '}' )
            // InternalFPML.g:5268:2: '}'
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
    // InternalFPML.g:5278:1: rule__EffectFullFunctionDefinition__Group_5__0 : rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5282:1: ( rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 )
            // InternalFPML.g:5283:2: rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:5290:1: rule__EffectFullFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5294:1: ( ( ',' ) )
            // InternalFPML.g:5295:1: ( ',' )
            {
            // InternalFPML.g:5295:1: ( ',' )
            // InternalFPML.g:5296:2: ','
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
    // InternalFPML.g:5305:1: rule__EffectFullFunctionDefinition__Group_5__1 : rule__EffectFullFunctionDefinition__Group_5__1__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5309:1: ( rule__EffectFullFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:5310:2: rule__EffectFullFunctionDefinition__Group_5__1__Impl
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
    // InternalFPML.g:5316:1: rule__EffectFullFunctionDefinition__Group_5__1__Impl : ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5320:1: ( ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) )
            // InternalFPML.g:5321:1: ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            {
            // InternalFPML.g:5321:1: ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            // InternalFPML.g:5322:2: ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 
            // InternalFPML.g:5323:2: ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 )
            // InternalFPML.g:5323:3: rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 

            }


            }

        }
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
    // InternalFPML.g:5332:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5336:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:5337:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFPML.g:5344:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5348:1: ( ( 'IO' ) )
            // InternalFPML.g:5349:1: ( 'IO' )
            {
            // InternalFPML.g:5349:1: ( 'IO' )
            // InternalFPML.g:5350:2: 'IO'
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
    // InternalFPML.g:5359:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5363:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:5364:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalFPML.g:5371:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5375:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:5376:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:5376:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:5377:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:5378:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:5378:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:5386:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5390:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:5391:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:5398:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5402:1: ( ( 'main' ) )
            // InternalFPML.g:5403:1: ( 'main' )
            {
            // InternalFPML.g:5403:1: ( 'main' )
            // InternalFPML.g:5404:2: 'main'
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
    // InternalFPML.g:5413:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5417:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:5418:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:5425:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5429:1: ( ( ':' ) )
            // InternalFPML.g:5430:1: ( ':' )
            {
            // InternalFPML.g:5430:1: ( ':' )
            // InternalFPML.g:5431:2: ':'
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
    // InternalFPML.g:5440:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5444:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:5445:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:5452:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5456:1: ( ( '{' ) )
            // InternalFPML.g:5457:1: ( '{' )
            {
            // InternalFPML.g:5457:1: ( '{' )
            // InternalFPML.g:5458:2: '{'
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
    // InternalFPML.g:5467:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5471:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:5472:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:5479:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5483:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:5484:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:5484:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:5485:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:5486:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:5486:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:5494:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5498:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:5499:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:5505:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5509:1: ( ( '}' ) )
            // InternalFPML.g:5510:1: ( '}' )
            {
            // InternalFPML.g:5510:1: ( '}' )
            // InternalFPML.g:5511:2: '}'
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
    // InternalFPML.g:5521:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5525:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:5526:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
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
    // InternalFPML.g:5533:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5537:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:5538:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:5538:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:5539:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:5540:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:5540:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:5548:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5552:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:5553:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:5559:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 ) ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5563:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 ) ) )
            // InternalFPML.g:5564:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            {
            // InternalFPML.g:5564:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            // InternalFPML.g:5565:2: ( rule__EffectFullArgument__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:5566:2: ( rule__EffectFullArgument__NameAssignment_1 )
            // InternalFPML.g:5566:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:5575:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5579:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:5580:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalFPML.g:5587:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5591:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:5592:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:5592:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:5593:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:5594:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:5594:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:5602:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5606:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:5607:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:5613:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5617:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:5618:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:5618:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:5619:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:5620:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:5620:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:5629:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5633:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:5634:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFPML.g:5641:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5645:1: ( ( () ) )
            // InternalFPML.g:5646:1: ( () )
            {
            // InternalFPML.g:5646:1: ( () )
            // InternalFPML.g:5647:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:5648:2: ()
            // InternalFPML.g:5648:3: 
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
    // InternalFPML.g:5656:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5660:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:5661:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:5667:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5671:1: ( ( 'Undefined' ) )
            // InternalFPML.g:5672:1: ( 'Undefined' )
            {
            // InternalFPML.g:5672:1: ( 'Undefined' )
            // InternalFPML.g:5673:2: 'Undefined'
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
    // InternalFPML.g:5683:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5687:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:5688:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFPML.g:5695:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5699:1: ( ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:5700:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:5700:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:5701:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:5702:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:5702:3: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:5710:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5714:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl )
            // InternalFPML.g:5715:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl
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
    // InternalFPML.g:5721:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5725:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:5726:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:5726:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:5727:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:5727:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:5728:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5729:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            // InternalFPML.g:5729:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:5732:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:5733:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5734:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalFPML.g:5734:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalFPML.g:5744:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5748:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:5749:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFPML.g:5756:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5760:1: ( ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:5761:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:5761:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:5762:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:5763:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:5763:3: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:5771:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5775:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:5776:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
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
    // InternalFPML.g:5782:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5786:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:5787:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:5787:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:5788:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:5788:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:5789:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5790:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:5790:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:5793:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:5794:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5795:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFPML.g:5795:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalFPML.g:5805:1: rule__CompositionFunctionBodyPureFactor__Group_0__0 : rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5809:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 )
            // InternalFPML.g:5810:2: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1
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
    // InternalFPML.g:5817:1: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5821:1: ( ( '|>' ) )
            // InternalFPML.g:5822:1: ( '|>' )
            {
            // InternalFPML.g:5822:1: ( '|>' )
            // InternalFPML.g:5823:2: '|>'
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
    // InternalFPML.g:5832:1: rule__CompositionFunctionBodyPureFactor__Group_0__1 : rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5836:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl )
            // InternalFPML.g:5837:2: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl
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
    // InternalFPML.g:5843:1: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5847:1: ( ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:5848:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:5848:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:5849:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:5850:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:5850:3: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:5859:1: rule__CompositionFunctionBodyPureFactor__Group_1__0 : rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5863:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 )
            // InternalFPML.g:5864:2: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:5871:1: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5875:1: ( ( '|>' ) )
            // InternalFPML.g:5876:1: ( '|>' )
            {
            // InternalFPML.g:5876:1: ( '|>' )
            // InternalFPML.g:5877:2: '|>'
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
    // InternalFPML.g:5886:1: rule__CompositionFunctionBodyPureFactor__Group_1__1 : rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5890:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl )
            // InternalFPML.g:5891:2: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl
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
    // InternalFPML.g:5897:1: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5901:1: ( ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:5902:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:5902:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:5903:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:5904:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:5904:3: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:5913:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5917:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:5918:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFPML.g:5925:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5929:1: ( ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:5930:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:5930:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:5931:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:5932:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:5932:3: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:5940:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5944:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl )
            // InternalFPML.g:5945:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl
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
    // InternalFPML.g:5951:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5955:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:5956:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:5956:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:5957:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:5957:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:5958:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5959:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            // InternalFPML.g:5959:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_36);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:5962:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:5963:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5964:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFPML.g:5964:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalFPML.g:5974:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5978:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:5979:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFPML.g:5986:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5990:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:5991:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:5991:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:5992:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:5993:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:5993:3: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:6001:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6005:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:6006:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
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
    // InternalFPML.g:6012:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6016:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:6017:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:6017:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:6018:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:6018:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:6019:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:6020:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:6020:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_36);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:6023:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:6024:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:6025:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFPML.g:6025:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalFPML.g:6035:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6039:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 )
            // InternalFPML.g:6040:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1
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
    // InternalFPML.g:6047:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6051:1: ( ( '>>=' ) )
            // InternalFPML.g:6052:1: ( '>>=' )
            {
            // InternalFPML.g:6052:1: ( '>>=' )
            // InternalFPML.g:6053:2: '>>='
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
    // InternalFPML.g:6062:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6066:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl )
            // InternalFPML.g:6067:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl
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
    // InternalFPML.g:6073:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6077:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:6078:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:6078:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:6079:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:6080:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:6080:3: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:6089:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6093:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 )
            // InternalFPML.g:6094:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:6101:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6105:1: ( ( '>>=' ) )
            // InternalFPML.g:6106:1: ( '>>=' )
            {
            // InternalFPML.g:6106:1: ( '>>=' )
            // InternalFPML.g:6107:2: '>>='
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
    // InternalFPML.g:6116:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6120:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl )
            // InternalFPML.g:6121:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl
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
    // InternalFPML.g:6127:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6131:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:6132:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:6132:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:6133:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:6134:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:6134:3: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:6143:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6147:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:6148:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:6155:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6159:1: ( ( 'IO' ) )
            // InternalFPML.g:6160:1: ( 'IO' )
            {
            // InternalFPML.g:6160:1: ( 'IO' )
            // InternalFPML.g:6161:2: 'IO'
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
    // InternalFPML.g:6170:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6174:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:6175:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:6181:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6185:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6186:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6186:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:6187:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6188:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:6188:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:6197:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6201:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:6202:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalFPML.g:6209:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6213:1: ( ( () ) )
            // InternalFPML.g:6214:1: ( () )
            {
            // InternalFPML.g:6214:1: ( () )
            // InternalFPML.g:6215:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:6216:2: ()
            // InternalFPML.g:6216:3: 
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
    // InternalFPML.g:6224:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6228:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:6229:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:6235:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6239:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6240:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6240:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:6241:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6242:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:6242:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:6251:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6255:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:6256:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalFPML.g:6263:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6267:1: ( ( () ) )
            // InternalFPML.g:6268:1: ( () )
            {
            // InternalFPML.g:6268:1: ( () )
            // InternalFPML.g:6269:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:6270:2: ()
            // InternalFPML.g:6270:3: 
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
    // InternalFPML.g:6278:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6282:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:6283:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:6289:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6293:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6294:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6294:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:6295:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6296:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:6296:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:6305:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6309:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:6310:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFPML.g:6317:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6321:1: ( ( () ) )
            // InternalFPML.g:6322:1: ( () )
            {
            // InternalFPML.g:6322:1: ( () )
            // InternalFPML.g:6323:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:6324:2: ()
            // InternalFPML.g:6324:3: 
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
    // InternalFPML.g:6332:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6336:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:6337:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:6343:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6347:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6348:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6348:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:6349:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6350:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:6350:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:6359:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6363:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:6364:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:6371:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6375:1: ( ( () ) )
            // InternalFPML.g:6376:1: ( () )
            {
            // InternalFPML.g:6376:1: ( () )
            // InternalFPML.g:6377:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:6378:2: ()
            // InternalFPML.g:6378:3: 
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
    // InternalFPML.g:6386:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6390:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:6391:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
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
    // InternalFPML.g:6398:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6402:1: ( ( 'ref' ) )
            // InternalFPML.g:6403:1: ( 'ref' )
            {
            // InternalFPML.g:6403:1: ( 'ref' )
            // InternalFPML.g:6404:2: 'ref'
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
    // InternalFPML.g:6413:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6417:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:6418:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:6424:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6428:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:6429:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:6429:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:6430:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:6431:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:6431:3: rule__DataType__TypeAssignment_2
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


    // $ANTLR start "rule__EffectFullDataType__Group__0"
    // InternalFPML.g:6440:1: rule__EffectFullDataType__Group__0 : rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1 ;
    public final void rule__EffectFullDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6444:1: ( rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1 )
            // InternalFPML.g:6445:2: rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EffectFullDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__0"


    // $ANTLR start "rule__EffectFullDataType__Group__0__Impl"
    // InternalFPML.g:6452:1: rule__EffectFullDataType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6456:1: ( ( () ) )
            // InternalFPML.g:6457:1: ( () )
            {
            // InternalFPML.g:6457:1: ( () )
            // InternalFPML.g:6458:2: ()
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0()); 
            // InternalFPML.g:6459:2: ()
            // InternalFPML.g:6459:3: 
            {
            }

             after(grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__0__Impl"


    // $ANTLR start "rule__EffectFullDataType__Group__1"
    // InternalFPML.g:6467:1: rule__EffectFullDataType__Group__1 : rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2 ;
    public final void rule__EffectFullDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6471:1: ( rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2 )
            // InternalFPML.g:6472:2: rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EffectFullDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__1"


    // $ANTLR start "rule__EffectFullDataType__Group__1__Impl"
    // InternalFPML.g:6479:1: rule__EffectFullDataType__Group__1__Impl : ( 'refIO' ) ;
    public final void rule__EffectFullDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6483:1: ( ( 'refIO' ) )
            // InternalFPML.g:6484:1: ( 'refIO' )
            {
            // InternalFPML.g:6484:1: ( 'refIO' )
            // InternalFPML.g:6485:2: 'refIO'
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__1__Impl"


    // $ANTLR start "rule__EffectFullDataType__Group__2"
    // InternalFPML.g:6494:1: rule__EffectFullDataType__Group__2 : rule__EffectFullDataType__Group__2__Impl ;
    public final void rule__EffectFullDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6498:1: ( rule__EffectFullDataType__Group__2__Impl )
            // InternalFPML.g:6499:2: rule__EffectFullDataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__2"


    // $ANTLR start "rule__EffectFullDataType__Group__2__Impl"
    // InternalFPML.g:6505:1: rule__EffectFullDataType__Group__2__Impl : ( ( rule__EffectFullDataType__TypeAssignment_2 ) ) ;
    public final void rule__EffectFullDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6509:1: ( ( ( rule__EffectFullDataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:6510:1: ( ( rule__EffectFullDataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:6510:1: ( ( rule__EffectFullDataType__TypeAssignment_2 ) )
            // InternalFPML.g:6511:2: ( rule__EffectFullDataType__TypeAssignment_2 )
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:6512:2: ( rule__EffectFullDataType__TypeAssignment_2 )
            // InternalFPML.g:6512:3: rule__EffectFullDataType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__Group__2__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__0"
    // InternalFPML.g:6521:1: rule__PureFunctionType__Group__0 : rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 ;
    public final void rule__PureFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6525:1: ( rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 )
            // InternalFPML.g:6526:2: rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:6533:1: rule__PureFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6537:1: ( ( () ) )
            // InternalFPML.g:6538:1: ( () )
            {
            // InternalFPML.g:6538:1: ( () )
            // InternalFPML.g:6539:2: ()
            {
             before(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 
            // InternalFPML.g:6540:2: ()
            // InternalFPML.g:6540:3: 
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
    // InternalFPML.g:6548:1: rule__PureFunctionType__Group__1 : rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 ;
    public final void rule__PureFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6552:1: ( rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 )
            // InternalFPML.g:6553:2: rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:6560:1: rule__PureFunctionType__Group__1__Impl : ( 'F' ) ;
    public final void rule__PureFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6564:1: ( ( 'F' ) )
            // InternalFPML.g:6565:1: ( 'F' )
            {
            // InternalFPML.g:6565:1: ( 'F' )
            // InternalFPML.g:6566:2: 'F'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getFKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalFPML.g:6575:1: rule__PureFunctionType__Group__2 : rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 ;
    public final void rule__PureFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6579:1: ( rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 )
            // InternalFPML.g:6580:2: rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:6587:1: rule__PureFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__PureFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6591:1: ( ( '<' ) )
            // InternalFPML.g:6592:1: ( '<' )
            {
            // InternalFPML.g:6592:1: ( '<' )
            // InternalFPML.g:6593:2: '<'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFPML.g:6602:1: rule__PureFunctionType__Group__3 : rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 ;
    public final void rule__PureFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6606:1: ( rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 )
            // InternalFPML.g:6607:2: rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:6614:1: rule__PureFunctionType__Group__3__Impl : ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__PureFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6618:1: ( ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:6619:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:6619:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:6620:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:6621:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:6621:3: rule__PureFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:6629:1: rule__PureFunctionType__Group__4 : rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 ;
    public final void rule__PureFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6633:1: ( rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 )
            // InternalFPML.g:6634:2: rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:6641:1: rule__PureFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__PureFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6645:1: ( ( ',' ) )
            // InternalFPML.g:6646:1: ( ',' )
            {
            // InternalFPML.g:6646:1: ( ',' )
            // InternalFPML.g:6647:2: ','
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
    // InternalFPML.g:6656:1: rule__PureFunctionType__Group__5 : rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 ;
    public final void rule__PureFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6660:1: ( rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 )
            // InternalFPML.g:6661:2: rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:6668:1: rule__PureFunctionType__Group__5__Impl : ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__PureFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6672:1: ( ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:6673:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:6673:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:6674:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:6675:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:6675:3: rule__PureFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:6683:1: rule__PureFunctionType__Group__6 : rule__PureFunctionType__Group__6__Impl ;
    public final void rule__PureFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6687:1: ( rule__PureFunctionType__Group__6__Impl )
            // InternalFPML.g:6688:2: rule__PureFunctionType__Group__6__Impl
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
    // InternalFPML.g:6694:1: rule__PureFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__PureFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6698:1: ( ( '>' ) )
            // InternalFPML.g:6699:1: ( '>' )
            {
            // InternalFPML.g:6699:1: ( '>' )
            // InternalFPML.g:6700:2: '>'
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
    // InternalFPML.g:6710:1: rule__EffectFullFunctionType__Group__0 : rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 ;
    public final void rule__EffectFullFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6714:1: ( rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 )
            // InternalFPML.g:6715:2: rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:6722:1: rule__EffectFullFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6726:1: ( ( () ) )
            // InternalFPML.g:6727:1: ( () )
            {
            // InternalFPML.g:6727:1: ( () )
            // InternalFPML.g:6728:2: ()
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 
            // InternalFPML.g:6729:2: ()
            // InternalFPML.g:6729:3: 
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
    // InternalFPML.g:6737:1: rule__EffectFullFunctionType__Group__1 : rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 ;
    public final void rule__EffectFullFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6741:1: ( rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 )
            // InternalFPML.g:6742:2: rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:6749:1: rule__EffectFullFunctionType__Group__1__Impl : ( 'FIO' ) ;
    public final void rule__EffectFullFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6753:1: ( ( 'FIO' ) )
            // InternalFPML.g:6754:1: ( 'FIO' )
            {
            // InternalFPML.g:6754:1: ( 'FIO' )
            // InternalFPML.g:6755:2: 'FIO'
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
    // InternalFPML.g:6764:1: rule__EffectFullFunctionType__Group__2 : rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 ;
    public final void rule__EffectFullFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6768:1: ( rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 )
            // InternalFPML.g:6769:2: rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalFPML.g:6776:1: rule__EffectFullFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__EffectFullFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6780:1: ( ( '<' ) )
            // InternalFPML.g:6781:1: ( '<' )
            {
            // InternalFPML.g:6781:1: ( '<' )
            // InternalFPML.g:6782:2: '<'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFPML.g:6791:1: rule__EffectFullFunctionType__Group__3 : rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 ;
    public final void rule__EffectFullFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6795:1: ( rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 )
            // InternalFPML.g:6796:2: rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:6803:1: rule__EffectFullFunctionType__Group__3__Impl : ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6807:1: ( ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:6808:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:6808:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:6809:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:6810:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:6810:3: rule__EffectFullFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:6818:1: rule__EffectFullFunctionType__Group__4 : rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 ;
    public final void rule__EffectFullFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6822:1: ( rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 )
            // InternalFPML.g:6823:2: rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:6830:1: rule__EffectFullFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6834:1: ( ( ',' ) )
            // InternalFPML.g:6835:1: ( ',' )
            {
            // InternalFPML.g:6835:1: ( ',' )
            // InternalFPML.g:6836:2: ','
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
    // InternalFPML.g:6845:1: rule__EffectFullFunctionType__Group__5 : rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 ;
    public final void rule__EffectFullFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6849:1: ( rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 )
            // InternalFPML.g:6850:2: rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:6857:1: rule__EffectFullFunctionType__Group__5__Impl : ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__EffectFullFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6861:1: ( ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:6862:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:6862:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:6863:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:6864:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:6864:3: rule__EffectFullFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:6872:1: rule__EffectFullFunctionType__Group__6 : rule__EffectFullFunctionType__Group__6__Impl ;
    public final void rule__EffectFullFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6876:1: ( rule__EffectFullFunctionType__Group__6__Impl )
            // InternalFPML.g:6877:2: rule__EffectFullFunctionType__Group__6__Impl
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
    // InternalFPML.g:6883:1: rule__EffectFullFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__EffectFullFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6887:1: ( ( '>' ) )
            // InternalFPML.g:6888:1: ( '>' )
            {
            // InternalFPML.g:6888:1: ( '>' )
            // InternalFPML.g:6889:2: '>'
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


    // $ANTLR start "rule__EffectFullExpression__Group_0__0"
    // InternalFPML.g:6899:1: rule__EffectFullExpression__Group_0__0 : rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1 ;
    public final void rule__EffectFullExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6903:1: ( rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1 )
            // InternalFPML.g:6904:2: rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__EffectFullExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__0"


    // $ANTLR start "rule__EffectFullExpression__Group_0__0__Impl"
    // InternalFPML.g:6911:1: rule__EffectFullExpression__Group_0__0__Impl : ( 'IO' ) ;
    public final void rule__EffectFullExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6915:1: ( ( 'IO' ) )
            // InternalFPML.g:6916:1: ( 'IO' )
            {
            // InternalFPML.g:6916:1: ( 'IO' )
            // InternalFPML.g:6917:2: 'IO'
            {
             before(grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__0__Impl"


    // $ANTLR start "rule__EffectFullExpression__Group_0__1"
    // InternalFPML.g:6926:1: rule__EffectFullExpression__Group_0__1 : rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2 ;
    public final void rule__EffectFullExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6930:1: ( rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2 )
            // InternalFPML.g:6931:2: rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__EffectFullExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__1"


    // $ANTLR start "rule__EffectFullExpression__Group_0__1__Impl"
    // InternalFPML.g:6938:1: rule__EffectFullExpression__Group_0__1__Impl : ( '(' ) ;
    public final void rule__EffectFullExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6942:1: ( ( '(' ) )
            // InternalFPML.g:6943:1: ( '(' )
            {
            // InternalFPML.g:6943:1: ( '(' )
            // InternalFPML.g:6944:2: '('
            {
             before(grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__1__Impl"


    // $ANTLR start "rule__EffectFullExpression__Group_0__2"
    // InternalFPML.g:6953:1: rule__EffectFullExpression__Group_0__2 : rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3 ;
    public final void rule__EffectFullExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6957:1: ( rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3 )
            // InternalFPML.g:6958:2: rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3
            {
            pushFollow(FOLLOW_44);
            rule__EffectFullExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullExpression__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__2"


    // $ANTLR start "rule__EffectFullExpression__Group_0__2__Impl"
    // InternalFPML.g:6965:1: rule__EffectFullExpression__Group_0__2__Impl : ( ruleExpression ) ;
    public final void rule__EffectFullExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6969:1: ( ( ruleExpression ) )
            // InternalFPML.g:6970:1: ( ruleExpression )
            {
            // InternalFPML.g:6970:1: ( ruleExpression )
            // InternalFPML.g:6971:2: ruleExpression
            {
             before(grammarAccess.getEffectFullExpressionAccess().getExpressionParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEffectFullExpressionAccess().getExpressionParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__2__Impl"


    // $ANTLR start "rule__EffectFullExpression__Group_0__3"
    // InternalFPML.g:6980:1: rule__EffectFullExpression__Group_0__3 : rule__EffectFullExpression__Group_0__3__Impl ;
    public final void rule__EffectFullExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6984:1: ( rule__EffectFullExpression__Group_0__3__Impl )
            // InternalFPML.g:6985:2: rule__EffectFullExpression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullExpression__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__3"


    // $ANTLR start "rule__EffectFullExpression__Group_0__3__Impl"
    // InternalFPML.g:6991:1: rule__EffectFullExpression__Group_0__3__Impl : ( ')' ) ;
    public final void rule__EffectFullExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6995:1: ( ( ')' ) )
            // InternalFPML.g:6996:1: ( ')' )
            {
            // InternalFPML.g:6996:1: ( ')' )
            // InternalFPML.g:6997:2: ')'
            {
             before(grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullExpression__Group_0__3__Impl"


    // $ANTLR start "rule__UnitValue__Group__0"
    // InternalFPML.g:7007:1: rule__UnitValue__Group__0 : rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 ;
    public final void rule__UnitValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7011:1: ( rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 )
            // InternalFPML.g:7012:2: rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:7019:1: rule__UnitValue__Group__0__Impl : ( () ) ;
    public final void rule__UnitValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7023:1: ( ( () ) )
            // InternalFPML.g:7024:1: ( () )
            {
            // InternalFPML.g:7024:1: ( () )
            // InternalFPML.g:7025:2: ()
            {
             before(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:7026:2: ()
            // InternalFPML.g:7026:3: 
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
    // InternalFPML.g:7034:1: rule__UnitValue__Group__1 : rule__UnitValue__Group__1__Impl ;
    public final void rule__UnitValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7038:1: ( rule__UnitValue__Group__1__Impl )
            // InternalFPML.g:7039:2: rule__UnitValue__Group__1__Impl
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
    // InternalFPML.g:7045:1: rule__UnitValue__Group__1__Impl : ( '()' ) ;
    public final void rule__UnitValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7049:1: ( ( '()' ) )
            // InternalFPML.g:7050:1: ( '()' )
            {
            // InternalFPML.g:7050:1: ( '()' )
            // InternalFPML.g:7051:2: '()'
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


    // $ANTLR start "rule__EffectFullValueRef__Group__0"
    // InternalFPML.g:7061:1: rule__EffectFullValueRef__Group__0 : rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1 ;
    public final void rule__EffectFullValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7065:1: ( rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1 )
            // InternalFPML.g:7066:2: rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EffectFullValueRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullValueRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueRef__Group__0"


    // $ANTLR start "rule__EffectFullValueRef__Group__0__Impl"
    // InternalFPML.g:7073:1: rule__EffectFullValueRef__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7077:1: ( ( () ) )
            // InternalFPML.g:7078:1: ( () )
            {
            // InternalFPML.g:7078:1: ( () )
            // InternalFPML.g:7079:2: ()
            {
             before(grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0()); 
            // InternalFPML.g:7080:2: ()
            // InternalFPML.g:7080:3: 
            {
            }

             after(grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueRef__Group__0__Impl"


    // $ANTLR start "rule__EffectFullValueRef__Group__1"
    // InternalFPML.g:7088:1: rule__EffectFullValueRef__Group__1 : rule__EffectFullValueRef__Group__1__Impl ;
    public final void rule__EffectFullValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7092:1: ( rule__EffectFullValueRef__Group__1__Impl )
            // InternalFPML.g:7093:2: rule__EffectFullValueRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValueRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueRef__Group__1"


    // $ANTLR start "rule__EffectFullValueRef__Group__1__Impl"
    // InternalFPML.g:7099:1: rule__EffectFullValueRef__Group__1__Impl : ( ( rule__EffectFullValueRef__ValueAssignment_1 ) ) ;
    public final void rule__EffectFullValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7103:1: ( ( ( rule__EffectFullValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:7104:1: ( ( rule__EffectFullValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7104:1: ( ( rule__EffectFullValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:7105:2: ( rule__EffectFullValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getEffectFullValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:7106:2: ( rule__EffectFullValueRef__ValueAssignment_1 )
            // InternalFPML.g:7106:3: rule__EffectFullValueRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullValueRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullValueRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueRef__Group__1__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__0"
    // InternalFPML.g:7115:1: rule__EffectFullLambda__Group_0__0 : rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1 ;
    public final void rule__EffectFullLambda__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7119:1: ( rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1 )
            // InternalFPML.g:7120:2: rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1
            {
            pushFollow(FOLLOW_46);
            rule__EffectFullLambda__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__0"


    // $ANTLR start "rule__EffectFullLambda__Group_0__0__Impl"
    // InternalFPML.g:7127:1: rule__EffectFullLambda__Group_0__0__Impl : ( () ) ;
    public final void rule__EffectFullLambda__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7131:1: ( ( () ) )
            // InternalFPML.g:7132:1: ( () )
            {
            // InternalFPML.g:7132:1: ( () )
            // InternalFPML.g:7133:2: ()
            {
             before(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0()); 
            // InternalFPML.g:7134:2: ()
            // InternalFPML.g:7134:3: 
            {
            }

             after(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__0__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__1"
    // InternalFPML.g:7142:1: rule__EffectFullLambda__Group_0__1 : rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2 ;
    public final void rule__EffectFullLambda__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7146:1: ( rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2 )
            // InternalFPML.g:7147:2: rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__EffectFullLambda__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__1"


    // $ANTLR start "rule__EffectFullLambda__Group_0__1__Impl"
    // InternalFPML.g:7154:1: rule__EffectFullLambda__Group_0__1__Impl : ( '[' ) ;
    public final void rule__EffectFullLambda__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7158:1: ( ( '[' ) )
            // InternalFPML.g:7159:1: ( '[' )
            {
            // InternalFPML.g:7159:1: ( '[' )
            // InternalFPML.g:7160:2: '['
            {
             before(grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__1__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__2"
    // InternalFPML.g:7169:1: rule__EffectFullLambda__Group_0__2 : rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3 ;
    public final void rule__EffectFullLambda__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7173:1: ( rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3 )
            // InternalFPML.g:7174:2: rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__EffectFullLambda__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__2"


    // $ANTLR start "rule__EffectFullLambda__Group_0__2__Impl"
    // InternalFPML.g:7181:1: rule__EffectFullLambda__Group_0__2__Impl : ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) ) ;
    public final void rule__EffectFullLambda__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7185:1: ( ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) ) )
            // InternalFPML.g:7186:1: ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) )
            {
            // InternalFPML.g:7186:1: ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) )
            // InternalFPML.g:7187:2: ( rule__EffectFullLambda__ArgAssignment_0_2 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_0_2()); 
            // InternalFPML.g:7188:2: ( rule__EffectFullLambda__ArgAssignment_0_2 )
            // InternalFPML.g:7188:3: rule__EffectFullLambda__ArgAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__ArgAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__2__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__3"
    // InternalFPML.g:7196:1: rule__EffectFullLambda__Group_0__3 : rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4 ;
    public final void rule__EffectFullLambda__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7200:1: ( rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4 )
            // InternalFPML.g:7201:2: rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullLambda__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__3"


    // $ANTLR start "rule__EffectFullLambda__Group_0__3__Impl"
    // InternalFPML.g:7208:1: rule__EffectFullLambda__Group_0__3__Impl : ( ']' ) ;
    public final void rule__EffectFullLambda__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7212:1: ( ( ']' ) )
            // InternalFPML.g:7213:1: ( ']' )
            {
            // InternalFPML.g:7213:1: ( ']' )
            // InternalFPML.g:7214:2: ']'
            {
             before(grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__3__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__4"
    // InternalFPML.g:7223:1: rule__EffectFullLambda__Group_0__4 : rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5 ;
    public final void rule__EffectFullLambda__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7227:1: ( rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5 )
            // InternalFPML.g:7228:2: rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5
            {
            pushFollow(FOLLOW_28);
            rule__EffectFullLambda__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__4"


    // $ANTLR start "rule__EffectFullLambda__Group_0__4__Impl"
    // InternalFPML.g:7235:1: rule__EffectFullLambda__Group_0__4__Impl : ( ':' ) ;
    public final void rule__EffectFullLambda__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7239:1: ( ( ':' ) )
            // InternalFPML.g:7240:1: ( ':' )
            {
            // InternalFPML.g:7240:1: ( ':' )
            // InternalFPML.g:7241:2: ':'
            {
             before(grammarAccess.getEffectFullLambdaAccess().getColonKeyword_0_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getColonKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__4__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_0__5"
    // InternalFPML.g:7250:1: rule__EffectFullLambda__Group_0__5 : rule__EffectFullLambda__Group_0__5__Impl ;
    public final void rule__EffectFullLambda__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7254:1: ( rule__EffectFullLambda__Group_0__5__Impl )
            // InternalFPML.g:7255:2: rule__EffectFullLambda__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__5"


    // $ANTLR start "rule__EffectFullLambda__Group_0__5__Impl"
    // InternalFPML.g:7261:1: rule__EffectFullLambda__Group_0__5__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) ) ;
    public final void rule__EffectFullLambda__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7265:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) ) )
            // InternalFPML.g:7266:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) )
            {
            // InternalFPML.g:7266:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) )
            // InternalFPML.g:7267:2: ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_0_5()); 
            // InternalFPML.g:7268:2: ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 )
            // InternalFPML.g:7268:3: rule__EffectFullLambda__FunctionBodyAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__FunctionBodyAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_0__5__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_1__0"
    // InternalFPML.g:7277:1: rule__EffectFullLambda__Group_1__0 : rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1 ;
    public final void rule__EffectFullLambda__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7281:1: ( rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1 )
            // InternalFPML.g:7282:2: rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__EffectFullLambda__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_1__0"


    // $ANTLR start "rule__EffectFullLambda__Group_1__0__Impl"
    // InternalFPML.g:7289:1: rule__EffectFullLambda__Group_1__0__Impl : ( () ) ;
    public final void rule__EffectFullLambda__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7293:1: ( ( () ) )
            // InternalFPML.g:7294:1: ( () )
            {
            // InternalFPML.g:7294:1: ( () )
            // InternalFPML.g:7295:2: ()
            {
             before(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0()); 
            // InternalFPML.g:7296:2: ()
            // InternalFPML.g:7296:3: 
            {
            }

             after(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_1__0__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group_1__1"
    // InternalFPML.g:7304:1: rule__EffectFullLambda__Group_1__1 : rule__EffectFullLambda__Group_1__1__Impl ;
    public final void rule__EffectFullLambda__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7308:1: ( rule__EffectFullLambda__Group_1__1__Impl )
            // InternalFPML.g:7309:2: rule__EffectFullLambda__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_1__1"


    // $ANTLR start "rule__EffectFullLambda__Group_1__1__Impl"
    // InternalFPML.g:7315:1: rule__EffectFullLambda__Group_1__1__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) ) ;
    public final void rule__EffectFullLambda__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7319:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) ) )
            // InternalFPML.g:7320:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) )
            {
            // InternalFPML.g:7320:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) )
            // InternalFPML.g:7321:2: ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_1_1()); 
            // InternalFPML.g:7322:2: ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 )
            // InternalFPML.g:7322:3: rule__EffectFullLambda__FunctionBodyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__FunctionBodyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group_1__1__Impl"


    // $ANTLR start "rule__IntValue__Group__0"
    // InternalFPML.g:7331:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7335:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:7336:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:7343:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7347:1: ( ( () ) )
            // InternalFPML.g:7348:1: ( () )
            {
            // InternalFPML.g:7348:1: ( () )
            // InternalFPML.g:7349:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:7350:2: ()
            // InternalFPML.g:7350:3: 
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
    // InternalFPML.g:7358:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7362:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:7363:2: rule__IntValue__Group__1__Impl
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
    // InternalFPML.g:7369:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7373:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:7374:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7374:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:7375:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:7376:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:7376:3: rule__IntValue__ValueAssignment_1
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
    // InternalFPML.g:7385:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7389:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:7390:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:7397:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7401:1: ( ( () ) )
            // InternalFPML.g:7402:1: ( () )
            {
            // InternalFPML.g:7402:1: ( () )
            // InternalFPML.g:7403:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:7404:2: ()
            // InternalFPML.g:7404:3: 
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
    // InternalFPML.g:7412:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7416:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:7417:2: rule__StringValue__Group__1__Impl
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
    // InternalFPML.g:7423:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7427:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:7428:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7428:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:7429:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:7430:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:7430:3: rule__StringValue__ValueAssignment_1
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
    // InternalFPML.g:7439:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7443:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:7444:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
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
    // InternalFPML.g:7451:1: rule__DataValue__Group__0__Impl : ( () ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7455:1: ( ( () ) )
            // InternalFPML.g:7456:1: ( () )
            {
            // InternalFPML.g:7456:1: ( () )
            // InternalFPML.g:7457:2: ()
            {
             before(grammarAccess.getDataValueAccess().getDataValueAction_0()); 
            // InternalFPML.g:7458:2: ()
            // InternalFPML.g:7458:3: 
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
    // InternalFPML.g:7466:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7470:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:7471:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:7478:1: rule__DataValue__Group__1__Impl : ( ( rule__DataValue__TypeAssignment_1 ) ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7482:1: ( ( ( rule__DataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:7483:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:7483:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            // InternalFPML.g:7484:2: ( rule__DataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:7485:2: ( rule__DataValue__TypeAssignment_1 )
            // InternalFPML.g:7485:3: rule__DataValue__TypeAssignment_1
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
    // InternalFPML.g:7493:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7497:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:7498:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalFPML.g:7505:1: rule__DataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7509:1: ( ( '(' ) )
            // InternalFPML.g:7510:1: ( '(' )
            {
            // InternalFPML.g:7510:1: ( '(' )
            // InternalFPML.g:7511:2: '('
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
    // InternalFPML.g:7520:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7524:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalFPML.g:7525:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalFPML.g:7532:1: rule__DataValue__Group__3__Impl : ( ( rule__DataValue__ValueAssignment_3 ) ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7536:1: ( ( ( rule__DataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:7537:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:7537:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            // InternalFPML.g:7538:2: ( rule__DataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:7539:2: ( rule__DataValue__ValueAssignment_3 )
            // InternalFPML.g:7539:3: rule__DataValue__ValueAssignment_3
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
    // InternalFPML.g:7547:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7551:1: ( rule__DataValue__Group__4__Impl )
            // InternalFPML.g:7552:2: rule__DataValue__Group__4__Impl
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
    // InternalFPML.g:7558:1: rule__DataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7562:1: ( ( ')' ) )
            // InternalFPML.g:7563:1: ( ')' )
            {
            // InternalFPML.g:7563:1: ( ')' )
            // InternalFPML.g:7564:2: ')'
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


    // $ANTLR start "rule__EffectFullDataValue__Group__0"
    // InternalFPML.g:7574:1: rule__EffectFullDataValue__Group__0 : rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1 ;
    public final void rule__EffectFullDataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7578:1: ( rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1 )
            // InternalFPML.g:7579:2: rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EffectFullDataValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__0"


    // $ANTLR start "rule__EffectFullDataValue__Group__0__Impl"
    // InternalFPML.g:7586:1: rule__EffectFullDataValue__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullDataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7590:1: ( ( () ) )
            // InternalFPML.g:7591:1: ( () )
            {
            // InternalFPML.g:7591:1: ( () )
            // InternalFPML.g:7592:2: ()
            {
             before(grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0()); 
            // InternalFPML.g:7593:2: ()
            // InternalFPML.g:7593:3: 
            {
            }

             after(grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__0__Impl"


    // $ANTLR start "rule__EffectFullDataValue__Group__1"
    // InternalFPML.g:7601:1: rule__EffectFullDataValue__Group__1 : rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2 ;
    public final void rule__EffectFullDataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7605:1: ( rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2 )
            // InternalFPML.g:7606:2: rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__EffectFullDataValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__1"


    // $ANTLR start "rule__EffectFullDataValue__Group__1__Impl"
    // InternalFPML.g:7613:1: rule__EffectFullDataValue__Group__1__Impl : ( ( rule__EffectFullDataValue__TypeAssignment_1 ) ) ;
    public final void rule__EffectFullDataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7617:1: ( ( ( rule__EffectFullDataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:7618:1: ( ( rule__EffectFullDataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:7618:1: ( ( rule__EffectFullDataValue__TypeAssignment_1 ) )
            // InternalFPML.g:7619:2: ( rule__EffectFullDataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:7620:2: ( rule__EffectFullDataValue__TypeAssignment_1 )
            // InternalFPML.g:7620:3: rule__EffectFullDataValue__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataValueAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__1__Impl"


    // $ANTLR start "rule__EffectFullDataValue__Group__2"
    // InternalFPML.g:7628:1: rule__EffectFullDataValue__Group__2 : rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3 ;
    public final void rule__EffectFullDataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7632:1: ( rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3 )
            // InternalFPML.g:7633:2: rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__EffectFullDataValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__2"


    // $ANTLR start "rule__EffectFullDataValue__Group__2__Impl"
    // InternalFPML.g:7640:1: rule__EffectFullDataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__EffectFullDataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7644:1: ( ( '(' ) )
            // InternalFPML.g:7645:1: ( '(' )
            {
            // InternalFPML.g:7645:1: ( '(' )
            // InternalFPML.g:7646:2: '('
            {
             before(grammarAccess.getEffectFullDataValueAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataValueAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__2__Impl"


    // $ANTLR start "rule__EffectFullDataValue__Group__3"
    // InternalFPML.g:7655:1: rule__EffectFullDataValue__Group__3 : rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4 ;
    public final void rule__EffectFullDataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7659:1: ( rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4 )
            // InternalFPML.g:7660:2: rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EffectFullDataValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__3"


    // $ANTLR start "rule__EffectFullDataValue__Group__3__Impl"
    // InternalFPML.g:7667:1: rule__EffectFullDataValue__Group__3__Impl : ( ( rule__EffectFullDataValue__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullDataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7671:1: ( ( ( rule__EffectFullDataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:7672:1: ( ( rule__EffectFullDataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:7672:1: ( ( rule__EffectFullDataValue__ValueAssignment_3 ) )
            // InternalFPML.g:7673:2: ( rule__EffectFullDataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:7674:2: ( rule__EffectFullDataValue__ValueAssignment_3 )
            // InternalFPML.g:7674:3: rule__EffectFullDataValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullDataValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__3__Impl"


    // $ANTLR start "rule__EffectFullDataValue__Group__4"
    // InternalFPML.g:7682:1: rule__EffectFullDataValue__Group__4 : rule__EffectFullDataValue__Group__4__Impl ;
    public final void rule__EffectFullDataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7686:1: ( rule__EffectFullDataValue__Group__4__Impl )
            // InternalFPML.g:7687:2: rule__EffectFullDataValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullDataValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__4"


    // $ANTLR start "rule__EffectFullDataValue__Group__4__Impl"
    // InternalFPML.g:7693:1: rule__EffectFullDataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectFullDataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7697:1: ( ( ')' ) )
            // InternalFPML.g:7698:1: ( ')' )
            {
            // InternalFPML.g:7698:1: ( ')' )
            // InternalFPML.g:7699:2: ')'
            {
             before(grammarAccess.getEffectFullDataValueAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__Group__4__Impl"


    // $ANTLR start "rule__PureValueRef__Group__0"
    // InternalFPML.g:7709:1: rule__PureValueRef__Group__0 : rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1 ;
    public final void rule__PureValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7713:1: ( rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1 )
            // InternalFPML.g:7714:2: rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__PureValueRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureValueRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueRef__Group__0"


    // $ANTLR start "rule__PureValueRef__Group__0__Impl"
    // InternalFPML.g:7721:1: rule__PureValueRef__Group__0__Impl : ( () ) ;
    public final void rule__PureValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7725:1: ( ( () ) )
            // InternalFPML.g:7726:1: ( () )
            {
            // InternalFPML.g:7726:1: ( () )
            // InternalFPML.g:7727:2: ()
            {
             before(grammarAccess.getPureValueRefAccess().getPureValueRefAction_0()); 
            // InternalFPML.g:7728:2: ()
            // InternalFPML.g:7728:3: 
            {
            }

             after(grammarAccess.getPureValueRefAccess().getPureValueRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueRef__Group__0__Impl"


    // $ANTLR start "rule__PureValueRef__Group__1"
    // InternalFPML.g:7736:1: rule__PureValueRef__Group__1 : rule__PureValueRef__Group__1__Impl ;
    public final void rule__PureValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7740:1: ( rule__PureValueRef__Group__1__Impl )
            // InternalFPML.g:7741:2: rule__PureValueRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureValueRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueRef__Group__1"


    // $ANTLR start "rule__PureValueRef__Group__1__Impl"
    // InternalFPML.g:7747:1: rule__PureValueRef__Group__1__Impl : ( ( rule__PureValueRef__ValueAssignment_1 ) ) ;
    public final void rule__PureValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7751:1: ( ( ( rule__PureValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:7752:1: ( ( rule__PureValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7752:1: ( ( rule__PureValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:7753:2: ( rule__PureValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getPureValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:7754:2: ( rule__PureValueRef__ValueAssignment_1 )
            // InternalFPML.g:7754:3: rule__PureValueRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureValueRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureValueRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueRef__Group__1__Impl"


    // $ANTLR start "rule__PureLambda__Group__0"
    // InternalFPML.g:7763:1: rule__PureLambda__Group__0 : rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 ;
    public final void rule__PureLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7767:1: ( rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 )
            // InternalFPML.g:7768:2: rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1
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
    // InternalFPML.g:7775:1: rule__PureLambda__Group__0__Impl : ( () ) ;
    public final void rule__PureLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7779:1: ( ( () ) )
            // InternalFPML.g:7780:1: ( () )
            {
            // InternalFPML.g:7780:1: ( () )
            // InternalFPML.g:7781:2: ()
            {
             before(grammarAccess.getPureLambdaAccess().getPureLambdaAction_0()); 
            // InternalFPML.g:7782:2: ()
            // InternalFPML.g:7782:3: 
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
    // InternalFPML.g:7790:1: rule__PureLambda__Group__1 : rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 ;
    public final void rule__PureLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7794:1: ( rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 )
            // InternalFPML.g:7795:2: rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2
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
    // InternalFPML.g:7802:1: rule__PureLambda__Group__1__Impl : ( '(' ) ;
    public final void rule__PureLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7806:1: ( ( '(' ) )
            // InternalFPML.g:7807:1: ( '(' )
            {
            // InternalFPML.g:7807:1: ( '(' )
            // InternalFPML.g:7808:2: '('
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
    // InternalFPML.g:7817:1: rule__PureLambda__Group__2 : rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 ;
    public final void rule__PureLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7821:1: ( rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 )
            // InternalFPML.g:7822:2: rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalFPML.g:7829:1: rule__PureLambda__Group__2__Impl : ( ( rule__PureLambda__ArgAssignment_2 ) ) ;
    public final void rule__PureLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7833:1: ( ( ( rule__PureLambda__ArgAssignment_2 ) ) )
            // InternalFPML.g:7834:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            {
            // InternalFPML.g:7834:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            // InternalFPML.g:7835:2: ( rule__PureLambda__ArgAssignment_2 )
            {
             before(grammarAccess.getPureLambdaAccess().getArgAssignment_2()); 
            // InternalFPML.g:7836:2: ( rule__PureLambda__ArgAssignment_2 )
            // InternalFPML.g:7836:3: rule__PureLambda__ArgAssignment_2
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
    // InternalFPML.g:7844:1: rule__PureLambda__Group__3 : rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 ;
    public final void rule__PureLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7848:1: ( rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 )
            // InternalFPML.g:7849:2: rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4
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
    // InternalFPML.g:7856:1: rule__PureLambda__Group__3__Impl : ( ')' ) ;
    public final void rule__PureLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7860:1: ( ( ')' ) )
            // InternalFPML.g:7861:1: ( ')' )
            {
            // InternalFPML.g:7861:1: ( ')' )
            // InternalFPML.g:7862:2: ')'
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
    // InternalFPML.g:7871:1: rule__PureLambda__Group__4 : rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 ;
    public final void rule__PureLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7875:1: ( rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 )
            // InternalFPML.g:7876:2: rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:7883:1: rule__PureLambda__Group__4__Impl : ( ':' ) ;
    public final void rule__PureLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7887:1: ( ( ':' ) )
            // InternalFPML.g:7888:1: ( ':' )
            {
            // InternalFPML.g:7888:1: ( ':' )
            // InternalFPML.g:7889:2: ':'
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
    // InternalFPML.g:7898:1: rule__PureLambda__Group__5 : rule__PureLambda__Group__5__Impl ;
    public final void rule__PureLambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7902:1: ( rule__PureLambda__Group__5__Impl )
            // InternalFPML.g:7903:2: rule__PureLambda__Group__5__Impl
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
    // InternalFPML.g:7909:1: rule__PureLambda__Group__5__Impl : ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) ;
    public final void rule__PureLambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7913:1: ( ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:7914:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:7914:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:7915:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:7916:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            // InternalFPML.g:7916:3: rule__PureLambda__FunctionBodyAssignment_5
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


    // $ANTLR start "rule__PureProdValue__Group__0"
    // InternalFPML.g:7925:1: rule__PureProdValue__Group__0 : rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1 ;
    public final void rule__PureProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7929:1: ( rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1 )
            // InternalFPML.g:7930:2: rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__PureProdValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__0"


    // $ANTLR start "rule__PureProdValue__Group__0__Impl"
    // InternalFPML.g:7937:1: rule__PureProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__PureProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7941:1: ( ( '(' ) )
            // InternalFPML.g:7942:1: ( '(' )
            {
            // InternalFPML.g:7942:1: ( '(' )
            // InternalFPML.g:7943:2: '('
            {
             before(grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__0__Impl"


    // $ANTLR start "rule__PureProdValue__Group__1"
    // InternalFPML.g:7952:1: rule__PureProdValue__Group__1 : rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2 ;
    public final void rule__PureProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7956:1: ( rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2 )
            // InternalFPML.g:7957:2: rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__PureProdValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__1"


    // $ANTLR start "rule__PureProdValue__Group__1__Impl"
    // InternalFPML.g:7964:1: rule__PureProdValue__Group__1__Impl : ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__PureProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7968:1: ( ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:7969:1: ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:7969:1: ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:7970:2: ( rule__PureProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:7971:2: ( rule__PureProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:7971:3: rule__PureProdValue__ProdAdtElement1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureProdValue__ProdAdtElement1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureProdValueAccess().getProdAdtElement1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__1__Impl"


    // $ANTLR start "rule__PureProdValue__Group__2"
    // InternalFPML.g:7979:1: rule__PureProdValue__Group__2 : rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3 ;
    public final void rule__PureProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7983:1: ( rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3 )
            // InternalFPML.g:7984:2: rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__PureProdValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__2"


    // $ANTLR start "rule__PureProdValue__Group__2__Impl"
    // InternalFPML.g:7991:1: rule__PureProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__PureProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7995:1: ( ( ',' ) )
            // InternalFPML.g:7996:1: ( ',' )
            {
            // InternalFPML.g:7996:1: ( ',' )
            // InternalFPML.g:7997:2: ','
            {
             before(grammarAccess.getPureProdValueAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPureProdValueAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__2__Impl"


    // $ANTLR start "rule__PureProdValue__Group__3"
    // InternalFPML.g:8006:1: rule__PureProdValue__Group__3 : rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4 ;
    public final void rule__PureProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8010:1: ( rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4 )
            // InternalFPML.g:8011:2: rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__PureProdValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__3"


    // $ANTLR start "rule__PureProdValue__Group__3__Impl"
    // InternalFPML.g:8018:1: rule__PureProdValue__Group__3__Impl : ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__PureProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8022:1: ( ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:8023:1: ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:8023:1: ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:8024:2: ( rule__PureProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:8025:2: ( rule__PureProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:8025:3: rule__PureProdValue__ProdAdtElement2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PureProdValue__ProdAdtElement2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPureProdValueAccess().getProdAdtElement2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__3__Impl"


    // $ANTLR start "rule__PureProdValue__Group__4"
    // InternalFPML.g:8033:1: rule__PureProdValue__Group__4 : rule__PureProdValue__Group__4__Impl ;
    public final void rule__PureProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8037:1: ( rule__PureProdValue__Group__4__Impl )
            // InternalFPML.g:8038:2: rule__PureProdValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureProdValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__4"


    // $ANTLR start "rule__PureProdValue__Group__4__Impl"
    // InternalFPML.g:8044:1: rule__PureProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__PureProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8048:1: ( ( ')' ) )
            // InternalFPML.g:8049:1: ( ')' )
            {
            // InternalFPML.g:8049:1: ( ')' )
            // InternalFPML.g:8050:2: ')'
            {
             before(grammarAccess.getPureProdValueAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureProdValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__Group__4__Impl"


    // $ANTLR start "rule__PureSumValue__Group_0__0"
    // InternalFPML.g:8060:1: rule__PureSumValue__Group_0__0 : rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1 ;
    public final void rule__PureSumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8064:1: ( rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1 )
            // InternalFPML.g:8065:2: rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__PureSumValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__0"


    // $ANTLR start "rule__PureSumValue__Group_0__0__Impl"
    // InternalFPML.g:8072:1: rule__PureSumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__PureSumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8076:1: ( ( 'Left' ) )
            // InternalFPML.g:8077:1: ( 'Left' )
            {
            // InternalFPML.g:8077:1: ( 'Left' )
            // InternalFPML.g:8078:2: 'Left'
            {
             before(grammarAccess.getPureSumValueAccess().getLeftKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getLeftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__0__Impl"


    // $ANTLR start "rule__PureSumValue__Group_0__1"
    // InternalFPML.g:8087:1: rule__PureSumValue__Group_0__1 : rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2 ;
    public final void rule__PureSumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8091:1: ( rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2 )
            // InternalFPML.g:8092:2: rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2
            {
            pushFollow(FOLLOW_49);
            rule__PureSumValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__1"


    // $ANTLR start "rule__PureSumValue__Group_0__1__Impl"
    // InternalFPML.g:8099:1: rule__PureSumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__PureSumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8103:1: ( ( '(' ) )
            // InternalFPML.g:8104:1: ( '(' )
            {
            // InternalFPML.g:8104:1: ( '(' )
            // InternalFPML.g:8105:2: '('
            {
             before(grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__1__Impl"


    // $ANTLR start "rule__PureSumValue__Group_0__2"
    // InternalFPML.g:8114:1: rule__PureSumValue__Group_0__2 : rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3 ;
    public final void rule__PureSumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8118:1: ( rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3 )
            // InternalFPML.g:8119:2: rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3
            {
            pushFollow(FOLLOW_44);
            rule__PureSumValue__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__2"


    // $ANTLR start "rule__PureSumValue__Group_0__2__Impl"
    // InternalFPML.g:8126:1: rule__PureSumValue__Group_0__2__Impl : ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__PureSumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8130:1: ( ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:8131:1: ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:8131:1: ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:8132:2: ( rule__PureSumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:8133:2: ( rule__PureSumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:8133:3: rule__PureSumValue__SumAdtElement1Assignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PureSumValue__SumAdtElement1Assignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPureSumValueAccess().getSumAdtElement1Assignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__2__Impl"


    // $ANTLR start "rule__PureSumValue__Group_0__3"
    // InternalFPML.g:8141:1: rule__PureSumValue__Group_0__3 : rule__PureSumValue__Group_0__3__Impl ;
    public final void rule__PureSumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8145:1: ( rule__PureSumValue__Group_0__3__Impl )
            // InternalFPML.g:8146:2: rule__PureSumValue__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__3"


    // $ANTLR start "rule__PureSumValue__Group_0__3__Impl"
    // InternalFPML.g:8152:1: rule__PureSumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__PureSumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8156:1: ( ( ')' ) )
            // InternalFPML.g:8157:1: ( ')' )
            {
            // InternalFPML.g:8157:1: ( ')' )
            // InternalFPML.g:8158:2: ')'
            {
             before(grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_0__3__Impl"


    // $ANTLR start "rule__PureSumValue__Group_1__0"
    // InternalFPML.g:8168:1: rule__PureSumValue__Group_1__0 : rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1 ;
    public final void rule__PureSumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8172:1: ( rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1 )
            // InternalFPML.g:8173:2: rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__PureSumValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__0"


    // $ANTLR start "rule__PureSumValue__Group_1__0__Impl"
    // InternalFPML.g:8180:1: rule__PureSumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__PureSumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8184:1: ( ( 'Right' ) )
            // InternalFPML.g:8185:1: ( 'Right' )
            {
            // InternalFPML.g:8185:1: ( 'Right' )
            // InternalFPML.g:8186:2: 'Right'
            {
             before(grammarAccess.getPureSumValueAccess().getRightKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getRightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__0__Impl"


    // $ANTLR start "rule__PureSumValue__Group_1__1"
    // InternalFPML.g:8195:1: rule__PureSumValue__Group_1__1 : rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2 ;
    public final void rule__PureSumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8199:1: ( rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2 )
            // InternalFPML.g:8200:2: rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2
            {
            pushFollow(FOLLOW_49);
            rule__PureSumValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__1"


    // $ANTLR start "rule__PureSumValue__Group_1__1__Impl"
    // InternalFPML.g:8207:1: rule__PureSumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__PureSumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8211:1: ( ( '(' ) )
            // InternalFPML.g:8212:1: ( '(' )
            {
            // InternalFPML.g:8212:1: ( '(' )
            // InternalFPML.g:8213:2: '('
            {
             before(grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__1__Impl"


    // $ANTLR start "rule__PureSumValue__Group_1__2"
    // InternalFPML.g:8222:1: rule__PureSumValue__Group_1__2 : rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3 ;
    public final void rule__PureSumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8226:1: ( rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3 )
            // InternalFPML.g:8227:2: rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3
            {
            pushFollow(FOLLOW_44);
            rule__PureSumValue__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__2"


    // $ANTLR start "rule__PureSumValue__Group_1__2__Impl"
    // InternalFPML.g:8234:1: rule__PureSumValue__Group_1__2__Impl : ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__PureSumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8238:1: ( ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:8239:1: ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:8239:1: ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:8240:2: ( rule__PureSumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:8241:2: ( rule__PureSumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:8241:3: rule__PureSumValue__SumAdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PureSumValue__SumAdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPureSumValueAccess().getSumAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__2__Impl"


    // $ANTLR start "rule__PureSumValue__Group_1__3"
    // InternalFPML.g:8249:1: rule__PureSumValue__Group_1__3 : rule__PureSumValue__Group_1__3__Impl ;
    public final void rule__PureSumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8253:1: ( rule__PureSumValue__Group_1__3__Impl )
            // InternalFPML.g:8254:2: rule__PureSumValue__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureSumValue__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__3"


    // $ANTLR start "rule__PureSumValue__Group_1__3__Impl"
    // InternalFPML.g:8260:1: rule__PureSumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__PureSumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8264:1: ( ( ')' ) )
            // InternalFPML.g:8265:1: ( ')' )
            {
            // InternalFPML.g:8265:1: ( ')' )
            // InternalFPML.g:8266:2: ')'
            {
             before(grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__Group_1__3__Impl"


    // $ANTLR start "rule__EffectFullAdtValue__Group_0__0"
    // InternalFPML.g:8276:1: rule__EffectFullAdtValue__Group_0__0 : rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1 ;
    public final void rule__EffectFullAdtValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8280:1: ( rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1 )
            // InternalFPML.g:8281:2: rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1
            {
            pushFollow(FOLLOW_49);
            rule__EffectFullAdtValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullAdtValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtValue__Group_0__0"


    // $ANTLR start "rule__EffectFullAdtValue__Group_0__0__Impl"
    // InternalFPML.g:8288:1: rule__EffectFullAdtValue__Group_0__0__Impl : ( 'IO' ) ;
    public final void rule__EffectFullAdtValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8292:1: ( ( 'IO' ) )
            // InternalFPML.g:8293:1: ( 'IO' )
            {
            // InternalFPML.g:8293:1: ( 'IO' )
            // InternalFPML.g:8294:2: 'IO'
            {
             before(grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtValue__Group_0__0__Impl"


    // $ANTLR start "rule__EffectFullAdtValue__Group_0__1"
    // InternalFPML.g:8303:1: rule__EffectFullAdtValue__Group_0__1 : rule__EffectFullAdtValue__Group_0__1__Impl ;
    public final void rule__EffectFullAdtValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8307:1: ( rule__EffectFullAdtValue__Group_0__1__Impl )
            // InternalFPML.g:8308:2: rule__EffectFullAdtValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtValue__Group_0__1"


    // $ANTLR start "rule__EffectFullAdtValue__Group_0__1__Impl"
    // InternalFPML.g:8314:1: rule__EffectFullAdtValue__Group_0__1__Impl : ( rulePureAdtValue ) ;
    public final void rule__EffectFullAdtValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8318:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:8319:1: ( rulePureAdtValue )
            {
            // InternalFPML.g:8319:1: ( rulePureAdtValue )
            // InternalFPML.g:8320:2: rulePureAdtValue
            {
             before(grammarAccess.getEffectFullAdtValueAccess().getPureAdtValueParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullAdtValueAccess().getPureAdtValueParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtValue__Group_0__1__Impl"


    // $ANTLR start "rule__EffectFullProdValue__Group__0"
    // InternalFPML.g:8330:1: rule__EffectFullProdValue__Group__0 : rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1 ;
    public final void rule__EffectFullProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8334:1: ( rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1 )
            // InternalFPML.g:8335:2: rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__EffectFullProdValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__0"


    // $ANTLR start "rule__EffectFullProdValue__Group__0__Impl"
    // InternalFPML.g:8342:1: rule__EffectFullProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__EffectFullProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8346:1: ( ( '(' ) )
            // InternalFPML.g:8347:1: ( '(' )
            {
            // InternalFPML.g:8347:1: ( '(' )
            // InternalFPML.g:8348:2: '('
            {
             before(grammarAccess.getEffectFullProdValueAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullProdValueAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__0__Impl"


    // $ANTLR start "rule__EffectFullProdValue__Group__1"
    // InternalFPML.g:8357:1: rule__EffectFullProdValue__Group__1 : rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2 ;
    public final void rule__EffectFullProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8361:1: ( rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2 )
            // InternalFPML.g:8362:2: rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__EffectFullProdValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__1"


    // $ANTLR start "rule__EffectFullProdValue__Group__1__Impl"
    // InternalFPML.g:8369:1: rule__EffectFullProdValue__Group__1__Impl : ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__EffectFullProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8373:1: ( ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:8374:1: ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:8374:1: ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:8375:2: ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:8376:2: ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:8376:3: rule__EffectFullProdValue__ProdAdtElement1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__ProdAdtElement1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__1__Impl"


    // $ANTLR start "rule__EffectFullProdValue__Group__2"
    // InternalFPML.g:8384:1: rule__EffectFullProdValue__Group__2 : rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3 ;
    public final void rule__EffectFullProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8388:1: ( rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3 )
            // InternalFPML.g:8389:2: rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__EffectFullProdValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__2"


    // $ANTLR start "rule__EffectFullProdValue__Group__2__Impl"
    // InternalFPML.g:8396:1: rule__EffectFullProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__EffectFullProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8400:1: ( ( ',' ) )
            // InternalFPML.g:8401:1: ( ',' )
            {
            // InternalFPML.g:8401:1: ( ',' )
            // InternalFPML.g:8402:2: ','
            {
             before(grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__2__Impl"


    // $ANTLR start "rule__EffectFullProdValue__Group__3"
    // InternalFPML.g:8411:1: rule__EffectFullProdValue__Group__3 : rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4 ;
    public final void rule__EffectFullProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8415:1: ( rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4 )
            // InternalFPML.g:8416:2: rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EffectFullProdValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__3"


    // $ANTLR start "rule__EffectFullProdValue__Group__3__Impl"
    // InternalFPML.g:8423:1: rule__EffectFullProdValue__Group__3__Impl : ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__EffectFullProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8427:1: ( ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:8428:1: ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:8428:1: ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:8429:2: ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:8430:2: ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:8430:3: rule__EffectFullProdValue__ProdAdtElement2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__ProdAdtElement2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__3__Impl"


    // $ANTLR start "rule__EffectFullProdValue__Group__4"
    // InternalFPML.g:8438:1: rule__EffectFullProdValue__Group__4 : rule__EffectFullProdValue__Group__4__Impl ;
    public final void rule__EffectFullProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8442:1: ( rule__EffectFullProdValue__Group__4__Impl )
            // InternalFPML.g:8443:2: rule__EffectFullProdValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullProdValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__4"


    // $ANTLR start "rule__EffectFullProdValue__Group__4__Impl"
    // InternalFPML.g:8449:1: rule__EffectFullProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectFullProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8453:1: ( ( ')' ) )
            // InternalFPML.g:8454:1: ( ')' )
            {
            // InternalFPML.g:8454:1: ( ')' )
            // InternalFPML.g:8455:2: ')'
            {
             before(grammarAccess.getEffectFullProdValueAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullProdValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__Group__4__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__0"
    // InternalFPML.g:8465:1: rule__EffectFullSumValue__Group_0__0 : rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1 ;
    public final void rule__EffectFullSumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8469:1: ( rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1 )
            // InternalFPML.g:8470:2: rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__EffectFullSumValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__0"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__0__Impl"
    // InternalFPML.g:8477:1: rule__EffectFullSumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__EffectFullSumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8481:1: ( ( 'Left' ) )
            // InternalFPML.g:8482:1: ( 'Left' )
            {
            // InternalFPML.g:8482:1: ( 'Left' )
            // InternalFPML.g:8483:2: 'Left'
            {
             before(grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__0__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__1"
    // InternalFPML.g:8492:1: rule__EffectFullSumValue__Group_0__1 : rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2 ;
    public final void rule__EffectFullSumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8496:1: ( rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2 )
            // InternalFPML.g:8497:2: rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2
            {
            pushFollow(FOLLOW_50);
            rule__EffectFullSumValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__1"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__1__Impl"
    // InternalFPML.g:8504:1: rule__EffectFullSumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__EffectFullSumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8508:1: ( ( '(' ) )
            // InternalFPML.g:8509:1: ( '(' )
            {
            // InternalFPML.g:8509:1: ( '(' )
            // InternalFPML.g:8510:2: '('
            {
             before(grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__1__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__2"
    // InternalFPML.g:8519:1: rule__EffectFullSumValue__Group_0__2 : rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3 ;
    public final void rule__EffectFullSumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8523:1: ( rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3 )
            // InternalFPML.g:8524:2: rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3
            {
            pushFollow(FOLLOW_44);
            rule__EffectFullSumValue__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__2"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__2__Impl"
    // InternalFPML.g:8531:1: rule__EffectFullSumValue__Group_0__2__Impl : ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__EffectFullSumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8535:1: ( ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:8536:1: ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:8536:1: ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:8537:2: ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:8538:2: ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:8538:3: rule__EffectFullSumValue__SumAdtElement1Assignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__SumAdtElement1Assignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1Assignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__2__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__3"
    // InternalFPML.g:8546:1: rule__EffectFullSumValue__Group_0__3 : rule__EffectFullSumValue__Group_0__3__Impl ;
    public final void rule__EffectFullSumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8550:1: ( rule__EffectFullSumValue__Group_0__3__Impl )
            // InternalFPML.g:8551:2: rule__EffectFullSumValue__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__3"


    // $ANTLR start "rule__EffectFullSumValue__Group_0__3__Impl"
    // InternalFPML.g:8557:1: rule__EffectFullSumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__EffectFullSumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8561:1: ( ( ')' ) )
            // InternalFPML.g:8562:1: ( ')' )
            {
            // InternalFPML.g:8562:1: ( ')' )
            // InternalFPML.g:8563:2: ')'
            {
             before(grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_0_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_0__3__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__0"
    // InternalFPML.g:8573:1: rule__EffectFullSumValue__Group_1__0 : rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1 ;
    public final void rule__EffectFullSumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8577:1: ( rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1 )
            // InternalFPML.g:8578:2: rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__EffectFullSumValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__0"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__0__Impl"
    // InternalFPML.g:8585:1: rule__EffectFullSumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__EffectFullSumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8589:1: ( ( 'Right' ) )
            // InternalFPML.g:8590:1: ( 'Right' )
            {
            // InternalFPML.g:8590:1: ( 'Right' )
            // InternalFPML.g:8591:2: 'Right'
            {
             before(grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__0__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__1"
    // InternalFPML.g:8600:1: rule__EffectFullSumValue__Group_1__1 : rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2 ;
    public final void rule__EffectFullSumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8604:1: ( rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2 )
            // InternalFPML.g:8605:2: rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__EffectFullSumValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__1"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__1__Impl"
    // InternalFPML.g:8612:1: rule__EffectFullSumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EffectFullSumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8616:1: ( ( '(' ) )
            // InternalFPML.g:8617:1: ( '(' )
            {
            // InternalFPML.g:8617:1: ( '(' )
            // InternalFPML.g:8618:2: '('
            {
             before(grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__1__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__2"
    // InternalFPML.g:8627:1: rule__EffectFullSumValue__Group_1__2 : rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3 ;
    public final void rule__EffectFullSumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8631:1: ( rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3 )
            // InternalFPML.g:8632:2: rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3
            {
            pushFollow(FOLLOW_44);
            rule__EffectFullSumValue__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__2"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__2__Impl"
    // InternalFPML.g:8639:1: rule__EffectFullSumValue__Group_1__2__Impl : ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__EffectFullSumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8643:1: ( ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:8644:1: ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:8644:1: ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:8645:2: ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:8646:2: ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:8646:3: rule__EffectFullSumValue__SumAdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__SumAdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__2__Impl"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__3"
    // InternalFPML.g:8654:1: rule__EffectFullSumValue__Group_1__3 : rule__EffectFullSumValue__Group_1__3__Impl ;
    public final void rule__EffectFullSumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8658:1: ( rule__EffectFullSumValue__Group_1__3__Impl )
            // InternalFPML.g:8659:2: rule__EffectFullSumValue__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullSumValue__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__3"


    // $ANTLR start "rule__EffectFullSumValue__Group_1__3__Impl"
    // InternalFPML.g:8665:1: rule__EffectFullSumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EffectFullSumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8669:1: ( ( ')' ) )
            // InternalFPML.g:8670:1: ( ')' )
            {
            // InternalFPML.g:8670:1: ( ')' )
            // InternalFPML.g:8671:2: ')'
            {
             before(grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__Group_1__3__Impl"


    // $ANTLR start "rule__IntToString__Group__0"
    // InternalFPML.g:8681:1: rule__IntToString__Group__0 : rule__IntToString__Group__0__Impl rule__IntToString__Group__1 ;
    public final void rule__IntToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8685:1: ( rule__IntToString__Group__0__Impl rule__IntToString__Group__1 )
            // InternalFPML.g:8686:2: rule__IntToString__Group__0__Impl rule__IntToString__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalFPML.g:8693:1: rule__IntToString__Group__0__Impl : ( () ) ;
    public final void rule__IntToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8697:1: ( ( () ) )
            // InternalFPML.g:8698:1: ( () )
            {
            // InternalFPML.g:8698:1: ( () )
            // InternalFPML.g:8699:2: ()
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 
            // InternalFPML.g:8700:2: ()
            // InternalFPML.g:8700:3: 
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
    // InternalFPML.g:8708:1: rule__IntToString__Group__1 : rule__IntToString__Group__1__Impl ;
    public final void rule__IntToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8712:1: ( rule__IntToString__Group__1__Impl )
            // InternalFPML.g:8713:2: rule__IntToString__Group__1__Impl
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
    // InternalFPML.g:8719:1: rule__IntToString__Group__1__Impl : ( 'IntToString' ) ;
    public final void rule__IntToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8723:1: ( ( 'IntToString' ) )
            // InternalFPML.g:8724:1: ( 'IntToString' )
            {
            // InternalFPML.g:8724:1: ( 'IntToString' )
            // InternalFPML.g:8725:2: 'IntToString'
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
    // InternalFPML.g:8735:1: rule__IntPow__Group__0 : rule__IntPow__Group__0__Impl rule__IntPow__Group__1 ;
    public final void rule__IntPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8739:1: ( rule__IntPow__Group__0__Impl rule__IntPow__Group__1 )
            // InternalFPML.g:8740:2: rule__IntPow__Group__0__Impl rule__IntPow__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalFPML.g:8747:1: rule__IntPow__Group__0__Impl : ( () ) ;
    public final void rule__IntPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8751:1: ( ( () ) )
            // InternalFPML.g:8752:1: ( () )
            {
            // InternalFPML.g:8752:1: ( () )
            // InternalFPML.g:8753:2: ()
            {
             before(grammarAccess.getIntPowAccess().getIntPowAction_0()); 
            // InternalFPML.g:8754:2: ()
            // InternalFPML.g:8754:3: 
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
    // InternalFPML.g:8762:1: rule__IntPow__Group__1 : rule__IntPow__Group__1__Impl ;
    public final void rule__IntPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8766:1: ( rule__IntPow__Group__1__Impl )
            // InternalFPML.g:8767:2: rule__IntPow__Group__1__Impl
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
    // InternalFPML.g:8773:1: rule__IntPow__Group__1__Impl : ( 'IntPow' ) ;
    public final void rule__IntPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8777:1: ( ( 'IntPow' ) )
            // InternalFPML.g:8778:1: ( 'IntPow' )
            {
            // InternalFPML.g:8778:1: ( 'IntPow' )
            // InternalFPML.g:8779:2: 'IntPow'
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
    // InternalFPML.g:8789:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8793:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalFPML.g:8794:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalFPML.g:8801:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8805:1: ( ( () ) )
            // InternalFPML.g:8806:1: ( () )
            {
            // InternalFPML.g:8806:1: ( () )
            // InternalFPML.g:8807:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // InternalFPML.g:8808:2: ()
            // InternalFPML.g:8808:3: 
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
    // InternalFPML.g:8816:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8820:1: ( rule__Plus__Group__1__Impl )
            // InternalFPML.g:8821:2: rule__Plus__Group__1__Impl
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
    // InternalFPML.g:8827:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8831:1: ( ( '+' ) )
            // InternalFPML.g:8832:1: ( '+' )
            {
            // InternalFPML.g:8832:1: ( '+' )
            // InternalFPML.g:8833:2: '+'
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
    // InternalFPML.g:8843:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8847:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalFPML.g:8848:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalFPML.g:8855:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8859:1: ( ( () ) )
            // InternalFPML.g:8860:1: ( () )
            {
            // InternalFPML.g:8860:1: ( () )
            // InternalFPML.g:8861:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // InternalFPML.g:8862:2: ()
            // InternalFPML.g:8862:3: 
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
    // InternalFPML.g:8870:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8874:1: ( rule__Minus__Group__1__Impl )
            // InternalFPML.g:8875:2: rule__Minus__Group__1__Impl
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
    // InternalFPML.g:8881:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8885:1: ( ( '-' ) )
            // InternalFPML.g:8886:1: ( '-' )
            {
            // InternalFPML.g:8886:1: ( '-' )
            // InternalFPML.g:8887:2: '-'
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
    // InternalFPML.g:8897:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8901:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalFPML.g:8902:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalFPML.g:8909:1: rule__Times__Group__0__Impl : ( () ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8913:1: ( ( () ) )
            // InternalFPML.g:8914:1: ( () )
            {
            // InternalFPML.g:8914:1: ( () )
            // InternalFPML.g:8915:2: ()
            {
             before(grammarAccess.getTimesAccess().getTimesAction_0()); 
            // InternalFPML.g:8916:2: ()
            // InternalFPML.g:8916:3: 
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
    // InternalFPML.g:8924:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8928:1: ( rule__Times__Group__1__Impl )
            // InternalFPML.g:8929:2: rule__Times__Group__1__Impl
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
    // InternalFPML.g:8935:1: rule__Times__Group__1__Impl : ( '*' ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8939:1: ( ( '*' ) )
            // InternalFPML.g:8940:1: ( '*' )
            {
            // InternalFPML.g:8940:1: ( '*' )
            // InternalFPML.g:8941:2: '*'
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
    // InternalFPML.g:8951:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8955:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // InternalFPML.g:8956:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalFPML.g:8963:1: rule__Mod__Group__0__Impl : ( () ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8967:1: ( ( () ) )
            // InternalFPML.g:8968:1: ( () )
            {
            // InternalFPML.g:8968:1: ( () )
            // InternalFPML.g:8969:2: ()
            {
             before(grammarAccess.getModAccess().getModAction_0()); 
            // InternalFPML.g:8970:2: ()
            // InternalFPML.g:8970:3: 
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
    // InternalFPML.g:8978:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8982:1: ( rule__Mod__Group__1__Impl )
            // InternalFPML.g:8983:2: rule__Mod__Group__1__Impl
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
    // InternalFPML.g:8989:1: rule__Mod__Group__1__Impl : ( 'mod' ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8993:1: ( ( 'mod' ) )
            // InternalFPML.g:8994:1: ( 'mod' )
            {
            // InternalFPML.g:8994:1: ( 'mod' )
            // InternalFPML.g:8995:2: 'mod'
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
    // InternalFPML.g:9005:1: rule__ApplyF__Group__0 : rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 ;
    public final void rule__ApplyF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9009:1: ( rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 )
            // InternalFPML.g:9010:2: rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:9017:1: rule__ApplyF__Group__0__Impl : ( () ) ;
    public final void rule__ApplyF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9021:1: ( ( () ) )
            // InternalFPML.g:9022:1: ( () )
            {
            // InternalFPML.g:9022:1: ( () )
            // InternalFPML.g:9023:2: ()
            {
             before(grammarAccess.getApplyFAccess().getApplyFAction_0()); 
            // InternalFPML.g:9024:2: ()
            // InternalFPML.g:9024:3: 
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
    // InternalFPML.g:9032:1: rule__ApplyF__Group__1 : rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 ;
    public final void rule__ApplyF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9036:1: ( rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 )
            // InternalFPML.g:9037:2: rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:9044:1: rule__ApplyF__Group__1__Impl : ( 'applyF' ) ;
    public final void rule__ApplyF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9048:1: ( ( 'applyF' ) )
            // InternalFPML.g:9049:1: ( 'applyF' )
            {
            // InternalFPML.g:9049:1: ( 'applyF' )
            // InternalFPML.g:9050:2: 'applyF'
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
    // InternalFPML.g:9059:1: rule__ApplyF__Group__2 : rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 ;
    public final void rule__ApplyF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9063:1: ( rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 )
            // InternalFPML.g:9064:2: rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3
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
    // InternalFPML.g:9071:1: rule__ApplyF__Group__2__Impl : ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9075:1: ( ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:9076:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:9076:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:9077:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:9078:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            // InternalFPML.g:9078:3: rule__ApplyF__FunctionTypeAssignment_2
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
    // InternalFPML.g:9086:1: rule__ApplyF__Group__3 : rule__ApplyF__Group__3__Impl ;
    public final void rule__ApplyF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9090:1: ( rule__ApplyF__Group__3__Impl )
            // InternalFPML.g:9091:2: rule__ApplyF__Group__3__Impl
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
    // InternalFPML.g:9097:1: rule__ApplyF__Group__3__Impl : ( ( rule__ApplyF__ValueAssignment_3 ) ) ;
    public final void rule__ApplyF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9101:1: ( ( ( rule__ApplyF__ValueAssignment_3 ) ) )
            // InternalFPML.g:9102:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            {
            // InternalFPML.g:9102:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            // InternalFPML.g:9103:2: ( rule__ApplyF__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFAccess().getValueAssignment_3()); 
            // InternalFPML.g:9104:2: ( rule__ApplyF__ValueAssignment_3 )
            // InternalFPML.g:9104:3: rule__ApplyF__ValueAssignment_3
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
    // InternalFPML.g:9113:1: rule__PrimitivePrint__Group__0 : rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 ;
    public final void rule__PrimitivePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9117:1: ( rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 )
            // InternalFPML.g:9118:2: rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalFPML.g:9125:1: rule__PrimitivePrint__Group__0__Impl : ( () ) ;
    public final void rule__PrimitivePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9129:1: ( ( () ) )
            // InternalFPML.g:9130:1: ( () )
            {
            // InternalFPML.g:9130:1: ( () )
            // InternalFPML.g:9131:2: ()
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 
            // InternalFPML.g:9132:2: ()
            // InternalFPML.g:9132:3: 
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
    // InternalFPML.g:9140:1: rule__PrimitivePrint__Group__1 : rule__PrimitivePrint__Group__1__Impl ;
    public final void rule__PrimitivePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9144:1: ( rule__PrimitivePrint__Group__1__Impl )
            // InternalFPML.g:9145:2: rule__PrimitivePrint__Group__1__Impl
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
    // InternalFPML.g:9151:1: rule__PrimitivePrint__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrimitivePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9155:1: ( ( 'print' ) )
            // InternalFPML.g:9156:1: ( 'print' )
            {
            // InternalFPML.g:9156:1: ( 'print' )
            // InternalFPML.g:9157:2: 'print'
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


    // $ANTLR start "rule__PrimitiveRandom__Group__0"
    // InternalFPML.g:9167:1: rule__PrimitiveRandom__Group__0 : rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1 ;
    public final void rule__PrimitiveRandom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9171:1: ( rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1 )
            // InternalFPML.g:9172:2: rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__PrimitiveRandom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveRandom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveRandom__Group__0"


    // $ANTLR start "rule__PrimitiveRandom__Group__0__Impl"
    // InternalFPML.g:9179:1: rule__PrimitiveRandom__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveRandom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9183:1: ( ( () ) )
            // InternalFPML.g:9184:1: ( () )
            {
            // InternalFPML.g:9184:1: ( () )
            // InternalFPML.g:9185:2: ()
            {
             before(grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0()); 
            // InternalFPML.g:9186:2: ()
            // InternalFPML.g:9186:3: 
            {
            }

             after(grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveRandom__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveRandom__Group__1"
    // InternalFPML.g:9194:1: rule__PrimitiveRandom__Group__1 : rule__PrimitiveRandom__Group__1__Impl ;
    public final void rule__PrimitiveRandom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9198:1: ( rule__PrimitiveRandom__Group__1__Impl )
            // InternalFPML.g:9199:2: rule__PrimitiveRandom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveRandom__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveRandom__Group__1"


    // $ANTLR start "rule__PrimitiveRandom__Group__1__Impl"
    // InternalFPML.g:9205:1: rule__PrimitiveRandom__Group__1__Impl : ( 'randomInt' ) ;
    public final void rule__PrimitiveRandom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9209:1: ( ( 'randomInt' ) )
            // InternalFPML.g:9210:1: ( 'randomInt' )
            {
            // InternalFPML.g:9210:1: ( 'randomInt' )
            // InternalFPML.g:9211:2: 'randomInt'
            {
             before(grammarAccess.getPrimitiveRandomAccess().getRandomIntKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrimitiveRandomAccess().getRandomIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveRandom__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveReturn__Group__0"
    // InternalFPML.g:9221:1: rule__PrimitiveReturn__Group__0 : rule__PrimitiveReturn__Group__0__Impl rule__PrimitiveReturn__Group__1 ;
    public final void rule__PrimitiveReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9225:1: ( rule__PrimitiveReturn__Group__0__Impl rule__PrimitiveReturn__Group__1 )
            // InternalFPML.g:9226:2: rule__PrimitiveReturn__Group__0__Impl rule__PrimitiveReturn__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__PrimitiveReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__0"


    // $ANTLR start "rule__PrimitiveReturn__Group__0__Impl"
    // InternalFPML.g:9233:1: rule__PrimitiveReturn__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9237:1: ( ( () ) )
            // InternalFPML.g:9238:1: ( () )
            {
            // InternalFPML.g:9238:1: ( () )
            // InternalFPML.g:9239:2: ()
            {
             before(grammarAccess.getPrimitiveReturnAccess().getPrimitiveReturnAction_0()); 
            // InternalFPML.g:9240:2: ()
            // InternalFPML.g:9240:3: 
            {
            }

             after(grammarAccess.getPrimitiveReturnAccess().getPrimitiveReturnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveReturn__Group__1"
    // InternalFPML.g:9248:1: rule__PrimitiveReturn__Group__1 : rule__PrimitiveReturn__Group__1__Impl rule__PrimitiveReturn__Group__2 ;
    public final void rule__PrimitiveReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9252:1: ( rule__PrimitiveReturn__Group__1__Impl rule__PrimitiveReturn__Group__2 )
            // InternalFPML.g:9253:2: rule__PrimitiveReturn__Group__1__Impl rule__PrimitiveReturn__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PrimitiveReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__1"


    // $ANTLR start "rule__PrimitiveReturn__Group__1__Impl"
    // InternalFPML.g:9260:1: rule__PrimitiveReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PrimitiveReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9264:1: ( ( 'return' ) )
            // InternalFPML.g:9265:1: ( 'return' )
            {
            // InternalFPML.g:9265:1: ( 'return' )
            // InternalFPML.g:9266:2: 'return'
            {
             before(grammarAccess.getPrimitiveReturnAccess().getReturnKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPrimitiveReturnAccess().getReturnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveReturn__Group__2"
    // InternalFPML.g:9275:1: rule__PrimitiveReturn__Group__2 : rule__PrimitiveReturn__Group__2__Impl ;
    public final void rule__PrimitiveReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9279:1: ( rule__PrimitiveReturn__Group__2__Impl )
            // InternalFPML.g:9280:2: rule__PrimitiveReturn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveReturn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__2"


    // $ANTLR start "rule__PrimitiveReturn__Group__2__Impl"
    // InternalFPML.g:9286:1: rule__PrimitiveReturn__Group__2__Impl : ( ( rule__PrimitiveReturn__TypeAssignment_2 ) ) ;
    public final void rule__PrimitiveReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9290:1: ( ( ( rule__PrimitiveReturn__TypeAssignment_2 ) ) )
            // InternalFPML.g:9291:1: ( ( rule__PrimitiveReturn__TypeAssignment_2 ) )
            {
            // InternalFPML.g:9291:1: ( ( rule__PrimitiveReturn__TypeAssignment_2 ) )
            // InternalFPML.g:9292:2: ( rule__PrimitiveReturn__TypeAssignment_2 )
            {
             before(grammarAccess.getPrimitiveReturnAccess().getTypeAssignment_2()); 
            // InternalFPML.g:9293:2: ( rule__PrimitiveReturn__TypeAssignment_2 )
            // InternalFPML.g:9293:3: rule__PrimitiveReturn__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveReturn__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveReturnAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveTime__Group__0"
    // InternalFPML.g:9302:1: rule__PrimitiveTime__Group__0 : rule__PrimitiveTime__Group__0__Impl rule__PrimitiveTime__Group__1 ;
    public final void rule__PrimitiveTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9306:1: ( rule__PrimitiveTime__Group__0__Impl rule__PrimitiveTime__Group__1 )
            // InternalFPML.g:9307:2: rule__PrimitiveTime__Group__0__Impl rule__PrimitiveTime__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PrimitiveTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTime__Group__0"


    // $ANTLR start "rule__PrimitiveTime__Group__0__Impl"
    // InternalFPML.g:9314:1: rule__PrimitiveTime__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9318:1: ( ( () ) )
            // InternalFPML.g:9319:1: ( () )
            {
            // InternalFPML.g:9319:1: ( () )
            // InternalFPML.g:9320:2: ()
            {
             before(grammarAccess.getPrimitiveTimeAccess().getPrimitiveTimeAction_0()); 
            // InternalFPML.g:9321:2: ()
            // InternalFPML.g:9321:3: 
            {
            }

             after(grammarAccess.getPrimitiveTimeAccess().getPrimitiveTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTime__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveTime__Group__1"
    // InternalFPML.g:9329:1: rule__PrimitiveTime__Group__1 : rule__PrimitiveTime__Group__1__Impl ;
    public final void rule__PrimitiveTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9333:1: ( rule__PrimitiveTime__Group__1__Impl )
            // InternalFPML.g:9334:2: rule__PrimitiveTime__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTime__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTime__Group__1"


    // $ANTLR start "rule__PrimitiveTime__Group__1__Impl"
    // InternalFPML.g:9340:1: rule__PrimitiveTime__Group__1__Impl : ( 'currentTime' ) ;
    public final void rule__PrimitiveTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9344:1: ( ( 'currentTime' ) )
            // InternalFPML.g:9345:1: ( 'currentTime' )
            {
            // InternalFPML.g:9345:1: ( 'currentTime' )
            // InternalFPML.g:9346:2: 'currentTime'
            {
             before(grammarAccess.getPrimitiveTimeAccess().getCurrentTimeKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTimeAccess().getCurrentTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTime__Group__1__Impl"


    // $ANTLR start "rule__ApplyFIO__Group__0"
    // InternalFPML.g:9356:1: rule__ApplyFIO__Group__0 : rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 ;
    public final void rule__ApplyFIO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9360:1: ( rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 )
            // InternalFPML.g:9361:2: rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalFPML.g:9368:1: rule__ApplyFIO__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFIO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9372:1: ( ( () ) )
            // InternalFPML.g:9373:1: ( () )
            {
            // InternalFPML.g:9373:1: ( () )
            // InternalFPML.g:9374:2: ()
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOAction_0()); 
            // InternalFPML.g:9375:2: ()
            // InternalFPML.g:9375:3: 
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
    // InternalFPML.g:9383:1: rule__ApplyFIO__Group__1 : rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 ;
    public final void rule__ApplyFIO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9387:1: ( rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 )
            // InternalFPML.g:9388:2: rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:9395:1: rule__ApplyFIO__Group__1__Impl : ( 'applyFIO' ) ;
    public final void rule__ApplyFIO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9399:1: ( ( 'applyFIO' ) )
            // InternalFPML.g:9400:1: ( 'applyFIO' )
            {
            // InternalFPML.g:9400:1: ( 'applyFIO' )
            // InternalFPML.g:9401:2: 'applyFIO'
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalFPML.g:9410:1: rule__ApplyFIO__Group__2 : rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 ;
    public final void rule__ApplyFIO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9414:1: ( rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 )
            // InternalFPML.g:9415:2: rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:9422:1: rule__ApplyFIO__Group__2__Impl : ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyFIO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9426:1: ( ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:9427:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:9427:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:9428:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFIOAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:9429:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            // InternalFPML.g:9429:3: rule__ApplyFIO__FunctionTypeAssignment_2
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
    // InternalFPML.g:9437:1: rule__ApplyFIO__Group__3 : rule__ApplyFIO__Group__3__Impl ;
    public final void rule__ApplyFIO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9441:1: ( rule__ApplyFIO__Group__3__Impl )
            // InternalFPML.g:9442:2: rule__ApplyFIO__Group__3__Impl
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
    // InternalFPML.g:9448:1: rule__ApplyFIO__Group__3__Impl : ( ( rule__ApplyFIO__ValueAssignment_3 ) ) ;
    public final void rule__ApplyFIO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9452:1: ( ( ( rule__ApplyFIO__ValueAssignment_3 ) ) )
            // InternalFPML.g:9453:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            {
            // InternalFPML.g:9453:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            // InternalFPML.g:9454:2: ( rule__ApplyFIO__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFIOAccess().getValueAssignment_3()); 
            // InternalFPML.g:9455:2: ( rule__ApplyFIO__ValueAssignment_3 )
            // InternalFPML.g:9455:3: rule__ApplyFIO__ValueAssignment_3
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
    // InternalFPML.g:9464:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9468:1: ( ( rulePureBlock ) )
            // InternalFPML.g:9469:2: ( rulePureBlock )
            {
            // InternalFPML.g:9469:2: ( rulePureBlock )
            // InternalFPML.g:9470:3: rulePureBlock
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
    // InternalFPML.g:9479:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9483:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:9484:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:9484:2: ( ruleEffectFullBlock )
            // InternalFPML.g:9485:3: ruleEffectFullBlock
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
    // InternalFPML.g:9494:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9498:1: ( ( rulePureDataBlock ) )
            // InternalFPML.g:9499:2: ( rulePureDataBlock )
            {
            // InternalFPML.g:9499:2: ( rulePureDataBlock )
            // InternalFPML.g:9500:3: rulePureDataBlock
            {
             before(grammarAccess.getPureBlockAccess().getElementsPureDataBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureDataBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockAccess().getElementsPureDataBlockParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalFPML.g:9509:1: rule__PureBlock__ElementsAssignment_3 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9513:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:9514:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:9514:2: ( rulePureFunctionBlock )
            // InternalFPML.g:9515:3: rulePureFunctionBlock
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
    // InternalFPML.g:9524:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunctionDefinition ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9528:1: ( ( rulePureFunctionDefinition ) )
            // InternalFPML.g:9529:2: ( rulePureFunctionDefinition )
            {
            // InternalFPML.g:9529:2: ( rulePureFunctionDefinition )
            // InternalFPML.g:9530:3: rulePureFunctionDefinition
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


    // $ANTLR start "rule__PureDataBlock__ElementsAssignment_2"
    // InternalFPML.g:9539:1: rule__PureDataBlock__ElementsAssignment_2 : ( rulePureData ) ;
    public final void rule__PureDataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9543:1: ( ( rulePureData ) )
            // InternalFPML.g:9544:2: ( rulePureData )
            {
            // InternalFPML.g:9544:2: ( rulePureData )
            // InternalFPML.g:9545:3: rulePureData
            {
             before(grammarAccess.getPureDataBlockAccess().getElementsPureDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureData();

            state._fsp--;

             after(grammarAccess.getPureDataBlockAccess().getElementsPureDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__ElementsAssignment_2"


    // $ANTLR start "rule__PureDataBlock__ValueAssignment_3"
    // InternalFPML.g:9554:1: rule__PureDataBlock__ValueAssignment_3 : ( rulePureValueBlock ) ;
    public final void rule__PureDataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9558:1: ( ( rulePureValueBlock ) )
            // InternalFPML.g:9559:2: ( rulePureValueBlock )
            {
            // InternalFPML.g:9559:2: ( rulePureValueBlock )
            // InternalFPML.g:9560:3: rulePureValueBlock
            {
             before(grammarAccess.getPureDataBlockAccess().getValuePureValueBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureValueBlock();

            state._fsp--;

             after(grammarAccess.getPureDataBlockAccess().getValuePureValueBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureDataBlock__ValueAssignment_3"


    // $ANTLR start "rule__PureValueBlock__ElementsAssignment_2"
    // InternalFPML.g:9569:1: rule__PureValueBlock__ElementsAssignment_2 : ( rulePureValue ) ;
    public final void rule__PureValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9573:1: ( ( rulePureValue ) )
            // InternalFPML.g:9574:2: ( rulePureValue )
            {
            // InternalFPML.g:9574:2: ( rulePureValue )
            // InternalFPML.g:9575:3: rulePureValue
            {
             before(grammarAccess.getPureValueBlockAccess().getElementsPureValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureValue();

            state._fsp--;

             after(grammarAccess.getPureValueBlockAccess().getElementsPureValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueBlock__ElementsAssignment_2"


    // $ANTLR start "rule__EffectFullBlock__ElementsAssignment_2"
    // InternalFPML.g:9584:1: rule__EffectFullBlock__ElementsAssignment_2 : ( ruleEffectFullDataBlock ) ;
    public final void rule__EffectFullBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9588:1: ( ( ruleEffectFullDataBlock ) )
            // InternalFPML.g:9589:2: ( ruleEffectFullDataBlock )
            {
            // InternalFPML.g:9589:2: ( ruleEffectFullDataBlock )
            // InternalFPML.g:9590:3: ruleEffectFullDataBlock
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullDataBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullDataBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullDataBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__ElementsAssignment_2"


    // $ANTLR start "rule__EffectFullBlock__ElementsAssignment_3"
    // InternalFPML.g:9599:1: rule__EffectFullBlock__ElementsAssignment_3 : ( ruleEffectFullFunctionBlock ) ;
    public final void rule__EffectFullBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9603:1: ( ( ruleEffectFullFunctionBlock ) )
            // InternalFPML.g:9604:2: ( ruleEffectFullFunctionBlock )
            {
            // InternalFPML.g:9604:2: ( ruleEffectFullFunctionBlock )
            // InternalFPML.g:9605:3: ruleEffectFullFunctionBlock
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullFunctionBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullFunctionBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullFunctionBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__ElementsAssignment_3"


    // $ANTLR start "rule__EffectFullDataBlock__ElementsAssignment_2"
    // InternalFPML.g:9614:1: rule__EffectFullDataBlock__ElementsAssignment_2 : ( ruleEffectFullData ) ;
    public final void rule__EffectFullDataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9618:1: ( ( ruleEffectFullData ) )
            // InternalFPML.g:9619:2: ( ruleEffectFullData )
            {
            // InternalFPML.g:9619:2: ( ruleEffectFullData )
            // InternalFPML.g:9620:3: ruleEffectFullData
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getElementsEffectFullDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullData();

            state._fsp--;

             after(grammarAccess.getEffectFullDataBlockAccess().getElementsEffectFullDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__ElementsAssignment_2"


    // $ANTLR start "rule__EffectFullDataBlock__ValueAssignment_3"
    // InternalFPML.g:9629:1: rule__EffectFullDataBlock__ValueAssignment_3 : ( ruleEffectFullValueBlock ) ;
    public final void rule__EffectFullDataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9633:1: ( ( ruleEffectFullValueBlock ) )
            // InternalFPML.g:9634:2: ( ruleEffectFullValueBlock )
            {
            // InternalFPML.g:9634:2: ( ruleEffectFullValueBlock )
            // InternalFPML.g:9635:3: ruleEffectFullValueBlock
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getValueEffectFullValueBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullValueBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullDataBlockAccess().getValueEffectFullValueBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataBlock__ValueAssignment_3"


    // $ANTLR start "rule__EffectFullValueBlock__ElementsAssignment_2"
    // InternalFPML.g:9644:1: rule__EffectFullValueBlock__ElementsAssignment_2 : ( ruleEffectFullValue ) ;
    public final void rule__EffectFullValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9648:1: ( ( ruleEffectFullValue ) )
            // InternalFPML.g:9649:2: ( ruleEffectFullValue )
            {
            // InternalFPML.g:9649:2: ( ruleEffectFullValue )
            // InternalFPML.g:9650:3: ruleEffectFullValue
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getElementsEffectFullValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullValue();

            state._fsp--;

             after(grammarAccess.getEffectFullValueBlockAccess().getElementsEffectFullValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueBlock__ElementsAssignment_2"


    // $ANTLR start "rule__EffectFullFunctionBlock__FeaturesAssignment_2"
    // InternalFPML.g:9659:1: rule__EffectFullFunctionBlock__FeaturesAssignment_2 : ( ruleEffectFullFunctionDefinition ) ;
    public final void rule__EffectFullFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9663:1: ( ( ruleEffectFullFunctionDefinition ) )
            // InternalFPML.g:9664:2: ( ruleEffectFullFunctionDefinition )
            {
            // InternalFPML.g:9664:2: ( ruleEffectFullFunctionDefinition )
            // InternalFPML.g:9665:3: ruleEffectFullFunctionDefinition
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__FeaturesAssignment_2"


    // $ANTLR start "rule__EffectFullFunctionBlock__MainAssignment_3"
    // InternalFPML.g:9674:1: rule__EffectFullFunctionBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullFunctionBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9678:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:9679:2: ( ruleMainFunc )
            {
            // InternalFPML.g:9679:2: ( ruleMainFunc )
            // InternalFPML.g:9680:3: ruleMainFunc
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getMainMainFuncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMainFunc();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionBlockAccess().getMainMainFuncParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionBlock__MainAssignment_3"


    // $ANTLR start "rule__PureData__NameAssignment_0"
    // InternalFPML.g:9689:1: rule__PureData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PureData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9693:1: ( ( RULE_ID ) )
            // InternalFPML.g:9694:2: ( RULE_ID )
            {
            // InternalFPML.g:9694:2: ( RULE_ID )
            // InternalFPML.g:9695:3: RULE_ID
            {
             before(grammarAccess.getPureDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__NameAssignment_0"


    // $ANTLR start "rule__PureData__ContentAssignment_2"
    // InternalFPML.g:9704:1: rule__PureData__ContentAssignment_2 : ( rulePureAdtType ) ;
    public final void rule__PureData__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9708:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9709:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9709:2: ( rulePureAdtType )
            // InternalFPML.g:9710:3: rulePureAdtType
            {
             before(grammarAccess.getPureDataAccess().getContentPureAdtTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtType();

            state._fsp--;

             after(grammarAccess.getPureDataAccess().getContentPureAdtTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureData__ContentAssignment_2"


    // $ANTLR start "rule__PureValue__NameAssignment_1"
    // InternalFPML.g:9719:1: rule__PureValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PureValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9723:1: ( ( RULE_ID ) )
            // InternalFPML.g:9724:2: ( RULE_ID )
            {
            // InternalFPML.g:9724:2: ( RULE_ID )
            // InternalFPML.g:9725:3: RULE_ID
            {
             before(grammarAccess.getPureValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureValueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__NameAssignment_1"


    // $ANTLR start "rule__PureValue__ValueAssignment_3"
    // InternalFPML.g:9734:1: rule__PureValue__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__PureValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9738:1: ( ( ruleExpression ) )
            // InternalFPML.g:9739:2: ( ruleExpression )
            {
            // InternalFPML.g:9739:2: ( ruleExpression )
            // InternalFPML.g:9740:3: ruleExpression
            {
             before(grammarAccess.getPureValueAccess().getValueExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPureValueAccess().getValueExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValue__ValueAssignment_3"


    // $ANTLR start "rule__PureAdtType__PureAdtElement1Assignment_1_1"
    // InternalFPML.g:9749:1: rule__PureAdtType__PureAdtElement1Assignment_1_1 : ( rulePureAdtType ) ;
    public final void rule__PureAdtType__PureAdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9753:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9754:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9754:2: ( rulePureAdtType )
            // InternalFPML.g:9755:3: rulePureAdtType
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1PureAdtTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtType();

            state._fsp--;

             after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1PureAdtTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__PureAdtElement1Assignment_1_1"


    // $ANTLR start "rule__PureAdtType__PureAdtElement2Assignment_1_2"
    // InternalFPML.g:9764:1: rule__PureAdtType__PureAdtElement2Assignment_1_2 : ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__PureAdtType__PureAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9768:1: ( ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:9769:2: ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:9769:2: ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:9770:3: ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:9771:3: ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:9771:4: rule__PureAdtType__PureAdtElement2Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PureAdtType__PureAdtElement2Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Alternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureAdtType__PureAdtElement2Assignment_1_2"


    // $ANTLR start "rule__PureSumType__AdtElementAssignment_1"
    // InternalFPML.g:9779:1: rule__PureSumType__AdtElementAssignment_1 : ( rulePureAdtType ) ;
    public final void rule__PureSumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9783:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9784:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9784:2: ( rulePureAdtType )
            // InternalFPML.g:9785:3: rulePureAdtType
            {
             before(grammarAccess.getPureSumTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtType();

            state._fsp--;

             after(grammarAccess.getPureSumTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumType__AdtElementAssignment_1"


    // $ANTLR start "rule__PureProdType__AdtElementAssignment_1"
    // InternalFPML.g:9794:1: rule__PureProdType__AdtElementAssignment_1 : ( rulePureAdtType ) ;
    public final void rule__PureProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9798:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9799:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9799:2: ( rulePureAdtType )
            // InternalFPML.g:9800:3: rulePureAdtType
            {
             before(grammarAccess.getPureProdTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtType();

            state._fsp--;

             after(grammarAccess.getPureProdTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdType__AdtElementAssignment_1"


    // $ANTLR start "rule__EffectFullData__NameAssignment_0"
    // InternalFPML.g:9809:1: rule__EffectFullData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EffectFullData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9813:1: ( ( RULE_ID ) )
            // InternalFPML.g:9814:2: ( RULE_ID )
            {
            // InternalFPML.g:9814:2: ( RULE_ID )
            // InternalFPML.g:9815:3: RULE_ID
            {
             before(grammarAccess.getEffectFullDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__NameAssignment_0"


    // $ANTLR start "rule__EffectFullData__ContentAssignment_2"
    // InternalFPML.g:9824:1: rule__EffectFullData__ContentAssignment_2 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullData__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9828:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9829:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9829:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9830:3: ruleEffectFullAdtType
            {
             before(grammarAccess.getEffectFullDataAccess().getContentEffectFullAdtTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtType();

            state._fsp--;

             after(grammarAccess.getEffectFullDataAccess().getContentEffectFullAdtTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullData__ContentAssignment_2"


    // $ANTLR start "rule__EffectFullValue__NameAssignment_1"
    // InternalFPML.g:9839:1: rule__EffectFullValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9843:1: ( ( RULE_ID ) )
            // InternalFPML.g:9844:2: ( RULE_ID )
            {
            // InternalFPML.g:9844:2: ( RULE_ID )
            // InternalFPML.g:9845:3: RULE_ID
            {
             before(grammarAccess.getEffectFullValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__NameAssignment_1"


    // $ANTLR start "rule__EffectFullValue__ValueAssignment_3"
    // InternalFPML.g:9854:1: rule__EffectFullValue__ValueAssignment_3 : ( ruleEffectFullExpression ) ;
    public final void rule__EffectFullValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9858:1: ( ( ruleEffectFullExpression ) )
            // InternalFPML.g:9859:2: ( ruleEffectFullExpression )
            {
            // InternalFPML.g:9859:2: ( ruleEffectFullExpression )
            // InternalFPML.g:9860:3: ruleEffectFullExpression
            {
             before(grammarAccess.getEffectFullValueAccess().getValueEffectFullExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullExpression();

            state._fsp--;

             after(grammarAccess.getEffectFullValueAccess().getValueEffectFullExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValue__ValueAssignment_3"


    // $ANTLR start "rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1"
    // InternalFPML.g:9869:1: rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9873:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9874:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9874:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9875:3: ruleEffectFullAdtType
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1EffectFullAdtTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtType();

            state._fsp--;

             after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1EffectFullAdtTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1"


    // $ANTLR start "rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2"
    // InternalFPML.g:9884:1: rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 : ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9888:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:9889:2: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:9889:2: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:9890:3: ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:9891:3: ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:9891:4: rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Alternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2"


    // $ANTLR start "rule__EffectFullSumType__AdtElementAssignment_1"
    // InternalFPML.g:9899:1: rule__EffectFullSumType__AdtElementAssignment_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullSumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9903:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9904:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9904:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9905:3: ruleEffectFullAdtType
            {
             before(grammarAccess.getEffectFullSumTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtType();

            state._fsp--;

             after(grammarAccess.getEffectFullSumTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumType__AdtElementAssignment_1"


    // $ANTLR start "rule__EffectFullProdType__AdtElementAssignment_1"
    // InternalFPML.g:9914:1: rule__EffectFullProdType__AdtElementAssignment_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9918:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9919:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9919:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9920:3: ruleEffectFullAdtType
            {
             before(grammarAccess.getEffectFullProdTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtType();

            state._fsp--;

             after(grammarAccess.getEffectFullProdTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdType__AdtElementAssignment_1"


    // $ANTLR start "rule__PureFunctionDefinition__ReturnTypeAssignment_1"
    // InternalFPML.g:9929:1: rule__PureFunctionDefinition__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9933:1: ( ( ruleValueType ) )
            // InternalFPML.g:9934:2: ( ruleValueType )
            {
            // InternalFPML.g:9934:2: ( ruleValueType )
            // InternalFPML.g:9935:3: ruleValueType
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
    // InternalFPML.g:9944:1: rule__PureFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9948:1: ( ( RULE_ID ) )
            // InternalFPML.g:9949:2: ( RULE_ID )
            {
            // InternalFPML.g:9949:2: ( RULE_ID )
            // InternalFPML.g:9950:3: RULE_ID
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
    // InternalFPML.g:9959:1: rule__PureFunctionDefinition__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9963:1: ( ( ruleArgument ) )
            // InternalFPML.g:9964:2: ( ruleArgument )
            {
            // InternalFPML.g:9964:2: ( ruleArgument )
            // InternalFPML.g:9965:3: ruleArgument
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


    // $ANTLR start "rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1"
    // InternalFPML.g:9974:1: rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 : ( ruleAdditionalPureArgument ) ;
    public final void rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9978:1: ( ( ruleAdditionalPureArgument ) )
            // InternalFPML.g:9979:2: ( ruleAdditionalPureArgument )
            {
            // InternalFPML.g:9979:2: ( ruleAdditionalPureArgument )
            // InternalFPML.g:9980:3: ruleAdditionalPureArgument
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAdditionalPureArgumentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalPureArgument();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAdditionalPureArgumentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1"


    // $ANTLR start "rule__PureFunctionDefinition__FunctionBodyAssignment_9"
    // InternalFPML.g:9989:1: rule__PureFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9993:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:9994:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:9994:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:9995:3: ruleFunctionBodyPure
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
    // InternalFPML.g:10004:1: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10008:1: ( ( ruleIOType ) )
            // InternalFPML.g:10009:2: ( ruleIOType )
            {
            // InternalFPML.g:10009:2: ( ruleIOType )
            // InternalFPML.g:10010:3: ruleIOType
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
    // InternalFPML.g:10019:1: rule__EffectFullFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10023:1: ( ( RULE_ID ) )
            // InternalFPML.g:10024:2: ( RULE_ID )
            {
            // InternalFPML.g:10024:2: ( RULE_ID )
            // InternalFPML.g:10025:3: RULE_ID
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
    // InternalFPML.g:10034:1: rule__EffectFullFunctionDefinition__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10038:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:10039:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:10039:2: ( ruleEffectFullArgument )
            // InternalFPML.g:10040:3: ruleEffectFullArgument
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


    // $ANTLR start "rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1"
    // InternalFPML.g:10049:1: rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 : ( ruleAdditionalEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10053:1: ( ( ruleAdditionalEffectFullArgument ) )
            // InternalFPML.g:10054:2: ( ruleAdditionalEffectFullArgument )
            {
            // InternalFPML.g:10054:2: ( ruleAdditionalEffectFullArgument )
            // InternalFPML.g:10055:3: ruleAdditionalEffectFullArgument
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAdditionalEffectFullArgumentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAdditionalEffectFullArgumentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1"


    // $ANTLR start "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9"
    // InternalFPML.g:10064:1: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10068:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10069:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10069:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10070:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:10079:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10083:1: ( ( ruleUnitType ) )
            // InternalFPML.g:10084:2: ( ruleUnitType )
            {
            // InternalFPML.g:10084:2: ( ruleUnitType )
            // InternalFPML.g:10085:3: ruleUnitType
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
    // InternalFPML.g:10094:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10098:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10099:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10099:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10100:3: ruleFunctionBodyEffectFull
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


    // $ANTLR start "rule__AdditionalPureArgument__Arg2Assignment"
    // InternalFPML.g:10109:1: rule__AdditionalPureArgument__Arg2Assignment : ( ruleArgument ) ;
    public final void rule__AdditionalPureArgument__Arg2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10113:1: ( ( ruleArgument ) )
            // InternalFPML.g:10114:2: ( ruleArgument )
            {
            // InternalFPML.g:10114:2: ( ruleArgument )
            // InternalFPML.g:10115:3: ruleArgument
            {
             before(grammarAccess.getAdditionalPureArgumentAccess().getArg2ArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAdditionalPureArgumentAccess().getArg2ArgumentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPureArgument__Arg2Assignment"


    // $ANTLR start "rule__AdditionalEffectFullArgument__Arg2Assignment"
    // InternalFPML.g:10124:1: rule__AdditionalEffectFullArgument__Arg2Assignment : ( ruleEffectFullArgument ) ;
    public final void rule__AdditionalEffectFullArgument__Arg2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10128:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:10129:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:10129:2: ( ruleEffectFullArgument )
            // InternalFPML.g:10130:3: ruleEffectFullArgument
            {
             before(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2EffectFullArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2EffectFullArgumentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalEffectFullArgument__Arg2Assignment"


    // $ANTLR start "rule__EffectFullArgument__TypeAssignment_0"
    // InternalFPML.g:10139:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10143:1: ( ( ruleType ) )
            // InternalFPML.g:10144:2: ( ruleType )
            {
            // InternalFPML.g:10144:2: ( ruleType )
            // InternalFPML.g:10145:3: ruleType
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
    // InternalFPML.g:10154:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10158:1: ( ( RULE_ID ) )
            // InternalFPML.g:10159:2: ( RULE_ID )
            {
            // InternalFPML.g:10159:2: ( RULE_ID )
            // InternalFPML.g:10160:3: RULE_ID
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
    // InternalFPML.g:10169:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10173:1: ( ( ruleValueType ) )
            // InternalFPML.g:10174:2: ( ruleValueType )
            {
            // InternalFPML.g:10174:2: ( ruleValueType )
            // InternalFPML.g:10175:3: ruleValueType
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
    // InternalFPML.g:10184:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10188:1: ( ( RULE_ID ) )
            // InternalFPML.g:10189:2: ( RULE_ID )
            {
            // InternalFPML.g:10189:2: ( RULE_ID )
            // InternalFPML.g:10190:3: RULE_ID
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
    // InternalFPML.g:10199:1: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10203:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10204:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10204:2: ( ( RULE_ID ) )
            // InternalFPML.g:10205:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 
            // InternalFPML.g:10206:3: ( RULE_ID )
            // InternalFPML.g:10207:4: RULE_ID
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
    // InternalFPML.g:10218:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10222:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:10223:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:10223:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:10224:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:10233:1: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10237:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:10238:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:10238:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:10239:3: rulePrimitivePureFunction
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
    // InternalFPML.g:10248:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10252:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:10253:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:10253:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:10254:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:10263:1: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10267:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10268:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10268:2: ( ( RULE_ID ) )
            // InternalFPML.g:10269:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 
            // InternalFPML.g:10270:3: ( RULE_ID )
            // InternalFPML.g:10271:4: RULE_ID
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
    // InternalFPML.g:10282:1: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10286:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:10287:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:10287:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:10288:3: rulePrimitivePureFunction
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
    // InternalFPML.g:10297:1: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10301:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10302:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10302:2: ( ( RULE_ID ) )
            // InternalFPML.g:10303:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0()); 
            // InternalFPML.g:10304:3: ( RULE_ID )
            // InternalFPML.g:10305:4: RULE_ID
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
    // InternalFPML.g:10316:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10320:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:10321:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:10321:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:10322:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:10331:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 : ( rulePrimitiveFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10335:1: ( ( rulePrimitiveFunction ) )
            // InternalFPML.g:10336:2: ( rulePrimitiveFunction )
            {
            // InternalFPML.g:10336:2: ( rulePrimitiveFunction )
            // InternalFPML.g:10337:3: rulePrimitiveFunction
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:10346:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10350:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:10351:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:10351:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:10352:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:10361:1: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10365:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10366:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10366:2: ( ( RULE_ID ) )
            // InternalFPML.g:10367:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceCrossReference_0_1_0()); 
            // InternalFPML.g:10368:3: ( RULE_ID )
            // InternalFPML.g:10369:4: RULE_ID
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
    // InternalFPML.g:10380:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitiveFunction ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10384:1: ( ( rulePrimitiveFunction ) )
            // InternalFPML.g:10385:2: ( rulePrimitiveFunction )
            {
            // InternalFPML.g:10385:2: ( rulePrimitiveFunction )
            // InternalFPML.g:10386:3: rulePrimitiveFunction
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalFPML.g:10395:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10399:1: ( ( ruleType ) )
            // InternalFPML.g:10400:2: ( ruleType )
            {
            // InternalFPML.g:10400:2: ( ruleType )
            // InternalFPML.g:10401:3: ruleType
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
    // InternalFPML.g:10410:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10414:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:10415:2: ( ( 'int' ) )
            {
            // InternalFPML.g:10415:2: ( ( 'int' ) )
            // InternalFPML.g:10416:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:10417:3: ( 'int' )
            // InternalFPML.g:10418:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalFPML.g:10429:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10433:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:10434:2: ( ( 'String' ) )
            {
            // InternalFPML.g:10434:2: ( ( 'String' ) )
            // InternalFPML.g:10435:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:10436:3: ( 'String' )
            // InternalFPML.g:10437:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalFPML.g:10448:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10452:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:10453:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:10453:2: ( ( 'Unit' ) )
            // InternalFPML.g:10454:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:10455:3: ( 'Unit' )
            // InternalFPML.g:10456:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalFPML.g:10467:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10471:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10472:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10472:2: ( ( RULE_ID ) )
            // InternalFPML.g:10473:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypePureDataCrossReference_2_0()); 
            // InternalFPML.g:10474:3: ( RULE_ID )
            // InternalFPML.g:10475:4: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getTypePureDataIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypePureDataIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypePureDataCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectFullDataType__TypeAssignment_2"
    // InternalFPML.g:10486:1: rule__EffectFullDataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullDataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10490:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10491:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10491:2: ( ( RULE_ID ) )
            // InternalFPML.g:10492:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataCrossReference_2_0()); 
            // InternalFPML.g:10493:3: ( RULE_ID )
            // InternalFPML.g:10494:4: RULE_ID
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataType__TypeAssignment_2"


    // $ANTLR start "rule__PureFunctionType__ArgTypeAssignment_3"
    // InternalFPML.g:10505:1: rule__PureFunctionType__ArgTypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10509:1: ( ( ruleValueType ) )
            // InternalFPML.g:10510:2: ( ruleValueType )
            {
            // InternalFPML.g:10510:2: ( ruleValueType )
            // InternalFPML.g:10511:3: ruleValueType
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
    // InternalFPML.g:10520:1: rule__PureFunctionType__ReturnTypeAssignment_5 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10524:1: ( ( ruleValueType ) )
            // InternalFPML.g:10525:2: ( ruleValueType )
            {
            // InternalFPML.g:10525:2: ( ruleValueType )
            // InternalFPML.g:10526:3: ruleValueType
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
    // InternalFPML.g:10535:1: rule__EffectFullFunctionType__ArgTypeAssignment_3 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10539:1: ( ( ruleType ) )
            // InternalFPML.g:10540:2: ( ruleType )
            {
            // InternalFPML.g:10540:2: ( ruleType )
            // InternalFPML.g:10541:3: ruleType
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
    // InternalFPML.g:10550:1: rule__EffectFullFunctionType__ReturnTypeAssignment_5 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10554:1: ( ( ruleIOType ) )
            // InternalFPML.g:10555:2: ( ruleIOType )
            {
            // InternalFPML.g:10555:2: ( ruleIOType )
            // InternalFPML.g:10556:3: ruleIOType
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


    // $ANTLR start "rule__EffectFullFunctionValue__ValueAssignment"
    // InternalFPML.g:10565:1: rule__EffectFullFunctionValue__ValueAssignment : ( ruleEffectFullLambda ) ;
    public final void rule__EffectFullFunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10569:1: ( ( ruleEffectFullLambda ) )
            // InternalFPML.g:10570:2: ( ruleEffectFullLambda )
            {
            // InternalFPML.g:10570:2: ( ruleEffectFullLambda )
            // InternalFPML.g:10571:3: ruleEffectFullLambda
            {
             before(grammarAccess.getEffectFullFunctionValueAccess().getValueEffectFullLambdaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullLambda();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionValueAccess().getValueEffectFullLambdaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionValue__ValueAssignment"


    // $ANTLR start "rule__EffectFullValueRef__ValueAssignment_1"
    // InternalFPML.g:10580:1: rule__EffectFullValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10584:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10585:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10585:2: ( ( RULE_ID ) )
            // InternalFPML.g:10586:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueCrossReference_1_0()); 
            // InternalFPML.g:10587:3: ( RULE_ID )
            // InternalFPML.g:10588:4: RULE_ID
            {
             before(grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullValueRef__ValueAssignment_1"


    // $ANTLR start "rule__EffectFullLambda__ArgAssignment_0_2"
    // InternalFPML.g:10599:1: rule__EffectFullLambda__ArgAssignment_0_2 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullLambda__ArgAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10603:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:10604:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:10604:2: ( ruleEffectFullArgument )
            // InternalFPML.g:10605:3: ruleEffectFullArgument
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__ArgAssignment_0_2"


    // $ANTLR start "rule__EffectFullLambda__FunctionBodyAssignment_0_5"
    // InternalFPML.g:10614:1: rule__EffectFullLambda__FunctionBodyAssignment_0_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10618:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10619:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10619:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10620:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__FunctionBodyAssignment_0_5"


    // $ANTLR start "rule__EffectFullLambda__FunctionBodyAssignment_1_1"
    // InternalFPML.g:10629:1: rule__EffectFullLambda__FunctionBodyAssignment_1_1 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10633:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10634:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10634:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10635:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__FunctionBodyAssignment_1_1"


    // $ANTLR start "rule__IntValue__ValueAssignment_1"
    // InternalFPML.g:10644:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10648:1: ( ( RULE_INT ) )
            // InternalFPML.g:10649:2: ( RULE_INT )
            {
            // InternalFPML.g:10649:2: ( RULE_INT )
            // InternalFPML.g:10650:3: RULE_INT
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
    // InternalFPML.g:10659:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10663:1: ( ( RULE_STRING ) )
            // InternalFPML.g:10664:2: ( RULE_STRING )
            {
            // InternalFPML.g:10664:2: ( RULE_STRING )
            // InternalFPML.g:10665:3: RULE_STRING
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
    // InternalFPML.g:10674:1: rule__FunctionValue__ValueAssignment : ( rulePureLambda ) ;
    public final void rule__FunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10678:1: ( ( rulePureLambda ) )
            // InternalFPML.g:10679:2: ( rulePureLambda )
            {
            // InternalFPML.g:10679:2: ( rulePureLambda )
            // InternalFPML.g:10680:3: rulePureLambda
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
    // InternalFPML.g:10689:1: rule__DataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10693:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10694:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10694:2: ( ( RULE_ID ) )
            // InternalFPML.g:10695:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0()); 
            // InternalFPML.g:10696:3: ( RULE_ID )
            // InternalFPML.g:10697:4: RULE_ID
            {
             before(grammarAccess.getDataValueAccess().getTypePureDataIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getTypePureDataIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0()); 

            }


            }

        }
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
    // InternalFPML.g:10708:1: rule__DataValue__ValueAssignment_3 : ( rulePureAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10712:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10713:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10713:2: ( rulePureAdtValue )
            // InternalFPML.g:10714:3: rulePureAdtValue
            {
             before(grammarAccess.getDataValueAccess().getValuePureAdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getValuePureAdtValueParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectFullDataValue__TypeAssignment_1"
    // InternalFPML.g:10723:1: rule__EffectFullDataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullDataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10727:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10728:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10728:2: ( ( RULE_ID ) )
            // InternalFPML.g:10729:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0()); 
            // InternalFPML.g:10730:3: ( RULE_ID )
            // InternalFPML.g:10731:4: RULE_ID
            {
             before(grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__TypeAssignment_1"


    // $ANTLR start "rule__EffectFullDataValue__ValueAssignment_3"
    // InternalFPML.g:10742:1: rule__EffectFullDataValue__ValueAssignment_3 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullDataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10746:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10747:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10747:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10748:3: ruleEffectFullAdtValue
            {
             before(grammarAccess.getEffectFullDataValueAccess().getValueEffectFullAdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullDataValueAccess().getValueEffectFullAdtValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullDataValue__ValueAssignment_3"


    // $ANTLR start "rule__PureValueRef__ValueAssignment_1"
    // InternalFPML.g:10757:1: rule__PureValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PureValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10761:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10762:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10762:2: ( ( RULE_ID ) )
            // InternalFPML.g:10763:3: ( RULE_ID )
            {
             before(grammarAccess.getPureValueRefAccess().getValuePureValueCrossReference_1_0()); 
            // InternalFPML.g:10764:3: ( RULE_ID )
            // InternalFPML.g:10765:4: RULE_ID
            {
             before(grammarAccess.getPureValueRefAccess().getValuePureValueIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureValueRefAccess().getValuePureValueIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPureValueRefAccess().getValuePureValueCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureValueRef__ValueAssignment_1"


    // $ANTLR start "rule__PureLambda__ArgAssignment_2"
    // InternalFPML.g:10776:1: rule__PureLambda__ArgAssignment_2 : ( ruleArgument ) ;
    public final void rule__PureLambda__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10780:1: ( ( ruleArgument ) )
            // InternalFPML.g:10781:2: ( ruleArgument )
            {
            // InternalFPML.g:10781:2: ( ruleArgument )
            // InternalFPML.g:10782:3: ruleArgument
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
    // InternalFPML.g:10791:1: rule__PureLambda__FunctionBodyAssignment_5 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureLambda__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10795:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:10796:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:10796:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:10797:3: ruleFunctionBodyPure
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


    // $ANTLR start "rule__PureProdValue__ProdAdtElement1Assignment_1"
    // InternalFPML.g:10806:1: rule__PureProdValue__ProdAdtElement1Assignment_1 : ( rulePureAdtValue ) ;
    public final void rule__PureProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10810:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10811:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10811:2: ( rulePureAdtValue )
            // InternalFPML.g:10812:3: rulePureAdtValue
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement1PureAdtValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getPureProdValueAccess().getProdAdtElement1PureAdtValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__ProdAdtElement1Assignment_1"


    // $ANTLR start "rule__PureProdValue__ProdAdtElement2Assignment_3"
    // InternalFPML.g:10821:1: rule__PureProdValue__ProdAdtElement2Assignment_3 : ( rulePureAdtValue ) ;
    public final void rule__PureProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10825:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10826:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10826:2: ( rulePureAdtValue )
            // InternalFPML.g:10827:3: rulePureAdtValue
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement2PureAdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getPureProdValueAccess().getProdAdtElement2PureAdtValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureProdValue__ProdAdtElement2Assignment_3"


    // $ANTLR start "rule__PureSumValue__SumAdtElement1Assignment_0_2"
    // InternalFPML.g:10836:1: rule__PureSumValue__SumAdtElement1Assignment_0_2 : ( rulePureAdtValue ) ;
    public final void rule__PureSumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10840:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10841:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10841:2: ( rulePureAdtValue )
            // InternalFPML.g:10842:3: rulePureAdtValue
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement1PureAdtValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getPureSumValueAccess().getSumAdtElement1PureAdtValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__SumAdtElement1Assignment_0_2"


    // $ANTLR start "rule__PureSumValue__SumAdtElement2Assignment_1_2"
    // InternalFPML.g:10851:1: rule__PureSumValue__SumAdtElement2Assignment_1_2 : ( rulePureAdtValue ) ;
    public final void rule__PureSumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10855:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10856:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10856:2: ( rulePureAdtValue )
            // InternalFPML.g:10857:3: rulePureAdtValue
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement2PureAdtValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureAdtValue();

            state._fsp--;

             after(grammarAccess.getPureSumValueAccess().getSumAdtElement2PureAdtValueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureSumValue__SumAdtElement2Assignment_1_2"


    // $ANTLR start "rule__EffectFullProdValue__ProdAdtElement1Assignment_1"
    // InternalFPML.g:10866:1: rule__EffectFullProdValue__ProdAdtElement1Assignment_1 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10870:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10871:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10871:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10872:3: ruleEffectFullAdtValue
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullAdtValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullAdtValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__ProdAdtElement1Assignment_1"


    // $ANTLR start "rule__EffectFullProdValue__ProdAdtElement2Assignment_3"
    // InternalFPML.g:10881:1: rule__EffectFullProdValue__ProdAdtElement2Assignment_3 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10885:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10886:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10886:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10887:3: ruleEffectFullAdtValue
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2EffectFullAdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2EffectFullAdtValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullProdValue__ProdAdtElement2Assignment_3"


    // $ANTLR start "rule__EffectFullSumValue__SumAdtElement1Assignment_0_2"
    // InternalFPML.g:10896:1: rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullSumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10900:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10901:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10901:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10902:3: ruleEffectFullAdtValue
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1EffectFullAdtValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1EffectFullAdtValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__SumAdtElement1Assignment_0_2"


    // $ANTLR start "rule__EffectFullSumValue__SumAdtElement2Assignment_1_2"
    // InternalFPML.g:10911:1: rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullSumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10915:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10916:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10916:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10917:3: ruleEffectFullAdtValue
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2EffectFullAdtValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullAdtValue();

            state._fsp--;

             after(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2EffectFullAdtValueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullSumValue__SumAdtElement2Assignment_1_2"


    // $ANTLR start "rule__ApplyF__FunctionTypeAssignment_2"
    // InternalFPML.g:10926:1: rule__ApplyF__FunctionTypeAssignment_2 : ( rulePureFunctionType ) ;
    public final void rule__ApplyF__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10930:1: ( ( rulePureFunctionType ) )
            // InternalFPML.g:10931:2: ( rulePureFunctionType )
            {
            // InternalFPML.g:10931:2: ( rulePureFunctionType )
            // InternalFPML.g:10932:3: rulePureFunctionType
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
    // InternalFPML.g:10941:1: rule__ApplyF__ValueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyF__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10945:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10946:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10946:2: ( ( RULE_ID ) )
            // InternalFPML.g:10947:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFAccess().getValuePureReferenceCrossReference_3_0()); 
            // InternalFPML.g:10948:3: ( RULE_ID )
            // InternalFPML.g:10949:4: RULE_ID
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


    // $ANTLR start "rule__PrimitiveReturn__TypeAssignment_2"
    // InternalFPML.g:10960:1: rule__PrimitiveReturn__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__PrimitiveReturn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10964:1: ( ( ruleType ) )
            // InternalFPML.g:10965:2: ( ruleType )
            {
            // InternalFPML.g:10965:2: ( ruleType )
            // InternalFPML.g:10966:3: ruleType
            {
             before(grammarAccess.getPrimitiveReturnAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimitiveReturnAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveReturn__TypeAssignment_2"


    // $ANTLR start "rule__ApplyFIO__FunctionTypeAssignment_2"
    // InternalFPML.g:10975:1: rule__ApplyFIO__FunctionTypeAssignment_2 : ( ruleEffectFullFunctionType ) ;
    public final void rule__ApplyFIO__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10979:1: ( ( ruleEffectFullFunctionType ) )
            // InternalFPML.g:10980:2: ( ruleEffectFullFunctionType )
            {
            // InternalFPML.g:10980:2: ( ruleEffectFullFunctionType )
            // InternalFPML.g:10981:3: ruleEffectFullFunctionType
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
    // InternalFPML.g:10990:1: rule__ApplyFIO__ValueAssignment_3 : ( ruleApplyFIOFactor ) ;
    public final void rule__ApplyFIO__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10994:1: ( ( ruleApplyFIOFactor ) )
            // InternalFPML.g:10995:2: ( ruleApplyFIOFactor )
            {
            // InternalFPML.g:10995:2: ( ruleApplyFIOFactor )
            // InternalFPML.g:10996:3: ruleApplyFIOFactor
            {
             before(grammarAccess.getApplyFIOAccess().getValueApplyFIOFactorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleApplyFIOFactor();

            state._fsp--;

             after(grammarAccess.getApplyFIOAccess().getValueApplyFIOFactorParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ApplyFIOFactor__ValueReferenceAssignment_0"
    // InternalFPML.g:11005:1: rule__ApplyFIOFactor__ValueReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyFIOFactor__ValueReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:11009:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:11010:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:11010:2: ( ( RULE_ID ) )
            // InternalFPML.g:11011:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceCrossReference_0_0()); 
            // InternalFPML.g:11012:3: ( RULE_ID )
            // InternalFPML.g:11013:4: RULE_ID
            {
             before(grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIOFactor__ValueReferenceAssignment_0"


    // $ANTLR start "rule__ApplyFIOFactor__ValuePrimitiveAssignment_1"
    // InternalFPML.g:11024:1: rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 : ( rulePrimitiveEffectFullValue ) ;
    public final void rule__ApplyFIOFactor__ValuePrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:11028:1: ( ( rulePrimitiveEffectFullValue ) )
            // InternalFPML.g:11029:2: ( rulePrimitiveEffectFullValue )
            {
            // InternalFPML.g:11029:2: ( rulePrimitiveEffectFullValue )
            // InternalFPML.g:11030:3: rulePrimitiveEffectFullValue
            {
             before(grammarAccess.getApplyFIOFactorAccess().getValuePrimitivePrimitiveEffectFullValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveEffectFullValue();

            state._fsp--;

             after(grammarAccess.getApplyFIOFactorAccess().getValuePrimitivePrimitiveEffectFullValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIOFactor__ValuePrimitiveAssignment_1"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\7\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\50\2\uffff\1\32\1\uffff\1\64\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\16\uffff\2\4",
            "",
            "",
            "\1\6\2\7",
            "",
            "\3\11\21\uffff\1\11\7\uffff\1\10\1\uffff\1\10\4\uffff\2\11\12\uffff\2\10",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2509:1: rule__PureAdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) );";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0018000500080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0007FE4028680010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0018000500000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00003E0020600010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0038002700000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007FE0020680010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00003E0000600000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000018001000070L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0007FFC029680010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0004400000000000L});

}