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
 *       Thales - initial API and implementation
 ******************************************************************************/
/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.textualScenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType;
import org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.SequenceMessageTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.SequenceMessageTypeImpl#getArrow <em>Arrow</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.SequenceMessageTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.impl.SequenceMessageTypeImpl#getDoubleDot <em>Double Dot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceMessageTypeImpl extends MessageImpl implements SequenceMessageType
{
  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

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
  protected SequenceMessageTypeImpl()
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
    return TextualScenarioPackage.Literals.SEQUENCE_MESSAGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__SOURCE, oldSource, source));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__ARROW, oldArrow, arrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT, oldDoubleDot, doubleDot));
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
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__SOURCE:
        return getSource();
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__ARROW:
        return getArrow();
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__TARGET:
        return getTarget();
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT:
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
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__SOURCE:
        setSource((String)newValue);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__ARROW:
        setArrow((String)newValue);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__TARGET:
        setTarget((String)newValue);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT:
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
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__ARROW:
        setArrow(ARROW_EDEFAULT);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT:
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
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__ARROW:
        return ARROW_EDEFAULT == null ? arrow != null : !ARROW_EDEFAULT.equals(arrow);
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case TextualScenarioPackage.SEQUENCE_MESSAGE_TYPE__DOUBLE_DOT:
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
    result.append(" (source: ");
    result.append(source);
    result.append(", arrow: ");
    result.append(arrow);
    result.append(", target: ");
    result.append(target);
    result.append(", doubleDot: ");
    result.append(doubleDot);
    result.append(')');
    return result.toString();
  }

} //SequenceMessageTypeImpl
