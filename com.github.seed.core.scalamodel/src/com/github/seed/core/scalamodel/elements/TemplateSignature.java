/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.TemplateSignature#getMemberSignatures <em>Member Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends Signature {
	/**
	 * Returns the value of the '<em><b>Member Signatures</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Signatures</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateSignature_MemberSignatures()
	 * @model
	 * @generated
	 */
	EList<Signature> getMemberSignatures();

} // TemplateSignature
