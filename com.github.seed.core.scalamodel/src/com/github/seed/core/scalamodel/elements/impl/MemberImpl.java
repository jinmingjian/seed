/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.Member;
import com.github.seed.core.scalamodel.elements.ScalaElement;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.Signature;
import com.github.seed.core.scalamodel.elements.Type;
import com.github.seed.core.scalamodel.elements.TypedScalaElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberImpl extends EObjectImpl implements Member {
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
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> annotations;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.MEMBER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.MEMBER__START_LOCATION, oldStartLocation, startLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.MEMBER__END_LOCATION, oldEndLocation, endLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (Signature)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaModelPackage.MEMBER__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Signature newSignature) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.MEMBER__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaModelPackage.MEMBER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.MEMBER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<String>(String.class, this, ScalaModelPackage.MEMBER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList<String>(String.class, this, ScalaModelPackage.MEMBER__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.MEMBER__NAME:
				return getName();
			case ScalaModelPackage.MEMBER__START_LOCATION:
				return getStartLocation();
			case ScalaModelPackage.MEMBER__END_LOCATION:
				return getEndLocation();
			case ScalaModelPackage.MEMBER__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case ScalaModelPackage.MEMBER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ScalaModelPackage.MEMBER__ANNOTATIONS:
				return getAnnotations();
			case ScalaModelPackage.MEMBER__MODIFIERS:
				return getModifiers();
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
			case ScalaModelPackage.MEMBER__NAME:
				setName((String)newValue);
				return;
			case ScalaModelPackage.MEMBER__START_LOCATION:
				setStartLocation((Integer)newValue);
				return;
			case ScalaModelPackage.MEMBER__END_LOCATION:
				setEndLocation((Integer)newValue);
				return;
			case ScalaModelPackage.MEMBER__SIGNATURE:
				setSignature((Signature)newValue);
				return;
			case ScalaModelPackage.MEMBER__TYPE:
				setType((Type)newValue);
				return;
			case ScalaModelPackage.MEMBER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends String>)newValue);
				return;
			case ScalaModelPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
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
			case ScalaModelPackage.MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScalaModelPackage.MEMBER__START_LOCATION:
				setStartLocation(START_LOCATION_EDEFAULT);
				return;
			case ScalaModelPackage.MEMBER__END_LOCATION:
				setEndLocation(END_LOCATION_EDEFAULT);
				return;
			case ScalaModelPackage.MEMBER__SIGNATURE:
				setSignature((Signature)null);
				return;
			case ScalaModelPackage.MEMBER__TYPE:
				setType((Type)null);
				return;
			case ScalaModelPackage.MEMBER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ScalaModelPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
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
			case ScalaModelPackage.MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScalaModelPackage.MEMBER__START_LOCATION:
				return startLocation != START_LOCATION_EDEFAULT;
			case ScalaModelPackage.MEMBER__END_LOCATION:
				return endLocation != END_LOCATION_EDEFAULT;
			case ScalaModelPackage.MEMBER__SIGNATURE:
				return signature != null;
			case ScalaModelPackage.MEMBER__TYPE:
				return type != null;
			case ScalaModelPackage.MEMBER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ScalaModelPackage.MEMBER__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
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
				case ScalaModelPackage.MEMBER__NAME: return ScalaModelPackage.SCALA_ELEMENT__NAME;
				case ScalaModelPackage.MEMBER__START_LOCATION: return ScalaModelPackage.SCALA_ELEMENT__START_LOCATION;
				case ScalaModelPackage.MEMBER__END_LOCATION: return ScalaModelPackage.SCALA_ELEMENT__END_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == TypedScalaElement.class) {
			switch (derivedFeatureID) {
				case ScalaModelPackage.MEMBER__SIGNATURE: return ScalaModelPackage.TYPED_SCALA_ELEMENT__SIGNATURE;
				case ScalaModelPackage.MEMBER__TYPE: return ScalaModelPackage.TYPED_SCALA_ELEMENT__TYPE;
				case ScalaModelPackage.MEMBER__ANNOTATIONS: return ScalaModelPackage.TYPED_SCALA_ELEMENT__ANNOTATIONS;
				case ScalaModelPackage.MEMBER__MODIFIERS: return ScalaModelPackage.TYPED_SCALA_ELEMENT__MODIFIERS;
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
				case ScalaModelPackage.SCALA_ELEMENT__NAME: return ScalaModelPackage.MEMBER__NAME;
				case ScalaModelPackage.SCALA_ELEMENT__START_LOCATION: return ScalaModelPackage.MEMBER__START_LOCATION;
				case ScalaModelPackage.SCALA_ELEMENT__END_LOCATION: return ScalaModelPackage.MEMBER__END_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == TypedScalaElement.class) {
			switch (baseFeatureID) {
				case ScalaModelPackage.TYPED_SCALA_ELEMENT__SIGNATURE: return ScalaModelPackage.MEMBER__SIGNATURE;
				case ScalaModelPackage.TYPED_SCALA_ELEMENT__TYPE: return ScalaModelPackage.MEMBER__TYPE;
				case ScalaModelPackage.TYPED_SCALA_ELEMENT__ANNOTATIONS: return ScalaModelPackage.MEMBER__ANNOTATIONS;
				case ScalaModelPackage.TYPED_SCALA_ELEMENT__MODIFIERS: return ScalaModelPackage.MEMBER__MODIFIERS;
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
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", modifiers: ");
		result.append(modifiers);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
