/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Assertion#getIndividualAssertion <em>Individual Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getAssertion()
 * @model abstract="true"
 * @generated
 */
public interface Assertion extends OntologyAxiom {
	/**
	 * Returns the value of the '<em><b>Individual Assertion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mowl.Individual#getIndividualAssertions <em>Individual Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Assertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Assertion</em>' reference.
	 * @see mowl.mowlPackage#getAssertion_IndividualAssertion()
	 * @see mowl.Individual#getIndividualAssertions
	 * @model opposite="individualAssertions" required="true" changeable="false"
	 * @generated
	 */
	Individual getIndividualAssertion();

} // Assertion
