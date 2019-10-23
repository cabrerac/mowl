/**
 */
package mowl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mowl.Entity#getId <em>Id</em>}</li>
 *   <li>{@link mowl.Entity#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mowl.mowlPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mowl.mowlPackage#getEntity_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mowl.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link mowl.Annotation}.
	 * It is bidirectional and its opposite is '{@link mowl.Annotation#getAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see mowl.mowlPackage#getEntity_Annotations()
	 * @see mowl.Annotation#getAnnotationTarget
	 * @model opposite="annotationTarget" ordered="false"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // Entity
