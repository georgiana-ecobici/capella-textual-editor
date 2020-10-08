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
		for(element : elements) {
			if(element instanceof SequenceMessage) {
				var message = element as SequenceMessage
				return getMessageExchangeType(message)
			}
			if(element instanceof CombinedFragment) {
				var combinedFragment = element as CombinedFragment
				return getScenarioAllowedExchangesType(combinedFragment.block.blockElements)
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
}
