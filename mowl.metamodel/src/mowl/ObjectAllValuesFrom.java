/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectAllValuesFrom#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.ObjectAllValuesFrom#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectAllValuesFrom()
 * @model
 * @generated
 */
public interface ObjectAllValuesFrom extends ClassExpression {
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
	 * @see mowl.mowlPackage#getObjectAllValuesFrom_Classes()
	 * @model required="true"
	 * @generated
	 */
	mowl.Class getClasses();

	/**
	 * Sets the value of the '{@link mowl.ObjectAllValuesFrom#getClasses <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(mowl.Class value);

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
	 * @see mowl.mowlPackage#getObjectAllValuesFrom_ObjectProperties()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty getObjectProperties();

	/**
	 * Sets the value of the '{@link mowl.ObjectAllValuesFrom#getObjectProperties <em>Object Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Properties</em>' reference.
	 * @see #getObjectProperties()
	 * @generated
	 */
	void setObjectProperties(ObjectProperty value);

} // ObjectAllValuesFrom
