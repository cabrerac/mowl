/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Link Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DomainLinkProperty#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDomainLinkProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='expressionsClassList expressionsObjectIntersectionOf expressionsObjectUnionOf expressionsObjectSomeValuesFrom expressionsObjectAllValuesFrom expressionsObjectHasValue expressionsObjectComplementOf expressionsObjectOneOf expressionsObjectMinCardinality expressionsObjectMaxCardinality expressionsObjectExactCardinality expressionsDataSomeValuesFrom expressionsDataAllValuesFrom expressionsDataHasValue expressionsDataMinCardinality expressionsDataMaxCardinality expressionsDataExactCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot expressionsClassList='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.linkProperty.sourceOntology))' expressionsObjectIntersectionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))' expressionsObjectUnionOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))' expressionsObjectSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsObjectAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsObjectHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsObjectComplementOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.linkProperty.sourceOntology)' expressionsObjectOneOf='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.linkProperty.sourceOntology)' expressionsObjectMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsObjectMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsObjectExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataSomeValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataAllValuesFrom='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataHasValue='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataMinCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataMaxCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)' expressionsDataExactCardinality='\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)'"
 * @generated
 */
public interface DomainLinkProperty extends LinkPropertyAxiom {
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
	 * @see mowl.mowlPackage#getDomainLinkProperty_Expressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getExpressions();

} // DomainLinkProperty
