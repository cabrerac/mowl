/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.LinkPropertyExpression;
import mowl.SubLinkPropertyOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Link Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.SubLinkPropertyOfImpl#getLinkPropertyExpressions <em>Link Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubLinkPropertyOfImpl extends LinkPropertyAxiomImpl implements SubLinkPropertyOf {
	/**
	 * The cached value of the '{@link #getLinkPropertyExpressions() <em>Link Property Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkPropertyExpression> linkPropertyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLinkPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.SUB_LINK_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkPropertyExpression> getLinkPropertyExpressions() {
		if (linkPropertyExpressions == null) {
			linkPropertyExpressions = new EObjectContainmentEList<LinkPropertyExpression>(LinkPropertyExpression.class, this, mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS);
		}
		return linkPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS:
				return ((InternalEList<?>)getLinkPropertyExpressions()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS:
				return getLinkPropertyExpressions();
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
			case mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS:
				getLinkPropertyExpressions().clear();
				getLinkPropertyExpressions().addAll((Collection<? extends LinkPropertyExpression>)newValue);
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
			case mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS:
				getLinkPropertyExpressions().clear();
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
			case mowlPackage.SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS:
				return linkPropertyExpressions != null && !linkPropertyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubLinkPropertyOfImpl
