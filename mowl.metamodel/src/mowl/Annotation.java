/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Annotation#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link mowl.Annotation#getAnnotationTarget <em>Annotation Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation Property</b></em>' attribute.
	 * The literals are from the enumeration {@link mowl.AnnotationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Property</em>' attribute.
	 * @see mowl.AnnotationProperty
	 * @see #setAnnotationProperty(AnnotationProperty)
	 * @see mowl.mowlPackage#getAnnotation_AnnotationProperty()
	 * @model
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link mowl.Annotation#getAnnotationProperty <em>Annotation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Property</em>' attribute.
	 * @see mowl.AnnotationProperty
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	void setAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Annotation Target</b></em>' reference list.
	 * The list contents are of type {@link mowl.Entity}.
	 * It is bidirectional and its opposite is '{@link mowl.Entity#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Target</em>' reference list.
	 * @see mowl.mowlPackage#getAnnotation_AnnotationTarget()
	 * @see mowl.Entity#getAnnotations
	 * @model opposite="annotations" required="true"
	 * @generated
	 */
	EList<Entity> getAnnotationTarget();

} // Annotation
