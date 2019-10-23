/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Constant;
import mowl.DataExactCardinality;
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
 * An implementation of the model object '<em><b>Data Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataExactCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link mowl.impl.DataExactCardinalityImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.impl.DataExactCardinalityImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataExactCardinalityImpl extends ClassExpressionImpl implements DataExactCardinality {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

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
	protected DataExactCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_EXACT_CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_EXACT_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES, oldDataProperties, dataProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES, oldDataProperties, dataProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getLiterals() {
		if (literals == null) {
			literals = new EObjectResolvingEList<Constant>(Constant.class, this, mowlPackage.DATA_EXACT_CARDINALITY__LITERALS);
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
			case mowlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
				return getCardinality();
			case mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES:
				if (resolve) return getDataProperties();
				return basicGetDataProperties();
			case mowlPackage.DATA_EXACT_CARDINALITY__LITERALS:
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
			case mowlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES:
				setDataProperties((DataProperty)newValue);
				return;
			case mowlPackage.DATA_EXACT_CARDINALITY__LITERALS:
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
			case mowlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES:
				setDataProperties((DataProperty)null);
				return;
			case mowlPackage.DATA_EXACT_CARDINALITY__LITERALS:
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
			case mowlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case mowlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTIES:
				return dataProperties != null;
			case mowlPackage.DATA_EXACT_CARDINALITY__LITERALS:
				return literals != null && !literals.isEmpty();
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //DataExactCardinalityImpl
