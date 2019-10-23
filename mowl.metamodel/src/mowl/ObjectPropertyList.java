/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectPropertyList#getObjectProperties <em>Object Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectPropertyList()
 * @model
 * @generated
 */
public interface ObjectPropertyList extends ObjectPropertyExpression {
	/**
	 * Returns the value of the '<em><b>Object Properties</b></em>' reference list.
	 * The list contents are of type {@link mowl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Properties</em>' reference list.
	 * @see mowl.mowlPackage#getObjectPropertyList_ObjectProperties()
	 * @model required="true"
	 * @generated
	 */
	EList<ObjectProperty> getObjectProperties();

} // ObjectPropertyList
