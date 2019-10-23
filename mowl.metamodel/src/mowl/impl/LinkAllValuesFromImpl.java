/**
 */
package mowl.impl;

import mowl.LinkAllValuesFrom;
import mowl.LinkProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkAllValuesFromImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.impl.LinkAllValuesFromImpl#getLinkProperties <em>Link Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkAllValuesFromImpl extends EConnectionExpressionImpl implements LinkAllValuesFrom {
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
	 * The cached value of the '{@link #getLinkProperties() <em>Link Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkProperties()
	 * @generated
	 * @ordered
	 */
	protected LinkProperty linkProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_ALL_VALUES_FROM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_ALL_VALUES_FROM__CLASSES, oldClasses, classes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_ALL_VALUES_FROM__CLASSES, oldClasses, classes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty getLinkProperties() {
		if (linkProperties != null && linkProperties.eIsProxy()) {
			InternalEObject oldLinkProperties = (InternalEObject)linkProperties;
			linkProperties = (LinkProperty)eResolveProxy(oldLinkProperties);
			if (linkProperties != oldLinkProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES, oldLinkProperties, linkProperties));
			}
		}
		return linkProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty basicGetLinkProperties() {
		return linkProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkProperties(LinkProperty newLinkProperties) {
		LinkProperty oldLinkProperties = linkProperties;
		linkProperties = newLinkProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES, oldLinkProperties, linkProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.LINK_ALL_VALUES_FROM__CLASSES:
				if (resolve) return getClasses();
				return basicGetClasses();
			case mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES:
				if (resolve) return getLinkProperties();
				return basicGetLinkProperties();
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
			case mowlPackage.LINK_ALL_VALUES_FROM__CLASSES:
				setClasses((mowl.Class)newValue);
				return;
			case mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES:
				setLinkProperties((LinkProperty)newValue);
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
			case mowlPackage.LINK_ALL_VALUES_FROM__CLASSES:
				setClasses((mowl.Class)null);
				return;
			case mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES:
				setLinkProperties((LinkProperty)null);
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
			case mowlPackage.LINK_ALL_VALUES_FROM__CLASSES:
				return classes != null;
			case mowlPackage.LINK_ALL_VALUES_FROM__LINK_PROPERTIES:
				return linkProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkAllValuesFromImpl
