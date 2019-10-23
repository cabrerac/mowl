/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ClassAssertion#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getClassAssertion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localClassesClassList localClassesObjectIntersectionOf localClassesObjectUnionOf localClassesObjectSomeValuesFrom localClassesObjectAllValuesFrom localClassesObjectHasValue localClassesObjectComplementOf localClassesObjectOneOf localClassesObjectMinCardinality localClassesObjectMaxCardinality localClassesObjectExactCardinality localClassesDataSomeValuesFrom localClassesDataAllValuesFrom localClassesDataHasValue localClassesDataMinCardinality localClassesDataMaxCardinality localClassesDataExactCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localClassesClassList='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.individualAssertion.ontology))' localClassesObjectIntersectionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))' localClassesObjectUnionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))' localClassesObjectSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)' localClassesObjectAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)' localClassesObjectHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.individualAssertion.ontology)' localClassesObjectComplementOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.individualAssertion.ontology)' localClassesObjectOneOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.individualAssertion.ontology)' localClassesObjectMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.individualAssertion.ontology)' localClassesObjectMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.individualAssertion.ontology)' localClassesObjectExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.individualAssertion.ontology)' localClassesDataSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)' localClassesDataAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)' localClassesDataHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.individualAssertion.ontology)' localClassesDataMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.individualAssertion.ontology)' localClassesDataMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.individualAssertion.ontology)' localClassesDataExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.individualAssertion.ontology)'"
 * @generated
 */
public interface ClassAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see mowl.mowlPackage#getClassAssertion_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassExpression> getExpressions();

} // ClassAssertion
