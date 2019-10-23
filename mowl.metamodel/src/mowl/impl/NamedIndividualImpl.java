/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Assertion;
import mowl.Individual;
import mowl.NamedIndividual;
import mowl.Ontology;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.NamedIndividualImpl#getIndividualAssertions <em>Individual Assertions</em>}</li>
 *   <li>{@link mowl.impl.NamedIndividualImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedIndividualImpl extends EntityImpl implements NamedIndividual {
	/**
	 * The cached value of the '{@link #getIndividualAssertions() <em>Individual Assertions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assertion> individualAssertions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedIndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.NAMED_INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assertion> getIndividualAssertions() {
		if (individualAssertions == null) {
			individualAssertions = new EObjectWithInverseResolvingEList<Assertion>(Assertion.class, this, mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS, mowlPackage.ASSERTION__INDIVIDUAL_ASSERTION);
		}
		return individualAssertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology() {
		if (eContainerFeatureID() != mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY) return null;
		return (Ontology)eInternalContainer();
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
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndividualAssertions()).basicAdd(otherEnd, msgs);
			case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY, msgs);
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
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				return ((InternalEList<?>)getIndividualAssertions()).basicRemove(otherEnd, msgs);
			case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY:
				return eBasicSetContainer(null, mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY:
				return eInternalContainer().eInverseRemove(this, mowlPackage.ONTOLOGY__INDIVIDUALS, Ontology.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				return getIndividualAssertions();
			case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY:
				return getOntology();
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
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				getIndividualAssertions().clear();
				getIndividualAssertions().addAll((Collection<? extends Assertion>)newValue);
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
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				getIndividualAssertions().clear();
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
			case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS:
				return individualAssertions != null && !individualAssertions.isEmpty();
			case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY:
				return getOntology() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Individual.class) {
			switch (derivedFeatureID) {
				case mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS: return mowlPackage.INDIVIDUAL__INDIVIDUAL_ASSERTIONS;
				case mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY: return mowlPackage.INDIVIDUAL__ONTOLOGY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Individual.class) {
			switch (baseFeatureID) {
				case mowlPackage.INDIVIDUAL__INDIVIDUAL_ASSERTIONS: return mowlPackage.NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS;
				case mowlPackage.INDIVIDUAL__ONTOLOGY: return mowlPackage.NAMED_INDIVIDUAL__ONTOLOGY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NamedIndividualImpl
