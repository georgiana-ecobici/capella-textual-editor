/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.textualScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessageType()
 * @model
 * @generated
 */
public interface SequenceMessageType extends Message
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessageType_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage#getSequenceMessageType_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // SequenceMessageType
