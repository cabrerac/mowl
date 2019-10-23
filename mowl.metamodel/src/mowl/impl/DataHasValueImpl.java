/**
 */
package mowl.impl;

import mowl.Constant;
import mowl.DataHasValue;
import mowl.DataProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataHasValueImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.impl.DataHasValueImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataHasValueImpl extends ClassExpressionImpl implements DataHasValue {
	/**
	 * The cached value of the '{@link #getDataProperties() <em>Data Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperties()
	 * @generated
	 * @ordered
	 */
	protected DataProperty dataProperties;

	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected Constant literals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_HAS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getDataProperties() {
		if (dataProperties != null && dataProperties.eIsProxy()) {
			InternalEObject oldDataProperties = (InternalEObject)dataProperties;
			dataProperties = (DataProperty)eResolveProxy(oldDataProperties);
			if (dataProperties != oldDataProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES, oldDataProperties, dataProperties));
			}
		}
		return dataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty basicGetDataProperties() {
		return dataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProperties(DataProperty newDataProperties) {
		DataProperty oldDataProperties = dataProperties;
		dataProperties = newDataProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES, oldDataProperties, dataProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getLiterals() {
		if (literals != null && literals.eIsProxy()) {
			InternalEObject oldLiterals = (InternalEObject)literals;
			literals = (Constant)eResolveProxy(oldLiterals);
			if (literals != oldLiterals) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.DATA_HAS_VALUE__LITERALS, oldLiterals, literals));
			}
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetLiterals() {
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiterals(Constant newLiterals) {
		Constant oldLiterals = literals;
		literals = newLiterals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_HAS_VALUE__LITERALS, oldLiterals, literals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES:
				if (resolve) return getDataProperties();
				return basicGetDataProperties();
			case mowlPackage.DATA_HAS_VALUE__LITERALS:
				if (resolve) return getLiterals();
				return basicGetLiterals();
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
			case mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES:
				setDataProperties((DataProperty)newValue);
				return;
			case mowlPackage.DATA_HAS_VALUE__LITERALS:
				setLiterals((Constant)newValue);
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
			case mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES:
				setDataProperties((DataProperty)null);
				return;
			case mowlPackage.DATA_HAS_VALUE__LITERALS:
				setLiterals((Constant)null);
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
			case mowlPackage.DATA_HAS_VALUE__DATA_PROPERTIES:
				return dataProperties != null;
			case mowlPackage.DATA_HAS_VALUE__LITERALS:
				return literals != null;
		}
		return super.eIsSet(featureID);
	}

} //DataHasValueImpl
