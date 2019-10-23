/**
 */
package mowl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage
 * @generated
 */
public interface mowlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	mowlFactory eINSTANCE = mowl.impl.mowlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiontology</em>'.
	 * @generated
	 */
	Multiontology createMultiontology();

	/**
	 * Returns a new object of class '<em>Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Property</em>'.
	 * @generated
	 */
	LinkProperty createLinkProperty();

	/**
	 * Returns a new object of class '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Link Property</em>'.
	 * @generated
	 */
	EquivalentLinkProperty createEquivalentLinkProperty();

	/**
	 * Returns a new object of class '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Link Property Of</em>'.
	 * @generated
	 */
	SubLinkPropertyOf createSubLinkPropertyOf();

	/**
	 * Returns a new object of class '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjoint Link Property</em>'.
	 * @generated
	 */
	DisjointLinkProperty createDisjointLinkProperty();

	/**
	 * Returns a new object of class '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Link Property</em>'.
	 * @generated
	 */
	DomainLinkProperty createDomainLinkProperty();

	/**
	 * Returns a new object of class '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Link Property Of</em>'.
	 * @generated
	 */
	RangeLinkPropertyOf createRangeLinkPropertyOf();

	/**
	 * Returns a new object of class '<em>Link Property List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Property List</em>'.
	 * @generated
	 */
	LinkPropertyList createLinkPropertyList();

	/**
	 * Returns a new object of class '<em>Link Property Inverse Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Property Inverse Of</em>'.
	 * @generated
	 */
	LinkPropertyInverseOf createLinkPropertyInverseOf();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property</em>'.
	 * @generated
	 */
	ObjectProperty createObjectProperty();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Individual</em>'.
	 * @generated
	 */
	NamedIndividual createNamedIndividual();

	/**
	 * Returns a new object of class '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Individual</em>'.
	 * @generated
	 */
	AnonymousIndividual createAnonymousIndividual();

	/**
	 * Returns a new object of class '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjoint Class</em>'.
	 * @generated
	 */
	DisjointClass createDisjointClass();

	/**
	 * Returns a new object of class '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjoint Union</em>'.
	 * @generated
	 */
	DisjointUnion createDisjointUnion();

	/**
	 * Returns a new object of class '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Class</em>'.
	 * @generated
	 */
	EquivalentClass createEquivalentClass();

	/**
	 * Returns a new object of class '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Class Of</em>'.
	 * @generated
	 */
	SubClassOf createSubClassOf();

	/**
	 * Returns a new object of class '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjoint Object Property</em>'.
	 * @generated
	 */
	DisjointObjectProperty createDisjointObjectProperty();

	/**
	 * Returns a new object of class '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Object Property</em>'.
	 * @generated
	 */
	EquivalentObjectProperty createEquivalentObjectProperty();

	/**
	 * Returns a new object of class '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Object Property Of</em>'.
	 * @generated
	 */
	SubObjectPropertyOf createSubObjectPropertyOf();

	/**
	 * Returns a new object of class '<em>Inverse Object Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Object Property Axiom</em>'.
	 * @generated
	 */
	InverseObjectPropertyAxiom createInverseObjectPropertyAxiom();

	/**
	 * Returns a new object of class '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property Domain</em>'.
	 * @generated
	 */
	ObjectPropertyDomain createObjectPropertyDomain();

	/**
	 * Returns a new object of class '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property Range</em>'.
	 * @generated
	 */
	ObjectPropertyRange createObjectPropertyRange();

	/**
	 * Returns a new object of class '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Domain</em>'.
	 * @generated
	 */
	DataPropertyDomain createDataPropertyDomain();

	/**
	 * Returns a new object of class '<em>Data Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Range</em>'.
	 * @generated
	 */
	DataPropertyRange createDataPropertyRange();

	/**
	 * Returns a new object of class '<em>Disjoint Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjoint Data Property</em>'.
	 * @generated
	 */
	DisjointDataProperty createDisjointDataProperty();

	/**
	 * Returns a new object of class '<em>Equivalent Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Data Property</em>'.
	 * @generated
	 */
	EquivalentDataProperty createEquivalentDataProperty();

	/**
	 * Returns a new object of class '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Data Property Of</em>'.
	 * @generated
	 */
	SubDataPropertyOf createSubDataPropertyOf();

	/**
	 * Returns a new object of class '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Assertion</em>'.
	 * @generated
	 */
	ClassAssertion createClassAssertion();

	/**
	 * Returns a new object of class '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same Individual</em>'.
	 * @generated
	 */
	SameIndividual createSameIndividual();

	/**
	 * Returns a new object of class '<em>Different Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Different Individual</em>'.
	 * @generated
	 */
	DifferentIndividual createDifferentIndividual();

	/**
	 * Returns a new object of class '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property Assertion</em>'.
	 * @generated
	 */
	ObjectPropertyAssertion createObjectPropertyAssertion();

	/**
	 * Returns a new object of class '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Object Property Assertion</em>'.
	 * @generated
	 */
	NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion();

	/**
	 * Returns a new object of class '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Assertion</em>'.
	 * @generated
	 */
	DataPropertyAssertion createDataPropertyAssertion();

	/**
	 * Returns a new object of class '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Data Property Assertion</em>'.
	 * @generated
	 */
	NegativeDataPropertyAssertion createNegativeDataPropertyAssertion();

	/**
	 * Returns a new object of class '<em>Class List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class List</em>'.
	 * @generated
	 */
	ClassList createClassList();

	/**
	 * Returns a new object of class '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Intersection Of</em>'.
	 * @generated
	 */
	ObjectIntersectionOf createObjectIntersectionOf();

	/**
	 * Returns a new object of class '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Union Of</em>'.
	 * @generated
	 */
	ObjectUnionOf createObjectUnionOf();

	/**
	 * Returns a new object of class '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Complement Of</em>'.
	 * @generated
	 */
	ObjectComplementOf createObjectComplementOf();

	/**
	 * Returns a new object of class '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object One Of</em>'.
	 * @generated
	 */
	ObjectOneOf createObjectOneOf();

	/**
	 * Returns a new object of class '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Some Values From</em>'.
	 * @generated
	 */
	ObjectSomeValuesFrom createObjectSomeValuesFrom();

	/**
	 * Returns a new object of class '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object All Values From</em>'.
	 * @generated
	 */
	ObjectAllValuesFrom createObjectAllValuesFrom();

	/**
	 * Returns a new object of class '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Has Value</em>'.
	 * @generated
	 */
	ObjectHasValue createObjectHasValue();

	/**
	 * Returns a new object of class '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Min Cardinality</em>'.
	 * @generated
	 */
	ObjectMinCardinality createObjectMinCardinality();

	/**
	 * Returns a new object of class '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Max Cardinality</em>'.
	 * @generated
	 */
	ObjectMaxCardinality createObjectMaxCardinality();

	/**
	 * Returns a new object of class '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Exact Cardinality</em>'.
	 * @generated
	 */
	ObjectExactCardinality createObjectExactCardinality();

	/**
	 * Returns a new object of class '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Some Values From</em>'.
	 * @generated
	 */
	DataSomeValuesFrom createDataSomeValuesFrom();

	/**
	 * Returns a new object of class '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data All Values From</em>'.
	 * @generated
	 */
	DataAllValuesFrom createDataAllValuesFrom();

	/**
	 * Returns a new object of class '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Has Value</em>'.
	 * @generated
	 */
	DataHasValue createDataHasValue();

	/**
	 * Returns a new object of class '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Min Cardinality</em>'.
	 * @generated
	 */
	DataMinCardinality createDataMinCardinality();

	/**
	 * Returns a new object of class '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Max Cardinality</em>'.
	 * @generated
	 */
	DataMaxCardinality createDataMaxCardinality();

	/**
	 * Returns a new object of class '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Exact Cardinality</em>'.
	 * @generated
	 */
	DataExactCardinality createDataExactCardinality();

	/**
	 * Returns a new object of class '<em>Link Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Some Values From</em>'.
	 * @generated
	 */
	LinkSomeValuesFrom createLinkSomeValuesFrom();

	/**
	 * Returns a new object of class '<em>Link All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link All Values From</em>'.
	 * @generated
	 */
	LinkAllValuesFrom createLinkAllValuesFrom();

	/**
	 * Returns a new object of class '<em>Link Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Has Value</em>'.
	 * @generated
	 */
	LinkHasValue createLinkHasValue();

	/**
	 * Returns a new object of class '<em>Link Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Min Cardinality</em>'.
	 * @generated
	 */
	LinkMinCardinality createLinkMinCardinality();

	/**
	 * Returns a new object of class '<em>Link Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Max Cardinality</em>'.
	 * @generated
	 */
	LinkMaxCardinality createLinkMaxCardinality();

	/**
	 * Returns a new object of class '<em>Link Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Exact Cardinality</em>'.
	 * @generated
	 */
	LinkExactCardinality createLinkExactCardinality();

	/**
	 * Returns a new object of class '<em>Object Property List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property List</em>'.
	 * @generated
	 */
	ObjectPropertyList createObjectPropertyList();

	/**
	 * Returns a new object of class '<em>Inverse Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Object Property</em>'.
	 * @generated
	 */
	InverseObjectProperty createInverseObjectProperty();

	/**
	 * Returns a new object of class '<em>Data Property List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property List</em>'.
	 * @generated
	 */
	DataPropertyList createDataPropertyList();

	/**
	 * Returns a new object of class '<em>Constant Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Annotation</em>'.
	 * @generated
	 */
	ConstantAnnotation createConstantAnnotation();

	/**
	 * Returns a new object of class '<em>Annotation By Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation By Entity</em>'.
	 * @generated
	 */
	AnnotationByEntity createAnnotationByEntity();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	mowlPackage getmowlPackage();

} //mowlFactory
