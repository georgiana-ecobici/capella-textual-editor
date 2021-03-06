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
/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.capella.scenario.editor.dsl.services.TextualScenarioGrammarAccess;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Activity;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Actor;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.ArmTimerMessage;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Block;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.CombinedFragment;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Component;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.ConfigurationItem;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.CreateMessage;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.DeleteMessage;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Entity;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Function;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Model;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Operand;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.ParticipantDeactivation;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Reference;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Role;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.StateFragment;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage;

@SuppressWarnings("all")
public class TextualScenarioSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextualScenarioGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TextualScenarioPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualScenarioPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case TextualScenarioPackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case TextualScenarioPackage.ARM_TIMER_MESSAGE:
				sequence_ArmTimerMessage(context, (ArmTimerMessage) semanticObject); 
				return; 
			case TextualScenarioPackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case TextualScenarioPackage.COMBINED_FRAGMENT:
				sequence_CombinedFragment(context, (CombinedFragment) semanticObject); 
				return; 
			case TextualScenarioPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case TextualScenarioPackage.CONFIGURATION_ITEM:
				sequence_ConfigurationItem(context, (ConfigurationItem) semanticObject); 
				return; 
			case TextualScenarioPackage.CREATE_MESSAGE:
				sequence_CreateMessage(context, (CreateMessage) semanticObject); 
				return; 
			case TextualScenarioPackage.DELETE_MESSAGE:
				sequence_DeleteMessage(context, (DeleteMessage) semanticObject); 
				return; 
			case TextualScenarioPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case TextualScenarioPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case TextualScenarioPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TextualScenarioPackage.OPERAND:
				sequence_Operand(context, (Operand) semanticObject); 
				return; 
			case TextualScenarioPackage.PARTICIPANT_DEACTIVATION:
				sequence_ParticipantDeactivation(context, (ParticipantDeactivation) semanticObject); 
				return; 
			case TextualScenarioPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case TextualScenarioPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case TextualScenarioPackage.SEQUENCE_MESSAGE:
				sequence_SequenceMessage(context, (SequenceMessage) semanticObject); 
				return; 
			case TextualScenarioPackage.STATE_FRAGMENT:
				sequence_StateFragment(context, (StateFragment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Participant returns Activity
	 *     GenericFunction returns Activity
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (keyword='activity' name=STRING)
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActivityAccess().getKeywordActivityKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Actor
	 *     GenericComponent returns Actor
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     (keyword='actor' name=STRING)
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActorAccess().getKeywordActorKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns ArmTimerMessage
	 *     ArmTimerMessage returns ArmTimerMessage
	 *
	 * Constraint:
	 *     (arrow='->>' participant=STRING execution='withExecution'? doubleDot=':' name=STRING)
	 */
	protected void sequence_ArmTimerMessage(ISerializationContext context, ArmTimerMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Block returns Block
	 *
	 * Constraint:
	 *     (begin='{' (blockElements+=Message | blockElements+=Reference | blockElements+=CombinedFragment | blockElements+=StateFragment)* end='}')
	 */
	protected void sequence_Block(ISerializationContext context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CombinedFragment returns CombinedFragment
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             keyword='alt' | 
	 *             keyword='loop' | 
	 *             keyword='par' | 
	 *             keyword='assert' | 
	 *             keyword='critical' | 
	 *             keyword='ignore' | 
	 *             keyword='neg' | 
	 *             keyword='opt' | 
	 *             keyword='seq' | 
	 *             keyword='strict' | 
	 *             keyword='unset'
	 *         ) 
	 *         expression=STRING 
	 *         over='over' 
	 *         timelines+=STRING+ 
	 *         block=Block 
	 *         operands+=Operand*
	 *     )
	 */
	protected void sequence_CombinedFragment(ISerializationContext context, CombinedFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Component
	 *     GenericComponent returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (keyword='component' name=STRING (nature='unset' | nature='behavior' | nature='node')?)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns ConfigurationItem
	 *     GenericComponent returns ConfigurationItem
	 *     ConfigurationItem returns ConfigurationItem
	 *
	 * Constraint:
	 *     (keyword='configuration_item' name=STRING)
	 */
	protected void sequence_ConfigurationItem(ISerializationContext context, ConfigurationItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationItemAccess().getKeywordConfiguration_itemKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns CreateMessage
	 *     SequenceMessageType returns CreateMessage
	 *     CreateMessage returns CreateMessage
	 *
	 * Constraint:
	 *     (source=STRING arrow='->+' target=STRING doubleDot=':' name=STRING)
	 */
	protected void sequence_CreateMessage(ISerializationContext context, CreateMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__ARROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__ARROW));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCreateMessageAccess().getSourceSTRINGTerminalRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getCreateMessageAccess().getArrowHyphenMinusGreaterThanSignPlusSignKeyword_1_0(), semanticObject.getArrow());
		feeder.accept(grammarAccess.getCreateMessageAccess().getTargetSTRINGTerminalRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getCreateMessageAccess().getDoubleDotColonKeyword_3_0(), semanticObject.getDoubleDot());
		feeder.accept(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns DeleteMessage
	 *     SequenceMessageType returns DeleteMessage
	 *     DeleteMessage returns DeleteMessage
	 *
	 * Constraint:
	 *     (source=STRING arrow='->x' target=STRING doubleDot=':' name=STRING)
	 */
	protected void sequence_DeleteMessage(ISerializationContext context, DeleteMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__ARROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__ARROW));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteMessageAccess().getSourceSTRINGTerminalRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getArrowXKeyword_1_0(), semanticObject.getArrow());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getTargetSTRINGTerminalRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getDoubleDotColonKeyword_3_0(), semanticObject.getDoubleDot());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Entity
	 *     GenericComponent returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (keyword='entity' name=STRING)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityAccess().getKeywordEntityKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Function
	 *     GenericFunction returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (keyword='function' name=STRING)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getKeywordFunctionKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (begin='{' participants+=Participant* (elements+=Message | elements+=Reference | elements+=CombinedFragment | elements+=StateFragment)* end='}')
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns Operand
	 *
	 * Constraint:
	 *     (keyword='else'? expression=STRING block=Block)
	 */
	protected void sequence_Operand(ISerializationContext context, Operand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns ParticipantDeactivation
	 *     ParticipantDeactivation returns ParticipantDeactivation
	 *
	 * Constraint:
	 *     (keyword='deactivate' name=STRING)
	 */
	protected void sequence_ParticipantDeactivation(ISerializationContext context, ParticipantDeactivation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT_DEACTIVATION__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT_DEACTIVATION__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParticipantDeactivationAccess().getKeywordDeactivateKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getParticipantDeactivationAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (keyword='ref' over='over' timelines+=STRING+ name=STRING)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Role
	 *     GenericComponent returns Role
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (keyword='role' name=STRING)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__KEYWORD));
			if (transientValues.isValueTransient(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualScenarioPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getKeywordRoleKeyword_0_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns SequenceMessage
	 *     SequenceMessageType returns SequenceMessage
	 *     SequenceMessage returns SequenceMessage
	 *
	 * Constraint:
	 *     (
	 *         source=STRING 
	 *         arrow='->' 
	 *         target=STRING 
	 *         execution='withExecution'? 
	 *         return='withReturn'? 
	 *         doubleDot=':' 
	 *         name=STRING
	 *     )
	 */
	protected void sequence_SequenceMessage(ISerializationContext context, SequenceMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateFragment returns StateFragment
	 *
	 * Constraint:
	 *     (on='on' timeline=STRING (keyword='state' | keyword='mode' | keyword='function') name=STRING)
	 */
	protected void sequence_StateFragment(ISerializationContext context, StateFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
