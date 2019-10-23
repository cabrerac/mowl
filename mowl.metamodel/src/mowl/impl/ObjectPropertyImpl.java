/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.ObjectProperty;
import mowl.ObjectPropertyAxiom;
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
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#getObjectPropertyAxioms <em>Object Property Axioms</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isFunctionalObjectProperty <em>Functional Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isInverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isTransitiveObjectProperty <em>Transitive Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isSymmetricObjectProperty <em>Symmetric Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isAsymmetricObjectProperty <em>Asymmetric Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isReflexiveObjectProperty <em>Reflexive Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#isIrreflexiveObjectProperty <em>Irreflexive Object Property</em>}</li>
 *   <li>{@link mowl.impl.ObjectPropertyImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends EntityImpl implements ObjectProperty {
	/**
	 * The cached value of the '{@link #getObjectPropertyAxioms() <em>Object Property Axioms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyAxiom> objectPropertyAxioms;

	/**
	 * The default value of the '{@link #isFunctionalObjectProperty() <em>Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFunctionalObjectProperty() <em>Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean functionalObjectProperty = FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverseFunctionalObjectProperty() <em>Inverse Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverseFunctionalObjectProperty() <em>Inverse Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean inverseFunctionalObjectProperty = INVERSE_FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransitiveObjectProperty() <em>Transitive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITIVE_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransitiveObjectProperty() <em>Transitive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean transitiveObjectProperty = TRANSITIVE_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSymmetricObjectProperty() <em>Symmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYMMETRIC_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSymmetricObjectProperty() <em>Symmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean symmetricObjectProperty = SYMMETRIC_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsymmetricObjectProperty() <em>Asymmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYMMETRIC_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsymmetricObjectProperty() <em>Asymmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean asymmetricObjectProperty = ASYMMETRIC_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isReflexiveObjectProperty() <em>Reflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFLEXIVE_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReflexiveObjectProperty() <em>Reflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean reflexiveObjectProperty = REFLEXIVE_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIrreflexiveObjectProperty() <em>Irreflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIrreflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IRREFLEXIVE_OBJECT_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIrreflexiveObjectProperty() <em>Irreflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIrreflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean irreflexiveObjectProperty = IRREFLEXIVE_OBJECT_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyAxiom> getObjectPropertyAxioms() {
		if (objectPropertyAxioms == null) {
			objectPropertyAxioms = new EObjectWithInverseResolvingEList<ObjectPropertyAxiom>(ObjectPropertyAxiom.class, this, mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS, mowlPackage.OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM);
		}
		return objectPropertyAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctionalObjectProperty() {
		return functionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalObjectProperty(boolean newFunctionalObjectProperty) {
		boolean oldFunctionalObjectProperty = functionalObjectProperty;
		functionalObjectProperty = newFunctionalObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY, oldFunctionalObjectProperty, functionalObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverseFunctionalObjectProperty() {
		return inverseFunctionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseFunctionalObjectProperty(boolean newInverseFunctionalObjectProperty) {
		boolean oldInverseFunctionalObjectProperty = inverseFunctionalObjectProperty;
		inverseFunctionalObjectProperty = newInverseFunctionalObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY, oldInverseFunctionalObjectProperty, inverseFunctionalObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitiveObjectProperty() {
		return transitiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitiveObjectProperty(boolean newTransitiveObjectProperty) {
		boolean oldTransitiveObjectProperty = transitiveObjectProperty;
		transitiveObjectProperty = newTransitiveObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY, oldTransitiveObjectProperty, transitiveObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSymmetricObjectProperty() {
		return symmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetricObjectProperty(boolean newSymmetricObjectProperty) {
		boolean oldSymmetricObjectProperty = symmetricObjectProperty;
		symmetricObjectProperty = newSymmetricObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY, oldSymmetricObjectProperty, symmetricObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsymmetricObjectProperty() {
		return asymmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsymmetricObjectProperty(boolean newAsymmetricObjectProperty) {
		boolean oldAsymmetricObjectProperty = asymmetricObjectProperty;
		asymmetricObjectProperty = newAsymmetricObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY, oldAsymmetricObjectProperty, asymmetricObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReflexiveObjectProperty() {
		return reflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflexiveObjectProperty(boolean newReflexiveObjectProperty) {
		boolean oldReflexiveObjectProperty = reflexiveObjectProperty;
		reflexiveObjectProperty = newReflexiveObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY, oldReflexiveObjectProperty, reflexiveObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIrreflexiveObjectProperty() {
		return irreflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrreflexiveObjectProperty(boolean newIrreflexiveObjectProperty) {
		boolean oldIrreflexiveObjectProperty = irreflexiveObjectProperty;
		irreflexiveObjectProperty = newIrreflexiveObjectProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY, oldIrreflexiveObjectProperty, irreflexiveObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology() {
		if (eContainerFeatureID() != mowlPackage.OBJECT_PROPERTY__ONTOLOGY) return null;
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectPropertyAxioms()).basicAdd(otherEnd, msgs);
			case mowlPackage.OBJECT_PROPERTY__ONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, mowlPackage.OBJECT_PROPERTY__ONTOLOGY, msgs);
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				return ((InternalEList<?>)getObjectPropertyAxioms()).basicRemove(otherEnd, msgs);
			case mowlPackage.OBJECT_PROPERTY__ONTOLOGY:
				return eBasicSetContainer(null, mowlPackage.OBJECT_PROPERTY__ONTOLOGY, msgs);
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
			case mowlPackage.OBJECT_PROPERTY__ONTOLOGY:
				return eInternalContainer().eInverseRemove(this, mowlPackage.ONTOLOGY__OBJECTS_PROPERTY, Ontology.class, msgs);
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				return getObjectPropertyAxioms();
			case mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY:
				return isFunctionalObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return isInverseFunctionalObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY:
				return isTransitiveObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY:
				return isSymmetricObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY:
				return isAsymmetricObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY:
				return isReflexiveObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY:
				return isIrreflexiveObjectProperty();
			case mowlPackage.OBJECT_PROPERTY__ONTOLOGY:
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				getObjectPropertyAxioms().clear();
				getObjectPropertyAxioms().addAll((Collection<? extends ObjectPropertyAxiom>)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY:
				setFunctionalObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				setInverseFunctionalObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY:
				setTransitiveObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY:
				setSymmetricObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY:
				setAsymmetricObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY:
				setReflexiveObjectProperty((Boolean)newValue);
				return;
			case mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY:
				setIrreflexiveObjectProperty((Boolean)newValue);
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				getObjectPropertyAxioms().clear();
				return;
			case mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY:
				setFunctionalObjectProperty(FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				setInverseFunctionalObjectProperty(INVERSE_FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY:
				setTransitiveObjectProperty(TRANSITIVE_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY:
				setSymmetricObjectProperty(SYMMETRIC_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY:
				setAsymmetricObjectProperty(ASYMMETRIC_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY:
				setReflexiveObjectProperty(REFLEXIVE_OBJECT_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY:
				setIrreflexiveObjectProperty(IRREFLEXIVE_OBJECT_PROPERTY_EDEFAULT);
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
			case mowlPackage.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS:
				return objectPropertyAxioms != null && !objectPropertyAxioms.isEmpty();
			case mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY:
				return functionalObjectProperty != FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return inverseFunctionalObjectProperty != INVERSE_FUNCTIONAL_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY:
				return transitiveObjectProperty != TRANSITIVE_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY:
				return symmetricObjectProperty != SYMMETRIC_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY:
				return asymmetricObjectProperty != ASYMMETRIC_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY:
				return reflexiveObjectProperty != REFLEXIVE_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY:
				return irreflexiveObjectProperty != IRREFLEXIVE_OBJECT_PROPERTY_EDEFAULT;
			case mowlPackage.OBJECT_PROPERTY__ONTOLOGY:
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
		result.append(" (functionalObjectProperty: ");
		result.append(functionalObjectProperty);
		result.append(", inverseFunctionalObjectProperty: ");
		result.append(inverseFunctionalObjectProperty);
		result.append(", transitiveObjectProperty: ");
		result.append(transitiveObjectProperty);
		result.append(", symmetricObjectProperty: ");
		result.append(symmetricObjectProperty);
		result.append(", asymmetricObjectProperty: ");
		result.append(asymmetricObjectProperty);
		result.append(", reflexiveObjectProperty: ");
		result.append(reflexiveObjectProperty);
		result.append(", irreflexiveObjectProperty: ");
		result.append(irreflexiveObjectProperty);
		result.append(')');
		return result.toString();
	}

} //ObjectPropertyImpl
