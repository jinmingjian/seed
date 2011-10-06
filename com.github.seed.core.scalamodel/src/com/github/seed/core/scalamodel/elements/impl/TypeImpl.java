/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl#getTypeParams <em>Type Params</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends ScalaElementImpl implements Type {
	/**
	 * The cached value of the '{@link #getTypeParams() <em>Type Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> typeParams;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected Type superType;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> subTypes;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypeParams() {
		if (typeParams == null) {
			typeParams = new EObjectResolvingEList<Type>(Type.class, this, ScalaModelPackage.TYPE__TYPE_PARAMS);
		}
		return typeParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (Type)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaModelPackage.TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperType(Type newSuperType, NotificationChain msgs) {
		Type oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalaModelPackage.TYPE__SUPER_TYPE, oldSuperType, newSuperType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(Type newSuperType) {
		if (newSuperType != superType) {
			NotificationChain msgs = null;
			if (superType != null)
				msgs = ((InternalEObject)superType).eInverseRemove(this, ScalaModelPackage.TYPE__SUB_TYPES, Type.class, msgs);
			if (newSuperType != null)
				msgs = ((InternalEObject)newSuperType).eInverseAdd(this, ScalaModelPackage.TYPE__SUB_TYPES, Type.class, msgs);
			msgs = basicSetSuperType(newSuperType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.TYPE__SUPER_TYPE, newSuperType, newSuperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectWithInverseResolvingEList<Type>(Type.class, this, ScalaModelPackage.TYPE__SUB_TYPES, ScalaModelPackage.TYPE__SUPER_TYPE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<Type>(Type.class, this, ScalaModelPackage.TYPE__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				if (superType != null)
					msgs = ((InternalEObject)superType).eInverseRemove(this, ScalaModelPackage.TYPE__SUB_TYPES, Type.class, msgs);
				return basicSetSuperType((Type)otherEnd, msgs);
			case ScalaModelPackage.TYPE__SUB_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				return basicSetSuperType(null, msgs);
			case ScalaModelPackage.TYPE__SUB_TYPES:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
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
			case ScalaModelPackage.TYPE__TYPE_PARAMS:
				return getTypeParams();
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case ScalaModelPackage.TYPE__SUB_TYPES:
				return getSubTypes();
			case ScalaModelPackage.TYPE__MIXINS:
				return getMixins();
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
			case ScalaModelPackage.TYPE__TYPE_PARAMS:
				getTypeParams().clear();
				getTypeParams().addAll((Collection<? extends Type>)newValue);
				return;
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)newValue);
				return;
			case ScalaModelPackage.TYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ScalaModelPackage.TYPE__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Type>)newValue);
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
			case ScalaModelPackage.TYPE__TYPE_PARAMS:
				getTypeParams().clear();
				return;
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)null);
				return;
			case ScalaModelPackage.TYPE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case ScalaModelPackage.TYPE__MIXINS:
				getMixins().clear();
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
			case ScalaModelPackage.TYPE__TYPE_PARAMS:
				return typeParams != null && !typeParams.isEmpty();
			case ScalaModelPackage.TYPE__SUPER_TYPE:
				return superType != null;
			case ScalaModelPackage.TYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case ScalaModelPackage.TYPE__MIXINS:
				return mixins != null && !mixins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
