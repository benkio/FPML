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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "','", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'randomInt'", "'applyFIO'", "'int'", "'String'", "'Unit'"
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
    // InternalFPML.g:1937:1: rulePrimitiveEffectFullValue : ( rulePrimitiveRandom ) ;
    public final void rulePrimitiveEffectFullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1941:2: ( ( rulePrimitiveRandom ) )
            // InternalFPML.g:1942:2: ( rulePrimitiveRandom )
            {
            // InternalFPML.g:1942:2: ( rulePrimitiveRandom )
            // InternalFPML.g:1943:3: rulePrimitiveRandom
            {
             before(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveRandom();

            state._fsp--;

             after(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleApplyFIO"
    // InternalFPML.g:1978:1: entryRuleApplyFIO : ruleApplyFIO EOF ;
    public final void entryRuleApplyFIO() throws RecognitionException {
        try {
            // InternalFPML.g:1979:1: ( ruleApplyFIO EOF )
            // InternalFPML.g:1980:1: ruleApplyFIO EOF
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
    // InternalFPML.g:1987:1: ruleApplyFIO : ( ( rule__ApplyFIO__Group__0 ) ) ;
    public final void ruleApplyFIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1991:2: ( ( ( rule__ApplyFIO__Group__0 ) ) )
            // InternalFPML.g:1992:2: ( ( rule__ApplyFIO__Group__0 ) )
            {
            // InternalFPML.g:1992:2: ( ( rule__ApplyFIO__Group__0 ) )
            // InternalFPML.g:1993:3: ( rule__ApplyFIO__Group__0 )
            {
             before(grammarAccess.getApplyFIOAccess().getGroup()); 
            // InternalFPML.g:1994:3: ( rule__ApplyFIO__Group__0 )
            // InternalFPML.g:1994:4: rule__ApplyFIO__Group__0
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
    // InternalFPML.g:2003:1: entryRuleApplyFIOFactor : ruleApplyFIOFactor EOF ;
    public final void entryRuleApplyFIOFactor() throws RecognitionException {
        try {
            // InternalFPML.g:2004:1: ( ruleApplyFIOFactor EOF )
            // InternalFPML.g:2005:1: ruleApplyFIOFactor EOF
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
    // InternalFPML.g:2012:1: ruleApplyFIOFactor : ( ( rule__ApplyFIOFactor__Alternatives ) ) ;
    public final void ruleApplyFIOFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2016:2: ( ( ( rule__ApplyFIOFactor__Alternatives ) ) )
            // InternalFPML.g:2017:2: ( ( rule__ApplyFIOFactor__Alternatives ) )
            {
            // InternalFPML.g:2017:2: ( ( rule__ApplyFIOFactor__Alternatives ) )
            // InternalFPML.g:2018:3: ( rule__ApplyFIOFactor__Alternatives )
            {
             before(grammarAccess.getApplyFIOFactorAccess().getAlternatives()); 
            // InternalFPML.g:2019:3: ( rule__ApplyFIOFactor__Alternatives )
            // InternalFPML.g:2019:4: rule__ApplyFIOFactor__Alternatives
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
    // InternalFPML.g:2027:1: rule__PureAdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__PureAdtType__Group_1__0 ) ) );
    public final void rule__PureAdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2031:1: ( ( ruleValueType ) | ( ( rule__PureAdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32||LA1_0==34||(LA1_0>=49 && LA1_0<=50)) ) {
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
                    // InternalFPML.g:2032:2: ( ruleValueType )
                    {
                    // InternalFPML.g:2032:2: ( ruleValueType )
                    // InternalFPML.g:2033:3: ruleValueType
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
                    // InternalFPML.g:2038:2: ( ( rule__PureAdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:2038:2: ( ( rule__PureAdtType__Group_1__0 ) )
                    // InternalFPML.g:2039:3: ( rule__PureAdtType__Group_1__0 )
                    {
                     before(grammarAccess.getPureAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:2040:3: ( rule__PureAdtType__Group_1__0 )
                    // InternalFPML.g:2040:4: rule__PureAdtType__Group_1__0
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
    // InternalFPML.g:2048:1: rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 : ( ( rulePureSumType ) | ( rulePureProdType ) );
    public final void rule__PureAdtType__PureAdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2052:1: ( ( rulePureSumType ) | ( rulePureProdType ) )
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
                    // InternalFPML.g:2053:2: ( rulePureSumType )
                    {
                    // InternalFPML.g:2053:2: ( rulePureSumType )
                    // InternalFPML.g:2054:3: rulePureSumType
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
                    // InternalFPML.g:2059:2: ( rulePureProdType )
                    {
                    // InternalFPML.g:2059:2: ( rulePureProdType )
                    // InternalFPML.g:2060:3: rulePureProdType
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
    // InternalFPML.g:2069:1: rule__EffectFullAdtType__Alternatives : ( ( ruleIOType ) | ( ( rule__EffectFullAdtType__Group_1__0 ) ) );
    public final void rule__EffectFullAdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2073:1: ( ( ruleIOType ) | ( ( rule__EffectFullAdtType__Group_1__0 ) ) )
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
                    // InternalFPML.g:2074:2: ( ruleIOType )
                    {
                    // InternalFPML.g:2074:2: ( ruleIOType )
                    // InternalFPML.g:2075:3: ruleIOType
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
                    // InternalFPML.g:2080:2: ( ( rule__EffectFullAdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:2080:2: ( ( rule__EffectFullAdtType__Group_1__0 ) )
                    // InternalFPML.g:2081:3: ( rule__EffectFullAdtType__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:2082:3: ( rule__EffectFullAdtType__Group_1__0 )
                    // InternalFPML.g:2082:4: rule__EffectFullAdtType__Group_1__0
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
    // InternalFPML.g:2090:1: rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 : ( ( ruleEffectFullSumType ) | ( ruleEffectFullProdType ) );
    public final void rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2094:1: ( ( ruleEffectFullSumType ) | ( ruleEffectFullProdType ) )
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
                    // InternalFPML.g:2095:2: ( ruleEffectFullSumType )
                    {
                    // InternalFPML.g:2095:2: ( ruleEffectFullSumType )
                    // InternalFPML.g:2096:3: ruleEffectFullSumType
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
                    // InternalFPML.g:2101:2: ( ruleEffectFullProdType )
                    {
                    // InternalFPML.g:2101:2: ( ruleEffectFullProdType )
                    // InternalFPML.g:2102:3: ruleEffectFullProdType
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
    // InternalFPML.g:2111:1: rule__PureFunction__Alternatives : ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) );
    public final void rule__PureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2115:1: ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) )
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
                    // InternalFPML.g:2116:2: ( rulePureFunctionDefinition )
                    {
                    // InternalFPML.g:2116:2: ( rulePureFunctionDefinition )
                    // InternalFPML.g:2117:3: rulePureFunctionDefinition
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
                    // InternalFPML.g:2122:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2122:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:2123:3: rulePrimitivePureFunction
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
    // InternalFPML.g:2132:1: rule__EffectFullFunction__Alternatives : ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) );
    public final void rule__EffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2136:1: ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==46||LA6_0==48) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFPML.g:2137:2: ( ruleEffectFullFunctionDefinition )
                    {
                    // InternalFPML.g:2137:2: ( ruleEffectFullFunctionDefinition )
                    // InternalFPML.g:2138:3: ruleEffectFullFunctionDefinition
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
                    // InternalFPML.g:2143:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:2143:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:2144:3: rulePrimitiveEffectFullFunction
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
    // InternalFPML.g:2153:1: rule__PrimitiveFunction__Alternatives : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__PrimitiveFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2157:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46||LA7_0==48) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=21 && LA7_0<=22)||(LA7_0>=41 && LA7_0<=45)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:2158:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:2158:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:2159:3: rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:2164:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2164:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:2165:3: rulePrimitivePureFunction
                    {
                     before(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePureFunction();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 

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
    // InternalFPML.g:2174:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2178:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
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
                    // InternalFPML.g:2179:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:2179:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:2180:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:2185:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:2185:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:2186:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:2195:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2199:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||(LA9_0>=21 && LA9_0<=22)||(LA9_0>=41 && LA9_0<=46)||LA9_0==48) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFPML.g:2200:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:2200:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:2201:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:2206:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:2206:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:2207:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:2216:1: rule__CompositionFunctionBodyPure__Alternatives : ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2220:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) )
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
                    // InternalFPML.g:2221:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:2221:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:2222:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:2223:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:2223:4: rule__CompositionFunctionBodyPure__Group_0__0
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
                    // InternalFPML.g:2227:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    {
                    // InternalFPML.g:2227:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    // InternalFPML.g:2228:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
                    // InternalFPML.g:2229:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    // InternalFPML.g:2229:4: rule__CompositionFunctionBodyPure__Group_1__0
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
    // InternalFPML.g:2237:1: rule__CompositionFunctionBodyPureFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPureFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2241:1: ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) )
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
                    // InternalFPML.g:2242:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:2242:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    // InternalFPML.g:2243:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 
                    // InternalFPML.g:2244:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    // InternalFPML.g:2244:4: rule__CompositionFunctionBodyPureFactor__Group_0__0
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
                    // InternalFPML.g:2248:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:2248:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    // InternalFPML.g:2249:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 
                    // InternalFPML.g:2250:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    // InternalFPML.g:2250:4: rule__CompositionFunctionBodyPureFactor__Group_1__0
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
    // InternalFPML.g:2258:1: rule__CompositionFunctionBodyEffect__Alternatives : ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2262:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=21 && LA12_0<=22)||(LA12_0>=41 && LA12_0<=46)||LA12_0==48) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:2263:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    {
                    // InternalFPML.g:2263:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    // InternalFPML.g:2264:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
                    // InternalFPML.g:2265:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    // InternalFPML.g:2265:4: rule__CompositionFunctionBodyEffect__Group_0__0
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
                    // InternalFPML.g:2269:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    {
                    // InternalFPML.g:2269:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    // InternalFPML.g:2270:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
                    // InternalFPML.g:2271:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    // InternalFPML.g:2271:4: rule__CompositionFunctionBodyEffect__Group_1__0
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
    // InternalFPML.g:2279:1: rule__CompositionFunctionBodyEffectFullFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2283:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else if ( ((LA13_1>=21 && LA13_1<=22)||(LA13_1>=41 && LA13_1<=46)||LA13_1==48) ) {
                    alt13=2;
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
                    // InternalFPML.g:2284:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:2284:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    // InternalFPML.g:2285:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 
                    // InternalFPML.g:2286:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    // InternalFPML.g:2286:4: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0
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
                    // InternalFPML.g:2290:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:2290:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    // InternalFPML.g:2291:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 
                    // InternalFPML.g:2292:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    // InternalFPML.g:2292:4: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0
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
    // InternalFPML.g:2300:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2304:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt14=1;
                }
                break;
            case 50:
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
                    // InternalFPML.g:2305:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:2305:2: ( ruleIntegerType )
                    // InternalFPML.g:2306:3: ruleIntegerType
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
                    // InternalFPML.g:2311:2: ( ruleStringType )
                    {
                    // InternalFPML.g:2311:2: ( ruleStringType )
                    // InternalFPML.g:2312:3: ruleStringType
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
                    // InternalFPML.g:2317:2: ( ruleDataType )
                    {
                    // InternalFPML.g:2317:2: ( ruleDataType )
                    // InternalFPML.g:2318:3: ruleDataType
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
                    // InternalFPML.g:2323:2: ( rulePureFunctionType )
                    {
                    // InternalFPML.g:2323:2: ( rulePureFunctionType )
                    // InternalFPML.g:2324:3: rulePureFunctionType
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
    // InternalFPML.g:2333:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) | ( ruleEffectFullDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2337:1: ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) | ( ruleEffectFullDataType ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
            case 49:
            case 50:
                {
                alt15=1;
                }
                break;
            case 51:
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
                    // InternalFPML.g:2338:2: ( ruleValueType )
                    {
                    // InternalFPML.g:2338:2: ( ruleValueType )
                    // InternalFPML.g:2339:3: ruleValueType
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
                    // InternalFPML.g:2344:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:2344:2: ( ruleUnitType )
                    // InternalFPML.g:2345:3: ruleUnitType
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
                    // InternalFPML.g:2350:2: ( ruleEffectFullFunctionType )
                    {
                    // InternalFPML.g:2350:2: ( ruleEffectFullFunctionType )
                    // InternalFPML.g:2351:3: ruleEffectFullFunctionType
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
                    // InternalFPML.g:2356:2: ( ruleEffectFullDataType )
                    {
                    // InternalFPML.g:2356:2: ( ruleEffectFullDataType )
                    // InternalFPML.g:2357:3: ruleEffectFullDataType
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
    // InternalFPML.g:2366:1: rule__EffectFullExpression__Alternatives : ( ( ( rule__EffectFullExpression__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullDataValue ) );
    public final void rule__EffectFullExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2370:1: ( ( ( rule__EffectFullExpression__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullDataValue ) )
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
            case 48:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==24) ) {
                    alt16=4;
                }
                else if ( (LA16_4==31) ) {
                    alt16=3;
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
                    // InternalFPML.g:2371:2: ( ( rule__EffectFullExpression__Group_0__0 ) )
                    {
                    // InternalFPML.g:2371:2: ( ( rule__EffectFullExpression__Group_0__0 ) )
                    // InternalFPML.g:2372:3: ( rule__EffectFullExpression__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullExpressionAccess().getGroup_0()); 
                    // InternalFPML.g:2373:3: ( rule__EffectFullExpression__Group_0__0 )
                    // InternalFPML.g:2373:4: rule__EffectFullExpression__Group_0__0
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
                    // InternalFPML.g:2377:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:2377:2: ( ruleUnitValue )
                    // InternalFPML.g:2378:3: ruleUnitValue
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
                    // InternalFPML.g:2383:2: ( ruleEffectFullFunctionValue )
                    {
                    // InternalFPML.g:2383:2: ( ruleEffectFullFunctionValue )
                    // InternalFPML.g:2384:3: ruleEffectFullFunctionValue
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
                    // InternalFPML.g:2389:2: ( ruleEffectFullDataValue )
                    {
                    // InternalFPML.g:2389:2: ( ruleEffectFullDataValue )
                    // InternalFPML.g:2390:3: ruleEffectFullDataValue
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
    // InternalFPML.g:2399:1: rule__EffectFullLambda__Alternatives : ( ( ( rule__EffectFullLambda__Group_0__0 ) ) | ( ( rule__EffectFullLambda__Group_1__0 ) ) );
    public final void rule__EffectFullLambda__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2403:1: ( ( ( rule__EffectFullLambda__Group_0__0 ) ) | ( ( rule__EffectFullLambda__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||(LA17_0>=21 && LA17_0<=22)||LA17_0==29||(LA17_0>=41 && LA17_0<=46)||LA17_0==48) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:2404:2: ( ( rule__EffectFullLambda__Group_0__0 ) )
                    {
                    // InternalFPML.g:2404:2: ( ( rule__EffectFullLambda__Group_0__0 ) )
                    // InternalFPML.g:2405:3: ( rule__EffectFullLambda__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullLambdaAccess().getGroup_0()); 
                    // InternalFPML.g:2406:3: ( rule__EffectFullLambda__Group_0__0 )
                    // InternalFPML.g:2406:4: rule__EffectFullLambda__Group_0__0
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
                    // InternalFPML.g:2410:2: ( ( rule__EffectFullLambda__Group_1__0 ) )
                    {
                    // InternalFPML.g:2410:2: ( ( rule__EffectFullLambda__Group_1__0 ) )
                    // InternalFPML.g:2411:3: ( rule__EffectFullLambda__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullLambdaAccess().getGroup_1()); 
                    // InternalFPML.g:2412:3: ( rule__EffectFullLambda__Group_1__0 )
                    // InternalFPML.g:2412:4: rule__EffectFullLambda__Group_1__0
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
    // InternalFPML.g:2420:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2424:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) )
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
                    // InternalFPML.g:2425:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:2425:2: ( ruleIntValue )
                    // InternalFPML.g:2426:3: ruleIntValue
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
                    // InternalFPML.g:2431:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:2431:2: ( ruleStringValue )
                    // InternalFPML.g:2432:3: ruleStringValue
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
                    // InternalFPML.g:2437:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:2437:2: ( ruleDataValue )
                    // InternalFPML.g:2438:3: ruleDataValue
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
                    // InternalFPML.g:2443:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:2443:2: ( ruleFunctionValue )
                    // InternalFPML.g:2444:3: ruleFunctionValue
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
    // InternalFPML.g:2453:1: rule__PureAdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) );
    public final void rule__PureAdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2457:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) )
            int alt19=7;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFPML.g:2458:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:2458:2: ( ruleIntValue )
                    // InternalFPML.g:2459:3: ruleIntValue
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
                    // InternalFPML.g:2464:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:2464:2: ( ruleStringValue )
                    // InternalFPML.g:2465:3: ruleStringValue
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
                    // InternalFPML.g:2470:2: ( rulePureValueRef )
                    {
                    // InternalFPML.g:2470:2: ( rulePureValueRef )
                    // InternalFPML.g:2471:3: rulePureValueRef
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
                    // InternalFPML.g:2476:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:2476:2: ( ruleDataValue )
                    // InternalFPML.g:2477:3: ruleDataValue
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
                    // InternalFPML.g:2482:2: ( rulePureSumValue )
                    {
                    // InternalFPML.g:2482:2: ( rulePureSumValue )
                    // InternalFPML.g:2483:3: rulePureSumValue
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
                    // InternalFPML.g:2488:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:2488:2: ( ruleFunctionValue )
                    // InternalFPML.g:2489:3: ruleFunctionValue
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
                    // InternalFPML.g:2494:2: ( rulePureProdValue )
                    {
                    // InternalFPML.g:2494:2: ( rulePureProdValue )
                    // InternalFPML.g:2495:3: rulePureProdValue
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
    // InternalFPML.g:2504:1: rule__PureSumValue__Alternatives : ( ( ( rule__PureSumValue__Group_0__0 ) ) | ( ( rule__PureSumValue__Group_1__0 ) ) );
    public final void rule__PureSumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2508:1: ( ( ( rule__PureSumValue__Group_0__0 ) ) | ( ( rule__PureSumValue__Group_1__0 ) ) )
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
                    // InternalFPML.g:2509:2: ( ( rule__PureSumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2509:2: ( ( rule__PureSumValue__Group_0__0 ) )
                    // InternalFPML.g:2510:3: ( rule__PureSumValue__Group_0__0 )
                    {
                     before(grammarAccess.getPureSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:2511:3: ( rule__PureSumValue__Group_0__0 )
                    // InternalFPML.g:2511:4: rule__PureSumValue__Group_0__0
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
                    // InternalFPML.g:2515:2: ( ( rule__PureSumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:2515:2: ( ( rule__PureSumValue__Group_1__0 ) )
                    // InternalFPML.g:2516:3: ( rule__PureSumValue__Group_1__0 )
                    {
                     before(grammarAccess.getPureSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:2517:3: ( rule__PureSumValue__Group_1__0 )
                    // InternalFPML.g:2517:4: rule__PureSumValue__Group_1__0
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
    // InternalFPML.g:2525:1: rule__EffectFullAdtValue__Alternatives : ( ( ( rule__EffectFullAdtValue__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullProdValue ) | ( ruleEffectFullValueRef ) | ( ruleEffectFullSumValue ) );
    public final void rule__EffectFullAdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2529:1: ( ( ( rule__EffectFullAdtValue__Group_0__0 ) ) | ( ruleUnitValue ) | ( ruleEffectFullFunctionValue ) | ( ruleEffectFullProdValue ) | ( ruleEffectFullValueRef ) | ( ruleEffectFullSumValue ) )
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
            case 48:
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
                    // InternalFPML.g:2530:2: ( ( rule__EffectFullAdtValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2530:2: ( ( rule__EffectFullAdtValue__Group_0__0 ) )
                    // InternalFPML.g:2531:3: ( rule__EffectFullAdtValue__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullAdtValueAccess().getGroup_0()); 
                    // InternalFPML.g:2532:3: ( rule__EffectFullAdtValue__Group_0__0 )
                    // InternalFPML.g:2532:4: rule__EffectFullAdtValue__Group_0__0
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
                    // InternalFPML.g:2536:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:2536:2: ( ruleUnitValue )
                    // InternalFPML.g:2537:3: ruleUnitValue
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
                    // InternalFPML.g:2542:2: ( ruleEffectFullFunctionValue )
                    {
                    // InternalFPML.g:2542:2: ( ruleEffectFullFunctionValue )
                    // InternalFPML.g:2543:3: ruleEffectFullFunctionValue
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
                    // InternalFPML.g:2548:2: ( ruleEffectFullProdValue )
                    {
                    // InternalFPML.g:2548:2: ( ruleEffectFullProdValue )
                    // InternalFPML.g:2549:3: ruleEffectFullProdValue
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
                    // InternalFPML.g:2554:2: ( ruleEffectFullValueRef )
                    {
                    // InternalFPML.g:2554:2: ( ruleEffectFullValueRef )
                    // InternalFPML.g:2555:3: ruleEffectFullValueRef
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
                    // InternalFPML.g:2560:2: ( ruleEffectFullSumValue )
                    {
                    // InternalFPML.g:2560:2: ( ruleEffectFullSumValue )
                    // InternalFPML.g:2561:3: ruleEffectFullSumValue
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
    // InternalFPML.g:2570:1: rule__EffectFullSumValue__Alternatives : ( ( ( rule__EffectFullSumValue__Group_0__0 ) ) | ( ( rule__EffectFullSumValue__Group_1__0 ) ) );
    public final void rule__EffectFullSumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2574:1: ( ( ( rule__EffectFullSumValue__Group_0__0 ) ) | ( ( rule__EffectFullSumValue__Group_1__0 ) ) )
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
                    // InternalFPML.g:2575:2: ( ( rule__EffectFullSumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:2575:2: ( ( rule__EffectFullSumValue__Group_0__0 ) )
                    // InternalFPML.g:2576:3: ( rule__EffectFullSumValue__Group_0__0 )
                    {
                     before(grammarAccess.getEffectFullSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:2577:3: ( rule__EffectFullSumValue__Group_0__0 )
                    // InternalFPML.g:2577:4: rule__EffectFullSumValue__Group_0__0
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
                    // InternalFPML.g:2581:2: ( ( rule__EffectFullSumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:2581:2: ( ( rule__EffectFullSumValue__Group_1__0 ) )
                    // InternalFPML.g:2582:3: ( rule__EffectFullSumValue__Group_1__0 )
                    {
                     before(grammarAccess.getEffectFullSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:2583:3: ( rule__EffectFullSumValue__Group_1__0 )
                    // InternalFPML.g:2583:4: rule__EffectFullSumValue__Group_1__0
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
    // InternalFPML.g:2591:1: rule__PrimitivePureFunction__Alternatives : ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) );
    public final void rule__PrimitivePureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2595:1: ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) )
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
                    // InternalFPML.g:2596:2: ( ruleIntToString )
                    {
                    // InternalFPML.g:2596:2: ( ruleIntToString )
                    // InternalFPML.g:2597:3: ruleIntToString
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
                    // InternalFPML.g:2602:2: ( ruleIntPow )
                    {
                    // InternalFPML.g:2602:2: ( ruleIntPow )
                    // InternalFPML.g:2603:3: ruleIntPow
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
                    // InternalFPML.g:2608:2: ( rulePlus )
                    {
                    // InternalFPML.g:2608:2: ( rulePlus )
                    // InternalFPML.g:2609:3: rulePlus
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
                    // InternalFPML.g:2614:2: ( ruleMinus )
                    {
                    // InternalFPML.g:2614:2: ( ruleMinus )
                    // InternalFPML.g:2615:3: ruleMinus
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
                    // InternalFPML.g:2620:2: ( ruleTimes )
                    {
                    // InternalFPML.g:2620:2: ( ruleTimes )
                    // InternalFPML.g:2621:3: ruleTimes
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
                    // InternalFPML.g:2626:2: ( ruleMod )
                    {
                    // InternalFPML.g:2626:2: ( ruleMod )
                    // InternalFPML.g:2627:3: ruleMod
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
                    // InternalFPML.g:2632:2: ( ruleApplyF )
                    {
                    // InternalFPML.g:2632:2: ( ruleApplyF )
                    // InternalFPML.g:2633:3: ruleApplyF
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
    // InternalFPML.g:2642:1: rule__PrimitiveEffectFullFunction__Alternatives : ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) );
    public final void rule__PrimitiveEffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2646:1: ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            else if ( (LA24_0==48) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2647:2: ( rulePrimitivePrint )
                    {
                    // InternalFPML.g:2647:2: ( rulePrimitivePrint )
                    // InternalFPML.g:2648:3: rulePrimitivePrint
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
                    // InternalFPML.g:2653:2: ( ruleApplyFIO )
                    {
                    // InternalFPML.g:2653:2: ( ruleApplyFIO )
                    // InternalFPML.g:2654:3: ruleApplyFIO
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


    // $ANTLR start "rule__ApplyFIOFactor__Alternatives"
    // InternalFPML.g:2663:1: rule__ApplyFIOFactor__Alternatives : ( ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) ) | ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) ) );
    public final void rule__ApplyFIOFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2667:1: ( ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) ) | ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==47) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2668:2: ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) )
                    {
                    // InternalFPML.g:2668:2: ( ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 ) )
                    // InternalFPML.g:2669:3: ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 )
                    {
                     before(grammarAccess.getApplyFIOFactorAccess().getValueReferenceAssignment_0()); 
                    // InternalFPML.g:2670:3: ( rule__ApplyFIOFactor__ValueReferenceAssignment_0 )
                    // InternalFPML.g:2670:4: rule__ApplyFIOFactor__ValueReferenceAssignment_0
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
                    // InternalFPML.g:2674:2: ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) )
                    {
                    // InternalFPML.g:2674:2: ( ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 ) )
                    // InternalFPML.g:2675:3: ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 )
                    {
                     before(grammarAccess.getApplyFIOFactorAccess().getValuePrimitiveAssignment_1()); 
                    // InternalFPML.g:2676:3: ( rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 )
                    // InternalFPML.g:2676:4: rule__ApplyFIOFactor__ValuePrimitiveAssignment_1
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
    // InternalFPML.g:2684:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2688:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:2689:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:2696:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2700:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:2701:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:2701:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:2702:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:2703:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:2703:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:2711:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2715:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:2716:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:2722:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2726:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:2727:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:2727:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:2728:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:2729:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:2729:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:2738:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2742:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:2743:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:2750:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2754:1: ( ( 'Pure' ) )
            // InternalFPML.g:2755:1: ( 'Pure' )
            {
            // InternalFPML.g:2755:1: ( 'Pure' )
            // InternalFPML.g:2756:2: 'Pure'
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
    // InternalFPML.g:2765:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2769:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:2770:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:2777:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2781:1: ( ( '{' ) )
            // InternalFPML.g:2782:1: ( '{' )
            {
            // InternalFPML.g:2782:1: ( '{' )
            // InternalFPML.g:2783:2: '{'
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
    // InternalFPML.g:2792:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2796:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:2797:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:2804:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2808:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:2809:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:2809:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:2810:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2811:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:2811:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:2819:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2823:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:2824:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:2831:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2835:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:2836:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:2836:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:2837:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:2838:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:2838:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:2846:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2850:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:2851:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:2857:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2861:1: ( ( '}' ) )
            // InternalFPML.g:2862:1: ( '}' )
            {
            // InternalFPML.g:2862:1: ( '}' )
            // InternalFPML.g:2863:2: '}'
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
    // InternalFPML.g:2873:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2877:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:2878:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:2885:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2889:1: ( ( 'Functions' ) )
            // InternalFPML.g:2890:1: ( 'Functions' )
            {
            // InternalFPML.g:2890:1: ( 'Functions' )
            // InternalFPML.g:2891:2: 'Functions'
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
    // InternalFPML.g:2900:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2904:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:2905:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:2912:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2916:1: ( ( '{' ) )
            // InternalFPML.g:2917:1: ( '{' )
            {
            // InternalFPML.g:2917:1: ( '{' )
            // InternalFPML.g:2918:2: '{'
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
    // InternalFPML.g:2927:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2931:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:2932:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:2939:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2943:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2944:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2944:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2945:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2946:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFPML.g:2946:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalFPML.g:2954:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2958:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:2959:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:2965:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2969:1: ( ( '}' ) )
            // InternalFPML.g:2970:1: ( '}' )
            {
            // InternalFPML.g:2970:1: ( '}' )
            // InternalFPML.g:2971:2: '}'
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
    // InternalFPML.g:2981:1: rule__PureDataBlock__Group__0 : rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1 ;
    public final void rule__PureDataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2985:1: ( rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1 )
            // InternalFPML.g:2986:2: rule__PureDataBlock__Group__0__Impl rule__PureDataBlock__Group__1
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
    // InternalFPML.g:2993:1: rule__PureDataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__PureDataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2997:1: ( ( 'Data' ) )
            // InternalFPML.g:2998:1: ( 'Data' )
            {
            // InternalFPML.g:2998:1: ( 'Data' )
            // InternalFPML.g:2999:2: 'Data'
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
    // InternalFPML.g:3008:1: rule__PureDataBlock__Group__1 : rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2 ;
    public final void rule__PureDataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3012:1: ( rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2 )
            // InternalFPML.g:3013:2: rule__PureDataBlock__Group__1__Impl rule__PureDataBlock__Group__2
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
    // InternalFPML.g:3020:1: rule__PureDataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureDataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3024:1: ( ( '{' ) )
            // InternalFPML.g:3025:1: ( '{' )
            {
            // InternalFPML.g:3025:1: ( '{' )
            // InternalFPML.g:3026:2: '{'
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
    // InternalFPML.g:3035:1: rule__PureDataBlock__Group__2 : rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3 ;
    public final void rule__PureDataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3039:1: ( rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3 )
            // InternalFPML.g:3040:2: rule__PureDataBlock__Group__2__Impl rule__PureDataBlock__Group__3
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
    // InternalFPML.g:3047:1: rule__PureDataBlock__Group__2__Impl : ( ( rule__PureDataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__PureDataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3051:1: ( ( ( rule__PureDataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3052:1: ( ( rule__PureDataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3052:1: ( ( rule__PureDataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3053:2: ( rule__PureDataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPureDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3054:2: ( rule__PureDataBlock__ElementsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFPML.g:3054:3: rule__PureDataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PureDataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalFPML.g:3062:1: rule__PureDataBlock__Group__3 : rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4 ;
    public final void rule__PureDataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3066:1: ( rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4 )
            // InternalFPML.g:3067:2: rule__PureDataBlock__Group__3__Impl rule__PureDataBlock__Group__4
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
    // InternalFPML.g:3074:1: rule__PureDataBlock__Group__3__Impl : ( ( rule__PureDataBlock__ValueAssignment_3 ) ) ;
    public final void rule__PureDataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3078:1: ( ( ( rule__PureDataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:3079:1: ( ( rule__PureDataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3079:1: ( ( rule__PureDataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:3080:2: ( rule__PureDataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getPureDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:3081:2: ( rule__PureDataBlock__ValueAssignment_3 )
            // InternalFPML.g:3081:3: rule__PureDataBlock__ValueAssignment_3
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
    // InternalFPML.g:3089:1: rule__PureDataBlock__Group__4 : rule__PureDataBlock__Group__4__Impl ;
    public final void rule__PureDataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3093:1: ( rule__PureDataBlock__Group__4__Impl )
            // InternalFPML.g:3094:2: rule__PureDataBlock__Group__4__Impl
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
    // InternalFPML.g:3100:1: rule__PureDataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureDataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3104:1: ( ( '}' ) )
            // InternalFPML.g:3105:1: ( '}' )
            {
            // InternalFPML.g:3105:1: ( '}' )
            // InternalFPML.g:3106:2: '}'
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
    // InternalFPML.g:3116:1: rule__PureValueBlock__Group__0 : rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1 ;
    public final void rule__PureValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3120:1: ( rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1 )
            // InternalFPML.g:3121:2: rule__PureValueBlock__Group__0__Impl rule__PureValueBlock__Group__1
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
    // InternalFPML.g:3128:1: rule__PureValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__PureValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3132:1: ( ( 'Value' ) )
            // InternalFPML.g:3133:1: ( 'Value' )
            {
            // InternalFPML.g:3133:1: ( 'Value' )
            // InternalFPML.g:3134:2: 'Value'
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
    // InternalFPML.g:3143:1: rule__PureValueBlock__Group__1 : rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2 ;
    public final void rule__PureValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3147:1: ( rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2 )
            // InternalFPML.g:3148:2: rule__PureValueBlock__Group__1__Impl rule__PureValueBlock__Group__2
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
    // InternalFPML.g:3155:1: rule__PureValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3159:1: ( ( '{' ) )
            // InternalFPML.g:3160:1: ( '{' )
            {
            // InternalFPML.g:3160:1: ( '{' )
            // InternalFPML.g:3161:2: '{'
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
    // InternalFPML.g:3170:1: rule__PureValueBlock__Group__2 : rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3 ;
    public final void rule__PureValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3174:1: ( rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3 )
            // InternalFPML.g:3175:2: rule__PureValueBlock__Group__2__Impl rule__PureValueBlock__Group__3
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
    // InternalFPML.g:3182:1: rule__PureValueBlock__Group__2__Impl : ( ( rule__PureValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__PureValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3186:1: ( ( ( rule__PureValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3187:1: ( ( rule__PureValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3187:1: ( ( rule__PureValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3188:2: ( rule__PureValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPureValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3189:2: ( rule__PureValueBlock__ElementsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFPML.g:3189:3: rule__PureValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PureValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalFPML.g:3197:1: rule__PureValueBlock__Group__3 : rule__PureValueBlock__Group__3__Impl ;
    public final void rule__PureValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3201:1: ( rule__PureValueBlock__Group__3__Impl )
            // InternalFPML.g:3202:2: rule__PureValueBlock__Group__3__Impl
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
    // InternalFPML.g:3208:1: rule__PureValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3212:1: ( ( '}' ) )
            // InternalFPML.g:3213:1: ( '}' )
            {
            // InternalFPML.g:3213:1: ( '}' )
            // InternalFPML.g:3214:2: '}'
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
    // InternalFPML.g:3224:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3228:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:3229:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:3236:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3240:1: ( ( 'Effects' ) )
            // InternalFPML.g:3241:1: ( 'Effects' )
            {
            // InternalFPML.g:3241:1: ( 'Effects' )
            // InternalFPML.g:3242:2: 'Effects'
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
    // InternalFPML.g:3251:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3255:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:3256:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
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
    // InternalFPML.g:3263:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3267:1: ( ( '{' ) )
            // InternalFPML.g:3268:1: ( '{' )
            {
            // InternalFPML.g:3268:1: ( '{' )
            // InternalFPML.g:3269:2: '{'
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
    // InternalFPML.g:3278:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3282:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:3283:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
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
    // InternalFPML.g:3290:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__ElementsAssignment_2 ) ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3294:1: ( ( ( rule__EffectFullBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:3295:1: ( ( rule__EffectFullBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:3295:1: ( ( rule__EffectFullBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:3296:2: ( rule__EffectFullBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3297:2: ( rule__EffectFullBlock__ElementsAssignment_2 )
            // InternalFPML.g:3297:3: rule__EffectFullBlock__ElementsAssignment_2
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
    // InternalFPML.g:3305:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3309:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:3310:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:3317:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__ElementsAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3321:1: ( ( ( rule__EffectFullBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:3322:1: ( ( rule__EffectFullBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:3322:1: ( ( rule__EffectFullBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:3323:2: ( rule__EffectFullBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:3324:2: ( rule__EffectFullBlock__ElementsAssignment_3 )
            // InternalFPML.g:3324:3: rule__EffectFullBlock__ElementsAssignment_3
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
    // InternalFPML.g:3332:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3336:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:3337:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:3343:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3347:1: ( ( '}' ) )
            // InternalFPML.g:3348:1: ( '}' )
            {
            // InternalFPML.g:3348:1: ( '}' )
            // InternalFPML.g:3349:2: '}'
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
    // InternalFPML.g:3359:1: rule__EffectFullDataBlock__Group__0 : rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1 ;
    public final void rule__EffectFullDataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3363:1: ( rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1 )
            // InternalFPML.g:3364:2: rule__EffectFullDataBlock__Group__0__Impl rule__EffectFullDataBlock__Group__1
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
    // InternalFPML.g:3371:1: rule__EffectFullDataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__EffectFullDataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3375:1: ( ( 'Data' ) )
            // InternalFPML.g:3376:1: ( 'Data' )
            {
            // InternalFPML.g:3376:1: ( 'Data' )
            // InternalFPML.g:3377:2: 'Data'
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
    // InternalFPML.g:3386:1: rule__EffectFullDataBlock__Group__1 : rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2 ;
    public final void rule__EffectFullDataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3390:1: ( rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2 )
            // InternalFPML.g:3391:2: rule__EffectFullDataBlock__Group__1__Impl rule__EffectFullDataBlock__Group__2
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
    // InternalFPML.g:3398:1: rule__EffectFullDataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullDataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3402:1: ( ( '{' ) )
            // InternalFPML.g:3403:1: ( '{' )
            {
            // InternalFPML.g:3403:1: ( '{' )
            // InternalFPML.g:3404:2: '{'
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
    // InternalFPML.g:3413:1: rule__EffectFullDataBlock__Group__2 : rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3 ;
    public final void rule__EffectFullDataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3417:1: ( rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3 )
            // InternalFPML.g:3418:2: rule__EffectFullDataBlock__Group__2__Impl rule__EffectFullDataBlock__Group__3
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
    // InternalFPML.g:3425:1: rule__EffectFullDataBlock__Group__2__Impl : ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__EffectFullDataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3429:1: ( ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3430:1: ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3430:1: ( ( rule__EffectFullDataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3431:2: ( rule__EffectFullDataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3432:2: ( rule__EffectFullDataBlock__ElementsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFPML.g:3432:3: rule__EffectFullDataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EffectFullDataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalFPML.g:3440:1: rule__EffectFullDataBlock__Group__3 : rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4 ;
    public final void rule__EffectFullDataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3444:1: ( rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4 )
            // InternalFPML.g:3445:2: rule__EffectFullDataBlock__Group__3__Impl rule__EffectFullDataBlock__Group__4
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
    // InternalFPML.g:3452:1: rule__EffectFullDataBlock__Group__3__Impl : ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullDataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3456:1: ( ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:3457:1: ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3457:1: ( ( rule__EffectFullDataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:3458:2: ( rule__EffectFullDataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:3459:2: ( rule__EffectFullDataBlock__ValueAssignment_3 )
            // InternalFPML.g:3459:3: rule__EffectFullDataBlock__ValueAssignment_3
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
    // InternalFPML.g:3467:1: rule__EffectFullDataBlock__Group__4 : rule__EffectFullDataBlock__Group__4__Impl ;
    public final void rule__EffectFullDataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3471:1: ( rule__EffectFullDataBlock__Group__4__Impl )
            // InternalFPML.g:3472:2: rule__EffectFullDataBlock__Group__4__Impl
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
    // InternalFPML.g:3478:1: rule__EffectFullDataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullDataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3482:1: ( ( '}' ) )
            // InternalFPML.g:3483:1: ( '}' )
            {
            // InternalFPML.g:3483:1: ( '}' )
            // InternalFPML.g:3484:2: '}'
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
    // InternalFPML.g:3494:1: rule__EffectFullValueBlock__Group__0 : rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1 ;
    public final void rule__EffectFullValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3498:1: ( rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1 )
            // InternalFPML.g:3499:2: rule__EffectFullValueBlock__Group__0__Impl rule__EffectFullValueBlock__Group__1
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
    // InternalFPML.g:3506:1: rule__EffectFullValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__EffectFullValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3510:1: ( ( 'Value' ) )
            // InternalFPML.g:3511:1: ( 'Value' )
            {
            // InternalFPML.g:3511:1: ( 'Value' )
            // InternalFPML.g:3512:2: 'Value'
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
    // InternalFPML.g:3521:1: rule__EffectFullValueBlock__Group__1 : rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2 ;
    public final void rule__EffectFullValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3525:1: ( rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2 )
            // InternalFPML.g:3526:2: rule__EffectFullValueBlock__Group__1__Impl rule__EffectFullValueBlock__Group__2
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
    // InternalFPML.g:3533:1: rule__EffectFullValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3537:1: ( ( '{' ) )
            // InternalFPML.g:3538:1: ( '{' )
            {
            // InternalFPML.g:3538:1: ( '{' )
            // InternalFPML.g:3539:2: '{'
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
    // InternalFPML.g:3548:1: rule__EffectFullValueBlock__Group__2 : rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3 ;
    public final void rule__EffectFullValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3552:1: ( rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3 )
            // InternalFPML.g:3553:2: rule__EffectFullValueBlock__Group__2__Impl rule__EffectFullValueBlock__Group__3
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
    // InternalFPML.g:3560:1: rule__EffectFullValueBlock__Group__2__Impl : ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__EffectFullValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3564:1: ( ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:3565:1: ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:3565:1: ( ( rule__EffectFullValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:3566:2: ( rule__EffectFullValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEffectFullValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:3567:2: ( rule__EffectFullValueBlock__ElementsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFPML.g:3567:3: rule__EffectFullValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EffectFullValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalFPML.g:3575:1: rule__EffectFullValueBlock__Group__3 : rule__EffectFullValueBlock__Group__3__Impl ;
    public final void rule__EffectFullValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3579:1: ( rule__EffectFullValueBlock__Group__3__Impl )
            // InternalFPML.g:3580:2: rule__EffectFullValueBlock__Group__3__Impl
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
    // InternalFPML.g:3586:1: rule__EffectFullValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__EffectFullValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3590:1: ( ( '}' ) )
            // InternalFPML.g:3591:1: ( '}' )
            {
            // InternalFPML.g:3591:1: ( '}' )
            // InternalFPML.g:3592:2: '}'
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
    // InternalFPML.g:3602:1: rule__EffectFullFunctionBlock__Group__0 : rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1 ;
    public final void rule__EffectFullFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3606:1: ( rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1 )
            // InternalFPML.g:3607:2: rule__EffectFullFunctionBlock__Group__0__Impl rule__EffectFullFunctionBlock__Group__1
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
    // InternalFPML.g:3614:1: rule__EffectFullFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__EffectFullFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3618:1: ( ( 'Functions' ) )
            // InternalFPML.g:3619:1: ( 'Functions' )
            {
            // InternalFPML.g:3619:1: ( 'Functions' )
            // InternalFPML.g:3620:2: 'Functions'
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
    // InternalFPML.g:3629:1: rule__EffectFullFunctionBlock__Group__1 : rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2 ;
    public final void rule__EffectFullFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3633:1: ( rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2 )
            // InternalFPML.g:3634:2: rule__EffectFullFunctionBlock__Group__1__Impl rule__EffectFullFunctionBlock__Group__2
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
    // InternalFPML.g:3641:1: rule__EffectFullFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3645:1: ( ( '{' ) )
            // InternalFPML.g:3646:1: ( '{' )
            {
            // InternalFPML.g:3646:1: ( '{' )
            // InternalFPML.g:3647:2: '{'
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
    // InternalFPML.g:3656:1: rule__EffectFullFunctionBlock__Group__2 : rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3 ;
    public final void rule__EffectFullFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3660:1: ( rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3 )
            // InternalFPML.g:3661:2: rule__EffectFullFunctionBlock__Group__2__Impl rule__EffectFullFunctionBlock__Group__3
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
    // InternalFPML.g:3668:1: rule__EffectFullFunctionBlock__Group__2__Impl : ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3672:1: ( ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:3673:1: ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:3673:1: ( ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:3674:2: ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:3675:2: ( rule__EffectFullFunctionBlock__FeaturesAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFPML.g:3675:3: rule__EffectFullFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalFPML.g:3683:1: rule__EffectFullFunctionBlock__Group__3 : rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4 ;
    public final void rule__EffectFullFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3687:1: ( rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4 )
            // InternalFPML.g:3688:2: rule__EffectFullFunctionBlock__Group__3__Impl rule__EffectFullFunctionBlock__Group__4
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
    // InternalFPML.g:3695:1: rule__EffectFullFunctionBlock__Group__3__Impl : ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3699:1: ( ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:3700:1: ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:3700:1: ( ( rule__EffectFullFunctionBlock__MainAssignment_3 ) )
            // InternalFPML.g:3701:2: ( rule__EffectFullFunctionBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:3702:2: ( rule__EffectFullFunctionBlock__MainAssignment_3 )
            // InternalFPML.g:3702:3: rule__EffectFullFunctionBlock__MainAssignment_3
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
    // InternalFPML.g:3710:1: rule__EffectFullFunctionBlock__Group__4 : rule__EffectFullFunctionBlock__Group__4__Impl ;
    public final void rule__EffectFullFunctionBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3714:1: ( rule__EffectFullFunctionBlock__Group__4__Impl )
            // InternalFPML.g:3715:2: rule__EffectFullFunctionBlock__Group__4__Impl
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
    // InternalFPML.g:3721:1: rule__EffectFullFunctionBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3725:1: ( ( '}' ) )
            // InternalFPML.g:3726:1: ( '}' )
            {
            // InternalFPML.g:3726:1: ( '}' )
            // InternalFPML.g:3727:2: '}'
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
    // InternalFPML.g:3737:1: rule__PureData__Group__0 : rule__PureData__Group__0__Impl rule__PureData__Group__1 ;
    public final void rule__PureData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3741:1: ( rule__PureData__Group__0__Impl rule__PureData__Group__1 )
            // InternalFPML.g:3742:2: rule__PureData__Group__0__Impl rule__PureData__Group__1
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
    // InternalFPML.g:3749:1: rule__PureData__Group__0__Impl : ( ( rule__PureData__NameAssignment_0 ) ) ;
    public final void rule__PureData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3753:1: ( ( ( rule__PureData__NameAssignment_0 ) ) )
            // InternalFPML.g:3754:1: ( ( rule__PureData__NameAssignment_0 ) )
            {
            // InternalFPML.g:3754:1: ( ( rule__PureData__NameAssignment_0 ) )
            // InternalFPML.g:3755:2: ( rule__PureData__NameAssignment_0 )
            {
             before(grammarAccess.getPureDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:3756:2: ( rule__PureData__NameAssignment_0 )
            // InternalFPML.g:3756:3: rule__PureData__NameAssignment_0
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
    // InternalFPML.g:3764:1: rule__PureData__Group__1 : rule__PureData__Group__1__Impl rule__PureData__Group__2 ;
    public final void rule__PureData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3768:1: ( rule__PureData__Group__1__Impl rule__PureData__Group__2 )
            // InternalFPML.g:3769:2: rule__PureData__Group__1__Impl rule__PureData__Group__2
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
    // InternalFPML.g:3776:1: rule__PureData__Group__1__Impl : ( ':' ) ;
    public final void rule__PureData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3780:1: ( ( ':' ) )
            // InternalFPML.g:3781:1: ( ':' )
            {
            // InternalFPML.g:3781:1: ( ':' )
            // InternalFPML.g:3782:2: ':'
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
    // InternalFPML.g:3791:1: rule__PureData__Group__2 : rule__PureData__Group__2__Impl ;
    public final void rule__PureData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3795:1: ( rule__PureData__Group__2__Impl )
            // InternalFPML.g:3796:2: rule__PureData__Group__2__Impl
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
    // InternalFPML.g:3802:1: rule__PureData__Group__2__Impl : ( ( rule__PureData__ContentAssignment_2 ) ) ;
    public final void rule__PureData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3806:1: ( ( ( rule__PureData__ContentAssignment_2 ) ) )
            // InternalFPML.g:3807:1: ( ( rule__PureData__ContentAssignment_2 ) )
            {
            // InternalFPML.g:3807:1: ( ( rule__PureData__ContentAssignment_2 ) )
            // InternalFPML.g:3808:2: ( rule__PureData__ContentAssignment_2 )
            {
             before(grammarAccess.getPureDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:3809:2: ( rule__PureData__ContentAssignment_2 )
            // InternalFPML.g:3809:3: rule__PureData__ContentAssignment_2
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
    // InternalFPML.g:3818:1: rule__PureValue__Group__0 : rule__PureValue__Group__0__Impl rule__PureValue__Group__1 ;
    public final void rule__PureValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3822:1: ( rule__PureValue__Group__0__Impl rule__PureValue__Group__1 )
            // InternalFPML.g:3823:2: rule__PureValue__Group__0__Impl rule__PureValue__Group__1
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
    // InternalFPML.g:3830:1: rule__PureValue__Group__0__Impl : ( () ) ;
    public final void rule__PureValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3834:1: ( ( () ) )
            // InternalFPML.g:3835:1: ( () )
            {
            // InternalFPML.g:3835:1: ( () )
            // InternalFPML.g:3836:2: ()
            {
             before(grammarAccess.getPureValueAccess().getPureValueAction_0()); 
            // InternalFPML.g:3837:2: ()
            // InternalFPML.g:3837:3: 
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
    // InternalFPML.g:3845:1: rule__PureValue__Group__1 : rule__PureValue__Group__1__Impl rule__PureValue__Group__2 ;
    public final void rule__PureValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3849:1: ( rule__PureValue__Group__1__Impl rule__PureValue__Group__2 )
            // InternalFPML.g:3850:2: rule__PureValue__Group__1__Impl rule__PureValue__Group__2
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
    // InternalFPML.g:3857:1: rule__PureValue__Group__1__Impl : ( ( rule__PureValue__NameAssignment_1 ) ) ;
    public final void rule__PureValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3861:1: ( ( ( rule__PureValue__NameAssignment_1 ) ) )
            // InternalFPML.g:3862:1: ( ( rule__PureValue__NameAssignment_1 ) )
            {
            // InternalFPML.g:3862:1: ( ( rule__PureValue__NameAssignment_1 ) )
            // InternalFPML.g:3863:2: ( rule__PureValue__NameAssignment_1 )
            {
             before(grammarAccess.getPureValueAccess().getNameAssignment_1()); 
            // InternalFPML.g:3864:2: ( rule__PureValue__NameAssignment_1 )
            // InternalFPML.g:3864:3: rule__PureValue__NameAssignment_1
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
    // InternalFPML.g:3872:1: rule__PureValue__Group__2 : rule__PureValue__Group__2__Impl rule__PureValue__Group__3 ;
    public final void rule__PureValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3876:1: ( rule__PureValue__Group__2__Impl rule__PureValue__Group__3 )
            // InternalFPML.g:3877:2: rule__PureValue__Group__2__Impl rule__PureValue__Group__3
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
    // InternalFPML.g:3884:1: rule__PureValue__Group__2__Impl : ( ':' ) ;
    public final void rule__PureValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3888:1: ( ( ':' ) )
            // InternalFPML.g:3889:1: ( ':' )
            {
            // InternalFPML.g:3889:1: ( ':' )
            // InternalFPML.g:3890:2: ':'
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
    // InternalFPML.g:3899:1: rule__PureValue__Group__3 : rule__PureValue__Group__3__Impl ;
    public final void rule__PureValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3903:1: ( rule__PureValue__Group__3__Impl )
            // InternalFPML.g:3904:2: rule__PureValue__Group__3__Impl
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
    // InternalFPML.g:3910:1: rule__PureValue__Group__3__Impl : ( ( rule__PureValue__ValueAssignment_3 ) ) ;
    public final void rule__PureValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3914:1: ( ( ( rule__PureValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:3915:1: ( ( rule__PureValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:3915:1: ( ( rule__PureValue__ValueAssignment_3 ) )
            // InternalFPML.g:3916:2: ( rule__PureValue__ValueAssignment_3 )
            {
             before(grammarAccess.getPureValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:3917:2: ( rule__PureValue__ValueAssignment_3 )
            // InternalFPML.g:3917:3: rule__PureValue__ValueAssignment_3
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
    // InternalFPML.g:3926:1: rule__PureAdtType__Group_1__0 : rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1 ;
    public final void rule__PureAdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3930:1: ( rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1 )
            // InternalFPML.g:3931:2: rule__PureAdtType__Group_1__0__Impl rule__PureAdtType__Group_1__1
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
    // InternalFPML.g:3938:1: rule__PureAdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__PureAdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3942:1: ( ( '[' ) )
            // InternalFPML.g:3943:1: ( '[' )
            {
            // InternalFPML.g:3943:1: ( '[' )
            // InternalFPML.g:3944:2: '['
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
    // InternalFPML.g:3953:1: rule__PureAdtType__Group_1__1 : rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2 ;
    public final void rule__PureAdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3957:1: ( rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2 )
            // InternalFPML.g:3958:2: rule__PureAdtType__Group_1__1__Impl rule__PureAdtType__Group_1__2
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
    // InternalFPML.g:3965:1: rule__PureAdtType__Group_1__1__Impl : ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) ) ;
    public final void rule__PureAdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3969:1: ( ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:3970:1: ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:3970:1: ( ( rule__PureAdtType__PureAdtElement1Assignment_1_1 ) )
            // InternalFPML.g:3971:2: ( rule__PureAdtType__PureAdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1Assignment_1_1()); 
            // InternalFPML.g:3972:2: ( rule__PureAdtType__PureAdtElement1Assignment_1_1 )
            // InternalFPML.g:3972:3: rule__PureAdtType__PureAdtElement1Assignment_1_1
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
    // InternalFPML.g:3980:1: rule__PureAdtType__Group_1__2 : rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3 ;
    public final void rule__PureAdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3984:1: ( rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3 )
            // InternalFPML.g:3985:2: rule__PureAdtType__Group_1__2__Impl rule__PureAdtType__Group_1__3
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
    // InternalFPML.g:3992:1: rule__PureAdtType__Group_1__2__Impl : ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) ) ;
    public final void rule__PureAdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3996:1: ( ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:3997:1: ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:3997:1: ( ( rule__PureAdtType__PureAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:3998:2: ( rule__PureAdtType__PureAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Assignment_1_2()); 
            // InternalFPML.g:3999:2: ( rule__PureAdtType__PureAdtElement2Assignment_1_2 )
            // InternalFPML.g:3999:3: rule__PureAdtType__PureAdtElement2Assignment_1_2
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
    // InternalFPML.g:4007:1: rule__PureAdtType__Group_1__3 : rule__PureAdtType__Group_1__3__Impl ;
    public final void rule__PureAdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4011:1: ( rule__PureAdtType__Group_1__3__Impl )
            // InternalFPML.g:4012:2: rule__PureAdtType__Group_1__3__Impl
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
    // InternalFPML.g:4018:1: rule__PureAdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PureAdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4022:1: ( ( ']' ) )
            // InternalFPML.g:4023:1: ( ']' )
            {
            // InternalFPML.g:4023:1: ( ']' )
            // InternalFPML.g:4024:2: ']'
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
    // InternalFPML.g:4034:1: rule__PureSumType__Group__0 : rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1 ;
    public final void rule__PureSumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4038:1: ( rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1 )
            // InternalFPML.g:4039:2: rule__PureSumType__Group__0__Impl rule__PureSumType__Group__1
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
    // InternalFPML.g:4046:1: rule__PureSumType__Group__0__Impl : ( '+' ) ;
    public final void rule__PureSumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4050:1: ( ( '+' ) )
            // InternalFPML.g:4051:1: ( '+' )
            {
            // InternalFPML.g:4051:1: ( '+' )
            // InternalFPML.g:4052:2: '+'
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
    // InternalFPML.g:4061:1: rule__PureSumType__Group__1 : rule__PureSumType__Group__1__Impl ;
    public final void rule__PureSumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4065:1: ( rule__PureSumType__Group__1__Impl )
            // InternalFPML.g:4066:2: rule__PureSumType__Group__1__Impl
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
    // InternalFPML.g:4072:1: rule__PureSumType__Group__1__Impl : ( ( rule__PureSumType__AdtElementAssignment_1 ) ) ;
    public final void rule__PureSumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4076:1: ( ( ( rule__PureSumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4077:1: ( ( rule__PureSumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4077:1: ( ( rule__PureSumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4078:2: ( rule__PureSumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getPureSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4079:2: ( rule__PureSumType__AdtElementAssignment_1 )
            // InternalFPML.g:4079:3: rule__PureSumType__AdtElementAssignment_1
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
    // InternalFPML.g:4088:1: rule__PureProdType__Group__0 : rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1 ;
    public final void rule__PureProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4092:1: ( rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1 )
            // InternalFPML.g:4093:2: rule__PureProdType__Group__0__Impl rule__PureProdType__Group__1
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
    // InternalFPML.g:4100:1: rule__PureProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__PureProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4104:1: ( ( '*' ) )
            // InternalFPML.g:4105:1: ( '*' )
            {
            // InternalFPML.g:4105:1: ( '*' )
            // InternalFPML.g:4106:2: '*'
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
    // InternalFPML.g:4115:1: rule__PureProdType__Group__1 : rule__PureProdType__Group__1__Impl ;
    public final void rule__PureProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4119:1: ( rule__PureProdType__Group__1__Impl )
            // InternalFPML.g:4120:2: rule__PureProdType__Group__1__Impl
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
    // InternalFPML.g:4126:1: rule__PureProdType__Group__1__Impl : ( ( rule__PureProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__PureProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4130:1: ( ( ( rule__PureProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4131:1: ( ( rule__PureProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4131:1: ( ( rule__PureProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4132:2: ( rule__PureProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getPureProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4133:2: ( rule__PureProdType__AdtElementAssignment_1 )
            // InternalFPML.g:4133:3: rule__PureProdType__AdtElementAssignment_1
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
    // InternalFPML.g:4142:1: rule__EffectFullData__Group__0 : rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1 ;
    public final void rule__EffectFullData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4146:1: ( rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1 )
            // InternalFPML.g:4147:2: rule__EffectFullData__Group__0__Impl rule__EffectFullData__Group__1
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
    // InternalFPML.g:4154:1: rule__EffectFullData__Group__0__Impl : ( ( rule__EffectFullData__NameAssignment_0 ) ) ;
    public final void rule__EffectFullData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4158:1: ( ( ( rule__EffectFullData__NameAssignment_0 ) ) )
            // InternalFPML.g:4159:1: ( ( rule__EffectFullData__NameAssignment_0 ) )
            {
            // InternalFPML.g:4159:1: ( ( rule__EffectFullData__NameAssignment_0 ) )
            // InternalFPML.g:4160:2: ( rule__EffectFullData__NameAssignment_0 )
            {
             before(grammarAccess.getEffectFullDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:4161:2: ( rule__EffectFullData__NameAssignment_0 )
            // InternalFPML.g:4161:3: rule__EffectFullData__NameAssignment_0
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
    // InternalFPML.g:4169:1: rule__EffectFullData__Group__1 : rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2 ;
    public final void rule__EffectFullData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4173:1: ( rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2 )
            // InternalFPML.g:4174:2: rule__EffectFullData__Group__1__Impl rule__EffectFullData__Group__2
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
    // InternalFPML.g:4181:1: rule__EffectFullData__Group__1__Impl : ( ':' ) ;
    public final void rule__EffectFullData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4185:1: ( ( ':' ) )
            // InternalFPML.g:4186:1: ( ':' )
            {
            // InternalFPML.g:4186:1: ( ':' )
            // InternalFPML.g:4187:2: ':'
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
    // InternalFPML.g:4196:1: rule__EffectFullData__Group__2 : rule__EffectFullData__Group__2__Impl ;
    public final void rule__EffectFullData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4200:1: ( rule__EffectFullData__Group__2__Impl )
            // InternalFPML.g:4201:2: rule__EffectFullData__Group__2__Impl
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
    // InternalFPML.g:4207:1: rule__EffectFullData__Group__2__Impl : ( ( rule__EffectFullData__ContentAssignment_2 ) ) ;
    public final void rule__EffectFullData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4211:1: ( ( ( rule__EffectFullData__ContentAssignment_2 ) ) )
            // InternalFPML.g:4212:1: ( ( rule__EffectFullData__ContentAssignment_2 ) )
            {
            // InternalFPML.g:4212:1: ( ( rule__EffectFullData__ContentAssignment_2 ) )
            // InternalFPML.g:4213:2: ( rule__EffectFullData__ContentAssignment_2 )
            {
             before(grammarAccess.getEffectFullDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:4214:2: ( rule__EffectFullData__ContentAssignment_2 )
            // InternalFPML.g:4214:3: rule__EffectFullData__ContentAssignment_2
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
    // InternalFPML.g:4223:1: rule__EffectFullValue__Group__0 : rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1 ;
    public final void rule__EffectFullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4227:1: ( rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1 )
            // InternalFPML.g:4228:2: rule__EffectFullValue__Group__0__Impl rule__EffectFullValue__Group__1
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
    // InternalFPML.g:4235:1: rule__EffectFullValue__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4239:1: ( ( () ) )
            // InternalFPML.g:4240:1: ( () )
            {
            // InternalFPML.g:4240:1: ( () )
            // InternalFPML.g:4241:2: ()
            {
             before(grammarAccess.getEffectFullValueAccess().getEffectFullValueAction_0()); 
            // InternalFPML.g:4242:2: ()
            // InternalFPML.g:4242:3: 
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
    // InternalFPML.g:4250:1: rule__EffectFullValue__Group__1 : rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2 ;
    public final void rule__EffectFullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4254:1: ( rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2 )
            // InternalFPML.g:4255:2: rule__EffectFullValue__Group__1__Impl rule__EffectFullValue__Group__2
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
    // InternalFPML.g:4262:1: rule__EffectFullValue__Group__1__Impl : ( ( rule__EffectFullValue__NameAssignment_1 ) ) ;
    public final void rule__EffectFullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4266:1: ( ( ( rule__EffectFullValue__NameAssignment_1 ) ) )
            // InternalFPML.g:4267:1: ( ( rule__EffectFullValue__NameAssignment_1 ) )
            {
            // InternalFPML.g:4267:1: ( ( rule__EffectFullValue__NameAssignment_1 ) )
            // InternalFPML.g:4268:2: ( rule__EffectFullValue__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullValueAccess().getNameAssignment_1()); 
            // InternalFPML.g:4269:2: ( rule__EffectFullValue__NameAssignment_1 )
            // InternalFPML.g:4269:3: rule__EffectFullValue__NameAssignment_1
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
    // InternalFPML.g:4277:1: rule__EffectFullValue__Group__2 : rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3 ;
    public final void rule__EffectFullValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4281:1: ( rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3 )
            // InternalFPML.g:4282:2: rule__EffectFullValue__Group__2__Impl rule__EffectFullValue__Group__3
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
    // InternalFPML.g:4289:1: rule__EffectFullValue__Group__2__Impl : ( ':' ) ;
    public final void rule__EffectFullValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4293:1: ( ( ':' ) )
            // InternalFPML.g:4294:1: ( ':' )
            {
            // InternalFPML.g:4294:1: ( ':' )
            // InternalFPML.g:4295:2: ':'
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
    // InternalFPML.g:4304:1: rule__EffectFullValue__Group__3 : rule__EffectFullValue__Group__3__Impl ;
    public final void rule__EffectFullValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4308:1: ( rule__EffectFullValue__Group__3__Impl )
            // InternalFPML.g:4309:2: rule__EffectFullValue__Group__3__Impl
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
    // InternalFPML.g:4315:1: rule__EffectFullValue__Group__3__Impl : ( ( rule__EffectFullValue__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4319:1: ( ( ( rule__EffectFullValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:4320:1: ( ( rule__EffectFullValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:4320:1: ( ( rule__EffectFullValue__ValueAssignment_3 ) )
            // InternalFPML.g:4321:2: ( rule__EffectFullValue__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:4322:2: ( rule__EffectFullValue__ValueAssignment_3 )
            // InternalFPML.g:4322:3: rule__EffectFullValue__ValueAssignment_3
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
    // InternalFPML.g:4331:1: rule__EffectFullAdtType__Group_1__0 : rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1 ;
    public final void rule__EffectFullAdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4335:1: ( rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1 )
            // InternalFPML.g:4336:2: rule__EffectFullAdtType__Group_1__0__Impl rule__EffectFullAdtType__Group_1__1
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
    // InternalFPML.g:4343:1: rule__EffectFullAdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__EffectFullAdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4347:1: ( ( '[' ) )
            // InternalFPML.g:4348:1: ( '[' )
            {
            // InternalFPML.g:4348:1: ( '[' )
            // InternalFPML.g:4349:2: '['
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
    // InternalFPML.g:4358:1: rule__EffectFullAdtType__Group_1__1 : rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2 ;
    public final void rule__EffectFullAdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4362:1: ( rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2 )
            // InternalFPML.g:4363:2: rule__EffectFullAdtType__Group_1__1__Impl rule__EffectFullAdtType__Group_1__2
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
    // InternalFPML.g:4370:1: rule__EffectFullAdtType__Group_1__1__Impl : ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) ) ;
    public final void rule__EffectFullAdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4374:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:4375:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:4375:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 ) )
            // InternalFPML.g:4376:2: ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1Assignment_1_1()); 
            // InternalFPML.g:4377:2: ( rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 )
            // InternalFPML.g:4377:3: rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1
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
    // InternalFPML.g:4385:1: rule__EffectFullAdtType__Group_1__2 : rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3 ;
    public final void rule__EffectFullAdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4389:1: ( rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3 )
            // InternalFPML.g:4390:2: rule__EffectFullAdtType__Group_1__2__Impl rule__EffectFullAdtType__Group_1__3
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
    // InternalFPML.g:4397:1: rule__EffectFullAdtType__Group_1__2__Impl : ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) ) ;
    public final void rule__EffectFullAdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4401:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:4402:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:4402:1: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:4403:2: ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Assignment_1_2()); 
            // InternalFPML.g:4404:2: ( rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 )
            // InternalFPML.g:4404:3: rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2
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
    // InternalFPML.g:4412:1: rule__EffectFullAdtType__Group_1__3 : rule__EffectFullAdtType__Group_1__3__Impl ;
    public final void rule__EffectFullAdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4416:1: ( rule__EffectFullAdtType__Group_1__3__Impl )
            // InternalFPML.g:4417:2: rule__EffectFullAdtType__Group_1__3__Impl
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
    // InternalFPML.g:4423:1: rule__EffectFullAdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__EffectFullAdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4427:1: ( ( ']' ) )
            // InternalFPML.g:4428:1: ( ']' )
            {
            // InternalFPML.g:4428:1: ( ']' )
            // InternalFPML.g:4429:2: ']'
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
    // InternalFPML.g:4439:1: rule__EffectFullSumType__Group__0 : rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1 ;
    public final void rule__EffectFullSumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4443:1: ( rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1 )
            // InternalFPML.g:4444:2: rule__EffectFullSumType__Group__0__Impl rule__EffectFullSumType__Group__1
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
    // InternalFPML.g:4451:1: rule__EffectFullSumType__Group__0__Impl : ( '+' ) ;
    public final void rule__EffectFullSumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4455:1: ( ( '+' ) )
            // InternalFPML.g:4456:1: ( '+' )
            {
            // InternalFPML.g:4456:1: ( '+' )
            // InternalFPML.g:4457:2: '+'
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
    // InternalFPML.g:4466:1: rule__EffectFullSumType__Group__1 : rule__EffectFullSumType__Group__1__Impl ;
    public final void rule__EffectFullSumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4470:1: ( rule__EffectFullSumType__Group__1__Impl )
            // InternalFPML.g:4471:2: rule__EffectFullSumType__Group__1__Impl
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
    // InternalFPML.g:4477:1: rule__EffectFullSumType__Group__1__Impl : ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) ) ;
    public final void rule__EffectFullSumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4481:1: ( ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4482:1: ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4482:1: ( ( rule__EffectFullSumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4483:2: ( rule__EffectFullSumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getEffectFullSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4484:2: ( rule__EffectFullSumType__AdtElementAssignment_1 )
            // InternalFPML.g:4484:3: rule__EffectFullSumType__AdtElementAssignment_1
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
    // InternalFPML.g:4493:1: rule__EffectFullProdType__Group__0 : rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1 ;
    public final void rule__EffectFullProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4497:1: ( rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1 )
            // InternalFPML.g:4498:2: rule__EffectFullProdType__Group__0__Impl rule__EffectFullProdType__Group__1
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
    // InternalFPML.g:4505:1: rule__EffectFullProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__EffectFullProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4509:1: ( ( '*' ) )
            // InternalFPML.g:4510:1: ( '*' )
            {
            // InternalFPML.g:4510:1: ( '*' )
            // InternalFPML.g:4511:2: '*'
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
    // InternalFPML.g:4520:1: rule__EffectFullProdType__Group__1 : rule__EffectFullProdType__Group__1__Impl ;
    public final void rule__EffectFullProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4524:1: ( rule__EffectFullProdType__Group__1__Impl )
            // InternalFPML.g:4525:2: rule__EffectFullProdType__Group__1__Impl
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
    // InternalFPML.g:4531:1: rule__EffectFullProdType__Group__1__Impl : ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__EffectFullProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4535:1: ( ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:4536:1: ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:4536:1: ( ( rule__EffectFullProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:4537:2: ( rule__EffectFullProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getEffectFullProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:4538:2: ( rule__EffectFullProdType__AdtElementAssignment_1 )
            // InternalFPML.g:4538:3: rule__EffectFullProdType__AdtElementAssignment_1
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
    // InternalFPML.g:4547:1: rule__PureFunctionDefinition__Group__0 : rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 ;
    public final void rule__PureFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4551:1: ( rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 )
            // InternalFPML.g:4552:2: rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1
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
    // InternalFPML.g:4559:1: rule__PureFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4563:1: ( ( 'def' ) )
            // InternalFPML.g:4564:1: ( 'def' )
            {
            // InternalFPML.g:4564:1: ( 'def' )
            // InternalFPML.g:4565:2: 'def'
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
    // InternalFPML.g:4574:1: rule__PureFunctionDefinition__Group__1 : rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 ;
    public final void rule__PureFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4578:1: ( rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 )
            // InternalFPML.g:4579:2: rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2
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
    // InternalFPML.g:4586:1: rule__PureFunctionDefinition__Group__1__Impl : ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4590:1: ( ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:4591:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:4591:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:4592:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:4593:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:4593:3: rule__PureFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:4601:1: rule__PureFunctionDefinition__Group__2 : rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 ;
    public final void rule__PureFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4605:1: ( rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 )
            // InternalFPML.g:4606:2: rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3
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
    // InternalFPML.g:4613:1: rule__PureFunctionDefinition__Group__2__Impl : ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__PureFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4617:1: ( ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:4618:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:4618:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:4619:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:4620:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:4620:3: rule__PureFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:4628:1: rule__PureFunctionDefinition__Group__3 : rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 ;
    public final void rule__PureFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4632:1: ( rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 )
            // InternalFPML.g:4633:2: rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4
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
    // InternalFPML.g:4640:1: rule__PureFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4644:1: ( ( '(' ) )
            // InternalFPML.g:4645:1: ( '(' )
            {
            // InternalFPML.g:4645:1: ( '(' )
            // InternalFPML.g:4646:2: '('
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
    // InternalFPML.g:4655:1: rule__PureFunctionDefinition__Group__4 : rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 ;
    public final void rule__PureFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4659:1: ( rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 )
            // InternalFPML.g:4660:2: rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5
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
    // InternalFPML.g:4667:1: rule__PureFunctionDefinition__Group__4__Impl : ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__PureFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4671:1: ( ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:4672:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:4672:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:4673:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:4674:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:4674:3: rule__PureFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:4682:1: rule__PureFunctionDefinition__Group__5 : rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 ;
    public final void rule__PureFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4686:1: ( rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 )
            // InternalFPML.g:4687:2: rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6
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
    // InternalFPML.g:4694:1: rule__PureFunctionDefinition__Group__5__Impl : ( ( rule__PureFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__PureFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4698:1: ( ( ( rule__PureFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:4699:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:4699:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:4700:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:4701:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFPML.g:4701:3: rule__PureFunctionDefinition__Group_5__0
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
    // InternalFPML.g:4709:1: rule__PureFunctionDefinition__Group__6 : rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 ;
    public final void rule__PureFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4713:1: ( rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 )
            // InternalFPML.g:4714:2: rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7
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
    // InternalFPML.g:4721:1: rule__PureFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__PureFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4725:1: ( ( ')' ) )
            // InternalFPML.g:4726:1: ( ')' )
            {
            // InternalFPML.g:4726:1: ( ')' )
            // InternalFPML.g:4727:2: ')'
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
    // InternalFPML.g:4736:1: rule__PureFunctionDefinition__Group__7 : rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 ;
    public final void rule__PureFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4740:1: ( rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 )
            // InternalFPML.g:4741:2: rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8
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
    // InternalFPML.g:4748:1: rule__PureFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__PureFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4752:1: ( ( ':' ) )
            // InternalFPML.g:4753:1: ( ':' )
            {
            // InternalFPML.g:4753:1: ( ':' )
            // InternalFPML.g:4754:2: ':'
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
    // InternalFPML.g:4763:1: rule__PureFunctionDefinition__Group__8 : rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 ;
    public final void rule__PureFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4767:1: ( rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 )
            // InternalFPML.g:4768:2: rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9
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
    // InternalFPML.g:4775:1: rule__PureFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__PureFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4779:1: ( ( '{' ) )
            // InternalFPML.g:4780:1: ( '{' )
            {
            // InternalFPML.g:4780:1: ( '{' )
            // InternalFPML.g:4781:2: '{'
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
    // InternalFPML.g:4790:1: rule__PureFunctionDefinition__Group__9 : rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 ;
    public final void rule__PureFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4794:1: ( rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 )
            // InternalFPML.g:4795:2: rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10
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
    // InternalFPML.g:4802:1: rule__PureFunctionDefinition__Group__9__Impl : ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__PureFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4806:1: ( ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:4807:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:4807:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:4808:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:4809:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:4809:3: rule__PureFunctionDefinition__FunctionBodyAssignment_9
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
    // InternalFPML.g:4817:1: rule__PureFunctionDefinition__Group__10 : rule__PureFunctionDefinition__Group__10__Impl ;
    public final void rule__PureFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4821:1: ( rule__PureFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:4822:2: rule__PureFunctionDefinition__Group__10__Impl
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
    // InternalFPML.g:4828:1: rule__PureFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__PureFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4832:1: ( ( '}' ) )
            // InternalFPML.g:4833:1: ( '}' )
            {
            // InternalFPML.g:4833:1: ( '}' )
            // InternalFPML.g:4834:2: '}'
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
    // InternalFPML.g:4844:1: rule__PureFunctionDefinition__Group_5__0 : rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 ;
    public final void rule__PureFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4848:1: ( rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 )
            // InternalFPML.g:4849:2: rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1
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
    // InternalFPML.g:4856:1: rule__PureFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__PureFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4860:1: ( ( ',' ) )
            // InternalFPML.g:4861:1: ( ',' )
            {
            // InternalFPML.g:4861:1: ( ',' )
            // InternalFPML.g:4862:2: ','
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
    // InternalFPML.g:4871:1: rule__PureFunctionDefinition__Group_5__1 : rule__PureFunctionDefinition__Group_5__1__Impl ;
    public final void rule__PureFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4875:1: ( rule__PureFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:4876:2: rule__PureFunctionDefinition__Group_5__1__Impl
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
    // InternalFPML.g:4882:1: rule__PureFunctionDefinition__Group_5__1__Impl : ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4886:1: ( ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) )
            // InternalFPML.g:4887:1: ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            {
            // InternalFPML.g:4887:1: ( ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            // InternalFPML.g:4888:2: ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 
            // InternalFPML.g:4889:2: ( rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 )
            // InternalFPML.g:4889:3: rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1
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
    // InternalFPML.g:4898:1: rule__EffectFullFunctionDefinition__Group__0 : rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 ;
    public final void rule__EffectFullFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4902:1: ( rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 )
            // InternalFPML.g:4903:2: rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1
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
    // InternalFPML.g:4910:1: rule__EffectFullFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4914:1: ( ( 'def' ) )
            // InternalFPML.g:4915:1: ( 'def' )
            {
            // InternalFPML.g:4915:1: ( 'def' )
            // InternalFPML.g:4916:2: 'def'
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
    // InternalFPML.g:4925:1: rule__EffectFullFunctionDefinition__Group__1 : rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 ;
    public final void rule__EffectFullFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4929:1: ( rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 )
            // InternalFPML.g:4930:2: rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2
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
    // InternalFPML.g:4937:1: rule__EffectFullFunctionDefinition__Group__1__Impl : ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4941:1: ( ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:4942:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:4942:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:4943:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:4944:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:4944:3: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:4952:1: rule__EffectFullFunctionDefinition__Group__2 : rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 ;
    public final void rule__EffectFullFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4956:1: ( rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 )
            // InternalFPML.g:4957:2: rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3
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
    // InternalFPML.g:4964:1: rule__EffectFullFunctionDefinition__Group__2__Impl : ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4968:1: ( ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:4969:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:4969:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:4970:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:4971:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:4971:3: rule__EffectFullFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:4979:1: rule__EffectFullFunctionDefinition__Group__3 : rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 ;
    public final void rule__EffectFullFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4983:1: ( rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 )
            // InternalFPML.g:4984:2: rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4
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
    // InternalFPML.g:4991:1: rule__EffectFullFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4995:1: ( ( '(' ) )
            // InternalFPML.g:4996:1: ( '(' )
            {
            // InternalFPML.g:4996:1: ( '(' )
            // InternalFPML.g:4997:2: '('
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
    // InternalFPML.g:5006:1: rule__EffectFullFunctionDefinition__Group__4 : rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 ;
    public final void rule__EffectFullFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5010:1: ( rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 )
            // InternalFPML.g:5011:2: rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5
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
    // InternalFPML.g:5018:1: rule__EffectFullFunctionDefinition__Group__4__Impl : ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5022:1: ( ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:5023:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:5023:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:5024:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:5025:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:5025:3: rule__EffectFullFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:5033:1: rule__EffectFullFunctionDefinition__Group__5 : rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 ;
    public final void rule__EffectFullFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5037:1: ( rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 )
            // InternalFPML.g:5038:2: rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6
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
    // InternalFPML.g:5045:1: rule__EffectFullFunctionDefinition__Group__5__Impl : ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__EffectFullFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5049:1: ( ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:5050:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:5050:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:5051:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:5052:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFPML.g:5052:3: rule__EffectFullFunctionDefinition__Group_5__0
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
    // InternalFPML.g:5060:1: rule__EffectFullFunctionDefinition__Group__6 : rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 ;
    public final void rule__EffectFullFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5064:1: ( rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 )
            // InternalFPML.g:5065:2: rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7
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
    // InternalFPML.g:5072:1: rule__EffectFullFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5076:1: ( ( ')' ) )
            // InternalFPML.g:5077:1: ( ')' )
            {
            // InternalFPML.g:5077:1: ( ')' )
            // InternalFPML.g:5078:2: ')'
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
    // InternalFPML.g:5087:1: rule__EffectFullFunctionDefinition__Group__7 : rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 ;
    public final void rule__EffectFullFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5091:1: ( rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 )
            // InternalFPML.g:5092:2: rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8
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
    // InternalFPML.g:5099:1: rule__EffectFullFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5103:1: ( ( ':' ) )
            // InternalFPML.g:5104:1: ( ':' )
            {
            // InternalFPML.g:5104:1: ( ':' )
            // InternalFPML.g:5105:2: ':'
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
    // InternalFPML.g:5114:1: rule__EffectFullFunctionDefinition__Group__8 : rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 ;
    public final void rule__EffectFullFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5118:1: ( rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 )
            // InternalFPML.g:5119:2: rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:5126:1: rule__EffectFullFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5130:1: ( ( '{' ) )
            // InternalFPML.g:5131:1: ( '{' )
            {
            // InternalFPML.g:5131:1: ( '{' )
            // InternalFPML.g:5132:2: '{'
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
    // InternalFPML.g:5141:1: rule__EffectFullFunctionDefinition__Group__9 : rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 ;
    public final void rule__EffectFullFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5145:1: ( rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 )
            // InternalFPML.g:5146:2: rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10
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
    // InternalFPML.g:5153:1: rule__EffectFullFunctionDefinition__Group__9__Impl : ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5157:1: ( ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:5158:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:5158:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:5159:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:5160:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:5160:3: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9
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
    // InternalFPML.g:5168:1: rule__EffectFullFunctionDefinition__Group__10 : rule__EffectFullFunctionDefinition__Group__10__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5172:1: ( rule__EffectFullFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:5173:2: rule__EffectFullFunctionDefinition__Group__10__Impl
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
    // InternalFPML.g:5179:1: rule__EffectFullFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5183:1: ( ( '}' ) )
            // InternalFPML.g:5184:1: ( '}' )
            {
            // InternalFPML.g:5184:1: ( '}' )
            // InternalFPML.g:5185:2: '}'
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
    // InternalFPML.g:5195:1: rule__EffectFullFunctionDefinition__Group_5__0 : rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5199:1: ( rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 )
            // InternalFPML.g:5200:2: rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1
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
    // InternalFPML.g:5207:1: rule__EffectFullFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5211:1: ( ( ',' ) )
            // InternalFPML.g:5212:1: ( ',' )
            {
            // InternalFPML.g:5212:1: ( ',' )
            // InternalFPML.g:5213:2: ','
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
    // InternalFPML.g:5222:1: rule__EffectFullFunctionDefinition__Group_5__1 : rule__EffectFullFunctionDefinition__Group_5__1__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5226:1: ( rule__EffectFullFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:5227:2: rule__EffectFullFunctionDefinition__Group_5__1__Impl
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
    // InternalFPML.g:5233:1: rule__EffectFullFunctionDefinition__Group_5__1__Impl : ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5237:1: ( ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) ) )
            // InternalFPML.g:5238:1: ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            {
            // InternalFPML.g:5238:1: ( ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 ) )
            // InternalFPML.g:5239:2: ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1()); 
            // InternalFPML.g:5240:2: ( rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 )
            // InternalFPML.g:5240:3: rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1
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
    // InternalFPML.g:5249:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5253:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:5254:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:5261:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5265:1: ( ( 'IO' ) )
            // InternalFPML.g:5266:1: ( 'IO' )
            {
            // InternalFPML.g:5266:1: ( 'IO' )
            // InternalFPML.g:5267:2: 'IO'
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
    // InternalFPML.g:5276:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5280:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:5281:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalFPML.g:5288:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5292:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:5293:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:5293:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:5294:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:5295:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:5295:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:5303:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5307:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:5308:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:5315:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5319:1: ( ( 'main' ) )
            // InternalFPML.g:5320:1: ( 'main' )
            {
            // InternalFPML.g:5320:1: ( 'main' )
            // InternalFPML.g:5321:2: 'main'
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
    // InternalFPML.g:5330:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5334:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:5335:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:5342:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5346:1: ( ( ':' ) )
            // InternalFPML.g:5347:1: ( ':' )
            {
            // InternalFPML.g:5347:1: ( ':' )
            // InternalFPML.g:5348:2: ':'
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
    // InternalFPML.g:5357:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5361:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:5362:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:5369:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5373:1: ( ( '{' ) )
            // InternalFPML.g:5374:1: ( '{' )
            {
            // InternalFPML.g:5374:1: ( '{' )
            // InternalFPML.g:5375:2: '{'
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
    // InternalFPML.g:5384:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5388:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:5389:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:5396:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5400:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:5401:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:5401:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:5402:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:5403:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:5403:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:5411:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5415:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:5416:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:5422:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5426:1: ( ( '}' ) )
            // InternalFPML.g:5427:1: ( '}' )
            {
            // InternalFPML.g:5427:1: ( '}' )
            // InternalFPML.g:5428:2: '}'
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
    // InternalFPML.g:5438:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5442:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:5443:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
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
    // InternalFPML.g:5450:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5454:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:5455:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:5455:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:5456:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:5457:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:5457:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:5465:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5469:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:5470:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:5476:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 ) ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5480:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 ) ) )
            // InternalFPML.g:5481:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            {
            // InternalFPML.g:5481:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            // InternalFPML.g:5482:2: ( rule__EffectFullArgument__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:5483:2: ( rule__EffectFullArgument__NameAssignment_1 )
            // InternalFPML.g:5483:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:5492:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5496:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:5497:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalFPML.g:5504:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5508:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:5509:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:5509:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:5510:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:5511:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:5511:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:5519:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5523:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:5524:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:5530:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5534:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:5535:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:5535:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:5536:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:5537:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:5537:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:5546:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5550:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:5551:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFPML.g:5558:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5562:1: ( ( () ) )
            // InternalFPML.g:5563:1: ( () )
            {
            // InternalFPML.g:5563:1: ( () )
            // InternalFPML.g:5564:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:5565:2: ()
            // InternalFPML.g:5565:3: 
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
    // InternalFPML.g:5573:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5577:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:5578:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:5584:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5588:1: ( ( 'Undefined' ) )
            // InternalFPML.g:5589:1: ( 'Undefined' )
            {
            // InternalFPML.g:5589:1: ( 'Undefined' )
            // InternalFPML.g:5590:2: 'Undefined'
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
    // InternalFPML.g:5600:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5604:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:5605:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFPML.g:5612:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5616:1: ( ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:5617:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:5617:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:5618:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:5619:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:5619:3: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:5627:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5631:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl )
            // InternalFPML.g:5632:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl
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
    // InternalFPML.g:5638:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5642:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:5643:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:5643:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:5644:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:5644:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:5645:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5646:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            // InternalFPML.g:5646:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:5649:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:5650:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5651:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFPML.g:5651:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalFPML.g:5661:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5665:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:5666:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFPML.g:5673:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5677:1: ( ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:5678:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:5678:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:5679:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:5680:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:5680:3: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:5688:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5692:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:5693:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
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
    // InternalFPML.g:5699:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5703:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:5704:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:5704:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:5705:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:5705:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:5706:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5707:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:5707:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:5710:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:5711:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5712:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalFPML.g:5712:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalFPML.g:5722:1: rule__CompositionFunctionBodyPureFactor__Group_0__0 : rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5726:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 )
            // InternalFPML.g:5727:2: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1
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
    // InternalFPML.g:5734:1: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5738:1: ( ( '|>' ) )
            // InternalFPML.g:5739:1: ( '|>' )
            {
            // InternalFPML.g:5739:1: ( '|>' )
            // InternalFPML.g:5740:2: '|>'
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
    // InternalFPML.g:5749:1: rule__CompositionFunctionBodyPureFactor__Group_0__1 : rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5753:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl )
            // InternalFPML.g:5754:2: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl
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
    // InternalFPML.g:5760:1: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5764:1: ( ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:5765:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:5765:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:5766:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:5767:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:5767:3: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:5776:1: rule__CompositionFunctionBodyPureFactor__Group_1__0 : rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5780:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 )
            // InternalFPML.g:5781:2: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:5788:1: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5792:1: ( ( '|>' ) )
            // InternalFPML.g:5793:1: ( '|>' )
            {
            // InternalFPML.g:5793:1: ( '|>' )
            // InternalFPML.g:5794:2: '|>'
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
    // InternalFPML.g:5803:1: rule__CompositionFunctionBodyPureFactor__Group_1__1 : rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5807:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl )
            // InternalFPML.g:5808:2: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl
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
    // InternalFPML.g:5814:1: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5818:1: ( ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:5819:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:5819:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:5820:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:5821:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:5821:3: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:5830:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5834:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:5835:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
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
    // InternalFPML.g:5842:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5846:1: ( ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:5847:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:5847:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:5848:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:5849:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:5849:3: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:5857:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5861:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl )
            // InternalFPML.g:5862:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl
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
    // InternalFPML.g:5868:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5872:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:5873:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:5873:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:5874:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:5874:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:5875:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5876:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            // InternalFPML.g:5876:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:5879:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:5880:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:5881:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==31) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFPML.g:5881:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalFPML.g:5891:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5895:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:5896:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
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
    // InternalFPML.g:5903:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5907:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:5908:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:5908:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:5909:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:5910:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:5910:3: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:5918:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5922:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:5923:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
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
    // InternalFPML.g:5929:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5933:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:5934:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:5934:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:5935:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:5935:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:5936:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5937:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:5937:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:5940:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:5941:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:5942:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFPML.g:5942:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalFPML.g:5952:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5956:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 )
            // InternalFPML.g:5957:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1
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
    // InternalFPML.g:5964:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5968:1: ( ( '>>=' ) )
            // InternalFPML.g:5969:1: ( '>>=' )
            {
            // InternalFPML.g:5969:1: ( '>>=' )
            // InternalFPML.g:5970:2: '>>='
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
    // InternalFPML.g:5979:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5983:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl )
            // InternalFPML.g:5984:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl
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
    // InternalFPML.g:5990:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5994:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:5995:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:5995:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:5996:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:5997:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:5997:3: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:6006:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6010:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 )
            // InternalFPML.g:6011:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:6018:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6022:1: ( ( '>>=' ) )
            // InternalFPML.g:6023:1: ( '>>=' )
            {
            // InternalFPML.g:6023:1: ( '>>=' )
            // InternalFPML.g:6024:2: '>>='
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
    // InternalFPML.g:6033:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6037:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl )
            // InternalFPML.g:6038:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl
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
    // InternalFPML.g:6044:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6048:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:6049:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:6049:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:6050:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:6051:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:6051:3: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:6060:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6064:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:6065:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
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
    // InternalFPML.g:6072:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6076:1: ( ( 'IO' ) )
            // InternalFPML.g:6077:1: ( 'IO' )
            {
            // InternalFPML.g:6077:1: ( 'IO' )
            // InternalFPML.g:6078:2: 'IO'
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
    // InternalFPML.g:6087:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6091:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:6092:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:6098:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6102:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6103:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6103:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:6104:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6105:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:6105:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:6114:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6118:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:6119:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
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
    // InternalFPML.g:6126:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6130:1: ( ( () ) )
            // InternalFPML.g:6131:1: ( () )
            {
            // InternalFPML.g:6131:1: ( () )
            // InternalFPML.g:6132:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:6133:2: ()
            // InternalFPML.g:6133:3: 
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
    // InternalFPML.g:6141:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6145:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:6146:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:6152:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6156:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6157:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6157:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:6158:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6159:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:6159:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:6168:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6172:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:6173:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
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
    // InternalFPML.g:6180:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6184:1: ( ( () ) )
            // InternalFPML.g:6185:1: ( () )
            {
            // InternalFPML.g:6185:1: ( () )
            // InternalFPML.g:6186:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:6187:2: ()
            // InternalFPML.g:6187:3: 
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
    // InternalFPML.g:6195:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6199:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:6200:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:6206:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6210:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6211:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6211:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:6212:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6213:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:6213:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:6222:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6226:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:6227:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFPML.g:6234:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6238:1: ( ( () ) )
            // InternalFPML.g:6239:1: ( () )
            {
            // InternalFPML.g:6239:1: ( () )
            // InternalFPML.g:6240:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:6241:2: ()
            // InternalFPML.g:6241:3: 
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
    // InternalFPML.g:6249:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6253:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:6254:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:6260:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6264:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:6265:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:6265:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:6266:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:6267:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:6267:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:6276:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6280:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:6281:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalFPML.g:6288:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6292:1: ( ( () ) )
            // InternalFPML.g:6293:1: ( () )
            {
            // InternalFPML.g:6293:1: ( () )
            // InternalFPML.g:6294:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:6295:2: ()
            // InternalFPML.g:6295:3: 
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
    // InternalFPML.g:6303:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6307:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:6308:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
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
    // InternalFPML.g:6315:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6319:1: ( ( 'ref' ) )
            // InternalFPML.g:6320:1: ( 'ref' )
            {
            // InternalFPML.g:6320:1: ( 'ref' )
            // InternalFPML.g:6321:2: 'ref'
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
    // InternalFPML.g:6330:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6334:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:6335:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:6341:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6345:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:6346:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:6346:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:6347:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:6348:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:6348:3: rule__DataType__TypeAssignment_2
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
    // InternalFPML.g:6357:1: rule__EffectFullDataType__Group__0 : rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1 ;
    public final void rule__EffectFullDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6361:1: ( rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1 )
            // InternalFPML.g:6362:2: rule__EffectFullDataType__Group__0__Impl rule__EffectFullDataType__Group__1
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
    // InternalFPML.g:6369:1: rule__EffectFullDataType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6373:1: ( ( () ) )
            // InternalFPML.g:6374:1: ( () )
            {
            // InternalFPML.g:6374:1: ( () )
            // InternalFPML.g:6375:2: ()
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0()); 
            // InternalFPML.g:6376:2: ()
            // InternalFPML.g:6376:3: 
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
    // InternalFPML.g:6384:1: rule__EffectFullDataType__Group__1 : rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2 ;
    public final void rule__EffectFullDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6388:1: ( rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2 )
            // InternalFPML.g:6389:2: rule__EffectFullDataType__Group__1__Impl rule__EffectFullDataType__Group__2
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
    // InternalFPML.g:6396:1: rule__EffectFullDataType__Group__1__Impl : ( 'refIO' ) ;
    public final void rule__EffectFullDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6400:1: ( ( 'refIO' ) )
            // InternalFPML.g:6401:1: ( 'refIO' )
            {
            // InternalFPML.g:6401:1: ( 'refIO' )
            // InternalFPML.g:6402:2: 'refIO'
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
    // InternalFPML.g:6411:1: rule__EffectFullDataType__Group__2 : rule__EffectFullDataType__Group__2__Impl ;
    public final void rule__EffectFullDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6415:1: ( rule__EffectFullDataType__Group__2__Impl )
            // InternalFPML.g:6416:2: rule__EffectFullDataType__Group__2__Impl
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
    // InternalFPML.g:6422:1: rule__EffectFullDataType__Group__2__Impl : ( ( rule__EffectFullDataType__TypeAssignment_2 ) ) ;
    public final void rule__EffectFullDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6426:1: ( ( ( rule__EffectFullDataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:6427:1: ( ( rule__EffectFullDataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:6427:1: ( ( rule__EffectFullDataType__TypeAssignment_2 ) )
            // InternalFPML.g:6428:2: ( rule__EffectFullDataType__TypeAssignment_2 )
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:6429:2: ( rule__EffectFullDataType__TypeAssignment_2 )
            // InternalFPML.g:6429:3: rule__EffectFullDataType__TypeAssignment_2
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
    // InternalFPML.g:6438:1: rule__PureFunctionType__Group__0 : rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 ;
    public final void rule__PureFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6442:1: ( rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 )
            // InternalFPML.g:6443:2: rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1
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
    // InternalFPML.g:6450:1: rule__PureFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6454:1: ( ( () ) )
            // InternalFPML.g:6455:1: ( () )
            {
            // InternalFPML.g:6455:1: ( () )
            // InternalFPML.g:6456:2: ()
            {
             before(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 
            // InternalFPML.g:6457:2: ()
            // InternalFPML.g:6457:3: 
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
    // InternalFPML.g:6465:1: rule__PureFunctionType__Group__1 : rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 ;
    public final void rule__PureFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6469:1: ( rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 )
            // InternalFPML.g:6470:2: rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2
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
    // InternalFPML.g:6477:1: rule__PureFunctionType__Group__1__Impl : ( 'F' ) ;
    public final void rule__PureFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6481:1: ( ( 'F' ) )
            // InternalFPML.g:6482:1: ( 'F' )
            {
            // InternalFPML.g:6482:1: ( 'F' )
            // InternalFPML.g:6483:2: 'F'
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
    // InternalFPML.g:6492:1: rule__PureFunctionType__Group__2 : rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 ;
    public final void rule__PureFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6496:1: ( rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 )
            // InternalFPML.g:6497:2: rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3
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
    // InternalFPML.g:6504:1: rule__PureFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__PureFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6508:1: ( ( '<' ) )
            // InternalFPML.g:6509:1: ( '<' )
            {
            // InternalFPML.g:6509:1: ( '<' )
            // InternalFPML.g:6510:2: '<'
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
    // InternalFPML.g:6519:1: rule__PureFunctionType__Group__3 : rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 ;
    public final void rule__PureFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6523:1: ( rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 )
            // InternalFPML.g:6524:2: rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4
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
    // InternalFPML.g:6531:1: rule__PureFunctionType__Group__3__Impl : ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__PureFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6535:1: ( ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:6536:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:6536:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:6537:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:6538:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:6538:3: rule__PureFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:6546:1: rule__PureFunctionType__Group__4 : rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 ;
    public final void rule__PureFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6550:1: ( rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 )
            // InternalFPML.g:6551:2: rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5
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
    // InternalFPML.g:6558:1: rule__PureFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__PureFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6562:1: ( ( ',' ) )
            // InternalFPML.g:6563:1: ( ',' )
            {
            // InternalFPML.g:6563:1: ( ',' )
            // InternalFPML.g:6564:2: ','
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
    // InternalFPML.g:6573:1: rule__PureFunctionType__Group__5 : rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 ;
    public final void rule__PureFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6577:1: ( rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 )
            // InternalFPML.g:6578:2: rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6
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
    // InternalFPML.g:6585:1: rule__PureFunctionType__Group__5__Impl : ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__PureFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6589:1: ( ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:6590:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:6590:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:6591:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:6592:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:6592:3: rule__PureFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:6600:1: rule__PureFunctionType__Group__6 : rule__PureFunctionType__Group__6__Impl ;
    public final void rule__PureFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6604:1: ( rule__PureFunctionType__Group__6__Impl )
            // InternalFPML.g:6605:2: rule__PureFunctionType__Group__6__Impl
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
    // InternalFPML.g:6611:1: rule__PureFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__PureFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6615:1: ( ( '>' ) )
            // InternalFPML.g:6616:1: ( '>' )
            {
            // InternalFPML.g:6616:1: ( '>' )
            // InternalFPML.g:6617:2: '>'
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
    // InternalFPML.g:6627:1: rule__EffectFullFunctionType__Group__0 : rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 ;
    public final void rule__EffectFullFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6631:1: ( rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 )
            // InternalFPML.g:6632:2: rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:6639:1: rule__EffectFullFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6643:1: ( ( () ) )
            // InternalFPML.g:6644:1: ( () )
            {
            // InternalFPML.g:6644:1: ( () )
            // InternalFPML.g:6645:2: ()
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 
            // InternalFPML.g:6646:2: ()
            // InternalFPML.g:6646:3: 
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
    // InternalFPML.g:6654:1: rule__EffectFullFunctionType__Group__1 : rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 ;
    public final void rule__EffectFullFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6658:1: ( rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 )
            // InternalFPML.g:6659:2: rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2
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
    // InternalFPML.g:6666:1: rule__EffectFullFunctionType__Group__1__Impl : ( 'FIO' ) ;
    public final void rule__EffectFullFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6670:1: ( ( 'FIO' ) )
            // InternalFPML.g:6671:1: ( 'FIO' )
            {
            // InternalFPML.g:6671:1: ( 'FIO' )
            // InternalFPML.g:6672:2: 'FIO'
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
    // InternalFPML.g:6681:1: rule__EffectFullFunctionType__Group__2 : rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 ;
    public final void rule__EffectFullFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6685:1: ( rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 )
            // InternalFPML.g:6686:2: rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3
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
    // InternalFPML.g:6693:1: rule__EffectFullFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__EffectFullFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6697:1: ( ( '<' ) )
            // InternalFPML.g:6698:1: ( '<' )
            {
            // InternalFPML.g:6698:1: ( '<' )
            // InternalFPML.g:6699:2: '<'
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
    // InternalFPML.g:6708:1: rule__EffectFullFunctionType__Group__3 : rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 ;
    public final void rule__EffectFullFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6712:1: ( rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 )
            // InternalFPML.g:6713:2: rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4
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
    // InternalFPML.g:6720:1: rule__EffectFullFunctionType__Group__3__Impl : ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6724:1: ( ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:6725:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:6725:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:6726:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:6727:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:6727:3: rule__EffectFullFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:6735:1: rule__EffectFullFunctionType__Group__4 : rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 ;
    public final void rule__EffectFullFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6739:1: ( rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 )
            // InternalFPML.g:6740:2: rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5
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
    // InternalFPML.g:6747:1: rule__EffectFullFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6751:1: ( ( ',' ) )
            // InternalFPML.g:6752:1: ( ',' )
            {
            // InternalFPML.g:6752:1: ( ',' )
            // InternalFPML.g:6753:2: ','
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
    // InternalFPML.g:6762:1: rule__EffectFullFunctionType__Group__5 : rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 ;
    public final void rule__EffectFullFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6766:1: ( rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 )
            // InternalFPML.g:6767:2: rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6
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
    // InternalFPML.g:6774:1: rule__EffectFullFunctionType__Group__5__Impl : ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__EffectFullFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6778:1: ( ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:6779:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:6779:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:6780:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:6781:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:6781:3: rule__EffectFullFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:6789:1: rule__EffectFullFunctionType__Group__6 : rule__EffectFullFunctionType__Group__6__Impl ;
    public final void rule__EffectFullFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6793:1: ( rule__EffectFullFunctionType__Group__6__Impl )
            // InternalFPML.g:6794:2: rule__EffectFullFunctionType__Group__6__Impl
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
    // InternalFPML.g:6800:1: rule__EffectFullFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__EffectFullFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6804:1: ( ( '>' ) )
            // InternalFPML.g:6805:1: ( '>' )
            {
            // InternalFPML.g:6805:1: ( '>' )
            // InternalFPML.g:6806:2: '>'
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
    // InternalFPML.g:6816:1: rule__EffectFullExpression__Group_0__0 : rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1 ;
    public final void rule__EffectFullExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6820:1: ( rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1 )
            // InternalFPML.g:6821:2: rule__EffectFullExpression__Group_0__0__Impl rule__EffectFullExpression__Group_0__1
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
    // InternalFPML.g:6828:1: rule__EffectFullExpression__Group_0__0__Impl : ( 'IO' ) ;
    public final void rule__EffectFullExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6832:1: ( ( 'IO' ) )
            // InternalFPML.g:6833:1: ( 'IO' )
            {
            // InternalFPML.g:6833:1: ( 'IO' )
            // InternalFPML.g:6834:2: 'IO'
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
    // InternalFPML.g:6843:1: rule__EffectFullExpression__Group_0__1 : rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2 ;
    public final void rule__EffectFullExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6847:1: ( rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2 )
            // InternalFPML.g:6848:2: rule__EffectFullExpression__Group_0__1__Impl rule__EffectFullExpression__Group_0__2
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
    // InternalFPML.g:6855:1: rule__EffectFullExpression__Group_0__1__Impl : ( '(' ) ;
    public final void rule__EffectFullExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6859:1: ( ( '(' ) )
            // InternalFPML.g:6860:1: ( '(' )
            {
            // InternalFPML.g:6860:1: ( '(' )
            // InternalFPML.g:6861:2: '('
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
    // InternalFPML.g:6870:1: rule__EffectFullExpression__Group_0__2 : rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3 ;
    public final void rule__EffectFullExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6874:1: ( rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3 )
            // InternalFPML.g:6875:2: rule__EffectFullExpression__Group_0__2__Impl rule__EffectFullExpression__Group_0__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:6882:1: rule__EffectFullExpression__Group_0__2__Impl : ( ruleExpression ) ;
    public final void rule__EffectFullExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6886:1: ( ( ruleExpression ) )
            // InternalFPML.g:6887:1: ( ruleExpression )
            {
            // InternalFPML.g:6887:1: ( ruleExpression )
            // InternalFPML.g:6888:2: ruleExpression
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
    // InternalFPML.g:6897:1: rule__EffectFullExpression__Group_0__3 : rule__EffectFullExpression__Group_0__3__Impl ;
    public final void rule__EffectFullExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6901:1: ( rule__EffectFullExpression__Group_0__3__Impl )
            // InternalFPML.g:6902:2: rule__EffectFullExpression__Group_0__3__Impl
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
    // InternalFPML.g:6908:1: rule__EffectFullExpression__Group_0__3__Impl : ( ')' ) ;
    public final void rule__EffectFullExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6912:1: ( ( ')' ) )
            // InternalFPML.g:6913:1: ( ')' )
            {
            // InternalFPML.g:6913:1: ( ')' )
            // InternalFPML.g:6914:2: ')'
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
    // InternalFPML.g:6924:1: rule__UnitValue__Group__0 : rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 ;
    public final void rule__UnitValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6928:1: ( rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 )
            // InternalFPML.g:6929:2: rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1
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
    // InternalFPML.g:6936:1: rule__UnitValue__Group__0__Impl : ( () ) ;
    public final void rule__UnitValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6940:1: ( ( () ) )
            // InternalFPML.g:6941:1: ( () )
            {
            // InternalFPML.g:6941:1: ( () )
            // InternalFPML.g:6942:2: ()
            {
             before(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:6943:2: ()
            // InternalFPML.g:6943:3: 
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
    // InternalFPML.g:6951:1: rule__UnitValue__Group__1 : rule__UnitValue__Group__1__Impl ;
    public final void rule__UnitValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6955:1: ( rule__UnitValue__Group__1__Impl )
            // InternalFPML.g:6956:2: rule__UnitValue__Group__1__Impl
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
    // InternalFPML.g:6962:1: rule__UnitValue__Group__1__Impl : ( '()' ) ;
    public final void rule__UnitValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6966:1: ( ( '()' ) )
            // InternalFPML.g:6967:1: ( '()' )
            {
            // InternalFPML.g:6967:1: ( '()' )
            // InternalFPML.g:6968:2: '()'
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
    // InternalFPML.g:6978:1: rule__EffectFullValueRef__Group__0 : rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1 ;
    public final void rule__EffectFullValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6982:1: ( rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1 )
            // InternalFPML.g:6983:2: rule__EffectFullValueRef__Group__0__Impl rule__EffectFullValueRef__Group__1
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
    // InternalFPML.g:6990:1: rule__EffectFullValueRef__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6994:1: ( ( () ) )
            // InternalFPML.g:6995:1: ( () )
            {
            // InternalFPML.g:6995:1: ( () )
            // InternalFPML.g:6996:2: ()
            {
             before(grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0()); 
            // InternalFPML.g:6997:2: ()
            // InternalFPML.g:6997:3: 
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
    // InternalFPML.g:7005:1: rule__EffectFullValueRef__Group__1 : rule__EffectFullValueRef__Group__1__Impl ;
    public final void rule__EffectFullValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7009:1: ( rule__EffectFullValueRef__Group__1__Impl )
            // InternalFPML.g:7010:2: rule__EffectFullValueRef__Group__1__Impl
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
    // InternalFPML.g:7016:1: rule__EffectFullValueRef__Group__1__Impl : ( ( rule__EffectFullValueRef__ValueAssignment_1 ) ) ;
    public final void rule__EffectFullValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7020:1: ( ( ( rule__EffectFullValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:7021:1: ( ( rule__EffectFullValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7021:1: ( ( rule__EffectFullValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:7022:2: ( rule__EffectFullValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getEffectFullValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:7023:2: ( rule__EffectFullValueRef__ValueAssignment_1 )
            // InternalFPML.g:7023:3: rule__EffectFullValueRef__ValueAssignment_1
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
    // InternalFPML.g:7032:1: rule__EffectFullLambda__Group_0__0 : rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1 ;
    public final void rule__EffectFullLambda__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7036:1: ( rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1 )
            // InternalFPML.g:7037:2: rule__EffectFullLambda__Group_0__0__Impl rule__EffectFullLambda__Group_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFPML.g:7044:1: rule__EffectFullLambda__Group_0__0__Impl : ( () ) ;
    public final void rule__EffectFullLambda__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7048:1: ( ( () ) )
            // InternalFPML.g:7049:1: ( () )
            {
            // InternalFPML.g:7049:1: ( () )
            // InternalFPML.g:7050:2: ()
            {
             before(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0()); 
            // InternalFPML.g:7051:2: ()
            // InternalFPML.g:7051:3: 
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
    // InternalFPML.g:7059:1: rule__EffectFullLambda__Group_0__1 : rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2 ;
    public final void rule__EffectFullLambda__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7063:1: ( rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2 )
            // InternalFPML.g:7064:2: rule__EffectFullLambda__Group_0__1__Impl rule__EffectFullLambda__Group_0__2
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
    // InternalFPML.g:7071:1: rule__EffectFullLambda__Group_0__1__Impl : ( '[' ) ;
    public final void rule__EffectFullLambda__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7075:1: ( ( '[' ) )
            // InternalFPML.g:7076:1: ( '[' )
            {
            // InternalFPML.g:7076:1: ( '[' )
            // InternalFPML.g:7077:2: '['
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
    // InternalFPML.g:7086:1: rule__EffectFullLambda__Group_0__2 : rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3 ;
    public final void rule__EffectFullLambda__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7090:1: ( rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3 )
            // InternalFPML.g:7091:2: rule__EffectFullLambda__Group_0__2__Impl rule__EffectFullLambda__Group_0__3
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
    // InternalFPML.g:7098:1: rule__EffectFullLambda__Group_0__2__Impl : ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) ) ;
    public final void rule__EffectFullLambda__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7102:1: ( ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) ) )
            // InternalFPML.g:7103:1: ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) )
            {
            // InternalFPML.g:7103:1: ( ( rule__EffectFullLambda__ArgAssignment_0_2 ) )
            // InternalFPML.g:7104:2: ( rule__EffectFullLambda__ArgAssignment_0_2 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_0_2()); 
            // InternalFPML.g:7105:2: ( rule__EffectFullLambda__ArgAssignment_0_2 )
            // InternalFPML.g:7105:3: rule__EffectFullLambda__ArgAssignment_0_2
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
    // InternalFPML.g:7113:1: rule__EffectFullLambda__Group_0__3 : rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4 ;
    public final void rule__EffectFullLambda__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7117:1: ( rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4 )
            // InternalFPML.g:7118:2: rule__EffectFullLambda__Group_0__3__Impl rule__EffectFullLambda__Group_0__4
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
    // InternalFPML.g:7125:1: rule__EffectFullLambda__Group_0__3__Impl : ( ']' ) ;
    public final void rule__EffectFullLambda__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7129:1: ( ( ']' ) )
            // InternalFPML.g:7130:1: ( ']' )
            {
            // InternalFPML.g:7130:1: ( ']' )
            // InternalFPML.g:7131:2: ']'
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
    // InternalFPML.g:7140:1: rule__EffectFullLambda__Group_0__4 : rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5 ;
    public final void rule__EffectFullLambda__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7144:1: ( rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5 )
            // InternalFPML.g:7145:2: rule__EffectFullLambda__Group_0__4__Impl rule__EffectFullLambda__Group_0__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:7152:1: rule__EffectFullLambda__Group_0__4__Impl : ( ':' ) ;
    public final void rule__EffectFullLambda__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7156:1: ( ( ':' ) )
            // InternalFPML.g:7157:1: ( ':' )
            {
            // InternalFPML.g:7157:1: ( ':' )
            // InternalFPML.g:7158:2: ':'
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
    // InternalFPML.g:7167:1: rule__EffectFullLambda__Group_0__5 : rule__EffectFullLambda__Group_0__5__Impl ;
    public final void rule__EffectFullLambda__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7171:1: ( rule__EffectFullLambda__Group_0__5__Impl )
            // InternalFPML.g:7172:2: rule__EffectFullLambda__Group_0__5__Impl
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
    // InternalFPML.g:7178:1: rule__EffectFullLambda__Group_0__5__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) ) ;
    public final void rule__EffectFullLambda__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7182:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) ) )
            // InternalFPML.g:7183:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) )
            {
            // InternalFPML.g:7183:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 ) )
            // InternalFPML.g:7184:2: ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_0_5()); 
            // InternalFPML.g:7185:2: ( rule__EffectFullLambda__FunctionBodyAssignment_0_5 )
            // InternalFPML.g:7185:3: rule__EffectFullLambda__FunctionBodyAssignment_0_5
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
    // InternalFPML.g:7194:1: rule__EffectFullLambda__Group_1__0 : rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1 ;
    public final void rule__EffectFullLambda__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7198:1: ( rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1 )
            // InternalFPML.g:7199:2: rule__EffectFullLambda__Group_1__0__Impl rule__EffectFullLambda__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:7206:1: rule__EffectFullLambda__Group_1__0__Impl : ( () ) ;
    public final void rule__EffectFullLambda__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7210:1: ( ( () ) )
            // InternalFPML.g:7211:1: ( () )
            {
            // InternalFPML.g:7211:1: ( () )
            // InternalFPML.g:7212:2: ()
            {
             before(grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0()); 
            // InternalFPML.g:7213:2: ()
            // InternalFPML.g:7213:3: 
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
    // InternalFPML.g:7221:1: rule__EffectFullLambda__Group_1__1 : rule__EffectFullLambda__Group_1__1__Impl ;
    public final void rule__EffectFullLambda__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7225:1: ( rule__EffectFullLambda__Group_1__1__Impl )
            // InternalFPML.g:7226:2: rule__EffectFullLambda__Group_1__1__Impl
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
    // InternalFPML.g:7232:1: rule__EffectFullLambda__Group_1__1__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) ) ;
    public final void rule__EffectFullLambda__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7236:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) ) )
            // InternalFPML.g:7237:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) )
            {
            // InternalFPML.g:7237:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 ) )
            // InternalFPML.g:7238:2: ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_1_1()); 
            // InternalFPML.g:7239:2: ( rule__EffectFullLambda__FunctionBodyAssignment_1_1 )
            // InternalFPML.g:7239:3: rule__EffectFullLambda__FunctionBodyAssignment_1_1
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
    // InternalFPML.g:7248:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7252:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:7253:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:7260:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7264:1: ( ( () ) )
            // InternalFPML.g:7265:1: ( () )
            {
            // InternalFPML.g:7265:1: ( () )
            // InternalFPML.g:7266:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:7267:2: ()
            // InternalFPML.g:7267:3: 
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
    // InternalFPML.g:7275:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7279:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:7280:2: rule__IntValue__Group__1__Impl
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
    // InternalFPML.g:7286:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7290:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:7291:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7291:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:7292:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:7293:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:7293:3: rule__IntValue__ValueAssignment_1
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
    // InternalFPML.g:7302:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7306:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:7307:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalFPML.g:7314:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7318:1: ( ( () ) )
            // InternalFPML.g:7319:1: ( () )
            {
            // InternalFPML.g:7319:1: ( () )
            // InternalFPML.g:7320:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:7321:2: ()
            // InternalFPML.g:7321:3: 
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
    // InternalFPML.g:7329:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7333:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:7334:2: rule__StringValue__Group__1__Impl
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
    // InternalFPML.g:7340:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7344:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:7345:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7345:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:7346:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:7347:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:7347:3: rule__StringValue__ValueAssignment_1
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
    // InternalFPML.g:7356:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7360:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:7361:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
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
    // InternalFPML.g:7368:1: rule__DataValue__Group__0__Impl : ( () ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7372:1: ( ( () ) )
            // InternalFPML.g:7373:1: ( () )
            {
            // InternalFPML.g:7373:1: ( () )
            // InternalFPML.g:7374:2: ()
            {
             before(grammarAccess.getDataValueAccess().getDataValueAction_0()); 
            // InternalFPML.g:7375:2: ()
            // InternalFPML.g:7375:3: 
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
    // InternalFPML.g:7383:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7387:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:7388:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
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
    // InternalFPML.g:7395:1: rule__DataValue__Group__1__Impl : ( ( rule__DataValue__TypeAssignment_1 ) ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7399:1: ( ( ( rule__DataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:7400:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:7400:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            // InternalFPML.g:7401:2: ( rule__DataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:7402:2: ( rule__DataValue__TypeAssignment_1 )
            // InternalFPML.g:7402:3: rule__DataValue__TypeAssignment_1
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
    // InternalFPML.g:7410:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7414:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:7415:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:7422:1: rule__DataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7426:1: ( ( '(' ) )
            // InternalFPML.g:7427:1: ( '(' )
            {
            // InternalFPML.g:7427:1: ( '(' )
            // InternalFPML.g:7428:2: '('
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
    // InternalFPML.g:7437:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7441:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalFPML.g:7442:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:7449:1: rule__DataValue__Group__3__Impl : ( ( rule__DataValue__ValueAssignment_3 ) ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7453:1: ( ( ( rule__DataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:7454:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:7454:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            // InternalFPML.g:7455:2: ( rule__DataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:7456:2: ( rule__DataValue__ValueAssignment_3 )
            // InternalFPML.g:7456:3: rule__DataValue__ValueAssignment_3
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
    // InternalFPML.g:7464:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7468:1: ( rule__DataValue__Group__4__Impl )
            // InternalFPML.g:7469:2: rule__DataValue__Group__4__Impl
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
    // InternalFPML.g:7475:1: rule__DataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7479:1: ( ( ')' ) )
            // InternalFPML.g:7480:1: ( ')' )
            {
            // InternalFPML.g:7480:1: ( ')' )
            // InternalFPML.g:7481:2: ')'
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
    // InternalFPML.g:7491:1: rule__EffectFullDataValue__Group__0 : rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1 ;
    public final void rule__EffectFullDataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7495:1: ( rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1 )
            // InternalFPML.g:7496:2: rule__EffectFullDataValue__Group__0__Impl rule__EffectFullDataValue__Group__1
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
    // InternalFPML.g:7503:1: rule__EffectFullDataValue__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullDataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7507:1: ( ( () ) )
            // InternalFPML.g:7508:1: ( () )
            {
            // InternalFPML.g:7508:1: ( () )
            // InternalFPML.g:7509:2: ()
            {
             before(grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0()); 
            // InternalFPML.g:7510:2: ()
            // InternalFPML.g:7510:3: 
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
    // InternalFPML.g:7518:1: rule__EffectFullDataValue__Group__1 : rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2 ;
    public final void rule__EffectFullDataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7522:1: ( rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2 )
            // InternalFPML.g:7523:2: rule__EffectFullDataValue__Group__1__Impl rule__EffectFullDataValue__Group__2
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
    // InternalFPML.g:7530:1: rule__EffectFullDataValue__Group__1__Impl : ( ( rule__EffectFullDataValue__TypeAssignment_1 ) ) ;
    public final void rule__EffectFullDataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7534:1: ( ( ( rule__EffectFullDataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:7535:1: ( ( rule__EffectFullDataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:7535:1: ( ( rule__EffectFullDataValue__TypeAssignment_1 ) )
            // InternalFPML.g:7536:2: ( rule__EffectFullDataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:7537:2: ( rule__EffectFullDataValue__TypeAssignment_1 )
            // InternalFPML.g:7537:3: rule__EffectFullDataValue__TypeAssignment_1
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
    // InternalFPML.g:7545:1: rule__EffectFullDataValue__Group__2 : rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3 ;
    public final void rule__EffectFullDataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7549:1: ( rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3 )
            // InternalFPML.g:7550:2: rule__EffectFullDataValue__Group__2__Impl rule__EffectFullDataValue__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:7557:1: rule__EffectFullDataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__EffectFullDataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7561:1: ( ( '(' ) )
            // InternalFPML.g:7562:1: ( '(' )
            {
            // InternalFPML.g:7562:1: ( '(' )
            // InternalFPML.g:7563:2: '('
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
    // InternalFPML.g:7572:1: rule__EffectFullDataValue__Group__3 : rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4 ;
    public final void rule__EffectFullDataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7576:1: ( rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4 )
            // InternalFPML.g:7577:2: rule__EffectFullDataValue__Group__3__Impl rule__EffectFullDataValue__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:7584:1: rule__EffectFullDataValue__Group__3__Impl : ( ( rule__EffectFullDataValue__ValueAssignment_3 ) ) ;
    public final void rule__EffectFullDataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7588:1: ( ( ( rule__EffectFullDataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:7589:1: ( ( rule__EffectFullDataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:7589:1: ( ( rule__EffectFullDataValue__ValueAssignment_3 ) )
            // InternalFPML.g:7590:2: ( rule__EffectFullDataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:7591:2: ( rule__EffectFullDataValue__ValueAssignment_3 )
            // InternalFPML.g:7591:3: rule__EffectFullDataValue__ValueAssignment_3
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
    // InternalFPML.g:7599:1: rule__EffectFullDataValue__Group__4 : rule__EffectFullDataValue__Group__4__Impl ;
    public final void rule__EffectFullDataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7603:1: ( rule__EffectFullDataValue__Group__4__Impl )
            // InternalFPML.g:7604:2: rule__EffectFullDataValue__Group__4__Impl
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
    // InternalFPML.g:7610:1: rule__EffectFullDataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectFullDataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7614:1: ( ( ')' ) )
            // InternalFPML.g:7615:1: ( ')' )
            {
            // InternalFPML.g:7615:1: ( ')' )
            // InternalFPML.g:7616:2: ')'
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
    // InternalFPML.g:7626:1: rule__PureValueRef__Group__0 : rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1 ;
    public final void rule__PureValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7630:1: ( rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1 )
            // InternalFPML.g:7631:2: rule__PureValueRef__Group__0__Impl rule__PureValueRef__Group__1
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
    // InternalFPML.g:7638:1: rule__PureValueRef__Group__0__Impl : ( () ) ;
    public final void rule__PureValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7642:1: ( ( () ) )
            // InternalFPML.g:7643:1: ( () )
            {
            // InternalFPML.g:7643:1: ( () )
            // InternalFPML.g:7644:2: ()
            {
             before(grammarAccess.getPureValueRefAccess().getPureValueRefAction_0()); 
            // InternalFPML.g:7645:2: ()
            // InternalFPML.g:7645:3: 
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
    // InternalFPML.g:7653:1: rule__PureValueRef__Group__1 : rule__PureValueRef__Group__1__Impl ;
    public final void rule__PureValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7657:1: ( rule__PureValueRef__Group__1__Impl )
            // InternalFPML.g:7658:2: rule__PureValueRef__Group__1__Impl
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
    // InternalFPML.g:7664:1: rule__PureValueRef__Group__1__Impl : ( ( rule__PureValueRef__ValueAssignment_1 ) ) ;
    public final void rule__PureValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7668:1: ( ( ( rule__PureValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:7669:1: ( ( rule__PureValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:7669:1: ( ( rule__PureValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:7670:2: ( rule__PureValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getPureValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:7671:2: ( rule__PureValueRef__ValueAssignment_1 )
            // InternalFPML.g:7671:3: rule__PureValueRef__ValueAssignment_1
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
    // InternalFPML.g:7680:1: rule__PureLambda__Group__0 : rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 ;
    public final void rule__PureLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7684:1: ( rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 )
            // InternalFPML.g:7685:2: rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1
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
    // InternalFPML.g:7692:1: rule__PureLambda__Group__0__Impl : ( () ) ;
    public final void rule__PureLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7696:1: ( ( () ) )
            // InternalFPML.g:7697:1: ( () )
            {
            // InternalFPML.g:7697:1: ( () )
            // InternalFPML.g:7698:2: ()
            {
             before(grammarAccess.getPureLambdaAccess().getPureLambdaAction_0()); 
            // InternalFPML.g:7699:2: ()
            // InternalFPML.g:7699:3: 
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
    // InternalFPML.g:7707:1: rule__PureLambda__Group__1 : rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 ;
    public final void rule__PureLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7711:1: ( rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 )
            // InternalFPML.g:7712:2: rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2
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
    // InternalFPML.g:7719:1: rule__PureLambda__Group__1__Impl : ( '(' ) ;
    public final void rule__PureLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7723:1: ( ( '(' ) )
            // InternalFPML.g:7724:1: ( '(' )
            {
            // InternalFPML.g:7724:1: ( '(' )
            // InternalFPML.g:7725:2: '('
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
    // InternalFPML.g:7734:1: rule__PureLambda__Group__2 : rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 ;
    public final void rule__PureLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7738:1: ( rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 )
            // InternalFPML.g:7739:2: rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:7746:1: rule__PureLambda__Group__2__Impl : ( ( rule__PureLambda__ArgAssignment_2 ) ) ;
    public final void rule__PureLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7750:1: ( ( ( rule__PureLambda__ArgAssignment_2 ) ) )
            // InternalFPML.g:7751:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            {
            // InternalFPML.g:7751:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            // InternalFPML.g:7752:2: ( rule__PureLambda__ArgAssignment_2 )
            {
             before(grammarAccess.getPureLambdaAccess().getArgAssignment_2()); 
            // InternalFPML.g:7753:2: ( rule__PureLambda__ArgAssignment_2 )
            // InternalFPML.g:7753:3: rule__PureLambda__ArgAssignment_2
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
    // InternalFPML.g:7761:1: rule__PureLambda__Group__3 : rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 ;
    public final void rule__PureLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7765:1: ( rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 )
            // InternalFPML.g:7766:2: rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4
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
    // InternalFPML.g:7773:1: rule__PureLambda__Group__3__Impl : ( ')' ) ;
    public final void rule__PureLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7777:1: ( ( ')' ) )
            // InternalFPML.g:7778:1: ( ')' )
            {
            // InternalFPML.g:7778:1: ( ')' )
            // InternalFPML.g:7779:2: ')'
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
    // InternalFPML.g:7788:1: rule__PureLambda__Group__4 : rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 ;
    public final void rule__PureLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7792:1: ( rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 )
            // InternalFPML.g:7793:2: rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5
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
    // InternalFPML.g:7800:1: rule__PureLambda__Group__4__Impl : ( ':' ) ;
    public final void rule__PureLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7804:1: ( ( ':' ) )
            // InternalFPML.g:7805:1: ( ':' )
            {
            // InternalFPML.g:7805:1: ( ':' )
            // InternalFPML.g:7806:2: ':'
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
    // InternalFPML.g:7815:1: rule__PureLambda__Group__5 : rule__PureLambda__Group__5__Impl ;
    public final void rule__PureLambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7819:1: ( rule__PureLambda__Group__5__Impl )
            // InternalFPML.g:7820:2: rule__PureLambda__Group__5__Impl
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
    // InternalFPML.g:7826:1: rule__PureLambda__Group__5__Impl : ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) ;
    public final void rule__PureLambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7830:1: ( ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:7831:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:7831:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:7832:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:7833:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            // InternalFPML.g:7833:3: rule__PureLambda__FunctionBodyAssignment_5
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
    // InternalFPML.g:7842:1: rule__PureProdValue__Group__0 : rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1 ;
    public final void rule__PureProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7846:1: ( rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1 )
            // InternalFPML.g:7847:2: rule__PureProdValue__Group__0__Impl rule__PureProdValue__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:7854:1: rule__PureProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__PureProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7858:1: ( ( '(' ) )
            // InternalFPML.g:7859:1: ( '(' )
            {
            // InternalFPML.g:7859:1: ( '(' )
            // InternalFPML.g:7860:2: '('
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
    // InternalFPML.g:7869:1: rule__PureProdValue__Group__1 : rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2 ;
    public final void rule__PureProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7873:1: ( rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2 )
            // InternalFPML.g:7874:2: rule__PureProdValue__Group__1__Impl rule__PureProdValue__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:7881:1: rule__PureProdValue__Group__1__Impl : ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__PureProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7885:1: ( ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:7886:1: ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:7886:1: ( ( rule__PureProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:7887:2: ( rule__PureProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:7888:2: ( rule__PureProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:7888:3: rule__PureProdValue__ProdAdtElement1Assignment_1
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
    // InternalFPML.g:7896:1: rule__PureProdValue__Group__2 : rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3 ;
    public final void rule__PureProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7900:1: ( rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3 )
            // InternalFPML.g:7901:2: rule__PureProdValue__Group__2__Impl rule__PureProdValue__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:7908:1: rule__PureProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__PureProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7912:1: ( ( ',' ) )
            // InternalFPML.g:7913:1: ( ',' )
            {
            // InternalFPML.g:7913:1: ( ',' )
            // InternalFPML.g:7914:2: ','
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
    // InternalFPML.g:7923:1: rule__PureProdValue__Group__3 : rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4 ;
    public final void rule__PureProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7927:1: ( rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4 )
            // InternalFPML.g:7928:2: rule__PureProdValue__Group__3__Impl rule__PureProdValue__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:7935:1: rule__PureProdValue__Group__3__Impl : ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__PureProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7939:1: ( ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:7940:1: ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:7940:1: ( ( rule__PureProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:7941:2: ( rule__PureProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getPureProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:7942:2: ( rule__PureProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:7942:3: rule__PureProdValue__ProdAdtElement2Assignment_3
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
    // InternalFPML.g:7950:1: rule__PureProdValue__Group__4 : rule__PureProdValue__Group__4__Impl ;
    public final void rule__PureProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7954:1: ( rule__PureProdValue__Group__4__Impl )
            // InternalFPML.g:7955:2: rule__PureProdValue__Group__4__Impl
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
    // InternalFPML.g:7961:1: rule__PureProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__PureProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7965:1: ( ( ')' ) )
            // InternalFPML.g:7966:1: ( ')' )
            {
            // InternalFPML.g:7966:1: ( ')' )
            // InternalFPML.g:7967:2: ')'
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
    // InternalFPML.g:7977:1: rule__PureSumValue__Group_0__0 : rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1 ;
    public final void rule__PureSumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7981:1: ( rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1 )
            // InternalFPML.g:7982:2: rule__PureSumValue__Group_0__0__Impl rule__PureSumValue__Group_0__1
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
    // InternalFPML.g:7989:1: rule__PureSumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__PureSumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7993:1: ( ( 'Left' ) )
            // InternalFPML.g:7994:1: ( 'Left' )
            {
            // InternalFPML.g:7994:1: ( 'Left' )
            // InternalFPML.g:7995:2: 'Left'
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
    // InternalFPML.g:8004:1: rule__PureSumValue__Group_0__1 : rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2 ;
    public final void rule__PureSumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8008:1: ( rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2 )
            // InternalFPML.g:8009:2: rule__PureSumValue__Group_0__1__Impl rule__PureSumValue__Group_0__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:8016:1: rule__PureSumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__PureSumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8020:1: ( ( '(' ) )
            // InternalFPML.g:8021:1: ( '(' )
            {
            // InternalFPML.g:8021:1: ( '(' )
            // InternalFPML.g:8022:2: '('
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
    // InternalFPML.g:8031:1: rule__PureSumValue__Group_0__2 : rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3 ;
    public final void rule__PureSumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8035:1: ( rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3 )
            // InternalFPML.g:8036:2: rule__PureSumValue__Group_0__2__Impl rule__PureSumValue__Group_0__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:8043:1: rule__PureSumValue__Group_0__2__Impl : ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__PureSumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8047:1: ( ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:8048:1: ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:8048:1: ( ( rule__PureSumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:8049:2: ( rule__PureSumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:8050:2: ( rule__PureSumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:8050:3: rule__PureSumValue__SumAdtElement1Assignment_0_2
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
    // InternalFPML.g:8058:1: rule__PureSumValue__Group_0__3 : rule__PureSumValue__Group_0__3__Impl ;
    public final void rule__PureSumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8062:1: ( rule__PureSumValue__Group_0__3__Impl )
            // InternalFPML.g:8063:2: rule__PureSumValue__Group_0__3__Impl
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
    // InternalFPML.g:8069:1: rule__PureSumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__PureSumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8073:1: ( ( ')' ) )
            // InternalFPML.g:8074:1: ( ')' )
            {
            // InternalFPML.g:8074:1: ( ')' )
            // InternalFPML.g:8075:2: ')'
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
    // InternalFPML.g:8085:1: rule__PureSumValue__Group_1__0 : rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1 ;
    public final void rule__PureSumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8089:1: ( rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1 )
            // InternalFPML.g:8090:2: rule__PureSumValue__Group_1__0__Impl rule__PureSumValue__Group_1__1
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
    // InternalFPML.g:8097:1: rule__PureSumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__PureSumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8101:1: ( ( 'Right' ) )
            // InternalFPML.g:8102:1: ( 'Right' )
            {
            // InternalFPML.g:8102:1: ( 'Right' )
            // InternalFPML.g:8103:2: 'Right'
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
    // InternalFPML.g:8112:1: rule__PureSumValue__Group_1__1 : rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2 ;
    public final void rule__PureSumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8116:1: ( rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2 )
            // InternalFPML.g:8117:2: rule__PureSumValue__Group_1__1__Impl rule__PureSumValue__Group_1__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:8124:1: rule__PureSumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__PureSumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8128:1: ( ( '(' ) )
            // InternalFPML.g:8129:1: ( '(' )
            {
            // InternalFPML.g:8129:1: ( '(' )
            // InternalFPML.g:8130:2: '('
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
    // InternalFPML.g:8139:1: rule__PureSumValue__Group_1__2 : rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3 ;
    public final void rule__PureSumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8143:1: ( rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3 )
            // InternalFPML.g:8144:2: rule__PureSumValue__Group_1__2__Impl rule__PureSumValue__Group_1__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:8151:1: rule__PureSumValue__Group_1__2__Impl : ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__PureSumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8155:1: ( ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:8156:1: ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:8156:1: ( ( rule__PureSumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:8157:2: ( rule__PureSumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getPureSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:8158:2: ( rule__PureSumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:8158:3: rule__PureSumValue__SumAdtElement2Assignment_1_2
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
    // InternalFPML.g:8166:1: rule__PureSumValue__Group_1__3 : rule__PureSumValue__Group_1__3__Impl ;
    public final void rule__PureSumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8170:1: ( rule__PureSumValue__Group_1__3__Impl )
            // InternalFPML.g:8171:2: rule__PureSumValue__Group_1__3__Impl
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
    // InternalFPML.g:8177:1: rule__PureSumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__PureSumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8181:1: ( ( ')' ) )
            // InternalFPML.g:8182:1: ( ')' )
            {
            // InternalFPML.g:8182:1: ( ')' )
            // InternalFPML.g:8183:2: ')'
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
    // InternalFPML.g:8193:1: rule__EffectFullAdtValue__Group_0__0 : rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1 ;
    public final void rule__EffectFullAdtValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8197:1: ( rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1 )
            // InternalFPML.g:8198:2: rule__EffectFullAdtValue__Group_0__0__Impl rule__EffectFullAdtValue__Group_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:8205:1: rule__EffectFullAdtValue__Group_0__0__Impl : ( 'IO' ) ;
    public final void rule__EffectFullAdtValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8209:1: ( ( 'IO' ) )
            // InternalFPML.g:8210:1: ( 'IO' )
            {
            // InternalFPML.g:8210:1: ( 'IO' )
            // InternalFPML.g:8211:2: 'IO'
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
    // InternalFPML.g:8220:1: rule__EffectFullAdtValue__Group_0__1 : rule__EffectFullAdtValue__Group_0__1__Impl ;
    public final void rule__EffectFullAdtValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8224:1: ( rule__EffectFullAdtValue__Group_0__1__Impl )
            // InternalFPML.g:8225:2: rule__EffectFullAdtValue__Group_0__1__Impl
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
    // InternalFPML.g:8231:1: rule__EffectFullAdtValue__Group_0__1__Impl : ( rulePureAdtValue ) ;
    public final void rule__EffectFullAdtValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8235:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:8236:1: ( rulePureAdtValue )
            {
            // InternalFPML.g:8236:1: ( rulePureAdtValue )
            // InternalFPML.g:8237:2: rulePureAdtValue
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
    // InternalFPML.g:8247:1: rule__EffectFullProdValue__Group__0 : rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1 ;
    public final void rule__EffectFullProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8251:1: ( rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1 )
            // InternalFPML.g:8252:2: rule__EffectFullProdValue__Group__0__Impl rule__EffectFullProdValue__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:8259:1: rule__EffectFullProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__EffectFullProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8263:1: ( ( '(' ) )
            // InternalFPML.g:8264:1: ( '(' )
            {
            // InternalFPML.g:8264:1: ( '(' )
            // InternalFPML.g:8265:2: '('
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
    // InternalFPML.g:8274:1: rule__EffectFullProdValue__Group__1 : rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2 ;
    public final void rule__EffectFullProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8278:1: ( rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2 )
            // InternalFPML.g:8279:2: rule__EffectFullProdValue__Group__1__Impl rule__EffectFullProdValue__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:8286:1: rule__EffectFullProdValue__Group__1__Impl : ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__EffectFullProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8290:1: ( ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:8291:1: ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:8291:1: ( ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:8292:2: ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:8293:2: ( rule__EffectFullProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:8293:3: rule__EffectFullProdValue__ProdAdtElement1Assignment_1
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
    // InternalFPML.g:8301:1: rule__EffectFullProdValue__Group__2 : rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3 ;
    public final void rule__EffectFullProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8305:1: ( rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3 )
            // InternalFPML.g:8306:2: rule__EffectFullProdValue__Group__2__Impl rule__EffectFullProdValue__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:8313:1: rule__EffectFullProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__EffectFullProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8317:1: ( ( ',' ) )
            // InternalFPML.g:8318:1: ( ',' )
            {
            // InternalFPML.g:8318:1: ( ',' )
            // InternalFPML.g:8319:2: ','
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
    // InternalFPML.g:8328:1: rule__EffectFullProdValue__Group__3 : rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4 ;
    public final void rule__EffectFullProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8332:1: ( rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4 )
            // InternalFPML.g:8333:2: rule__EffectFullProdValue__Group__3__Impl rule__EffectFullProdValue__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:8340:1: rule__EffectFullProdValue__Group__3__Impl : ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__EffectFullProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8344:1: ( ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:8345:1: ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:8345:1: ( ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:8346:2: ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:8347:2: ( rule__EffectFullProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:8347:3: rule__EffectFullProdValue__ProdAdtElement2Assignment_3
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
    // InternalFPML.g:8355:1: rule__EffectFullProdValue__Group__4 : rule__EffectFullProdValue__Group__4__Impl ;
    public final void rule__EffectFullProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8359:1: ( rule__EffectFullProdValue__Group__4__Impl )
            // InternalFPML.g:8360:2: rule__EffectFullProdValue__Group__4__Impl
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
    // InternalFPML.g:8366:1: rule__EffectFullProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectFullProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8370:1: ( ( ')' ) )
            // InternalFPML.g:8371:1: ( ')' )
            {
            // InternalFPML.g:8371:1: ( ')' )
            // InternalFPML.g:8372:2: ')'
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
    // InternalFPML.g:8382:1: rule__EffectFullSumValue__Group_0__0 : rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1 ;
    public final void rule__EffectFullSumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8386:1: ( rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1 )
            // InternalFPML.g:8387:2: rule__EffectFullSumValue__Group_0__0__Impl rule__EffectFullSumValue__Group_0__1
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
    // InternalFPML.g:8394:1: rule__EffectFullSumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__EffectFullSumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8398:1: ( ( 'Left' ) )
            // InternalFPML.g:8399:1: ( 'Left' )
            {
            // InternalFPML.g:8399:1: ( 'Left' )
            // InternalFPML.g:8400:2: 'Left'
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
    // InternalFPML.g:8409:1: rule__EffectFullSumValue__Group_0__1 : rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2 ;
    public final void rule__EffectFullSumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8413:1: ( rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2 )
            // InternalFPML.g:8414:2: rule__EffectFullSumValue__Group_0__1__Impl rule__EffectFullSumValue__Group_0__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:8421:1: rule__EffectFullSumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__EffectFullSumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8425:1: ( ( '(' ) )
            // InternalFPML.g:8426:1: ( '(' )
            {
            // InternalFPML.g:8426:1: ( '(' )
            // InternalFPML.g:8427:2: '('
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
    // InternalFPML.g:8436:1: rule__EffectFullSumValue__Group_0__2 : rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3 ;
    public final void rule__EffectFullSumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8440:1: ( rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3 )
            // InternalFPML.g:8441:2: rule__EffectFullSumValue__Group_0__2__Impl rule__EffectFullSumValue__Group_0__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:8448:1: rule__EffectFullSumValue__Group_0__2__Impl : ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__EffectFullSumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8452:1: ( ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:8453:1: ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:8453:1: ( ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:8454:2: ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:8455:2: ( rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:8455:3: rule__EffectFullSumValue__SumAdtElement1Assignment_0_2
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
    // InternalFPML.g:8463:1: rule__EffectFullSumValue__Group_0__3 : rule__EffectFullSumValue__Group_0__3__Impl ;
    public final void rule__EffectFullSumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8467:1: ( rule__EffectFullSumValue__Group_0__3__Impl )
            // InternalFPML.g:8468:2: rule__EffectFullSumValue__Group_0__3__Impl
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
    // InternalFPML.g:8474:1: rule__EffectFullSumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__EffectFullSumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8478:1: ( ( ')' ) )
            // InternalFPML.g:8479:1: ( ')' )
            {
            // InternalFPML.g:8479:1: ( ')' )
            // InternalFPML.g:8480:2: ')'
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
    // InternalFPML.g:8490:1: rule__EffectFullSumValue__Group_1__0 : rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1 ;
    public final void rule__EffectFullSumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8494:1: ( rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1 )
            // InternalFPML.g:8495:2: rule__EffectFullSumValue__Group_1__0__Impl rule__EffectFullSumValue__Group_1__1
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
    // InternalFPML.g:8502:1: rule__EffectFullSumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__EffectFullSumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8506:1: ( ( 'Right' ) )
            // InternalFPML.g:8507:1: ( 'Right' )
            {
            // InternalFPML.g:8507:1: ( 'Right' )
            // InternalFPML.g:8508:2: 'Right'
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
    // InternalFPML.g:8517:1: rule__EffectFullSumValue__Group_1__1 : rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2 ;
    public final void rule__EffectFullSumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8521:1: ( rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2 )
            // InternalFPML.g:8522:2: rule__EffectFullSumValue__Group_1__1__Impl rule__EffectFullSumValue__Group_1__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:8529:1: rule__EffectFullSumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EffectFullSumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8533:1: ( ( '(' ) )
            // InternalFPML.g:8534:1: ( '(' )
            {
            // InternalFPML.g:8534:1: ( '(' )
            // InternalFPML.g:8535:2: '('
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
    // InternalFPML.g:8544:1: rule__EffectFullSumValue__Group_1__2 : rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3 ;
    public final void rule__EffectFullSumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8548:1: ( rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3 )
            // InternalFPML.g:8549:2: rule__EffectFullSumValue__Group_1__2__Impl rule__EffectFullSumValue__Group_1__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:8556:1: rule__EffectFullSumValue__Group_1__2__Impl : ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__EffectFullSumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8560:1: ( ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:8561:1: ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:8561:1: ( ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:8562:2: ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:8563:2: ( rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:8563:3: rule__EffectFullSumValue__SumAdtElement2Assignment_1_2
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
    // InternalFPML.g:8571:1: rule__EffectFullSumValue__Group_1__3 : rule__EffectFullSumValue__Group_1__3__Impl ;
    public final void rule__EffectFullSumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8575:1: ( rule__EffectFullSumValue__Group_1__3__Impl )
            // InternalFPML.g:8576:2: rule__EffectFullSumValue__Group_1__3__Impl
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
    // InternalFPML.g:8582:1: rule__EffectFullSumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EffectFullSumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8586:1: ( ( ')' ) )
            // InternalFPML.g:8587:1: ( ')' )
            {
            // InternalFPML.g:8587:1: ( ')' )
            // InternalFPML.g:8588:2: ')'
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
    // InternalFPML.g:8598:1: rule__IntToString__Group__0 : rule__IntToString__Group__0__Impl rule__IntToString__Group__1 ;
    public final void rule__IntToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8602:1: ( rule__IntToString__Group__0__Impl rule__IntToString__Group__1 )
            // InternalFPML.g:8603:2: rule__IntToString__Group__0__Impl rule__IntToString__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalFPML.g:8610:1: rule__IntToString__Group__0__Impl : ( () ) ;
    public final void rule__IntToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8614:1: ( ( () ) )
            // InternalFPML.g:8615:1: ( () )
            {
            // InternalFPML.g:8615:1: ( () )
            // InternalFPML.g:8616:2: ()
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 
            // InternalFPML.g:8617:2: ()
            // InternalFPML.g:8617:3: 
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
    // InternalFPML.g:8625:1: rule__IntToString__Group__1 : rule__IntToString__Group__1__Impl ;
    public final void rule__IntToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8629:1: ( rule__IntToString__Group__1__Impl )
            // InternalFPML.g:8630:2: rule__IntToString__Group__1__Impl
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
    // InternalFPML.g:8636:1: rule__IntToString__Group__1__Impl : ( 'IntToString' ) ;
    public final void rule__IntToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8640:1: ( ( 'IntToString' ) )
            // InternalFPML.g:8641:1: ( 'IntToString' )
            {
            // InternalFPML.g:8641:1: ( 'IntToString' )
            // InternalFPML.g:8642:2: 'IntToString'
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
    // InternalFPML.g:8652:1: rule__IntPow__Group__0 : rule__IntPow__Group__0__Impl rule__IntPow__Group__1 ;
    public final void rule__IntPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8656:1: ( rule__IntPow__Group__0__Impl rule__IntPow__Group__1 )
            // InternalFPML.g:8657:2: rule__IntPow__Group__0__Impl rule__IntPow__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFPML.g:8664:1: rule__IntPow__Group__0__Impl : ( () ) ;
    public final void rule__IntPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8668:1: ( ( () ) )
            // InternalFPML.g:8669:1: ( () )
            {
            // InternalFPML.g:8669:1: ( () )
            // InternalFPML.g:8670:2: ()
            {
             before(grammarAccess.getIntPowAccess().getIntPowAction_0()); 
            // InternalFPML.g:8671:2: ()
            // InternalFPML.g:8671:3: 
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
    // InternalFPML.g:8679:1: rule__IntPow__Group__1 : rule__IntPow__Group__1__Impl ;
    public final void rule__IntPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8683:1: ( rule__IntPow__Group__1__Impl )
            // InternalFPML.g:8684:2: rule__IntPow__Group__1__Impl
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
    // InternalFPML.g:8690:1: rule__IntPow__Group__1__Impl : ( 'IntPow' ) ;
    public final void rule__IntPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8694:1: ( ( 'IntPow' ) )
            // InternalFPML.g:8695:1: ( 'IntPow' )
            {
            // InternalFPML.g:8695:1: ( 'IntPow' )
            // InternalFPML.g:8696:2: 'IntPow'
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
    // InternalFPML.g:8706:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8710:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalFPML.g:8711:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalFPML.g:8718:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8722:1: ( ( () ) )
            // InternalFPML.g:8723:1: ( () )
            {
            // InternalFPML.g:8723:1: ( () )
            // InternalFPML.g:8724:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // InternalFPML.g:8725:2: ()
            // InternalFPML.g:8725:3: 
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
    // InternalFPML.g:8733:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8737:1: ( rule__Plus__Group__1__Impl )
            // InternalFPML.g:8738:2: rule__Plus__Group__1__Impl
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
    // InternalFPML.g:8744:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8748:1: ( ( '+' ) )
            // InternalFPML.g:8749:1: ( '+' )
            {
            // InternalFPML.g:8749:1: ( '+' )
            // InternalFPML.g:8750:2: '+'
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
    // InternalFPML.g:8760:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8764:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalFPML.g:8765:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalFPML.g:8772:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8776:1: ( ( () ) )
            // InternalFPML.g:8777:1: ( () )
            {
            // InternalFPML.g:8777:1: ( () )
            // InternalFPML.g:8778:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // InternalFPML.g:8779:2: ()
            // InternalFPML.g:8779:3: 
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
    // InternalFPML.g:8787:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8791:1: ( rule__Minus__Group__1__Impl )
            // InternalFPML.g:8792:2: rule__Minus__Group__1__Impl
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
    // InternalFPML.g:8798:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8802:1: ( ( '-' ) )
            // InternalFPML.g:8803:1: ( '-' )
            {
            // InternalFPML.g:8803:1: ( '-' )
            // InternalFPML.g:8804:2: '-'
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
    // InternalFPML.g:8814:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8818:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalFPML.g:8819:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalFPML.g:8826:1: rule__Times__Group__0__Impl : ( () ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8830:1: ( ( () ) )
            // InternalFPML.g:8831:1: ( () )
            {
            // InternalFPML.g:8831:1: ( () )
            // InternalFPML.g:8832:2: ()
            {
             before(grammarAccess.getTimesAccess().getTimesAction_0()); 
            // InternalFPML.g:8833:2: ()
            // InternalFPML.g:8833:3: 
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
    // InternalFPML.g:8841:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8845:1: ( rule__Times__Group__1__Impl )
            // InternalFPML.g:8846:2: rule__Times__Group__1__Impl
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
    // InternalFPML.g:8852:1: rule__Times__Group__1__Impl : ( '*' ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8856:1: ( ( '*' ) )
            // InternalFPML.g:8857:1: ( '*' )
            {
            // InternalFPML.g:8857:1: ( '*' )
            // InternalFPML.g:8858:2: '*'
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
    // InternalFPML.g:8868:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8872:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // InternalFPML.g:8873:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalFPML.g:8880:1: rule__Mod__Group__0__Impl : ( () ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8884:1: ( ( () ) )
            // InternalFPML.g:8885:1: ( () )
            {
            // InternalFPML.g:8885:1: ( () )
            // InternalFPML.g:8886:2: ()
            {
             before(grammarAccess.getModAccess().getModAction_0()); 
            // InternalFPML.g:8887:2: ()
            // InternalFPML.g:8887:3: 
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
    // InternalFPML.g:8895:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8899:1: ( rule__Mod__Group__1__Impl )
            // InternalFPML.g:8900:2: rule__Mod__Group__1__Impl
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
    // InternalFPML.g:8906:1: rule__Mod__Group__1__Impl : ( 'mod' ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8910:1: ( ( 'mod' ) )
            // InternalFPML.g:8911:1: ( 'mod' )
            {
            // InternalFPML.g:8911:1: ( 'mod' )
            // InternalFPML.g:8912:2: 'mod'
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
    // InternalFPML.g:8922:1: rule__ApplyF__Group__0 : rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 ;
    public final void rule__ApplyF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8926:1: ( rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 )
            // InternalFPML.g:8927:2: rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:8934:1: rule__ApplyF__Group__0__Impl : ( () ) ;
    public final void rule__ApplyF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8938:1: ( ( () ) )
            // InternalFPML.g:8939:1: ( () )
            {
            // InternalFPML.g:8939:1: ( () )
            // InternalFPML.g:8940:2: ()
            {
             before(grammarAccess.getApplyFAccess().getApplyFAction_0()); 
            // InternalFPML.g:8941:2: ()
            // InternalFPML.g:8941:3: 
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
    // InternalFPML.g:8949:1: rule__ApplyF__Group__1 : rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 ;
    public final void rule__ApplyF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8953:1: ( rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 )
            // InternalFPML.g:8954:2: rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2
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
    // InternalFPML.g:8961:1: rule__ApplyF__Group__1__Impl : ( 'applyF' ) ;
    public final void rule__ApplyF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8965:1: ( ( 'applyF' ) )
            // InternalFPML.g:8966:1: ( 'applyF' )
            {
            // InternalFPML.g:8966:1: ( 'applyF' )
            // InternalFPML.g:8967:2: 'applyF'
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
    // InternalFPML.g:8976:1: rule__ApplyF__Group__2 : rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 ;
    public final void rule__ApplyF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8980:1: ( rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 )
            // InternalFPML.g:8981:2: rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3
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
    // InternalFPML.g:8988:1: rule__ApplyF__Group__2__Impl : ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8992:1: ( ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:8993:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:8993:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:8994:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:8995:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            // InternalFPML.g:8995:3: rule__ApplyF__FunctionTypeAssignment_2
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
    // InternalFPML.g:9003:1: rule__ApplyF__Group__3 : rule__ApplyF__Group__3__Impl ;
    public final void rule__ApplyF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9007:1: ( rule__ApplyF__Group__3__Impl )
            // InternalFPML.g:9008:2: rule__ApplyF__Group__3__Impl
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
    // InternalFPML.g:9014:1: rule__ApplyF__Group__3__Impl : ( ( rule__ApplyF__ValueAssignment_3 ) ) ;
    public final void rule__ApplyF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9018:1: ( ( ( rule__ApplyF__ValueAssignment_3 ) ) )
            // InternalFPML.g:9019:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            {
            // InternalFPML.g:9019:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            // InternalFPML.g:9020:2: ( rule__ApplyF__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFAccess().getValueAssignment_3()); 
            // InternalFPML.g:9021:2: ( rule__ApplyF__ValueAssignment_3 )
            // InternalFPML.g:9021:3: rule__ApplyF__ValueAssignment_3
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
    // InternalFPML.g:9030:1: rule__PrimitivePrint__Group__0 : rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 ;
    public final void rule__PrimitivePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9034:1: ( rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 )
            // InternalFPML.g:9035:2: rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalFPML.g:9042:1: rule__PrimitivePrint__Group__0__Impl : ( () ) ;
    public final void rule__PrimitivePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9046:1: ( ( () ) )
            // InternalFPML.g:9047:1: ( () )
            {
            // InternalFPML.g:9047:1: ( () )
            // InternalFPML.g:9048:2: ()
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 
            // InternalFPML.g:9049:2: ()
            // InternalFPML.g:9049:3: 
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
    // InternalFPML.g:9057:1: rule__PrimitivePrint__Group__1 : rule__PrimitivePrint__Group__1__Impl ;
    public final void rule__PrimitivePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9061:1: ( rule__PrimitivePrint__Group__1__Impl )
            // InternalFPML.g:9062:2: rule__PrimitivePrint__Group__1__Impl
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
    // InternalFPML.g:9068:1: rule__PrimitivePrint__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrimitivePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9072:1: ( ( 'print' ) )
            // InternalFPML.g:9073:1: ( 'print' )
            {
            // InternalFPML.g:9073:1: ( 'print' )
            // InternalFPML.g:9074:2: 'print'
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
    // InternalFPML.g:9084:1: rule__PrimitiveRandom__Group__0 : rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1 ;
    public final void rule__PrimitiveRandom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9088:1: ( rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1 )
            // InternalFPML.g:9089:2: rule__PrimitiveRandom__Group__0__Impl rule__PrimitiveRandom__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalFPML.g:9096:1: rule__PrimitiveRandom__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveRandom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9100:1: ( ( () ) )
            // InternalFPML.g:9101:1: ( () )
            {
            // InternalFPML.g:9101:1: ( () )
            // InternalFPML.g:9102:2: ()
            {
             before(grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0()); 
            // InternalFPML.g:9103:2: ()
            // InternalFPML.g:9103:3: 
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
    // InternalFPML.g:9111:1: rule__PrimitiveRandom__Group__1 : rule__PrimitiveRandom__Group__1__Impl ;
    public final void rule__PrimitiveRandom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9115:1: ( rule__PrimitiveRandom__Group__1__Impl )
            // InternalFPML.g:9116:2: rule__PrimitiveRandom__Group__1__Impl
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
    // InternalFPML.g:9122:1: rule__PrimitiveRandom__Group__1__Impl : ( 'randomInt' ) ;
    public final void rule__PrimitiveRandom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9126:1: ( ( 'randomInt' ) )
            // InternalFPML.g:9127:1: ( 'randomInt' )
            {
            // InternalFPML.g:9127:1: ( 'randomInt' )
            // InternalFPML.g:9128:2: 'randomInt'
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


    // $ANTLR start "rule__ApplyFIO__Group__0"
    // InternalFPML.g:9138:1: rule__ApplyFIO__Group__0 : rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 ;
    public final void rule__ApplyFIO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9142:1: ( rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 )
            // InternalFPML.g:9143:2: rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalFPML.g:9150:1: rule__ApplyFIO__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFIO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9154:1: ( ( () ) )
            // InternalFPML.g:9155:1: ( () )
            {
            // InternalFPML.g:9155:1: ( () )
            // InternalFPML.g:9156:2: ()
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOAction_0()); 
            // InternalFPML.g:9157:2: ()
            // InternalFPML.g:9157:3: 
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
    // InternalFPML.g:9165:1: rule__ApplyFIO__Group__1 : rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 ;
    public final void rule__ApplyFIO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9169:1: ( rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 )
            // InternalFPML.g:9170:2: rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:9177:1: rule__ApplyFIO__Group__1__Impl : ( 'applyFIO' ) ;
    public final void rule__ApplyFIO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9181:1: ( ( 'applyFIO' ) )
            // InternalFPML.g:9182:1: ( 'applyFIO' )
            {
            // InternalFPML.g:9182:1: ( 'applyFIO' )
            // InternalFPML.g:9183:2: 'applyFIO'
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalFPML.g:9192:1: rule__ApplyFIO__Group__2 : rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 ;
    public final void rule__ApplyFIO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9196:1: ( rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 )
            // InternalFPML.g:9197:2: rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3
            {
            pushFollow(FOLLOW_58);
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
    // InternalFPML.g:9204:1: rule__ApplyFIO__Group__2__Impl : ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyFIO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9208:1: ( ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:9209:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:9209:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:9210:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFIOAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:9211:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            // InternalFPML.g:9211:3: rule__ApplyFIO__FunctionTypeAssignment_2
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
    // InternalFPML.g:9219:1: rule__ApplyFIO__Group__3 : rule__ApplyFIO__Group__3__Impl ;
    public final void rule__ApplyFIO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9223:1: ( rule__ApplyFIO__Group__3__Impl )
            // InternalFPML.g:9224:2: rule__ApplyFIO__Group__3__Impl
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
    // InternalFPML.g:9230:1: rule__ApplyFIO__Group__3__Impl : ( ( rule__ApplyFIO__ValueAssignment_3 ) ) ;
    public final void rule__ApplyFIO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9234:1: ( ( ( rule__ApplyFIO__ValueAssignment_3 ) ) )
            // InternalFPML.g:9235:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            {
            // InternalFPML.g:9235:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            // InternalFPML.g:9236:2: ( rule__ApplyFIO__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFIOAccess().getValueAssignment_3()); 
            // InternalFPML.g:9237:2: ( rule__ApplyFIO__ValueAssignment_3 )
            // InternalFPML.g:9237:3: rule__ApplyFIO__ValueAssignment_3
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
    // InternalFPML.g:9246:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9250:1: ( ( rulePureBlock ) )
            // InternalFPML.g:9251:2: ( rulePureBlock )
            {
            // InternalFPML.g:9251:2: ( rulePureBlock )
            // InternalFPML.g:9252:3: rulePureBlock
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
    // InternalFPML.g:9261:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9265:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:9266:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:9266:2: ( ruleEffectFullBlock )
            // InternalFPML.g:9267:3: ruleEffectFullBlock
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
    // InternalFPML.g:9276:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9280:1: ( ( rulePureDataBlock ) )
            // InternalFPML.g:9281:2: ( rulePureDataBlock )
            {
            // InternalFPML.g:9281:2: ( rulePureDataBlock )
            // InternalFPML.g:9282:3: rulePureDataBlock
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
    // InternalFPML.g:9291:1: rule__PureBlock__ElementsAssignment_3 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9295:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:9296:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:9296:2: ( rulePureFunctionBlock )
            // InternalFPML.g:9297:3: rulePureFunctionBlock
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
    // InternalFPML.g:9306:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunctionDefinition ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9310:1: ( ( rulePureFunctionDefinition ) )
            // InternalFPML.g:9311:2: ( rulePureFunctionDefinition )
            {
            // InternalFPML.g:9311:2: ( rulePureFunctionDefinition )
            // InternalFPML.g:9312:3: rulePureFunctionDefinition
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
    // InternalFPML.g:9321:1: rule__PureDataBlock__ElementsAssignment_2 : ( rulePureData ) ;
    public final void rule__PureDataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9325:1: ( ( rulePureData ) )
            // InternalFPML.g:9326:2: ( rulePureData )
            {
            // InternalFPML.g:9326:2: ( rulePureData )
            // InternalFPML.g:9327:3: rulePureData
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
    // InternalFPML.g:9336:1: rule__PureDataBlock__ValueAssignment_3 : ( rulePureValueBlock ) ;
    public final void rule__PureDataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9340:1: ( ( rulePureValueBlock ) )
            // InternalFPML.g:9341:2: ( rulePureValueBlock )
            {
            // InternalFPML.g:9341:2: ( rulePureValueBlock )
            // InternalFPML.g:9342:3: rulePureValueBlock
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
    // InternalFPML.g:9351:1: rule__PureValueBlock__ElementsAssignment_2 : ( rulePureValue ) ;
    public final void rule__PureValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9355:1: ( ( rulePureValue ) )
            // InternalFPML.g:9356:2: ( rulePureValue )
            {
            // InternalFPML.g:9356:2: ( rulePureValue )
            // InternalFPML.g:9357:3: rulePureValue
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
    // InternalFPML.g:9366:1: rule__EffectFullBlock__ElementsAssignment_2 : ( ruleEffectFullDataBlock ) ;
    public final void rule__EffectFullBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9370:1: ( ( ruleEffectFullDataBlock ) )
            // InternalFPML.g:9371:2: ( ruleEffectFullDataBlock )
            {
            // InternalFPML.g:9371:2: ( ruleEffectFullDataBlock )
            // InternalFPML.g:9372:3: ruleEffectFullDataBlock
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
    // InternalFPML.g:9381:1: rule__EffectFullBlock__ElementsAssignment_3 : ( ruleEffectFullFunctionBlock ) ;
    public final void rule__EffectFullBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9385:1: ( ( ruleEffectFullFunctionBlock ) )
            // InternalFPML.g:9386:2: ( ruleEffectFullFunctionBlock )
            {
            // InternalFPML.g:9386:2: ( ruleEffectFullFunctionBlock )
            // InternalFPML.g:9387:3: ruleEffectFullFunctionBlock
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
    // InternalFPML.g:9396:1: rule__EffectFullDataBlock__ElementsAssignment_2 : ( ruleEffectFullData ) ;
    public final void rule__EffectFullDataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9400:1: ( ( ruleEffectFullData ) )
            // InternalFPML.g:9401:2: ( ruleEffectFullData )
            {
            // InternalFPML.g:9401:2: ( ruleEffectFullData )
            // InternalFPML.g:9402:3: ruleEffectFullData
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
    // InternalFPML.g:9411:1: rule__EffectFullDataBlock__ValueAssignment_3 : ( ruleEffectFullValueBlock ) ;
    public final void rule__EffectFullDataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9415:1: ( ( ruleEffectFullValueBlock ) )
            // InternalFPML.g:9416:2: ( ruleEffectFullValueBlock )
            {
            // InternalFPML.g:9416:2: ( ruleEffectFullValueBlock )
            // InternalFPML.g:9417:3: ruleEffectFullValueBlock
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
    // InternalFPML.g:9426:1: rule__EffectFullValueBlock__ElementsAssignment_2 : ( ruleEffectFullValue ) ;
    public final void rule__EffectFullValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9430:1: ( ( ruleEffectFullValue ) )
            // InternalFPML.g:9431:2: ( ruleEffectFullValue )
            {
            // InternalFPML.g:9431:2: ( ruleEffectFullValue )
            // InternalFPML.g:9432:3: ruleEffectFullValue
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
    // InternalFPML.g:9441:1: rule__EffectFullFunctionBlock__FeaturesAssignment_2 : ( ruleEffectFullFunctionDefinition ) ;
    public final void rule__EffectFullFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9445:1: ( ( ruleEffectFullFunctionDefinition ) )
            // InternalFPML.g:9446:2: ( ruleEffectFullFunctionDefinition )
            {
            // InternalFPML.g:9446:2: ( ruleEffectFullFunctionDefinition )
            // InternalFPML.g:9447:3: ruleEffectFullFunctionDefinition
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
    // InternalFPML.g:9456:1: rule__EffectFullFunctionBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullFunctionBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9460:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:9461:2: ( ruleMainFunc )
            {
            // InternalFPML.g:9461:2: ( ruleMainFunc )
            // InternalFPML.g:9462:3: ruleMainFunc
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
    // InternalFPML.g:9471:1: rule__PureData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PureData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9475:1: ( ( RULE_ID ) )
            // InternalFPML.g:9476:2: ( RULE_ID )
            {
            // InternalFPML.g:9476:2: ( RULE_ID )
            // InternalFPML.g:9477:3: RULE_ID
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
    // InternalFPML.g:9486:1: rule__PureData__ContentAssignment_2 : ( rulePureAdtType ) ;
    public final void rule__PureData__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9490:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9491:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9491:2: ( rulePureAdtType )
            // InternalFPML.g:9492:3: rulePureAdtType
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
    // InternalFPML.g:9501:1: rule__PureValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PureValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9505:1: ( ( RULE_ID ) )
            // InternalFPML.g:9506:2: ( RULE_ID )
            {
            // InternalFPML.g:9506:2: ( RULE_ID )
            // InternalFPML.g:9507:3: RULE_ID
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
    // InternalFPML.g:9516:1: rule__PureValue__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__PureValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9520:1: ( ( ruleExpression ) )
            // InternalFPML.g:9521:2: ( ruleExpression )
            {
            // InternalFPML.g:9521:2: ( ruleExpression )
            // InternalFPML.g:9522:3: ruleExpression
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
    // InternalFPML.g:9531:1: rule__PureAdtType__PureAdtElement1Assignment_1_1 : ( rulePureAdtType ) ;
    public final void rule__PureAdtType__PureAdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9535:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9536:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9536:2: ( rulePureAdtType )
            // InternalFPML.g:9537:3: rulePureAdtType
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
    // InternalFPML.g:9546:1: rule__PureAdtType__PureAdtElement2Assignment_1_2 : ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__PureAdtType__PureAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9550:1: ( ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:9551:2: ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:9551:2: ( ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:9552:3: ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:9553:3: ( rule__PureAdtType__PureAdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:9553:4: rule__PureAdtType__PureAdtElement2Alternatives_1_2_0
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
    // InternalFPML.g:9561:1: rule__PureSumType__AdtElementAssignment_1 : ( rulePureAdtType ) ;
    public final void rule__PureSumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9565:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9566:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9566:2: ( rulePureAdtType )
            // InternalFPML.g:9567:3: rulePureAdtType
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
    // InternalFPML.g:9576:1: rule__PureProdType__AdtElementAssignment_1 : ( rulePureAdtType ) ;
    public final void rule__PureProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9580:1: ( ( rulePureAdtType ) )
            // InternalFPML.g:9581:2: ( rulePureAdtType )
            {
            // InternalFPML.g:9581:2: ( rulePureAdtType )
            // InternalFPML.g:9582:3: rulePureAdtType
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
    // InternalFPML.g:9591:1: rule__EffectFullData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EffectFullData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9595:1: ( ( RULE_ID ) )
            // InternalFPML.g:9596:2: ( RULE_ID )
            {
            // InternalFPML.g:9596:2: ( RULE_ID )
            // InternalFPML.g:9597:3: RULE_ID
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
    // InternalFPML.g:9606:1: rule__EffectFullData__ContentAssignment_2 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullData__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9610:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9611:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9611:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9612:3: ruleEffectFullAdtType
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
    // InternalFPML.g:9621:1: rule__EffectFullValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9625:1: ( ( RULE_ID ) )
            // InternalFPML.g:9626:2: ( RULE_ID )
            {
            // InternalFPML.g:9626:2: ( RULE_ID )
            // InternalFPML.g:9627:3: RULE_ID
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
    // InternalFPML.g:9636:1: rule__EffectFullValue__ValueAssignment_3 : ( ruleEffectFullExpression ) ;
    public final void rule__EffectFullValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9640:1: ( ( ruleEffectFullExpression ) )
            // InternalFPML.g:9641:2: ( ruleEffectFullExpression )
            {
            // InternalFPML.g:9641:2: ( ruleEffectFullExpression )
            // InternalFPML.g:9642:3: ruleEffectFullExpression
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
    // InternalFPML.g:9651:1: rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullAdtType__EffectFullAdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9655:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9656:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9656:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9657:3: ruleEffectFullAdtType
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
    // InternalFPML.g:9666:1: rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2 : ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__EffectFullAdtType__EffectFullAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9670:1: ( ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:9671:2: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:9671:2: ( ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:9672:3: ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:9673:3: ( rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:9673:4: rule__EffectFullAdtType__EffectFullAdtElement2Alternatives_1_2_0
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
    // InternalFPML.g:9681:1: rule__EffectFullSumType__AdtElementAssignment_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullSumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9685:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9686:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9686:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9687:3: ruleEffectFullAdtType
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
    // InternalFPML.g:9696:1: rule__EffectFullProdType__AdtElementAssignment_1 : ( ruleEffectFullAdtType ) ;
    public final void rule__EffectFullProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9700:1: ( ( ruleEffectFullAdtType ) )
            // InternalFPML.g:9701:2: ( ruleEffectFullAdtType )
            {
            // InternalFPML.g:9701:2: ( ruleEffectFullAdtType )
            // InternalFPML.g:9702:3: ruleEffectFullAdtType
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
    // InternalFPML.g:9711:1: rule__PureFunctionDefinition__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9715:1: ( ( ruleValueType ) )
            // InternalFPML.g:9716:2: ( ruleValueType )
            {
            // InternalFPML.g:9716:2: ( ruleValueType )
            // InternalFPML.g:9717:3: ruleValueType
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
    // InternalFPML.g:9726:1: rule__PureFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9730:1: ( ( RULE_ID ) )
            // InternalFPML.g:9731:2: ( RULE_ID )
            {
            // InternalFPML.g:9731:2: ( RULE_ID )
            // InternalFPML.g:9732:3: RULE_ID
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
    // InternalFPML.g:9741:1: rule__PureFunctionDefinition__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9745:1: ( ( ruleArgument ) )
            // InternalFPML.g:9746:2: ( ruleArgument )
            {
            // InternalFPML.g:9746:2: ( ruleArgument )
            // InternalFPML.g:9747:3: ruleArgument
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
    // InternalFPML.g:9756:1: rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1 : ( ruleAdditionalPureArgument ) ;
    public final void rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9760:1: ( ( ruleAdditionalPureArgument ) )
            // InternalFPML.g:9761:2: ( ruleAdditionalPureArgument )
            {
            // InternalFPML.g:9761:2: ( ruleAdditionalPureArgument )
            // InternalFPML.g:9762:3: ruleAdditionalPureArgument
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
    // InternalFPML.g:9771:1: rule__PureFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9775:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:9776:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:9776:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:9777:3: ruleFunctionBodyPure
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
    // InternalFPML.g:9786:1: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9790:1: ( ( ruleIOType ) )
            // InternalFPML.g:9791:2: ( ruleIOType )
            {
            // InternalFPML.g:9791:2: ( ruleIOType )
            // InternalFPML.g:9792:3: ruleIOType
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
    // InternalFPML.g:9801:1: rule__EffectFullFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9805:1: ( ( RULE_ID ) )
            // InternalFPML.g:9806:2: ( RULE_ID )
            {
            // InternalFPML.g:9806:2: ( RULE_ID )
            // InternalFPML.g:9807:3: RULE_ID
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
    // InternalFPML.g:9816:1: rule__EffectFullFunctionDefinition__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9820:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:9821:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:9821:2: ( ruleEffectFullArgument )
            // InternalFPML.g:9822:3: ruleEffectFullArgument
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
    // InternalFPML.g:9831:1: rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1 : ( ruleAdditionalEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9835:1: ( ( ruleAdditionalEffectFullArgument ) )
            // InternalFPML.g:9836:2: ( ruleAdditionalEffectFullArgument )
            {
            // InternalFPML.g:9836:2: ( ruleAdditionalEffectFullArgument )
            // InternalFPML.g:9837:3: ruleAdditionalEffectFullArgument
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
    // InternalFPML.g:9846:1: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9850:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:9851:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:9851:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:9852:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:9861:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9865:1: ( ( ruleUnitType ) )
            // InternalFPML.g:9866:2: ( ruleUnitType )
            {
            // InternalFPML.g:9866:2: ( ruleUnitType )
            // InternalFPML.g:9867:3: ruleUnitType
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
    // InternalFPML.g:9876:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9880:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:9881:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:9881:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:9882:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:9891:1: rule__AdditionalPureArgument__Arg2Assignment : ( ruleArgument ) ;
    public final void rule__AdditionalPureArgument__Arg2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9895:1: ( ( ruleArgument ) )
            // InternalFPML.g:9896:2: ( ruleArgument )
            {
            // InternalFPML.g:9896:2: ( ruleArgument )
            // InternalFPML.g:9897:3: ruleArgument
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
    // InternalFPML.g:9906:1: rule__AdditionalEffectFullArgument__Arg2Assignment : ( ruleEffectFullArgument ) ;
    public final void rule__AdditionalEffectFullArgument__Arg2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9910:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:9911:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:9911:2: ( ruleEffectFullArgument )
            // InternalFPML.g:9912:3: ruleEffectFullArgument
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
    // InternalFPML.g:9921:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9925:1: ( ( ruleType ) )
            // InternalFPML.g:9926:2: ( ruleType )
            {
            // InternalFPML.g:9926:2: ( ruleType )
            // InternalFPML.g:9927:3: ruleType
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
    // InternalFPML.g:9936:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9940:1: ( ( RULE_ID ) )
            // InternalFPML.g:9941:2: ( RULE_ID )
            {
            // InternalFPML.g:9941:2: ( RULE_ID )
            // InternalFPML.g:9942:3: RULE_ID
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
    // InternalFPML.g:9951:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9955:1: ( ( ruleValueType ) )
            // InternalFPML.g:9956:2: ( ruleValueType )
            {
            // InternalFPML.g:9956:2: ( ruleValueType )
            // InternalFPML.g:9957:3: ruleValueType
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
    // InternalFPML.g:9966:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9970:1: ( ( RULE_ID ) )
            // InternalFPML.g:9971:2: ( RULE_ID )
            {
            // InternalFPML.g:9971:2: ( RULE_ID )
            // InternalFPML.g:9972:3: RULE_ID
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
    // InternalFPML.g:9981:1: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:9985:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:9986:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:9986:2: ( ( RULE_ID ) )
            // InternalFPML.g:9987:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 
            // InternalFPML.g:9988:3: ( RULE_ID )
            // InternalFPML.g:9989:4: RULE_ID
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
    // InternalFPML.g:10000:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10004:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:10005:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:10005:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:10006:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:10015:1: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10019:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:10020:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:10020:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:10021:3: rulePrimitivePureFunction
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
    // InternalFPML.g:10030:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10034:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:10035:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:10035:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:10036:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:10045:1: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10049:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10050:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10050:2: ( ( RULE_ID ) )
            // InternalFPML.g:10051:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 
            // InternalFPML.g:10052:3: ( RULE_ID )
            // InternalFPML.g:10053:4: RULE_ID
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
    // InternalFPML.g:10064:1: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10068:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:10069:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:10069:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:10070:3: rulePrimitivePureFunction
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
    // InternalFPML.g:10079:1: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10083:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10084:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10084:2: ( ( RULE_ID ) )
            // InternalFPML.g:10085:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0()); 
            // InternalFPML.g:10086:3: ( RULE_ID )
            // InternalFPML.g:10087:4: RULE_ID
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
    // InternalFPML.g:10098:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10102:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:10103:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:10103:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:10104:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:10113:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 : ( rulePrimitiveFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10117:1: ( ( rulePrimitiveFunction ) )
            // InternalFPML.g:10118:2: ( rulePrimitiveFunction )
            {
            // InternalFPML.g:10118:2: ( rulePrimitiveFunction )
            // InternalFPML.g:10119:3: rulePrimitiveFunction
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
    // InternalFPML.g:10128:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10132:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:10133:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:10133:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:10134:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:10143:1: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10147:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10148:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10148:2: ( ( RULE_ID ) )
            // InternalFPML.g:10149:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceCrossReference_0_1_0()); 
            // InternalFPML.g:10150:3: ( RULE_ID )
            // InternalFPML.g:10151:4: RULE_ID
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
    // InternalFPML.g:10162:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitiveFunction ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10166:1: ( ( rulePrimitiveFunction ) )
            // InternalFPML.g:10167:2: ( rulePrimitiveFunction )
            {
            // InternalFPML.g:10167:2: ( rulePrimitiveFunction )
            // InternalFPML.g:10168:3: rulePrimitiveFunction
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
    // InternalFPML.g:10177:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10181:1: ( ( ruleType ) )
            // InternalFPML.g:10182:2: ( ruleType )
            {
            // InternalFPML.g:10182:2: ( ruleType )
            // InternalFPML.g:10183:3: ruleType
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
    // InternalFPML.g:10192:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10196:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:10197:2: ( ( 'int' ) )
            {
            // InternalFPML.g:10197:2: ( ( 'int' ) )
            // InternalFPML.g:10198:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:10199:3: ( 'int' )
            // InternalFPML.g:10200:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalFPML.g:10211:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10215:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:10216:2: ( ( 'String' ) )
            {
            // InternalFPML.g:10216:2: ( ( 'String' ) )
            // InternalFPML.g:10217:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:10218:3: ( 'String' )
            // InternalFPML.g:10219:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalFPML.g:10230:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10234:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:10235:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:10235:2: ( ( 'Unit' ) )
            // InternalFPML.g:10236:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:10237:3: ( 'Unit' )
            // InternalFPML.g:10238:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalFPML.g:10249:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10253:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10254:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10254:2: ( ( RULE_ID ) )
            // InternalFPML.g:10255:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypePureDataCrossReference_2_0()); 
            // InternalFPML.g:10256:3: ( RULE_ID )
            // InternalFPML.g:10257:4: RULE_ID
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
    // InternalFPML.g:10268:1: rule__EffectFullDataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullDataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10272:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10273:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10273:2: ( ( RULE_ID ) )
            // InternalFPML.g:10274:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataCrossReference_2_0()); 
            // InternalFPML.g:10275:3: ( RULE_ID )
            // InternalFPML.g:10276:4: RULE_ID
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
    // InternalFPML.g:10287:1: rule__PureFunctionType__ArgTypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10291:1: ( ( ruleValueType ) )
            // InternalFPML.g:10292:2: ( ruleValueType )
            {
            // InternalFPML.g:10292:2: ( ruleValueType )
            // InternalFPML.g:10293:3: ruleValueType
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
    // InternalFPML.g:10302:1: rule__PureFunctionType__ReturnTypeAssignment_5 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10306:1: ( ( ruleValueType ) )
            // InternalFPML.g:10307:2: ( ruleValueType )
            {
            // InternalFPML.g:10307:2: ( ruleValueType )
            // InternalFPML.g:10308:3: ruleValueType
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
    // InternalFPML.g:10317:1: rule__EffectFullFunctionType__ArgTypeAssignment_3 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10321:1: ( ( ruleType ) )
            // InternalFPML.g:10322:2: ( ruleType )
            {
            // InternalFPML.g:10322:2: ( ruleType )
            // InternalFPML.g:10323:3: ruleType
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
    // InternalFPML.g:10332:1: rule__EffectFullFunctionType__ReturnTypeAssignment_5 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10336:1: ( ( ruleIOType ) )
            // InternalFPML.g:10337:2: ( ruleIOType )
            {
            // InternalFPML.g:10337:2: ( ruleIOType )
            // InternalFPML.g:10338:3: ruleIOType
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
    // InternalFPML.g:10347:1: rule__EffectFullFunctionValue__ValueAssignment : ( ruleEffectFullLambda ) ;
    public final void rule__EffectFullFunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10351:1: ( ( ruleEffectFullLambda ) )
            // InternalFPML.g:10352:2: ( ruleEffectFullLambda )
            {
            // InternalFPML.g:10352:2: ( ruleEffectFullLambda )
            // InternalFPML.g:10353:3: ruleEffectFullLambda
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
    // InternalFPML.g:10362:1: rule__EffectFullValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10366:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10367:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10367:2: ( ( RULE_ID ) )
            // InternalFPML.g:10368:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueCrossReference_1_0()); 
            // InternalFPML.g:10369:3: ( RULE_ID )
            // InternalFPML.g:10370:4: RULE_ID
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
    // InternalFPML.g:10381:1: rule__EffectFullLambda__ArgAssignment_0_2 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullLambda__ArgAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10385:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:10386:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:10386:2: ( ruleEffectFullArgument )
            // InternalFPML.g:10387:3: ruleEffectFullArgument
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
    // InternalFPML.g:10396:1: rule__EffectFullLambda__FunctionBodyAssignment_0_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10400:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10401:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10401:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10402:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:10411:1: rule__EffectFullLambda__FunctionBodyAssignment_1_1 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10415:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:10416:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:10416:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:10417:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:10426:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10430:1: ( ( RULE_INT ) )
            // InternalFPML.g:10431:2: ( RULE_INT )
            {
            // InternalFPML.g:10431:2: ( RULE_INT )
            // InternalFPML.g:10432:3: RULE_INT
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
    // InternalFPML.g:10441:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10445:1: ( ( RULE_STRING ) )
            // InternalFPML.g:10446:2: ( RULE_STRING )
            {
            // InternalFPML.g:10446:2: ( RULE_STRING )
            // InternalFPML.g:10447:3: RULE_STRING
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
    // InternalFPML.g:10456:1: rule__FunctionValue__ValueAssignment : ( rulePureLambda ) ;
    public final void rule__FunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10460:1: ( ( rulePureLambda ) )
            // InternalFPML.g:10461:2: ( rulePureLambda )
            {
            // InternalFPML.g:10461:2: ( rulePureLambda )
            // InternalFPML.g:10462:3: rulePureLambda
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
    // InternalFPML.g:10471:1: rule__DataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10475:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10476:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10476:2: ( ( RULE_ID ) )
            // InternalFPML.g:10477:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0()); 
            // InternalFPML.g:10478:3: ( RULE_ID )
            // InternalFPML.g:10479:4: RULE_ID
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
    // InternalFPML.g:10490:1: rule__DataValue__ValueAssignment_3 : ( rulePureAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10494:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10495:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10495:2: ( rulePureAdtValue )
            // InternalFPML.g:10496:3: rulePureAdtValue
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
    // InternalFPML.g:10505:1: rule__EffectFullDataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectFullDataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10509:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10510:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10510:2: ( ( RULE_ID ) )
            // InternalFPML.g:10511:3: ( RULE_ID )
            {
             before(grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0()); 
            // InternalFPML.g:10512:3: ( RULE_ID )
            // InternalFPML.g:10513:4: RULE_ID
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
    // InternalFPML.g:10524:1: rule__EffectFullDataValue__ValueAssignment_3 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullDataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10528:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10529:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10529:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10530:3: ruleEffectFullAdtValue
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
    // InternalFPML.g:10539:1: rule__PureValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PureValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10543:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10544:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10544:2: ( ( RULE_ID ) )
            // InternalFPML.g:10545:3: ( RULE_ID )
            {
             before(grammarAccess.getPureValueRefAccess().getValuePureValueCrossReference_1_0()); 
            // InternalFPML.g:10546:3: ( RULE_ID )
            // InternalFPML.g:10547:4: RULE_ID
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
    // InternalFPML.g:10558:1: rule__PureLambda__ArgAssignment_2 : ( ruleArgument ) ;
    public final void rule__PureLambda__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10562:1: ( ( ruleArgument ) )
            // InternalFPML.g:10563:2: ( ruleArgument )
            {
            // InternalFPML.g:10563:2: ( ruleArgument )
            // InternalFPML.g:10564:3: ruleArgument
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
    // InternalFPML.g:10573:1: rule__PureLambda__FunctionBodyAssignment_5 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureLambda__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10577:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:10578:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:10578:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:10579:3: ruleFunctionBodyPure
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
    // InternalFPML.g:10588:1: rule__PureProdValue__ProdAdtElement1Assignment_1 : ( rulePureAdtValue ) ;
    public final void rule__PureProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10592:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10593:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10593:2: ( rulePureAdtValue )
            // InternalFPML.g:10594:3: rulePureAdtValue
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
    // InternalFPML.g:10603:1: rule__PureProdValue__ProdAdtElement2Assignment_3 : ( rulePureAdtValue ) ;
    public final void rule__PureProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10607:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10608:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10608:2: ( rulePureAdtValue )
            // InternalFPML.g:10609:3: rulePureAdtValue
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
    // InternalFPML.g:10618:1: rule__PureSumValue__SumAdtElement1Assignment_0_2 : ( rulePureAdtValue ) ;
    public final void rule__PureSumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10622:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10623:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10623:2: ( rulePureAdtValue )
            // InternalFPML.g:10624:3: rulePureAdtValue
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
    // InternalFPML.g:10633:1: rule__PureSumValue__SumAdtElement2Assignment_1_2 : ( rulePureAdtValue ) ;
    public final void rule__PureSumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10637:1: ( ( rulePureAdtValue ) )
            // InternalFPML.g:10638:2: ( rulePureAdtValue )
            {
            // InternalFPML.g:10638:2: ( rulePureAdtValue )
            // InternalFPML.g:10639:3: rulePureAdtValue
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
    // InternalFPML.g:10648:1: rule__EffectFullProdValue__ProdAdtElement1Assignment_1 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10652:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10653:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10653:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10654:3: ruleEffectFullAdtValue
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
    // InternalFPML.g:10663:1: rule__EffectFullProdValue__ProdAdtElement2Assignment_3 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10667:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10668:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10668:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10669:3: ruleEffectFullAdtValue
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
    // InternalFPML.g:10678:1: rule__EffectFullSumValue__SumAdtElement1Assignment_0_2 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullSumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10682:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10683:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10683:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10684:3: ruleEffectFullAdtValue
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
    // InternalFPML.g:10693:1: rule__EffectFullSumValue__SumAdtElement2Assignment_1_2 : ( ruleEffectFullAdtValue ) ;
    public final void rule__EffectFullSumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10697:1: ( ( ruleEffectFullAdtValue ) )
            // InternalFPML.g:10698:2: ( ruleEffectFullAdtValue )
            {
            // InternalFPML.g:10698:2: ( ruleEffectFullAdtValue )
            // InternalFPML.g:10699:3: ruleEffectFullAdtValue
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
    // InternalFPML.g:10708:1: rule__ApplyF__FunctionTypeAssignment_2 : ( rulePureFunctionType ) ;
    public final void rule__ApplyF__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10712:1: ( ( rulePureFunctionType ) )
            // InternalFPML.g:10713:2: ( rulePureFunctionType )
            {
            // InternalFPML.g:10713:2: ( rulePureFunctionType )
            // InternalFPML.g:10714:3: rulePureFunctionType
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
    // InternalFPML.g:10723:1: rule__ApplyF__ValueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyF__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10727:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10728:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10728:2: ( ( RULE_ID ) )
            // InternalFPML.g:10729:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFAccess().getValuePureReferenceCrossReference_3_0()); 
            // InternalFPML.g:10730:3: ( RULE_ID )
            // InternalFPML.g:10731:4: RULE_ID
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
    // InternalFPML.g:10742:1: rule__ApplyFIO__FunctionTypeAssignment_2 : ( ruleEffectFullFunctionType ) ;
    public final void rule__ApplyFIO__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10746:1: ( ( ruleEffectFullFunctionType ) )
            // InternalFPML.g:10747:2: ( ruleEffectFullFunctionType )
            {
            // InternalFPML.g:10747:2: ( ruleEffectFullFunctionType )
            // InternalFPML.g:10748:3: ruleEffectFullFunctionType
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
    // InternalFPML.g:10757:1: rule__ApplyFIO__ValueAssignment_3 : ( ruleApplyFIOFactor ) ;
    public final void rule__ApplyFIO__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10761:1: ( ( ruleApplyFIOFactor ) )
            // InternalFPML.g:10762:2: ( ruleApplyFIOFactor )
            {
            // InternalFPML.g:10762:2: ( ruleApplyFIOFactor )
            // InternalFPML.g:10763:3: ruleApplyFIOFactor
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
    // InternalFPML.g:10772:1: rule__ApplyFIOFactor__ValueReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyFIOFactor__ValueReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10776:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:10777:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:10777:2: ( ( RULE_ID ) )
            // InternalFPML.g:10778:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceCrossReference_0_0()); 
            // InternalFPML.g:10779:3: ( RULE_ID )
            // InternalFPML.g:10780:4: RULE_ID
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
    // InternalFPML.g:10791:1: rule__ApplyFIOFactor__ValuePrimitiveAssignment_1 : ( rulePrimitiveEffectFullValue ) ;
    public final void rule__ApplyFIOFactor__ValuePrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:10795:1: ( ( rulePrimitiveEffectFullValue ) )
            // InternalFPML.g:10796:2: ( rulePrimitiveEffectFullValue )
            {
            // InternalFPML.g:10796:2: ( rulePrimitiveEffectFullValue )
            // InternalFPML.g:10797:3: rulePrimitiveEffectFullValue
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
    static final String dfa_4s = "\1\50\2\uffff\1\32\1\uffff\1\62\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\7\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\16\uffff\2\4",
            "",
            "",
            "\1\6\2\7",
            "",
            "\3\10\21\uffff\1\10\7\uffff\1\11\1\uffff\1\11\4\uffff\2\10\10\uffff\2\11",
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
            return "2453:1: rule__PureAdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( rulePureValueRef ) | ( ruleDataValue ) | ( rulePureSumValue ) | ( ruleFunctionValue ) | ( rulePureProdValue ) );";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0006000500080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00017E4028680010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0006000500000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00017E0020680010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000E002700000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000018001000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00017FC029680010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000010L});

}