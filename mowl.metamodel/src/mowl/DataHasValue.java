/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataHasValue#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.DataHasValue#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Properties</em>' reference.
	 * @see #setDataProperties(DataProperty)
	 * @see mowl.mowlPackage#getDataHasValue_DataProperties()
	 * @model required="true"
	 * @generated
	 */
	DataProperty getDataProperties();

	/**
	 * Sets the value of the '{@link mowl.DataHasValue#getDataProperties <em>Data Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Properties</em>' reference.
	 * @see #getDataProperties()
	 * @generated
	 */
	void setDataProperties(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' reference.
	 * @see #setLiterals(Constant)
	 * @see mowl.mowlPackage#getDataHasValue_Literals()
	 * @model required="true"
	 * @generated
	 */
	Constant getLiterals();

	/**
	 * Sets the value of the '{@link mowl.DataHasValue#getLiterals <em>Literals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literals</em>' reference.
	 * @see #getLiterals()
	 * @generated
	 */
	void setLiterals(Constant value);

} // DataHasValue
