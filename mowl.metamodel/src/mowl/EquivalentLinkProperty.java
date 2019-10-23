/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Link Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.EquivalentLinkProperty#getLinkPropertyExpressions <em>Link Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getEquivalentLinkProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='equivalentLinkPropertyList equivalentLinkPropertyInverseOf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot equivalentLinkPropertyList='\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))' equivalentLinkPropertyInverseOf='\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))'"
 * @generated
 */
public interface EquivalentLinkProperty extends LinkPropertyAxiom {
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
	 * @see mowl.mowlPackage#getEquivalentLinkProperty_LinkPropertyExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<LinkPropertyExpression> getLinkPropertyExpressions();

} // EquivalentLinkProperty
