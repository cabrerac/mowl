/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectPropertyAssertion#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 *   <li>{@link mowl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectPropertyAssertion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localObjectPropertyAssertionObjectPropertyList localObjectPropertyAssertionInverseObjectProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localObjectPropertyAssertionObjectPropertyList='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))' localObjectPropertyAssertionInverseObjectProperty='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))'"
 * @generated
 */
public interface ObjectPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Object Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Expressions</em>' containment reference.
	 * @see #setObjectPropertyExpressions(ObjectPropertyExpression)
	 * @see mowl.mowlPackage#getObjectPropertyAssertion_ObjectPropertyExpressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectPropertyExpression getObjectPropertyExpressions();

	/**
	 * Sets the value of the '{@link mowl.ObjectPropertyAssertion#getObjectPropertyExpressions <em>Object Property Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property Expressions</em>' containment reference.
	 * @see #getObjectPropertyExpressions()
	 * @generated
	 */
	void setObjectPropertyExpressions(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Individual</em>' reference.
	 * @see #setTargetIndividual(Individual)
	 * @see mowl.mowlPackage#getObjectPropertyAssertion_TargetIndividual()
	 * @model required="true"
	 * @generated
	 */
	Individual getTargetIndividual();

	/**
	 * Sets the value of the '{@link mowl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Individual</em>' reference.
	 * @see #getTargetIndividual()
	 * @generated
	 */
	void setTargetIndividual(Individual value);

} // ObjectPropertyAssertion
