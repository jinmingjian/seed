/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Var Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ValVarDef#isVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getValVarDef()
 * @model
 * @generated
 */
public interface ValVarDef extends Def {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(boolean)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getValVarDef_Val()
	 * @model
	 * @generated
	 */
	boolean isVal();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ValVarDef#isVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #isVal()
	 * @generated
	 */
	void setVal(boolean value);

} // ValVarDef
