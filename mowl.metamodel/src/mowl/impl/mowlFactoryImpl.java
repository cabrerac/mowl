/**
 */
package mowl.impl;

import mowl.AnnotationByEntity;
import mowl.AnnotationProperty;
import mowl.AnonymousIndividual;
import mowl.ClassAssertion;
import mowl.ClassList;
import mowl.Constant;
import mowl.ConstantAnnotation;
import mowl.DataAllValuesFrom;
import mowl.DataExactCardinality;
import mowl.DataHasValue;
import mowl.DataMaxCardinality;
import mowl.DataMinCardinality;
import mowl.DataProperty;
import mowl.DataPropertyAssertion;
import mowl.DataPropertyDomain;
import mowl.DataPropertyList;
import mowl.DataPropertyRange;
import mowl.DataSomeValuesFrom;
import mowl.DataType;
import mowl.DifferentIndividual;
import mowl.DisjointClass;
import mowl.DisjointDataProperty;
import mowl.DisjointLinkProperty;
import mowl.DisjointObjectProperty;
import mowl.DisjointUnion;
import mowl.DomainLinkProperty;
import mowl.EquivalentClass;
import mowl.EquivalentDataProperty;
import mowl.EquivalentLinkProperty;
import mowl.EquivalentObjectProperty;
import mowl.InverseObjectProperty;
import mowl.InverseObjectPropertyAxiom;
import mowl.LinkAllValuesFrom;
import mowl.LinkExactCardinality;
import mowl.LinkHasValue;
import mowl.LinkMaxCardinality;
import mowl.LinkMinCardinality;
import mowl.LinkProperty;
import mowl.LinkPropertyInverseOf;
import mowl.LinkPropertyList;
import mowl.LinkSomeValuesFrom;
import mowl.Multiontology;
import mowl.NamedIndividual;
import mowl.NegativeDataPropertyAssertion;
import mowl.NegativeObjectPropertyAssertion;
import mowl.ObjectAllValuesFrom;
import mowl.ObjectComplementOf;
import mowl.ObjectExactCardinality;
import mowl.ObjectHasValue;
import mowl.ObjectIntersectionOf;
import mowl.ObjectMaxCardinality;
import mowl.ObjectMinCardinality;
import mowl.ObjectOneOf;
import mowl.ObjectProperty;
import mowl.ObjectPropertyAssertion;
import mowl.ObjectPropertyDomain;
import mowl.ObjectPropertyList;
import mowl.ObjectPropertyRange;
import mowl.ObjectSomeValuesFrom;
import mowl.ObjectUnionOf;
import mowl.Ontology;
import mowl.RangeLinkPropertyOf;
import mowl.SameIndividual;
import mowl.SubClassOf;
import mowl.SubDataPropertyOf;
import mowl.SubLinkPropertyOf;
import mowl.SubObjectPropertyOf;
import mowl.mowlFactory;
import mowl.mowlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class mowlFactoryImpl extends EFactoryImpl implements mowlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static mowlFactory init() {
		try {
			mowlFactory themowlFactory = (mowlFactory)EPackage.Registry.INSTANCE.getEFactory(mowlPackage.eNS_URI);
			if (themowlFactory != null) {
				return themowlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mowlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mowlPackage.MULTIONTOLOGY: return createMultiontology();
			case mowlPackage.LINK_PROPERTY: return createLinkProperty();
			case mowlPackage.EQUIVALENT_LINK_PROPERTY: return createEquivalentLinkProperty();
			case mowlPackage.SUB_LINK_PROPERTY_OF: return createSubLinkPropertyOf();
			case mowlPackage.DISJOINT_LINK_PROPERTY: return createDisjointLinkProperty();
			case mowlPackage.DOMAIN_LINK_PROPERTY: return createDomainLinkProperty();
			case mowlPackage.RANGE_LINK_PROPERTY_OF: return createRangeLinkPropertyOf();
			case mowlPackage.LINK_PROPERTY_LIST: return createLinkPropertyList();
			case mowlPackage.LINK_PROPERTY_INVERSE_OF: return createLinkPropertyInverseOf();
			case mowlPackage.ONTOLOGY: return createOntology();
			case mowlPackage.CLASS: return createClass();
			case mowlPackage.OBJECT_PROPERTY: return createObjectProperty();
			case mowlPackage.DATA_PROPERTY: return createDataProperty();
			case mowlPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case mowlPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case mowlPackage.DISJOINT_CLASS: return createDisjointClass();
			case mowlPackage.DISJOINT_UNION: return createDisjointUnion();
			case mowlPackage.EQUIVALENT_CLASS: return createEquivalentClass();
			case mowlPackage.SUB_CLASS_OF: return createSubClassOf();
			case mowlPackage.DISJOINT_OBJECT_PROPERTY: return createDisjointObjectProperty();
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY: return createEquivalentObjectProperty();
			case mowlPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM: return createInverseObjectPropertyAxiom();
			case mowlPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
			case mowlPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
			case mowlPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
			case mowlPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
			case mowlPackage.DISJOINT_DATA_PROPERTY: return createDisjointDataProperty();
			case mowlPackage.EQUIVALENT_DATA_PROPERTY: return createEquivalentDataProperty();
			case mowlPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
			case mowlPackage.CLASS_ASSERTION: return createClassAssertion();
			case mowlPackage.SAME_INDIVIDUAL: return createSameIndividual();
			case mowlPackage.DIFFERENT_INDIVIDUAL: return createDifferentIndividual();
			case mowlPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
			case mowlPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
			case mowlPackage.CLASS_LIST: return createClassList();
			case mowlPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
			case mowlPackage.OBJECT_UNION_OF: return createObjectUnionOf();
			case mowlPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
			case mowlPackage.OBJECT_ONE_OF: return createObjectOneOf();
			case mowlPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
			case mowlPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
			case mowlPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
			case mowlPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
			case mowlPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
			case mowlPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
			case mowlPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
			case mowlPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
			case mowlPackage.DATA_HAS_VALUE: return createDataHasValue();
			case mowlPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
			case mowlPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
			case mowlPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
			case mowlPackage.LINK_SOME_VALUES_FROM: return createLinkSomeValuesFrom();
			case mowlPackage.LINK_ALL_VALUES_FROM: return createLinkAllValuesFrom();
			case mowlPackage.LINK_HAS_VALUE: return createLinkHasValue();
			case mowlPackage.LINK_MIN_CARDINALITY: return createLinkMinCardinality();
			case mowlPackage.LINK_MAX_CARDINALITY: return createLinkMaxCardinality();
			case mowlPackage.LINK_EXACT_CARDINALITY: return createLinkExactCardinality();
			case mowlPackage.OBJECT_PROPERTY_LIST: return createObjectPropertyList();
			case mowlPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
			case mowlPackage.DATA_PROPERTY_LIST: return createDataPropertyList();
			case mowlPackage.CONSTANT_ANNOTATION: return createConstantAnnotation();
			case mowlPackage.ANNOTATION_BY_ENTITY: return createAnnotationByEntity();
			case mowlPackage.CONSTANT: return createConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case mowlPackage.ANNOTATION_PROPERTY:
				return createAnnotationPropertyFromString(eDataType, initialValue);
			case mowlPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case mowlPackage.ANNOTATION_PROPERTY:
				return convertAnnotationPropertyToString(eDataType, instanceValue);
			case mowlPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiontology createMultiontology() {
		MultiontologyImpl multiontology = new MultiontologyImpl();
		return multiontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProperty createLinkProperty() {
		LinkPropertyImpl linkProperty = new LinkPropertyImpl();
		return linkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentLinkProperty createEquivalentLinkProperty() {
		EquivalentLinkPropertyImpl equivalentLinkProperty = new EquivalentLinkPropertyImpl();
		return equivalentLinkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLinkPropertyOf createSubLinkPropertyOf() {
		SubLinkPropertyOfImpl subLinkPropertyOf = new SubLinkPropertyOfImpl();
		return subLinkPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointLinkProperty createDisjointLinkProperty() {
		DisjointLinkPropertyImpl disjointLinkProperty = new DisjointLinkPropertyImpl();
		return disjointLinkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainLinkProperty createDomainLinkProperty() {
		DomainLinkPropertyImpl domainLinkProperty = new DomainLinkPropertyImpl();
		return domainLinkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeLinkPropertyOf createRangeLinkPropertyOf() {
		RangeLinkPropertyOfImpl rangeLinkPropertyOf = new RangeLinkPropertyOfImpl();
		return rangeLinkPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPropertyList createLinkPropertyList() {
		LinkPropertyListImpl linkPropertyList = new LinkPropertyListImpl();
		return linkPropertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPropertyInverseOf createLinkPropertyInverseOf() {
		LinkPropertyInverseOfImpl linkPropertyInverseOf = new LinkPropertyInverseOfImpl();
		return linkPropertyInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowl.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointClass createDisjointClass() {
		DisjointClassImpl disjointClass = new DisjointClassImpl();
		return disjointClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointUnion createDisjointUnion() {
		DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
		return disjointUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentClass createEquivalentClass() {
		EquivalentClassImpl equivalentClass = new EquivalentClassImpl();
		return equivalentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf createSubClassOf() {
		SubClassOfImpl subClassOf = new SubClassOfImpl();
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointObjectProperty createDisjointObjectProperty() {
		DisjointObjectPropertyImpl disjointObjectProperty = new DisjointObjectPropertyImpl();
		return disjointObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentObjectProperty createEquivalentObjectProperty() {
		EquivalentObjectPropertyImpl equivalentObjectProperty = new EquivalentObjectPropertyImpl();
		return equivalentObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyOf createSubObjectPropertyOf() {
		SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
		return subObjectPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectPropertyAxiom createInverseObjectPropertyAxiom() {
		InverseObjectPropertyAxiomImpl inverseObjectPropertyAxiom = new InverseObjectPropertyAxiomImpl();
		return inverseObjectPropertyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyDomain createObjectPropertyDomain() {
		ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
		return objectPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyRange createObjectPropertyRange() {
		ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
		return objectPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyDomain createDataPropertyDomain() {
		DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
		return dataPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyRange createDataPropertyRange() {
		DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
		return dataPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointDataProperty createDisjointDataProperty() {
		DisjointDataPropertyImpl disjointDataProperty = new DisjointDataPropertyImpl();
		return disjointDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentDataProperty createEquivalentDataProperty() {
		EquivalentDataPropertyImpl equivalentDataProperty = new EquivalentDataPropertyImpl();
		return equivalentDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDataPropertyOf createSubDataPropertyOf() {
		SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
		return subDataPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAssertion createClassAssertion() {
		ClassAssertionImpl classAssertion = new ClassAssertionImpl();
		return classAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameIndividual createSameIndividual() {
		SameIndividualImpl sameIndividual = new SameIndividualImpl();
		return sameIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentIndividual createDifferentIndividual() {
		DifferentIndividualImpl differentIndividual = new DifferentIndividualImpl();
		return differentIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyAssertion createObjectPropertyAssertion() {
		ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
		return objectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion() {
		NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
		return negativeObjectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyAssertion createDataPropertyAssertion() {
		DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
		return dataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion() {
		NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
		return negativeDataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassList createClassList() {
		ClassListImpl classList = new ClassListImpl();
		return classList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIntersectionOf createObjectIntersectionOf() {
		ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnionOf createObjectUnionOf() {
		ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComplementOf createObjectComplementOf() {
		ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOneOf createObjectOneOf() {
		ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSomeValuesFrom createObjectSomeValuesFrom() {
		ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAllValuesFrom createObjectAllValuesFrom() {
		ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasValue createObjectHasValue() {
		ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMinCardinality createObjectMinCardinality() {
		ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMaxCardinality createObjectMaxCardinality() {
		ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExactCardinality createObjectExactCardinality() {
		ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSomeValuesFrom createDataSomeValuesFrom() {
		DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAllValuesFrom createDataAllValuesFrom() {
		DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHasValue createDataHasValue() {
		DataHasValueImpl dataHasValue = new DataHasValueImpl();
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMinCardinality createDataMinCardinality() {
		DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMaxCardinality createDataMaxCardinality() {
		DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExactCardinality createDataExactCardinality() {
		DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSomeValuesFrom createLinkSomeValuesFrom() {
		LinkSomeValuesFromImpl linkSomeValuesFrom = new LinkSomeValuesFromImpl();
		return linkSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkAllValuesFrom createLinkAllValuesFrom() {
		LinkAllValuesFromImpl linkAllValuesFrom = new LinkAllValuesFromImpl();
		return linkAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHasValue createLinkHasValue() {
		LinkHasValueImpl linkHasValue = new LinkHasValueImpl();
		return linkHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMinCardinality createLinkMinCardinality() {
		LinkMinCardinalityImpl linkMinCardinality = new LinkMinCardinalityImpl();
		return linkMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMaxCardinality createLinkMaxCardinality() {
		LinkMaxCardinalityImpl linkMaxCardinality = new LinkMaxCardinalityImpl();
		return linkMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkExactCardinality createLinkExactCardinality() {
		LinkExactCardinalityImpl linkExactCardinality = new LinkExactCardinalityImpl();
		return linkExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyList createObjectPropertyList() {
		ObjectPropertyListImpl objectPropertyList = new ObjectPropertyListImpl();
		return objectPropertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectProperty createInverseObjectProperty() {
		InverseObjectPropertyImpl inverseObjectProperty = new InverseObjectPropertyImpl();
		return inverseObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyList createDataPropertyList() {
		DataPropertyListImpl dataPropertyList = new DataPropertyListImpl();
		return dataPropertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantAnnotation createConstantAnnotation() {
		ConstantAnnotationImpl constantAnnotation = new ConstantAnnotationImpl();
		return constantAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationByEntity createAnnotationByEntity() {
		AnnotationByEntityImpl annotationByEntity = new AnnotationByEntityImpl();
		return annotationByEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationPropertyFromString(EDataType eDataType, String initialValue) {
		AnnotationProperty result = AnnotationProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlPackage getmowlPackage() {
		return (mowlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mowlPackage getPackage() {
		return mowlPackage.eINSTANCE;
	}

} //mowlFactoryImpl
