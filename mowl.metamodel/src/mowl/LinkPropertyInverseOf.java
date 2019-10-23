/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Property Inverse Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkPropertyInverseOf#getInverseLinkPropertyOf <em>Inverse Link Property Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkPropertyInverseOf()
 * @model
 * @generated
 */
public interface LinkPropertyInverseOf extends LinkPropertyExpression {
	/**
	 * Returns the value of the '<em><b>Inverse Link Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Link Property Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Link Property Of</em>' reference.
	 * @see #setInverseLinkPropertyOf(LinkProperty)
	 * @see mowl.mowlPackage#getLinkPropertyInverseOf_InverseLinkPropertyOf()
	 * @model required="true"
	 * @generated
	 */
	LinkProperty getInverseLinkPropertyOf();

	/**
	 * Sets the value of the '{@link mowl.LinkPropertyInverseOf#getInverseLinkPropertyOf <em>Inverse Link Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Link Property Of</em>' reference.
	 * @see #getInverseLinkPropertyOf()
	 * @generated
	 */
	void setInverseLinkPropertyOf(LinkProperty value);

} // LinkPropertyInverseOf
