/**
 */
package mowl.impl;

import mowl.InverseObjectProperty;
import mowl.ObjectProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.InverseObjectPropertyImpl#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverseObjectPropertyImpl extends ObjectPropertyExpressionImpl implements InverseObjectProperty {
	/**
	 * The cached value of the '{@link #getObjectProperties() <em>Object Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperties()
	 * @generated
	 * @ordered
	 */
	protected ObjectProperty objectProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.INVERSE_OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty getObjectProperties() {
		if (objectProperties != null && objectProperties.eIsProxy()) {
			InternalEObject oldObjectProperties = (InternalEObject)objectProperties;
			objectProperties = (ObjectProperty)eResolveProxy(oldObjectProperties);
			if (objectProperties != oldObjectProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
			}
		}
		return objectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty basicGetObjectProperties() {
		return objectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectProperties(ObjectProperty newObjectProperties) {
		ObjectProperty oldObjectProperties = objectProperties;
		objectProperties = newObjectProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES:
				if (resolve) return getObjectProperties();
				return basicGetObjectProperties();
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES:
				setObjectProperties((ObjectProperty)newValue);
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES:
				setObjectProperties((ObjectProperty)null);
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES:
				return objectProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //InverseObjectPropertyImpl
