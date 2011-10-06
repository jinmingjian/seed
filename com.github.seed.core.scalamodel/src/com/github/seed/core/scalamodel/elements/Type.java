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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Type#getTypeParams <em>Type Params</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Type#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Type#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Type#getMixins <em>Mixins</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends ScalaElement {
	/**
	 * Returns the value of the '<em><b>Type Params</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Params</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getType_TypeParams()
	 * @model
	 * @generated
	 */
	EList<Type> getTypeParams();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.seed.core.scalamodel.elements.Type#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Type)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getType_SuperType()
	 * @see com.github.seed.core.scalamodel.elements.Type#getSubTypes
	 * @model opposite="subTypes"
	 * @generated
	 */
	Type getSuperType();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.Type#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Type value);

	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Type}.
	 * It is bidirectional and its opposite is '{@link com.github.seed.core.scalamodel.elements.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getType_SubTypes()
	 * @see com.github.seed.core.scalamodel.elements.Type#getSuperType
	 * @model opposite="superType"
	 * @generated
	 */
	EList<Type> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getType_Mixins()
	 * @model
	 * @generated
	 */
	EList<Type> getMixins();

} // Type
