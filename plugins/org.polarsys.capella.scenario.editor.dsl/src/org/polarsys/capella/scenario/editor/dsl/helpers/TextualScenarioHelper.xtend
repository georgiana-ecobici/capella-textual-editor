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
package org.polarsys.capella.scenario.editor.dsl.helpers

import org.eclipse.emf.ecore.EObject
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper
import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage
import org.polarsys.capella.core.model.helpers.CapellaElementExt
import org.eclipse.emf.common.util.EList
import org.polarsys.capella.core.data.fa.ComponentExchange
import org.polarsys.capella.core.data.fa.FunctionalExchange
import org.polarsys.capella.scenario.editor.dsl.textualScenario.CombinedFragment
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Model
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Operand
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Block

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TextualScenarioHelper {
	static val TYPE_FE = "FE";
	static val TYPE_CE = "CE";
	/*
	 * calculate the type of exchanges allowed to be declared in the text
	 */
	def static getScenarioAllowedExchangesType(EList<EObject> elements) {
		if (EmbeddedEditorInstanceHelper.isESScenario()) {
			if(EmbeddedEditorInstanceHelper.isCEScenario())
				return TYPE_CE
			if(EmbeddedEditorInstanceHelper.isFEScenario())
				return TYPE_FE
			for (element : elements) {
				if (element instanceof SequenceMessage) {
					var message = element as SequenceMessage
					return getMessageExchangeType(message)
				}
				if (element instanceof CombinedFragment) {
					var combinedFragment = element as CombinedFragment
					return getScenarioAllowedExchangesType(combinedFragment.block.blockElements)
				}
			}
		}
		return null
	}
	
	def static getMessageExchangeType(SequenceMessage message) {
		var exchangesAvailable = EmbeddedEditorInstanceHelper.getExchangeMessages(message.getSource, message.getTarget)
		for(exchange : exchangesAvailable) {
			if(message.name != null && message.name.equals(CapellaElementExt.getName(exchange))) {
				return getExchangeType(exchange)
			}
		}
		return null
	}
	
	def static getExchangeType(EObject exchangeElement) {
		if (exchangeElement instanceof ComponentExchange)
			return TYPE_CE
		else if (exchangeElement instanceof FunctionalExchange)
			return TYPE_FE
		return null
	}
	
	def static getModelContainer(EObject object) {
		if(object instanceof Model)
			return object as Model
		getModelContainer(object.eContainer)	
	}
	
	def static participantsDefinedBefore(EObject element) {
		if(element instanceof Model)
			return (element as Model).participants
		else {
			var model = getModelContainer(element) as Model
			return model.participants
		}	
	}
	
	def static participantsDefinedBeforeNames(EObject element) {
		var participants = participantsDefinedBefore(element)
		var participantsNames = newArrayList
		for(participant : participants) {
			participantsNames.add(participant.name)
		}	
		return participantsNames
	}
	
	def static isParticipantKeyword(String keywordValue) {
		var participantsKeywords = newArrayList("actor", "entity", "role", "activity", "component",
			"configuration_item", "function")
		return participantsKeywords.contains(keywordValue)
	}
	
	/*
	 * get all elements on the same level as modelContainer  
	 */
	def static getElements(EObject modelContainer) {
		
		if (modelContainer instanceof Model) {
			return (modelContainer as Model).elements
		}
		if (modelContainer instanceof CombinedFragment) {
			var elements = (modelContainer as CombinedFragment).block.blockElements
			elements.addAll((modelContainer as CombinedFragment).operands)
			return elements
		}
		if (modelContainer instanceof Operand) {
			return (modelContainer as Operand).block.blockElements
		}
		
		if (modelContainer instanceof Block) {
			return (modelContainer as Block).blockElements
		}
		
	}
}
