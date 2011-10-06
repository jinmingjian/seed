/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.Signature;
import com.github.seed.core.scalamodel.elements.TemplateSignature;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TemplateSignatureImpl#getMemberSignatures <em>Member Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSignatureImpl extends SignatureImpl implements TemplateSignature {
	/**
	 * The cached value of the '{@link #getMemberSignatures() <em>Member Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> memberSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getMemberSignatures() {
		if (memberSignatures == null) {
			memberSignatures = new EObjectResolvingEList<Signature>(Signature.class, this, ScalaModelPackage.TEMPLATE_SIGNATURE__MEMBER_SIGNATURES);
		}
		return memberSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_SIGNATURE__MEMBER_SIGNATURES:
				return getMemberSignatures();
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
			case ScalaModelPackage.TEMPLATE_SIGNATURE__MEMBER_SIGNATURES:
				getMemberSignatures().clear();
				getMemberSignatures().addAll((Collection<? extends Signature>)newValue);
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
			case ScalaModelPackage.TEMPLATE_SIGNATURE__MEMBER_SIGNATURES:
				getMemberSignatures().clear();
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
			case ScalaModelPackage.TEMPLATE_SIGNATURE__MEMBER_SIGNATURES:
				return memberSignatures != null && !memberSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateSignatureImpl
