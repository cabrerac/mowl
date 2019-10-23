/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataProperty#getDataPropertyAxioms <em>Data Property Axioms</em>}</li>
 *   <li>{@link mowl.DataProperty#isFunctionalDataProperty <em>Functional Data Property</em>}</li>
 *   <li>{@link mowl.DataProperty#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dataPropertyIdEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot dataPropertyIdEmpty='self.id.trim().size()>0'"
 * @generated
 */
public interface DataProperty extends Entity {
	/**
	 * Returns the value of the '<em><b>Data Property Axioms</b></em>' reference list.
	 * The list contents are of type {@link mowl.DataPropertyAxiom}.
	 * It is bidirectional and its opposite is '{@link mowl.DataPropertyAxiom#getDataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Axioms</em>' reference list.
	 * @see mowl.mowlPackage#getDataProperty_DataPropertyAxioms()
	 * @see mowl.DataPropertyAxiom#getDataPropertyAxiom
	 * @model opposite="dataPropertyAxiom"
	 * @generated
	 */
	EList<DataPropertyAxiom> getDataPropertyAxioms();

	/**
	 * Returns the value of the '<em><b>Functional Data Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Data Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Data Property</em>' attribute.
	 * @see #setFunctionalDataProperty(boolean)
	 * @see mowl.mowlPackage#getDataProperty_FunctionalDataProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFunctionalDataProperty();

	/**
	 * Sets the value of the '{@link mowl.DataProperty#isFunctionalDataProperty <em>Functional Data Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Data Property</em>' attribute.
	 * @see #isFunctionalDataProperty()
	 * @generated
	 */
	void setFunctionalDataProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see mowl.mowlPackage#getDataProperty_Ontology()
	 * @see mowl.Ontology#getDataProperty
	 * @model opposite="dataProperty" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Ontology getOntology();

} // DataProperty
