/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.DisjointDataProperty#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getDisjointDataProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='localDisjointDataPropertyClassList'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot localDisjointDataPropertyClassList='\n\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))'"
 * @generated
 */
public interface DisjointDataProperty extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link mowl.DataPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
	 * @see mowl.mowlPackage#getDisjointDataProperty_DataPropertyExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataPropertyExpression> getDataPropertyExpressions();

} // DisjointDataProperty
