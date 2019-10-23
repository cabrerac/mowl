/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.LinkProperty;
import mowl.LinkPropertyAxiom;
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
 * An implementation of the model object '<em><b>Link Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.LinkPropertyImpl#isFunctionalLinkProperty <em>Functional Link Property</em>}</li>
 *   <li>{@link mowl.impl.LinkPropertyImpl#isInverseFunctionalLinkProperty <em>Inverse Functional Link Property</em>}</li>
 *   <li>{@link mowl.impl.LinkPropertyImpl#getSourceOntology <em>Source Ontology</em>}</li>
 *   <li>{@link mowl.impl.LinkPropertyImpl#getTargetOntology <em>Target Ontology</em>}</li>
 *   <li>{@link mowl.impl.LinkPropertyImpl#getLinkPropertyAxioms <em>Link Property Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPropertyImpl extends EConnectorImpl implements LinkProperty {
	/**
	 * The default value of the '{@link #isFunctionalLinkProperty() <em>Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalLinkProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTIONAL_LINK_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFunctionalLinkProperty() <em>Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalLinkProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean functionalLinkProperty = FUNCTIONAL_LINK_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverseFunctionalLinkProperty() <em>Inverse Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseFunctionalLinkProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_FUNCTIONAL_LINK_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverseFunctionalLinkProperty() <em>Inverse Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseFunctionalLinkProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean inverseFunctionalLinkProperty = INVERSE_FUNCTIONAL_LINK_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceOntology() <em>Source Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOntology()
	 * @generated
	 * @ordered
	 */
	protected Ontology sourceOntology;

	/**
	 * The cached value of the '{@link #getTargetOntology() <em>Target Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOntology()
	 * @generated
	 * @ordered
	 */
	protected Ontology targetOntology;

	/**
	 * The cached value of the '{@link #getLinkPropertyAxioms() <em>Link Property Axioms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkPropertyAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkPropertyAxiom> linkPropertyAxioms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.LINK_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctionalLinkProperty() {
		return functionalLinkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalLinkProperty(boolean newFunctionalLinkProperty) {
		boolean oldFunctionalLinkProperty = functionalLinkProperty;
		functionalLinkProperty = newFunctionalLinkProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY, oldFunctionalLinkProperty, functionalLinkProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverseFunctionalLinkProperty() {
		return inverseFunctionalLinkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseFunctionalLinkProperty(boolean newInverseFunctionalLinkProperty) {
		boolean oldInverseFunctionalLinkProperty = inverseFunctionalLinkProperty;
		inverseFunctionalLinkProperty = newInverseFunctionalLinkProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY, oldInverseFunctionalLinkProperty, inverseFunctionalLinkProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getSourceOntology() {
		if (sourceOntology != null && sourceOntology.eIsProxy()) {
			InternalEObject oldSourceOntology = (InternalEObject)sourceOntology;
			sourceOntology = (Ontology)eResolveProxy(oldSourceOntology);
			if (sourceOntology != oldSourceOntology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY, oldSourceOntology, sourceOntology));
			}
		}
		return sourceOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology basicGetSourceOntology() {
		return sourceOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOntology(Ontology newSourceOntology) {
		Ontology oldSourceOntology = sourceOntology;
		sourceOntology = newSourceOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY, oldSourceOntology, sourceOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getTargetOntology() {
		if (targetOntology != null && targetOntology.eIsProxy()) {
			InternalEObject oldTargetOntology = (InternalEObject)targetOntology;
			targetOntology = (Ontology)eResolveProxy(oldTargetOntology);
			if (targetOntology != oldTargetOntology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY, oldTargetOntology, targetOntology));
			}
		}
		return targetOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology basicGetTargetOntology() {
		return targetOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOntology(Ontology newTargetOntology) {
		Ontology oldTargetOntology = targetOntology;
		targetOntology = newTargetOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY, oldTargetOntology, targetOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkPropertyAxiom> getLinkPropertyAxioms() {
		if (linkPropertyAxioms == null) {
			linkPropertyAxioms = new EObjectWithInverseResolvingEList<LinkPropertyAxiom>(LinkPropertyAxiom.class, this, mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS, mowlPackage.LINK_PROPERTY_AXIOM__LINK_PROPERTY);
		}
		return linkPropertyAxioms;
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
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkPropertyAxioms()).basicAdd(otherEnd, msgs);
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
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				return ((InternalEList<?>)getLinkPropertyAxioms()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY:
				return isFunctionalLinkProperty();
			case mowlPackage.LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY:
				return isInverseFunctionalLinkProperty();
			case mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY:
				if (resolve) return getSourceOntology();
				return basicGetSourceOntology();
			case mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY:
				if (resolve) return getTargetOntology();
				return basicGetTargetOntology();
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				return getLinkPropertyAxioms();
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
			case mowlPackage.LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY:
				setFunctionalLinkProperty((Boolean)newValue);
				return;
			case mowlPackage.LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY:
				setInverseFunctionalLinkProperty((Boolean)newValue);
				return;
			case mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY:
				setSourceOntology((Ontology)newValue);
				return;
			case mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY:
				setTargetOntology((Ontology)newValue);
				return;
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				getLinkPropertyAxioms().clear();
				getLinkPropertyAxioms().addAll((Collection<? extends LinkPropertyAxiom>)newValue);
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
			case mowlPackage.LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY:
				setFunctionalLinkProperty(FUNCTIONAL_LINK_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY:
				setInverseFunctionalLinkProperty(INVERSE_FUNCTIONAL_LINK_PROPERTY_EDEFAULT);
				return;
			case mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY:
				setSourceOntology((Ontology)null);
				return;
			case mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY:
				setTargetOntology((Ontology)null);
				return;
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				getLinkPropertyAxioms().clear();
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
			case mowlPackage.LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY:
				return functionalLinkProperty != FUNCTIONAL_LINK_PROPERTY_EDEFAULT;
			case mowlPackage.LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY:
				return inverseFunctionalLinkProperty != INVERSE_FUNCTIONAL_LINK_PROPERTY_EDEFAULT;
			case mowlPackage.LINK_PROPERTY__SOURCE_ONTOLOGY:
				return sourceOntology != null;
			case mowlPackage.LINK_PROPERTY__TARGET_ONTOLOGY:
				return targetOntology != null;
			case mowlPackage.LINK_PROPERTY__LINK_PROPERTY_AXIOMS:
				return linkPropertyAxioms != null && !linkPropertyAxioms.isEmpty();
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
		result.append(" (functionalLinkProperty: ");
		result.append(functionalLinkProperty);
		result.append(", inverseFunctionalLinkProperty: ");
		result.append(inverseFunctionalLinkProperty);
		result.append(')');
		return result.toString();
	}

} //LinkPropertyImpl
