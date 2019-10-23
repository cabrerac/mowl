/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.SubObjectPropertyOf#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getSubObjectPropertyOf()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localDomainObjectPropertyObjectPropertyList localDomainObjectPropertyInverseObjectProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localDomainObjectPropertyObjectPropertyList='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))' localDomainObjectPropertyInverseObjectProperty='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))'"
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Object Property Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.ObjectPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Expressions</em>' containment reference list.
	 * @see mowl.mowlPackage#getSubObjectPropertyOf_ObjectPropertyExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // SubObjectPropertyOf
