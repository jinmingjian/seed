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
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageDcls <em>Package Dcls</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackagings <em>Packagings</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getTemplateDefs <em>Template Defs</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageObjects <em>Package Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends ScalaElement {
	/**
	 * Returns the value of the '<em><b>Package Dcls</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.PackageDcl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Dcls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Dcls</em>' containment reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getCompilationUnit_PackageDcls()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageDcl> getPackageDcls();

	/**
	 * Returns the value of the '<em><b>Packagings</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.Packaging}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packagings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packagings</em>' containment reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getCompilationUnit_Packagings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packaging> getPackagings();

	/**
	 * Returns the value of the '<em><b>Template Defs</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.TemplateDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Defs</em>' containment reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getCompilationUnit_TemplateDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateDef> getTemplateDefs();

	/**
	 * Returns the value of the '<em><b>Package Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.seed.core.scalamodel.elements.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Objects</em>' containment reference list.
	 * @see com.github.seed.core.scalamodel.elements.ScalaModelPackage#getCompilationUnit_PackageObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageObject> getPackageObjects();

} // CompilationUnit
