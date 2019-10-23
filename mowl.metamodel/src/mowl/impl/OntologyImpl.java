/**
 */
package mowl.impl;

import java.util.Collection;

import mowl.Annotation;
import mowl.Constant;
import mowl.DataProperty;
import mowl.Individual;
import mowl.Multiontology;
import mowl.ObjectProperty;
import mowl.Ontology;
import mowl.OntologyAxiom;
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
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.OntologyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getObjectsProperty <em>Objects Property</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getOntologyAxioms <em>Ontology Axioms</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link mowl.impl.OntologyImpl#getMultiontology <em>Multiontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends EntityImpl implements Ontology {
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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<mowl.Class> classes;

	/**
	 * The cached value of the '{@link #getObjectsProperty() <em>Objects Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> objectsProperty;

	/**
	 * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> dataProperty;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individuals;

	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> literals;

	/**
	 * The cached value of the '{@link #getOntologyAxioms() <em>Ontology Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyAxiom> ontologyAxioms;

	/**
	 * The cached value of the '{@link #getOntologyAnnotations() <em>Ontology Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> ontologyAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.ONTOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.ONTOLOGY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mowl.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<mowl.Class>(mowl.Class.class, this, mowlPackage.ONTOLOGY__CLASSES, mowlPackage.CLASS__ONTOLOGY);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getObjectsProperty() {
		if (objectsProperty == null) {
			objectsProperty = new EObjectContainmentWithInverseEList<ObjectProperty>(ObjectProperty.class, this, mowlPackage.ONTOLOGY__OBJECTS_PROPERTY, mowlPackage.OBJECT_PROPERTY__ONTOLOGY);
		}
		return objectsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDataProperty() {
		if (dataProperty == null) {
			dataProperty = new EObjectContainmentWithInverseEList<DataProperty>(DataProperty.class, this, mowlPackage.ONTOLOGY__DATA_PROPERTY, mowlPackage.DATA_PROPERTY__ONTOLOGY);
		}
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividuals() {
		if (individuals == null) {
			individuals = new EObjectContainmentWithInverseEList<Individual>(Individual.class, this, mowlPackage.ONTOLOGY__INDIVIDUALS, mowlPackage.INDIVIDUAL__ONTOLOGY);
		}
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentWithInverseEList<Constant>(Constant.class, this, mowlPackage.ONTOLOGY__LITERALS, mowlPackage.CONSTANT__ONTOLOGY);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyAxiom> getOntologyAxioms() {
		if (ontologyAxioms == null) {
			ontologyAxioms = new EObjectContainmentEList<OntologyAxiom>(OntologyAxiom.class, this, mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS);
		}
		return ontologyAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getOntologyAnnotations() {
		if (ontologyAnnotations == null) {
			ontologyAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS);
		}
		return ontologyAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiontology getMultiontology() {
		if (eContainerFeatureID() != mowlPackage.ONTOLOGY__MULTIONTOLOGY) return null;
		return (Multiontology)eInternalContainer();
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
			case mowlPackage.ONTOLOGY__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectsProperty()).basicAdd(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataProperty()).basicAdd(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndividuals()).basicAdd(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLiterals()).basicAdd(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__MULTIONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, mowlPackage.ONTOLOGY__MULTIONTOLOGY, msgs);
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
			case mowlPackage.ONTOLOGY__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				return ((InternalEList<?>)getObjectsProperty()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				return ((InternalEList<?>)getDataProperty()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				return ((InternalEList<?>)getIndividuals()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
				return ((InternalEList<?>)getOntologyAxioms()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				return ((InternalEList<?>)getOntologyAnnotations()).basicRemove(otherEnd, msgs);
			case mowlPackage.ONTOLOGY__MULTIONTOLOGY:
				return eBasicSetContainer(null, mowlPackage.ONTOLOGY__MULTIONTOLOGY, msgs);
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
			case mowlPackage.ONTOLOGY__MULTIONTOLOGY:
				return eInternalContainer().eInverseRemove(this, mowlPackage.MULTIONTOLOGY__ONTOLOGIES, Multiontology.class, msgs);
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
			case mowlPackage.ONTOLOGY__VERSION:
				return getVersion();
			case mowlPackage.ONTOLOGY__CLASSES:
				return getClasses();
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				return getObjectsProperty();
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				return getDataProperty();
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				return getIndividuals();
			case mowlPackage.ONTOLOGY__LITERALS:
				return getLiterals();
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
				return getOntologyAxioms();
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				return getOntologyAnnotations();
			case mowlPackage.ONTOLOGY__MULTIONTOLOGY:
				return getMultiontology();
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
			case mowlPackage.ONTOLOGY__VERSION:
				setVersion((String)newValue);
				return;
			case mowlPackage.ONTOLOGY__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends mowl.Class>)newValue);
				return;
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				getObjectsProperty().clear();
				getObjectsProperty().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				getDataProperty().clear();
				getDataProperty().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				getIndividuals().clear();
				getIndividuals().addAll((Collection<? extends Individual>)newValue);
				return;
			case mowlPackage.ONTOLOGY__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends Constant>)newValue);
				return;
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
				getOntologyAxioms().clear();
				getOntologyAxioms().addAll((Collection<? extends OntologyAxiom>)newValue);
				return;
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				getOntologyAnnotations().clear();
				getOntologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case mowlPackage.ONTOLOGY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case mowlPackage.ONTOLOGY__CLASSES:
				getClasses().clear();
				return;
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				getObjectsProperty().clear();
				return;
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				getDataProperty().clear();
				return;
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				getIndividuals().clear();
				return;
			case mowlPackage.ONTOLOGY__LITERALS:
				getLiterals().clear();
				return;
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
				getOntologyAxioms().clear();
				return;
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				getOntologyAnnotations().clear();
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
			case mowlPackage.ONTOLOGY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case mowlPackage.ONTOLOGY__CLASSES:
				return classes != null && !classes.isEmpty();
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
				return objectsProperty != null && !objectsProperty.isEmpty();
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
				return dataProperty != null && !dataProperty.isEmpty();
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
				return individuals != null && !individuals.isEmpty();
			case mowlPackage.ONTOLOGY__LITERALS:
				return literals != null && !literals.isEmpty();
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
				return ontologyAxioms != null && !ontologyAxioms.isEmpty();
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				return ontologyAnnotations != null && !ontologyAnnotations.isEmpty();
			case mowlPackage.ONTOLOGY__MULTIONTOLOGY:
				return getMultiontology() != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OntologyImpl
