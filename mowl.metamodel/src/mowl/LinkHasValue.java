/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkHasValue#getLinkProperties <em>Link Properties</em>}</li>
 *   <li>{@link mowl.LinkHasValue#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkHasValue()
 * @model
 * @generated
 */
public interface LinkHasValue extends EConnectionExpression {
	/**
	 * Returns the value of the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Properties</em>' reference.
	 * @see #setLinkProperties(LinkProperty)
	 * @see mowl.mowlPackage#getLinkHasValue_LinkProperties()
	 * @model required="true"
	 * @generated
	 */
	LinkProperty getLinkProperties();

	/**
	 * Sets the value of the '{@link mowl.LinkHasValue#getLinkProperties <em>Link Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Properties</em>' reference.
	 * @see #getLinkProperties()
	 * @generated
	 */
	void setLinkProperties(LinkProperty value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' reference.
	 * @see #setIndividual(NamedIndividual)
	 * @see mowl.mowlPackage#getLinkHasValue_Individual()
	 * @model required="true"
	 * @generated
	 */
	NamedIndividual getIndividual();

	/**
	 * Sets the value of the '{@link mowl.LinkHasValue#getIndividual <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(NamedIndividual value);

} // LinkHasValue
