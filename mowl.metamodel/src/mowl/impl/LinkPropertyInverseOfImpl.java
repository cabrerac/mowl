/**
 */
package mowl.impl;

import mowl.LinkProperty;
import mowl.LinkPropertyInverseOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Property Inverse Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkPropertyInverseOfImpl#getInverseLinkPropertyOf <em>Inverse Link Property Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPropertyInverseOfImpl extends LinkPropertyExpressionImpl implements LinkPropertyInverseOf {
	/**
	 * The cached value of the '{@link #getInverseLinkPropertyOf() <em>Inverse Link Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseLinkPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected LinkProperty inverseLinkPropertyOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPropertyInverseOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_PROPERTY_INVERSE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty getInverseLinkPropertyOf() {
		if (inverseLinkPropertyOf != null && inverseLinkPropertyOf.eIsProxy()) {
			InternalEObject oldInverseLinkPropertyOf = (InternalEObject)inverseLinkPropertyOf;
			inverseLinkPropertyOf = (LinkProperty)eResolveProxy(oldInverseLinkPropertyOf);
			if (inverseLinkPropertyOf != oldInverseLinkPropertyOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF, oldInverseLinkPropertyOf, inverseLinkPropertyOf));
			}
		}
		return inverseLinkPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty basicGetInverseLinkPropertyOf() {
		return inverseLinkPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseLinkPropertyOf(LinkProperty newInverseLinkPropertyOf) {
		LinkProperty oldInverseLinkPropertyOf = inverseLinkPropertyOf;
		inverseLinkPropertyOf = newInverseLinkPropertyOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF, oldInverseLinkPropertyOf, inverseLinkPropertyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF:
				if (resolve) return getInverseLinkPropertyOf();
				return basicGetInverseLinkPropertyOf();
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
			case mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF:
				setInverseLinkPropertyOf((LinkProperty)newValue);
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
			case mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF:
				setInverseLinkPropertyOf((LinkProperty)null);
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
			case mowlPackage.LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF:
				return inverseLinkPropertyOf != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkPropertyInverseOfImpl
