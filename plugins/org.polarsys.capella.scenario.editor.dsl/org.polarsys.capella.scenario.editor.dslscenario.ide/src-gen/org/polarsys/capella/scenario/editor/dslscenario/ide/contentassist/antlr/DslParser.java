/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.polarsys.capella.scenario.editor.dslscenario.ide.contentassist.antlr.internal.InternalDslParser;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getMessagesOrReferencesAlternatives_3_0(), "rule__Model__MessagesOrReferencesAlternatives_3_0");
			builder.put(grammarAccess.getParticipantAccess().getAlternatives(), "rule__Participant__Alternatives");
			builder.put(grammarAccess.getGenericComponentAccess().getAlternatives(), "rule__GenericComponent__Alternatives");
			builder.put(grammarAccess.getGenericFunctionAccess().getAlternatives(), "rule__GenericFunction__Alternatives");
			builder.put(grammarAccess.getComponentAccess().getNatureAlternatives_2_0(), "rule__Component__NatureAlternatives_2_0");
			builder.put(grammarAccess.getMessageAccess().getAlternatives(), "rule__Message__Alternatives");
			builder.put(grammarAccess.getSequenceMessageTypeAccess().getAlternatives_0(), "rule__SequenceMessageType__Alternatives_0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getConfigurationItemAccess().getGroup(), "rule__ConfigurationItem__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getSequenceMessageTypeAccess().getGroup(), "rule__SequenceMessageType__Group__0");
			builder.put(grammarAccess.getSequenceMessageAccess().getGroup(), "rule__SequenceMessage__Group__0");
			builder.put(grammarAccess.getCreateMessageAccess().getGroup(), "rule__CreateMessage__Group__0");
			builder.put(grammarAccess.getDeleteMessageAccess().getGroup(), "rule__DeleteMessage__Group__0");
			builder.put(grammarAccess.getReturnMessageAccess().getGroup(), "rule__ReturnMessage__Group__0");
			builder.put(grammarAccess.getArmTimerMessageAccess().getGroup(), "rule__ArmTimerMessage__Group__0");
			builder.put(grammarAccess.getParticipantDeactivationAccess().getGroup(), "rule__ParticipantDeactivation__Group__0");
			builder.put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
			builder.put(grammarAccess.getModelAccess().getBeginAssignment_1(), "rule__Model__BeginAssignment_1");
			builder.put(grammarAccess.getModelAccess().getParticipantsAssignment_2(), "rule__Model__ParticipantsAssignment_2");
			builder.put(grammarAccess.getModelAccess().getMessagesOrReferencesAssignment_3(), "rule__Model__MessagesOrReferencesAssignment_3");
			builder.put(grammarAccess.getModelAccess().getEndAssignment_4(), "rule__Model__EndAssignment_4");
			builder.put(grammarAccess.getParticipantUncalledAccess().getIdAssignment(), "rule__ParticipantUncalled__IdAssignment");
			builder.put(grammarAccess.getActorAccess().getKeywordAssignment_0(), "rule__Actor__KeywordAssignment_0");
			builder.put(grammarAccess.getActorAccess().getNameAssignment_1(), "rule__Actor__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getKeywordAssignment_0(), "rule__Component__KeywordAssignment_0");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getNatureAssignment_2(), "rule__Component__NatureAssignment_2");
			builder.put(grammarAccess.getConfigurationItemAccess().getKeywordAssignment_0(), "rule__ConfigurationItem__KeywordAssignment_0");
			builder.put(grammarAccess.getConfigurationItemAccess().getNameAssignment_1(), "rule__ConfigurationItem__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getKeywordAssignment_0(), "rule__Function__KeywordAssignment_0");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getActivityAccess().getKeywordAssignment_0(), "rule__Activity__KeywordAssignment_0");
			builder.put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getKeywordAssignment_0(), "rule__Entity__KeywordAssignment_0");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getRoleAccess().getKeywordAssignment_0(), "rule__Role__KeywordAssignment_0");
			builder.put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
			builder.put(grammarAccess.getMessageUncalledAccess().getIdAssignment(), "rule__MessageUncalled__IdAssignment");
			builder.put(grammarAccess.getSequenceMessageTypeAccess().getReturnAssignment_1(), "rule__SequenceMessageType__ReturnAssignment_1");
			builder.put(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0(), "rule__SequenceMessage__SourceAssignment_0");
			builder.put(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2(), "rule__SequenceMessage__TargetAssignment_2");
			builder.put(grammarAccess.getSequenceMessageAccess().getExecutionAssignment_3(), "rule__SequenceMessage__ExecutionAssignment_3");
			builder.put(grammarAccess.getSequenceMessageAccess().getNameAssignment_5(), "rule__SequenceMessage__NameAssignment_5");
			builder.put(grammarAccess.getCreateMessageAccess().getSourceAssignment_0(), "rule__CreateMessage__SourceAssignment_0");
			builder.put(grammarAccess.getCreateMessageAccess().getTargetAssignment_2(), "rule__CreateMessage__TargetAssignment_2");
			builder.put(grammarAccess.getCreateMessageAccess().getNameAssignment_4(), "rule__CreateMessage__NameAssignment_4");
			builder.put(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0(), "rule__DeleteMessage__SourceAssignment_0");
			builder.put(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2(), "rule__DeleteMessage__TargetAssignment_2");
			builder.put(grammarAccess.getDeleteMessageAccess().getNameAssignment_4(), "rule__DeleteMessage__NameAssignment_4");
			builder.put(grammarAccess.getReturnMessageAccess().getTargetAssignment_0(), "rule__ReturnMessage__TargetAssignment_0");
			builder.put(grammarAccess.getReturnMessageAccess().getSourceAssignment_2(), "rule__ReturnMessage__SourceAssignment_2");
			builder.put(grammarAccess.getReturnMessageAccess().getNameAssignment_4(), "rule__ReturnMessage__NameAssignment_4");
			builder.put(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1(), "rule__ArmTimerMessage__ParticipantAssignment_1");
			builder.put(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3(), "rule__ArmTimerMessage__NameAssignment_3");
			builder.put(grammarAccess.getParticipantDeactivationAccess().getKeywordAssignment_0(), "rule__ParticipantDeactivation__KeywordAssignment_0");
			builder.put(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1(), "rule__ParticipantDeactivation__NameAssignment_1");
			builder.put(grammarAccess.getReferenceAccess().getKeywordAssignment_0(), "rule__Reference__KeywordAssignment_0");
			builder.put(grammarAccess.getReferenceAccess().getTimelinesAssignment_2(), "rule__Reference__TimelinesAssignment_2");
			builder.put(grammarAccess.getReferenceAccess().getNameAssignment_3(), "rule__Reference__NameAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
