/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scala Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ScalaElement#getName <em>Name</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ScalaElement#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.ScalaElement#getEndLocation <em>End Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getScalaElement()
 * @model
 * @generated
 */
public interface ScalaElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getScalaElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' attribute.
	 * @see #setStartLocation(int)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getScalaElement_StartLocation()
	 * @model
	 * @generated
	 */
	int getStartLocation();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getStartLocation <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' attribute.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(int value);

	/**
	 * Returns the value of the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Location</em>' attribute.
	 * @see #setEndLocation(int)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getScalaElement_EndLocation()
	 * @model
	 * @generated
	 */
	int getEndLocation();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getEndLocation <em>End Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Location</em>' attribute.
	 * @see #getEndLocation()
	 * @generated
	 */
	void setEndLocation(int value);

} // ScalaElement
