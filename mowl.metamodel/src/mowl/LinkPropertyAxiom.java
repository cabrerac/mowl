/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkPropertyAxiom#getLinkProperty <em>Link Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkPropertyAxiom()
 * @model abstract="true"
 * @generated
 */
public interface LinkPropertyAxiom extends MultiontologyAxiom {
	/**
	 * Returns the value of the '<em><b>Link Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mowl.LinkProperty#getLinkPropertyAxioms <em>Link Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Property</em>' reference.
	 * @see mowl.mowlPackage#getLinkPropertyAxiom_LinkProperty()
	 * @see mowl.LinkProperty#getLinkPropertyAxioms
	 * @model opposite="linkPropertyAxioms" required="true" changeable="false"
	 * @generated
	 */
	LinkProperty getLinkProperty();

} // LinkPropertyAxiom
