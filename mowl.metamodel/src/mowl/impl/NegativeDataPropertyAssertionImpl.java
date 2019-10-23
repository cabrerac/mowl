/**
 */
package mowl.impl;

import mowl.Constant;
import mowl.DataPropertyExpression;
import mowl.NegativeDataPropertyAssertion;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.NegativeDataPropertyAssertionImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link mowl.impl.NegativeDataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeDataPropertyAssertionImpl extends AssertionImpl implements NegativeDataPropertyAssertion {
	/**
	 * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression dataPropertyExpressions;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Constant targetValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeDataPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.NEGATIVE_DATA_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getDataPropertyExpressions() {
		return dataPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPropertyExpressions(DataPropertyExpression newDataPropertyExpressions, NotificationChain msgs) {
		DataPropertyExpression oldDataPropertyExpressions = dataPropertyExpressions;
		dataPropertyExpressions = newDataPropertyExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS, oldDataPropertyExpressions, newDataPropertyExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPropertyExpressions(DataPropertyExpression newDataPropertyExpressions) {
		if (newDataPropertyExpressions != dataPropertyExpressions) {
			NotificationChain msgs = null;
			if (dataPropertyExpressions != null)
				msgs = ((InternalEObject)dataPropertyExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS, null, msgs);
			if (newDataPropertyExpressions != null)
				msgs = ((InternalEObject)newDataPropertyExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS, null, msgs);
			msgs = basicSetDataPropertyExpressions(newDataPropertyExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS, newDataPropertyExpressions, newDataPropertyExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (Constant)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(Constant newTargetValue) {
		Constant oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS:
				return basicSetDataPropertyExpressions(null, msgs);
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
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS:
				return getDataPropertyExpressions();
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS:
				setDataPropertyExpressions((DataPropertyExpression)newValue);
				return;
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Constant)newValue);
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
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS:
				setDataPropertyExpressions((DataPropertyExpression)null);
				return;
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Constant)null);
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
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS:
				return dataPropertyExpressions != null;
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				return targetValue != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeDataPropertyAssertionImpl
