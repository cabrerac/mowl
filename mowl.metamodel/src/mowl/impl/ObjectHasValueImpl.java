/**
 */
package mowl.impl;

import mowl.Individual;
import mowl.ObjectHasValue;
import mowl.ObjectProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectHasValueImpl#getObjectProperties <em>Object Properties</em>}</li>
 *   <li>{@link mowl.impl.ObjectHasValueImpl#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectHasValueImpl extends ClassExpressionImpl implements ObjectHasValue {
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
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual individual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_HAS_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividual() {
		if (individual != null && individual.eIsProxy()) {
			InternalEObject oldIndividual = (InternalEObject)individual;
			individual = (Individual)eResolveProxy(oldIndividual);
			if (individual != oldIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL, oldIndividual, individual));
			}
		}
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Individual newIndividual) {
		Individual oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL, oldIndividual, individual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES:
				if (resolve) return getObjectProperties();
				return basicGetObjectProperties();
			case mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
				if (resolve) return getIndividual();
				return basicGetIndividual();
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
			case mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES:
				setObjectProperties((ObjectProperty)newValue);
				return;
			case mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
				setIndividual((Individual)newValue);
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
			case mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES:
				setObjectProperties((ObjectProperty)null);
				return;
			case mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
				setIndividual((Individual)null);
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
			case mowlPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTIES:
				return objectProperties != null;
			case mowlPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
				return individual != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectHasValueImpl
