/**
 */
package mowl.impl;

import mowl.LinkProperty;
import mowl.LinkPropertyAxiom;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkPropertyAxiomImpl#getLinkProperty <em>Link Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkPropertyAxiomImpl extends MultiontologyAxiomImpl implements LinkPropertyAxiom {
	/**
	 * The cached value of the '{@link #getLinkProperty() <em>Link Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkProperty()
	 * @generated
	 * @ordered
	 */
	protected LinkProperty linkProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPropertyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_PROPERTY_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty getLinkProperty() {
		if (linkProperty != null && linkProperty.eIsProxy()) {
			InternalEObject oldLinkProperty = (InternalEObject)linkProperty;
			linkProperty = (LinkProperty)eResolveProxy(oldLinkProperty);
			if (linkProperty != oldLinkProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY, oldLinkProperty, linkProperty));
			}
		}
		return linkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty basicGetLinkProperty() {
		return linkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkProperty(LinkProperty newLinkProperty, NotificationChain msgs) {
		LinkProperty oldLinkProperty = linkProperty;
		linkProperty = newLinkProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY, oldLinkProperty, newLinkProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY:
				if (linkProperty != null)
					msgs = ((InternalEObject)linkProperty).eInverseRemove(this, mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS, LinkProperty.class, msgs);
				return basicSetLinkProperty((LinkProperty)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY:
				return basicSetLinkProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY:
				if (resolve) return getLinkProperty();
				return basicGetLinkProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY:
				return linkProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkPropertyAxiomImpl
