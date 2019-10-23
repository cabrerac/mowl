/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataMinCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link mowl.DataMinCardinality#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.DataMinCardinality#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataMinCardinality()
 * @model
 * @generated
 */
public interface DataMinCardinality extends ClassExpression {
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
	 * @see mowl.mowlPackage#getDataMinCardinality_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link mowl.DataMinCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

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
	 * @see mowl.mowlPackage#getDataMinCardinality_DataProperties()
	 * @model required="true"
	 * @generated
	 */
	DataProperty getDataProperties();

	/**
	 * Sets the value of the '{@link mowl.DataMinCardinality#getDataProperties <em>Data Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Properties</em>' reference.
	 * @see #getDataProperties()
	 * @generated
	 */
	void setDataProperties(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' reference list.
	 * The list contents are of type {@link mowl.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' reference list.
	 * @see mowl.mowlPackage#getDataMinCardinality_Literals()
	 * @model required="true"
	 * @generated
	 */
	EList<Constant> getLiterals();

} // DataMinCardinality
