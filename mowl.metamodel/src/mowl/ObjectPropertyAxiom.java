/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectPropertyAxiom#getObjectPropertyAxiom <em>Object Property Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectPropertyAxiom()
 * @model abstract="true"
 * @generated
 */
public interface ObjectPropertyAxiom extends OntologyAxiom {
	/**
	 * Returns the value of the '<em><b>Object Property Axiom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mowl.ObjectProperty#getObjectPropertyAxioms <em>Object Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Axiom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Axiom</em>' reference.
	 * @see mowl.mowlPackage#getObjectPropertyAxiom_ObjectPropertyAxiom()
	 * @see mowl.ObjectProperty#getObjectPropertyAxioms
	 * @model opposite="objectPropertyAxioms" required="true" changeable="false"
	 * @generated
	 */
	ObjectProperty getObjectPropertyAxiom();

} // ObjectPropertyAxiom
