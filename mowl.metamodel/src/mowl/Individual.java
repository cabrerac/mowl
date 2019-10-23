/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Individual#getIndividualAssertions <em>Individual Assertions</em>}</li>
 *   <li>{@link mowl.Individual#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getIndividual()
 * @model abstract="true"
 * @generated
 */
public interface Individual extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual Assertions</b></em>' reference list.
	 * The list contents are of type {@link mowl.Assertion}.
	 * It is bidirectional and its opposite is '{@link mowl.Assertion#getIndividualAssertion <em>Individual Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Assertions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Assertions</em>' reference list.
	 * @see mowl.mowlPackage#getIndividual_IndividualAssertions()
	 * @see mowl.Assertion#getIndividualAssertion
	 * @model opposite="individualAssertion"
	 * @generated
	 */
	EList<Assertion> getIndividualAssertions();

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see mowl.mowlPackage#getIndividual_Ontology()
	 * @see mowl.Ontology#getIndividuals
	 * @model opposite="individuals" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Ontology getOntology();

} // Individual
