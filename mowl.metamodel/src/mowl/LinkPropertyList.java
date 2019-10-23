/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Property List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkPropertyList#getLinksProperty <em>Links Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkPropertyList()
 * @model
 * @generated
 */
public interface LinkPropertyList extends LinkPropertyExpression {
	/**
	 * Returns the value of the '<em><b>Links Property</b></em>' reference list.
	 * The list contents are of type {@link mowl.LinkProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links Property</em>' reference list.
	 * @see mowl.mowlPackage#getLinkPropertyList_LinksProperty()
	 * @model required="true"
	 * @generated
	 */
	EList<LinkProperty> getLinksProperty();

} // LinkPropertyList
