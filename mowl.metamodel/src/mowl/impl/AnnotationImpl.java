/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Annotation;
import mowl.AnnotationProperty;
import mowl.Entity;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.AnnotationImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link mowl.impl.AnnotationImpl#getAnnotationTarget <em>Annotation Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation {
	/**
	 * The default value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected static final AnnotationProperty ANNOTATION_PROPERTY_EDEFAULT = AnnotationProperty.BACKWARD_COMPATIBLE_WITH;

	/**
	 * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty annotationProperty = ANNOTATION_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotationTarget() <em>Annotation Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> annotationTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getAnnotationProperty() {
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationProperty(AnnotationProperty newAnnotationProperty) {
		AnnotationProperty oldAnnotationProperty = annotationProperty;
		annotationProperty = newAnnotationProperty == null ? ANNOTATION_PROPERTY_EDEFAULT : newAnnotationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.ANNOTATION__ANNOTATION_PROPERTY, oldAnnotationProperty, annotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getAnnotationTarget() {
		if (annotationTarget == null) {
			annotationTarget = new EObjectWithInverseResolvingEList.ManyInverse<Entity>(Entity.class, this, mowlPackage.ANNOTATION__ANNOTATION_TARGET, mowlPackage.ENTITY__ANNOTATIONS);
		}
		return annotationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationTarget()).basicAdd(otherEnd, msgs);
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
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				return ((InternalEList<?>)getAnnotationTarget()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				return getAnnotationProperty();
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				return getAnnotationTarget();
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
			case mowlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)newValue);
				return;
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				getAnnotationTarget().clear();
				getAnnotationTarget().addAll((Collection<? extends Entity>)newValue);
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
			case mowlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				setAnnotationProperty(ANNOTATION_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				getAnnotationTarget().clear();
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
			case mowlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				return annotationProperty != ANNOTATION_PROPERTY_EDEFAULT;
			case mowlPackage.ANNOTATION__ANNOTATION_TARGET:
				return annotationTarget != null && !annotationTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (annotationProperty: ");
		result.append(annotationProperty);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
