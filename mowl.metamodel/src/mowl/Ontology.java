/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Ontology#getVersion <em>Version</em>}</li>
 *   <li>{@link mowl.Ontology#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.Ontology#getObjectsProperty <em>Objects Property</em>}</li>
 *   <li>{@link mowl.Ontology#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link mowl.Ontology#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link mowl.Ontology#getLiterals <em>Literals</em>}</li>
 *   <li>{@link mowl.Ontology#getOntologyAxioms <em>Ontology Axioms</em>}</li>
 *   <li>{@link mowl.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link mowl.Ontology#getMultiontology <em>Multiontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getOntology()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ontologyIdEmpty ontologyVersionEmpty diffClassesId diffObjectPropertiesId diffDataPropertiesId diffIndividuals'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ontologyIdEmpty='self.id.trim().size()>0' ontologyVersionEmpty='self.version.trim().size()>0' diffClassesId='self.classes->forAll(c1 : Class, c2 : Class | c1 <> c2 implies c1.id <> c2.id)' diffObjectPropertiesId='self.objectsProperty->forAll(op1 : ObjectProperty, op2 : ObjectProperty | op1 <> op2 implies op1.id <> op2.id)' diffDataPropertiesId='self.dataProperty->forAll(dp1 : DataProperty, dp2 : DataProperty | dp1 <> dp2 implies dp1.id <> dp2.id)' diffIndividuals='self.individuals->forAll(i1 : NamedIndividual, i2 : NamedIndividual | i1 <> i2 implies i1.id <> i2.id)'"
 * @generated
 */
public interface Ontology extends Entity {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mowl.mowlPackage#getOntology_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mowl.Ontology#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Class}.
	 * It is bidirectional and its opposite is '{@link mowl.Class#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_Classes()
	 * @see mowl.Class#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<mowl.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Objects Property</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.ObjectProperty}.
	 * It is bidirectional and its opposite is '{@link mowl.ObjectProperty#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Property</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_ObjectsProperty()
	 * @see mowl.ObjectProperty#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<ObjectProperty> getObjectsProperty();

	/**
	 * Returns the value of the '<em><b>Data Property</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.DataProperty}.
	 * It is bidirectional and its opposite is '{@link mowl.DataProperty#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_DataProperty()
	 * @see mowl.DataProperty#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<DataProperty> getDataProperty();

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Individual}.
	 * It is bidirectional and its opposite is '{@link mowl.Individual#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_Individuals()
	 * @see mowl.Individual#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Constant}.
	 * It is bidirectional and its opposite is '{@link mowl.Constant#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_Literals()
	 * @see mowl.Constant#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<Constant> getLiterals();

	/**
	 * Returns the value of the '<em><b>Ontology Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.OntologyAxiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Axioms</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_OntologyAxioms()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologyAxiom> getOntologyAxioms();

	/**
	 * Returns the value of the '<em><b>Ontology Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Annotations</em>' containment reference list.
	 * @see mowl.mowlPackage#getOntology_OntologyAnnotations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getOntologyAnnotations();

	/**
	 * Returns the value of the '<em><b>Multiontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Multiontology#getOntologies <em>Ontologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiontology</em>' container reference.
	 * @see mowl.mowlPackage#getOntology_Multiontology()
	 * @see mowl.Multiontology#getOntologies
	 * @model opposite="ontologies" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Multiontology getMultiontology();

} // Ontology
