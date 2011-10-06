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
 * A representation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Packaging#getSubPackagings <em>Sub Packagings</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.Packaging#getTemplateDefs <em>Template Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getPackaging()
 * @model
 * @generated
 */
public interface Packaging extends ScalaElement {
	/**
	 * Returns the value of the '<em><b>Sub Packagings</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Packaging}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packagings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packagings</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getPackaging_SubPackagings()
	 * @model
	 * @generated
	 */
	EList<Packaging> getSubPackagings();

	/**
	 * Returns the value of the '<em><b>Template Defs</b></em>' reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.TemplateDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Defs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Defs</em>' reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getPackaging_TemplateDefs()
	 * @model
	 * @generated
	 */
	EList<TemplateDef> getTemplateDefs();

} // Packaging
