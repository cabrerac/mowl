/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ClassAxiom#getClassAxiom <em>Class Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getClassAxiom()
 * @model abstract="true"
 * @generated
 */
public interface ClassAxiom extends OntologyAxiom {
	/**
	 * Returns the value of the '<em><b>Class Axiom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mowl.Class#getClassAxioms <em>Class Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Axiom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Axiom</em>' reference.
	 * @see mowl.mowlPackage#getClassAxiom_ClassAxiom()
	 * @see mowl.Class#getClassAxioms
	 * @model opposite="classAxioms" required="true" changeable="false"
	 * @generated
	 */
	mowl.Class getClassAxiom();

} // ClassAxiom
