/**
 */
package mowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.NegativeDataPropertyAssertion#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link mowl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getNegativeDataPropertyAssertion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localNegativeDataPropertyAssertionObjectPropertyList'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localNegativeDataPropertyAssertionObjectPropertyList='\n\t\t\tself.dataPropertyExpressions->forAll(so: DataPropertyExpression | so.oclIsKindOf(DataPropertyList) implies so.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.individualAssertion.ontology))'"
 * @generated
 */
public interface NegativeDataPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Expressions</em>' containment reference.
	 * @see #setDataPropertyExpressions(DataPropertyExpression)
	 * @see mowl.mowlPackage#getNegativeDataPropertyAssertion_DataPropertyExpressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataPropertyExpression getDataPropertyExpressions();

	/**
	 * Sets the value of the '{@link mowl.NegativeDataPropertyAssertion#getDataPropertyExpressions <em>Data Property Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property Expressions</em>' containment reference.
	 * @see #getDataPropertyExpressions()
	 * @generated
	 */
	void setDataPropertyExpressions(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' reference.
	 * @see #setTargetValue(Constant)
	 * @see mowl.mowlPackage#getNegativeDataPropertyAssertion_TargetValue()
	 * @model required="true"
	 * @generated
	 */
	Constant getTargetValue();

	/**
	 * Sets the value of the '{@link mowl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Constant value);

} // NegativeDataPropertyAssertion
