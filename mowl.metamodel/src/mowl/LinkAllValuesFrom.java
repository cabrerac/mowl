/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkAllValuesFrom#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.LinkAllValuesFrom#getLinkProperties <em>Link Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkAllValuesFrom()
 * @model
 * @generated
 */
public interface LinkAllValuesFrom extends EConnectionExpression {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference.
	 * @see #setClasses(mowl.Class)
	 * @see mowl.mowlPackage#getLinkAllValuesFrom_Classes()
	 * @model required="true"
	 * @generated
	 */
	mowl.Class getClasses();

	/**
	 * Sets the value of the '{@link mowl.LinkAllValuesFrom#getClasses <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(mowl.Class value);

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
	 * @see mowl.mowlPackage#getLinkAllValuesFrom_LinkProperties()
	 * @model required="true"
	 * @generated
	 */
	LinkProperty getLinkProperties();

	/**
	 * Sets the value of the '{@link mowl.LinkAllValuesFrom#getLinkProperties <em>Link Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Properties</em>' reference.
	 * @see #getLinkProperties()
	 * @generated
	 */
	void setLinkProperties(LinkProperty value);

} // LinkAllValuesFrom
