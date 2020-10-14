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
/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.textualScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessage()
 * @model
 * @generated
 */
public interface SequenceMessage extends SequenceMessageType
{
  /**
   * Returns the value of the '<em><b>Execution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution</em>' attribute.
   * @see #setExecution(String)
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessage_Execution()
   * @model
   * @generated
   */
  String getExecution();

  /**
   * Sets the value of the '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage#getExecution <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution</em>' attribute.
   * @see #getExecution()
   * @generated
   */
  void setExecution(String value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' attribute.
   * @see #setReturn(String)
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessage_Return()
   * @model
   * @generated
   */
  String getReturn();

  /**
   * Sets the value of the '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage#getReturn <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' attribute.
   * @see #getReturn()
   * @generated
   */
  void setReturn(String value);

} // SequenceMessage
