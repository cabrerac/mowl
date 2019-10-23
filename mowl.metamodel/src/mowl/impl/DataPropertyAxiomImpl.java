/**
 */
package mowl.impl;

import mowl.DataProperty;
import mowl.DataPropertyAxiom;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataPropertyAxiomImpl#getDataPropertyAxiom <em>Data Property Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataPropertyAxiomImpl extends OntologyAxiomImpl implements DataPropertyAxiom {
	/**
	 * The cached value of the '{@link #getDataPropertyAxiom() <em>Data Property Axiom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyAxiom()
	 * @generated
	 * @ordered
	 */
	protected DataProperty dataPropertyAxiom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_PROPERTY_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getDataPropertyAxiom() {
		if (dataPropertyAxiom != null && dataPropertyAxiom.eIsProxy()) {
			InternalEObject oldDataPropertyAxiom = (InternalEObject)dataPropertyAxiom;
			dataPropertyAxiom = (DataProperty)eResolveProxy(oldDataPropertyAxiom);
			if (dataPropertyAxiom != oldDataPropertyAxiom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM, oldDataPropertyAxiom, dataPropertyAxiom));
			}
		}
		return dataPropertyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty basicGetDataPropertyAxiom() {
		return dataPropertyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPropertyAxiom(DataProperty newDataPropertyAxiom, NotificationChain msgs) {
		DataProperty oldDataPropertyAxiom = dataPropertyAxiom;
		dataPropertyAxiom = newDataPropertyAxiom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM, oldDataPropertyAxiom, newDataPropertyAxiom);
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
			case mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM:
				if (dataPropertyAxiom != null)
					msgs = ((InternalEObject)dataPropertyAxiom).eInverseRemove(this, mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS, DataProperty.class, msgs);
				return basicSetDataPropertyAxiom((DataProperty)otherEnd, msgs);
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
			case mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM:
				return basicSetDataPropertyAxiom(null, msgs);
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
			case mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM:
				if (resolve) return getDataPropertyAxiom();
				return basicGetDataPropertyAxiom();
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
			case mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM:
				return dataPropertyAxiom != null;
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyAxiomImpl
