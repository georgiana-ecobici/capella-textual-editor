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
 *******************************************************************************/
/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.ui.contentassist
import org.polarsys.capella.scenario.editor.dsl.helpers.TextualScenarioHelper

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Assignment
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Model
import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Participant
import org.polarsys.capella.core.model.helpers.CapellaElementExt
import org.polarsys.capella.scenario.editor.helper.DslConstants
import org.polarsys.capella.scenario.editor.dsl.textualScenario.StateFragment
import org.polarsys.capella.core.data.epbs.EPBSArchitecture

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TextualScenarioProposalProvider extends AbstractTextualScenarioProposalProvider {
	/*
	 * filter the proposed keywords based on the context in which we edit the text scenario;
	 * check the context of the Capella Diagram - layer (OA, SA, LA, PA), type of scenario (IS, ES FS)
	 */
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		if (EmbeddedEditorInstanceHelper.checkValidKeyword(keyword.getValue())) {
			super.completeKeyword(keyword, contentAssistContext, acceptor)
		}
	}

	override completeActor_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("actor", context, acceptor)
	}

	override completeComponent_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("component", context, acceptor)
	}

	override completeConfigurationItem_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("configuration_item", context, acceptor)
	}

	override completeFunction_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("function", context, acceptor)
	}

	override completeActivity_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("activity", context, acceptor)
	}

	override completeEntity_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("entity", context, acceptor)
	}

	override completeRole_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		getExistingParticipants("role", context, acceptor)
	}

	/*
	 * propose a list with the participants (parts that can be created
	 * if we have duplicated names in the list we can chose based on the id
	 */
	def getExistingParticipants(
		String keyword,
		ContentAssistContext context,
		ICompletionProposalAcceptor acceptor
	) {
		for (el : EmbeddedEditorInstanceHelper.getAvailableElements(keyword)) {
			var elementName = CapellaElementExt.getName(el)

			// if the name is already inserted in the text, do not propose it
			if (!participantAlreadyInserted(context.rootModel as Model, elementName, keyword)) {
				// create the proposal
				var proposal = createCompletionProposal("\"" + elementName + "\"", elementName, null,
					context) as ConfigurableCompletionProposal
				acceptor.accept(proposal);
			}
		}
	}

	/*
	 * propose a list with the timelines (for adding states, modes or allocated functions)
	 */
	def getExistingTimelines(String keyword, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (el : EmbeddedEditorInstanceHelper.getAvailableElements(keyword)) {
			var elementName = CapellaElementExt.getName(el)

			var proposal = createCompletionProposal("\"" + elementName + "\"", elementName, null,
				context) as ConfigurableCompletionProposal
			acceptor.accept(proposal);
		}
	}

	/*
	 * check if a participant is already used in the text
	 */
	def participantAlreadyInserted(Model model, String name, String keyword) {
		for (participant : model.participants) {
			if (participant.keyword == keyword && participant.name == name)
				return true
		}
		return false
	}

	override completeSequenceMessage_Source(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (EObject el : variablesDefinedBefore2(model as Model)) {
			acceptor.accept(
				createCompletionProposal("\"" + (el as Participant).name + "\"", (el as Participant).name, null,
					context))
		}
	}

	override completeSequenceMessage_Target(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (EObject el : variablesDefinedBefore3(model as SequenceMessage)) {
			acceptor.accept(
				createCompletionProposal("\"" + (el as Participant).name + "\"", (el as Participant).name, null,
					context))
		}
	}

	override completeSequenceMessage_Name(EObject messageObj, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {

		// we obtain the type of exchanges allowed in this model
		// if we already have a CE (component exchange) we propose only CE
		// if we already have a FE (functional exchange) we propose only FE
		// if no message was yet declared in the xtext, we propose both (until a first message is declared)
		var scenarioExchangesType = TextualScenarioHelper.getScenarioAllowedExchangesType((context.rootModel as Model).elements)

		var message = messageObj as SequenceMessage
		var exchangesAvailable = EmbeddedEditorInstanceHelper.getExchangeMessages(message.getSource, message.getTarget)
		for (EObject element : exchangesAvailable) {
			(context.rootModel as Model).elements
			var elementName = CapellaElementExt.getName(element)
			// do not propose a message between source and target that is already inserted, to avoid duplicates of the same message
			if (!messageAlreadyInserted(context.rootModel as Model, message.source, message.target, elementName)) {
				// in a scenario, cannot combine FE and CE in same scenario (functional and component exchanges)
				// if the type of exchange is allowed, propose it
				var exchangeType = TextualScenarioHelper.getExchangeType(element)
				if (scenarioExchangesType == null || scenarioExchangesType.equals(exchangeType)) {
					acceptor.accept(
						createCompletionProposal("\"" + elementName + "\"", "\"" + elementName + "\"", null, context))
				}
			}
		}
	}

	override completeStateFragment_On(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal(DslConstants.ON, DslConstants.ON, null, context))
	}

	override completeStateFragment_Timeline(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		var keywords = #[DslConstants.ACTOR, DslConstants.ACTIVITY, DslConstants.FUNCTION, DslConstants.ROLE,
			DslConstants.ENTITY, DslConstants.ROLE, DslConstants.COMPONENT, DslConstants.CONFIGURATION_ITEM]
		for (String keyword : keywords) {
			if (EmbeddedEditorInstanceHelper.checkValidKeyword(keyword)) {
				getExistingTimelines(keyword, context, acceptor)
			}
		}
	}

	override completeStateFragment_Keyword(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		var keywords = newArrayList(DslConstants.STATE, DslConstants.MODE)
		var scenarioType = EmbeddedEditorInstanceHelper.getScenarioType();
		var scenarioLevel = EmbeddedEditorInstanceHelper.getScenarioLevel();
		if (! scenarioType.equals(DslConstants.FUNCTIONAL) && ! (scenarioLevel instanceof EPBSArchitecture)) {
			keywords.add(DslConstants.FUNCTION)
		}
		for (String keyword : keywords) {
			acceptor.accept(createCompletionProposal(keyword, keyword, null, context))
		}

	}

	override completeStateFragment_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (String stateFragment : EmbeddedEditorInstanceHelper.getAvailableStateFragments(
			(model as StateFragment).keyword, (model as StateFragment).timeline)) {
			acceptor.accept(
				createCompletionProposal("\"" + stateFragment + "\"", "\"" + stateFragment + "\"", null, context))
		}

	}

	/*
	 * check if a message is already used in the text
	 */
	def messageAlreadyInserted(Model model, String source, String target, String name) {
		for (element : model.elements) {
			if (element instanceof SequenceMessage) {
				var message = element as SequenceMessage
				if (message.name == name && message.source == source && message.target == target)
					return true
			}
		}
		return false
	}

	def variablesDefinedBefore(Participant sc) {
		return sc
	}

	def variablesDefinedBefore2(Model m) {
		return m.participants
	}

	def variablesDefinedBefore3(SequenceMessage seq) {
		return (seq.eContainer as Model).participants
	}
}
