/**
 */
package mowl.impl;

import mowl.ObjectComplementOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectComplementOfImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectComplementOfImpl extends ClassExpressionImpl implements ObjectComplementOf {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected mowl.Class classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectComplementOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_COMPLEMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class getClasses() {
		if (classes != null && classes.eIsProxy()) {
			InternalEObject oldClasses = (InternalEObject)classes;
			classes = (mowl.Class)eResolveProxy(oldClasses);
			if (classes != oldClasses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES, oldClasses, classes));
			}
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class basicGetClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(mowl.Class newClasses) {
		mowl.Class oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES, oldClasses, classes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES:
				if (resolve) return getClasses();
				return basicGetClasses();
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
			case mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES:
				setClasses((mowl.Class)newValue);
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
			case mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES:
				setClasses((mowl.Class)null);
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
			case mowlPackage.OBJECT_COMPLEMENT_OF__CLASSES:
				return classes != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectComplementOfImpl
