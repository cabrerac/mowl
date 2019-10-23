/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.ObjectProperty;
import mowl.ObjectPropertyList;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectPropertyListImpl#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyListImpl extends ObjectPropertyExpressionImpl implements ObjectPropertyList {
	/**
	 * The cached value of the '{@link #getObjectProperties() <em>Object Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> objectProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_PROPERTY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getObjectProperties() {
		if (objectProperties == null) {
			objectProperties = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, mowlPackage.OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES);
		}
		return objectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES:
				return getObjectProperties();
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
			case mowlPackage.OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES:
				getObjectProperties().clear();
				getObjectProperties().addAll((Collection<? extends ObjectProperty>)newValue);
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
			case mowlPackage.OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES:
				getObjectProperties().clear();
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
			case mowlPackage.OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES:
				return objectProperties != null && !objectProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyListImpl
