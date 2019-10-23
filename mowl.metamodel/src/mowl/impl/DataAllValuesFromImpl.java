/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Constant;
import mowl.DataAllValuesFrom;
import mowl.DataProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataAllValuesFromImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.impl.DataAllValuesFromImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAllValuesFromImpl extends ClassExpressionImpl implements DataAllValuesFrom {
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
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> literals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_ALL_VALUES_FROM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES, oldDataProperties, dataProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES, oldDataProperties, dataProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getLiterals() {
		if (literals == null) {
			literals = new EObjectResolvingEList<Constant>(Constant.class, this, mowlPackage.DATA_ALL_VALUES_FROM__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES:
				if (resolve) return getDataProperties();
				return basicGetDataProperties();
			case mowlPackage.DATA_ALL_VALUES_FROM__LITERALS:
				return getLiterals();
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
			case mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES:
				setDataProperties((DataProperty)newValue);
				return;
			case mowlPackage.DATA_ALL_VALUES_FROM__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends Constant>)newValue);
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
			case mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES:
				setDataProperties((DataProperty)null);
				return;
			case mowlPackage.DATA_ALL_VALUES_FROM__LITERALS:
				getLiterals().clear();
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
			case mowlPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTIES:
				return dataProperties != null;
			case mowlPackage.DATA_ALL_VALUES_FROM__LITERALS:
				return literals != null && !literals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataAllValuesFromImpl
