/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.DataPropertyExpression;
import mowl.SubDataPropertyOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.SubDataPropertyOfImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubDataPropertyOfImpl extends DataPropertyAxiomImpl implements SubDataPropertyOf {
	/**
	 * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyExpression> dataPropertyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubDataPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.SUB_DATA_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyExpression> getDataPropertyExpressions() {
		if (dataPropertyExpressions == null) {
			dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS);
		}
		return dataPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS:
				return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS:
				return getDataPropertyExpressions();
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
			case mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS:
				getDataPropertyExpressions().clear();
				getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
			case mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS:
				getDataPropertyExpressions().clear();
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
			case mowlPackage.SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS:
				return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubDataPropertyOfImpl
