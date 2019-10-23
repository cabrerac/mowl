/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataPropertyAxiom#getDataPropertyAxiom <em>Data Property Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataPropertyAxiom()
 * @model abstract="true"
 * @generated
 */
public interface DataPropertyAxiom extends OntologyAxiom {
	/**
	 * Returns the value of the '<em><b>Data Property Axiom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mowl.DataProperty#getDataPropertyAxioms <em>Data Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Axiom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Axiom</em>' reference.
	 * @see mowl.mowlPackage#getDataPropertyAxiom_DataPropertyAxiom()
	 * @see mowl.DataProperty#getDataPropertyAxioms
	 * @model opposite="dataPropertyAxioms" required="true" changeable="false"
	 * @generated
	 */
	DataProperty getDataPropertyAxiom();

} // DataPropertyAxiom
