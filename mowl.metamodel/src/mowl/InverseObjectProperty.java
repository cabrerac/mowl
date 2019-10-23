/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.InverseObjectProperty#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getInverseObjectProperty()
 * @model
 * @generated
 */
public interface InverseObjectProperty extends ObjectPropertyExpression {
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
	 * @see mowl.mowlPackage#getInverseObjectProperty_ObjectProperties()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty getObjectProperties();

	/**
	 * Sets the value of the '{@link mowl.InverseObjectProperty#getObjectProperties <em>Object Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Properties</em>' reference.
	 * @see #getObjectProperties()
	 * @generated
	 */
	void setObjectProperties(ObjectProperty value);

} // InverseObjectProperty
