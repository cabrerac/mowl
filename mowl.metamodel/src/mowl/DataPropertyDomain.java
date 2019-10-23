/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DataPropertyDomain#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDataPropertyDomain()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localDataPropertyDomainClassList localDataPropertyDomainObjectIntersectionOf localDataPropertyDomainObjectUnionOf localDataPropertyDomainObjectSomeValuesFrom localDataPropertyDomainObjectAllValuesFrom localDataPropertyDomainObjectHasValue localDataPropertyDomainObjectComplementOf localDataPropertyDomainObjectOneOf localDataPropertyDomainObjectMinCardinality localDataPropertyDomainObjectMaxCardinality localDataPropertyDomainObjectExactCardinality localDataPropertyDomainDataSomeValuesFrom localDataPropertyDomainDataAllValuesFrom localDataPropertyDomainDataHasValue localDataPropertyDomainDataMinCardinality localDataPropertyDomainDataMaxCardinality localDataPropertyDomainDataExactCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localDataPropertyDomainClassList='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.dataPropertyAxiom.ontology))' localDataPropertyDomainObjectIntersectionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))' localDataPropertyDomainObjectUnionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))' localDataPropertyDomainObjectSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectComplementOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectOneOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainObjectExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)' localDataPropertyDomainDataExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)'"
 * @generated
 */
public interface DataPropertyDomain extends DataPropertyAxiom {
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
	 * @see mowl.mowlPackage#getDataPropertyDomain_Expressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getExpressions();

} // DataPropertyDomain
