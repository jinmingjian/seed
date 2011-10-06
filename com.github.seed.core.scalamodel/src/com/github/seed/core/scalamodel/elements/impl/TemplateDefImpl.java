/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.seed.core.scalamodel.elements.impl;

import com.github.seed.core.scalamodel.elements.EarlyDef;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.SelfType;
import com.github.seed.core.scalamodel.elements.TemplateDef;
import com.github.seed.core.scalamodel.elements.TemplateStat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl#getTemplateStats <em>Template Stats</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl#getEarlyDef <em>Early Def</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl#getSelfType <em>Self Type</em>}</li>
 *   <li>{@link com.github.seed.core.scalamodel.elements.impl.TemplateDefImpl#isCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateDefImpl extends TypedScalaElementImpl implements TemplateDef {
	/**
	 * The cached value of the '{@link #getTemplateStats() <em>Template Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateStats()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateStat> templateStats;

	/**
	 * The cached value of the '{@link #getEarlyDef() <em>Early Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyDef()
	 * @generated
	 * @ordered
	 */
	protected EarlyDef earlyDef;

	/**
	 * The cached value of the '{@link #getSelfType() <em>Self Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfType()
	 * @generated
	 * @ordered
	 */
	protected SelfType selfType;

	/**
	 * The default value of the '{@link #isCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCase()
	 * @generated
	 * @ordered
	 */
	protected boolean case_ = CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaModelPackage.Literals.TEMPLATE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateStat> getTemplateStats() {
		if (templateStats == null) {
			templateStats = new EObjectContainmentEList<TemplateStat>(TemplateStat.class, this, ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS);
		}
		return templateStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyDef getEarlyDef() {
		if (earlyDef != null && earlyDef.eIsProxy()) {
			InternalEObject oldEarlyDef = (InternalEObject)earlyDef;
			earlyDef = (EarlyDef)eResolveProxy(oldEarlyDef);
			if (earlyDef != oldEarlyDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF, oldEarlyDef, earlyDef));
			}
		}
		return earlyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyDef basicGetEarlyDef() {
		return earlyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyDef(EarlyDef newEarlyDef) {
		EarlyDef oldEarlyDef = earlyDef;
		earlyDef = newEarlyDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF, oldEarlyDef, earlyDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfType getSelfType() {
		if (selfType != null && selfType.eIsProxy()) {
			InternalEObject oldSelfType = (InternalEObject)selfType;
			selfType = (SelfType)eResolveProxy(oldSelfType);
			if (selfType != oldSelfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE, oldSelfType, selfType));
			}
		}
		return selfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfType basicGetSelfType() {
		return selfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfType(SelfType newSelfType) {
		SelfType oldSelfType = selfType;
		selfType = newSelfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE, oldSelfType, selfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(boolean newCase) {
		boolean oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalaModelPackage.TEMPLATE_DEF__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS:
				return ((InternalEList<?>)getTemplateStats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS:
				return getTemplateStats();
			case ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF:
				if (resolve) return getEarlyDef();
				return basicGetEarlyDef();
			case ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE:
				if (resolve) return getSelfType();
				return basicGetSelfType();
			case ScalaModelPackage.TEMPLATE_DEF__CASE:
				return isCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS:
				getTemplateStats().clear();
				getTemplateStats().addAll((Collection<? extends TemplateStat>)newValue);
				return;
			case ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF:
				setEarlyDef((EarlyDef)newValue);
				return;
			case ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE:
				setSelfType((SelfType)newValue);
				return;
			case ScalaModelPackage.TEMPLATE_DEF__CASE:
				setCase((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS:
				getTemplateStats().clear();
				return;
			case ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF:
				setEarlyDef((EarlyDef)null);
				return;
			case ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE:
				setSelfType((SelfType)null);
				return;
			case ScalaModelPackage.TEMPLATE_DEF__CASE:
				setCase(CASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalaModelPackage.TEMPLATE_DEF__TEMPLATE_STATS:
				return templateStats != null && !templateStats.isEmpty();
			case ScalaModelPackage.TEMPLATE_DEF__EARLY_DEF:
				return earlyDef != null;
			case ScalaModelPackage.TEMPLATE_DEF__SELF_TYPE:
				return selfType != null;
			case ScalaModelPackage.TEMPLATE_DEF__CASE:
				return case_ != CASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (case: ");
		result.append(case_);
		result.append(')');
		return result.toString();
	}

} //TemplateDefImpl
