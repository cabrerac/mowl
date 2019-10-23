/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Max Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkMaxCardinality#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.LinkMaxCardinality#getLinkProperties <em>Link Properties</em>}</li>
 *   <li>{@link mowl.LinkMaxCardinality#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkMaxCardinality()
 * @model
 * @generated
 */
public interface LinkMaxCardinality extends EConnectionExpression {
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
	 * @see mowl.mowlPackage#getLinkMaxCardinality_Classes()
	 * @model required="true"
	 * @generated
	 */
	mowl.Class getClasses();

	/**
	 * Sets the value of the '{@link mowl.LinkMaxCardinality#getClasses <em>Classes</em>}' reference.
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
	 * @see mowl.mowlPackage#getLinkMaxCardinality_LinkProperties()
	 * @model required="true"
	 * @generated
	 */
	LinkProperty getLinkProperties();

	/**
	 * Sets the value of the '{@link mowl.LinkMaxCardinality#getLinkProperties <em>Link Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Properties</em>' reference.
	 * @see #getLinkProperties()
	 * @generated
	 */
	void setLinkProperties(LinkProperty value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see mowl.mowlPackage#getLinkMaxCardinality_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link mowl.LinkMaxCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

} // LinkMaxCardinality
