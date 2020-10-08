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
package org.polarsys.capella.scenario.editor.dsl.textualScenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.scenario.editor.dsl.textualScenario.ArmTimerMessage;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arm Timer Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.ArmTimerMessageImpl#getArrow <em>Arrow</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.ArmTimerMessageImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.ArmTimerMessageImpl#getDoubleDot <em>Double Dot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArmTimerMessageImpl extends MessageImpl implements ArmTimerMessage
{
  /**
   * The default value of the '{@link #getArrow() <em>Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrow()
   * @generated
   * @ordered
   */
  protected static final String ARROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArrow() <em>Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrow()
   * @generated
   * @ordered
   */
  protected String arrow = ARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getParticipant() <em>Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipant()
   * @generated
   * @ordered
   */
  protected static final String PARTICIPANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParticipant() <em>Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipant()
   * @generated
   * @ordered
   */
  protected String participant = PARTICIPANT_EDEFAULT;

  /**
   * The default value of the '{@link #getDoubleDot() <em>Double Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleDot()
   * @generated
   * @ordered
   */
  protected static final String DOUBLE_DOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoubleDot() <em>Double Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleDot()
   * @generated
   * @ordered
   */
  protected String doubleDot = DOUBLE_DOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArmTimerMessageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextualScenarioPackage.Literals.ARM_TIMER_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArrow()
  {
    return arrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArrow(String newArrow)
  {
    String oldArrow = arrow;
    arrow = newArrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.ARM_TIMER_MESSAGE__ARROW, oldArrow, arrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getParticipant()
  {
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParticipant(String newParticipant)
  {
    String oldParticipant = participant;
    participant = newParticipant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.ARM_TIMER_MESSAGE__PARTICIPANT, oldParticipant, participant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDoubleDot()
  {
    return doubleDot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDoubleDot(String newDoubleDot)
  {
    String oldDoubleDot = doubleDot;
    doubleDot = newDoubleDot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.ARM_TIMER_MESSAGE__DOUBLE_DOT, oldDoubleDot, doubleDot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__ARROW:
        return getArrow();
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__PARTICIPANT:
        return getParticipant();
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__DOUBLE_DOT:
        return getDoubleDot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__ARROW:
        setArrow((String)newValue);
        return;
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__PARTICIPANT:
        setParticipant((String)newValue);
        return;
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__DOUBLE_DOT:
        setDoubleDot((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__ARROW:
        setArrow(ARROW_EDEFAULT);
        return;
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__PARTICIPANT:
        setParticipant(PARTICIPANT_EDEFAULT);
        return;
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__DOUBLE_DOT:
        setDoubleDot(DOUBLE_DOT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__ARROW:
        return ARROW_EDEFAULT == null ? arrow != null : !ARROW_EDEFAULT.equals(arrow);
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__PARTICIPANT:
        return PARTICIPANT_EDEFAULT == null ? participant != null : !PARTICIPANT_EDEFAULT.equals(participant);
      case TextualScenarioPackage.ARM_TIMER_MESSAGE__DOUBLE_DOT:
        return DOUBLE_DOT_EDEFAULT == null ? doubleDot != null : !DOUBLE_DOT_EDEFAULT.equals(doubleDot);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (arrow: ");
    result.append(arrow);
    result.append(", participant: ");
    result.append(participant);
    result.append(", doubleDot: ");
    result.append(doubleDot);
    result.append(')');
    return result.toString();
  }

} //ArmTimerMessageImpl
