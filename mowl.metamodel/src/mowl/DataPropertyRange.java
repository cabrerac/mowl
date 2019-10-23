/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataPropertyRange#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataPropertyRange()
 * @model
 * @generated
 */
public interface DataPropertyRange extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(Constant)
	 * @see mowl.mowlPackage#getDataPropertyRange_Literal()
	 * @model required="true"
	 * @generated
	 */
	Constant getLiteral();

	/**
	 * Sets the value of the '{@link mowl.DataPropertyRange#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Constant value);

} // DataPropertyRange
