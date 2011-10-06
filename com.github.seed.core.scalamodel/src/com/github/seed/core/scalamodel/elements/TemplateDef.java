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
 * A representation of the model object '<em><b>Template Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.TemplateDef#getTemplateStats <em>Template Stats</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.TemplateDef#getEarlyDef <em>Early Def</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.TemplateDef#getSelfType <em>Self Type</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.TemplateDef#isCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateDef()
 * @model
 * @generated
 */
public interface TemplateDef extends TypedScalaElement {
	/**
	 * Returns the value of the '<em><b>Template Stats</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.TemplateStat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Stats</em>' containment reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateDef_TemplateStats()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateStat> getTemplateStats();

	/**
	 * Returns the value of the '<em><b>Early Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Def</em>' reference.
	 * @see #setEarlyDef(EarlyDef)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateDef_EarlyDef()
	 * @model
	 * @generated
	 */
	EarlyDef getEarlyDef();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.TemplateDef#getEarlyDef <em>Early Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Def</em>' reference.
	 * @see #getEarlyDef()
	 * @generated
	 */
	void setEarlyDef(EarlyDef value);

	/**
	 * Returns the value of the '<em><b>Self Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Type</em>' reference.
	 * @see #setSelfType(SelfType)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateDef_SelfType()
	 * @model
	 * @generated
	 */
	SelfType getSelfType();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.TemplateDef#getSelfType <em>Self Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Type</em>' reference.
	 * @see #getSelfType()
	 * @generated
	 */
	void setSelfType(SelfType value);

	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(boolean)
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getTemplateDef_Case()
	 * @model
	 * @generated
	 */
	boolean isCase();

	/**
	 * Sets the value of the '{@link com.github.seed.core.scalamodel.elements.TemplateDef#isCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #isCase()
	 * @generated
	 */
	void setCase(boolean value);

} // TemplateDef
