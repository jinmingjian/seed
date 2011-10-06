/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.Packaging;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.TemplateDef;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.PackagingImpl#getSubPackagings <em>Sub Packagings</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.PackagingImpl#getTemplateDefs <em>Template Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagingImpl extends ScalaElementImpl implements Packaging {
	/**
	 * The cached value of the '{@link #getSubPackagings() <em>Sub Packagings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackagings()
	 * @generated
	 * @ordered
	 */
	protected EList<Packaging> subPackagings;

	/**
	 * The cached value of the '{@link #getTemplateDefs() <em>Template Defs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateDef> templateDefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.PACKAGING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Packaging> getSubPackagings() {
		if (subPackagings == null) {
			subPackagings = new EObjectResolvingEList<Packaging>(Packaging.class, this, ScalaModelPackage.PACKAGING__SUB_PACKAGINGS);
		}
		return subPackagings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateDef> getTemplateDefs() {
		if (templateDefs == null) {
			templateDefs = new EObjectResolvingEList<TemplateDef>(TemplateDef.class, this, ScalaModelPackage.PACKAGING__TEMPLATE_DEFS);
		}
		return templateDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.PACKAGING__SUB_PACKAGINGS:
				return getSubPackagings();
			case ScalaModelPackage.PACKAGING__TEMPLATE_DEFS:
				return getTemplateDefs();
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
			case ScalaModelPackage.PACKAGING__SUB_PACKAGINGS:
				getSubPackagings().clear();
				getSubPackagings().addAll((Collection<? extends Packaging>)newValue);
				return;
			case ScalaModelPackage.PACKAGING__TEMPLATE_DEFS:
				getTemplateDefs().clear();
				getTemplateDefs().addAll((Collection<? extends TemplateDef>)newValue);
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
			case ScalaModelPackage.PACKAGING__SUB_PACKAGINGS:
				getSubPackagings().clear();
				return;
			case ScalaModelPackage.PACKAGING__TEMPLATE_DEFS:
				getTemplateDefs().clear();
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
			case ScalaModelPackage.PACKAGING__SUB_PACKAGINGS:
				return subPackagings != null && !subPackagings.isEmpty();
			case ScalaModelPackage.PACKAGING__TEMPLATE_DEFS:
				return templateDefs != null && !templateDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackagingImpl
