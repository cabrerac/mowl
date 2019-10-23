/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link mowl.ObjectExactCardinality#getClasses <em>Classes</em>}</li>
 *   <li>{@link mowl.ObjectExactCardinality#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectExactCardinality()
 * @model
 * @generated
 */
public interface ObjectExactCardinality extends ClassExpression {
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
	 * @see mowl.mowlPackage#getObjectExactCardinality_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link mowl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

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
	 * @see mowl.mowlPackage#getObjectExactCardinality_Classes()
	 * @model required="true"
	 * @generated
	 */
	mowl.Class getClasses();

	/**
	 * Sets the value of the '{@link mowl.ObjectExactCardinality#getClasses <em>Classes</em>}' reference.
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
	 * @see mowl.mowlPackage#getObjectExactCardinality_ObjectProperties()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty getObjectProperties();

	/**
	 * Sets the value of the '{@link mowl.ObjectExactCardinality#getObjectProperties <em>Object Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Properties</em>' reference.
	 * @see #getObjectProperties()
	 * @generated
	 */
	void setObjectProperties(ObjectProperty value);

} // ObjectExactCardinality
