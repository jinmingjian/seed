/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ClassParam#isVar <em>Var</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ClassParam#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParam()
 * @model
 * @generated
 */
public interface ClassParam extends TypedScalaElement {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(boolean)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParam_Var()
	 * @model
	 * @generated
	 */
	boolean isVar();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ClassParam#isVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #isVar()
	 * @generated
	 */
	void setVar(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getClassParam_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ClassParam#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // ClassParam
