/**
 */
package mowl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>Any Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_URI_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_URI(1, "anyUri", "anyUri"),

	/**
	 * The '<em><b>Based64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASED64_BINARY(2, "based64Binary", "based64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(3, "boolean", "boolean"),

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(4, "byte", "byte"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(5, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Date Time Stamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_STAMP_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME_STAMP(6, "dateTimeStamp", "dateTimeStamp"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(7, "decimal", "decimal"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(8, "double", "double"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(9, "float", "float"),

	/**
	 * The '<em><b>Hex Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	HEX_BINARY(10, "hexBinary", "hexBinary"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(11, "int", "int"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(12, "integer", "integer"),

	/**
	 * The '<em><b>Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LANGUAGE(13, "language", "language"),

	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(14, "literal", "literal"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(15, "long", "long"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(16, "name", "name"),

	/**
	 * The '<em><b>NC Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NC_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NC_NAME(17, "nCName", "nCName"),

	/**
	 * The '<em><b>Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_INTEGER(18, "negativeInteger", "negativeInteger"),

	/**
	 * The '<em><b>NMTOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NMTOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	NMTOKEN(19, "nMTOKEN", "nMTOKEN"),

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NEGATIVE_INTEGER(20, "nonNegativeInteger", "nonNegativeInteger"),

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_POSITIVE_INTEGER(21, "nonPositiveInteger", "nonPositiveInteger"),

	/**
	 * The '<em><b>Normalized String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZED_STRING(22, "normalizedString", "normalizedString"),

	/**
	 * The '<em><b>Plain Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN_LITERAL(23, "plainLiteral", "plainLiteral"),

	/**
	 * The '<em><b>Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INTEGER(24, "positiveInteger", "positiveInteger"),

	/**
	 * The '<em><b>Rational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONAL(25, "rational", "rational"),

	/**
	 * The '<em><b>Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(26, "real", "real"),

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(27, "short", "short"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(28, "string", "string"),

	/**
	 * The '<em><b>Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(29, "token", "token"),

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_BYTE(30, "unsignedByte", "unsignedByte"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(31, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG(32, "unsignedLong", "unsignedLong"),

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_SHORT(33, "unsignedShort", "unsignedShort"),

	/**
	 * The '<em><b>Xml Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	XML_LITERAL(34, "xmlLiteral", "xmlLiteral");

	/**
	 * The '<em><b>Any Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Uri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_URI
	 * @model name="anyUri"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_URI_VALUE = 1;

	/**
	 * The '<em><b>Based64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Based64 Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASED64_BINARY
	 * @model name="based64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASED64_BINARY_VALUE = 2;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 4;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 5;

	/**
	 * The '<em><b>Date Time Stamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time Stamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_STAMP
	 * @model name="dateTimeStamp"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_STAMP_VALUE = 6;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 7;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 8;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 9;

	/**
	 * The '<em><b>Hex Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hex Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY
	 * @model name="hexBinary"
	 * @generated
	 * @ordered
	 */
	public static final int HEX_BINARY_VALUE = 10;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 11;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 12;

	/**
	 * The '<em><b>Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE
	 * @model name="language"
	 * @generated
	 * @ordered
	 */
	public static final int LANGUAGE_VALUE = 13;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model name="literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 14;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 15;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 16;

	/**
	 * The '<em><b>NC Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NC Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NC_NAME
	 * @model name="nCName"
	 * @generated
	 * @ordered
	 */
	public static final int NC_NAME_VALUE = 17;

	/**
	 * The '<em><b>Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negative Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER
	 * @model name="negativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_INTEGER_VALUE = 18;

	/**
	 * The '<em><b>NMTOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NMTOKEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NMTOKEN
	 * @model name="nMTOKEN"
	 * @generated
	 * @ordered
	 */
	public static final int NMTOKEN_VALUE = 19;

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Negative Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER
	 * @model name="nonNegativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NEGATIVE_INTEGER_VALUE = 20;

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Positive Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER
	 * @model name="nonPositiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_POSITIVE_INTEGER_VALUE = 21;

	/**
	 * The '<em><b>Normalized String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalized String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_STRING
	 * @model name="normalizedString"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZED_STRING_VALUE = 22;

	/**
	 * The '<em><b>Plain Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plain Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAIN_LITERAL
	 * @model name="plainLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_LITERAL_VALUE = 23;

	/**
	 * The '<em><b>Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Positive Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER
	 * @model name="positiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INTEGER_VALUE = 24;

	/**
	 * The '<em><b>Rational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rational</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATIONAL
	 * @model name="rational"
	 * @generated
	 * @ordered
	 */
	public static final int RATIONAL_VALUE = 25;

	/**
	 * The '<em><b>Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model name="real"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 26;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 27;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 28;

	/**
	 * The '<em><b>Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model name="token"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 29;

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE
	 * @model name="unsignedByte"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_BYTE_VALUE = 30;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 31;

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @model name="unsignedLong"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_VALUE = 32;

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT
	 * @model name="unsignedShort"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_SHORT_VALUE = 33;

	/**
	 * The '<em><b>Xml Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xml Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_LITERAL
	 * @model name="xmlLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int XML_LITERAL_VALUE = 34;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			ANY_URI,
			BASED64_BINARY,
			BOOLEAN,
			BYTE,
			DATE_TIME,
			DATE_TIME_STAMP,
			DECIMAL,
			DOUBLE,
			FLOAT,
			HEX_BINARY,
			INT,
			INTEGER,
			LANGUAGE,
			LITERAL,
			LONG,
			NAME,
			NC_NAME,
			NEGATIVE_INTEGER,
			NMTOKEN,
			NON_NEGATIVE_INTEGER,
			NON_POSITIVE_INTEGER,
			NORMALIZED_STRING,
			PLAIN_LITERAL,
			POSITIVE_INTEGER,
			RATIONAL,
			REAL,
			SHORT,
			STRING,
			TOKEN,
			UNSIGNED_BYTE,
			UNSIGNED_INT,
			UNSIGNED_LONG,
			UNSIGNED_SHORT,
			XML_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case ANY_URI_VALUE: return ANY_URI;
			case BASED64_BINARY_VALUE: return BASED64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case BYTE_VALUE: return BYTE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DATE_TIME_STAMP_VALUE: return DATE_TIME_STAMP;
			case DECIMAL_VALUE: return DECIMAL;
			case DOUBLE_VALUE: return DOUBLE;
			case FLOAT_VALUE: return FLOAT;
			case HEX_BINARY_VALUE: return HEX_BINARY;
			case INT_VALUE: return INT;
			case INTEGER_VALUE: return INTEGER;
			case LANGUAGE_VALUE: return LANGUAGE;
			case LITERAL_VALUE: return LITERAL;
			case LONG_VALUE: return LONG;
			case NAME_VALUE: return NAME;
			case NC_NAME_VALUE: return NC_NAME;
			case NEGATIVE_INTEGER_VALUE: return NEGATIVE_INTEGER;
			case NMTOKEN_VALUE: return NMTOKEN;
			case NON_NEGATIVE_INTEGER_VALUE: return NON_NEGATIVE_INTEGER;
			case NON_POSITIVE_INTEGER_VALUE: return NON_POSITIVE_INTEGER;
			case NORMALIZED_STRING_VALUE: return NORMALIZED_STRING;
			case PLAIN_LITERAL_VALUE: return PLAIN_LITERAL;
			case POSITIVE_INTEGER_VALUE: return POSITIVE_INTEGER;
			case RATIONAL_VALUE: return RATIONAL;
			case REAL_VALUE: return REAL;
			case SHORT_VALUE: return SHORT;
			case STRING_VALUE: return STRING;
			case TOKEN_VALUE: return TOKEN;
			case UNSIGNED_BYTE_VALUE: return UNSIGNED_BYTE;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case UNSIGNED_LONG_VALUE: return UNSIGNED_LONG;
			case UNSIGNED_SHORT_VALUE: return UNSIGNED_SHORT;
			case XML_LITERAL_VALUE: return XML_LITERAL;
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
	private DataType(int value, String name, String literal) {
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
	
} //DataType
