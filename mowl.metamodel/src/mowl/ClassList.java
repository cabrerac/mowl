/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ClassList#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getClassList()
 * @model
 * @generated
 */
public interface ClassList extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link mowl.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see mowl.mowlPackage#getClassList_Classes()
	 * @model required="true"
	 * @generated
	 */
	EList<mowl.Class> getClasses();

} // ClassList
