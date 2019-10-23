/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.ObjectPropertyDomain#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getObjectPropertyDomain()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localObjectPropertyDomainClassList localObjectPropertyDomainObjectIntersectionOf localObjectPropertyDomainObjectUnionOf localObjectPropertyDomainObjectSomeValuesFrom localObjectPropertyDomainObjectAllValuesFrom localObjectPropertyDomainObjectHasValue localObjectPropertyDomainObjectComplementOf localObjectPropertyDomainObjectOneOf localObjectPropertyDomainObjectMinCardinality localObjectPropertyDomainObjectMaxCardinality localObjectPropertyDomainObjectExactCardinality localObjectPropertyDomainDataSomeValuesFrom localObjectPropertyDomainDataAllValuesFrom localObjectPropertyDomainDataHasValue localObjectPropertyDomainDataMinCardinality localObjectPropertyDomainDataMaxCardinality localObjectPropertyDomainDataExactCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localObjectPropertyDomainClassList='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.objectPropertyAxiom.ontology))' localObjectPropertyDomainObjectIntersectionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))' localObjectPropertyDomainObjectUnionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))' localObjectPropertyDomainObjectSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectComplementOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectOneOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainObjectExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)' localObjectPropertyDomainDataExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)'"
 * @generated
 */
public interface ObjectPropertyDomain extends ObjectPropertyAxiom {
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
	 * @see mowl.mowlPackage#getObjectPropertyDomain_Expressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getExpressions();

} // ObjectPropertyDomain
