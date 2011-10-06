/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.CompilationUnit;
import com.github.seed.core.scalamodel.elements.PackageDcl;
import com.github.seed.core.scalamodel.elements.PackageObject;
import com.github.seed.core.scalamodel.elements.Packaging;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.TemplateDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl#getPackageDcls <em>Package Dcls</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl#getPackagings <em>Packagings</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl#getTemplateDefs <em>Template Defs</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl#getPackageObjects <em>Package Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends ScalaElementImpl implements CompilationUnit {
	/**
	 * The cached value of the '{@link #getPackageDcls() <em>Package Dcls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageDcls()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageDcl> packageDcls;

	/**
	 * The cached value of the '{@link #getPackagings() <em>Packagings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagings()
	 * @generated
	 * @ordered
	 */
	protected EList<Packaging> packagings;

	/**
	 * The cached value of the '{@link #getTemplateDefs() <em>Template Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateDef> templateDefs;

	/**
	 * The cached value of the '{@link #getPackageObjects() <em>Package Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> packageObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageDcl> getPackageDcls() {
		if (packageDcls == null) {
			packageDcls = new EObjectContainmentEList<PackageDcl>(PackageDcl.class, this, ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS);
		}
		return packageDcls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Packaging> getPackagings() {
		if (packagings == null) {
			packagings = new EObjectContainmentEList<Packaging>(Packaging.class, this, ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS);
		}
		return packagings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateDef> getTemplateDefs() {
		if (templateDefs == null) {
			templateDefs = new EObjectContainmentEList<TemplateDef>(TemplateDef.class, this, ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS);
		}
		return templateDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageObject> getPackageObjects() {
		if (packageObjects == null) {
			packageObjects = new EObjectContainmentEList<PackageObject>(PackageObject.class, this, ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS);
		}
		return packageObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS:
				return ((InternalEList<?>)getPackageDcls()).basicRemove(otherEnd, msgs);
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS:
				return ((InternalEList<?>)getPackagings()).basicRemove(otherEnd, msgs);
			case ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS:
				return ((InternalEList<?>)getTemplateDefs()).basicRemove(otherEnd, msgs);
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS:
				return ((InternalEList<?>)getPackageObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS:
				return getPackageDcls();
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS:
				return getPackagings();
			case ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS:
				return getTemplateDefs();
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS:
				return getPackageObjects();
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
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS:
				getPackageDcls().clear();
				getPackageDcls().addAll((Collection<? extends PackageDcl>)newValue);
				return;
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS:
				getPackagings().clear();
				getPackagings().addAll((Collection<? extends Packaging>)newValue);
				return;
			case ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS:
				getTemplateDefs().clear();
				getTemplateDefs().addAll((Collection<? extends TemplateDef>)newValue);
				return;
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS:
				getPackageObjects().clear();
				getPackageObjects().addAll((Collection<? extends PackageObject>)newValue);
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
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS:
				getPackageDcls().clear();
				return;
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS:
				getPackagings().clear();
				return;
			case ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS:
				getTemplateDefs().clear();
				return;
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS:
				getPackageObjects().clear();
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
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_DCLS:
				return packageDcls != null && !packageDcls.isEmpty();
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGINGS:
				return packagings != null && !packagings.isEmpty();
			case ScalaModelPackage.COMPILATION_UNIT__TEMPLATE_DEFS:
				return templateDefs != null && !templateDefs.isEmpty();
			case ScalaModelPackage.COMPILATION_UNIT__PACKAGE_OBJECTS:
				return packageObjects != null && !packageObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnitImpl
