/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectOneOf#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectOneOf()
 * @model
 * @generated
 */
public interface ObjectOneOf extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' reference list.
	 * The list contents are of type {@link mowl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' reference list.
	 * @see mowl.mowlPackage#getObjectOneOf_Individual()
	 * @model required="true"
	 * @generated
	 */
	EList<Individual> getIndividual();

} // ObjectOneOf
