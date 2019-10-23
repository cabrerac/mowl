/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataPropertyList#getDataProperties <em>Data Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataPropertyList()
 * @model
 * @generated
 */
public interface DataPropertyList extends DataPropertyExpression {
	/**
	 * Returns the value of the '<em><b>Data Properties</b></em>' reference list.
	 * The list contents are of type {@link mowl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Properties</em>' reference list.
	 * @see mowl.mowlPackage#getDataPropertyList_DataProperties()
	 * @model required="true"
	 * @generated
	 */
	EList<DataProperty> getDataProperties();

} // DataPropertyList
