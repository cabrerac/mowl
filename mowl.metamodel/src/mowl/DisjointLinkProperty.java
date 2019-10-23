/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Link Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DisjointLinkProperty#getLinkPropertyExpressions <em>Link Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDisjointLinkProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='subLinkPropertyOfLinkPropertyList subLinkPropertyOfLinkPropertyInverseOf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot subLinkPropertyOfLinkPropertyList='\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))' subLinkPropertyOfLinkPropertyInverseOf='\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))'"
 * @generated
 */
public interface DisjointLinkProperty extends LinkPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Link Property Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.LinkPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Property Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Property Expressions</em>' containment reference list.
	 * @see mowl.mowlPackage#getDisjointLinkProperty_LinkPropertyExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<LinkPropertyExpression> getLinkPropertyExpressions();

} // DisjointLinkProperty
