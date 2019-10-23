/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ConstantAnnotation#getValue <em>Value</em>}</li>
 *   <li>{@link mowl.ConstantAnnotation#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getConstantAnnotation()
 * @model
 * @generated
 */
public interface ConstantAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mowl.mowlPackage#getConstantAnnotation_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mowl.ConstantAnnotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link mowl.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see mowl.DataType
	 * @see #setDatatype(DataType)
	 * @see mowl.mowlPackage#getConstantAnnotation_Datatype()
	 * @model
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link mowl.ConstantAnnotation#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see mowl.DataType
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // ConstantAnnotation
