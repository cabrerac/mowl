/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectComplementOf#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectComplementOf()
 * @model
 * @generated
 */
public interface ObjectComplementOf extends ClassExpression {
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
	 * @see mowl.mowlPackage#getObjectComplementOf_Classes()
	 * @model required="true"
	 * @generated
	 */
	mowl.Class getClasses();

	/**
	 * Sets the value of the '{@link mowl.ObjectComplementOf#getClasses <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(mowl.Class value);

} // ObjectComplementOf
