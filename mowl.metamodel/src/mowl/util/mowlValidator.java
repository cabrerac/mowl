/**
 */
package mowl.util;

import java.util.Map;

import mowl.Annotation;
import mowl.AnnotationByEntity;
import mowl.AnnotationProperty;
import mowl.AnonymousIndividual;
import mowl.Assertion;
import mowl.Axiom;
import mowl.ClassAssertion;
import mowl.ClassAxiom;
import mowl.ClassExpression;
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
import mowl.DataPropertyAxiom;
import mowl.DataPropertyDomain;
import mowl.DataPropertyExpression;
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
import mowl.EConnectionExpression;
import mowl.EConnector;
import mowl.Entity;
import mowl.EquivalentClass;
import mowl.EquivalentDataProperty;
import mowl.EquivalentLinkProperty;
import mowl.EquivalentObjectProperty;
import mowl.Expression;
import mowl.Individual;
import mowl.InverseObjectProperty;
import mowl.InverseObjectPropertyAxiom;
import mowl.LinkAllValuesFrom;
import mowl.LinkExactCardinality;
import mowl.LinkHasValue;
import mowl.LinkMaxCardinality;
import mowl.LinkMinCardinality;
import mowl.LinkProperty;
import mowl.LinkPropertyAxiom;
import mowl.LinkPropertyExpression;
import mowl.LinkPropertyInverseOf;
import mowl.LinkPropertyList;
import mowl.LinkSomeValuesFrom;
import mowl.Multiontology;
import mowl.MultiontologyAxiom;
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
import mowl.ObjectPropertyAxiom;
import mowl.ObjectPropertyDomain;
import mowl.ObjectPropertyExpression;
import mowl.ObjectPropertyList;
import mowl.ObjectPropertyRange;
import mowl.ObjectSomeValuesFrom;
import mowl.ObjectUnionOf;
import mowl.Ontology;
import mowl.OntologyAxiom;
import mowl.OntologyConnector;
import mowl.RangeLinkPropertyOf;
import mowl.SameIndividual;
import mowl.SubClassOf;
import mowl.SubDataPropertyOf;
import mowl.SubLinkPropertyOf;
import mowl.SubObjectPropertyOf;
import mowl.mowlPackage;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage
 * @generated
 */
public class mowlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final mowlValidator INSTANCE = new mowlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mowl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return mowlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case mowlPackage.MULTIONTOLOGY:
				return validateMultiontology((Multiontology)value, diagnostics, context);
			case mowlPackage.ONTOLOGY_CONNECTOR:
				return validateOntologyConnector((OntologyConnector)value, diagnostics, context);
			case mowlPackage.ECONNECTOR:
				return validateEConnector((EConnector)value, diagnostics, context);
			case mowlPackage.LINK_PROPERTY:
				return validateLinkProperty((LinkProperty)value, diagnostics, context);
			case mowlPackage.AXIOM:
				return validateAxiom((Axiom)value, diagnostics, context);
			case mowlPackage.MULTIONTOLOGY_AXIOM:
				return validateMultiontologyAxiom((MultiontologyAxiom)value, diagnostics, context);
			case mowlPackage.LINK_PROPERTY_AXIOM:
				return validateLinkPropertyAxiom((LinkPropertyAxiom)value, diagnostics, context);
			case mowlPackage.EQUIVALENT_LINK_PROPERTY:
				return validateEquivalentLinkProperty((EquivalentLinkProperty)value, diagnostics, context);
			case mowlPackage.SUB_LINK_PROPERTY_OF:
				return validateSubLinkPropertyOf((SubLinkPropertyOf)value, diagnostics, context);
			case mowlPackage.DISJOINT_LINK_PROPERTY:
				return validateDisjointLinkProperty((DisjointLinkProperty)value, diagnostics, context);
			case mowlPackage.DOMAIN_LINK_PROPERTY:
				return validateDomainLinkProperty((DomainLinkProperty)value, diagnostics, context);
			case mowlPackage.RANGE_LINK_PROPERTY_OF:
				return validateRangeLinkPropertyOf((RangeLinkPropertyOf)value, diagnostics, context);
			case mowlPackage.LINK_PROPERTY_EXPRESSION:
				return validateLinkPropertyExpression((LinkPropertyExpression)value, diagnostics, context);
			case mowlPackage.LINK_PROPERTY_LIST:
				return validateLinkPropertyList((LinkPropertyList)value, diagnostics, context);
			case mowlPackage.LINK_PROPERTY_INVERSE_OF:
				return validateLinkPropertyInverseOf((LinkPropertyInverseOf)value, diagnostics, context);
			case mowlPackage.ONTOLOGY:
				return validateOntology((Ontology)value, diagnostics, context);
			case mowlPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case mowlPackage.CLASS:
				return validateClass((mowl.Class)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY:
				return validateObjectProperty((ObjectProperty)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY:
				return validateDataProperty((DataProperty)value, diagnostics, context);
			case mowlPackage.INDIVIDUAL:
				return validateIndividual((Individual)value, diagnostics, context);
			case mowlPackage.NAMED_INDIVIDUAL:
				return validateNamedIndividual((NamedIndividual)value, diagnostics, context);
			case mowlPackage.ANONYMOUS_INDIVIDUAL:
				return validateAnonymousIndividual((AnonymousIndividual)value, diagnostics, context);
			case mowlPackage.ONTOLOGY_AXIOM:
				return validateOntologyAxiom((OntologyAxiom)value, diagnostics, context);
			case mowlPackage.CLASS_AXIOM:
				return validateClassAxiom((ClassAxiom)value, diagnostics, context);
			case mowlPackage.DISJOINT_CLASS:
				return validateDisjointClass((DisjointClass)value, diagnostics, context);
			case mowlPackage.DISJOINT_UNION:
				return validateDisjointUnion((DisjointUnion)value, diagnostics, context);
			case mowlPackage.EQUIVALENT_CLASS:
				return validateEquivalentClass((EquivalentClass)value, diagnostics, context);
			case mowlPackage.SUB_CLASS_OF:
				return validateSubClassOf((SubClassOf)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_AXIOM:
				return validateObjectPropertyAxiom((ObjectPropertyAxiom)value, diagnostics, context);
			case mowlPackage.DISJOINT_OBJECT_PROPERTY:
				return validateDisjointObjectProperty((DisjointObjectProperty)value, diagnostics, context);
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY:
				return validateEquivalentObjectProperty((EquivalentObjectProperty)value, diagnostics, context);
			case mowlPackage.SUB_OBJECT_PROPERTY_OF:
				return validateSubObjectPropertyOf((SubObjectPropertyOf)value, diagnostics, context);
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM:
				return validateInverseObjectPropertyAxiom((InverseObjectPropertyAxiom)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_DOMAIN:
				return validateObjectPropertyDomain((ObjectPropertyDomain)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_RANGE:
				return validateObjectPropertyRange((ObjectPropertyRange)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_AXIOM:
				return validateDataPropertyAxiom((DataPropertyAxiom)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_DOMAIN:
				return validateDataPropertyDomain((DataPropertyDomain)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_RANGE:
				return validateDataPropertyRange((DataPropertyRange)value, diagnostics, context);
			case mowlPackage.DISJOINT_DATA_PROPERTY:
				return validateDisjointDataProperty((DisjointDataProperty)value, diagnostics, context);
			case mowlPackage.EQUIVALENT_DATA_PROPERTY:
				return validateEquivalentDataProperty((EquivalentDataProperty)value, diagnostics, context);
			case mowlPackage.SUB_DATA_PROPERTY_OF:
				return validateSubDataPropertyOf((SubDataPropertyOf)value, diagnostics, context);
			case mowlPackage.ASSERTION:
				return validateAssertion((Assertion)value, diagnostics, context);
			case mowlPackage.CLASS_ASSERTION:
				return validateClassAssertion((ClassAssertion)value, diagnostics, context);
			case mowlPackage.SAME_INDIVIDUAL:
				return validateSameIndividual((SameIndividual)value, diagnostics, context);
			case mowlPackage.DIFFERENT_INDIVIDUAL:
				return validateDifferentIndividual((DifferentIndividual)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_ASSERTION:
				return validateObjectPropertyAssertion((ObjectPropertyAssertion)value, diagnostics, context);
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				return validateNegativeObjectPropertyAssertion((NegativeObjectPropertyAssertion)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_ASSERTION:
				return validateDataPropertyAssertion((DataPropertyAssertion)value, diagnostics, context);
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION:
				return validateNegativeDataPropertyAssertion((NegativeDataPropertyAssertion)value, diagnostics, context);
			case mowlPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case mowlPackage.CLASS_EXPRESSION:
				return validateClassExpression((ClassExpression)value, diagnostics, context);
			case mowlPackage.CLASS_LIST:
				return validateClassList((ClassList)value, diagnostics, context);
			case mowlPackage.OBJECT_INTERSECTION_OF:
				return validateObjectIntersectionOf((ObjectIntersectionOf)value, diagnostics, context);
			case mowlPackage.OBJECT_UNION_OF:
				return validateObjectUnionOf((ObjectUnionOf)value, diagnostics, context);
			case mowlPackage.OBJECT_COMPLEMENT_OF:
				return validateObjectComplementOf((ObjectComplementOf)value, diagnostics, context);
			case mowlPackage.OBJECT_ONE_OF:
				return validateObjectOneOf((ObjectOneOf)value, diagnostics, context);
			case mowlPackage.OBJECT_SOME_VALUES_FROM:
				return validateObjectSomeValuesFrom((ObjectSomeValuesFrom)value, diagnostics, context);
			case mowlPackage.OBJECT_ALL_VALUES_FROM:
				return validateObjectAllValuesFrom((ObjectAllValuesFrom)value, diagnostics, context);
			case mowlPackage.OBJECT_HAS_VALUE:
				return validateObjectHasValue((ObjectHasValue)value, diagnostics, context);
			case mowlPackage.OBJECT_MIN_CARDINALITY:
				return validateObjectMinCardinality((ObjectMinCardinality)value, diagnostics, context);
			case mowlPackage.OBJECT_MAX_CARDINALITY:
				return validateObjectMaxCardinality((ObjectMaxCardinality)value, diagnostics, context);
			case mowlPackage.OBJECT_EXACT_CARDINALITY:
				return validateObjectExactCardinality((ObjectExactCardinality)value, diagnostics, context);
			case mowlPackage.DATA_SOME_VALUES_FROM:
				return validateDataSomeValuesFrom((DataSomeValuesFrom)value, diagnostics, context);
			case mowlPackage.DATA_ALL_VALUES_FROM:
				return validateDataAllValuesFrom((DataAllValuesFrom)value, diagnostics, context);
			case mowlPackage.DATA_HAS_VALUE:
				return validateDataHasValue((DataHasValue)value, diagnostics, context);
			case mowlPackage.DATA_MIN_CARDINALITY:
				return validateDataMinCardinality((DataMinCardinality)value, diagnostics, context);
			case mowlPackage.DATA_MAX_CARDINALITY:
				return validateDataMaxCardinality((DataMaxCardinality)value, diagnostics, context);
			case mowlPackage.DATA_EXACT_CARDINALITY:
				return validateDataExactCardinality((DataExactCardinality)value, diagnostics, context);
			case mowlPackage.ECONNECTION_EXPRESSION:
				return validateEConnectionExpression((EConnectionExpression)value, diagnostics, context);
			case mowlPackage.LINK_SOME_VALUES_FROM:
				return validateLinkSomeValuesFrom((LinkSomeValuesFrom)value, diagnostics, context);
			case mowlPackage.LINK_ALL_VALUES_FROM:
				return validateLinkAllValuesFrom((LinkAllValuesFrom)value, diagnostics, context);
			case mowlPackage.LINK_HAS_VALUE:
				return validateLinkHasValue((LinkHasValue)value, diagnostics, context);
			case mowlPackage.LINK_MIN_CARDINALITY:
				return validateLinkMinCardinality((LinkMinCardinality)value, diagnostics, context);
			case mowlPackage.LINK_MAX_CARDINALITY:
				return validateLinkMaxCardinality((LinkMaxCardinality)value, diagnostics, context);
			case mowlPackage.LINK_EXACT_CARDINALITY:
				return validateLinkExactCardinality((LinkExactCardinality)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_EXPRESSION:
				return validateObjectPropertyExpression((ObjectPropertyExpression)value, diagnostics, context);
			case mowlPackage.OBJECT_PROPERTY_LIST:
				return validateObjectPropertyList((ObjectPropertyList)value, diagnostics, context);
			case mowlPackage.INVERSE_OBJECT_PROPERTY:
				return validateInverseObjectProperty((InverseObjectProperty)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_EXPRESSION:
				return validateDataPropertyExpression((DataPropertyExpression)value, diagnostics, context);
			case mowlPackage.DATA_PROPERTY_LIST:
				return validateDataPropertyList((DataPropertyList)value, diagnostics, context);
			case mowlPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case mowlPackage.CONSTANT_ANNOTATION:
				return validateConstantAnnotation((ConstantAnnotation)value, diagnostics, context);
			case mowlPackage.ANNOTATION_BY_ENTITY:
				return validateAnnotationByEntity((AnnotationByEntity)value, diagnostics, context);
			case mowlPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case mowlPackage.ANNOTATION_PROPERTY:
				return validateAnnotationProperty((AnnotationProperty)value, diagnostics, context);
			case mowlPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontology(Multiontology multiontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiontology, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiontology_diffOntologiesId(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiontology_multiontologyPrefixIRIEmpty(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiontology_multiontologyVersionEmpty(multiontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiontology_multiontologyIdEmpty(multiontology, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the diffOntologiesId constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIONTOLOGY__DIFF_ONTOLOGIES_ID__EEXPRESSION = "self.ontologies->forAll(o1 : Ontology, o2 : Ontology | o1 <> o2 implies o1.id <> o2.id)";

	/**
	 * Validates the diffOntologiesId constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontology_diffOntologiesId(Multiontology multiontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.MULTIONTOLOGY,
				 multiontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffOntologiesId",
				 MULTIONTOLOGY__DIFF_ONTOLOGIES_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiontologyPrefixIRIEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIONTOLOGY__MULTIONTOLOGY_PREFIX_IRI_EMPTY__EEXPRESSION = "self.prefixIRI.trim().size()>0";

	/**
	 * Validates the multiontologyPrefixIRIEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontology_multiontologyPrefixIRIEmpty(Multiontology multiontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.MULTIONTOLOGY,
				 multiontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "multiontologyPrefixIRIEmpty",
				 MULTIONTOLOGY__MULTIONTOLOGY_PREFIX_IRI_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiontologyVersionEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIONTOLOGY__MULTIONTOLOGY_VERSION_EMPTY__EEXPRESSION = "self.version.trim().size()>0";

	/**
	 * Validates the multiontologyVersionEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontology_multiontologyVersionEmpty(Multiontology multiontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.MULTIONTOLOGY,
				 multiontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "multiontologyVersionEmpty",
				 MULTIONTOLOGY__MULTIONTOLOGY_VERSION_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiontologyIdEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIONTOLOGY__MULTIONTOLOGY_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the multiontologyIdEmpty constraint of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontology_multiontologyIdEmpty(Multiontology multiontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.MULTIONTOLOGY,
				 multiontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "multiontologyIdEmpty",
				 MULTIONTOLOGY__MULTIONTOLOGY_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyConnector(OntologyConnector ontologyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ontologyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ontologyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntologyConnector_ontologyConeectorIdEmpty(ontologyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ontologyConeectorIdEmpty constraint of '<em>Ontology Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY_CONNECTOR__ONTOLOGY_CONEECTOR_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the ontologyConeectorIdEmpty constraint of '<em>Ontology Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyConnector_ontologyConeectorIdEmpty(OntologyConnector ontologyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY_CONNECTOR,
				 ontologyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ontologyConeectorIdEmpty",
				 ONTOLOGY_CONNECTOR__ONTOLOGY_CONEECTOR_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEConnector(EConnector eConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntologyConnector_ontologyConeectorIdEmpty(eConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkProperty(LinkProperty linkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntologyConnector_ontologyConeectorIdEmpty(linkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkProperty_differentOntologiesLinkProperty(linkProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentOntologiesLinkProperty constraint of '<em>Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_PROPERTY__DIFFERENT_ONTOLOGIES_LINK_PROPERTY__EEXPRESSION = "self.sourceOntology <> self.targetOntology";

	/**
	 * Validates the differentOntologiesLinkProperty constraint of '<em>Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkProperty_differentOntologiesLinkProperty(LinkProperty linkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.LINK_PROPERTY,
				 linkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentOntologiesLinkProperty",
				 LINK_PROPERTY__DIFFERENT_ONTOLOGIES_LINK_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxiom(Axiom axiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiontologyAxiom(MultiontologyAxiom multiontologyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiontologyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPropertyAxiom(LinkPropertyAxiom linkPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentLinkProperty(EquivalentLinkProperty equivalentLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equivalentLinkProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentLinkProperty_equivalentLinkPropertyList(equivalentLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentLinkProperty_equivalentLinkPropertyInverseOf(equivalentLinkProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the equivalentLinkPropertyList constraint of '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_LINK_PROPERTY__EQUIVALENT_LINK_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the equivalentLinkPropertyList constraint of '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentLinkProperty_equivalentLinkPropertyList(EquivalentLinkProperty equivalentLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_LINK_PROPERTY,
				 equivalentLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "equivalentLinkPropertyList",
				 EQUIVALENT_LINK_PROPERTY__EQUIVALENT_LINK_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the equivalentLinkPropertyInverseOf constraint of '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_LINK_PROPERTY__EQUIVALENT_LINK_PROPERTY_INVERSE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the equivalentLinkPropertyInverseOf constraint of '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentLinkProperty_equivalentLinkPropertyInverseOf(EquivalentLinkProperty equivalentLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_LINK_PROPERTY,
				 equivalentLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "equivalentLinkPropertyInverseOf",
				 EQUIVALENT_LINK_PROPERTY__EQUIVALENT_LINK_PROPERTY_INVERSE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubLinkPropertyOf(SubLinkPropertyOf subLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subLinkPropertyOf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubLinkPropertyOf_subLinkPropertyOfLinkPropertyList(subLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubLinkPropertyOf_subLinkPropertyOfLinkPropertyInverseOf(subLinkPropertyOf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the subLinkPropertyOfLinkPropertyList constraint of '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_LINK_PROPERTY_OF__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the subLinkPropertyOfLinkPropertyList constraint of '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubLinkPropertyOf_subLinkPropertyOfLinkPropertyList(SubLinkPropertyOf subLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_LINK_PROPERTY_OF,
				 subLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "subLinkPropertyOfLinkPropertyList",
				 SUB_LINK_PROPERTY_OF__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the subLinkPropertyOfLinkPropertyInverseOf constraint of '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_LINK_PROPERTY_OF__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_INVERSE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the subLinkPropertyOfLinkPropertyInverseOf constraint of '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubLinkPropertyOf_subLinkPropertyOfLinkPropertyInverseOf(SubLinkPropertyOf subLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_LINK_PROPERTY_OF,
				 subLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "subLinkPropertyOfLinkPropertyInverseOf",
				 SUB_LINK_PROPERTY_OF__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_INVERSE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointLinkProperty(DisjointLinkProperty disjointLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disjointLinkProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointLinkProperty_subLinkPropertyOfLinkPropertyList(disjointLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointLinkProperty_subLinkPropertyOfLinkPropertyInverseOf(disjointLinkProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the subLinkPropertyOfLinkPropertyList constraint of '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_LINK_PROPERTY__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the subLinkPropertyOfLinkPropertyList constraint of '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointLinkProperty_subLinkPropertyOfLinkPropertyList(DisjointLinkProperty disjointLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_LINK_PROPERTY,
				 disjointLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "subLinkPropertyOfLinkPropertyList",
				 DISJOINT_LINK_PROPERTY__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the subLinkPropertyOfLinkPropertyInverseOf constraint of '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_LINK_PROPERTY__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_INVERSE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))";

	/**
	 * Validates the subLinkPropertyOfLinkPropertyInverseOf constraint of '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointLinkProperty_subLinkPropertyOfLinkPropertyInverseOf(DisjointLinkProperty disjointLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_LINK_PROPERTY,
				 disjointLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "subLinkPropertyOfLinkPropertyInverseOf",
				 DISJOINT_LINK_PROPERTY__SUB_LINK_PROPERTY_OF_LINK_PROPERTY_INVERSE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainLinkProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsClassList(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectIntersectionOf(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectUnionOf(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectSomeValuesFrom(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectAllValuesFrom(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectHasValue(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectComplementOf(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectOneOf(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectMinCardinality(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectMaxCardinality(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsObjectExactCardinality(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataSomeValuesFrom(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataAllValuesFrom(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataHasValue(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataMinCardinality(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataMaxCardinality(domainLinkProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainLinkProperty_expressionsDataExactCardinality(domainLinkProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the expressionsClassList constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.linkProperty.sourceOntology))";

	/**
	 * Validates the expressionsClassList constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsClassList(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsClassList",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectIntersectionOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))";

	/**
	 * Validates the expressionsObjectIntersectionOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectIntersectionOf(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectIntersectionOf",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectUnionOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))";

	/**
	 * Validates the expressionsObjectUnionOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectUnionOf(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectUnionOf",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectSomeValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectSomeValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectSomeValuesFrom(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectSomeValuesFrom",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectAllValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectAllValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectAllValuesFrom(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectAllValuesFrom",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectHasValue constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectHasValue constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectHasValue(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectHasValue",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectComplementOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectComplementOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectComplementOf(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectComplementOf",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectOneOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectOneOf constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectOneOf(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectOneOf",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectMinCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectMinCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectMinCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectMinCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectMaxCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectMaxCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectMaxCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectMaxCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectExactCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsObjectExactCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsObjectExactCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectExactCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataSomeValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataSomeValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataSomeValuesFrom(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataSomeValuesFrom",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataAllValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataAllValuesFrom constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataAllValuesFrom(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataAllValuesFrom",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataHasValue constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataHasValue constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataHasValue(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataHasValue",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataMinCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataMinCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataMinCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataMinCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataMaxCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataMaxCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataMaxCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataMaxCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataExactCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)";

	/**
	 * Validates the expressionsDataExactCardinality constraint of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainLinkProperty_expressionsDataExactCardinality(DomainLinkProperty domainLinkProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DOMAIN_LINK_PROPERTY,
				 domainLinkProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataExactCardinality",
				 DOMAIN_LINK_PROPERTY__EXPRESSIONS_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rangeLinkPropertyOf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsClassList(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectIntersectionOf(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectUnionOf(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectSomeValuesFrom(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectAllValuesFrom(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectHasValue(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectComplementOf(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectOneOf(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectMinCardinality(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectMaxCardinality(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsObjectExactCardinality(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataSomeValuesFrom(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataAllValuesFrom(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataHasValue(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataMinCardinality(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataMaxCardinality(rangeLinkPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeLinkPropertyOf_expressionsDataExactCardinality(rangeLinkPropertyOf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the expressionsClassList constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.linkProperty.targetOntology))";

	/**
	 * Validates the expressionsClassList constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsClassList(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsClassList",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectIntersectionOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.targetOntology))";

	/**
	 * Validates the expressionsObjectIntersectionOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectIntersectionOf(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectIntersectionOf",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectUnionOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.targetOntology))";

	/**
	 * Validates the expressionsObjectUnionOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectUnionOf(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectUnionOf",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectSomeValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.linkProperty.targetOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectSomeValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectSomeValuesFrom(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectSomeValuesFrom",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectAllValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.linkProperty.targetOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectAllValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectAllValuesFrom(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectAllValuesFrom",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectHasValue constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectHasValue constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectHasValue(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectHasValue",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectComplementOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectComplementOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectComplementOf(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectComplementOf",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectOneOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectOneOf constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectOneOf(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectOneOf",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectMinCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.linkProperty.targetOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectMinCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectMinCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectMinCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectMaxCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.linkProperty.targetOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectMaxCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectMaxCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectMaxCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsObjectExactCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsObjectExactCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsObjectExactCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsObjectExactCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataSomeValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataSomeValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataSomeValuesFrom(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataSomeValuesFrom",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataAllValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataAllValuesFrom constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataAllValuesFrom(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataAllValuesFrom",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataHasValue constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataHasValue constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataHasValue(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataHasValue",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataMinCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataMinCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataMinCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataMinCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataMaxCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataMaxCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataMaxCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataMaxCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the expressionsDataExactCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.linkProperty.targetOntology)";

	/**
	 * Validates the expressionsDataExactCardinality constraint of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeLinkPropertyOf_expressionsDataExactCardinality(RangeLinkPropertyOf rangeLinkPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.RANGE_LINK_PROPERTY_OF,
				 rangeLinkPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "expressionsDataExactCardinality",
				 RANGE_LINK_PROPERTY_OF__EXPRESSIONS_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPropertyExpression(LinkPropertyExpression linkPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPropertyList(LinkPropertyList linkPropertyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkPropertyList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPropertyInverseOf(LinkPropertyInverseOf linkPropertyInverseOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkPropertyInverseOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ontology, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_ontologyIdEmpty(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_ontologyVersionEmpty(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_diffClassesId(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_diffObjectPropertiesId(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_diffDataPropertiesId(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_diffIndividuals(ontology, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ontologyIdEmpty constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__ONTOLOGY_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the ontologyIdEmpty constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_ontologyIdEmpty(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ontologyIdEmpty",
				 ONTOLOGY__ONTOLOGY_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ontologyVersionEmpty constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__ONTOLOGY_VERSION_EMPTY__EEXPRESSION = "self.version.trim().size()>0";

	/**
	 * Validates the ontologyVersionEmpty constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_ontologyVersionEmpty(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ontologyVersionEmpty",
				 ONTOLOGY__ONTOLOGY_VERSION_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the diffClassesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__DIFF_CLASSES_ID__EEXPRESSION = "self.classes->forAll(c1 : Class, c2 : Class | c1 <> c2 implies c1.id <> c2.id)";

	/**
	 * Validates the diffClassesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_diffClassesId(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffClassesId",
				 ONTOLOGY__DIFF_CLASSES_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the diffObjectPropertiesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__DIFF_OBJECT_PROPERTIES_ID__EEXPRESSION = "self.objectsProperty->forAll(op1 : ObjectProperty, op2 : ObjectProperty | op1 <> op2 implies op1.id <> op2.id)";

	/**
	 * Validates the diffObjectPropertiesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_diffObjectPropertiesId(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffObjectPropertiesId",
				 ONTOLOGY__DIFF_OBJECT_PROPERTIES_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the diffDataPropertiesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__DIFF_DATA_PROPERTIES_ID__EEXPRESSION = "self.dataProperty->forAll(dp1 : DataProperty, dp2 : DataProperty | dp1 <> dp2 implies dp1.id <> dp2.id)";

	/**
	 * Validates the diffDataPropertiesId constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_diffDataPropertiesId(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffDataPropertiesId",
				 ONTOLOGY__DIFF_DATA_PROPERTIES_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the diffIndividuals constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ONTOLOGY__DIFF_INDIVIDUALS__EEXPRESSION = "self.individuals->forAll(i1 : NamedIndividual, i2 : NamedIndividual | i1 <> i2 implies i1.id <> i2.id)";

	/**
	 * Validates the diffIndividuals constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_diffIndividuals(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ONTOLOGY,
				 ontology,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffIndividuals",
				 ONTOLOGY__DIFF_INDIVIDUALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(mowl.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_classIdEmpty(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classIdEmpty constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__CLASS_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the classIdEmpty constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_classIdEmpty(mowl.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "classIdEmpty",
				 CLASS__CLASS_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectProperty(ObjectProperty objectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectProperty_objectPropertyIdEmpty(objectProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the objectPropertyIdEmpty constraint of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY__OBJECT_PROPERTY_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the objectPropertyIdEmpty constraint of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectProperty_objectPropertyIdEmpty(ObjectProperty objectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY,
				 objectProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "objectPropertyIdEmpty",
				 OBJECT_PROPERTY__OBJECT_PROPERTY_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProperty(DataProperty dataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataProperty_dataPropertyIdEmpty(dataProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the dataPropertyIdEmpty constraint of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY__DATA_PROPERTY_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the dataPropertyIdEmpty constraint of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProperty_dataPropertyIdEmpty(DataProperty dataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY,
				 dataProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "dataPropertyIdEmpty",
				 DATA_PROPERTY__DATA_PROPERTY_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividual(Individual individual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedIndividual(NamedIndividual namedIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedIndividual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedIndividual_namedIndividualIdEmpty(namedIndividual, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the namedIndividualIdEmpty constraint of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_INDIVIDUAL__NAMED_INDIVIDUAL_ID_EMPTY__EEXPRESSION = "self.id.trim().size()>0";

	/**
	 * Validates the namedIndividualIdEmpty constraint of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedIndividual_namedIndividualIdEmpty(NamedIndividual namedIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.NAMED_INDIVIDUAL,
				 namedIndividual,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "namedIndividualIdEmpty",
				 NAMED_INDIVIDUAL__NAMED_INDIVIDUAL_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnonymousIndividual(AnonymousIndividual anonymousIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anonymousIndividual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anonymousIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnonymousIndividual_anonymousIndividualIdEmpty(anonymousIndividual, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the anonymousIndividualIdEmpty constraint of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANONYMOUS_INDIVIDUAL__ANONYMOUS_INDIVIDUAL_ID_EMPTY__EEXPRESSION = "self.nodeID.trim().size()>0";

	/**
	 * Validates the anonymousIndividualIdEmpty constraint of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnonymousIndividual_anonymousIndividualIdEmpty(AnonymousIndividual anonymousIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.ANONYMOUS_INDIVIDUAL,
				 anonymousIndividual,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "anonymousIndividualIdEmpty",
				 ANONYMOUS_INDIVIDUAL__ANONYMOUS_INDIVIDUAL_ID_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyAxiom(OntologyAxiom ontologyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAxiom(ClassAxiom classAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disjointClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesClassList(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectIntersectionOf(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectUnionOf(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectSomeValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectAllValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectHasValue(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectComplementOf(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectOneOf(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectMinCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectMaxCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesObjectExactCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataSomeValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataAllValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataHasValue(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataMinCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataMaxCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_localDisjointClassesDataExactCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertySomeValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertyAllValuesFrom(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertyHasValue(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertyMinCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertyMaxCardinality(disjointClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointClass_externalDisjointClassesLinkPropertyExactCardinality(disjointClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDisjointClassesClassList constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointClassesClassList constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesClassList(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesClassList",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectIntersectionOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointClassesObjectIntersectionOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectIntersectionOf(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectIntersectionOf",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectUnionOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointClassesObjectUnionOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectUnionOf(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectUnionOf",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectSomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectSomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectSomeValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectSomeValuesFrom",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectAllValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectAllValuesFrom",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectHasValue(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectHasValue",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectComplementOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectComplementOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectComplementOf(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectComplementOf",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectOneOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectOneOf constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectOneOf(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectOneOf",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectMinCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectMinCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectMaxCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectMaxCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesObjectExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesObjectExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesObjectExactCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesObjectExactCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataSomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataSomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataSomeValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataSomeValuesFrom",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataAllValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataAllValuesFrom",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataHasValue(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataHasValue",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataMinCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataMinCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataMaxCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataMaxCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointClassesDataExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointClassesDataExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_localDisjointClassesDataExactCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointClassesDataExactCardinality",
				 DISJOINT_CLASS__LOCAL_DISJOINT_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertySomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertySomeValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertySomeValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertySomeValuesFrom",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertyAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertyAllValuesFrom constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertyAllValuesFrom(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertyAllValuesFrom",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertyHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertyHasValue constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertyHasValue(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertyHasValue",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertyMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertyMinCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertyMinCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertyMinCardinality",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertyMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertyMaxCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertyMaxCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertyMaxCardinality",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointClassesLinkPropertyExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointClassesLinkPropertyExactCardinality constraint of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClass_externalDisjointClassesLinkPropertyExactCardinality(DisjointClass disjointClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_CLASS,
				 disjointClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointClassesLinkPropertyExactCardinality",
				 DISJOINT_CLASS__EXTERNAL_DISJOINT_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disjointUnion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesClassList(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectIntersectionOf(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectUnionOf(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectSomeValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectAllValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectHasValue(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectComplementOf(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectOneOf(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectMinCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectMaxCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesObjectExactCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataSomeValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataAllValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataHasValue(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataMinCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataMaxCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_localDisjointUnionClassesDataExactCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertySomeValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertyAllValuesFrom(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertyHasValue(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertyMinCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertyMaxCardinality(disjointUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointUnion_externalDisjointUnionClassesLinkPropertyExactCardinality(disjointUnion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesClassList constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointUnionClassesClassList constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesClassList(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesClassList",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectIntersectionOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointUnionClassesObjectIntersectionOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectIntersectionOf(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectIntersectionOf",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectUnionOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDisjointUnionClassesObjectUnionOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectUnionOf(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectUnionOf",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectSomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectSomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectSomeValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectSomeValuesFrom",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectAllValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectAllValuesFrom",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectHasValue(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectHasValue",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectComplementOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectComplementOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectComplementOf(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectComplementOf",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectOneOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectOneOf constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectOneOf(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectOneOf",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectMinCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectMinCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectMaxCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectMaxCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesObjectExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesObjectExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesObjectExactCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesObjectExactCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataSomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataSomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataSomeValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataSomeValuesFrom",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataAllValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataAllValuesFrom",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataHasValue(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataHasValue",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataMinCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataMinCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataMaxCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataMaxCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointUnionClassesDataExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDisjointUnionClassesDataExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_localDisjointUnionClassesDataExactCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointUnionClassesDataExactCardinality",
				 DISJOINT_UNION__LOCAL_DISJOINT_UNION_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertySomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertySomeValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertySomeValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertySomeValuesFrom",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertyAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertyAllValuesFrom constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertyAllValuesFrom(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertyAllValuesFrom",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertyHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertyHasValue constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertyHasValue(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertyHasValue",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertyMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertyMinCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertyMinCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertyMinCardinality",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertyMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertyMaxCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertyMaxCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertyMaxCardinality",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDisjointUnionClassesLinkPropertyExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDisjointUnionClassesLinkPropertyExactCardinality constraint of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion_externalDisjointUnionClassesLinkPropertyExactCardinality(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_UNION,
				 disjointUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDisjointUnionClassesLinkPropertyExactCardinality",
				 DISJOINT_UNION__EXTERNAL_DISJOINT_UNION_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equivalentClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesClassList(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectIntersectionOf(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectUnionOf(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectSomeValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectAllValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectHasValue(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectComplementOf(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectOneOf(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectMinCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectMaxCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesObjectExactCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataSomeValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataAllValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataHasValue(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataMinCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataMaxCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_localEquivalentClassesDataExactCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertySomeValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertyAllValuesFrom(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertyHasValue(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertyMinCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertyMaxCardinality(equivalentClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentClass_externalEquivalentClassesLinkPropertyExactCardinality(equivalentClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localEquivalentClassesClassList constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localEquivalentClassesClassList constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesClassList(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesClassList",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectIntersectionOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localEquivalentClassesObjectIntersectionOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectIntersectionOf(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectIntersectionOf",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectUnionOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localEquivalentClassesObjectUnionOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectUnionOf(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectUnionOf",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectSomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectSomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectSomeValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectSomeValuesFrom",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectAllValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectAllValuesFrom",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectHasValue(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectHasValue",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectComplementOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectComplementOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectComplementOf(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectComplementOf",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectOneOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectOneOf constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectOneOf(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectOneOf",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectMinCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectMinCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectMaxCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectMaxCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesObjectExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesObjectExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesObjectExactCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesObjectExactCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataSomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataSomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataSomeValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataSomeValuesFrom",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataAllValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataAllValuesFrom",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataHasValue(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataHasValue",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataMinCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataMinCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataMaxCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataMaxCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentClassesDataExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localEquivalentClassesDataExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_localEquivalentClassesDataExactCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentClassesDataExactCardinality",
				 EQUIVALENT_CLASS__LOCAL_EQUIVALENT_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertySomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertySomeValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertySomeValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertySomeValuesFrom",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertyAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertyAllValuesFrom constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertyAllValuesFrom(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertyAllValuesFrom",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertyHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertyHasValue constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertyHasValue(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertyHasValue",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertyMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertyMinCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertyMinCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertyMinCardinality",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertyMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertyMaxCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertyMaxCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertyMaxCardinality",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalEquivalentClassesLinkPropertyExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalEquivalentClassesLinkPropertyExactCardinality constraint of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClass_externalEquivalentClassesLinkPropertyExactCardinality(EquivalentClass equivalentClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_CLASS,
				 equivalentClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalEquivalentClassesLinkPropertyExactCardinality",
				 EQUIVALENT_CLASS__EXTERNAL_EQUIVALENT_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subClassOf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesClassList(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectIntersectionOf(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectUnionOf(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectSomeValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectAllValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectHasValue(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectComplementOf(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectOneOf(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectMinCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectMaxCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesObjectExactCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataSomeValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataAllValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataHasValue(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataMinCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataMaxCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_localDomainClassesDataExactCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertySomeValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertyAllValuesFrom(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertyHasValue(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertyMinCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertyMaxCardinality(subClassOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubClassOf_externalDomainClassesLinkPropertyExactCardinality(subClassOf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDomainClassesClassList constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDomainClassesClassList constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesClassList(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesClassList",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectIntersectionOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDomainClassesObjectIntersectionOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectIntersectionOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectIntersectionOf",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectUnionOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))";

	/**
	 * Validates the localDomainClassesObjectUnionOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectUnionOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectUnionOf",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectSomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectSomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectSomeValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectSomeValuesFrom",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectAllValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectAllValuesFrom",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectHasValue(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectHasValue",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectComplementOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectComplementOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectComplementOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectComplementOf",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectOneOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectOneOf constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectOneOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectOneOf",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectMinCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectMinCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectMaxCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectMaxCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesObjectExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesObjectExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesObjectExactCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesObjectExactCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataSomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataSomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataSomeValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataSomeValuesFrom",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataAllValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataAllValuesFrom",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataHasValue(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataHasValue",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataMinCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataMinCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataMaxCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataMaxCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainClassesDataExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)";

	/**
	 * Validates the localDomainClassesDataExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_localDomainClassesDataExactCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainClassesDataExactCardinality",
				 SUB_CLASS_OF__LOCAL_DOMAIN_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertySomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertySomeValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertySomeValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertySomeValuesFrom",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertyAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertyAllValuesFrom constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertyAllValuesFrom(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertyAllValuesFrom",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertyHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertyHasValue constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertyHasValue(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertyHasValue",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertyMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertyMinCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertyMinCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertyMinCardinality",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertyMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertyMaxCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertyMaxCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertyMaxCardinality",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the externalDomainClassesLinkPropertyExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))";

	/**
	 * Validates the externalDomainClassesLinkPropertyExactCardinality constraint of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf_externalDomainClassesLinkPropertyExactCardinality(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_CLASS_OF,
				 subClassOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "externalDomainClassesLinkPropertyExactCardinality",
				 SUB_CLASS_OF__EXTERNAL_DOMAIN_CLASSES_LINK_PROPERTY_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAxiom(ObjectPropertyAxiom objectPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointObjectProperty(DisjointObjectProperty disjointObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disjointObjectProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointObjectProperty_localDisjointObjectPropertyObjectPropertyList(disjointObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointObjectProperty_localDisjointObjectPropertyInverseObjectProperty(disjointObjectProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDisjointObjectPropertyObjectPropertyList constraint of '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_OBJECT_PROPERTY__LOCAL_DISJOINT_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localDisjointObjectPropertyObjectPropertyList constraint of '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointObjectProperty_localDisjointObjectPropertyObjectPropertyList(DisjointObjectProperty disjointObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_OBJECT_PROPERTY,
				 disjointObjectProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointObjectPropertyObjectPropertyList",
				 DISJOINT_OBJECT_PROPERTY__LOCAL_DISJOINT_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDisjointObjectPropertyInverseObjectProperty constraint of '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_OBJECT_PROPERTY__LOCAL_DISJOINT_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localDisjointObjectPropertyInverseObjectProperty constraint of '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointObjectProperty_localDisjointObjectPropertyInverseObjectProperty(DisjointObjectProperty disjointObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_OBJECT_PROPERTY,
				 disjointObjectProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointObjectPropertyInverseObjectProperty",
				 DISJOINT_OBJECT_PROPERTY__LOCAL_DISJOINT_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentObjectProperty(EquivalentObjectProperty equivalentObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equivalentObjectProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentObjectProperty_localEquivalentObjectPropertyObjectPropertyList(equivalentObjectProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentObjectProperty_localEquivalentObjectPropertyInverseObjectProperty(equivalentObjectProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localEquivalentObjectPropertyObjectPropertyList constraint of '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_OBJECT_PROPERTY__LOCAL_EQUIVALENT_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localEquivalentObjectPropertyObjectPropertyList constraint of '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentObjectProperty_localEquivalentObjectPropertyObjectPropertyList(EquivalentObjectProperty equivalentObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_OBJECT_PROPERTY,
				 equivalentObjectProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentObjectPropertyObjectPropertyList",
				 EQUIVALENT_OBJECT_PROPERTY__LOCAL_EQUIVALENT_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localEquivalentObjectPropertyInverseObjectProperty constraint of '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_OBJECT_PROPERTY__LOCAL_EQUIVALENT_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localEquivalentObjectPropertyInverseObjectProperty constraint of '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentObjectProperty_localEquivalentObjectPropertyInverseObjectProperty(EquivalentObjectProperty equivalentObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_OBJECT_PROPERTY,
				 equivalentObjectProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentObjectPropertyInverseObjectProperty",
				 EQUIVALENT_OBJECT_PROPERTY__LOCAL_EQUIVALENT_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectPropertyOf(SubObjectPropertyOf subObjectPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subObjectPropertyOf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubObjectPropertyOf_localDomainObjectPropertyObjectPropertyList(subObjectPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubObjectPropertyOf_localDomainObjectPropertyInverseObjectProperty(subObjectPropertyOf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDomainObjectPropertyObjectPropertyList constraint of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_OBJECT_PROPERTY_OF__LOCAL_DOMAIN_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localDomainObjectPropertyObjectPropertyList constraint of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectPropertyOf_localDomainObjectPropertyObjectPropertyList(SubObjectPropertyOf subObjectPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_OBJECT_PROPERTY_OF,
				 subObjectPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainObjectPropertyObjectPropertyList",
				 SUB_OBJECT_PROPERTY_OF__LOCAL_DOMAIN_OBJECT_PROPERTY_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDomainObjectPropertyInverseObjectProperty constraint of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_OBJECT_PROPERTY_OF__LOCAL_DOMAIN_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localDomainObjectPropertyInverseObjectProperty constraint of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectPropertyOf_localDomainObjectPropertyInverseObjectProperty(SubObjectPropertyOf subObjectPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_OBJECT_PROPERTY_OF,
				 subObjectPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainObjectPropertyInverseObjectProperty",
				 SUB_OBJECT_PROPERTY_OF__LOCAL_DOMAIN_OBJECT_PROPERTY_INVERSE_OBJECT_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInverseObjectPropertyAxiom(InverseObjectPropertyAxiom inverseObjectPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inverseObjectPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectPropertyDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainClassList(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectIntersectionOf(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectUnionOf(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectSomeValuesFrom(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectAllValuesFrom(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectHasValue(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectComplementOf(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectOneOf(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectMinCardinality(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectMaxCardinality(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainObjectExactCardinality(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataSomeValuesFrom(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataAllValuesFrom(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataHasValue(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataMinCardinality(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataMaxCardinality(objectPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyDomain_localObjectPropertyDomainDataExactCardinality(objectPropertyDomain, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainClassList constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyDomainClassList constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainClassList(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainClassList",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectIntersectionOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyDomainObjectIntersectionOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectIntersectionOf(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectIntersectionOf",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectUnionOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyDomainObjectUnionOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectUnionOf(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectUnionOf",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectSomeValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectSomeValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectSomeValuesFrom(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectSomeValuesFrom",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectAllValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectAllValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectAllValuesFrom(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectAllValuesFrom",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectHasValue constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectHasValue constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectHasValue(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectHasValue",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectComplementOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectComplementOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectComplementOf(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectComplementOf",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectOneOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectOneOf constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectOneOf(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectOneOf",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectMinCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectMinCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectMinCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectMinCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectMaxCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectMaxCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectMaxCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectMaxCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainObjectExactCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainObjectExactCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainObjectExactCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainObjectExactCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataSomeValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataSomeValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataSomeValuesFrom(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataSomeValuesFrom",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataAllValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataAllValuesFrom constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataAllValuesFrom(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataAllValuesFrom",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataHasValue constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataHasValue constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataHasValue(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataHasValue",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataMinCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataMinCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataMinCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataMinCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataMaxCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataMaxCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataMaxCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataMaxCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyDomainDataExactCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyDomainDataExactCardinality constraint of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain_localObjectPropertyDomainDataExactCardinality(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_DOMAIN,
				 objectPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyDomainDataExactCardinality",
				 OBJECT_PROPERTY_DOMAIN__LOCAL_OBJECT_PROPERTY_DOMAIN_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectPropertyRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeClassList(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectIntersectionOf(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectUnionOf(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectSomeValuesFrom(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectAllValuesFrom(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectHasValue(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectComplementOf(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectOneOf(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectMinCardinality(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectMaxCardinality(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeObjectExactCardinality(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataSomeValuesFrom(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataAllValuesFrom(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataHasValue(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataMinCardinality(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataMaxCardinality(objectPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyRange_localObjectPropertyRangeDataExactCardinality(objectPropertyRange, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeClassList constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyRangeClassList constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeClassList(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeClassList",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectIntersectionOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyRangeObjectIntersectionOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectIntersectionOf(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectIntersectionOf",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectUnionOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))";

	/**
	 * Validates the localObjectPropertyRangeObjectUnionOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectUnionOf(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectUnionOf",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectSomeValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectSomeValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectSomeValuesFrom(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectSomeValuesFrom",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectAllValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectAllValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectAllValuesFrom(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectAllValuesFrom",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectHasValue constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectHasValue constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectHasValue(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectHasValue",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectComplementOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectComplementOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectComplementOf(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectComplementOf",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectOneOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectOneOf constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectOneOf(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectOneOf",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectMinCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectMinCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectMinCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectMinCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectMaxCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectMaxCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectMaxCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectMaxCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeObjectExactCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeObjectExactCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeObjectExactCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeObjectExactCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataSomeValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataSomeValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataSomeValuesFrom(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataSomeValuesFrom",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataAllValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataAllValuesFrom constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataAllValuesFrom(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataAllValuesFrom",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataHasValue constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataHasValue constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataHasValue(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataHasValue",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataMinCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataMinCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataMinCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataMinCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataMaxCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataMaxCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataMaxCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataMaxCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyRangeDataExactCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)";

	/**
	 * Validates the localObjectPropertyRangeDataExactCardinality constraint of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange_localObjectPropertyRangeDataExactCardinality(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_RANGE,
				 objectPropertyRange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyRangeDataExactCardinality",
				 OBJECT_PROPERTY_RANGE__LOCAL_OBJECT_PROPERTY_RANGE_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyAxiom(DataPropertyAxiom dataPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPropertyDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainClassList(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectIntersectionOf(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectUnionOf(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectSomeValuesFrom(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectAllValuesFrom(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectHasValue(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectComplementOf(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectOneOf(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectMinCardinality(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectMaxCardinality(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainObjectExactCardinality(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataSomeValuesFrom(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataAllValuesFrom(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataHasValue(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataMinCardinality(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataMaxCardinality(dataPropertyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyDomain_localDataPropertyDomainDataExactCardinality(dataPropertyDomain, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainClassList constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localDataPropertyDomainClassList constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainClassList(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainClassList",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectIntersectionOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localDataPropertyDomainObjectIntersectionOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectIntersectionOf(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectIntersectionOf",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectUnionOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localDataPropertyDomainObjectUnionOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectUnionOf(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectUnionOf",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectSomeValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectSomeValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectSomeValuesFrom(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectSomeValuesFrom",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectAllValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectAllValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectAllValuesFrom(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectAllValuesFrom",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectHasValue constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectHasValue constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectHasValue(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectHasValue",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectComplementOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectComplementOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectComplementOf(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectComplementOf",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectOneOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectOneOf constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectOneOf(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectOneOf",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectMinCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectMinCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectMinCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectMinCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectMaxCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectMaxCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectMaxCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectMaxCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainObjectExactCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainObjectExactCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainObjectExactCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainObjectExactCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataSomeValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataSomeValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataSomeValuesFrom(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataSomeValuesFrom",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataAllValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataAllValuesFrom constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataAllValuesFrom(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataAllValuesFrom",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataHasValue constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataHasValue constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataHasValue(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataHasValue",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataMinCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataMinCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataMinCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataMinCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataMaxCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataMaxCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataMaxCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataMaxCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localDataPropertyDomainDataExactCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)";

	/**
	 * Validates the localDataPropertyDomainDataExactCardinality constraint of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain_localDataPropertyDomainDataExactCardinality(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_DOMAIN,
				 dataPropertyDomain,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyDomainDataExactCardinality",
				 DATA_PROPERTY_DOMAIN__LOCAL_DATA_PROPERTY_DOMAIN_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyRange(DataPropertyRange dataPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointDataProperty(DisjointDataProperty disjointDataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disjointDataProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disjointDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisjointDataProperty_localDisjointDataPropertyClassList(disjointDataProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDisjointDataPropertyClassList constraint of '<em>Disjoint Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISJOINT_DATA_PROPERTY__LOCAL_DISJOINT_DATA_PROPERTY_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localDisjointDataPropertyClassList constraint of '<em>Disjoint Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointDataProperty_localDisjointDataPropertyClassList(DisjointDataProperty disjointDataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DISJOINT_DATA_PROPERTY,
				 disjointDataProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDisjointDataPropertyClassList",
				 DISJOINT_DATA_PROPERTY__LOCAL_DISJOINT_DATA_PROPERTY_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentDataProperty(EquivalentDataProperty equivalentDataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equivalentDataProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equivalentDataProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquivalentDataProperty_localEquivalentDataPropertyClassList(equivalentDataProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localEquivalentDataPropertyClassList constraint of '<em>Equivalent Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUIVALENT_DATA_PROPERTY__LOCAL_EQUIVALENT_DATA_PROPERTY_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localEquivalentDataPropertyClassList constraint of '<em>Equivalent Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentDataProperty_localEquivalentDataPropertyClassList(EquivalentDataProperty equivalentDataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.EQUIVALENT_DATA_PROPERTY,
				 equivalentDataProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localEquivalentDataPropertyClassList",
				 EQUIVALENT_DATA_PROPERTY__LOCAL_EQUIVALENT_DATA_PROPERTY_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubDataPropertyOf(SubDataPropertyOf subDataPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subDataPropertyOf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subDataPropertyOf, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubDataPropertyOf_localDomainDataPropertyClassList(subDataPropertyOf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDomainDataPropertyClassList constraint of '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_DATA_PROPERTY_OF__LOCAL_DOMAIN_DATA_PROPERTY_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))";

	/**
	 * Validates the localDomainDataPropertyClassList constraint of '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubDataPropertyOf_localDomainDataPropertyClassList(SubDataPropertyOf subDataPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SUB_DATA_PROPERTY_OF,
				 subDataPropertyOf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDomainDataPropertyClassList",
				 SUB_DATA_PROPERTY_OF__LOCAL_DOMAIN_DATA_PROPERTY_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertion(Assertion assertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classAssertion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesClassList(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectIntersectionOf(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectUnionOf(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectSomeValuesFrom(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectAllValuesFrom(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectHasValue(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectComplementOf(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectOneOf(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectMinCardinality(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectMaxCardinality(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesObjectExactCardinality(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataSomeValuesFrom(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataAllValuesFrom(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataHasValue(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataMinCardinality(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataMaxCardinality(classAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAssertion_localClassesDataExactCardinality(classAssertion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localClassesClassList constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_CLASS_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localClassesClassList constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesClassList(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesClassList",
				 CLASS_ASSERTION__LOCAL_CLASSES_CLASS_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectIntersectionOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localClassesObjectIntersectionOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectIntersectionOf(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectIntersectionOf",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_INTERSECTION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectUnionOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_UNION_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localClassesObjectUnionOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectUnionOf(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectUnionOf",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_UNION_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectSomeValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectSomeValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectSomeValuesFrom(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectSomeValuesFrom",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectAllValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectAllValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectAllValuesFrom(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectAllValuesFrom",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectHasValue constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectHasValue constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectHasValue(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectHasValue",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectComplementOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectComplementOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectComplementOf(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectComplementOf",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_COMPLEMENT_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectOneOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_ONE_OF__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectOneOf constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectOneOf(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectOneOf",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_ONE_OF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectMinCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.individualAssertion.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectMinCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectMinCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectMinCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectMaxCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.individualAssertion.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectMaxCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectMaxCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectMaxCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesObjectExactCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.individualAssertion.ontology) and\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesObjectExactCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesObjectExactCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesObjectExactCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_OBJECT_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataSomeValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataSomeValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataSomeValuesFrom(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataSomeValuesFrom",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_SOME_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataAllValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataAllValuesFrom constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataAllValuesFrom(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataAllValuesFrom",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_ALL_VALUES_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataHasValue constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_HAS_VALUE__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataHasValue constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataHasValue(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataHasValue",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_HAS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataMinCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataMinCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataMinCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataMinCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_MIN_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataMaxCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataMaxCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataMaxCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataMaxCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_MAX_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localClassesDataExactCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ASSERTION__LOCAL_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION = "\n" +
		"\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localClassesDataExactCardinality constraint of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion_localClassesDataExactCardinality(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CLASS_ASSERTION,
				 classAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localClassesDataExactCardinality",
				 CLASS_ASSERTION__LOCAL_CLASSES_DATA_EXACT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameIndividual(SameIndividual sameIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sameIndividual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sameIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validateSameIndividual_localSameIndividuals(sameIndividual, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localSameIndividuals constraint of '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SAME_INDIVIDUAL__LOCAL_SAME_INDIVIDUALS__EEXPRESSION = "\n" +
		"\t\t\tself.targetIndividual->forAll(ni : NamedIndividual | ni.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localSameIndividuals constraint of '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameIndividual_localSameIndividuals(SameIndividual sameIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.SAME_INDIVIDUAL,
				 sameIndividual,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localSameIndividuals",
				 SAME_INDIVIDUAL__LOCAL_SAME_INDIVIDUALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferentIndividual(DifferentIndividual differentIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(differentIndividual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(differentIndividual, diagnostics, context);
		if (result || diagnostics != null) result &= validateDifferentIndividual_localDifferentIndividuals(differentIndividual, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDifferentIndividuals constraint of '<em>Different Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DIFFERENT_INDIVIDUAL__LOCAL_DIFFERENT_INDIVIDUALS__EEXPRESSION = "\n" +
		"\t\t\tself.targetIndividual->forAll(ni : NamedIndividual | ni.ontology = self.individualAssertion.ontology)";

	/**
	 * Validates the localDifferentIndividuals constraint of '<em>Different Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferentIndividual_localDifferentIndividuals(DifferentIndividual differentIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DIFFERENT_INDIVIDUAL,
				 differentIndividual,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDifferentIndividuals",
				 DIFFERENT_INDIVIDUAL__LOCAL_DIFFERENT_INDIVIDUALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAssertion(ObjectPropertyAssertion objectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectPropertyAssertion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyAssertion_localObjectPropertyAssertionObjectPropertyList(objectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectPropertyAssertion_localObjectPropertyAssertionInverseObjectProperty(objectPropertyAssertion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localObjectPropertyAssertionObjectPropertyList constraint of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_ASSERTION__LOCAL_OBJECT_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localObjectPropertyAssertionObjectPropertyList constraint of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAssertion_localObjectPropertyAssertionObjectPropertyList(ObjectPropertyAssertion objectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_ASSERTION,
				 objectPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyAssertionObjectPropertyList",
				 OBJECT_PROPERTY_ASSERTION__LOCAL_OBJECT_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localObjectPropertyAssertionInverseObjectProperty constraint of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_PROPERTY_ASSERTION__LOCAL_OBJECT_PROPERTY_ASSERTION_INVERSE_OBJECT_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localObjectPropertyAssertionInverseObjectProperty constraint of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAssertion_localObjectPropertyAssertionInverseObjectProperty(ObjectPropertyAssertion objectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.OBJECT_PROPERTY_ASSERTION,
				 objectPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localObjectPropertyAssertionInverseObjectProperty",
				 OBJECT_PROPERTY_ASSERTION__LOCAL_OBJECT_PROPERTY_ASSERTION_INVERSE_OBJECT_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion negativeObjectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(negativeObjectPropertyAssertion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNegativeObjectPropertyAssertion_localNegativeObjectPropertyAssertionObjectPropertyList(negativeObjectPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNegativeObjectPropertyAssertion_localNegativeObjectPropertyAssertionInverseObjectProperty(negativeObjectPropertyAssertion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localNegativeObjectPropertyAssertionObjectPropertyList constraint of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NEGATIVE_OBJECT_PROPERTY_ASSERTION__LOCAL_NEGATIVE_OBJECT_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localNegativeObjectPropertyAssertionObjectPropertyList constraint of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeObjectPropertyAssertion_localNegativeObjectPropertyAssertionObjectPropertyList(NegativeObjectPropertyAssertion negativeObjectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.NEGATIVE_OBJECT_PROPERTY_ASSERTION,
				 negativeObjectPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localNegativeObjectPropertyAssertionObjectPropertyList",
				 NEGATIVE_OBJECT_PROPERTY_ASSERTION__LOCAL_NEGATIVE_OBJECT_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the localNegativeObjectPropertyAssertionInverseObjectProperty constraint of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NEGATIVE_OBJECT_PROPERTY_ASSERTION__LOCAL_NEGATIVE_OBJECT_PROPERTY_ASSERTION_INVERSE_OBJECT_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localNegativeObjectPropertyAssertionInverseObjectProperty constraint of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeObjectPropertyAssertion_localNegativeObjectPropertyAssertionInverseObjectProperty(NegativeObjectPropertyAssertion negativeObjectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.NEGATIVE_OBJECT_PROPERTY_ASSERTION,
				 negativeObjectPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localNegativeObjectPropertyAssertionInverseObjectProperty",
				 NEGATIVE_OBJECT_PROPERTY_ASSERTION__LOCAL_NEGATIVE_OBJECT_PROPERTY_ASSERTION_INVERSE_OBJECT_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyAssertion(DataPropertyAssertion dataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPropertyAssertion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyAssertion_localDataPropertyAssertionObjectPropertyList(dataPropertyAssertion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localDataPropertyAssertionObjectPropertyList constraint of '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_PROPERTY_ASSERTION__LOCAL_DATA_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.dataPropertyExpressions->forAll(so: DataPropertyExpression | so.oclIsKindOf(DataPropertyList) implies so.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localDataPropertyAssertionObjectPropertyList constraint of '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyAssertion_localDataPropertyAssertionObjectPropertyList(DataPropertyAssertion dataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.DATA_PROPERTY_ASSERTION,
				 dataPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localDataPropertyAssertionObjectPropertyList",
				 DATA_PROPERTY_ASSERTION__LOCAL_DATA_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeDataPropertyAssertion(NegativeDataPropertyAssertion negativeDataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(negativeDataPropertyAssertion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(negativeDataPropertyAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNegativeDataPropertyAssertion_localNegativeDataPropertyAssertionObjectPropertyList(negativeDataPropertyAssertion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the localNegativeDataPropertyAssertionObjectPropertyList constraint of '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NEGATIVE_DATA_PROPERTY_ASSERTION__LOCAL_NEGATIVE_DATA_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION = "\n" +
		"\t\t\tself.dataPropertyExpressions->forAll(so: DataPropertyExpression | so.oclIsKindOf(DataPropertyList) implies so.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.individualAssertion.ontology))";

	/**
	 * Validates the localNegativeDataPropertyAssertionObjectPropertyList constraint of '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeDataPropertyAssertion_localNegativeDataPropertyAssertionObjectPropertyList(NegativeDataPropertyAssertion negativeDataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.NEGATIVE_DATA_PROPERTY_ASSERTION,
				 negativeDataPropertyAssertion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "localNegativeDataPropertyAssertionObjectPropertyList",
				 NEGATIVE_DATA_PROPERTY_ASSERTION__LOCAL_NEGATIVE_DATA_PROPERTY_ASSERTION_OBJECT_PROPERTY_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassExpression(ClassExpression classExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassList(ClassList classList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectIntersectionOf(ObjectIntersectionOf objectIntersectionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectIntersectionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectUnionOf(ObjectUnionOf objectUnionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectUnionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectComplementOf(ObjectComplementOf objectComplementOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectComplementOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectOneOf(ObjectOneOf objectOneOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectOneOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectSomeValuesFrom(ObjectSomeValuesFrom objectSomeValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectSomeValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectAllValuesFrom(ObjectAllValuesFrom objectAllValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectAllValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectHasValue(ObjectHasValue objectHasValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectHasValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMinCardinality(ObjectMinCardinality objectMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectMinCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMaxCardinality(ObjectMaxCardinality objectMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectMaxCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExactCardinality(ObjectExactCardinality objectExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectExactCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSomeValuesFrom(DataSomeValuesFrom dataSomeValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSomeValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAllValuesFrom(DataAllValuesFrom dataAllValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAllValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataHasValue(DataHasValue dataHasValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataHasValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMinCardinality(DataMinCardinality dataMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataMinCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMaxCardinality(DataMaxCardinality dataMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataMaxCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataExactCardinality(DataExactCardinality dataExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataExactCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEConnectionExpression(EConnectionExpression eConnectionExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eConnectionExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkSomeValuesFrom(LinkSomeValuesFrom linkSomeValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkSomeValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAllValuesFrom(LinkAllValuesFrom linkAllValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkAllValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkHasValue(LinkHasValue linkHasValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkHasValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkMinCardinality(LinkMinCardinality linkMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkMinCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkMaxCardinality(LinkMaxCardinality linkMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkMaxCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkExactCardinality(LinkExactCardinality linkExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkExactCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyExpression(ObjectPropertyExpression objectPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyList(ObjectPropertyList objectPropertyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInverseObjectProperty(InverseObjectProperty inverseObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inverseObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyExpression(DataPropertyExpression dataPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyList(DataPropertyList dataPropertyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantAnnotation(ConstantAnnotation constantAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationByEntity(AnnotationByEntity annotationByEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationByEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstant_constantLexicalValueEmpty(constant, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the constantLexicalValueEmpty constraint of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTANT__CONSTANT_LEXICAL_VALUE_EMPTY__EEXPRESSION = "self.lexicalValue.trim().size()>0";

	/**
	 * Validates the constantLexicalValueEmpty constraint of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant_constantLexicalValueEmpty(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(mowlPackage.Literals.CONSTANT,
				 constant,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "constantLexicalValueEmpty",
				 CONSTANT__CONSTANT_LEXICAL_VALUE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationProperty(AnnotationProperty annotationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //mowlValidator
