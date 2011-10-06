/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.ClassParam;
import com.github.seed.core.scalamodel.elements.ClassParamList;
import com.github.seed.core.scalamodel.elements.CompilationUnit;
import com.github.seed.core.scalamodel.elements.Dcl;
import com.github.seed.core.scalamodel.elements.Def;
import com.github.seed.core.scalamodel.elements.EarlyDef;
import com.github.seed.core.scalamodel.elements.ExistentialType;
import com.github.seed.core.scalamodel.elements.Expression;
import com.github.seed.core.scalamodel.elements.FunDcl;
import com.github.seed.core.scalamodel.elements.FunDef;
import com.github.seed.core.scalamodel.elements.FunctionSignature;
import com.github.seed.core.scalamodel.elements.FunctionType;
import com.github.seed.core.scalamodel.elements.Import;
import com.github.seed.core.scalamodel.elements.Member;
import com.github.seed.core.scalamodel.elements.PackageDcl;
import com.github.seed.core.scalamodel.elements.PackageObject;
import com.github.seed.core.scalamodel.elements.Packaging;
import com.github.seed.core.scalamodel.elements.RefinementType;
import com.github.seed.core.scalamodel.elements.ScalaElement;
import com.github.seed.core.scalamodel.elements.ScalaModelFactory;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.SelfType;
import com.github.seed.core.scalamodel.elements.Signature;
import com.github.seed.core.scalamodel.elements.SimpleType;
import com.github.seed.core.scalamodel.elements.TemplateDef;
import com.github.seed.core.scalamodel.elements.TemplateSignature;
import com.github.seed.core.scalamodel.elements.Trait;
import com.github.seed.core.scalamodel.elements.TupleType;
import com.github.seed.core.scalamodel.elements.Type;
import com.github.seed.core.scalamodel.elements.TypeDcl;
import com.github.seed.core.scalamodel.elements.TypeDef;
import com.github.seed.core.scalamodel.elements.TypedScalaElement;
import com.github.seed.core.scalamodel.elements.ValVarDcl;
import com.github.seed.core.scalamodel.elements.ValVarDef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalaModelFactoryImpl extends EFactoryImpl implements ScalaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalaModelFactory init() {
		try {
			ScalaModelFactory theScalaModelFactory = (ScalaModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://com.github.seed/scalamodel/1.0"); 
			if (theScalaModelFactory != null) {
				return theScalaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScalaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScalaModelPackage.SCALA_ELEMENT: return createScalaElement();
			case ScalaModelPackage.TYPE: return createType();
			case ScalaModelPackage.TRAIT: return createTrait();
			case ScalaModelPackage.CLASS: return createClass();
			case ScalaModelPackage.OBJECT: return createObject();
			case ScalaModelPackage.PACKAGING: return createPackaging();
			case ScalaModelPackage.PACKAGE_OBJECT: return createPackageObject();
			case ScalaModelPackage.IMPORT: return createImport();
			case ScalaModelPackage.COMPILATION_UNIT: return createCompilationUnit();
			case ScalaModelPackage.DEF: return createDef();
			case ScalaModelPackage.DCL: return createDcl();
			case ScalaModelPackage.TEMPLATE_DEF: return createTemplateDef();
			case ScalaModelPackage.PACKAGE_DCL: return createPackageDcl();
			case ScalaModelPackage.TYPE_DCL: return createTypeDcl();
			case ScalaModelPackage.FUN_DCL: return createFunDcl();
			case ScalaModelPackage.VAL_VAR_DCL: return createValVarDcl();
			case ScalaModelPackage.VAL_VAR_DEF: return createValVarDef();
			case ScalaModelPackage.FUN_DEF: return createFunDef();
			case ScalaModelPackage.TYPE_DEF: return createTypeDef();
			case ScalaModelPackage.SELF_TYPE: return createSelfType();
			case ScalaModelPackage.TUPLE_TYPE: return createTupleType();
			case ScalaModelPackage.EARLY_DEF: return createEarlyDef();
			case ScalaModelPackage.REFINEMENT_TYPE: return createRefinementType();
			case ScalaModelPackage.FUNCTION_TYPE: return createFunctionType();
			case ScalaModelPackage.EXPRESSION: return createExpression();
			case ScalaModelPackage.EXISTENTIAL_TYPE: return createExistentialType();
			case ScalaModelPackage.FUNCTION_SIGNATURE: return createFunctionSignature();
			case ScalaModelPackage.MEMBER: return createMember();
			case ScalaModelPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case ScalaModelPackage.SIGNATURE: return createSignature();
			case ScalaModelPackage.TYPED_SCALA_ELEMENT: return createTypedScalaElement();
			case ScalaModelPackage.CLASS_PARAM: return createClassParam();
			case ScalaModelPackage.SIMPLE_TYPE: return createSimpleType();
			case ScalaModelPackage.CLASS_PARAM_LIST: return createClassParamList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaElement createScalaElement() {
		ScalaElementImpl scalaElement = new ScalaElementImpl();
		return scalaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trait createTrait() {
		TraitImpl trait = new TraitImpl();
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.seed.core.scalamodel.elements.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.seed.core.scalamodel.elements.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packaging createPackaging() {
		PackagingImpl packaging = new PackagingImpl();
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageObject createPackageObject() {
		PackageObjectImpl packageObject = new PackageObjectImpl();
		return packageObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Def createDef() {
		DefImpl def = new DefImpl();
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dcl createDcl() {
		DclImpl dcl = new DclImpl();
		return dcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDef createTemplateDef() {
		TemplateDefImpl templateDef = new TemplateDefImpl();
		return templateDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDcl createPackageDcl() {
		PackageDclImpl packageDcl = new PackageDclImpl();
		return packageDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDcl createTypeDcl() {
		TypeDclImpl typeDcl = new TypeDclImpl();
		return typeDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunDcl createFunDcl() {
		FunDclImpl funDcl = new FunDclImpl();
		return funDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValVarDcl createValVarDcl() {
		ValVarDclImpl valVarDcl = new ValVarDclImpl();
		return valVarDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValVarDef createValVarDef() {
		ValVarDefImpl valVarDef = new ValVarDefImpl();
		return valVarDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunDef createFunDef() {
		FunDefImpl funDef = new FunDefImpl();
		return funDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfType createSelfType() {
		SelfTypeImpl selfType = new SelfTypeImpl();
		return selfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyDef createEarlyDef() {
		EarlyDefImpl earlyDef = new EarlyDefImpl();
		return earlyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType createRefinementType() {
		RefinementTypeImpl refinementType = new RefinementTypeImpl();
		return refinementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistentialType createExistentialType() {
		ExistentialTypeImpl existentialType = new ExistentialTypeImpl();
		return existentialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionSignature createFunctionSignature() {
		FunctionSignatureImpl functionSignature = new FunctionSignatureImpl();
		return functionSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createTemplateSignature() {
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedScalaElement createTypedScalaElement() {
		TypedScalaElementImpl typedScalaElement = new TypedScalaElementImpl();
		return typedScalaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassParam createClassParam() {
		ClassParamImpl classParam = new ClassParamImpl();
		return classParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassParamList createClassParamList() {
		ClassParamListImpl classParamList = new ClassParamListImpl();
		return classParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaModelPackage getScalaModelPackage() {
		return (ScalaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScalaModelPackage getPackage() {
		return ScalaModelPackage.eINSTANCE;
	}

} //ScalaModelFactoryImpl
