/**
 */
package mowl.impl;

import mowl.Individual;
import mowl.NegativeObjectPropertyAssertion;
import mowl.ObjectPropertyExpression;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.NegativeObjectPropertyAssertionImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 *   <li>{@link mowl.impl.NegativeObjectPropertyAssertionImpl#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeObjectPropertyAssertionImpl extends AssertionImpl implements NegativeObjectPropertyAssertion {
	/**
	 * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression objectPropertyExpressions;

	/**
	 * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual targetIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeObjectPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getObjectPropertyExpressions() {
		return objectPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectPropertyExpressions(ObjectPropertyExpression newObjectPropertyExpressions, NotificationChain msgs) {
		ObjectPropertyExpression oldObjectPropertyExpressions = objectPropertyExpressions;
		objectPropertyExpressions = newObjectPropertyExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS, oldObjectPropertyExpressions, newObjectPropertyExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPropertyExpressions(ObjectPropertyExpression newObjectPropertyExpressions) {
		if (newObjectPropertyExpressions != objectPropertyExpressions) {
			NotificationChain msgs = null;
			if (objectPropertyExpressions != null)
				msgs = ((InternalEObject)objectPropertyExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS, null, msgs);
			if (newObjectPropertyExpressions != null)
				msgs = ((InternalEObject)newObjectPropertyExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS, null, msgs);
			msgs = basicSetObjectPropertyExpressions(newObjectPropertyExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS, newObjectPropertyExpressions, newObjectPropertyExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getTargetIndividual() {
		if (targetIndividual != null && targetIndividual.eIsProxy()) {
			InternalEObject oldTargetIndividual = (InternalEObject)targetIndividual;
			targetIndividual = (Individual)eResolveProxy(oldTargetIndividual);
			if (targetIndividual != oldTargetIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
			}
		}
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetTargetIndividual() {
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIndividual(Individual newTargetIndividual) {
		Individual oldTargetIndividual = targetIndividual;
		targetIndividual = newTargetIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS:
				return basicSetObjectPropertyExpressions(null, msgs);
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
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS:
				return getObjectPropertyExpressions();
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				if (resolve) return getTargetIndividual();
				return basicGetTargetIndividual();
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
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS:
				setObjectPropertyExpressions((ObjectPropertyExpression)newValue);
				return;
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)newValue);
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
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS:
				setObjectPropertyExpressions((ObjectPropertyExpression)null);
				return;
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)null);
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
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS:
				return objectPropertyExpressions != null;
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return targetIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeObjectPropertyAssertionImpl
