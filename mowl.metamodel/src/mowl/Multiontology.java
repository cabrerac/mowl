/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Multiontology#getPrefixIRI <em>Prefix IRI</em>}</li>
 *   <li>{@link mowl.Multiontology#getVersion <em>Version</em>}</li>
 *   <li>{@link mowl.Multiontology#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link mowl.Multiontology#getOntologyConnectors <em>Ontology Connectors</em>}</li>
 *   <li>{@link mowl.Multiontology#getMultiontologyAxioms <em>Multiontology Axioms</em>}</li>
 *   <li>{@link mowl.Multiontology#getMultiontologyAnnotations <em>Multiontology Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getMultiontology()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='diffOntologiesId multiontologyPrefixIRIEmpty multiontologyVersionEmpty multiontologyIdEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot diffOntologiesId='self.ontologies->forAll(o1 : Ontology, o2 : Ontology | o1 <> o2 implies o1.id <> o2.id)' multiontologyPrefixIRIEmpty='self.prefixIRI.trim().size()>0' multiontologyVersionEmpty='self.version.trim().size()>0' multiontologyIdEmpty='self.id.trim().size()>0'"
 * @generated
 */
public interface Multiontology extends Entity {
	/**
	 * Returns the value of the '<em><b>Prefix IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix IRI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix IRI</em>' attribute.
	 * @see #setPrefixIRI(String)
	 * @see mowl.mowlPackage#getMultiontology_PrefixIRI()
	 * @model required="true"
	 * @generated
	 */
	String getPrefixIRI();

	/**
	 * Sets the value of the '{@link mowl.Multiontology#getPrefixIRI <em>Prefix IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix IRI</em>' attribute.
	 * @see #getPrefixIRI()
	 * @generated
	 */
	void setPrefixIRI(String value);

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
	 * @see mowl.mowlPackage#getMultiontology_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mowl.Multiontology#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Ontologies</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Ontology}.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getMultiontology <em>Multiontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontologies</em>' containment reference list.
	 * @see mowl.mowlPackage#getMultiontology_Ontologies()
	 * @see mowl.Ontology#getMultiontology
	 * @model opposite="multiontology" containment="true" required="true"
	 * @generated
	 */
	EList<Ontology> getOntologies();

	/**
	 * Returns the value of the '<em><b>Ontology Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.OntologyConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Connectors</em>' containment reference list.
	 * @see mowl.mowlPackage#getMultiontology_OntologyConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologyConnector> getOntologyConnectors();

	/**
	 * Returns the value of the '<em><b>Multiontology Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.MultiontologyAxiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiontology Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiontology Axioms</em>' containment reference list.
	 * @see mowl.mowlPackage#getMultiontology_MultiontologyAxioms()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiontologyAxiom> getMultiontologyAxioms();

	/**
	 * Returns the value of the '<em><b>Multiontology Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiontology Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiontology Annotations</em>' containment reference list.
	 * @see mowl.mowlPackage#getMultiontology_MultiontologyAnnotations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getMultiontologyAnnotations();

} // Multiontology
