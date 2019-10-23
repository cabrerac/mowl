/**
 */
package mowl.impl;

import mowl.LinkHasValue;
import mowl.LinkProperty;
import mowl.NamedIndividual;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkHasValueImpl#getLinkProperties <em>Link Properties</em>}</li>
 *   <li>{@link mowl.impl.LinkHasValueImpl#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkHasValueImpl extends EConnectionExpressionImpl implements LinkHasValue {
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
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected NamedIndividual individual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_HAS_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES, oldLinkProperties, linkProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES, oldLinkProperties, linkProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual getIndividual() {
		if (individual != null && individual.eIsProxy()) {
			InternalEObject oldIndividual = (InternalEObject)individual;
			individual = (NamedIndividual)eResolveProxy(oldIndividual);
			if (individual != oldIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_HAS_VALUE__INDIVIDUAL, oldIndividual, individual));
			}
		}
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual basicGetIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(NamedIndividual newIndividual) {
		NamedIndividual oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_HAS_VALUE__INDIVIDUAL, oldIndividual, individual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES:
				if (resolve) return getLinkProperties();
				return basicGetLinkProperties();
			case mowlPackage.LINK_HAS_VALUE__INDIVIDUAL:
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
			case mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES:
				setLinkProperties((LinkProperty)newValue);
				return;
			case mowlPackage.LINK_HAS_VALUE__INDIVIDUAL:
				setIndividual((NamedIndividual)newValue);
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
			case mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES:
				setLinkProperties((LinkProperty)null);
				return;
			case mowlPackage.LINK_HAS_VALUE__INDIVIDUAL:
				setIndividual((NamedIndividual)null);
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
			case mowlPackage.LINK_HAS_VALUE__LINK_PROPERTIES:
				return linkProperties != null;
			case mowlPackage.LINK_HAS_VALUE__INDIVIDUAL:
				return individual != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkHasValueImpl
