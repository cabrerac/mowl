/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.EquivalentObjectProperty;
import mowl.ObjectPropertyExpression;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.EquivalentObjectPropertyImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentObjectPropertyImpl extends ObjectPropertyAxiomImpl implements EquivalentObjectProperty {
	/**
	 * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyExpression> objectPropertyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.EQUIVALENT_OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyExpression> getObjectPropertyExpressions() {
		if (objectPropertyExpressions == null) {
			objectPropertyExpressions = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS);
		}
		return objectPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS:
				return ((InternalEList<?>)getObjectPropertyExpressions()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS:
				return getObjectPropertyExpressions();
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
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS:
				getObjectPropertyExpressions().clear();
				getObjectPropertyExpressions().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS:
				getObjectPropertyExpressions().clear();
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
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS:
				return objectPropertyExpressions != null && !objectPropertyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquivalentObjectPropertyImpl
