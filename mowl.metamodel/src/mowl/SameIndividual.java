/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.SameIndividual#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getSameIndividual()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localSameIndividuals'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localSameIndividuals='\n\t\t\tself.targetIndividual->forAll(ni : NamedIndividual | ni.ontology = self.individualAssertion.ontology)'"
 * @generated
 */
public interface SameIndividual extends Assertion {
	/**
	 * Returns the value of the '<em><b>Target Individual</b></em>' reference list.
	 * The list contents are of type {@link mowl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Individual</em>' reference list.
	 * @see mowl.mowlPackage#getSameIndividual_TargetIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Individual> getTargetIndividual();

} // SameIndividual
