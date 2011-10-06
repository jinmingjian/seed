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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Class#getClassParamLists <em>Class Param Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends TemplateDef {
	/**
	 * Returns the value of the '<em><b>Class Param Lists</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.ClassParamList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Param Lists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Param Lists</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClass_ClassParamLists()
	 * @model
	 * @generated
	 */
	EList<ClassParamList> getClassParamLists();

} // Class
