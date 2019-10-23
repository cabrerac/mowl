/**
 */
package mowl.impl;

import mowl.Constant;
import mowl.DataType;
import mowl.Ontology;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mowl.impl.ConstantImpl#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link mowl.impl.ConstantImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link mowl.impl.ConstantImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantImpl extends MinimalEObjectImpl.Container implements Constant {
	/**
	 * The default value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String LEXICAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalValue()
	 * @generated
	 * @ordered
	 */
	protected String lexicalValue = LEXICAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATATYPE_EDEFAULT = DataType.ANY_URI;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype = DATATYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mowlPackage.Literals.CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalValue() {
		return lexicalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalValue(String newLexicalValue) {
		String oldLexicalValue = lexicalValue;
		lexicalValue = newLexicalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.CONSTANT__LEXICAL_VALUE, oldLexicalValue, lexicalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype == null ? DATATYPE_EDEFAULT : newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mowlPackage.CONSTANT__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology() {
		if (eContainerFeatureID() != mowlPackage.CONSTANT__ONTOLOGY) return null;
		return (Ontology)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.CONSTANT__ONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, mowlPackage.CONSTANT__ONTOLOGY, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mowlPackage.CONSTANT__ONTOLOGY:
				return eBasicSetContainer(null, mowlPackage.CONSTANT__ONTOLOGY, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case mowlPackage.CONSTANT__ONTOLOGY:
				return eInternalContainer().eInverseRemove(this, mowlPackage.ONTOLOGY__LITERALS, Ontology.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mowlPackage.CONSTANT__LEXICAL_VALUE:
				return getLexicalValue();
			case mowlPackage.CONSTANT__DATATYPE:
				return getDatatype();
			case mowlPackage.CONSTANT__ONTOLOGY:
				return getOntology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mowlPackage.CONSTANT__LEXICAL_VALUE:
				setLexicalValue((String)newValue);
				return;
			case mowlPackage.CONSTANT__DATATYPE:
				setDatatype((DataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case mowlPackage.CONSTANT__LEXICAL_VALUE:
				setLexicalValue(LEXICAL_VALUE_EDEFAULT);
				return;
			case mowlPackage.CONSTANT__DATATYPE:
				setDatatype(DATATYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mowlPackage.CONSTANT__LEXICAL_VALUE:
				return LEXICAL_VALUE_EDEFAULT == null ? lexicalValue != null : !LEXICAL_VALUE_EDEFAULT.equals(lexicalValue);
			case mowlPackage.CONSTANT__DATATYPE:
				return datatype != DATATYPE_EDEFAULT;
			case mowlPackage.CONSTANT__ONTOLOGY:
				return getOntology() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lexicalValue: ");
		result.append(lexicalValue);
		result.append(", datatype: ");
		result.append(datatype);
		result.append(')');
		return result.toString();
	}

} //ConstantImpl
