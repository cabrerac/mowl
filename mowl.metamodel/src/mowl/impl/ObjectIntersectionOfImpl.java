/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.ObjectIntersectionOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectIntersectionOfImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIntersectionOfImpl extends ClassExpressionImpl implements ObjectIntersectionOf {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<mowl.Class> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectIntersectionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_INTERSECTION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mowl.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<mowl.Class>(mowl.Class.class, this, mowlPackage.OBJECT_INTERSECTION_OF__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.OBJECT_INTERSECTION_OF__CLASSES:
				return getClasses();
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
			case mowlPackage.OBJECT_INTERSECTION_OF__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends mowl.Class>)newValue);
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
			case mowlPackage.OBJECT_INTERSECTION_OF__CLASSES:
				getClasses().clear();
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
			case mowlPackage.OBJECT_INTERSECTION_OF__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectIntersectionOfImpl
