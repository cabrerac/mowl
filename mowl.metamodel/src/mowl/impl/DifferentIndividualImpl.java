/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.DifferentIndividual;
import mowl.Individual;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Different Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DifferentIndividualImpl#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentIndividualImpl extends AssertionImpl implements DifferentIndividual {
	/**
	 * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> targetIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferentIndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DIFFERENT_INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getTargetIndividual() {
		if (targetIndividual == null) {
			targetIndividual = new EObjectResolvingEList<Individual>(Individual.class, this, mowlPackage.DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL);
		}
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL:
				return getTargetIndividual();
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
			case mowlPackage.DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL:
				getTargetIndividual().clear();
				getTargetIndividual().addAll((Collection<? extends Individual>)newValue);
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
			case mowlPackage.DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL:
				getTargetIndividual().clear();
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
			case mowlPackage.DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL:
				return targetIndividual != null && !targetIndividual.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DifferentIndividualImpl
