/**
 */
package mowl.impl;

import mowl.ClassAxiom;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ClassAxiomImpl#getClassAxiom <em>Class Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassAxiomImpl extends OntologyAxiomImpl implements ClassAxiom {
	/**
	 * The cached value of the '{@link #getClassAxiom() <em>Class Axiom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassAxiom()
	 * @generated
	 * @ordered
	 */
	protected mowl.Class classAxiom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.CLASS_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class getClassAxiom() {
		if (classAxiom != null && classAxiom.eIsProxy()) {
			InternalEObject oldClassAxiom = (InternalEObject)classAxiom;
			classAxiom = (mowl.Class)eResolveProxy(oldClassAxiom);
			if (classAxiom != oldClassAxiom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.CLASS_AXIOM__CLASS_AXIOM, oldClassAxiom, classAxiom));
			}
		}
		return classAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class basicGetClassAxiom() {
		return classAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassAxiom(mowl.Class newClassAxiom, NotificationChain msgs) {
		mowl.Class oldClassAxiom = classAxiom;
		classAxiom = newClassAxiom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mowlPackage.CLASS_AXIOM__CLASS_AXIOM, oldClassAxiom, newClassAxiom);
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
			case mowlPackage.CLASS_AXIOM__CLASS_AXIOM:
				if (classAxiom != null)
					msgs = ((InternalEObject)classAxiom).eInverseRemove(this, mowlPackage.CLASS__CLASS_AXIOMS, mowl.Class.class, msgs);
				return basicSetClassAxiom((mowl.Class)otherEnd, msgs);
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
			case mowlPackage.CLASS_AXIOM__CLASS_AXIOM:
				return basicSetClassAxiom(null, msgs);
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
			case mowlPackage.CLASS_AXIOM__CLASS_AXIOM:
				if (resolve) return getClassAxiom();
				return basicGetClassAxiom();
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
			case mowlPackage.CLASS_AXIOM__CLASS_AXIOM:
				return classAxiom != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassAxiomImpl
