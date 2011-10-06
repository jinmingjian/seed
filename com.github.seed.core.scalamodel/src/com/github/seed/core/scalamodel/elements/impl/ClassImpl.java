/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.ClassParamList;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ClassImpl#getClassParamLists <em>Class Param Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TemplateDefImpl implements com.github.seed.core.scalamodel.elements.Class {
	/**
	 * The cached value of the '{@link #getClassParamLists() <em>Class Param Lists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassParamLists()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassParamList> classParamLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassParamList> getClassParamLists() {
		if (classParamLists == null) {
			classParamLists = new EObjectResolvingEList<ClassParamList>(ClassParamList.class, this, ScalaModelPackage.CLASS__CLASS_PARAM_LISTS);
		}
		return classParamLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.CLASS__CLASS_PARAM_LISTS:
				return getClassParamLists();
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
			case ScalaModelPackage.CLASS__CLASS_PARAM_LISTS:
				getClassParamLists().clear();
				getClassParamLists().addAll((Collection<? extends ClassParamList>)newValue);
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
			case ScalaModelPackage.CLASS__CLASS_PARAM_LISTS:
				getClassParamLists().clear();
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
			case ScalaModelPackage.CLASS__CLASS_PARAM_LISTS:
				return classParamLists != null && !classParamLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
