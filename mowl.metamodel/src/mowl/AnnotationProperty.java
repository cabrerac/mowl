/**
 */
package mowl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Annotation Property</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage#getAnnotationProperty()
 * @model
 * @generated
 */
public enum AnnotationProperty implements Enumerator {
	/**
	 * The '<em><b>Backward Compatible With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKWARD_COMPATIBLE_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	BACKWARD_COMPATIBLE_WITH(1, "backwardCompatibleWith", "backwardCompatibleWith"),

	/**
	 * The '<em><b>Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMENT(2, "comment", "comment"),

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(3, "deprecated", "deprecated"),

	/**
	 * The '<em><b>Is Compatible With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_COMPATIBLE_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	IS_COMPATIBLE_WITH(4, "isCompatibleWith", "isCompatibleWith"),

	/**
	 * The '<em><b>Is Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DEFINED(5, "isDefined", "isDefined"),

	/**
	 * The '<em><b>Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(6, "label", "label"),

	/**
	 * The '<em><b>Prior Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_VERSION(7, "priorVersion", "priorVersion"),

	/**
	 * The '<em><b>See Also</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEE_ALSO_VALUE
	 * @generated
	 * @ordered
	 */
	SEE_ALSO(8, "seeAlso", "seeAlso"),

	/**
	 * The '<em><b>Version Info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION_INFO(9, "versionInfo", "versionInfo");

	/**
	 * The '<em><b>Backward Compatible With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Backward Compatible With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKWARD_COMPATIBLE_WITH
	 * @model name="backwardCompatibleWith"
	 * @generated
	 * @ordered
	 */
	public static final int BACKWARD_COMPATIBLE_WITH_VALUE = 1;

	/**
	 * The '<em><b>Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMENT
	 * @model name="comment"
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT_VALUE = 2;

	/**
	 * The '<em><b>Deprecated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deprecated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @model name="deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 3;

	/**
	 * The '<em><b>Is Compatible With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Compatible With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_COMPATIBLE_WITH
	 * @model name="isCompatibleWith"
	 * @generated
	 * @ordered
	 */
	public static final int IS_COMPATIBLE_WITH_VALUE = 4;

	/**
	 * The '<em><b>Is Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_DEFINED
	 * @model name="isDefined"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DEFINED_VALUE = 5;

	/**
	 * The '<em><b>Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Label</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model name="label"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 6;

	/**
	 * The '<em><b>Prior Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Version</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_VERSION
	 * @model name="priorVersion"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_VERSION_VALUE = 7;

	/**
	 * The '<em><b>See Also</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>See Also</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEE_ALSO
	 * @model name="seeAlso"
	 * @generated
	 * @ordered
	 */
	public static final int SEE_ALSO_VALUE = 8;

	/**
	 * The '<em><b>Version Info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Version Info</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERSION_INFO
	 * @model name="versionInfo"
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_INFO_VALUE = 9;

	/**
	 * An array of all the '<em><b>Annotation Property</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnnotationProperty[] VALUES_ARRAY =
		new AnnotationProperty[] {
			BACKWARD_COMPATIBLE_WITH,
			COMMENT,
			DEPRECATED,
			IS_COMPATIBLE_WITH,
			IS_DEFINED,
			LABEL,
			PRIOR_VERSION,
			SEE_ALSO,
			VERSION_INFO,
		};

	/**
	 * A public read-only list of all the '<em><b>Annotation Property</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AnnotationProperty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Annotation Property</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationProperty get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationProperty result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Property</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationProperty getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationProperty result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Property</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationProperty get(int value) {
		switch (value) {
			case BACKWARD_COMPATIBLE_WITH_VALUE: return BACKWARD_COMPATIBLE_WITH;
			case COMMENT_VALUE: return COMMENT;
			case DEPRECATED_VALUE: return DEPRECATED;
			case IS_COMPATIBLE_WITH_VALUE: return IS_COMPATIBLE_WITH;
			case IS_DEFINED_VALUE: return IS_DEFINED;
			case LABEL_VALUE: return LABEL;
			case PRIOR_VERSION_VALUE: return PRIOR_VERSION;
			case SEE_ALSO_VALUE: return SEE_ALSO;
			case VERSION_INFO_VALUE: return VERSION_INFO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AnnotationProperty(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AnnotationProperty
