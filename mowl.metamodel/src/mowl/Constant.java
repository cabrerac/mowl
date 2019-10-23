/**
 */
package mowl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Constant#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link mowl.Constant#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link mowl.Constant#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getConstant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constantLexicalValueEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot constantLexicalValueEmpty='self.lexicalValue.trim().size()>0'"
 * @generated
 */
public interface Constant extends EObject {
	/**
	 * Returns the value of the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Value</em>' attribute.
	 * @see #setLexicalValue(String)
	 * @see mowl.mowlPackage#getConstant_LexicalValue()
	 * @model required="true"
	 * @generated
	 */
	String getLexicalValue();

	/**
	 * Sets the value of the '{@link mowl.Constant#getLexicalValue <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Value</em>' attribute.
	 * @see #getLexicalValue()
	 * @generated
	 */
	void setLexicalValue(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link mowl.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see mowl.DataType
	 * @see #setDatatype(DataType)
	 * @see mowl.mowlPackage#getConstant_Datatype()
	 * @model
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link mowl.Constant#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see mowl.DataType
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mowl.Ontology#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see mowl.mowlPackage#getConstant_Ontology()
	 * @see mowl.Ontology#getLiterals
	 * @model opposite="literals" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Ontology getOntology();

} // Constant
