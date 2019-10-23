/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.EquivalentObjectProperty#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getEquivalentObjectProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localEquivalentObjectPropertyObjectPropertyList localEquivalentObjectPropertyInverseObjectProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localEquivalentObjectPropertyObjectPropertyList='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))' localEquivalentObjectPropertyInverseObjectProperty='\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))'"
 * @generated
 */
public interface EquivalentObjectProperty extends ObjectPropertyAxiom {
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
	 * @see mowl.mowlPackage#getEquivalentObjectProperty_ObjectPropertyExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // EquivalentObjectProperty
