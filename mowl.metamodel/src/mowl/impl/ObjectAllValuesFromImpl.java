/**
 */
package mowl.impl;

import mowl.ObjectAllValuesFrom;
import mowl.ObjectProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectAllValuesFromImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.impl.ObjectAllValuesFromImpl#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAllValuesFromImpl extends ClassExpressionImpl implements ObjectAllValuesFrom {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected mowl.Class classes;

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
	protected ObjectAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class getClasses() {
		if (classes != null && classes.eIsProxy()) {
			InternalEObject oldClasses = (InternalEObject)classes;
			classes = (mowl.Class)eResolveProxy(oldClasses);
			if (classes != oldClasses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES, oldClasses, classes));
			}
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class basicGetClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(mowl.Class newClasses) {
		mowl.Class oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES, oldClasses, classes));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES, oldObjectProperties, objectProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES:
				if (resolve) return getClasses();
				return basicGetClasses();
			case mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES:
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
			case mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES:
				setClasses((mowl.Class)newValue);
				return;
			case mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES:
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
			case mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES:
				setClasses((mowl.Class)null);
				return;
			case mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES:
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
			case mowlPackage.OBJECT_ALL_VALUES_FROM__CLASSES:
				return classes != null;
			case mowlPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES:
				return objectProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectAllValuesFromImpl
