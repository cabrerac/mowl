/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.DataProperty;
import mowl.DataPropertyList;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataPropertyListImpl#getDataProperties <em>Data Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyListImpl extends DataPropertyExpressionImpl implements DataPropertyList {
	/**
	 * The cached value of the '{@link #getDataProperties() <em>Data Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> dataProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_PROPERTY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDataProperties() {
		if (dataProperties == null) {
			dataProperties = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, mowlPackage.DATA_PROPERTY_LIST__DATA_PROPERTIES);
		}
		return dataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.DATA_PROPERTY_LIST__DATA_PROPERTIES:
				return getDataProperties();
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
			case mowlPackage.DATA_PROPERTY_LIST__DATA_PROPERTIES:
				getDataProperties().clear();
				getDataProperties().addAll((Collection<? extends DataProperty>)newValue);
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
			case mowlPackage.DATA_PROPERTY_LIST__DATA_PROPERTIES:
				getDataProperties().clear();
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
			case mowlPackage.DATA_PROPERTY_LIST__DATA_PROPERTIES:
				return dataProperties != null && !dataProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyListImpl
