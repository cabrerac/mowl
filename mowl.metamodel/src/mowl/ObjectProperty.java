/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectProperty#getObjectPropertyAxioms <em>Object Property Axioms</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isFunctionalObjectProperty <em>Functional Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isInverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isTransitiveObjectProperty <em>Transitive Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isSymmetricObjectProperty <em>Symmetric Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isAsymmetricObjectProperty <em>Asymmetric Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isReflexiveObjectProperty <em>Reflexive Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#isIrreflexiveObjectProperty <em>Irreflexive Object Property</em>}</li>
 *   <li>{@link mowl.ObjectProperty#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='objectPropertyIdEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot objectPropertyIdEmpty='self.id.trim().size()>0'"
 * @generated
 */
public interface ObjectProperty extends Entity {
	/**
	 * Returns the value of the '<em><b>Object Property Axioms</b></em>' reference list.
	 * The list contents are of type {@link mowl.ObjectPropertyAxiom}.
	 * It is bidirectional and its opposite is '{@link mowl.ObjectPropertyAxiom#getObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Axioms</em>' reference list.
	 * @see mowl.mowlPackage#getObjectProperty_ObjectPropertyAxioms()
	 * @see mowl.ObjectPropertyAxiom#getObjectPropertyAxiom
	 * @model opposite="objectPropertyAxiom"
	 * @generated
	 */
	EList<ObjectPropertyAxiom> getObjectPropertyAxioms();

	/**
	 * Returns the value of the '<em><b>Functional Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Object Property</em>' attribute.
	 * @see #setFunctionalObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_FunctionalObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFunctionalObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isFunctionalObjectProperty <em>Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Object Property</em>' attribute.
	 * @see #isFunctionalObjectProperty()
	 * @generated
	 */
	void setFunctionalObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Inverse Functional Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Functional Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Functional Object Property</em>' attribute.
	 * @see #setInverseFunctionalObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_InverseFunctionalObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInverseFunctionalObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isInverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Functional Object Property</em>' attribute.
	 * @see #isInverseFunctionalObjectProperty()
	 * @generated
	 */
	void setInverseFunctionalObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Transitive Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive Object Property</em>' attribute.
	 * @see #setTransitiveObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_TransitiveObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTransitiveObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isTransitiveObjectProperty <em>Transitive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive Object Property</em>' attribute.
	 * @see #isTransitiveObjectProperty()
	 * @generated
	 */
	void setTransitiveObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Symmetric Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symmetric Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetric Object Property</em>' attribute.
	 * @see #setSymmetricObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_SymmetricObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSymmetricObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isSymmetricObjectProperty <em>Symmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetric Object Property</em>' attribute.
	 * @see #isSymmetricObjectProperty()
	 * @generated
	 */
	void setSymmetricObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Asymmetric Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asymmetric Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asymmetric Object Property</em>' attribute.
	 * @see #setAsymmetricObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_AsymmetricObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAsymmetricObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isAsymmetricObjectProperty <em>Asymmetric Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asymmetric Object Property</em>' attribute.
	 * @see #isAsymmetricObjectProperty()
	 * @generated
	 */
	void setAsymmetricObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Reflexive Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflexive Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflexive Object Property</em>' attribute.
	 * @see #setReflexiveObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_ReflexiveObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReflexiveObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isReflexiveObjectProperty <em>Reflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflexive Object Property</em>' attribute.
	 * @see #isReflexiveObjectProperty()
	 * @generated
	 */
	void setReflexiveObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Irreflexive Object Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irreflexive Object Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irreflexive Object Property</em>' attribute.
	 * @see #setIrreflexiveObjectProperty(boolean)
	 * @see mowl.mowlPackage#getObjectProperty_IrreflexiveObjectProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIrreflexiveObjectProperty();

	/**
	 * Sets the value of the '{@link mowl.ObjectProperty#isIrreflexiveObjectProperty <em>Irreflexive Object Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irreflexive Object Property</em>' attribute.
	 * @see #isIrreflexiveObjectProperty()
	 * @generated
	 */
	void setIrreflexiveObjectProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getObjectsProperty <em>Objects Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see mowl.mowlPackage#getObjectProperty_Ontology()
	 * @see mowl.Ontology#getObjectsProperty
	 * @model opposite="objectsProperty" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Ontology getOntology();

} // ObjectProperty
