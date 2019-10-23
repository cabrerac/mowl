/**
 */
package mowl.impl;

import mowl.InverseObjectPropertyAxiom;
import mowl.ObjectProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.InverseObjectPropertyAxiomImpl#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverseObjectPropertyAxiomImpl extends ObjectPropertyAxiomImpl implements InverseObjectPropertyAxiom {
	/**
	 * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectProperty objectProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseObjectPropertyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.INVERSE_OBJECT_PROPERTY_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty getObjectProperty() {
		if (objectProperty != null && objectProperty.eIsProxy()) {
			InternalEObject oldObjectProperty = (InternalEObject)objectProperty;
			objectProperty = (ObjectProperty)eResolveProxy(oldObjectProperty);
			if (objectProperty != oldObjectProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY, oldObjectProperty, objectProperty));
			}
		}
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty basicGetObjectProperty() {
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectProperty(ObjectProperty newObjectProperty) {
		ObjectProperty oldObjectProperty = objectProperty;
		objectProperty = newObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY, oldObjectProperty, objectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY:
				if (resolve) return getObjectProperty();
				return basicGetObjectProperty();
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
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
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY:
				return objectProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //InverseObjectPropertyAxiomImpl
