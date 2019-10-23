/**
 */
package mowl.impl;

import mowl.ObjectProperty;
import mowl.ObjectPropertyAxiom;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectPropertyAxiomImpl#getObjectPropertyAxiom <em>Object Property Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectPropertyAxiomImpl extends OntologyAxiomImpl implements ObjectPropertyAxiom {
	/**
	 * The cached value of the '{@link #getObjectPropertyAxiom() <em>Object Property Axiom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyAxiom()
	 * @generated
	 * @ordered
	 */
	protected ObjectProperty objectPropertyAxiom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_PROPERTY_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty getObjectPropertyAxiom() {
		if (objectPropertyAxiom != null && objectPropertyAxiom.eIsProxy()) {
			InternalEObject oldObjectPropertyAxiom = (InternalEObject)objectPropertyAxiom;
			objectPropertyAxiom = (ObjectProperty)eResolveProxy(oldObjectPropertyAxiom);
			if (objectPropertyAxiom != oldObjectPropertyAxiom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM, oldObjectPropertyAxiom, objectPropertyAxiom));
			}
		}
		return objectPropertyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty basicGetObjectPropertyAxiom() {
		return objectPropertyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectPropertyAxiom(ObjectProperty newObjectPropertyAxiom, NotificationChain msgs) {
		ObjectProperty oldObjectPropertyAxiom = objectPropertyAxiom;
		objectPropertyAxiom = newObjectPropertyAxiom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM, oldObjectPropertyAxiom, newObjectPropertyAxiom);
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
			case mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM:
				if (objectPropertyAxiom != null)
					msgs = ((InternalEObject)objectPropertyAxiom).eInverseRemove(this, mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS, ObjectProperty.class, msgs);
				return basicSetObjectPropertyAxiom((ObjectProperty)otherEnd, msgs);
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
			case mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM:
				return basicSetObjectPropertyAxiom(null, msgs);
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
			case mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM:
				if (resolve) return getObjectPropertyAxiom();
				return basicGetObjectPropertyAxiom();
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
			case mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM:
				return objectPropertyAxiom != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyAxiomImpl
