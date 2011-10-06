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
 * A representation of the model object '<em><b>Class Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ClassParamList#isImplicit <em>Implicit</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ClassParamList#getClassParams <em>Class Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParamList()
 * @model
 * @generated
 */
public interface ClassParamList extends ScalaElement {
	/**
	 * Returns the value of the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit</em>' attribute.
	 * @see #setImplicit(boolean)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParamList_Implicit()
	 * @model
	 * @generated
	 */
	boolean isImplicit();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ClassParamList#isImplicit <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit</em>' attribute.
	 * @see #isImplicit()
	 * @generated
	 */
	void setImplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Class Params</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.ClassParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Params</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParamList_ClassParams()
	 * @model
	 * @generated
	 */
	EList<ClassParam> getClassParams();

} // ClassParamList
