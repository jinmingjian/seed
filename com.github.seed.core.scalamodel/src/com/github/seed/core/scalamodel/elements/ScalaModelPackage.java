/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.seed.core.scalamodel.elements.ScalaModelFactory
 * @model kind="package"
 * @generated
 */
public interface ScalaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.github.seed/scalamodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scalamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScalaModelPackage eINSTANCE = com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ScalaElementImpl <em>Scala Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaElementImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getScalaElement()
	 * @generated
	 */
	int SCALA_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALA_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALA_ELEMENT__START_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALA_ELEMENT__END_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Scala Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALA_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_PARAMS = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPE = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUB_TYPES = SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MIXINS = SCALA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TypedScalaElementImpl <em>Typed Scala Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TypedScalaElementImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypedScalaElement()
	 * @generated
	 */
	int TYPED_SCALA_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__SIGNATURE = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__TYPE = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__ANNOTATIONS = SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT__MODIFIERS = SCALA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Typed Scala Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_SCALA_ELEMENT_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl <em>Template Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateDef()
	 * @generated
	 */
	int TEMPLATE_DEF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__NAME = TYPED_SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__START_LOCATION = TYPED_SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__END_LOCATION = TYPED_SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__SIGNATURE = TYPED_SCALA_ELEMENT__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__TYPE = TYPED_SCALA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__ANNOTATIONS = TYPED_SCALA_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__MODIFIERS = TYPED_SCALA_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Template Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__TEMPLATE_STATS = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Early Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__EARLY_DEF = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__SELF_TYPE = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__CASE = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF_FEATURE_COUNT = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TraitImpl <em>Trait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TraitImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTrait()
	 * @generated
	 */
	int TRAIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__NAME = TEMPLATE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__START_LOCATION = TEMPLATE_DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__END_LOCATION = TEMPLATE_DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__SIGNATURE = TEMPLATE_DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__TYPE = TEMPLATE_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__ANNOTATIONS = TEMPLATE_DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__MODIFIERS = TEMPLATE_DEF__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Template Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__TEMPLATE_STATS = TEMPLATE_DEF__TEMPLATE_STATS;

	/**
	 * The feature id for the '<em><b>Early Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__EARLY_DEF = TEMPLATE_DEF__EARLY_DEF;

	/**
	 * The feature id for the '<em><b>Self Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__SELF_TYPE = TEMPLATE_DEF__SELF_TYPE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__CASE = TEMPLATE_DEF__CASE;

	/**
	 * The number of structural features of the '<em>Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT_FEATURE_COUNT = TEMPLATE_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ClassImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TEMPLATE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__START_LOCATION = TEMPLATE_DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__END_LOCATION = TEMPLATE_DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SIGNATURE = TEMPLATE_DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE = TEMPLATE_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = TEMPLATE_DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MODIFIERS = TEMPLATE_DEF__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Template Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_STATS = TEMPLATE_DEF__TEMPLATE_STATS;

	/**
	 * The feature id for the '<em><b>Early Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EARLY_DEF = TEMPLATE_DEF__EARLY_DEF;

	/**
	 * The feature id for the '<em><b>Self Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SELF_TYPE = TEMPLATE_DEF__SELF_TYPE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CASE = TEMPLATE_DEF__CASE;

	/**
	 * The feature id for the '<em><b>Class Param Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_PARAM_LISTS = TEMPLATE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TEMPLATE_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ObjectImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = TEMPLATE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__START_LOCATION = TEMPLATE_DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__END_LOCATION = TEMPLATE_DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SIGNATURE = TEMPLATE_DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPE = TEMPLATE_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ANNOTATIONS = TEMPLATE_DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MODIFIERS = TEMPLATE_DEF__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Template Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TEMPLATE_STATS = TEMPLATE_DEF__TEMPLATE_STATS;

	/**
	 * The feature id for the '<em><b>Early Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__EARLY_DEF = TEMPLATE_DEF__EARLY_DEF;

	/**
	 * The feature id for the '<em><b>Self Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SELF_TYPE = TEMPLATE_DEF__SELF_TYPE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CASE = TEMPLATE_DEF__CASE;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = TEMPLATE_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.PackagingImpl <em>Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.PackagingImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackaging()
	 * @generated
	 */
	int PACKAGING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Sub Packagings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__SUB_PACKAGINGS = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Defs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__TEMPLATE_DEFS = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.PackageObjectImpl <em>Package Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.PackageObjectImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackageObject()
	 * @generated
	 */
	int PACKAGE_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Package Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.TemplateStat <em>Template Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.TemplateStat
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateStat()
	 * @generated
	 */
	int TEMPLATE_STAT = 19;

	/**
	 * The number of structural features of the '<em>Template Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_STAT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ImportImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = TEMPLATE_STAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__START_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__END_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = TEMPLATE_STAT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Package Dcls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE_DCLS = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packagings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGINGS = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TEMPLATE_DEFS = SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE_OBJECTS = SCALA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.MemberImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = TEMPLATE_STAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__START_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__END_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SIGNATURE = TEMPLATE_STAT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE = TEMPLATE_STAT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ANNOTATIONS = TEMPLATE_STAT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MODIFIERS = TEMPLATE_STAT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = TEMPLATE_STAT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.DefImpl <em>Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.DefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getDef()
	 * @generated
	 */
	int DEF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__START_LOCATION = MEMBER__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__END_LOCATION = MEMBER__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__SIGNATURE = MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__TYPE = MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.DclImpl <em>Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.DclImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getDcl()
	 * @generated
	 */
	int DCL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__START_LOCATION = MEMBER__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__END_LOCATION = MEMBER__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__SIGNATURE = MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__TYPE = MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCL_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.PackageDclImpl <em>Package Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.PackageDclImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackageDcl()
	 * @generated
	 */
	int PACKAGE_DCL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DCL__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DCL__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DCL__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Package Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DCL_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeDclImpl <em>Type Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TypeDclImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypeDcl()
	 * @generated
	 */
	int TYPE_DCL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__NAME = DCL__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__START_LOCATION = DCL__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__END_LOCATION = DCL__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__SIGNATURE = DCL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__TYPE = DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__ANNOTATIONS = DCL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL__MODIFIERS = DCL__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Type Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DCL_FEATURE_COUNT = DCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.FunDclImpl <em>Fun Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.FunDclImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunDcl()
	 * @generated
	 */
	int FUN_DCL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__NAME = DCL__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__START_LOCATION = DCL__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__END_LOCATION = DCL__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__SIGNATURE = DCL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__TYPE = DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__ANNOTATIONS = DCL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL__MODIFIERS = DCL__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Fun Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DCL_FEATURE_COUNT = DCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ValVarDclImpl <em>Val Var Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ValVarDclImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getValVarDcl()
	 * @generated
	 */
	int VAL_VAR_DCL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__NAME = DCL__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__START_LOCATION = DCL__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__END_LOCATION = DCL__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__SIGNATURE = DCL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__TYPE = DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__ANNOTATIONS = DCL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL__MODIFIERS = DCL__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Val Var Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DCL_FEATURE_COUNT = DCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ValVarDefImpl <em>Val Var Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ValVarDefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getValVarDef()
	 * @generated
	 */
	int VAL_VAR_DEF = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__NAME = DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__START_LOCATION = DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__END_LOCATION = DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__SIGNATURE = DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__TYPE = DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__ANNOTATIONS = DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__MODIFIERS = DEF__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF__VAL = DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Val Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_VAR_DEF_FEATURE_COUNT = DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.FunDefImpl <em>Fun Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.FunDefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunDef()
	 * @generated
	 */
	int FUN_DEF = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__NAME = DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__START_LOCATION = DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__END_LOCATION = DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__SIGNATURE = DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__TYPE = DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__ANNOTATIONS = DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF__MODIFIERS = DEF__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Fun Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEF_FEATURE_COUNT = DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TypeDefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = DEF__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__START_LOCATION = DEF__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__END_LOCATION = DEF__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__SIGNATURE = DEF__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE = DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__ANNOTATIONS = DEF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__MODIFIERS = DEF__MODIFIERS;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.SelfTypeImpl <em>Self Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.SelfTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSelfType()
	 * @generated
	 */
	int SELF_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Self Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TupleTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__START_LOCATION = TYPE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__END_LOCATION = TYPE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__TYPE_PARAMS = TYPE__TYPE_PARAMS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__SUB_TYPES = TYPE__SUB_TYPES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MIXINS = TYPE__MIXINS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__TYPES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.EarlyDefImpl <em>Early Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.EarlyDefImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getEarlyDef()
	 * @generated
	 */
	int EARLY_DEF = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_DEF__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_DEF__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_DEF__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Early Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_DEF_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.RefinementTypeImpl <em>Refinement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.RefinementTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__START_LOCATION = TYPE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__END_LOCATION = TYPE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__TYPE_PARAMS = TYPE__TYPE_PARAMS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__SUB_TYPES = TYPE__SUB_TYPES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__MIXINS = TYPE__MIXINS;

	/**
	 * The number of structural features of the '<em>Refinement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.FunctionTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__START_LOCATION = TYPE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__END_LOCATION = TYPE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TYPE_PARAMS = TYPE__TYPE_PARAMS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SUB_TYPES = TYPE__SUB_TYPES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__MIXINS = TYPE__MIXINS;

	/**
	 * The feature id for the '<em><b>Param Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAM_TYPES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RETURN_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ExpressionImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = TEMPLATE_STAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__START_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__END_LOCATION = TEMPLATE_STAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SIGNATURE = TEMPLATE_STAT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = TEMPLATE_STAT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = TEMPLATE_STAT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MODIFIERS = TEMPLATE_STAT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = TEMPLATE_STAT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ExistentialTypeImpl <em>Existential Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ExistentialTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getExistentialType()
	 * @generated
	 */
	int EXISTENTIAL_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__START_LOCATION = TYPE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__END_LOCATION = TYPE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__TYPE_PARAMS = TYPE__TYPE_PARAMS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__SUB_TYPES = TYPE__SUB_TYPES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE__MIXINS = TYPE__MIXINS;

	/**
	 * The number of structural features of the '<em>Existential Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.SignatureImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.FunctionSignatureImpl <em>Function Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.FunctionSignatureImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunctionSignature()
	 * @generated
	 */
	int FUNCTION_SIGNATURE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE__NAME = SIGNATURE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE__START_LOCATION = SIGNATURE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE__END_LOCATION = SIGNATURE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE__TYPE = SIGNATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Param Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE__PARAM_TYPES = SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.TemplateSignatureImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateSignature()
	 * @generated
	 */
	int TEMPLATE_SIGNATURE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__NAME = SIGNATURE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__START_LOCATION = SIGNATURE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__END_LOCATION = SIGNATURE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__TYPE = SIGNATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Member Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__MEMBER_SIGNATURES = SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassParamImpl <em>Class Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ClassParamImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClassParam()
	 * @generated
	 */
	int CLASS_PARAM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__NAME = TYPED_SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__START_LOCATION = TYPED_SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__END_LOCATION = TYPED_SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__SIGNATURE = TYPED_SCALA_ELEMENT__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__TYPE = TYPED_SCALA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__ANNOTATIONS = TYPED_SCALA_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__MODIFIERS = TYPED_SCALA_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__VAR = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM__DEFAULT = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_FEATURE_COUNT = TYPED_SCALA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.SimpleTypeImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__START_LOCATION = TYPE__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__END_LOCATION = TYPE__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Type Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPE_PARAMS = TYPE__TYPE_PARAMS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SUB_TYPES = TYPE__SUB_TYPES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__MIXINS = TYPE__MIXINS;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl <em>Class Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl
	 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClassParamList()
	 * @generated
	 */
	int CLASS_PARAM_LIST = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST__NAME = SCALA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST__START_LOCATION = SCALA_ELEMENT__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST__END_LOCATION = SCALA_ELEMENT__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST__IMPLICIT = SCALA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST__CLASS_PARAMS = SCALA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PARAM_LIST_FEATURE_COUNT = SCALA_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ScalaElement <em>Scala Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scala Element</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ScalaElement
	 * @generated
	 */
	EClass getScalaElement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ScalaElement#getName()
	 * @see #getScalaElement()
	 * @generated
	 */
	EAttribute getScalaElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Location</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ScalaElement#getStartLocation()
	 * @see #getScalaElement()
	 * @generated
	 */
	EAttribute getScalaElement_StartLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ScalaElement#getEndLocation <em>End Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Location</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ScalaElement#getEndLocation()
	 * @see #getScalaElement()
	 * @generated
	 */
	EAttribute getScalaElement_EndLocation();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Type#getTypeParams <em>Type Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Params</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Type#getTypeParams()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeParams();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Type#getSuperType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperType();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Type#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Types</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Type#getSubTypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SubTypes();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Type#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Type#getMixins()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Mixins();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Trait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trait</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Trait
	 * @generated
	 */
	EClass getTrait();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Class#getClassParamLists <em>Class Param Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Param Lists</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Class#getClassParamLists()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassParamLists();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Packaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaging</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Packaging
	 * @generated
	 */
	EClass getPackaging();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Packaging#getSubPackagings <em>Sub Packagings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Packagings</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Packaging#getSubPackagings()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_SubPackagings();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.Packaging#getTemplateDefs <em>Template Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Template Defs</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Packaging#getTemplateDefs()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_TemplateDefs();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.PackageObject <em>Package Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Object</em>'.
	 * @see com.github.seed.core.scalamodel.elements.PackageObject
	 * @generated
	 */
	EClass getPackageObject();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see com.github.seed.core.scalamodel.elements.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageDcls <em>Package Dcls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Dcls</em>'.
	 * @see com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageDcls()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_PackageDcls();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackagings <em>Packagings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagings</em>'.
	 * @see com.github.seed.core.scalamodel.elements.CompilationUnit#getPackagings()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Packagings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getTemplateDefs <em>Template Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Defs</em>'.
	 * @see com.github.seed.core.scalamodel.elements.CompilationUnit#getTemplateDefs()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_TemplateDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageObjects <em>Package Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Objects</em>'.
	 * @see com.github.seed.core.scalamodel.elements.CompilationUnit#getPackageObjects()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_PackageObjects();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Def <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Def
	 * @generated
	 */
	EClass getDef();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Dcl <em>Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcl</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Dcl
	 * @generated
	 */
	EClass getDcl();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TemplateDef <em>Template Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateDef
	 * @generated
	 */
	EClass getTemplateDef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.seed.core.scalamodel.elements.TemplateDef#getTemplateStats <em>Template Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Stats</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateDef#getTemplateStats()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EReference getTemplateDef_TemplateStats();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.TemplateDef#getEarlyDef <em>Early Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Early Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateDef#getEarlyDef()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EReference getTemplateDef_EarlyDef();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.TemplateDef#getSelfType <em>Self Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Self Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateDef#getSelfType()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EReference getTemplateDef_SelfType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.TemplateDef#isCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateDef#isCase()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EAttribute getTemplateDef_Case();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.PackageDcl <em>Package Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Dcl</em>'.
	 * @see com.github.seed.core.scalamodel.elements.PackageDcl
	 * @generated
	 */
	EClass getPackageDcl();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TypeDcl <em>Type Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Dcl</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypeDcl
	 * @generated
	 */
	EClass getTypeDcl();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.FunDcl <em>Fun Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Dcl</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunDcl
	 * @generated
	 */
	EClass getFunDcl();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ValVarDcl <em>Val Var Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Val Var Dcl</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ValVarDcl
	 * @generated
	 */
	EClass getValVarDcl();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ValVarDef <em>Val Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Val Var Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ValVarDef
	 * @generated
	 */
	EClass getValVarDef();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ValVarDef#isVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ValVarDef#isVal()
	 * @see #getValVarDef()
	 * @generated
	 */
	EAttribute getValVarDef_Val();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.FunDef <em>Fun Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunDef
	 * @generated
	 */
	EClass getFunDef();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TemplateStat <em>Template Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Stat</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateStat
	 * @generated
	 */
	EClass getTemplateStat();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.SelfType <em>Self Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.SelfType
	 * @generated
	 */
	EClass getSelfType();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.TupleType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TupleType#getTypes()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Types();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.EarlyDef <em>Early Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Early Def</em>'.
	 * @see com.github.seed.core.scalamodel.elements.EarlyDef
	 * @generated
	 */
	EClass getEarlyDef();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.RefinementType
	 * @generated
	 */
	EClass getRefinementType();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.FunctionType#getParamTypes <em>Param Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Param Types</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunctionType#getParamTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ParamTypes();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.FunctionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunctionType#getReturnType()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ReturnType();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ExistentialType <em>Existential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existential Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ExistentialType
	 * @generated
	 */
	EClass getExistentialType();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.FunctionSignature <em>Function Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Signature</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunctionSignature
	 * @generated
	 */
	EClass getFunctionSignature();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.FunctionSignature#getParamTypes <em>Param Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Param Types</em>'.
	 * @see com.github.seed.core.scalamodel.elements.FunctionSignature#getParamTypes()
	 * @see #getFunctionSignature()
	 * @generated
	 */
	EReference getFunctionSignature_ParamTypes();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Signature</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateSignature
	 * @generated
	 */
	EClass getTemplateSignature();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.TemplateSignature#getMemberSignatures <em>Member Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Signatures</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TemplateSignature#getMemberSignatures()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_MemberSignatures();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.Signature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.Signature#getType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Type();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.TypedScalaElement <em>Typed Scala Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Scala Element</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypedScalaElement
	 * @generated
	 */
	EClass getTypedScalaElement();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.TypedScalaElement#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypedScalaElement#getSignature()
	 * @see #getTypedScalaElement()
	 * @generated
	 */
	EReference getTypedScalaElement_Signature();

	/**
	 * Returns the meta object for the reference '{@link com.github.seed.core.scalamodel.elements.TypedScalaElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypedScalaElement#getType()
	 * @see #getTypedScalaElement()
	 * @generated
	 */
	EReference getTypedScalaElement_Type();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.seed.core.scalamodel.elements.TypedScalaElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypedScalaElement#getAnnotations()
	 * @see #getTypedScalaElement()
	 * @generated
	 */
	EAttribute getTypedScalaElement_Annotations();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.seed.core.scalamodel.elements.TypedScalaElement#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see com.github.seed.core.scalamodel.elements.TypedScalaElement#getModifiers()
	 * @see #getTypedScalaElement()
	 * @generated
	 */
	EAttribute getTypedScalaElement_Modifiers();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ClassParam <em>Class Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Param</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParam
	 * @generated
	 */
	EClass getClassParam();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ClassParam#isVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParam#isVar()
	 * @see #getClassParam()
	 * @generated
	 */
	EAttribute getClassParam_Var();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ClassParam#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParam#isDefault()
	 * @see #getClassParam()
	 * @generated
	 */
	EAttribute getClassParam_Default();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see com.github.seed.core.scalamodel.elements.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link com.github.seed.core.scalamodel.elements.ClassParamList <em>Class Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Param List</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParamList
	 * @generated
	 */
	EClass getClassParamList();

	/**
	 * Returns the meta object for the attribute '{@link com.github.seed.core.scalamodel.elements.ClassParamList#isImplicit <em>Implicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParamList#isImplicit()
	 * @see #getClassParamList()
	 * @generated
	 */
	EAttribute getClassParamList_Implicit();

	/**
	 * Returns the meta object for the reference list '{@link com.github.seed.core.scalamodel.elements.ClassParamList#getClassParams <em>Class Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Params</em>'.
	 * @see com.github.seed.core.scalamodel.elements.ClassParamList#getClassParams()
	 * @see #getClassParamList()
	 * @generated
	 */
	EReference getClassParamList_ClassParams();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScalaModelFactory getScalaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ScalaElementImpl <em>Scala Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaElementImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getScalaElement()
		 * @generated
		 */
		EClass SCALA_ELEMENT = eINSTANCE.getScalaElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALA_ELEMENT__NAME = eINSTANCE.getScalaElement_Name();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALA_ELEMENT__START_LOCATION = eINSTANCE.getScalaElement_StartLocation();

		/**
		 * The meta object literal for the '<em><b>End Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALA_ELEMENT__END_LOCATION = eINSTANCE.getScalaElement_EndLocation();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_PARAMS = eINSTANCE.getType_TypeParams();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUB_TYPES = eINSTANCE.getType_SubTypes();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__MIXINS = eINSTANCE.getType_Mixins();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TraitImpl <em>Trait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TraitImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTrait()
		 * @generated
		 */
		EClass TRAIT = eINSTANCE.getTrait();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ClassImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Class Param Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_PARAM_LISTS = eINSTANCE.getClass_ClassParamLists();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ObjectImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.PackagingImpl <em>Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.PackagingImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackaging()
		 * @generated
		 */
		EClass PACKAGING = eINSTANCE.getPackaging();

		/**
		 * The meta object literal for the '<em><b>Sub Packagings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__SUB_PACKAGINGS = eINSTANCE.getPackaging_SubPackagings();

		/**
		 * The meta object literal for the '<em><b>Template Defs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__TEMPLATE_DEFS = eINSTANCE.getPackaging_TemplateDefs();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.PackageObjectImpl <em>Package Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.PackageObjectImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackageObject()
		 * @generated
		 */
		EClass PACKAGE_OBJECT = eINSTANCE.getPackageObject();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ImportImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.CompilationUnitImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Package Dcls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PACKAGE_DCLS = eINSTANCE.getCompilationUnit_PackageDcls();

		/**
		 * The meta object literal for the '<em><b>Packagings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PACKAGINGS = eINSTANCE.getCompilationUnit_Packagings();

		/**
		 * The meta object literal for the '<em><b>Template Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__TEMPLATE_DEFS = eINSTANCE.getCompilationUnit_TemplateDefs();

		/**
		 * The meta object literal for the '<em><b>Package Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PACKAGE_OBJECTS = eINSTANCE.getCompilationUnit_PackageObjects();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.DefImpl <em>Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.DefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getDef()
		 * @generated
		 */
		EClass DEF = eINSTANCE.getDef();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.DclImpl <em>Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.DclImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getDcl()
		 * @generated
		 */
		EClass DCL = eINSTANCE.getDcl();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl <em>Template Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateDef()
		 * @generated
		 */
		EClass TEMPLATE_DEF = eINSTANCE.getTemplateDef();

		/**
		 * The meta object literal for the '<em><b>Template Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEF__TEMPLATE_STATS = eINSTANCE.getTemplateDef_TemplateStats();

		/**
		 * The meta object literal for the '<em><b>Early Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEF__EARLY_DEF = eINSTANCE.getTemplateDef_EarlyDef();

		/**
		 * The meta object literal for the '<em><b>Self Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEF__SELF_TYPE = eINSTANCE.getTemplateDef_SelfType();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_DEF__CASE = eINSTANCE.getTemplateDef_Case();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.PackageDclImpl <em>Package Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.PackageDclImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getPackageDcl()
		 * @generated
		 */
		EClass PACKAGE_DCL = eINSTANCE.getPackageDcl();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeDclImpl <em>Type Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TypeDclImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypeDcl()
		 * @generated
		 */
		EClass TYPE_DCL = eINSTANCE.getTypeDcl();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.FunDclImpl <em>Fun Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.FunDclImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunDcl()
		 * @generated
		 */
		EClass FUN_DCL = eINSTANCE.getFunDcl();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ValVarDclImpl <em>Val Var Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ValVarDclImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getValVarDcl()
		 * @generated
		 */
		EClass VAL_VAR_DCL = eINSTANCE.getValVarDcl();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ValVarDefImpl <em>Val Var Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ValVarDefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getValVarDef()
		 * @generated
		 */
		EClass VAL_VAR_DEF = eINSTANCE.getValVarDef();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAL_VAR_DEF__VAL = eINSTANCE.getValVarDef_Val();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.FunDefImpl <em>Fun Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.FunDefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunDef()
		 * @generated
		 */
		EClass FUN_DEF = eINSTANCE.getFunDef();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TypeDefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.TemplateStat <em>Template Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.TemplateStat
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateStat()
		 * @generated
		 */
		EClass TEMPLATE_STAT = eINSTANCE.getTemplateStat();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.SelfTypeImpl <em>Self Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.SelfTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSelfType()
		 * @generated
		 */
		EClass SELF_TYPE = eINSTANCE.getSelfType();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TupleTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__TYPES = eINSTANCE.getTupleType_Types();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.EarlyDefImpl <em>Early Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.EarlyDefImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getEarlyDef()
		 * @generated
		 */
		EClass EARLY_DEF = eINSTANCE.getEarlyDef();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.RefinementTypeImpl <em>Refinement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.RefinementTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getRefinementType()
		 * @generated
		 */
		EClass REFINEMENT_TYPE = eINSTANCE.getRefinementType();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.FunctionTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Param Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PARAM_TYPES = eINSTANCE.getFunctionType_ParamTypes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__RETURN_TYPE = eINSTANCE.getFunctionType_ReturnType();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ExpressionImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ExistentialTypeImpl <em>Existential Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ExistentialTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getExistentialType()
		 * @generated
		 */
		EClass EXISTENTIAL_TYPE = eINSTANCE.getExistentialType();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.FunctionSignatureImpl <em>Function Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.FunctionSignatureImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getFunctionSignature()
		 * @generated
		 */
		EClass FUNCTION_SIGNATURE = eINSTANCE.getFunctionSignature();

		/**
		 * The meta object literal for the '<em><b>Param Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_SIGNATURE__PARAM_TYPES = eINSTANCE.getFunctionSignature_ParamTypes();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.MemberImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TemplateSignatureImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTemplateSignature()
		 * @generated
		 */
		EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

		/**
		 * The meta object literal for the '<em><b>Member Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__MEMBER_SIGNATURES = eINSTANCE.getTemplateSignature_MemberSignatures();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.SignatureImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.TypedScalaElementImpl <em>Typed Scala Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.TypedScalaElementImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getTypedScalaElement()
		 * @generated
		 */
		EClass TYPED_SCALA_ELEMENT = eINSTANCE.getTypedScalaElement();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_SCALA_ELEMENT__SIGNATURE = eINSTANCE.getTypedScalaElement_Signature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_SCALA_ELEMENT__TYPE = eINSTANCE.getTypedScalaElement_Type();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_SCALA_ELEMENT__ANNOTATIONS = eINSTANCE.getTypedScalaElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_SCALA_ELEMENT__MODIFIERS = eINSTANCE.getTypedScalaElement_Modifiers();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassParamImpl <em>Class Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ClassParamImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClassParam()
		 * @generated
		 */
		EClass CLASS_PARAM = eINSTANCE.getClassParam();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PARAM__VAR = eINSTANCE.getClassParam_Var();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PARAM__DEFAULT = eINSTANCE.getClassParam_Default();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.SimpleTypeImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl <em>Class Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.seed.core.scalamodel.elements.impl.ClassParamListImpl
		 * @see com.github.seed.core.scalamodel.elements.impl.ScalaModelPackageImpl#getClassParamList()
		 * @generated
		 */
		EClass CLASS_PARAM_LIST = eINSTANCE.getClassParamList();

		/**
		 * The meta object literal for the '<em><b>Implicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PARAM_LIST__IMPLICIT = eINSTANCE.getClassParamList_Implicit();

		/**
		 * The meta object literal for the '<em><b>Class Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_PARAM_LIST__CLASS_PARAMS = eINSTANCE.getClassParamList_ClassParams();

	}

} //ScalaModelPackage
