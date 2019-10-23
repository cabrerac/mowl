/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.LinkProperty#isFunctionalLinkProperty <em>Functional Link Property</em>}</li>
 *   <li>{@link mowl.LinkProperty#isInverseFunctionalLinkProperty <em>Inverse Functional Link Property</em>}</li>
 *   <li>{@link mowl.LinkProperty#getSourceOntology <em>Source Ontology</em>}</li>
 *   <li>{@link mowl.LinkProperty#getTargetOntology <em>Target Ontology</em>}</li>
 *   <li>{@link mowl.LinkProperty#getLinkPropertyAxioms <em>Link Property Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getLinkProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentOntologiesLinkProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentOntologiesLinkProperty='self.sourceOntology <> self.targetOntology'"
 * @generated
 */
public interface LinkProperty extends EConnector {
	/**
	 * Returns the value of the '<em><b>Functional Link Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Link Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Link Property</em>' attribute.
	 * @see #setFunctionalLinkProperty(boolean)
	 * @see mowl.mowlPackage#getLinkProperty_FunctionalLinkProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFunctionalLinkProperty();

	/**
	 * Sets the value of the '{@link mowl.LinkProperty#isFunctionalLinkProperty <em>Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Link Property</em>' attribute.
	 * @see #isFunctionalLinkProperty()
	 * @generated
	 */
	void setFunctionalLinkProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Inverse Functional Link Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Functional Link Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Functional Link Property</em>' attribute.
	 * @see #setInverseFunctionalLinkProperty(boolean)
	 * @see mowl.mowlPackage#getLinkProperty_InverseFunctionalLinkProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInverseFunctionalLinkProperty();

	/**
	 * Sets the value of the '{@link mowl.LinkProperty#isInverseFunctionalLinkProperty <em>Inverse Functional Link Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Functional Link Property</em>' attribute.
	 * @see #isInverseFunctionalLinkProperty()
	 * @generated
	 */
	void setInverseFunctionalLinkProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ontology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ontology</em>' reference.
	 * @see #setSourceOntology(Ontology)
	 * @see mowl.mowlPackage#getLinkProperty_SourceOntology()
	 * @model required="true"
	 * @generated
	 */
	Ontology getSourceOntology();

	/**
	 * Sets the value of the '{@link mowl.LinkProperty#getSourceOntology <em>Source Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ontology</em>' reference.
	 * @see #getSourceOntology()
	 * @generated
	 */
	void setSourceOntology(Ontology value);

	/**
	 * Returns the value of the '<em><b>Target Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ontology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ontology</em>' reference.
	 * @see #setTargetOntology(Ontology)
	 * @see mowl.mowlPackage#getLinkProperty_TargetOntology()
	 * @model required="true"
	 * @generated
	 */
	Ontology getTargetOntology();

	/**
	 * Sets the value of the '{@link mowl.LinkProperty#getTargetOntology <em>Target Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ontology</em>' reference.
	 * @see #getTargetOntology()
	 * @generated
	 */
	void setTargetOntology(Ontology value);

	/**
	 * Returns the value of the '<em><b>Link Property Axioms</b></em>' reference list.
	 * The list contents are of type {@link mowl.LinkPropertyAxiom}.
	 * It is bidirectional and its opposite is '{@link mowl.LinkPropertyAxiom#getLinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Property Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Property Axioms</em>' reference list.
	 * @see mowl.mowlPackage#getLinkProperty_LinkPropertyAxioms()
	 * @see mowl.LinkPropertyAxiom#getLinkProperty
	 * @model opposite="linkProperty"
	 * @generated
	 */
	EList<LinkPropertyAxiom> getLinkPropertyAxioms();

} // LinkProperty
