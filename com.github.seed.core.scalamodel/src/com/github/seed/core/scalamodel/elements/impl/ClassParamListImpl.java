/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.ClassParam;
import com.github.seed.core.scalamodel.elements.ClassParamList;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Param List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl#isImplicit <em>Implicit</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl#getClassParams <em>Class Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassParamListImpl extends ScalaElementImpl implements ClassParamList {
	/**
	 * The default value of the '{@link #isImplicit() <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLICIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplicit() <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean implicit = IMPLICIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassParams() <em>Class Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassParam> classParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassParamListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.CLASS_PARAM_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplicit() {
		return implicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicit(boolean newImplicit) {
		boolean oldImplicit = implicit;
		implicit = newImplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.CLASS_PARAM_LIST__IMPLICIT, oldImplicit, implicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassParam> getClassParams() {
		if (classParams == null) {
			classParams = new EObjectResolvingEList<ClassParam>(ClassParam.class, this, ScalaModelPackage.CLASS_PARAM_LIST__CLASS_PARAMS);
		}
		return classParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.CLASS_PARAM_LIST__IMPLICIT:
				return isImplicit();
			case ScalaModelPackage.CLASS_PARAM_LIST__CLASS_PARAMS:
				return getClassParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalaModelPackage.CLASS_PARAM_LIST__IMPLICIT:
				setImplicit((Boolean)newValue);
				return;
			case ScalaModelPackage.CLASS_PARAM_LIST__CLASS_PARAMS:
				getClassParams().clear();
				getClassParams().addAll((Collection<? extends ClassParam>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalaModelPackage.CLASS_PARAM_LIST__IMPLICIT:
				setImplicit(IMPLICIT_EDEFAULT);
				return;
			case ScalaModelPackage.CLASS_PARAM_LIST__CLASS_PARAMS:
				getClassParams().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalaModelPackage.CLASS_PARAM_LIST__IMPLICIT:
				return implicit != IMPLICIT_EDEFAULT;
			case ScalaModelPackage.CLASS_PARAM_LIST__CLASS_PARAMS:
				return classParams != null && !classParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (implicit: ");
		result.append(implicit);
		result.append(')');
		return result.toString();
	}

} //ClassParamListImpl
