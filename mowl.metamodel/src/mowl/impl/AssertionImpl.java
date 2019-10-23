/**
 */
package mowl.impl;

import mowl.Assertion;
import mowl.Individual;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.AssertionImpl#getIndividualAssertion <em>Individual Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AssertionImpl extends OntologyAxiomImpl implements Assertion {
	/**
	 * The cached value of the '{@link #getIndividualAssertion() <em>Individual Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualAssertion()
	 * @generated
	 * @ordered
	 */
	protected Individual individualAssertion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividualAssertion() {
		if (individualAssertion != null && individualAssertion.eIsProxy()) {
			InternalEObject oldIndividualAssertion = (InternalEObject)individualAssertion;
			individualAssertion = (Individual)eResolveProxy(oldIndividualAssertion);
			if (individualAssertion != oldIndividualAssertion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION, oldIndividualAssertion, individualAssertion));
			}
		}
		return individualAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetIndividualAssertion() {
		return individualAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualAssertion(Individual newIndividualAssertion, NotificationChain msgs) {
		Individual oldIndividualAssertion = individualAssertion;
		individualAssertion = newIndividualAssertion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION, oldIndividualAssertion, newIndividualAssertion);
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
			case mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION:
				if (individualAssertion != null)
					msgs = ((InternalEObject)individualAssertion).eInverseRemove(this, mowlPackage.INDIVIDUAL__INDIVIDUAL_ASSERTIONS, Individual.class, msgs);
				return basicSetIndividualAssertion((Individual)otherEnd, msgs);
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
			case mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION:
				return basicSetIndividualAssertion(null, msgs);
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
			case mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION:
				if (resolve) return getIndividualAssertion();
				return basicGetIndividualAssertion();
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
			case mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION:
				return individualAssertion != null;
		}
		return super.eIsSet(featureID);
	}

} //AssertionImpl
