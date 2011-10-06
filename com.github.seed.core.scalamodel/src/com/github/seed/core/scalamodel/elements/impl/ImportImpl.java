/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.Import;
import com.github.seed.core.scalamodel.elements.ScalaElement;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ImportImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ImportImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.ImportImpl#getEndLocation <em>End Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends EObjectImpl implements Import {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected int startLocation = START_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLocation() <em>End Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int END_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndLocation() <em>End Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLocation()
	 * @generated
	 * @ordered
	 */
	protected int endLocation = END_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.IMPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLocation(int newStartLocation) {
		int oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.IMPORT__START_LOCATION, oldStartLocation, startLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndLocation() {
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLocation(int newEndLocation) {
		int oldEndLocation = endLocation;
		endLocation = newEndLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.IMPORT__END_LOCATION, oldEndLocation, endLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.IMPORT__NAME:
				return getName();
			case ScalaModelPackage.IMPORT__START_LOCATION:
				return getStartLocation();
			case ScalaModelPackage.IMPORT__END_LOCATION:
				return getEndLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalaModelPackage.IMPORT__NAME:
				setName((String)newValue);
				return;
			case ScalaModelPackage.IMPORT__START_LOCATION:
				setStartLocation((Integer)newValue);
				return;
			case ScalaModelPackage.IMPORT__END_LOCATION:
				setEndLocation((Integer)newValue);
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
			case ScalaModelPackage.IMPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScalaModelPackage.IMPORT__START_LOCATION:
				setStartLocation(START_LOCATION_EDEFAULT);
				return;
			case ScalaModelPackage.IMPORT__END_LOCATION:
				setEndLocation(END_LOCATION_EDEFAULT);
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
			case ScalaModelPackage.IMPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScalaModelPackage.IMPORT__START_LOCATION:
				return startLocation != START_LOCATION_EDEFAULT;
			case ScalaModelPackage.IMPORT__END_LOCATION:
				return endLocation != END_LOCATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ScalaElement.class) {
			switch (derivedFeatureID) {
				case ScalaModelPackage.IMPORT__NAME: return ScalaModelPackage.SCALA_ELEMENT__NAME;
				case ScalaModelPackage.IMPORT__START_LOCATION: return ScalaModelPackage.SCALA_ELEMENT__START_LOCATION;
				case ScalaModelPackage.IMPORT__END_LOCATION: return ScalaModelPackage.SCALA_ELEMENT__END_LOCATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ScalaElement.class) {
			switch (baseFeatureID) {
				case ScalaModelPackage.SCALA_ELEMENT__NAME: return ScalaModelPackage.IMPORT__NAME;
				case ScalaModelPackage.SCALA_ELEMENT__START_LOCATION: return ScalaModelPackage.IMPORT__START_LOCATION;
				case ScalaModelPackage.SCALA_ELEMENT__END_LOCATION: return ScalaModelPackage.IMPORT__END_LOCATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", startLocation: ");
		result.append(startLocation);
		result.append(", endLocation: ");
		result.append(endLocation);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
