/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Annotation;
import mowl.Multiontology;
import mowl.MultiontologyAxiom;
import mowl.Ontology;
import mowl.OntologyConnector;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.MultiontologyImpl#getPrefixIRI <em>Prefix IRI</em>}</li>
 *   <li>{@link mowl.impl.MultiontologyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mowl.impl.MultiontologyImpl#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link mowl.impl.MultiontologyImpl#getOntologyConnectors <em>Ontology Connectors</em>}</li>
 *   <li>{@link mowl.impl.MultiontologyImpl#getMultiontologyAxioms <em>Multiontology Axioms</em>}</li>
 *   <li>{@link mowl.impl.MultiontologyImpl#getMultiontologyAnnotations <em>Multiontology Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiontologyImpl extends EntityImpl implements Multiontology {
	/**
	 * The default value of the '{@link #getPrefixIRI() <em>Prefix IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixIRI()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixIRI() <em>Prefix IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixIRI()
	 * @generated
	 * @ordered
	 */
	protected String prefixIRI = PREFIX_IRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOntologies() <em>Ontologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontology> ontologies;

	/**
	 * The cached value of the '{@link #getOntologyConnectors() <em>Ontology Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyConnector> ontologyConnectors;

	/**
	 * The cached value of the '{@link #getMultiontologyAxioms() <em>Multiontology Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiontologyAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiontologyAxiom> multiontologyAxioms;

	/**
	 * The cached value of the '{@link #getMultiontologyAnnotations() <em>Multiontology Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiontologyAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> multiontologyAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiontologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.MULTIONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefixIRI() {
		return prefixIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixIRI(String newPrefixIRI) {
		String oldPrefixIRI = prefixIRI;
		prefixIRI = newPrefixIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.MULTIONTOLOGY__PREFIX_IRI, oldPrefixIRI, prefixIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.MULTIONTOLOGY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontology> getOntologies() {
		if (ontologies == null) {
			ontologies = new EObjectContainmentWithInverseEList<Ontology>(Ontology.class, this, mowlPackage.MULTIONTOLOGY__ONTOLOGIES, mowlPackage.ONTOLOGY__MULTIONTOLOGY);
		}
		return ontologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyConnector> getOntologyConnectors() {
		if (ontologyConnectors == null) {
			ontologyConnectors = new EObjectContainmentEList<OntologyConnector>(OntologyConnector.class, this, mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS);
		}
		return ontologyConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiontologyAxiom> getMultiontologyAxioms() {
		if (multiontologyAxioms == null) {
			multiontologyAxioms = new EObjectContainmentEList<MultiontologyAxiom>(MultiontologyAxiom.class, this, mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS);
		}
		return multiontologyAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getMultiontologyAnnotations() {
		if (multiontologyAnnotations == null) {
			multiontologyAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS);
		}
		return multiontologyAnnotations;
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
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOntologies()).basicAdd(otherEnd, msgs);
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
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				return ((InternalEList<?>)getOntologies()).basicRemove(otherEnd, msgs);
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
				return ((InternalEList<?>)getOntologyConnectors()).basicRemove(otherEnd, msgs);
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
				return ((InternalEList<?>)getMultiontologyAxioms()).basicRemove(otherEnd, msgs);
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
				return ((InternalEList<?>)getMultiontologyAnnotations()).basicRemove(otherEnd, msgs);
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
			case mowlPackage.MULTIONTOLOGY__PREFIX_IRI:
				return getPrefixIRI();
			case mowlPackage.MULTIONTOLOGY__VERSION:
				return getVersion();
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				return getOntologies();
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
				return getOntologyConnectors();
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
				return getMultiontologyAxioms();
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
				return getMultiontologyAnnotations();
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
			case mowlPackage.MULTIONTOLOGY__PREFIX_IRI:
				setPrefixIRI((String)newValue);
				return;
			case mowlPackage.MULTIONTOLOGY__VERSION:
				setVersion((String)newValue);
				return;
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				getOntologies().clear();
				getOntologies().addAll((Collection<? extends Ontology>)newValue);
				return;
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
				getOntologyConnectors().clear();
				getOntologyConnectors().addAll((Collection<? extends OntologyConnector>)newValue);
				return;
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
				getMultiontologyAxioms().clear();
				getMultiontologyAxioms().addAll((Collection<? extends MultiontologyAxiom>)newValue);
				return;
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
				getMultiontologyAnnotations().clear();
				getMultiontologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case mowlPackage.MULTIONTOLOGY__PREFIX_IRI:
				setPrefixIRI(PREFIX_IRI_EDEFAULT);
				return;
			case mowlPackage.MULTIONTOLOGY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				getOntologies().clear();
				return;
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
				getOntologyConnectors().clear();
				return;
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
				getMultiontologyAxioms().clear();
				return;
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
				getMultiontologyAnnotations().clear();
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
			case mowlPackage.MULTIONTOLOGY__PREFIX_IRI:
				return PREFIX_IRI_EDEFAULT == null ? prefixIRI != null : !PREFIX_IRI_EDEFAULT.equals(prefixIRI);
			case mowlPackage.MULTIONTOLOGY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
				return ontologies != null && !ontologies.isEmpty();
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
				return ontologyConnectors != null && !ontologyConnectors.isEmpty();
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
				return multiontologyAxioms != null && !multiontologyAxioms.isEmpty();
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
				return multiontologyAnnotations != null && !multiontologyAnnotations.isEmpty();
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
		result.append(" (prefixIRI: ");
		result.append(prefixIRI);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //MultiontologyImpl
