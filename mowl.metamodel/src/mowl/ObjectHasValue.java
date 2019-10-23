/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectHasValue#getObjectProperties <em>Object Properties</em>}</li>
 *   <li>{@link mowl.ObjectHasValue#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectHasValue()
 * @model
 * @generated
 */
public interface ObjectHasValue extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Properties</em>' reference.
	 * @see #setObjectProperties(ObjectProperty)
	 * @see mowl.mowlPackage#getObjectHasValue_ObjectProperties()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty getObjectProperties();

	/**
	 * Sets the value of the '{@link mowl.ObjectHasValue#getObjectProperties <em>Object Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Properties</em>' reference.
	 * @see #getObjectProperties()
	 * @generated
	 */
	void setObjectProperties(ObjectProperty value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' reference.
	 * @see #setIndividual(Individual)
	 * @see mowl.mowlPackage#getObjectHasValue_Individual()
	 * @model required="true"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link mowl.ObjectHasValue#getIndividual <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

} // ObjectHasValue
