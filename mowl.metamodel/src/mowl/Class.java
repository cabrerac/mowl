/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Class#getClassAxioms <em>Class Axioms</em>}</li>
 *   <li>{@link mowl.Class#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classIdEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot classIdEmpty='self.id.trim().size()>0'"
 * @generated
 */
public interface Class extends Entity {
	/**
	 * Returns the value of the '<em><b>Class Axioms</b></em>' reference list.
	 * The list contents are of type {@link mowl.ClassAxiom}.
	 * It is bidirectional and its opposite is '{@link mowl.ClassAxiom#getClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Axioms</em>' reference list.
	 * @see mowl.mowlPackage#getClass_ClassAxioms()
	 * @see mowl.ClassAxiom#getClassAxiom
	 * @model opposite="classAxiom"
	 * @generated
	 */
	EList<ClassAxiom> getClassAxioms();

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see mowl.mowlPackage#getClass_Ontology()
	 * @see mowl.Ontology#getClasses
	 * @model opposite="classes" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Ontology getOntology();

} // Class
