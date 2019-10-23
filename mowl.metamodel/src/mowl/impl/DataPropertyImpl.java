/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.DataProperty;
import mowl.DataPropertyAxiom;
import mowl.Ontology;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.DataPropertyImpl#getDataPropertyAxioms <em>Data Property Axioms</em>}</li>
 *   <li>{@link mowl.impl.DataPropertyImpl#isFunctionalDataProperty <em>Functional Data Property</em>}</li>
 *   <li>{@link mowl.impl.DataPropertyImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends EntityImpl implements DataProperty {
	/**
	 * The cached value of the '{@link #getDataPropertyAxioms() <em>Data Property Axioms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyAxiom> dataPropertyAxioms;

	/**
	 * The default value of the '{@link #isFunctionalDataProperty() <em>Functional Data Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalDataProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTIONAL_DATA_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFunctionalDataProperty() <em>Functional Data Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalDataProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean functionalDataProperty = FUNCTIONAL_DATA_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyAxiom> getDataPropertyAxioms() {
		if (dataPropertyAxioms == null) {
			dataPropertyAxioms = new EObjectWithInverseResolvingEList<DataPropertyAxiom>(DataPropertyAxiom.class, this, mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS, mowlPackage.DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM);
		}
		return dataPropertyAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctionalDataProperty() {
		return functionalDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalDataProperty(boolean newFunctionalDataProperty) {
		boolean oldFunctionalDataProperty = functionalDataProperty;
		functionalDataProperty = newFunctionalDataProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY, oldFunctionalDataProperty, functionalDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology() {
		if (eContainerFeatureID() != mowlPackage.DATA_PROPERTY__ONTOLOGY) return null;
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataPropertyAxioms()).basicAdd(otherEnd, msgs);
			case mowlPackage.DATA_PROPERTY__ONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, mowlPackage.DATA_PROPERTY__ONTOLOGY, msgs);
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				return ((InternalEList<?>)getDataPropertyAxioms()).basicRemove(otherEnd, msgs);
			case mowlPackage.DATA_PROPERTY__ONTOLOGY:
				return eBasicSetContainer(null, mowlPackage.DATA_PROPERTY__ONTOLOGY, msgs);
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
			case mowlPackage.DATA_PROPERTY__ONTOLOGY:
				return eInternalContainer().eInverseRemove(this, mowlPackage.ONTOLOGY__DATA_PROPERTY, Ontology.class, msgs);
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				return getDataPropertyAxioms();
			case mowlPackage.DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY:
				return isFunctionalDataProperty();
			case mowlPackage.DATA_PROPERTY__ONTOLOGY:
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				getDataPropertyAxioms().clear();
				getDataPropertyAxioms().addAll((Collection<? extends DataPropertyAxiom>)newValue);
				return;
			case mowlPackage.DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY:
				setFunctionalDataProperty((Boolean)newValue);
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				getDataPropertyAxioms().clear();
				return;
			case mowlPackage.DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY:
				setFunctionalDataProperty(FUNCTIONAL_DATA_PROPERTY_EDEFAULT);
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
			case mowlPackage.DATA_PROPERTY__DATA_PROPERTY_AXIOMS:
				return dataPropertyAxioms != null && !dataPropertyAxioms.isEmpty();
			case mowlPackage.DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY:
				return functionalDataProperty != FUNCTIONAL_DATA_PROPERTY_EDEFAULT;
			case mowlPackage.DATA_PROPERTY__ONTOLOGY:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (functionalDataProperty: ");
		result.append(functionalDataProperty);
		result.append(')');
		return result.toString();
	}

} //DataPropertyImpl
