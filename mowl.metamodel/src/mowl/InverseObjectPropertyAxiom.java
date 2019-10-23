/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.InverseObjectPropertyAxiom#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getInverseObjectPropertyAxiom()
 * @model
 * @generated
 */
public interface InverseObjectPropertyAxiom extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Object Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property</em>' reference.
	 * @see #setObjectProperty(ObjectProperty)
	 * @see mowl.mowlPackage#getInverseObjectPropertyAxiom_ObjectProperty()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty getObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.InverseObjectPropertyAxiom#getObjectProperty <em>Object Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property</em>' reference.
	 * @see #getObjectProperty()
	 * @generated
	 */
	void setObjectProperty(ObjectProperty value);

} // InverseObjectPropertyAxiom
