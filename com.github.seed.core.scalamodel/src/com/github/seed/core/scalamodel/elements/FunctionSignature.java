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
 * A representation of the model object '<em><b>Function Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.FunctionSignature#getParamTypes <em>Param Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getFunctionSignature()
 * @model
 * @generated
 */
public interface FunctionSignature extends Signature {
	/**
	 * Returns the value of the '<em><b>Param Types</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Types</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getFunctionSignature_ParamTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getParamTypes();

} // FunctionSignature
