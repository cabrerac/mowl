/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataSomeValuesFrom#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link mowl.DataSomeValuesFrom#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataSomeValuesFrom()
 * @model
 * @generated
 */
public interface DataSomeValuesFrom extends ClassExpression {
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
	 * @see mowl.mowlPackage#getDataSomeValuesFrom_DataProperties()
	 * @model required="true"
	 * @generated
	 */
	DataProperty getDataProperties();

	/**
	 * Sets the value of the '{@link mowl.DataSomeValuesFrom#getDataProperties <em>Data Properties</em>}' reference.
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
	 * @see mowl.mowlPackage#getDataSomeValuesFrom_Literals()
	 * @model required="true"
	 * @generated
	 */
	EList<Constant> getLiterals();

} // DataSomeValuesFrom
