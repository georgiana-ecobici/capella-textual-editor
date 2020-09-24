/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 *  
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.scenario.editor.dsl.ide.contentassist.antlr.internal;

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
import org.polarsys.capella.scenario.editor.dsl.services.TextualScenarioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextualScenarioParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unset'", "'behavior'", "'node'", "'state'", "'mode'", "'function'", "'scenario'", "'->'", "':'", "'->+'", "'->x'", "'->>'", "'else'", "'{'", "'}'", "'actor'", "'component'", "'configuration_item'", "'activity'", "'entity'", "'role'", "'withExecution'", "'withReturn'", "'deactivate'", "'ref'", "'over'", "'alt'", "'on'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalTextualScenarioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextualScenarioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextualScenarioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextualScenario.g"; }


    	private TextualScenarioGrammarAccess grammarAccess;

    	public void setGrammarAccess(TextualScenarioGrammarAccess grammarAccess) {
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
    // InternalTextualScenario.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTextualScenario.g:54:1: ( ruleModel EOF )
            // InternalTextualScenario.g:55:1: ruleModel EOF
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
    // InternalTextualScenario.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalTextualScenario.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalTextualScenario.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalTextualScenario.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalTextualScenario.g:69:3: ( rule__Model__Group__0 )
            // InternalTextualScenario.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleParticipant"
    // InternalTextualScenario.g:78:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // InternalTextualScenario.g:79:1: ( ruleParticipant EOF )
            // InternalTextualScenario.g:80:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalTextualScenario.g:87:1: ruleParticipant : ( ( rule__Participant__Alternatives ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:91:2: ( ( ( rule__Participant__Alternatives ) ) )
            // InternalTextualScenario.g:92:2: ( ( rule__Participant__Alternatives ) )
            {
            // InternalTextualScenario.g:92:2: ( ( rule__Participant__Alternatives ) )
            // InternalTextualScenario.g:93:3: ( rule__Participant__Alternatives )
            {
             before(grammarAccess.getParticipantAccess().getAlternatives()); 
            // InternalTextualScenario.g:94:3: ( rule__Participant__Alternatives )
            // InternalTextualScenario.g:94:4: rule__Participant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleGenericComponent"
    // InternalTextualScenario.g:103:1: entryRuleGenericComponent : ruleGenericComponent EOF ;
    public final void entryRuleGenericComponent() throws RecognitionException {
        try {
            // InternalTextualScenario.g:104:1: ( ruleGenericComponent EOF )
            // InternalTextualScenario.g:105:1: ruleGenericComponent EOF
            {
             before(grammarAccess.getGenericComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericComponent();

            state._fsp--;

             after(grammarAccess.getGenericComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericComponent"


    // $ANTLR start "ruleGenericComponent"
    // InternalTextualScenario.g:112:1: ruleGenericComponent : ( ( rule__GenericComponent__Alternatives ) ) ;
    public final void ruleGenericComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:116:2: ( ( ( rule__GenericComponent__Alternatives ) ) )
            // InternalTextualScenario.g:117:2: ( ( rule__GenericComponent__Alternatives ) )
            {
            // InternalTextualScenario.g:117:2: ( ( rule__GenericComponent__Alternatives ) )
            // InternalTextualScenario.g:118:3: ( rule__GenericComponent__Alternatives )
            {
             before(grammarAccess.getGenericComponentAccess().getAlternatives()); 
            // InternalTextualScenario.g:119:3: ( rule__GenericComponent__Alternatives )
            // InternalTextualScenario.g:119:4: rule__GenericComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericComponent"


    // $ANTLR start "entryRuleGenericFunction"
    // InternalTextualScenario.g:128:1: entryRuleGenericFunction : ruleGenericFunction EOF ;
    public final void entryRuleGenericFunction() throws RecognitionException {
        try {
            // InternalTextualScenario.g:129:1: ( ruleGenericFunction EOF )
            // InternalTextualScenario.g:130:1: ruleGenericFunction EOF
            {
             before(grammarAccess.getGenericFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericFunction();

            state._fsp--;

             after(grammarAccess.getGenericFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericFunction"


    // $ANTLR start "ruleGenericFunction"
    // InternalTextualScenario.g:137:1: ruleGenericFunction : ( ( rule__GenericFunction__Alternatives ) ) ;
    public final void ruleGenericFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:141:2: ( ( ( rule__GenericFunction__Alternatives ) ) )
            // InternalTextualScenario.g:142:2: ( ( rule__GenericFunction__Alternatives ) )
            {
            // InternalTextualScenario.g:142:2: ( ( rule__GenericFunction__Alternatives ) )
            // InternalTextualScenario.g:143:3: ( rule__GenericFunction__Alternatives )
            {
             before(grammarAccess.getGenericFunctionAccess().getAlternatives()); 
            // InternalTextualScenario.g:144:3: ( rule__GenericFunction__Alternatives )
            // InternalTextualScenario.g:144:4: rule__GenericFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericFunction"


    // $ANTLR start "entryRuleActor"
    // InternalTextualScenario.g:153:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalTextualScenario.g:154:1: ( ruleActor EOF )
            // InternalTextualScenario.g:155:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalTextualScenario.g:162:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:166:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalTextualScenario.g:167:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalTextualScenario.g:167:2: ( ( rule__Actor__Group__0 ) )
            // InternalTextualScenario.g:168:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalTextualScenario.g:169:3: ( rule__Actor__Group__0 )
            // InternalTextualScenario.g:169:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // InternalTextualScenario.g:178:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalTextualScenario.g:179:1: ( ruleComponent EOF )
            // InternalTextualScenario.g:180:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalTextualScenario.g:187:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:191:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalTextualScenario.g:192:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalTextualScenario.g:192:2: ( ( rule__Component__Group__0 ) )
            // InternalTextualScenario.g:193:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalTextualScenario.g:194:3: ( rule__Component__Group__0 )
            // InternalTextualScenario.g:194:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalTextualScenario.g:203:1: entryRuleConfigurationItem : ruleConfigurationItem EOF ;
    public final void entryRuleConfigurationItem() throws RecognitionException {
        try {
            // InternalTextualScenario.g:204:1: ( ruleConfigurationItem EOF )
            // InternalTextualScenario.g:205:1: ruleConfigurationItem EOF
            {
             before(grammarAccess.getConfigurationItemRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationItem();

            state._fsp--;

             after(grammarAccess.getConfigurationItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationItem"


    // $ANTLR start "ruleConfigurationItem"
    // InternalTextualScenario.g:212:1: ruleConfigurationItem : ( ( rule__ConfigurationItem__Group__0 ) ) ;
    public final void ruleConfigurationItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:216:2: ( ( ( rule__ConfigurationItem__Group__0 ) ) )
            // InternalTextualScenario.g:217:2: ( ( rule__ConfigurationItem__Group__0 ) )
            {
            // InternalTextualScenario.g:217:2: ( ( rule__ConfigurationItem__Group__0 ) )
            // InternalTextualScenario.g:218:3: ( rule__ConfigurationItem__Group__0 )
            {
             before(grammarAccess.getConfigurationItemAccess().getGroup()); 
            // InternalTextualScenario.g:219:3: ( rule__ConfigurationItem__Group__0 )
            // InternalTextualScenario.g:219:4: rule__ConfigurationItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationItem"


    // $ANTLR start "entryRuleFunction"
    // InternalTextualScenario.g:228:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalTextualScenario.g:229:1: ( ruleFunction EOF )
            // InternalTextualScenario.g:230:1: ruleFunction EOF
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
    // InternalTextualScenario.g:237:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:241:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalTextualScenario.g:242:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalTextualScenario.g:242:2: ( ( rule__Function__Group__0 ) )
            // InternalTextualScenario.g:243:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalTextualScenario.g:244:3: ( rule__Function__Group__0 )
            // InternalTextualScenario.g:244:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleActivity"
    // InternalTextualScenario.g:253:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalTextualScenario.g:254:1: ( ruleActivity EOF )
            // InternalTextualScenario.g:255:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalTextualScenario.g:262:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:266:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalTextualScenario.g:267:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalTextualScenario.g:267:2: ( ( rule__Activity__Group__0 ) )
            // InternalTextualScenario.g:268:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalTextualScenario.g:269:3: ( rule__Activity__Group__0 )
            // InternalTextualScenario.g:269:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEntity"
    // InternalTextualScenario.g:278:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalTextualScenario.g:279:1: ( ruleEntity EOF )
            // InternalTextualScenario.g:280:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalTextualScenario.g:287:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:291:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalTextualScenario.g:292:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalTextualScenario.g:292:2: ( ( rule__Entity__Group__0 ) )
            // InternalTextualScenario.g:293:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalTextualScenario.g:294:3: ( rule__Entity__Group__0 )
            // InternalTextualScenario.g:294:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRole"
    // InternalTextualScenario.g:303:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalTextualScenario.g:304:1: ( ruleRole EOF )
            // InternalTextualScenario.g:305:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalTextualScenario.g:312:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:316:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalTextualScenario.g:317:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalTextualScenario.g:317:2: ( ( rule__Role__Group__0 ) )
            // InternalTextualScenario.g:318:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalTextualScenario.g:319:3: ( rule__Role__Group__0 )
            // InternalTextualScenario.g:319:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMessage"
    // InternalTextualScenario.g:328:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalTextualScenario.g:329:1: ( ruleMessage EOF )
            // InternalTextualScenario.g:330:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalTextualScenario.g:337:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:341:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalTextualScenario.g:342:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalTextualScenario.g:342:2: ( ( rule__Message__Alternatives ) )
            // InternalTextualScenario.g:343:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalTextualScenario.g:344:3: ( rule__Message__Alternatives )
            // InternalTextualScenario.g:344:4: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleSequenceMessageType"
    // InternalTextualScenario.g:353:1: entryRuleSequenceMessageType : ruleSequenceMessageType EOF ;
    public final void entryRuleSequenceMessageType() throws RecognitionException {
        try {
            // InternalTextualScenario.g:354:1: ( ruleSequenceMessageType EOF )
            // InternalTextualScenario.g:355:1: ruleSequenceMessageType EOF
            {
             before(grammarAccess.getSequenceMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceMessageType();

            state._fsp--;

             after(grammarAccess.getSequenceMessageTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceMessageType"


    // $ANTLR start "ruleSequenceMessageType"
    // InternalTextualScenario.g:362:1: ruleSequenceMessageType : ( ( rule__SequenceMessageType__Alternatives ) ) ;
    public final void ruleSequenceMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:366:2: ( ( ( rule__SequenceMessageType__Alternatives ) ) )
            // InternalTextualScenario.g:367:2: ( ( rule__SequenceMessageType__Alternatives ) )
            {
            // InternalTextualScenario.g:367:2: ( ( rule__SequenceMessageType__Alternatives ) )
            // InternalTextualScenario.g:368:3: ( rule__SequenceMessageType__Alternatives )
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getAlternatives()); 
            // InternalTextualScenario.g:369:3: ( rule__SequenceMessageType__Alternatives )
            // InternalTextualScenario.g:369:4: rule__SequenceMessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceMessageType"


    // $ANTLR start "entryRuleSequenceMessage"
    // InternalTextualScenario.g:378:1: entryRuleSequenceMessage : ruleSequenceMessage EOF ;
    public final void entryRuleSequenceMessage() throws RecognitionException {
        try {
            // InternalTextualScenario.g:379:1: ( ruleSequenceMessage EOF )
            // InternalTextualScenario.g:380:1: ruleSequenceMessage EOF
            {
             before(grammarAccess.getSequenceMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceMessage();

            state._fsp--;

             after(grammarAccess.getSequenceMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceMessage"


    // $ANTLR start "ruleSequenceMessage"
    // InternalTextualScenario.g:387:1: ruleSequenceMessage : ( ( rule__SequenceMessage__Group__0 ) ) ;
    public final void ruleSequenceMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:391:2: ( ( ( rule__SequenceMessage__Group__0 ) ) )
            // InternalTextualScenario.g:392:2: ( ( rule__SequenceMessage__Group__0 ) )
            {
            // InternalTextualScenario.g:392:2: ( ( rule__SequenceMessage__Group__0 ) )
            // InternalTextualScenario.g:393:3: ( rule__SequenceMessage__Group__0 )
            {
             before(grammarAccess.getSequenceMessageAccess().getGroup()); 
            // InternalTextualScenario.g:394:3: ( rule__SequenceMessage__Group__0 )
            // InternalTextualScenario.g:394:4: rule__SequenceMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalTextualScenario.g:403:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalTextualScenario.g:404:1: ( ruleCreateMessage EOF )
            // InternalTextualScenario.g:405:1: ruleCreateMessage EOF
            {
             before(grammarAccess.getCreateMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateMessage();

            state._fsp--;

             after(grammarAccess.getCreateMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateMessage"


    // $ANTLR start "ruleCreateMessage"
    // InternalTextualScenario.g:412:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:416:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalTextualScenario.g:417:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalTextualScenario.g:417:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalTextualScenario.g:418:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalTextualScenario.g:419:3: ( rule__CreateMessage__Group__0 )
            // InternalTextualScenario.g:419:4: rule__CreateMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDeleteMessage"
    // InternalTextualScenario.g:428:1: entryRuleDeleteMessage : ruleDeleteMessage EOF ;
    public final void entryRuleDeleteMessage() throws RecognitionException {
        try {
            // InternalTextualScenario.g:429:1: ( ruleDeleteMessage EOF )
            // InternalTextualScenario.g:430:1: ruleDeleteMessage EOF
            {
             before(grammarAccess.getDeleteMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteMessage();

            state._fsp--;

             after(grammarAccess.getDeleteMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteMessage"


    // $ANTLR start "ruleDeleteMessage"
    // InternalTextualScenario.g:437:1: ruleDeleteMessage : ( ( rule__DeleteMessage__Group__0 ) ) ;
    public final void ruleDeleteMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:441:2: ( ( ( rule__DeleteMessage__Group__0 ) ) )
            // InternalTextualScenario.g:442:2: ( ( rule__DeleteMessage__Group__0 ) )
            {
            // InternalTextualScenario.g:442:2: ( ( rule__DeleteMessage__Group__0 ) )
            // InternalTextualScenario.g:443:3: ( rule__DeleteMessage__Group__0 )
            {
             before(grammarAccess.getDeleteMessageAccess().getGroup()); 
            // InternalTextualScenario.g:444:3: ( rule__DeleteMessage__Group__0 )
            // InternalTextualScenario.g:444:4: rule__DeleteMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteMessage"


    // $ANTLR start "entryRuleArmTimerMessage"
    // InternalTextualScenario.g:453:1: entryRuleArmTimerMessage : ruleArmTimerMessage EOF ;
    public final void entryRuleArmTimerMessage() throws RecognitionException {
        try {
            // InternalTextualScenario.g:454:1: ( ruleArmTimerMessage EOF )
            // InternalTextualScenario.g:455:1: ruleArmTimerMessage EOF
            {
             before(grammarAccess.getArmTimerMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleArmTimerMessage();

            state._fsp--;

             after(grammarAccess.getArmTimerMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArmTimerMessage"


    // $ANTLR start "ruleArmTimerMessage"
    // InternalTextualScenario.g:462:1: ruleArmTimerMessage : ( ( rule__ArmTimerMessage__Group__0 ) ) ;
    public final void ruleArmTimerMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:466:2: ( ( ( rule__ArmTimerMessage__Group__0 ) ) )
            // InternalTextualScenario.g:467:2: ( ( rule__ArmTimerMessage__Group__0 ) )
            {
            // InternalTextualScenario.g:467:2: ( ( rule__ArmTimerMessage__Group__0 ) )
            // InternalTextualScenario.g:468:3: ( rule__ArmTimerMessage__Group__0 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getGroup()); 
            // InternalTextualScenario.g:469:3: ( rule__ArmTimerMessage__Group__0 )
            // InternalTextualScenario.g:469:4: rule__ArmTimerMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArmTimerMessage"


    // $ANTLR start "entryRuleParticipantDeactivation"
    // InternalTextualScenario.g:478:1: entryRuleParticipantDeactivation : ruleParticipantDeactivation EOF ;
    public final void entryRuleParticipantDeactivation() throws RecognitionException {
        try {
            // InternalTextualScenario.g:479:1: ( ruleParticipantDeactivation EOF )
            // InternalTextualScenario.g:480:1: ruleParticipantDeactivation EOF
            {
             before(grammarAccess.getParticipantDeactivationRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipantDeactivation();

            state._fsp--;

             after(grammarAccess.getParticipantDeactivationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantDeactivation"


    // $ANTLR start "ruleParticipantDeactivation"
    // InternalTextualScenario.g:487:1: ruleParticipantDeactivation : ( ( rule__ParticipantDeactivation__Group__0 ) ) ;
    public final void ruleParticipantDeactivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:491:2: ( ( ( rule__ParticipantDeactivation__Group__0 ) ) )
            // InternalTextualScenario.g:492:2: ( ( rule__ParticipantDeactivation__Group__0 ) )
            {
            // InternalTextualScenario.g:492:2: ( ( rule__ParticipantDeactivation__Group__0 ) )
            // InternalTextualScenario.g:493:3: ( rule__ParticipantDeactivation__Group__0 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getGroup()); 
            // InternalTextualScenario.g:494:3: ( rule__ParticipantDeactivation__Group__0 )
            // InternalTextualScenario.g:494:4: rule__ParticipantDeactivation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDeactivationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantDeactivation"


    // $ANTLR start "entryRuleReference"
    // InternalTextualScenario.g:503:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalTextualScenario.g:504:1: ( ruleReference EOF )
            // InternalTextualScenario.g:505:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalTextualScenario.g:512:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:516:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalTextualScenario.g:517:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalTextualScenario.g:517:2: ( ( rule__Reference__Group__0 ) )
            // InternalTextualScenario.g:518:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalTextualScenario.g:519:3: ( rule__Reference__Group__0 )
            // InternalTextualScenario.g:519:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalTextualScenario.g:528:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalTextualScenario.g:529:1: ( ruleCombinedFragment EOF )
            // InternalTextualScenario.g:530:1: ruleCombinedFragment EOF
            {
             before(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleCombinedFragment();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalTextualScenario.g:537:1: ruleCombinedFragment : ( ruleAlt ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:541:2: ( ( ruleAlt ) )
            // InternalTextualScenario.g:542:2: ( ruleAlt )
            {
            // InternalTextualScenario.g:542:2: ( ruleAlt )
            // InternalTextualScenario.g:543:3: ruleAlt
            {
             before(grammarAccess.getCombinedFragmentAccess().getAltParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAlt();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentAccess().getAltParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleAlt"
    // InternalTextualScenario.g:553:1: entryRuleAlt : ruleAlt EOF ;
    public final void entryRuleAlt() throws RecognitionException {
        try {
            // InternalTextualScenario.g:554:1: ( ruleAlt EOF )
            // InternalTextualScenario.g:555:1: ruleAlt EOF
            {
             before(grammarAccess.getAltRule()); 
            pushFollow(FOLLOW_1);
            ruleAlt();

            state._fsp--;

             after(grammarAccess.getAltRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlt"


    // $ANTLR start "ruleAlt"
    // InternalTextualScenario.g:562:1: ruleAlt : ( ( rule__Alt__Group__0 ) ) ;
    public final void ruleAlt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:566:2: ( ( ( rule__Alt__Group__0 ) ) )
            // InternalTextualScenario.g:567:2: ( ( rule__Alt__Group__0 ) )
            {
            // InternalTextualScenario.g:567:2: ( ( rule__Alt__Group__0 ) )
            // InternalTextualScenario.g:568:3: ( rule__Alt__Group__0 )
            {
             before(grammarAccess.getAltAccess().getGroup()); 
            // InternalTextualScenario.g:569:3: ( rule__Alt__Group__0 )
            // InternalTextualScenario.g:569:4: rule__Alt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlt"


    // $ANTLR start "entryRuleElseBlock"
    // InternalTextualScenario.g:578:1: entryRuleElseBlock : ruleElseBlock EOF ;
    public final void entryRuleElseBlock() throws RecognitionException {
        try {
            // InternalTextualScenario.g:579:1: ( ruleElseBlock EOF )
            // InternalTextualScenario.g:580:1: ruleElseBlock EOF
            {
             before(grammarAccess.getElseBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleElseBlock();

            state._fsp--;

             after(grammarAccess.getElseBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseBlock"


    // $ANTLR start "ruleElseBlock"
    // InternalTextualScenario.g:587:1: ruleElseBlock : ( ( rule__ElseBlock__Group__0 ) ) ;
    public final void ruleElseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:591:2: ( ( ( rule__ElseBlock__Group__0 ) ) )
            // InternalTextualScenario.g:592:2: ( ( rule__ElseBlock__Group__0 ) )
            {
            // InternalTextualScenario.g:592:2: ( ( rule__ElseBlock__Group__0 ) )
            // InternalTextualScenario.g:593:3: ( rule__ElseBlock__Group__0 )
            {
             before(grammarAccess.getElseBlockAccess().getGroup()); 
            // InternalTextualScenario.g:594:3: ( rule__ElseBlock__Group__0 )
            // InternalTextualScenario.g:594:4: rule__ElseBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseBlock"


    // $ANTLR start "entryRuleBlock"
    // InternalTextualScenario.g:603:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalTextualScenario.g:604:1: ( ruleBlock EOF )
            // InternalTextualScenario.g:605:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTextualScenario.g:612:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:616:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalTextualScenario.g:617:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalTextualScenario.g:617:2: ( ( rule__Block__Group__0 ) )
            // InternalTextualScenario.g:618:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalTextualScenario.g:619:3: ( rule__Block__Group__0 )
            // InternalTextualScenario.g:619:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStateFragment"
    // InternalTextualScenario.g:628:1: entryRuleStateFragment : ruleStateFragment EOF ;
    public final void entryRuleStateFragment() throws RecognitionException {
        try {
            // InternalTextualScenario.g:629:1: ( ruleStateFragment EOF )
            // InternalTextualScenario.g:630:1: ruleStateFragment EOF
            {
             before(grammarAccess.getStateFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleStateFragment();

            state._fsp--;

             after(grammarAccess.getStateFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateFragment"


    // $ANTLR start "ruleStateFragment"
    // InternalTextualScenario.g:637:1: ruleStateFragment : ( ( rule__StateFragment__Group__0 ) ) ;
    public final void ruleStateFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:641:2: ( ( ( rule__StateFragment__Group__0 ) ) )
            // InternalTextualScenario.g:642:2: ( ( rule__StateFragment__Group__0 ) )
            {
            // InternalTextualScenario.g:642:2: ( ( rule__StateFragment__Group__0 ) )
            // InternalTextualScenario.g:643:3: ( rule__StateFragment__Group__0 )
            {
             before(grammarAccess.getStateFragmentAccess().getGroup()); 
            // InternalTextualScenario.g:644:3: ( rule__StateFragment__Group__0 )
            // InternalTextualScenario.g:644:4: rule__StateFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateFragment"


    // $ANTLR start "rule__Model__ElementsAlternatives_3_0"
    // InternalTextualScenario.g:652:1: rule__Model__ElementsAlternatives_3_0 : ( ( ruleMessage ) | ( ruleReference ) | ( ruleCombinedFragment ) | ( ruleStateFragment ) );
    public final void rule__Model__ElementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:656:1: ( ( ruleMessage ) | ( ruleReference ) | ( ruleCombinedFragment ) | ( ruleStateFragment ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 22:
            case 34:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTextualScenario.g:657:2: ( ruleMessage )
                    {
                    // InternalTextualScenario.g:657:2: ( ruleMessage )
                    // InternalTextualScenario.g:658:3: ruleMessage
                    {
                     before(grammarAccess.getModelAccess().getElementsMessageParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementsMessageParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:663:2: ( ruleReference )
                    {
                    // InternalTextualScenario.g:663:2: ( ruleReference )
                    // InternalTextualScenario.g:664:3: ruleReference
                    {
                     before(grammarAccess.getModelAccess().getElementsReferenceParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementsReferenceParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:669:2: ( ruleCombinedFragment )
                    {
                    // InternalTextualScenario.g:669:2: ( ruleCombinedFragment )
                    // InternalTextualScenario.g:670:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getModelAccess().getElementsCombinedFragmentParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementsCombinedFragmentParserRuleCall_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualScenario.g:675:2: ( ruleStateFragment )
                    {
                    // InternalTextualScenario.g:675:2: ( ruleStateFragment )
                    // InternalTextualScenario.g:676:3: ruleStateFragment
                    {
                     before(grammarAccess.getModelAccess().getElementsStateFragmentParserRuleCall_3_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStateFragment();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementsStateFragmentParserRuleCall_3_0_3()); 

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
    // $ANTLR end "rule__Model__ElementsAlternatives_3_0"


    // $ANTLR start "rule__Participant__Alternatives"
    // InternalTextualScenario.g:685:1: rule__Participant__Alternatives : ( ( ruleGenericComponent ) | ( ruleGenericFunction ) );
    public final void rule__Participant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:689:1: ( ( ruleGenericComponent ) | ( ruleGenericFunction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=26 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=31)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16||LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTextualScenario.g:690:2: ( ruleGenericComponent )
                    {
                    // InternalTextualScenario.g:690:2: ( ruleGenericComponent )
                    // InternalTextualScenario.g:691:3: ruleGenericComponent
                    {
                     before(grammarAccess.getParticipantAccess().getGenericComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGenericComponent();

                    state._fsp--;

                     after(grammarAccess.getParticipantAccess().getGenericComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:696:2: ( ruleGenericFunction )
                    {
                    // InternalTextualScenario.g:696:2: ( ruleGenericFunction )
                    // InternalTextualScenario.g:697:3: ruleGenericFunction
                    {
                     before(grammarAccess.getParticipantAccess().getGenericFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGenericFunction();

                    state._fsp--;

                     after(grammarAccess.getParticipantAccess().getGenericFunctionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Participant__Alternatives"


    // $ANTLR start "rule__GenericComponent__Alternatives"
    // InternalTextualScenario.g:706:1: rule__GenericComponent__Alternatives : ( ( ruleEntity ) | ( ruleActor ) | ( ruleComponent ) | ( ruleConfigurationItem ) | ( ruleRole ) );
    public final void rule__GenericComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:710:1: ( ( ruleEntity ) | ( ruleActor ) | ( ruleComponent ) | ( ruleConfigurationItem ) | ( ruleRole ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 31:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTextualScenario.g:711:2: ( ruleEntity )
                    {
                    // InternalTextualScenario.g:711:2: ( ruleEntity )
                    // InternalTextualScenario.g:712:3: ruleEntity
                    {
                     before(grammarAccess.getGenericComponentAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:717:2: ( ruleActor )
                    {
                    // InternalTextualScenario.g:717:2: ( ruleActor )
                    // InternalTextualScenario.g:718:3: ruleActor
                    {
                     before(grammarAccess.getGenericComponentAccess().getActorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getActorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:723:2: ( ruleComponent )
                    {
                    // InternalTextualScenario.g:723:2: ( ruleComponent )
                    // InternalTextualScenario.g:724:3: ruleComponent
                    {
                     before(grammarAccess.getGenericComponentAccess().getComponentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getComponentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualScenario.g:729:2: ( ruleConfigurationItem )
                    {
                    // InternalTextualScenario.g:729:2: ( ruleConfigurationItem )
                    // InternalTextualScenario.g:730:3: ruleConfigurationItem
                    {
                     before(grammarAccess.getGenericComponentAccess().getConfigurationItemParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigurationItem();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getConfigurationItemParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTextualScenario.g:735:2: ( ruleRole )
                    {
                    // InternalTextualScenario.g:735:2: ( ruleRole )
                    // InternalTextualScenario.g:736:3: ruleRole
                    {
                     before(grammarAccess.getGenericComponentAccess().getRoleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getRoleParserRuleCall_4()); 

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
    // $ANTLR end "rule__GenericComponent__Alternatives"


    // $ANTLR start "rule__GenericFunction__Alternatives"
    // InternalTextualScenario.g:745:1: rule__GenericFunction__Alternatives : ( ( ruleFunction ) | ( ruleActivity ) );
    public final void rule__GenericFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:749:1: ( ( ruleFunction ) | ( ruleActivity ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTextualScenario.g:750:2: ( ruleFunction )
                    {
                    // InternalTextualScenario.g:750:2: ( ruleFunction )
                    // InternalTextualScenario.g:751:3: ruleFunction
                    {
                     before(grammarAccess.getGenericFunctionAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getGenericFunctionAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:756:2: ( ruleActivity )
                    {
                    // InternalTextualScenario.g:756:2: ( ruleActivity )
                    // InternalTextualScenario.g:757:3: ruleActivity
                    {
                     before(grammarAccess.getGenericFunctionAccess().getActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getGenericFunctionAccess().getActivityParserRuleCall_1()); 

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
    // $ANTLR end "rule__GenericFunction__Alternatives"


    // $ANTLR start "rule__Component__NatureAlternatives_2_0"
    // InternalTextualScenario.g:766:1: rule__Component__NatureAlternatives_2_0 : ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) );
    public final void rule__Component__NatureAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:770:1: ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTextualScenario.g:771:2: ( 'unset' )
                    {
                    // InternalTextualScenario.g:771:2: ( 'unset' )
                    // InternalTextualScenario.g:772:3: 'unset'
                    {
                     before(grammarAccess.getComponentAccess().getNatureUnsetKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureUnsetKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:777:2: ( 'behavior' )
                    {
                    // InternalTextualScenario.g:777:2: ( 'behavior' )
                    // InternalTextualScenario.g:778:3: 'behavior'
                    {
                     before(grammarAccess.getComponentAccess().getNatureBehaviorKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureBehaviorKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:783:2: ( 'node' )
                    {
                    // InternalTextualScenario.g:783:2: ( 'node' )
                    // InternalTextualScenario.g:784:3: 'node'
                    {
                     before(grammarAccess.getComponentAccess().getNatureNodeKeyword_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureNodeKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Component__NatureAlternatives_2_0"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalTextualScenario.g:793:1: rule__Message__Alternatives : ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:797:1: ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 34:
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
                    // InternalTextualScenario.g:798:2: ( ruleSequenceMessageType )
                    {
                    // InternalTextualScenario.g:798:2: ( ruleSequenceMessageType )
                    // InternalTextualScenario.g:799:3: ruleSequenceMessageType
                    {
                     before(grammarAccess.getMessageAccess().getSequenceMessageTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceMessageType();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getSequenceMessageTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:804:2: ( ruleArmTimerMessage )
                    {
                    // InternalTextualScenario.g:804:2: ( ruleArmTimerMessage )
                    // InternalTextualScenario.g:805:3: ruleArmTimerMessage
                    {
                     before(grammarAccess.getMessageAccess().getArmTimerMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArmTimerMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getArmTimerMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:810:2: ( ruleParticipantDeactivation )
                    {
                    // InternalTextualScenario.g:810:2: ( ruleParticipantDeactivation )
                    // InternalTextualScenario.g:811:3: ruleParticipantDeactivation
                    {
                     before(grammarAccess.getMessageAccess().getParticipantDeactivationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParticipantDeactivation();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getParticipantDeactivationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__SequenceMessageType__Alternatives"
    // InternalTextualScenario.g:820:1: rule__SequenceMessageType__Alternatives : ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) );
    public final void rule__SequenceMessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:824:1: ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt7=1;
                    }
                    break;
                case 20:
                    {
                    alt7=2;
                    }
                    break;
                case 21:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTextualScenario.g:825:2: ( ruleSequenceMessage )
                    {
                    // InternalTextualScenario.g:825:2: ( ruleSequenceMessage )
                    // InternalTextualScenario.g:826:3: ruleSequenceMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getSequenceMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getSequenceMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:831:2: ( ruleCreateMessage )
                    {
                    // InternalTextualScenario.g:831:2: ( ruleCreateMessage )
                    // InternalTextualScenario.g:832:3: ruleCreateMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getCreateMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getCreateMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:837:2: ( ruleDeleteMessage )
                    {
                    // InternalTextualScenario.g:837:2: ( ruleDeleteMessage )
                    // InternalTextualScenario.g:838:3: ruleDeleteMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getDeleteMessageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getDeleteMessageParserRuleCall_2()); 

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
    // $ANTLR end "rule__SequenceMessageType__Alternatives"


    // $ANTLR start "rule__Block__BlockElementsAlternatives_1_0"
    // InternalTextualScenario.g:847:1: rule__Block__BlockElementsAlternatives_1_0 : ( ( ruleMessage ) | ( ruleReference ) | ( ruleCombinedFragment ) | ( ruleStateFragment ) );
    public final void rule__Block__BlockElementsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:851:1: ( ( ruleMessage ) | ( ruleReference ) | ( ruleCombinedFragment ) | ( ruleStateFragment ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 22:
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 38:
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
                    // InternalTextualScenario.g:852:2: ( ruleMessage )
                    {
                    // InternalTextualScenario.g:852:2: ( ruleMessage )
                    // InternalTextualScenario.g:853:3: ruleMessage
                    {
                     before(grammarAccess.getBlockAccess().getBlockElementsMessageParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getBlockElementsMessageParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:858:2: ( ruleReference )
                    {
                    // InternalTextualScenario.g:858:2: ( ruleReference )
                    // InternalTextualScenario.g:859:3: ruleReference
                    {
                     before(grammarAccess.getBlockAccess().getBlockElementsReferenceParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getBlockElementsReferenceParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:864:2: ( ruleCombinedFragment )
                    {
                    // InternalTextualScenario.g:864:2: ( ruleCombinedFragment )
                    // InternalTextualScenario.g:865:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getBlockAccess().getBlockElementsCombinedFragmentParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getBlockElementsCombinedFragmentParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualScenario.g:870:2: ( ruleStateFragment )
                    {
                    // InternalTextualScenario.g:870:2: ( ruleStateFragment )
                    // InternalTextualScenario.g:871:3: ruleStateFragment
                    {
                     before(grammarAccess.getBlockAccess().getBlockElementsStateFragmentParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStateFragment();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getBlockElementsStateFragmentParserRuleCall_1_0_3()); 

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
    // $ANTLR end "rule__Block__BlockElementsAlternatives_1_0"


    // $ANTLR start "rule__StateFragment__KeywordAlternatives_2_0"
    // InternalTextualScenario.g:880:1: rule__StateFragment__KeywordAlternatives_2_0 : ( ( 'state' ) | ( 'mode' ) | ( 'function' ) );
    public final void rule__StateFragment__KeywordAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:884:1: ( ( 'state' ) | ( 'mode' ) | ( 'function' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
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
                    // InternalTextualScenario.g:885:2: ( 'state' )
                    {
                    // InternalTextualScenario.g:885:2: ( 'state' )
                    // InternalTextualScenario.g:886:3: 'state'
                    {
                     before(grammarAccess.getStateFragmentAccess().getKeywordStateKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStateFragmentAccess().getKeywordStateKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualScenario.g:891:2: ( 'mode' )
                    {
                    // InternalTextualScenario.g:891:2: ( 'mode' )
                    // InternalTextualScenario.g:892:3: 'mode'
                    {
                     before(grammarAccess.getStateFragmentAccess().getKeywordModeKeyword_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStateFragmentAccess().getKeywordModeKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualScenario.g:897:2: ( 'function' )
                    {
                    // InternalTextualScenario.g:897:2: ( 'function' )
                    // InternalTextualScenario.g:898:3: 'function'
                    {
                     before(grammarAccess.getStateFragmentAccess().getKeywordFunctionKeyword_2_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStateFragmentAccess().getKeywordFunctionKeyword_2_0_2()); 

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
    // $ANTLR end "rule__StateFragment__KeywordAlternatives_2_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalTextualScenario.g:907:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:911:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalTextualScenario.g:912:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalTextualScenario.g:919:1: rule__Model__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:923:1: ( ( 'scenario' ) )
            // InternalTextualScenario.g:924:1: ( 'scenario' )
            {
            // InternalTextualScenario.g:924:1: ( 'scenario' )
            // InternalTextualScenario.g:925:2: 'scenario'
            {
             before(grammarAccess.getModelAccess().getScenarioKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getScenarioKeyword_0()); 

            }


            }

        }
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
    // InternalTextualScenario.g:934:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:938:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalTextualScenario.g:939:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
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
    // InternalTextualScenario.g:946:1: rule__Model__Group__1__Impl : ( ( rule__Model__BeginAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:950:1: ( ( ( rule__Model__BeginAssignment_1 ) ) )
            // InternalTextualScenario.g:951:1: ( ( rule__Model__BeginAssignment_1 ) )
            {
            // InternalTextualScenario.g:951:1: ( ( rule__Model__BeginAssignment_1 ) )
            // InternalTextualScenario.g:952:2: ( rule__Model__BeginAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getBeginAssignment_1()); 
            // InternalTextualScenario.g:953:2: ( rule__Model__BeginAssignment_1 )
            // InternalTextualScenario.g:953:3: rule__Model__BeginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__BeginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBeginAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__2"
    // InternalTextualScenario.g:961:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:965:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalTextualScenario.g:966:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalTextualScenario.g:973:1: rule__Model__Group__2__Impl : ( ( rule__Model__ParticipantsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:977:1: ( ( ( rule__Model__ParticipantsAssignment_2 )* ) )
            // InternalTextualScenario.g:978:1: ( ( rule__Model__ParticipantsAssignment_2 )* )
            {
            // InternalTextualScenario.g:978:1: ( ( rule__Model__ParticipantsAssignment_2 )* )
            // InternalTextualScenario.g:979:2: ( rule__Model__ParticipantsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getParticipantsAssignment_2()); 
            // InternalTextualScenario.g:980:2: ( rule__Model__ParticipantsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||(LA10_0>=26 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTextualScenario.g:980:3: rule__Model__ParticipantsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ParticipantsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getParticipantsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalTextualScenario.g:988:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:992:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalTextualScenario.g:993:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalTextualScenario.g:1000:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1004:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalTextualScenario.g:1005:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalTextualScenario.g:1005:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalTextualScenario.g:1006:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalTextualScenario.g:1007:2: ( rule__Model__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==22||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=37 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTextualScenario.g:1007:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalTextualScenario.g:1015:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1019:1: ( rule__Model__Group__4__Impl )
            // InternalTextualScenario.g:1020:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalTextualScenario.g:1026:1: rule__Model__Group__4__Impl : ( ( rule__Model__EndAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1030:1: ( ( ( rule__Model__EndAssignment_4 ) ) )
            // InternalTextualScenario.g:1031:1: ( ( rule__Model__EndAssignment_4 ) )
            {
            // InternalTextualScenario.g:1031:1: ( ( rule__Model__EndAssignment_4 ) )
            // InternalTextualScenario.g:1032:2: ( rule__Model__EndAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getEndAssignment_4()); 
            // InternalTextualScenario.g:1033:2: ( rule__Model__EndAssignment_4 )
            // InternalTextualScenario.g:1033:3: rule__Model__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalTextualScenario.g:1042:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1046:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalTextualScenario.g:1047:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalTextualScenario.g:1054:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__KeywordAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1058:1: ( ( ( rule__Actor__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1059:1: ( ( rule__Actor__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1059:1: ( ( rule__Actor__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1060:2: ( rule__Actor__KeywordAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1061:2: ( rule__Actor__KeywordAssignment_0 )
            // InternalTextualScenario.g:1061:3: rule__Actor__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalTextualScenario.g:1069:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1073:1: ( rule__Actor__Group__1__Impl )
            // InternalTextualScenario.g:1074:2: rule__Actor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalTextualScenario.g:1080:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1084:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1085:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1085:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalTextualScenario.g:1086:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1087:2: ( rule__Actor__NameAssignment_1 )
            // InternalTextualScenario.g:1087:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalTextualScenario.g:1096:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1100:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalTextualScenario.g:1101:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalTextualScenario.g:1108:1: rule__Component__Group__0__Impl : ( ( rule__Component__KeywordAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1112:1: ( ( ( rule__Component__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1113:1: ( ( rule__Component__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1113:1: ( ( rule__Component__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1114:2: ( rule__Component__KeywordAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1115:2: ( rule__Component__KeywordAssignment_0 )
            // InternalTextualScenario.g:1115:3: rule__Component__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalTextualScenario.g:1123:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1127:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalTextualScenario.g:1128:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalTextualScenario.g:1135:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1139:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1140:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1140:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalTextualScenario.g:1141:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1142:2: ( rule__Component__NameAssignment_1 )
            // InternalTextualScenario.g:1142:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalTextualScenario.g:1150:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1154:1: ( rule__Component__Group__2__Impl )
            // InternalTextualScenario.g:1155:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalTextualScenario.g:1161:1: rule__Component__Group__2__Impl : ( ( rule__Component__NatureAssignment_2 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1165:1: ( ( ( rule__Component__NatureAssignment_2 )? ) )
            // InternalTextualScenario.g:1166:1: ( ( rule__Component__NatureAssignment_2 )? )
            {
            // InternalTextualScenario.g:1166:1: ( ( rule__Component__NatureAssignment_2 )? )
            // InternalTextualScenario.g:1167:2: ( rule__Component__NatureAssignment_2 )?
            {
             before(grammarAccess.getComponentAccess().getNatureAssignment_2()); 
            // InternalTextualScenario.g:1168:2: ( rule__Component__NatureAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTextualScenario.g:1168:3: rule__Component__NatureAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__NatureAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getNatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__0"
    // InternalTextualScenario.g:1177:1: rule__ConfigurationItem__Group__0 : rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 ;
    public final void rule__ConfigurationItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1181:1: ( rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 )
            // InternalTextualScenario.g:1182:2: rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0"


    // $ANTLR start "rule__ConfigurationItem__Group__0__Impl"
    // InternalTextualScenario.g:1189:1: rule__ConfigurationItem__Group__0__Impl : ( ( rule__ConfigurationItem__KeywordAssignment_0 ) ) ;
    public final void rule__ConfigurationItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1193:1: ( ( ( rule__ConfigurationItem__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1194:1: ( ( rule__ConfigurationItem__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1194:1: ( ( rule__ConfigurationItem__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1195:2: ( rule__ConfigurationItem__KeywordAssignment_0 )
            {
             before(grammarAccess.getConfigurationItemAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1196:2: ( rule__ConfigurationItem__KeywordAssignment_0 )
            // InternalTextualScenario.g:1196:3: rule__ConfigurationItem__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__1"
    // InternalTextualScenario.g:1204:1: rule__ConfigurationItem__Group__1 : rule__ConfigurationItem__Group__1__Impl ;
    public final void rule__ConfigurationItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1208:1: ( rule__ConfigurationItem__Group__1__Impl )
            // InternalTextualScenario.g:1209:2: rule__ConfigurationItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1"


    // $ANTLR start "rule__ConfigurationItem__Group__1__Impl"
    // InternalTextualScenario.g:1215:1: rule__ConfigurationItem__Group__1__Impl : ( ( rule__ConfigurationItem__NameAssignment_1 ) ) ;
    public final void rule__ConfigurationItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1219:1: ( ( ( rule__ConfigurationItem__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1220:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1220:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            // InternalTextualScenario.g:1221:2: ( rule__ConfigurationItem__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1222:2: ( rule__ConfigurationItem__NameAssignment_1 )
            // InternalTextualScenario.g:1222:3: rule__ConfigurationItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalTextualScenario.g:1231:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1235:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalTextualScenario.g:1236:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalTextualScenario.g:1243:1: rule__Function__Group__0__Impl : ( ( rule__Function__KeywordAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1247:1: ( ( ( rule__Function__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1248:1: ( ( rule__Function__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1248:1: ( ( rule__Function__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1249:2: ( rule__Function__KeywordAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1250:2: ( rule__Function__KeywordAssignment_0 )
            // InternalTextualScenario.g:1250:3: rule__Function__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalTextualScenario.g:1258:1: rule__Function__Group__1 : rule__Function__Group__1__Impl ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1262:1: ( rule__Function__Group__1__Impl )
            // InternalTextualScenario.g:1263:2: rule__Function__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalTextualScenario.g:1269:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1273:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1274:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1274:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalTextualScenario.g:1275:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1276:2: ( rule__Function__NameAssignment_1 )
            // InternalTextualScenario.g:1276:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalTextualScenario.g:1285:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1289:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalTextualScenario.g:1290:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalTextualScenario.g:1297:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__KeywordAssignment_0 ) ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1301:1: ( ( ( rule__Activity__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1302:1: ( ( rule__Activity__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1302:1: ( ( rule__Activity__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1303:2: ( rule__Activity__KeywordAssignment_0 )
            {
             before(grammarAccess.getActivityAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1304:2: ( rule__Activity__KeywordAssignment_0 )
            // InternalTextualScenario.g:1304:3: rule__Activity__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalTextualScenario.g:1312:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1316:1: ( rule__Activity__Group__1__Impl )
            // InternalTextualScenario.g:1317:2: rule__Activity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalTextualScenario.g:1323:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1327:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1328:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1328:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalTextualScenario.g:1329:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1330:2: ( rule__Activity__NameAssignment_1 )
            // InternalTextualScenario.g:1330:3: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalTextualScenario.g:1339:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1343:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalTextualScenario.g:1344:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalTextualScenario.g:1351:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__KeywordAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1355:1: ( ( ( rule__Entity__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1356:1: ( ( rule__Entity__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1356:1: ( ( rule__Entity__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1357:2: ( rule__Entity__KeywordAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1358:2: ( rule__Entity__KeywordAssignment_0 )
            // InternalTextualScenario.g:1358:3: rule__Entity__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalTextualScenario.g:1366:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1370:1: ( rule__Entity__Group__1__Impl )
            // InternalTextualScenario.g:1371:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalTextualScenario.g:1377:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1381:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1382:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1382:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalTextualScenario.g:1383:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1384:2: ( rule__Entity__NameAssignment_1 )
            // InternalTextualScenario.g:1384:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalTextualScenario.g:1393:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1397:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalTextualScenario.g:1398:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalTextualScenario.g:1405:1: rule__Role__Group__0__Impl : ( ( rule__Role__KeywordAssignment_0 ) ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1409:1: ( ( ( rule__Role__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:1410:1: ( ( rule__Role__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:1410:1: ( ( rule__Role__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:1411:2: ( rule__Role__KeywordAssignment_0 )
            {
             before(grammarAccess.getRoleAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:1412:2: ( rule__Role__KeywordAssignment_0 )
            // InternalTextualScenario.g:1412:3: rule__Role__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Role__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalTextualScenario.g:1420:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1424:1: ( rule__Role__Group__1__Impl )
            // InternalTextualScenario.g:1425:2: rule__Role__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalTextualScenario.g:1431:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1435:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:1436:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:1436:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalTextualScenario.g:1437:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:1438:2: ( rule__Role__NameAssignment_1 )
            // InternalTextualScenario.g:1438:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__0"
    // InternalTextualScenario.g:1447:1: rule__SequenceMessage__Group__0 : rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 ;
    public final void rule__SequenceMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1451:1: ( rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 )
            // InternalTextualScenario.g:1452:2: rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SequenceMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__0"


    // $ANTLR start "rule__SequenceMessage__Group__0__Impl"
    // InternalTextualScenario.g:1459:1: rule__SequenceMessage__Group__0__Impl : ( ( rule__SequenceMessage__SourceAssignment_0 ) ) ;
    public final void rule__SequenceMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1463:1: ( ( ( rule__SequenceMessage__SourceAssignment_0 ) ) )
            // InternalTextualScenario.g:1464:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            {
            // InternalTextualScenario.g:1464:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            // InternalTextualScenario.g:1465:2: ( rule__SequenceMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0()); 
            // InternalTextualScenario.g:1466:2: ( rule__SequenceMessage__SourceAssignment_0 )
            // InternalTextualScenario.g:1466:3: rule__SequenceMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__0__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__1"
    // InternalTextualScenario.g:1474:1: rule__SequenceMessage__Group__1 : rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 ;
    public final void rule__SequenceMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1478:1: ( rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 )
            // InternalTextualScenario.g:1479:2: rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SequenceMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__1"


    // $ANTLR start "rule__SequenceMessage__Group__1__Impl"
    // InternalTextualScenario.g:1486:1: rule__SequenceMessage__Group__1__Impl : ( '->' ) ;
    public final void rule__SequenceMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1490:1: ( ( '->' ) )
            // InternalTextualScenario.g:1491:1: ( '->' )
            {
            // InternalTextualScenario.g:1491:1: ( '->' )
            // InternalTextualScenario.g:1492:2: '->'
            {
             before(grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__1__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__2"
    // InternalTextualScenario.g:1501:1: rule__SequenceMessage__Group__2 : rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 ;
    public final void rule__SequenceMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1505:1: ( rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 )
            // InternalTextualScenario.g:1506:2: rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SequenceMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__2"


    // $ANTLR start "rule__SequenceMessage__Group__2__Impl"
    // InternalTextualScenario.g:1513:1: rule__SequenceMessage__Group__2__Impl : ( ( rule__SequenceMessage__TargetAssignment_2 ) ) ;
    public final void rule__SequenceMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1517:1: ( ( ( rule__SequenceMessage__TargetAssignment_2 ) ) )
            // InternalTextualScenario.g:1518:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            {
            // InternalTextualScenario.g:1518:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            // InternalTextualScenario.g:1519:2: ( rule__SequenceMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2()); 
            // InternalTextualScenario.g:1520:2: ( rule__SequenceMessage__TargetAssignment_2 )
            // InternalTextualScenario.g:1520:3: rule__SequenceMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__2__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__3"
    // InternalTextualScenario.g:1528:1: rule__SequenceMessage__Group__3 : rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 ;
    public final void rule__SequenceMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1532:1: ( rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 )
            // InternalTextualScenario.g:1533:2: rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SequenceMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__3"


    // $ANTLR start "rule__SequenceMessage__Group__3__Impl"
    // InternalTextualScenario.g:1540:1: rule__SequenceMessage__Group__3__Impl : ( ( rule__SequenceMessage__ExecutionAssignment_3 )? ) ;
    public final void rule__SequenceMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1544:1: ( ( ( rule__SequenceMessage__ExecutionAssignment_3 )? ) )
            // InternalTextualScenario.g:1545:1: ( ( rule__SequenceMessage__ExecutionAssignment_3 )? )
            {
            // InternalTextualScenario.g:1545:1: ( ( rule__SequenceMessage__ExecutionAssignment_3 )? )
            // InternalTextualScenario.g:1546:2: ( rule__SequenceMessage__ExecutionAssignment_3 )?
            {
             before(grammarAccess.getSequenceMessageAccess().getExecutionAssignment_3()); 
            // InternalTextualScenario.g:1547:2: ( rule__SequenceMessage__ExecutionAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTextualScenario.g:1547:3: rule__SequenceMessage__ExecutionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceMessage__ExecutionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceMessageAccess().getExecutionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__3__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__4"
    // InternalTextualScenario.g:1555:1: rule__SequenceMessage__Group__4 : rule__SequenceMessage__Group__4__Impl rule__SequenceMessage__Group__5 ;
    public final void rule__SequenceMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1559:1: ( rule__SequenceMessage__Group__4__Impl rule__SequenceMessage__Group__5 )
            // InternalTextualScenario.g:1560:2: rule__SequenceMessage__Group__4__Impl rule__SequenceMessage__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SequenceMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__4"


    // $ANTLR start "rule__SequenceMessage__Group__4__Impl"
    // InternalTextualScenario.g:1567:1: rule__SequenceMessage__Group__4__Impl : ( ( rule__SequenceMessage__ReturnAssignment_4 )? ) ;
    public final void rule__SequenceMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1571:1: ( ( ( rule__SequenceMessage__ReturnAssignment_4 )? ) )
            // InternalTextualScenario.g:1572:1: ( ( rule__SequenceMessage__ReturnAssignment_4 )? )
            {
            // InternalTextualScenario.g:1572:1: ( ( rule__SequenceMessage__ReturnAssignment_4 )? )
            // InternalTextualScenario.g:1573:2: ( rule__SequenceMessage__ReturnAssignment_4 )?
            {
             before(grammarAccess.getSequenceMessageAccess().getReturnAssignment_4()); 
            // InternalTextualScenario.g:1574:2: ( rule__SequenceMessage__ReturnAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTextualScenario.g:1574:3: rule__SequenceMessage__ReturnAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceMessage__ReturnAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceMessageAccess().getReturnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__4__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__5"
    // InternalTextualScenario.g:1582:1: rule__SequenceMessage__Group__5 : rule__SequenceMessage__Group__5__Impl rule__SequenceMessage__Group__6 ;
    public final void rule__SequenceMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1586:1: ( rule__SequenceMessage__Group__5__Impl rule__SequenceMessage__Group__6 )
            // InternalTextualScenario.g:1587:2: rule__SequenceMessage__Group__5__Impl rule__SequenceMessage__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__SequenceMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__5"


    // $ANTLR start "rule__SequenceMessage__Group__5__Impl"
    // InternalTextualScenario.g:1594:1: rule__SequenceMessage__Group__5__Impl : ( ':' ) ;
    public final void rule__SequenceMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1598:1: ( ( ':' ) )
            // InternalTextualScenario.g:1599:1: ( ':' )
            {
            // InternalTextualScenario.g:1599:1: ( ':' )
            // InternalTextualScenario.g:1600:2: ':'
            {
             before(grammarAccess.getSequenceMessageAccess().getColonKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__5__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__6"
    // InternalTextualScenario.g:1609:1: rule__SequenceMessage__Group__6 : rule__SequenceMessage__Group__6__Impl ;
    public final void rule__SequenceMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1613:1: ( rule__SequenceMessage__Group__6__Impl )
            // InternalTextualScenario.g:1614:2: rule__SequenceMessage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__6"


    // $ANTLR start "rule__SequenceMessage__Group__6__Impl"
    // InternalTextualScenario.g:1620:1: rule__SequenceMessage__Group__6__Impl : ( ( rule__SequenceMessage__NameAssignment_6 ) ) ;
    public final void rule__SequenceMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1624:1: ( ( ( rule__SequenceMessage__NameAssignment_6 ) ) )
            // InternalTextualScenario.g:1625:1: ( ( rule__SequenceMessage__NameAssignment_6 ) )
            {
            // InternalTextualScenario.g:1625:1: ( ( rule__SequenceMessage__NameAssignment_6 ) )
            // InternalTextualScenario.g:1626:2: ( rule__SequenceMessage__NameAssignment_6 )
            {
             before(grammarAccess.getSequenceMessageAccess().getNameAssignment_6()); 
            // InternalTextualScenario.g:1627:2: ( rule__SequenceMessage__NameAssignment_6 )
            // InternalTextualScenario.g:1627:3: rule__SequenceMessage__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__6__Impl"


    // $ANTLR start "rule__CreateMessage__Group__0"
    // InternalTextualScenario.g:1636:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1640:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalTextualScenario.g:1641:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CreateMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__0"


    // $ANTLR start "rule__CreateMessage__Group__0__Impl"
    // InternalTextualScenario.g:1648:1: rule__CreateMessage__Group__0__Impl : ( ( rule__CreateMessage__SourceAssignment_0 ) ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1652:1: ( ( ( rule__CreateMessage__SourceAssignment_0 ) ) )
            // InternalTextualScenario.g:1653:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            {
            // InternalTextualScenario.g:1653:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            // InternalTextualScenario.g:1654:2: ( rule__CreateMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getCreateMessageAccess().getSourceAssignment_0()); 
            // InternalTextualScenario.g:1655:2: ( rule__CreateMessage__SourceAssignment_0 )
            // InternalTextualScenario.g:1655:3: rule__CreateMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__0__Impl"


    // $ANTLR start "rule__CreateMessage__Group__1"
    // InternalTextualScenario.g:1663:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1667:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalTextualScenario.g:1668:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CreateMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__1"


    // $ANTLR start "rule__CreateMessage__Group__1__Impl"
    // InternalTextualScenario.g:1675:1: rule__CreateMessage__Group__1__Impl : ( '->+' ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1679:1: ( ( '->+' ) )
            // InternalTextualScenario.g:1680:1: ( '->+' )
            {
            // InternalTextualScenario.g:1680:1: ( '->+' )
            // InternalTextualScenario.g:1681:2: '->+'
            {
             before(grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__1__Impl"


    // $ANTLR start "rule__CreateMessage__Group__2"
    // InternalTextualScenario.g:1690:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1694:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalTextualScenario.g:1695:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CreateMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__2"


    // $ANTLR start "rule__CreateMessage__Group__2__Impl"
    // InternalTextualScenario.g:1702:1: rule__CreateMessage__Group__2__Impl : ( ( rule__CreateMessage__TargetAssignment_2 ) ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1706:1: ( ( ( rule__CreateMessage__TargetAssignment_2 ) ) )
            // InternalTextualScenario.g:1707:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            {
            // InternalTextualScenario.g:1707:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            // InternalTextualScenario.g:1708:2: ( rule__CreateMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateMessageAccess().getTargetAssignment_2()); 
            // InternalTextualScenario.g:1709:2: ( rule__CreateMessage__TargetAssignment_2 )
            // InternalTextualScenario.g:1709:3: rule__CreateMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__2__Impl"


    // $ANTLR start "rule__CreateMessage__Group__3"
    // InternalTextualScenario.g:1717:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1721:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalTextualScenario.g:1722:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CreateMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__3"


    // $ANTLR start "rule__CreateMessage__Group__3__Impl"
    // InternalTextualScenario.g:1729:1: rule__CreateMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1733:1: ( ( ':' ) )
            // InternalTextualScenario.g:1734:1: ( ':' )
            {
            // InternalTextualScenario.g:1734:1: ( ':' )
            // InternalTextualScenario.g:1735:2: ':'
            {
             before(grammarAccess.getCreateMessageAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__3__Impl"


    // $ANTLR start "rule__CreateMessage__Group__4"
    // InternalTextualScenario.g:1744:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1748:1: ( rule__CreateMessage__Group__4__Impl )
            // InternalTextualScenario.g:1749:2: rule__CreateMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__4"


    // $ANTLR start "rule__CreateMessage__Group__4__Impl"
    // InternalTextualScenario.g:1755:1: rule__CreateMessage__Group__4__Impl : ( ( rule__CreateMessage__NameAssignment_4 ) ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1759:1: ( ( ( rule__CreateMessage__NameAssignment_4 ) ) )
            // InternalTextualScenario.g:1760:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            {
            // InternalTextualScenario.g:1760:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            // InternalTextualScenario.g:1761:2: ( rule__CreateMessage__NameAssignment_4 )
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_4()); 
            // InternalTextualScenario.g:1762:2: ( rule__CreateMessage__NameAssignment_4 )
            // InternalTextualScenario.g:1762:3: rule__CreateMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__4__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__0"
    // InternalTextualScenario.g:1771:1: rule__DeleteMessage__Group__0 : rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 ;
    public final void rule__DeleteMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1775:1: ( rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 )
            // InternalTextualScenario.g:1776:2: rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DeleteMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__0"


    // $ANTLR start "rule__DeleteMessage__Group__0__Impl"
    // InternalTextualScenario.g:1783:1: rule__DeleteMessage__Group__0__Impl : ( ( rule__DeleteMessage__SourceAssignment_0 ) ) ;
    public final void rule__DeleteMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1787:1: ( ( ( rule__DeleteMessage__SourceAssignment_0 ) ) )
            // InternalTextualScenario.g:1788:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            {
            // InternalTextualScenario.g:1788:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            // InternalTextualScenario.g:1789:2: ( rule__DeleteMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0()); 
            // InternalTextualScenario.g:1790:2: ( rule__DeleteMessage__SourceAssignment_0 )
            // InternalTextualScenario.g:1790:3: rule__DeleteMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__1"
    // InternalTextualScenario.g:1798:1: rule__DeleteMessage__Group__1 : rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 ;
    public final void rule__DeleteMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1802:1: ( rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 )
            // InternalTextualScenario.g:1803:2: rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DeleteMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__1"


    // $ANTLR start "rule__DeleteMessage__Group__1__Impl"
    // InternalTextualScenario.g:1810:1: rule__DeleteMessage__Group__1__Impl : ( '->x' ) ;
    public final void rule__DeleteMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1814:1: ( ( '->x' ) )
            // InternalTextualScenario.g:1815:1: ( '->x' )
            {
            // InternalTextualScenario.g:1815:1: ( '->x' )
            // InternalTextualScenario.g:1816:2: '->x'
            {
             before(grammarAccess.getDeleteMessageAccess().getXKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__2"
    // InternalTextualScenario.g:1825:1: rule__DeleteMessage__Group__2 : rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 ;
    public final void rule__DeleteMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1829:1: ( rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 )
            // InternalTextualScenario.g:1830:2: rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DeleteMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__2"


    // $ANTLR start "rule__DeleteMessage__Group__2__Impl"
    // InternalTextualScenario.g:1837:1: rule__DeleteMessage__Group__2__Impl : ( ( rule__DeleteMessage__TargetAssignment_2 ) ) ;
    public final void rule__DeleteMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1841:1: ( ( ( rule__DeleteMessage__TargetAssignment_2 ) ) )
            // InternalTextualScenario.g:1842:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            {
            // InternalTextualScenario.g:1842:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            // InternalTextualScenario.g:1843:2: ( rule__DeleteMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2()); 
            // InternalTextualScenario.g:1844:2: ( rule__DeleteMessage__TargetAssignment_2 )
            // InternalTextualScenario.g:1844:3: rule__DeleteMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__2__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__3"
    // InternalTextualScenario.g:1852:1: rule__DeleteMessage__Group__3 : rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 ;
    public final void rule__DeleteMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1856:1: ( rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 )
            // InternalTextualScenario.g:1857:2: rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DeleteMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3"


    // $ANTLR start "rule__DeleteMessage__Group__3__Impl"
    // InternalTextualScenario.g:1864:1: rule__DeleteMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__DeleteMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1868:1: ( ( ':' ) )
            // InternalTextualScenario.g:1869:1: ( ':' )
            {
            // InternalTextualScenario.g:1869:1: ( ':' )
            // InternalTextualScenario.g:1870:2: ':'
            {
             before(grammarAccess.getDeleteMessageAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__4"
    // InternalTextualScenario.g:1879:1: rule__DeleteMessage__Group__4 : rule__DeleteMessage__Group__4__Impl ;
    public final void rule__DeleteMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1883:1: ( rule__DeleteMessage__Group__4__Impl )
            // InternalTextualScenario.g:1884:2: rule__DeleteMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__4"


    // $ANTLR start "rule__DeleteMessage__Group__4__Impl"
    // InternalTextualScenario.g:1890:1: rule__DeleteMessage__Group__4__Impl : ( ( rule__DeleteMessage__NameAssignment_4 ) ) ;
    public final void rule__DeleteMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1894:1: ( ( ( rule__DeleteMessage__NameAssignment_4 ) ) )
            // InternalTextualScenario.g:1895:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            {
            // InternalTextualScenario.g:1895:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            // InternalTextualScenario.g:1896:2: ( rule__DeleteMessage__NameAssignment_4 )
            {
             before(grammarAccess.getDeleteMessageAccess().getNameAssignment_4()); 
            // InternalTextualScenario.g:1897:2: ( rule__DeleteMessage__NameAssignment_4 )
            // InternalTextualScenario.g:1897:3: rule__DeleteMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__4__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__0"
    // InternalTextualScenario.g:1906:1: rule__ArmTimerMessage__Group__0 : rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 ;
    public final void rule__ArmTimerMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1910:1: ( rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 )
            // InternalTextualScenario.g:1911:2: rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ArmTimerMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__0"


    // $ANTLR start "rule__ArmTimerMessage__Group__0__Impl"
    // InternalTextualScenario.g:1918:1: rule__ArmTimerMessage__Group__0__Impl : ( '->>' ) ;
    public final void rule__ArmTimerMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1922:1: ( ( '->>' ) )
            // InternalTextualScenario.g:1923:1: ( '->>' )
            {
            // InternalTextualScenario.g:1923:1: ( '->>' )
            // InternalTextualScenario.g:1924:2: '->>'
            {
             before(grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__0__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__1"
    // InternalTextualScenario.g:1933:1: rule__ArmTimerMessage__Group__1 : rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 ;
    public final void rule__ArmTimerMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1937:1: ( rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 )
            // InternalTextualScenario.g:1938:2: rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ArmTimerMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__1"


    // $ANTLR start "rule__ArmTimerMessage__Group__1__Impl"
    // InternalTextualScenario.g:1945:1: rule__ArmTimerMessage__Group__1__Impl : ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) ;
    public final void rule__ArmTimerMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1949:1: ( ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) )
            // InternalTextualScenario.g:1950:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            {
            // InternalTextualScenario.g:1950:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            // InternalTextualScenario.g:1951:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1()); 
            // InternalTextualScenario.g:1952:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            // InternalTextualScenario.g:1952:3: rule__ArmTimerMessage__ParticipantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__ParticipantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__1__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__2"
    // InternalTextualScenario.g:1960:1: rule__ArmTimerMessage__Group__2 : rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 ;
    public final void rule__ArmTimerMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1964:1: ( rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 )
            // InternalTextualScenario.g:1965:2: rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ArmTimerMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__2"


    // $ANTLR start "rule__ArmTimerMessage__Group__2__Impl"
    // InternalTextualScenario.g:1972:1: rule__ArmTimerMessage__Group__2__Impl : ( ':' ) ;
    public final void rule__ArmTimerMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1976:1: ( ( ':' ) )
            // InternalTextualScenario.g:1977:1: ( ':' )
            {
            // InternalTextualScenario.g:1977:1: ( ':' )
            // InternalTextualScenario.g:1978:2: ':'
            {
             before(grammarAccess.getArmTimerMessageAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__2__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__3"
    // InternalTextualScenario.g:1987:1: rule__ArmTimerMessage__Group__3 : rule__ArmTimerMessage__Group__3__Impl ;
    public final void rule__ArmTimerMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:1991:1: ( rule__ArmTimerMessage__Group__3__Impl )
            // InternalTextualScenario.g:1992:2: rule__ArmTimerMessage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__3"


    // $ANTLR start "rule__ArmTimerMessage__Group__3__Impl"
    // InternalTextualScenario.g:1998:1: rule__ArmTimerMessage__Group__3__Impl : ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) ;
    public final void rule__ArmTimerMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2002:1: ( ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) )
            // InternalTextualScenario.g:2003:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            {
            // InternalTextualScenario.g:2003:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            // InternalTextualScenario.g:2004:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3()); 
            // InternalTextualScenario.g:2005:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            // InternalTextualScenario.g:2005:3: rule__ArmTimerMessage__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__3__Impl"


    // $ANTLR start "rule__ParticipantDeactivation__Group__0"
    // InternalTextualScenario.g:2014:1: rule__ParticipantDeactivation__Group__0 : rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 ;
    public final void rule__ParticipantDeactivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2018:1: ( rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 )
            // InternalTextualScenario.g:2019:2: rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ParticipantDeactivation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__0"


    // $ANTLR start "rule__ParticipantDeactivation__Group__0__Impl"
    // InternalTextualScenario.g:2026:1: rule__ParticipantDeactivation__Group__0__Impl : ( ( rule__ParticipantDeactivation__KeywordAssignment_0 ) ) ;
    public final void rule__ParticipantDeactivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2030:1: ( ( ( rule__ParticipantDeactivation__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:2031:1: ( ( rule__ParticipantDeactivation__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:2031:1: ( ( rule__ParticipantDeactivation__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:2032:2: ( rule__ParticipantDeactivation__KeywordAssignment_0 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:2033:2: ( rule__ParticipantDeactivation__KeywordAssignment_0 )
            // InternalTextualScenario.g:2033:3: rule__ParticipantDeactivation__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDeactivationAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__0__Impl"


    // $ANTLR start "rule__ParticipantDeactivation__Group__1"
    // InternalTextualScenario.g:2041:1: rule__ParticipantDeactivation__Group__1 : rule__ParticipantDeactivation__Group__1__Impl ;
    public final void rule__ParticipantDeactivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2045:1: ( rule__ParticipantDeactivation__Group__1__Impl )
            // InternalTextualScenario.g:2046:2: rule__ParticipantDeactivation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__1"


    // $ANTLR start "rule__ParticipantDeactivation__Group__1__Impl"
    // InternalTextualScenario.g:2052:1: rule__ParticipantDeactivation__Group__1__Impl : ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) ;
    public final void rule__ParticipantDeactivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2056:1: ( ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) )
            // InternalTextualScenario.g:2057:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            {
            // InternalTextualScenario.g:2057:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            // InternalTextualScenario.g:2058:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1()); 
            // InternalTextualScenario.g:2059:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            // InternalTextualScenario.g:2059:3: rule__ParticipantDeactivation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalTextualScenario.g:2068:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2072:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalTextualScenario.g:2073:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalTextualScenario.g:2080:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__KeywordAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2084:1: ( ( ( rule__Reference__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:2085:1: ( ( rule__Reference__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:2085:1: ( ( rule__Reference__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:2086:2: ( rule__Reference__KeywordAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:2087:2: ( rule__Reference__KeywordAssignment_0 )
            // InternalTextualScenario.g:2087:3: rule__Reference__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalTextualScenario.g:2095:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2099:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalTextualScenario.g:2100:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalTextualScenario.g:2107:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__OverAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2111:1: ( ( ( rule__Reference__OverAssignment_1 ) ) )
            // InternalTextualScenario.g:2112:1: ( ( rule__Reference__OverAssignment_1 ) )
            {
            // InternalTextualScenario.g:2112:1: ( ( rule__Reference__OverAssignment_1 ) )
            // InternalTextualScenario.g:2113:2: ( rule__Reference__OverAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getOverAssignment_1()); 
            // InternalTextualScenario.g:2114:2: ( rule__Reference__OverAssignment_1 )
            // InternalTextualScenario.g:2114:3: rule__Reference__OverAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OverAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOverAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalTextualScenario.g:2122:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2126:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalTextualScenario.g:2127:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalTextualScenario.g:2134:1: rule__Reference__Group__2__Impl : ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2138:1: ( ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) )
            // InternalTextualScenario.g:2139:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            {
            // InternalTextualScenario.g:2139:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            // InternalTextualScenario.g:2140:2: ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* )
            {
            // InternalTextualScenario.g:2140:2: ( ( rule__Reference__TimelinesAssignment_2 ) )
            // InternalTextualScenario.g:2141:3: ( rule__Reference__TimelinesAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalTextualScenario.g:2142:3: ( rule__Reference__TimelinesAssignment_2 )
            // InternalTextualScenario.g:2142:4: rule__Reference__TimelinesAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__Reference__TimelinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 

            }

            // InternalTextualScenario.g:2145:2: ( ( rule__Reference__TimelinesAssignment_2 )* )
            // InternalTextualScenario.g:2146:3: ( rule__Reference__TimelinesAssignment_2 )*
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalTextualScenario.g:2147:3: ( rule__Reference__TimelinesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_STRING) ) {
                        int LA15_2 = input.LA(3);

                        if ( (LA15_2==EOF||LA15_2==RULE_STRING||LA15_2==22||LA15_2==25||(LA15_2>=34 && LA15_2<=35)||(LA15_2>=37 && LA15_2<=38)) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalTextualScenario.g:2147:4: rule__Reference__TimelinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Reference__TimelinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalTextualScenario.g:2156:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2160:1: ( rule__Reference__Group__3__Impl )
            // InternalTextualScenario.g:2161:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalTextualScenario.g:2167:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__NameAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2171:1: ( ( ( rule__Reference__NameAssignment_3 ) ) )
            // InternalTextualScenario.g:2172:1: ( ( rule__Reference__NameAssignment_3 ) )
            {
            // InternalTextualScenario.g:2172:1: ( ( rule__Reference__NameAssignment_3 ) )
            // InternalTextualScenario.g:2173:2: ( rule__Reference__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            // InternalTextualScenario.g:2174:2: ( rule__Reference__NameAssignment_3 )
            // InternalTextualScenario.g:2174:3: rule__Reference__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Alt__Group__0"
    // InternalTextualScenario.g:2183:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2187:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalTextualScenario.g:2188:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Alt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__0"


    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalTextualScenario.g:2195:1: rule__Alt__Group__0__Impl : ( ( rule__Alt__KeywordAssignment_0 ) ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2199:1: ( ( ( rule__Alt__KeywordAssignment_0 ) ) )
            // InternalTextualScenario.g:2200:1: ( ( rule__Alt__KeywordAssignment_0 ) )
            {
            // InternalTextualScenario.g:2200:1: ( ( rule__Alt__KeywordAssignment_0 ) )
            // InternalTextualScenario.g:2201:2: ( rule__Alt__KeywordAssignment_0 )
            {
             before(grammarAccess.getAltAccess().getKeywordAssignment_0()); 
            // InternalTextualScenario.g:2202:2: ( rule__Alt__KeywordAssignment_0 )
            // InternalTextualScenario.g:2202:3: rule__Alt__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Alt__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__0__Impl"


    // $ANTLR start "rule__Alt__Group__1"
    // InternalTextualScenario.g:2210:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl rule__Alt__Group__2 ;
    public final void rule__Alt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2214:1: ( rule__Alt__Group__1__Impl rule__Alt__Group__2 )
            // InternalTextualScenario.g:2215:2: rule__Alt__Group__1__Impl rule__Alt__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Alt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__1"


    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalTextualScenario.g:2222:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ConditionAssignment_1 ) ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2226:1: ( ( ( rule__Alt__ConditionAssignment_1 ) ) )
            // InternalTextualScenario.g:2227:1: ( ( rule__Alt__ConditionAssignment_1 ) )
            {
            // InternalTextualScenario.g:2227:1: ( ( rule__Alt__ConditionAssignment_1 ) )
            // InternalTextualScenario.g:2228:2: ( rule__Alt__ConditionAssignment_1 )
            {
             before(grammarAccess.getAltAccess().getConditionAssignment_1()); 
            // InternalTextualScenario.g:2229:2: ( rule__Alt__ConditionAssignment_1 )
            // InternalTextualScenario.g:2229:3: rule__Alt__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alt__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__1__Impl"


    // $ANTLR start "rule__Alt__Group__2"
    // InternalTextualScenario.g:2237:1: rule__Alt__Group__2 : rule__Alt__Group__2__Impl rule__Alt__Group__3 ;
    public final void rule__Alt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2241:1: ( rule__Alt__Group__2__Impl rule__Alt__Group__3 )
            // InternalTextualScenario.g:2242:2: rule__Alt__Group__2__Impl rule__Alt__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Alt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__2"


    // $ANTLR start "rule__Alt__Group__2__Impl"
    // InternalTextualScenario.g:2249:1: rule__Alt__Group__2__Impl : ( ( rule__Alt__OverAssignment_2 ) ) ;
    public final void rule__Alt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2253:1: ( ( ( rule__Alt__OverAssignment_2 ) ) )
            // InternalTextualScenario.g:2254:1: ( ( rule__Alt__OverAssignment_2 ) )
            {
            // InternalTextualScenario.g:2254:1: ( ( rule__Alt__OverAssignment_2 ) )
            // InternalTextualScenario.g:2255:2: ( rule__Alt__OverAssignment_2 )
            {
             before(grammarAccess.getAltAccess().getOverAssignment_2()); 
            // InternalTextualScenario.g:2256:2: ( rule__Alt__OverAssignment_2 )
            // InternalTextualScenario.g:2256:3: rule__Alt__OverAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Alt__OverAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getOverAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__2__Impl"


    // $ANTLR start "rule__Alt__Group__3"
    // InternalTextualScenario.g:2264:1: rule__Alt__Group__3 : rule__Alt__Group__3__Impl rule__Alt__Group__4 ;
    public final void rule__Alt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2268:1: ( rule__Alt__Group__3__Impl rule__Alt__Group__4 )
            // InternalTextualScenario.g:2269:2: rule__Alt__Group__3__Impl rule__Alt__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Alt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__3"


    // $ANTLR start "rule__Alt__Group__3__Impl"
    // InternalTextualScenario.g:2276:1: rule__Alt__Group__3__Impl : ( ( ( rule__Alt__TimelinesAssignment_3 ) ) ( ( rule__Alt__TimelinesAssignment_3 )* ) ) ;
    public final void rule__Alt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2280:1: ( ( ( ( rule__Alt__TimelinesAssignment_3 ) ) ( ( rule__Alt__TimelinesAssignment_3 )* ) ) )
            // InternalTextualScenario.g:2281:1: ( ( ( rule__Alt__TimelinesAssignment_3 ) ) ( ( rule__Alt__TimelinesAssignment_3 )* ) )
            {
            // InternalTextualScenario.g:2281:1: ( ( ( rule__Alt__TimelinesAssignment_3 ) ) ( ( rule__Alt__TimelinesAssignment_3 )* ) )
            // InternalTextualScenario.g:2282:2: ( ( rule__Alt__TimelinesAssignment_3 ) ) ( ( rule__Alt__TimelinesAssignment_3 )* )
            {
            // InternalTextualScenario.g:2282:2: ( ( rule__Alt__TimelinesAssignment_3 ) )
            // InternalTextualScenario.g:2283:3: ( rule__Alt__TimelinesAssignment_3 )
            {
             before(grammarAccess.getAltAccess().getTimelinesAssignment_3()); 
            // InternalTextualScenario.g:2284:3: ( rule__Alt__TimelinesAssignment_3 )
            // InternalTextualScenario.g:2284:4: rule__Alt__TimelinesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Alt__TimelinesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getTimelinesAssignment_3()); 

            }

            // InternalTextualScenario.g:2287:2: ( ( rule__Alt__TimelinesAssignment_3 )* )
            // InternalTextualScenario.g:2288:3: ( rule__Alt__TimelinesAssignment_3 )*
            {
             before(grammarAccess.getAltAccess().getTimelinesAssignment_3()); 
            // InternalTextualScenario.g:2289:3: ( rule__Alt__TimelinesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTextualScenario.g:2289:4: rule__Alt__TimelinesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Alt__TimelinesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAltAccess().getTimelinesAssignment_3()); 

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
    // $ANTLR end "rule__Alt__Group__3__Impl"


    // $ANTLR start "rule__Alt__Group__4"
    // InternalTextualScenario.g:2298:1: rule__Alt__Group__4 : rule__Alt__Group__4__Impl rule__Alt__Group__5 ;
    public final void rule__Alt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2302:1: ( rule__Alt__Group__4__Impl rule__Alt__Group__5 )
            // InternalTextualScenario.g:2303:2: rule__Alt__Group__4__Impl rule__Alt__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Alt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__4"


    // $ANTLR start "rule__Alt__Group__4__Impl"
    // InternalTextualScenario.g:2310:1: rule__Alt__Group__4__Impl : ( ( rule__Alt__BlockAssignment_4 ) ) ;
    public final void rule__Alt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2314:1: ( ( ( rule__Alt__BlockAssignment_4 ) ) )
            // InternalTextualScenario.g:2315:1: ( ( rule__Alt__BlockAssignment_4 ) )
            {
            // InternalTextualScenario.g:2315:1: ( ( rule__Alt__BlockAssignment_4 ) )
            // InternalTextualScenario.g:2316:2: ( rule__Alt__BlockAssignment_4 )
            {
             before(grammarAccess.getAltAccess().getBlockAssignment_4()); 
            // InternalTextualScenario.g:2317:2: ( rule__Alt__BlockAssignment_4 )
            // InternalTextualScenario.g:2317:3: rule__Alt__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Alt__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__4__Impl"


    // $ANTLR start "rule__Alt__Group__5"
    // InternalTextualScenario.g:2325:1: rule__Alt__Group__5 : rule__Alt__Group__5__Impl ;
    public final void rule__Alt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2329:1: ( rule__Alt__Group__5__Impl )
            // InternalTextualScenario.g:2330:2: rule__Alt__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alt__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__5"


    // $ANTLR start "rule__Alt__Group__5__Impl"
    // InternalTextualScenario.g:2336:1: rule__Alt__Group__5__Impl : ( ( rule__Alt__ElseBlocksAssignment_5 )* ) ;
    public final void rule__Alt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2340:1: ( ( ( rule__Alt__ElseBlocksAssignment_5 )* ) )
            // InternalTextualScenario.g:2341:1: ( ( rule__Alt__ElseBlocksAssignment_5 )* )
            {
            // InternalTextualScenario.g:2341:1: ( ( rule__Alt__ElseBlocksAssignment_5 )* )
            // InternalTextualScenario.g:2342:2: ( rule__Alt__ElseBlocksAssignment_5 )*
            {
             before(grammarAccess.getAltAccess().getElseBlocksAssignment_5()); 
            // InternalTextualScenario.g:2343:2: ( rule__Alt__ElseBlocksAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTextualScenario.g:2343:3: rule__Alt__ElseBlocksAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Alt__ElseBlocksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAltAccess().getElseBlocksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__Group__5__Impl"


    // $ANTLR start "rule__ElseBlock__Group__0"
    // InternalTextualScenario.g:2352:1: rule__ElseBlock__Group__0 : rule__ElseBlock__Group__0__Impl rule__ElseBlock__Group__1 ;
    public final void rule__ElseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2356:1: ( rule__ElseBlock__Group__0__Impl rule__ElseBlock__Group__1 )
            // InternalTextualScenario.g:2357:2: rule__ElseBlock__Group__0__Impl rule__ElseBlock__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ElseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__0"


    // $ANTLR start "rule__ElseBlock__Group__0__Impl"
    // InternalTextualScenario.g:2364:1: rule__ElseBlock__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2368:1: ( ( 'else' ) )
            // InternalTextualScenario.g:2369:1: ( 'else' )
            {
            // InternalTextualScenario.g:2369:1: ( 'else' )
            // InternalTextualScenario.g:2370:2: 'else'
            {
             before(grammarAccess.getElseBlockAccess().getElseKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getElseBlockAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__0__Impl"


    // $ANTLR start "rule__ElseBlock__Group__1"
    // InternalTextualScenario.g:2379:1: rule__ElseBlock__Group__1 : rule__ElseBlock__Group__1__Impl rule__ElseBlock__Group__2 ;
    public final void rule__ElseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2383:1: ( rule__ElseBlock__Group__1__Impl rule__ElseBlock__Group__2 )
            // InternalTextualScenario.g:2384:2: rule__ElseBlock__Group__1__Impl rule__ElseBlock__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ElseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__1"


    // $ANTLR start "rule__ElseBlock__Group__1__Impl"
    // InternalTextualScenario.g:2391:1: rule__ElseBlock__Group__1__Impl : ( ( rule__ElseBlock__ConditionAssignment_1 ) ) ;
    public final void rule__ElseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2395:1: ( ( ( rule__ElseBlock__ConditionAssignment_1 ) ) )
            // InternalTextualScenario.g:2396:1: ( ( rule__ElseBlock__ConditionAssignment_1 ) )
            {
            // InternalTextualScenario.g:2396:1: ( ( rule__ElseBlock__ConditionAssignment_1 ) )
            // InternalTextualScenario.g:2397:2: ( rule__ElseBlock__ConditionAssignment_1 )
            {
             before(grammarAccess.getElseBlockAccess().getConditionAssignment_1()); 
            // InternalTextualScenario.g:2398:2: ( rule__ElseBlock__ConditionAssignment_1 )
            // InternalTextualScenario.g:2398:3: rule__ElseBlock__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseBlock__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseBlockAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__1__Impl"


    // $ANTLR start "rule__ElseBlock__Group__2"
    // InternalTextualScenario.g:2406:1: rule__ElseBlock__Group__2 : rule__ElseBlock__Group__2__Impl ;
    public final void rule__ElseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2410:1: ( rule__ElseBlock__Group__2__Impl )
            // InternalTextualScenario.g:2411:2: rule__ElseBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseBlock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__2"


    // $ANTLR start "rule__ElseBlock__Group__2__Impl"
    // InternalTextualScenario.g:2417:1: rule__ElseBlock__Group__2__Impl : ( ( rule__ElseBlock__BlockAssignment_2 ) ) ;
    public final void rule__ElseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2421:1: ( ( ( rule__ElseBlock__BlockAssignment_2 ) ) )
            // InternalTextualScenario.g:2422:1: ( ( rule__ElseBlock__BlockAssignment_2 ) )
            {
            // InternalTextualScenario.g:2422:1: ( ( rule__ElseBlock__BlockAssignment_2 ) )
            // InternalTextualScenario.g:2423:2: ( rule__ElseBlock__BlockAssignment_2 )
            {
             before(grammarAccess.getElseBlockAccess().getBlockAssignment_2()); 
            // InternalTextualScenario.g:2424:2: ( rule__ElseBlock__BlockAssignment_2 )
            // InternalTextualScenario.g:2424:3: rule__ElseBlock__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseBlock__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseBlockAccess().getBlockAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalTextualScenario.g:2433:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2437:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalTextualScenario.g:2438:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalTextualScenario.g:2445:1: rule__Block__Group__0__Impl : ( ( rule__Block__BeginAssignment_0 ) ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2449:1: ( ( ( rule__Block__BeginAssignment_0 ) ) )
            // InternalTextualScenario.g:2450:1: ( ( rule__Block__BeginAssignment_0 ) )
            {
            // InternalTextualScenario.g:2450:1: ( ( rule__Block__BeginAssignment_0 ) )
            // InternalTextualScenario.g:2451:2: ( rule__Block__BeginAssignment_0 )
            {
             before(grammarAccess.getBlockAccess().getBeginAssignment_0()); 
            // InternalTextualScenario.g:2452:2: ( rule__Block__BeginAssignment_0 )
            // InternalTextualScenario.g:2452:3: rule__Block__BeginAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Block__BeginAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getBeginAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalTextualScenario.g:2460:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2464:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalTextualScenario.g:2465:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalTextualScenario.g:2472:1: rule__Block__Group__1__Impl : ( ( rule__Block__BlockElementsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2476:1: ( ( ( rule__Block__BlockElementsAssignment_1 )* ) )
            // InternalTextualScenario.g:2477:1: ( ( rule__Block__BlockElementsAssignment_1 )* )
            {
            // InternalTextualScenario.g:2477:1: ( ( rule__Block__BlockElementsAssignment_1 )* )
            // InternalTextualScenario.g:2478:2: ( rule__Block__BlockElementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getBlockElementsAssignment_1()); 
            // InternalTextualScenario.g:2479:2: ( rule__Block__BlockElementsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==22||(LA18_0>=34 && LA18_0<=35)||(LA18_0>=37 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTextualScenario.g:2479:3: rule__Block__BlockElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Block__BlockElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getBlockElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalTextualScenario.g:2487:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2491:1: ( rule__Block__Group__2__Impl )
            // InternalTextualScenario.g:2492:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalTextualScenario.g:2498:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2502:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalTextualScenario.g:2503:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalTextualScenario.g:2503:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalTextualScenario.g:2504:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalTextualScenario.g:2505:2: ( rule__Block__EndAssignment_2 )
            // InternalTextualScenario.g:2505:3: rule__Block__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__StateFragment__Group__0"
    // InternalTextualScenario.g:2514:1: rule__StateFragment__Group__0 : rule__StateFragment__Group__0__Impl rule__StateFragment__Group__1 ;
    public final void rule__StateFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2518:1: ( rule__StateFragment__Group__0__Impl rule__StateFragment__Group__1 )
            // InternalTextualScenario.g:2519:2: rule__StateFragment__Group__0__Impl rule__StateFragment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__StateFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__0"


    // $ANTLR start "rule__StateFragment__Group__0__Impl"
    // InternalTextualScenario.g:2526:1: rule__StateFragment__Group__0__Impl : ( ( rule__StateFragment__OnAssignment_0 ) ) ;
    public final void rule__StateFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2530:1: ( ( ( rule__StateFragment__OnAssignment_0 ) ) )
            // InternalTextualScenario.g:2531:1: ( ( rule__StateFragment__OnAssignment_0 ) )
            {
            // InternalTextualScenario.g:2531:1: ( ( rule__StateFragment__OnAssignment_0 ) )
            // InternalTextualScenario.g:2532:2: ( rule__StateFragment__OnAssignment_0 )
            {
             before(grammarAccess.getStateFragmentAccess().getOnAssignment_0()); 
            // InternalTextualScenario.g:2533:2: ( rule__StateFragment__OnAssignment_0 )
            // InternalTextualScenario.g:2533:3: rule__StateFragment__OnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__OnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getOnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__0__Impl"


    // $ANTLR start "rule__StateFragment__Group__1"
    // InternalTextualScenario.g:2541:1: rule__StateFragment__Group__1 : rule__StateFragment__Group__1__Impl rule__StateFragment__Group__2 ;
    public final void rule__StateFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2545:1: ( rule__StateFragment__Group__1__Impl rule__StateFragment__Group__2 )
            // InternalTextualScenario.g:2546:2: rule__StateFragment__Group__1__Impl rule__StateFragment__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__StateFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__1"


    // $ANTLR start "rule__StateFragment__Group__1__Impl"
    // InternalTextualScenario.g:2553:1: rule__StateFragment__Group__1__Impl : ( ( rule__StateFragment__TimelineAssignment_1 ) ) ;
    public final void rule__StateFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2557:1: ( ( ( rule__StateFragment__TimelineAssignment_1 ) ) )
            // InternalTextualScenario.g:2558:1: ( ( rule__StateFragment__TimelineAssignment_1 ) )
            {
            // InternalTextualScenario.g:2558:1: ( ( rule__StateFragment__TimelineAssignment_1 ) )
            // InternalTextualScenario.g:2559:2: ( rule__StateFragment__TimelineAssignment_1 )
            {
             before(grammarAccess.getStateFragmentAccess().getTimelineAssignment_1()); 
            // InternalTextualScenario.g:2560:2: ( rule__StateFragment__TimelineAssignment_1 )
            // InternalTextualScenario.g:2560:3: rule__StateFragment__TimelineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__TimelineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getTimelineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__1__Impl"


    // $ANTLR start "rule__StateFragment__Group__2"
    // InternalTextualScenario.g:2568:1: rule__StateFragment__Group__2 : rule__StateFragment__Group__2__Impl rule__StateFragment__Group__3 ;
    public final void rule__StateFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2572:1: ( rule__StateFragment__Group__2__Impl rule__StateFragment__Group__3 )
            // InternalTextualScenario.g:2573:2: rule__StateFragment__Group__2__Impl rule__StateFragment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__StateFragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFragment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__2"


    // $ANTLR start "rule__StateFragment__Group__2__Impl"
    // InternalTextualScenario.g:2580:1: rule__StateFragment__Group__2__Impl : ( ( rule__StateFragment__KeywordAssignment_2 ) ) ;
    public final void rule__StateFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2584:1: ( ( ( rule__StateFragment__KeywordAssignment_2 ) ) )
            // InternalTextualScenario.g:2585:1: ( ( rule__StateFragment__KeywordAssignment_2 ) )
            {
            // InternalTextualScenario.g:2585:1: ( ( rule__StateFragment__KeywordAssignment_2 ) )
            // InternalTextualScenario.g:2586:2: ( rule__StateFragment__KeywordAssignment_2 )
            {
             before(grammarAccess.getStateFragmentAccess().getKeywordAssignment_2()); 
            // InternalTextualScenario.g:2587:2: ( rule__StateFragment__KeywordAssignment_2 )
            // InternalTextualScenario.g:2587:3: rule__StateFragment__KeywordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__KeywordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getKeywordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__2__Impl"


    // $ANTLR start "rule__StateFragment__Group__3"
    // InternalTextualScenario.g:2595:1: rule__StateFragment__Group__3 : rule__StateFragment__Group__3__Impl ;
    public final void rule__StateFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2599:1: ( rule__StateFragment__Group__3__Impl )
            // InternalTextualScenario.g:2600:2: rule__StateFragment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__3"


    // $ANTLR start "rule__StateFragment__Group__3__Impl"
    // InternalTextualScenario.g:2606:1: rule__StateFragment__Group__3__Impl : ( ( rule__StateFragment__NameAssignment_3 ) ) ;
    public final void rule__StateFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2610:1: ( ( ( rule__StateFragment__NameAssignment_3 ) ) )
            // InternalTextualScenario.g:2611:1: ( ( rule__StateFragment__NameAssignment_3 ) )
            {
            // InternalTextualScenario.g:2611:1: ( ( rule__StateFragment__NameAssignment_3 ) )
            // InternalTextualScenario.g:2612:2: ( rule__StateFragment__NameAssignment_3 )
            {
             before(grammarAccess.getStateFragmentAccess().getNameAssignment_3()); 
            // InternalTextualScenario.g:2613:2: ( rule__StateFragment__NameAssignment_3 )
            // InternalTextualScenario.g:2613:3: rule__StateFragment__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__Group__3__Impl"


    // $ANTLR start "rule__Model__BeginAssignment_1"
    // InternalTextualScenario.g:2622:1: rule__Model__BeginAssignment_1 : ( ( '{' ) ) ;
    public final void rule__Model__BeginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2626:1: ( ( ( '{' ) ) )
            // InternalTextualScenario.g:2627:2: ( ( '{' ) )
            {
            // InternalTextualScenario.g:2627:2: ( ( '{' ) )
            // InternalTextualScenario.g:2628:3: ( '{' )
            {
             before(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 
            // InternalTextualScenario.g:2629:3: ( '{' )
            // InternalTextualScenario.g:2630:4: '{'
            {
             before(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 

            }

             after(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BeginAssignment_1"


    // $ANTLR start "rule__Model__ParticipantsAssignment_2"
    // InternalTextualScenario.g:2641:1: rule__Model__ParticipantsAssignment_2 : ( ruleParticipant ) ;
    public final void rule__Model__ParticipantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2645:1: ( ( ruleParticipant ) )
            // InternalTextualScenario.g:2646:2: ( ruleParticipant )
            {
            // InternalTextualScenario.g:2646:2: ( ruleParticipant )
            // InternalTextualScenario.g:2647:3: ruleParticipant
            {
             before(grammarAccess.getModelAccess().getParticipantsParticipantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getModelAccess().getParticipantsParticipantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParticipantsAssignment_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // InternalTextualScenario.g:2656:1: rule__Model__ElementsAssignment_3 : ( ( rule__Model__ElementsAlternatives_3_0 ) ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2660:1: ( ( ( rule__Model__ElementsAlternatives_3_0 ) ) )
            // InternalTextualScenario.g:2661:2: ( ( rule__Model__ElementsAlternatives_3_0 ) )
            {
            // InternalTextualScenario.g:2661:2: ( ( rule__Model__ElementsAlternatives_3_0 ) )
            // InternalTextualScenario.g:2662:3: ( rule__Model__ElementsAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAlternatives_3_0()); 
            // InternalTextualScenario.g:2663:3: ( rule__Model__ElementsAlternatives_3_0 )
            // InternalTextualScenario.g:2663:4: rule__Model__ElementsAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__Model__EndAssignment_4"
    // InternalTextualScenario.g:2671:1: rule__Model__EndAssignment_4 : ( ( '}' ) ) ;
    public final void rule__Model__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2675:1: ( ( ( '}' ) ) )
            // InternalTextualScenario.g:2676:2: ( ( '}' ) )
            {
            // InternalTextualScenario.g:2676:2: ( ( '}' ) )
            // InternalTextualScenario.g:2677:3: ( '}' )
            {
             before(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 
            // InternalTextualScenario.g:2678:3: ( '}' )
            // InternalTextualScenario.g:2679:4: '}'
            {
             before(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 

            }

             after(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EndAssignment_4"


    // $ANTLR start "rule__Actor__KeywordAssignment_0"
    // InternalTextualScenario.g:2690:1: rule__Actor__KeywordAssignment_0 : ( ( 'actor' ) ) ;
    public final void rule__Actor__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2694:1: ( ( ( 'actor' ) ) )
            // InternalTextualScenario.g:2695:2: ( ( 'actor' ) )
            {
            // InternalTextualScenario.g:2695:2: ( ( 'actor' ) )
            // InternalTextualScenario.g:2696:3: ( 'actor' )
            {
             before(grammarAccess.getActorAccess().getKeywordActorKeyword_0_0()); 
            // InternalTextualScenario.g:2697:3: ( 'actor' )
            // InternalTextualScenario.g:2698:4: 'actor'
            {
             before(grammarAccess.getActorAccess().getKeywordActorKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getKeywordActorKeyword_0_0()); 

            }

             after(grammarAccess.getActorAccess().getKeywordActorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__KeywordAssignment_0"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalTextualScenario.g:2709:1: rule__Actor__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2713:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2714:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2714:2: ( RULE_STRING )
            // InternalTextualScenario.g:2715:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Component__KeywordAssignment_0"
    // InternalTextualScenario.g:2724:1: rule__Component__KeywordAssignment_0 : ( ( 'component' ) ) ;
    public final void rule__Component__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2728:1: ( ( ( 'component' ) ) )
            // InternalTextualScenario.g:2729:2: ( ( 'component' ) )
            {
            // InternalTextualScenario.g:2729:2: ( ( 'component' ) )
            // InternalTextualScenario.g:2730:3: ( 'component' )
            {
             before(grammarAccess.getComponentAccess().getKeywordComponentKeyword_0_0()); 
            // InternalTextualScenario.g:2731:3: ( 'component' )
            // InternalTextualScenario.g:2732:4: 'component'
            {
             before(grammarAccess.getComponentAccess().getKeywordComponentKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getKeywordComponentKeyword_0_0()); 

            }

             after(grammarAccess.getComponentAccess().getKeywordComponentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__KeywordAssignment_0"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalTextualScenario.g:2743:1: rule__Component__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2747:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2748:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2748:2: ( RULE_STRING )
            // InternalTextualScenario.g:2749:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__NatureAssignment_2"
    // InternalTextualScenario.g:2758:1: rule__Component__NatureAssignment_2 : ( ( rule__Component__NatureAlternatives_2_0 ) ) ;
    public final void rule__Component__NatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2762:1: ( ( ( rule__Component__NatureAlternatives_2_0 ) ) )
            // InternalTextualScenario.g:2763:2: ( ( rule__Component__NatureAlternatives_2_0 ) )
            {
            // InternalTextualScenario.g:2763:2: ( ( rule__Component__NatureAlternatives_2_0 ) )
            // InternalTextualScenario.g:2764:3: ( rule__Component__NatureAlternatives_2_0 )
            {
             before(grammarAccess.getComponentAccess().getNatureAlternatives_2_0()); 
            // InternalTextualScenario.g:2765:3: ( rule__Component__NatureAlternatives_2_0 )
            // InternalTextualScenario.g:2765:4: rule__Component__NatureAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NatureAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNatureAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NatureAssignment_2"


    // $ANTLR start "rule__ConfigurationItem__KeywordAssignment_0"
    // InternalTextualScenario.g:2773:1: rule__ConfigurationItem__KeywordAssignment_0 : ( ( 'configuration_item' ) ) ;
    public final void rule__ConfigurationItem__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2777:1: ( ( ( 'configuration_item' ) ) )
            // InternalTextualScenario.g:2778:2: ( ( 'configuration_item' ) )
            {
            // InternalTextualScenario.g:2778:2: ( ( 'configuration_item' ) )
            // InternalTextualScenario.g:2779:3: ( 'configuration_item' )
            {
             before(grammarAccess.getConfigurationItemAccess().getKeywordConfiguration_itemKeyword_0_0()); 
            // InternalTextualScenario.g:2780:3: ( 'configuration_item' )
            // InternalTextualScenario.g:2781:4: 'configuration_item'
            {
             before(grammarAccess.getConfigurationItemAccess().getKeywordConfiguration_itemKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getKeywordConfiguration_itemKeyword_0_0()); 

            }

             after(grammarAccess.getConfigurationItemAccess().getKeywordConfiguration_itemKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__KeywordAssignment_0"


    // $ANTLR start "rule__ConfigurationItem__NameAssignment_1"
    // InternalTextualScenario.g:2792:1: rule__ConfigurationItem__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigurationItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2796:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2797:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2797:2: ( RULE_STRING )
            // InternalTextualScenario.g:2798:3: RULE_STRING
            {
             before(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__NameAssignment_1"


    // $ANTLR start "rule__Function__KeywordAssignment_0"
    // InternalTextualScenario.g:2807:1: rule__Function__KeywordAssignment_0 : ( ( 'function' ) ) ;
    public final void rule__Function__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2811:1: ( ( ( 'function' ) ) )
            // InternalTextualScenario.g:2812:2: ( ( 'function' ) )
            {
            // InternalTextualScenario.g:2812:2: ( ( 'function' ) )
            // InternalTextualScenario.g:2813:3: ( 'function' )
            {
             before(grammarAccess.getFunctionAccess().getKeywordFunctionKeyword_0_0()); 
            // InternalTextualScenario.g:2814:3: ( 'function' )
            // InternalTextualScenario.g:2815:4: 'function'
            {
             before(grammarAccess.getFunctionAccess().getKeywordFunctionKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getKeywordFunctionKeyword_0_0()); 

            }

             after(grammarAccess.getFunctionAccess().getKeywordFunctionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__KeywordAssignment_0"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalTextualScenario.g:2826:1: rule__Function__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2830:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2831:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2831:2: ( RULE_STRING )
            // InternalTextualScenario.g:2832:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Activity__KeywordAssignment_0"
    // InternalTextualScenario.g:2841:1: rule__Activity__KeywordAssignment_0 : ( ( 'activity' ) ) ;
    public final void rule__Activity__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2845:1: ( ( ( 'activity' ) ) )
            // InternalTextualScenario.g:2846:2: ( ( 'activity' ) )
            {
            // InternalTextualScenario.g:2846:2: ( ( 'activity' ) )
            // InternalTextualScenario.g:2847:3: ( 'activity' )
            {
             before(grammarAccess.getActivityAccess().getKeywordActivityKeyword_0_0()); 
            // InternalTextualScenario.g:2848:3: ( 'activity' )
            // InternalTextualScenario.g:2849:4: 'activity'
            {
             before(grammarAccess.getActivityAccess().getKeywordActivityKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getKeywordActivityKeyword_0_0()); 

            }

             after(grammarAccess.getActivityAccess().getKeywordActivityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__KeywordAssignment_0"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // InternalTextualScenario.g:2860:1: rule__Activity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2864:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2865:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2865:2: ( RULE_STRING )
            // InternalTextualScenario.g:2866:3: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Entity__KeywordAssignment_0"
    // InternalTextualScenario.g:2875:1: rule__Entity__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__Entity__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2879:1: ( ( ( 'entity' ) ) )
            // InternalTextualScenario.g:2880:2: ( ( 'entity' ) )
            {
            // InternalTextualScenario.g:2880:2: ( ( 'entity' ) )
            // InternalTextualScenario.g:2881:3: ( 'entity' )
            {
             before(grammarAccess.getEntityAccess().getKeywordEntityKeyword_0_0()); 
            // InternalTextualScenario.g:2882:3: ( 'entity' )
            // InternalTextualScenario.g:2883:4: 'entity'
            {
             before(grammarAccess.getEntityAccess().getKeywordEntityKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getKeywordEntityKeyword_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getKeywordEntityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__KeywordAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalTextualScenario.g:2894:1: rule__Entity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2898:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2899:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2899:2: ( RULE_STRING )
            // InternalTextualScenario.g:2900:3: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Role__KeywordAssignment_0"
    // InternalTextualScenario.g:2909:1: rule__Role__KeywordAssignment_0 : ( ( 'role' ) ) ;
    public final void rule__Role__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2913:1: ( ( ( 'role' ) ) )
            // InternalTextualScenario.g:2914:2: ( ( 'role' ) )
            {
            // InternalTextualScenario.g:2914:2: ( ( 'role' ) )
            // InternalTextualScenario.g:2915:3: ( 'role' )
            {
             before(grammarAccess.getRoleAccess().getKeywordRoleKeyword_0_0()); 
            // InternalTextualScenario.g:2916:3: ( 'role' )
            // InternalTextualScenario.g:2917:4: 'role'
            {
             before(grammarAccess.getRoleAccess().getKeywordRoleKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getKeywordRoleKeyword_0_0()); 

            }

             after(grammarAccess.getRoleAccess().getKeywordRoleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__KeywordAssignment_0"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalTextualScenario.g:2928:1: rule__Role__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2932:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2933:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2933:2: ( RULE_STRING )
            // InternalTextualScenario.g:2934:3: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__SequenceMessage__SourceAssignment_0"
    // InternalTextualScenario.g:2943:1: rule__SequenceMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2947:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2948:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2948:2: ( RULE_STRING )
            // InternalTextualScenario.g:2949:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__SourceAssignment_0"


    // $ANTLR start "rule__SequenceMessage__TargetAssignment_2"
    // InternalTextualScenario.g:2958:1: rule__SequenceMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2962:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:2963:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:2963:2: ( RULE_STRING )
            // InternalTextualScenario.g:2964:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__TargetAssignment_2"


    // $ANTLR start "rule__SequenceMessage__ExecutionAssignment_3"
    // InternalTextualScenario.g:2973:1: rule__SequenceMessage__ExecutionAssignment_3 : ( ( 'withExecution' ) ) ;
    public final void rule__SequenceMessage__ExecutionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2977:1: ( ( ( 'withExecution' ) ) )
            // InternalTextualScenario.g:2978:2: ( ( 'withExecution' ) )
            {
            // InternalTextualScenario.g:2978:2: ( ( 'withExecution' ) )
            // InternalTextualScenario.g:2979:3: ( 'withExecution' )
            {
             before(grammarAccess.getSequenceMessageAccess().getExecutionWithExecutionKeyword_3_0()); 
            // InternalTextualScenario.g:2980:3: ( 'withExecution' )
            // InternalTextualScenario.g:2981:4: 'withExecution'
            {
             before(grammarAccess.getSequenceMessageAccess().getExecutionWithExecutionKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getExecutionWithExecutionKeyword_3_0()); 

            }

             after(grammarAccess.getSequenceMessageAccess().getExecutionWithExecutionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__ExecutionAssignment_3"


    // $ANTLR start "rule__SequenceMessage__ReturnAssignment_4"
    // InternalTextualScenario.g:2992:1: rule__SequenceMessage__ReturnAssignment_4 : ( ( 'withReturn' ) ) ;
    public final void rule__SequenceMessage__ReturnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:2996:1: ( ( ( 'withReturn' ) ) )
            // InternalTextualScenario.g:2997:2: ( ( 'withReturn' ) )
            {
            // InternalTextualScenario.g:2997:2: ( ( 'withReturn' ) )
            // InternalTextualScenario.g:2998:3: ( 'withReturn' )
            {
             before(grammarAccess.getSequenceMessageAccess().getReturnWithReturnKeyword_4_0()); 
            // InternalTextualScenario.g:2999:3: ( 'withReturn' )
            // InternalTextualScenario.g:3000:4: 'withReturn'
            {
             before(grammarAccess.getSequenceMessageAccess().getReturnWithReturnKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getReturnWithReturnKeyword_4_0()); 

            }

             after(grammarAccess.getSequenceMessageAccess().getReturnWithReturnKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__ReturnAssignment_4"


    // $ANTLR start "rule__SequenceMessage__NameAssignment_6"
    // InternalTextualScenario.g:3011:1: rule__SequenceMessage__NameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3015:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3016:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3016:2: ( RULE_STRING )
            // InternalTextualScenario.g:3017:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__NameAssignment_6"


    // $ANTLR start "rule__CreateMessage__SourceAssignment_0"
    // InternalTextualScenario.g:3026:1: rule__CreateMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3030:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3031:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3031:2: ( RULE_STRING )
            // InternalTextualScenario.g:3032:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__SourceAssignment_0"


    // $ANTLR start "rule__CreateMessage__TargetAssignment_2"
    // InternalTextualScenario.g:3041:1: rule__CreateMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3045:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3046:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3046:2: ( RULE_STRING )
            // InternalTextualScenario.g:3047:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__TargetAssignment_2"


    // $ANTLR start "rule__CreateMessage__NameAssignment_4"
    // InternalTextualScenario.g:3056:1: rule__CreateMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3060:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3061:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3061:2: ( RULE_STRING )
            // InternalTextualScenario.g:3062:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__NameAssignment_4"


    // $ANTLR start "rule__DeleteMessage__SourceAssignment_0"
    // InternalTextualScenario.g:3071:1: rule__DeleteMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3075:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3076:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3076:2: ( RULE_STRING )
            // InternalTextualScenario.g:3077:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__SourceAssignment_0"


    // $ANTLR start "rule__DeleteMessage__TargetAssignment_2"
    // InternalTextualScenario.g:3086:1: rule__DeleteMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3090:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3091:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3091:2: ( RULE_STRING )
            // InternalTextualScenario.g:3092:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__TargetAssignment_2"


    // $ANTLR start "rule__DeleteMessage__NameAssignment_4"
    // InternalTextualScenario.g:3101:1: rule__DeleteMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3105:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3106:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3106:2: ( RULE_STRING )
            // InternalTextualScenario.g:3107:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__NameAssignment_4"


    // $ANTLR start "rule__ArmTimerMessage__ParticipantAssignment_1"
    // InternalTextualScenario.g:3116:1: rule__ArmTimerMessage__ParticipantAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ArmTimerMessage__ParticipantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3120:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3121:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3121:2: ( RULE_STRING )
            // InternalTextualScenario.g:3122:3: RULE_STRING
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getParticipantSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__ParticipantAssignment_1"


    // $ANTLR start "rule__ArmTimerMessage__NameAssignment_3"
    // InternalTextualScenario.g:3131:1: rule__ArmTimerMessage__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ArmTimerMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3135:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3136:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3136:2: ( RULE_STRING )
            // InternalTextualScenario.g:3137:3: RULE_STRING
            {
             before(grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__NameAssignment_3"


    // $ANTLR start "rule__ParticipantDeactivation__KeywordAssignment_0"
    // InternalTextualScenario.g:3146:1: rule__ParticipantDeactivation__KeywordAssignment_0 : ( ( 'deactivate' ) ) ;
    public final void rule__ParticipantDeactivation__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3150:1: ( ( ( 'deactivate' ) ) )
            // InternalTextualScenario.g:3151:2: ( ( 'deactivate' ) )
            {
            // InternalTextualScenario.g:3151:2: ( ( 'deactivate' ) )
            // InternalTextualScenario.g:3152:3: ( 'deactivate' )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getKeywordDeactivateKeyword_0_0()); 
            // InternalTextualScenario.g:3153:3: ( 'deactivate' )
            // InternalTextualScenario.g:3154:4: 'deactivate'
            {
             before(grammarAccess.getParticipantDeactivationAccess().getKeywordDeactivateKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParticipantDeactivationAccess().getKeywordDeactivateKeyword_0_0()); 

            }

             after(grammarAccess.getParticipantDeactivationAccess().getKeywordDeactivateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__KeywordAssignment_0"


    // $ANTLR start "rule__ParticipantDeactivation__NameAssignment_1"
    // InternalTextualScenario.g:3165:1: rule__ParticipantDeactivation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ParticipantDeactivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3169:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3170:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3170:2: ( RULE_STRING )
            // InternalTextualScenario.g:3171:3: RULE_STRING
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParticipantDeactivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__NameAssignment_1"


    // $ANTLR start "rule__Reference__KeywordAssignment_0"
    // InternalTextualScenario.g:3180:1: rule__Reference__KeywordAssignment_0 : ( ( 'ref' ) ) ;
    public final void rule__Reference__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3184:1: ( ( ( 'ref' ) ) )
            // InternalTextualScenario.g:3185:2: ( ( 'ref' ) )
            {
            // InternalTextualScenario.g:3185:2: ( ( 'ref' ) )
            // InternalTextualScenario.g:3186:3: ( 'ref' )
            {
             before(grammarAccess.getReferenceAccess().getKeywordRefKeyword_0_0()); 
            // InternalTextualScenario.g:3187:3: ( 'ref' )
            // InternalTextualScenario.g:3188:4: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getKeywordRefKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getKeywordRefKeyword_0_0()); 

            }

             after(grammarAccess.getReferenceAccess().getKeywordRefKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__KeywordAssignment_0"


    // $ANTLR start "rule__Reference__OverAssignment_1"
    // InternalTextualScenario.g:3199:1: rule__Reference__OverAssignment_1 : ( ( 'over' ) ) ;
    public final void rule__Reference__OverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3203:1: ( ( ( 'over' ) ) )
            // InternalTextualScenario.g:3204:2: ( ( 'over' ) )
            {
            // InternalTextualScenario.g:3204:2: ( ( 'over' ) )
            // InternalTextualScenario.g:3205:3: ( 'over' )
            {
             before(grammarAccess.getReferenceAccess().getOverOverKeyword_1_0()); 
            // InternalTextualScenario.g:3206:3: ( 'over' )
            // InternalTextualScenario.g:3207:4: 'over'
            {
             before(grammarAccess.getReferenceAccess().getOverOverKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOverOverKeyword_1_0()); 

            }

             after(grammarAccess.getReferenceAccess().getOverOverKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OverAssignment_1"


    // $ANTLR start "rule__Reference__TimelinesAssignment_2"
    // InternalTextualScenario.g:3218:1: rule__Reference__TimelinesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Reference__TimelinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3222:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3223:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3223:2: ( RULE_STRING )
            // InternalTextualScenario.g:3224:3: RULE_STRING
            {
             before(grammarAccess.getReferenceAccess().getTimelinesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTimelinesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TimelinesAssignment_2"


    // $ANTLR start "rule__Reference__NameAssignment_3"
    // InternalTextualScenario.g:3233:1: rule__Reference__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Reference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3237:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3238:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3238:2: ( RULE_STRING )
            // InternalTextualScenario.g:3239:3: RULE_STRING
            {
             before(grammarAccess.getReferenceAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_3"


    // $ANTLR start "rule__Alt__KeywordAssignment_0"
    // InternalTextualScenario.g:3248:1: rule__Alt__KeywordAssignment_0 : ( ( 'alt' ) ) ;
    public final void rule__Alt__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3252:1: ( ( ( 'alt' ) ) )
            // InternalTextualScenario.g:3253:2: ( ( 'alt' ) )
            {
            // InternalTextualScenario.g:3253:2: ( ( 'alt' ) )
            // InternalTextualScenario.g:3254:3: ( 'alt' )
            {
             before(grammarAccess.getAltAccess().getKeywordAltKeyword_0_0()); 
            // InternalTextualScenario.g:3255:3: ( 'alt' )
            // InternalTextualScenario.g:3256:4: 'alt'
            {
             before(grammarAccess.getAltAccess().getKeywordAltKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getKeywordAltKeyword_0_0()); 

            }

             after(grammarAccess.getAltAccess().getKeywordAltKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__KeywordAssignment_0"


    // $ANTLR start "rule__Alt__ConditionAssignment_1"
    // InternalTextualScenario.g:3267:1: rule__Alt__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Alt__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3271:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3272:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3272:2: ( RULE_STRING )
            // InternalTextualScenario.g:3273:3: RULE_STRING
            {
             before(grammarAccess.getAltAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__ConditionAssignment_1"


    // $ANTLR start "rule__Alt__OverAssignment_2"
    // InternalTextualScenario.g:3282:1: rule__Alt__OverAssignment_2 : ( ( 'over' ) ) ;
    public final void rule__Alt__OverAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3286:1: ( ( ( 'over' ) ) )
            // InternalTextualScenario.g:3287:2: ( ( 'over' ) )
            {
            // InternalTextualScenario.g:3287:2: ( ( 'over' ) )
            // InternalTextualScenario.g:3288:3: ( 'over' )
            {
             before(grammarAccess.getAltAccess().getOverOverKeyword_2_0()); 
            // InternalTextualScenario.g:3289:3: ( 'over' )
            // InternalTextualScenario.g:3290:4: 'over'
            {
             before(grammarAccess.getAltAccess().getOverOverKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getOverOverKeyword_2_0()); 

            }

             after(grammarAccess.getAltAccess().getOverOverKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__OverAssignment_2"


    // $ANTLR start "rule__Alt__TimelinesAssignment_3"
    // InternalTextualScenario.g:3301:1: rule__Alt__TimelinesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Alt__TimelinesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3305:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3306:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3306:2: ( RULE_STRING )
            // InternalTextualScenario.g:3307:3: RULE_STRING
            {
             before(grammarAccess.getAltAccess().getTimelinesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getTimelinesSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__TimelinesAssignment_3"


    // $ANTLR start "rule__Alt__BlockAssignment_4"
    // InternalTextualScenario.g:3316:1: rule__Alt__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__Alt__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3320:1: ( ( ruleBlock ) )
            // InternalTextualScenario.g:3321:2: ( ruleBlock )
            {
            // InternalTextualScenario.g:3321:2: ( ruleBlock )
            // InternalTextualScenario.g:3322:3: ruleBlock
            {
             before(grammarAccess.getAltAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getAltAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__BlockAssignment_4"


    // $ANTLR start "rule__Alt__ElseBlocksAssignment_5"
    // InternalTextualScenario.g:3331:1: rule__Alt__ElseBlocksAssignment_5 : ( ruleElseBlock ) ;
    public final void rule__Alt__ElseBlocksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3335:1: ( ( ruleElseBlock ) )
            // InternalTextualScenario.g:3336:2: ( ruleElseBlock )
            {
            // InternalTextualScenario.g:3336:2: ( ruleElseBlock )
            // InternalTextualScenario.g:3337:3: ruleElseBlock
            {
             before(grammarAccess.getAltAccess().getElseBlocksElseBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElseBlock();

            state._fsp--;

             after(grammarAccess.getAltAccess().getElseBlocksElseBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alt__ElseBlocksAssignment_5"


    // $ANTLR start "rule__ElseBlock__ConditionAssignment_1"
    // InternalTextualScenario.g:3346:1: rule__ElseBlock__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ElseBlock__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3350:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3351:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3351:2: ( RULE_STRING )
            // InternalTextualScenario.g:3352:3: RULE_STRING
            {
             before(grammarAccess.getElseBlockAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElseBlockAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__ConditionAssignment_1"


    // $ANTLR start "rule__ElseBlock__BlockAssignment_2"
    // InternalTextualScenario.g:3361:1: rule__ElseBlock__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__ElseBlock__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3365:1: ( ( ruleBlock ) )
            // InternalTextualScenario.g:3366:2: ( ruleBlock )
            {
            // InternalTextualScenario.g:3366:2: ( ruleBlock )
            // InternalTextualScenario.g:3367:3: ruleBlock
            {
             before(grammarAccess.getElseBlockAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getElseBlockAccess().getBlockBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBlock__BlockAssignment_2"


    // $ANTLR start "rule__Block__BeginAssignment_0"
    // InternalTextualScenario.g:3376:1: rule__Block__BeginAssignment_0 : ( ( '{' ) ) ;
    public final void rule__Block__BeginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3380:1: ( ( ( '{' ) ) )
            // InternalTextualScenario.g:3381:2: ( ( '{' ) )
            {
            // InternalTextualScenario.g:3381:2: ( ( '{' ) )
            // InternalTextualScenario.g:3382:3: ( '{' )
            {
             before(grammarAccess.getBlockAccess().getBeginLeftCurlyBracketKeyword_0_0()); 
            // InternalTextualScenario.g:3383:3: ( '{' )
            // InternalTextualScenario.g:3384:4: '{'
            {
             before(grammarAccess.getBlockAccess().getBeginLeftCurlyBracketKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBeginLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getBlockAccess().getBeginLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__BeginAssignment_0"


    // $ANTLR start "rule__Block__BlockElementsAssignment_1"
    // InternalTextualScenario.g:3395:1: rule__Block__BlockElementsAssignment_1 : ( ( rule__Block__BlockElementsAlternatives_1_0 ) ) ;
    public final void rule__Block__BlockElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3399:1: ( ( ( rule__Block__BlockElementsAlternatives_1_0 ) ) )
            // InternalTextualScenario.g:3400:2: ( ( rule__Block__BlockElementsAlternatives_1_0 ) )
            {
            // InternalTextualScenario.g:3400:2: ( ( rule__Block__BlockElementsAlternatives_1_0 ) )
            // InternalTextualScenario.g:3401:3: ( rule__Block__BlockElementsAlternatives_1_0 )
            {
             before(grammarAccess.getBlockAccess().getBlockElementsAlternatives_1_0()); 
            // InternalTextualScenario.g:3402:3: ( rule__Block__BlockElementsAlternatives_1_0 )
            // InternalTextualScenario.g:3402:4: rule__Block__BlockElementsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Block__BlockElementsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getBlockElementsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__BlockElementsAssignment_1"


    // $ANTLR start "rule__Block__EndAssignment_2"
    // InternalTextualScenario.g:3410:1: rule__Block__EndAssignment_2 : ( ( '}' ) ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3414:1: ( ( ( '}' ) ) )
            // InternalTextualScenario.g:3415:2: ( ( '}' ) )
            {
            // InternalTextualScenario.g:3415:2: ( ( '}' ) )
            // InternalTextualScenario.g:3416:3: ( '}' )
            {
             before(grammarAccess.getBlockAccess().getEndRightCurlyBracketKeyword_2_0()); 
            // InternalTextualScenario.g:3417:3: ( '}' )
            // InternalTextualScenario.g:3418:4: '}'
            {
             before(grammarAccess.getBlockAccess().getEndRightCurlyBracketKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getEndRightCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getBlockAccess().getEndRightCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__EndAssignment_2"


    // $ANTLR start "rule__StateFragment__OnAssignment_0"
    // InternalTextualScenario.g:3429:1: rule__StateFragment__OnAssignment_0 : ( ( 'on' ) ) ;
    public final void rule__StateFragment__OnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3433:1: ( ( ( 'on' ) ) )
            // InternalTextualScenario.g:3434:2: ( ( 'on' ) )
            {
            // InternalTextualScenario.g:3434:2: ( ( 'on' ) )
            // InternalTextualScenario.g:3435:3: ( 'on' )
            {
             before(grammarAccess.getStateFragmentAccess().getOnOnKeyword_0_0()); 
            // InternalTextualScenario.g:3436:3: ( 'on' )
            // InternalTextualScenario.g:3437:4: 'on'
            {
             before(grammarAccess.getStateFragmentAccess().getOnOnKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStateFragmentAccess().getOnOnKeyword_0_0()); 

            }

             after(grammarAccess.getStateFragmentAccess().getOnOnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__OnAssignment_0"


    // $ANTLR start "rule__StateFragment__TimelineAssignment_1"
    // InternalTextualScenario.g:3448:1: rule__StateFragment__TimelineAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StateFragment__TimelineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3452:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3453:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3453:2: ( RULE_STRING )
            // InternalTextualScenario.g:3454:3: RULE_STRING
            {
             before(grammarAccess.getStateFragmentAccess().getTimelineSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStateFragmentAccess().getTimelineSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__TimelineAssignment_1"


    // $ANTLR start "rule__StateFragment__KeywordAssignment_2"
    // InternalTextualScenario.g:3463:1: rule__StateFragment__KeywordAssignment_2 : ( ( rule__StateFragment__KeywordAlternatives_2_0 ) ) ;
    public final void rule__StateFragment__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3467:1: ( ( ( rule__StateFragment__KeywordAlternatives_2_0 ) ) )
            // InternalTextualScenario.g:3468:2: ( ( rule__StateFragment__KeywordAlternatives_2_0 ) )
            {
            // InternalTextualScenario.g:3468:2: ( ( rule__StateFragment__KeywordAlternatives_2_0 ) )
            // InternalTextualScenario.g:3469:3: ( rule__StateFragment__KeywordAlternatives_2_0 )
            {
             before(grammarAccess.getStateFragmentAccess().getKeywordAlternatives_2_0()); 
            // InternalTextualScenario.g:3470:3: ( rule__StateFragment__KeywordAlternatives_2_0 )
            // InternalTextualScenario.g:3470:4: rule__StateFragment__KeywordAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StateFragment__KeywordAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStateFragmentAccess().getKeywordAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__KeywordAssignment_2"


    // $ANTLR start "rule__StateFragment__NameAssignment_3"
    // InternalTextualScenario.g:3478:1: rule__StateFragment__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StateFragment__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualScenario.g:3482:1: ( ( RULE_STRING ) )
            // InternalTextualScenario.g:3483:2: ( RULE_STRING )
            {
            // InternalTextualScenario.g:3483:2: ( RULE_STRING )
            // InternalTextualScenario.g:3484:3: RULE_STRING
            {
             before(grammarAccess.getStateFragmentAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStateFragmentAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFragment__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000006CFE410010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000FC010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000006C00400012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006C02400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000001C000L});

}
