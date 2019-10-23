/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.LinkProperty;
import mowl.LinkPropertyList;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Property List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkPropertyListImpl#getLinksProperty <em>Links Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPropertyListImpl extends LinkPropertyExpressionImpl implements LinkPropertyList {
	/**
	 * The cached value of the '{@link #getLinksProperty() <em>Links Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkProperty> linksProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPropertyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_PROPERTY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkProperty> getLinksProperty() {
		if (linksProperty == null) {
			linksProperty = new EObjectResolvingEList<LinkProperty>(LinkProperty.class, this, mowlPackage.LINK_PROPERTY_LIST__LINKS_PROPERTY);
		}
		return linksProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.LINK_PROPERTY_LIST__LINKS_PROPERTY:
				return getLinksProperty();
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
			case mowlPackage.LINK_PROPERTY_LIST__LINKS_PROPERTY:
				getLinksProperty().clear();
				getLinksProperty().addAll((Collection<? extends LinkProperty>)newValue);
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
			case mowlPackage.LINK_PROPERTY_LIST__LINKS_PROPERTY:
				getLinksProperty().clear();
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
			case mowlPackage.LINK_PROPERTY_LIST__LINKS_PROPERTY:
				return linksProperty != null && !linksProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkPropertyListImpl
