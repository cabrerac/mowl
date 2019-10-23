/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation By Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getAnnotationByEntity()
 * @model
 * @generated
 */
public interface AnnotationByEntity extends Annotation {
	/**
	 * Returns the value of the '<em><b>Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Value</em>' reference.
	 * @see #setAnnotationValue(Entity)
	 * @see mowl.mowlPackage#getAnnotationByEntity_AnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	Entity getAnnotationValue();

	/**
	 * Sets the value of the '{@link mowl.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Value</em>' reference.
	 * @see #getAnnotationValue()
	 * @generated
	 */
	void setAnnotationValue(Entity value);

} // AnnotationByEntity
