/**
 */
package mowl.impl;

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
import mowl.mowlFactory;
import mowl.mowlPackage;

import mowl.util.mowlValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class mowlPackageImpl extends EPackageImpl implements mowlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiontologyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentLinkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLinkPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointLinkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainLinkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeLinkPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyInverseOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjectPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDataPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeObjectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeDataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eConnectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationByEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum annotationPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mowl.mowlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mowlPackageImpl() {
		super(eNS_URI, mowlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mowlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mowlPackage init() {
		if (isInited) return (mowlPackage)EPackage.Registry.INSTANCE.getEPackage(mowlPackage.eNS_URI);

		// Obtain or create and register package
		mowlPackageImpl themowlPackage = (mowlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mowlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mowlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		themowlPackage.createPackageContents();

		// Initialize created meta-data
		themowlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(themowlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return mowlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		themowlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mowlPackage.eNS_URI, themowlPackage);
		return themowlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiontology() {
		return multiontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiontology_PrefixIRI() {
		return (EAttribute)multiontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiontology_Version() {
		return (EAttribute)multiontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiontology_Ontologies() {
		return (EReference)multiontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiontology_OntologyConnectors() {
		return (EReference)multiontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiontology_MultiontologyAxioms() {
		return (EReference)multiontologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiontology_MultiontologyAnnotations() {
		return (EReference)multiontologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologyConnector() {
		return ontologyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEConnector() {
		return eConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkProperty() {
		return linkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkProperty_FunctionalLinkProperty() {
		return (EAttribute)linkPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkProperty_InverseFunctionalLinkProperty() {
		return (EAttribute)linkPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkProperty_SourceOntology() {
		return (EReference)linkPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkProperty_TargetOntology() {
		return (EReference)linkPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkProperty_LinkPropertyAxioms() {
		return (EReference)linkPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxiom() {
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiontologyAxiom() {
		return multiontologyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPropertyAxiom() {
		return linkPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPropertyAxiom_LinkProperty() {
		return (EReference)linkPropertyAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentLinkProperty() {
		return equivalentLinkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentLinkProperty_LinkPropertyExpressions() {
		return (EReference)equivalentLinkPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLinkPropertyOf() {
		return subLinkPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLinkPropertyOf_LinkPropertyExpressions() {
		return (EReference)subLinkPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointLinkProperty() {
		return disjointLinkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointLinkProperty_LinkPropertyExpressions() {
		return (EReference)disjointLinkPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainLinkProperty() {
		return domainLinkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainLinkProperty_Expressions() {
		return (EReference)domainLinkPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeLinkPropertyOf() {
		return rangeLinkPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeLinkPropertyOf_Expressions() {
		return (EReference)rangeLinkPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPropertyExpression() {
		return linkPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPropertyList() {
		return linkPropertyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPropertyList_LinksProperty() {
		return (EReference)linkPropertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPropertyInverseOf() {
		return linkPropertyInverseOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPropertyInverseOf_InverseLinkPropertyOf() {
		return (EReference)linkPropertyInverseOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_Version() {
		return (EAttribute)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Classes() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ObjectsProperty() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataProperty() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Individuals() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Literals() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OntologyAxioms() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OntologyAnnotations() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Multiontology() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Id() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Annotations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ClassAxioms() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Ontology() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_ObjectPropertyAxioms() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_FunctionalObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_InverseFunctionalObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_TransitiveObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_SymmetricObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_AsymmetricObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_ReflexiveObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IrreflexiveObjectProperty() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_Ontology() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_DataPropertyAxioms() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_FunctionalDataProperty() {
		return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_Ontology() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_IndividualAssertions() {
		return (EReference)individualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_Ontology() {
		return (EReference)individualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedIndividual() {
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousIndividual() {
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymousIndividual_NodeID() {
		return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologyAxiom() {
		return ontologyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAxiom() {
		return classAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAxiom_ClassAxiom() {
		return (EReference)classAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointClass() {
		return disjointClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClass_Expressions() {
		return (EReference)disjointClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointUnion() {
		return disjointUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_Expressions() {
		return (EReference)disjointUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentClass() {
		return equivalentClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClass_Expressions() {
		return (EReference)equivalentClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubClassOf() {
		return subClassOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_Expressions() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAxiom() {
		return objectPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAxiom_ObjectPropertyAxiom() {
		return (EReference)objectPropertyAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointObjectProperty() {
		return disjointObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperty_ObjectPropertyExpressions() {
		return (EReference)disjointObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentObjectProperty() {
		return equivalentObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperty_ObjectPropertyExpressions() {
		return (EReference)equivalentObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjectPropertyOf() {
		return subObjectPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_ObjectPropertyExpressions() {
		return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectPropertyAxiom() {
		return inverseObjectPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectPropertyAxiom_ObjectProperty() {
		return (EReference)inverseObjectPropertyAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyDomain() {
		return objectPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_Expressions() {
		return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRange() {
		return objectPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_Expressions() {
		return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAxiom() {
		return dataPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAxiom_DataPropertyAxiom() {
		return (EReference)dataPropertyAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyDomain() {
		return dataPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_Expressions() {
		return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRange() {
		return dataPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_Literal() {
		return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointDataProperty() {
		return disjointDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointDataProperty_DataPropertyExpressions() {
		return (EReference)disjointDataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentDataProperty() {
		return equivalentDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentDataProperty_DataPropertyExpressions() {
		return (EReference)equivalentDataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDataPropertyOf() {
		return subDataPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_DataPropertyExpressions() {
		return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_IndividualAssertion() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAssertion() {
		return classAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_Expressions() {
		return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameIndividual() {
		return sameIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividual_TargetIndividual() {
		return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentIndividual() {
		return differentIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividual_TargetIndividual() {
		return (EReference)differentIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAssertion() {
		return objectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_ObjectPropertyExpressions() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_TargetIndividual() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeObjectPropertyAssertion() {
		return negativeObjectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpressions() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_TargetIndividual() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAssertion() {
		return dataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_DataPropertyExpressions() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_TargetValue() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeDataPropertyAssertion() {
		return negativeDataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_DataPropertyExpressions() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_TargetValue() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpression() {
		return classExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassList() {
		return classListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassList_Classes() {
		return (EReference)classListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIntersectionOf() {
		return objectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_Classes() {
		return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnionOf() {
		return objectUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_Classes() {
		return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComplementOf() {
		return objectComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_Classes() {
		return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOneOf() {
		return objectOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_Individual() {
		return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSomeValuesFrom() {
		return objectSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_Classes() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectProperties() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAllValuesFrom() {
		return objectAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_Classes() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectProperties() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasValue() {
		return objectHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_ObjectProperties() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_Individual() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMinCardinality() {
		return objectMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMinCardinality_Cardinality() {
		return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_Classes() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectProperties() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMaxCardinality() {
		return objectMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMaxCardinality_Cardinality() {
		return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_Classes() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectProperties() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExactCardinality() {
		return objectExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectExactCardinality_Cardinality() {
		return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_Classes() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectProperties() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSomeValuesFrom() {
		return dataSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataProperties() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_Literals() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAllValuesFrom() {
		return dataAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataProperties() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_Literals() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHasValue() {
		return dataHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_DataProperties() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_Literals() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMinCardinality() {
		return dataMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMinCardinality_Cardinality() {
		return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataProperties() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_Literals() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMaxCardinality() {
		return dataMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMaxCardinality_Cardinality() {
		return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataProperties() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_Literals() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExactCardinality() {
		return dataExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExactCardinality_Cardinality() {
		return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataProperties() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_Literals() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEConnectionExpression() {
		return eConnectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkSomeValuesFrom() {
		return linkSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkSomeValuesFrom_Classes() {
		return (EReference)linkSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkSomeValuesFrom_LinkProperties() {
		return (EReference)linkSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAllValuesFrom() {
		return linkAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAllValuesFrom_Classes() {
		return (EReference)linkAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAllValuesFrom_LinkProperties() {
		return (EReference)linkAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkHasValue() {
		return linkHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHasValue_LinkProperties() {
		return (EReference)linkHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHasValue_Individual() {
		return (EReference)linkHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkMinCardinality() {
		return linkMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMinCardinality_Classes() {
		return (EReference)linkMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMinCardinality_LinkProperties() {
		return (EReference)linkMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMinCardinality_Cardinality() {
		return (EAttribute)linkMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkMaxCardinality() {
		return linkMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMaxCardinality_Classes() {
		return (EReference)linkMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMaxCardinality_LinkProperties() {
		return (EReference)linkMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMaxCardinality_Cardinality() {
		return (EAttribute)linkMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkExactCardinality() {
		return linkExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkExactCardinality_Cardinality() {
		return (EAttribute)linkExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkExactCardinality_Classes() {
		return (EReference)linkExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkExactCardinality_LinkProperties() {
		return (EReference)linkExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyExpression() {
		return objectPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyList() {
		return objectPropertyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyList_ObjectProperties() {
		return (EReference)objectPropertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectProperty() {
		return inverseObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperty_ObjectProperties() {
		return (EReference)inverseObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyExpression() {
		return dataPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyList() {
		return dataPropertyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyList_DataProperties() {
		return (EReference)dataPropertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_AnnotationProperty() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotationTarget() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantAnnotation() {
		return constantAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantAnnotation_Value() {
		return (EAttribute)constantAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantAnnotation_Datatype() {
		return (EAttribute)constantAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationByEntity() {
		return annotationByEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationByEntity_AnnotationValue() {
		return (EReference)annotationByEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_LexicalValue() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Datatype() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Ontology() {
		return (EReference)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnnotationProperty() {
		return annotationPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlFactory getmowlFactory() {
		return (mowlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		multiontologyEClass = createEClass(MULTIONTOLOGY);
		createEAttribute(multiontologyEClass, MULTIONTOLOGY__PREFIX_IRI);
		createEAttribute(multiontologyEClass, MULTIONTOLOGY__VERSION);
		createEReference(multiontologyEClass, MULTIONTOLOGY__ONTOLOGIES);
		createEReference(multiontologyEClass, MULTIONTOLOGY__ONTOLOGY_CONNECTORS);
		createEReference(multiontologyEClass, MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS);
		createEReference(multiontologyEClass, MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS);

		ontologyConnectorEClass = createEClass(ONTOLOGY_CONNECTOR);

		eConnectorEClass = createEClass(ECONNECTOR);

		linkPropertyEClass = createEClass(LINK_PROPERTY);
		createEAttribute(linkPropertyEClass, LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY);
		createEAttribute(linkPropertyEClass, LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY);
		createEReference(linkPropertyEClass, LINK_PROPERTY__SOURCE_ONTOLOGY);
		createEReference(linkPropertyEClass, LINK_PROPERTY__TARGET_ONTOLOGY);
		createEReference(linkPropertyEClass, LINK_PROPERTY__LINK_PROPERTY_AXIOMS);

		axiomEClass = createEClass(AXIOM);

		multiontologyAxiomEClass = createEClass(MULTIONTOLOGY_AXIOM);

		linkPropertyAxiomEClass = createEClass(LINK_PROPERTY_AXIOM);
		createEReference(linkPropertyAxiomEClass, LINK_PROPERTY_AXIOM__LINK_PROPERTY);

		equivalentLinkPropertyEClass = createEClass(EQUIVALENT_LINK_PROPERTY);
		createEReference(equivalentLinkPropertyEClass, EQUIVALENT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS);

		subLinkPropertyOfEClass = createEClass(SUB_LINK_PROPERTY_OF);
		createEReference(subLinkPropertyOfEClass, SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS);

		disjointLinkPropertyEClass = createEClass(DISJOINT_LINK_PROPERTY);
		createEReference(disjointLinkPropertyEClass, DISJOINT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS);

		domainLinkPropertyEClass = createEClass(DOMAIN_LINK_PROPERTY);
		createEReference(domainLinkPropertyEClass, DOMAIN_LINK_PROPERTY__EXPRESSIONS);

		rangeLinkPropertyOfEClass = createEClass(RANGE_LINK_PROPERTY_OF);
		createEReference(rangeLinkPropertyOfEClass, RANGE_LINK_PROPERTY_OF__EXPRESSIONS);

		linkPropertyExpressionEClass = createEClass(LINK_PROPERTY_EXPRESSION);

		linkPropertyListEClass = createEClass(LINK_PROPERTY_LIST);
		createEReference(linkPropertyListEClass, LINK_PROPERTY_LIST__LINKS_PROPERTY);

		linkPropertyInverseOfEClass = createEClass(LINK_PROPERTY_INVERSE_OF);
		createEReference(linkPropertyInverseOfEClass, LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF);

		ontologyEClass = createEClass(ONTOLOGY);
		createEAttribute(ontologyEClass, ONTOLOGY__VERSION);
		createEReference(ontologyEClass, ONTOLOGY__CLASSES);
		createEReference(ontologyEClass, ONTOLOGY__OBJECTS_PROPERTY);
		createEReference(ontologyEClass, ONTOLOGY__DATA_PROPERTY);
		createEReference(ontologyEClass, ONTOLOGY__INDIVIDUALS);
		createEReference(ontologyEClass, ONTOLOGY__LITERALS);
		createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_AXIOMS);
		createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_ANNOTATIONS);
		createEReference(ontologyEClass, ONTOLOGY__MULTIONTOLOGY);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ID);
		createEReference(entityEClass, ENTITY__ANNOTATIONS);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__CLASS_AXIOMS);
		createEReference(classEClass, CLASS__ONTOLOGY);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__ONTOLOGY);

		dataPropertyEClass = createEClass(DATA_PROPERTY);
		createEReference(dataPropertyEClass, DATA_PROPERTY__DATA_PROPERTY_AXIOMS);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY);
		createEReference(dataPropertyEClass, DATA_PROPERTY__ONTOLOGY);

		individualEClass = createEClass(INDIVIDUAL);
		createEReference(individualEClass, INDIVIDUAL__INDIVIDUAL_ASSERTIONS);
		createEReference(individualEClass, INDIVIDUAL__ONTOLOGY);

		namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

		anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
		createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

		ontologyAxiomEClass = createEClass(ONTOLOGY_AXIOM);

		classAxiomEClass = createEClass(CLASS_AXIOM);
		createEReference(classAxiomEClass, CLASS_AXIOM__CLASS_AXIOM);

		disjointClassEClass = createEClass(DISJOINT_CLASS);
		createEReference(disjointClassEClass, DISJOINT_CLASS__EXPRESSIONS);

		disjointUnionEClass = createEClass(DISJOINT_UNION);
		createEReference(disjointUnionEClass, DISJOINT_UNION__EXPRESSIONS);

		equivalentClassEClass = createEClass(EQUIVALENT_CLASS);
		createEReference(equivalentClassEClass, EQUIVALENT_CLASS__EXPRESSIONS);

		subClassOfEClass = createEClass(SUB_CLASS_OF);
		createEReference(subClassOfEClass, SUB_CLASS_OF__EXPRESSIONS);

		objectPropertyAxiomEClass = createEClass(OBJECT_PROPERTY_AXIOM);
		createEReference(objectPropertyAxiomEClass, OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM);

		disjointObjectPropertyEClass = createEClass(DISJOINT_OBJECT_PROPERTY);
		createEReference(disjointObjectPropertyEClass, DISJOINT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS);

		equivalentObjectPropertyEClass = createEClass(EQUIVALENT_OBJECT_PROPERTY);
		createEReference(equivalentObjectPropertyEClass, EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS);

		subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
		createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY_EXPRESSIONS);

		inverseObjectPropertyAxiomEClass = createEClass(INVERSE_OBJECT_PROPERTY_AXIOM);
		createEReference(inverseObjectPropertyAxiomEClass, INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY);

		objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
		createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__EXPRESSIONS);

		objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
		createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__EXPRESSIONS);

		dataPropertyAxiomEClass = createEClass(DATA_PROPERTY_AXIOM);
		createEReference(dataPropertyAxiomEClass, DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM);

		dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
		createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__EXPRESSIONS);

		dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
		createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__LITERAL);

		disjointDataPropertyEClass = createEClass(DISJOINT_DATA_PROPERTY);
		createEReference(disjointDataPropertyEClass, DISJOINT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS);

		equivalentDataPropertyEClass = createEClass(EQUIVALENT_DATA_PROPERTY);
		createEReference(equivalentDataPropertyEClass, EQUIVALENT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS);

		subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
		createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__INDIVIDUAL_ASSERTION);

		classAssertionEClass = createEClass(CLASS_ASSERTION);
		createEReference(classAssertionEClass, CLASS_ASSERTION__EXPRESSIONS);

		sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
		createEReference(sameIndividualEClass, SAME_INDIVIDUAL__TARGET_INDIVIDUAL);

		differentIndividualEClass = createEClass(DIFFERENT_INDIVIDUAL);
		createEReference(differentIndividualEClass, DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL);

		objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);

		negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);

		expressionEClass = createEClass(EXPRESSION);

		classExpressionEClass = createEClass(CLASS_EXPRESSION);

		classListEClass = createEClass(CLASS_LIST);
		createEReference(classListEClass, CLASS_LIST__CLASSES);

		objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
		createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__CLASSES);

		objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
		createEReference(objectUnionOfEClass, OBJECT_UNION_OF__CLASSES);

		objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
		createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__CLASSES);

		objectOneOfEClass = createEClass(OBJECT_ONE_OF);
		createEReference(objectOneOfEClass, OBJECT_ONE_OF__INDIVIDUAL);

		objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__CLASSES);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTIES);

		objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__CLASSES);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES);

		objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__OBJECT_PROPERTIES);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__INDIVIDUAL);

		objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
		createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CLASSES);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__OBJECT_PROPERTIES);

		objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
		createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CLASSES);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__OBJECT_PROPERTIES);

		objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
		createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CLASSES);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTIES);

		dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_PROPERTIES);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__LITERALS);

		dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_PROPERTIES);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__LITERALS);

		dataHasValueEClass = createEClass(DATA_HAS_VALUE);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__DATA_PROPERTIES);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__LITERALS);

		dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
		createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_PROPERTIES);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__LITERALS);

		dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
		createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_PROPERTIES);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__LITERALS);

		dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
		createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_PROPERTIES);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__LITERALS);

		eConnectionExpressionEClass = createEClass(ECONNECTION_EXPRESSION);

		linkSomeValuesFromEClass = createEClass(LINK_SOME_VALUES_FROM);
		createEReference(linkSomeValuesFromEClass, LINK_SOME_VALUES_FROM__CLASSES);
		createEReference(linkSomeValuesFromEClass, LINK_SOME_VALUES_FROM__LINK_PROPERTIES);

		linkAllValuesFromEClass = createEClass(LINK_ALL_VALUES_FROM);
		createEReference(linkAllValuesFromEClass, LINK_ALL_VALUES_FROM__CLASSES);
		createEReference(linkAllValuesFromEClass, LINK_ALL_VALUES_FROM__LINK_PROPERTIES);

		linkHasValueEClass = createEClass(LINK_HAS_VALUE);
		createEReference(linkHasValueEClass, LINK_HAS_VALUE__LINK_PROPERTIES);
		createEReference(linkHasValueEClass, LINK_HAS_VALUE__INDIVIDUAL);

		linkMinCardinalityEClass = createEClass(LINK_MIN_CARDINALITY);
		createEReference(linkMinCardinalityEClass, LINK_MIN_CARDINALITY__CLASSES);
		createEReference(linkMinCardinalityEClass, LINK_MIN_CARDINALITY__LINK_PROPERTIES);
		createEAttribute(linkMinCardinalityEClass, LINK_MIN_CARDINALITY__CARDINALITY);

		linkMaxCardinalityEClass = createEClass(LINK_MAX_CARDINALITY);
		createEReference(linkMaxCardinalityEClass, LINK_MAX_CARDINALITY__CLASSES);
		createEReference(linkMaxCardinalityEClass, LINK_MAX_CARDINALITY__LINK_PROPERTIES);
		createEAttribute(linkMaxCardinalityEClass, LINK_MAX_CARDINALITY__CARDINALITY);

		linkExactCardinalityEClass = createEClass(LINK_EXACT_CARDINALITY);
		createEAttribute(linkExactCardinalityEClass, LINK_EXACT_CARDINALITY__CARDINALITY);
		createEReference(linkExactCardinalityEClass, LINK_EXACT_CARDINALITY__CLASSES);
		createEReference(linkExactCardinalityEClass, LINK_EXACT_CARDINALITY__LINK_PROPERTIES);

		objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

		objectPropertyListEClass = createEClass(OBJECT_PROPERTY_LIST);
		createEReference(objectPropertyListEClass, OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES);

		inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
		createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES);

		dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

		dataPropertyListEClass = createEClass(DATA_PROPERTY_LIST);
		createEReference(dataPropertyListEClass, DATA_PROPERTY_LIST__DATA_PROPERTIES);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__ANNOTATION_PROPERTY);
		createEReference(annotationEClass, ANNOTATION__ANNOTATION_TARGET);

		constantAnnotationEClass = createEClass(CONSTANT_ANNOTATION);
		createEAttribute(constantAnnotationEClass, CONSTANT_ANNOTATION__VALUE);
		createEAttribute(constantAnnotationEClass, CONSTANT_ANNOTATION__DATATYPE);

		annotationByEntityEClass = createEClass(ANNOTATION_BY_ENTITY);
		createEReference(annotationByEntityEClass, ANNOTATION_BY_ENTITY__ANNOTATION_VALUE);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__LEXICAL_VALUE);
		createEAttribute(constantEClass, CONSTANT__DATATYPE);
		createEReference(constantEClass, CONSTANT__ONTOLOGY);

		// Create enums
		annotationPropertyEEnum = createEEnum(ANNOTATION_PROPERTY);
		dataTypeEEnum = createEEnum(DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiontologyEClass.getESuperTypes().add(this.getEntity());
		ontologyConnectorEClass.getESuperTypes().add(this.getEntity());
		eConnectorEClass.getESuperTypes().add(this.getOntologyConnector());
		linkPropertyEClass.getESuperTypes().add(this.getEConnector());
		axiomEClass.getESuperTypes().add(this.getEntity());
		multiontologyAxiomEClass.getESuperTypes().add(this.getAxiom());
		linkPropertyAxiomEClass.getESuperTypes().add(this.getMultiontologyAxiom());
		equivalentLinkPropertyEClass.getESuperTypes().add(this.getLinkPropertyAxiom());
		subLinkPropertyOfEClass.getESuperTypes().add(this.getLinkPropertyAxiom());
		disjointLinkPropertyEClass.getESuperTypes().add(this.getLinkPropertyAxiom());
		domainLinkPropertyEClass.getESuperTypes().add(this.getLinkPropertyAxiom());
		rangeLinkPropertyOfEClass.getESuperTypes().add(this.getLinkPropertyAxiom());
		linkPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
		linkPropertyListEClass.getESuperTypes().add(this.getLinkPropertyExpression());
		linkPropertyInverseOfEClass.getESuperTypes().add(this.getLinkPropertyExpression());
		ontologyEClass.getESuperTypes().add(this.getEntity());
		classEClass.getESuperTypes().add(this.getEntity());
		objectPropertyEClass.getESuperTypes().add(this.getEntity());
		dataPropertyEClass.getESuperTypes().add(this.getEntity());
		namedIndividualEClass.getESuperTypes().add(this.getEntity());
		namedIndividualEClass.getESuperTypes().add(this.getIndividual());
		anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
		ontologyAxiomEClass.getESuperTypes().add(this.getAxiom());
		classAxiomEClass.getESuperTypes().add(this.getOntologyAxiom());
		disjointClassEClass.getESuperTypes().add(this.getClassAxiom());
		disjointUnionEClass.getESuperTypes().add(this.getClassAxiom());
		equivalentClassEClass.getESuperTypes().add(this.getClassAxiom());
		subClassOfEClass.getESuperTypes().add(this.getClassAxiom());
		objectPropertyAxiomEClass.getESuperTypes().add(this.getOntologyAxiom());
		disjointObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		equivalentObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		inverseObjectPropertyAxiomEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		dataPropertyAxiomEClass.getESuperTypes().add(this.getOntologyAxiom());
		dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		disjointDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		equivalentDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		assertionEClass.getESuperTypes().add(this.getOntologyAxiom());
		classAssertionEClass.getESuperTypes().add(this.getAssertion());
		sameIndividualEClass.getESuperTypes().add(this.getAssertion());
		differentIndividualEClass.getESuperTypes().add(this.getAssertion());
		objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		classExpressionEClass.getESuperTypes().add(this.getExpression());
		classListEClass.getESuperTypes().add(this.getClassExpression());
		objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
		objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
		objectSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		objectAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		objectHasValueEClass.getESuperTypes().add(this.getClassExpression());
		objectMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		objectMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		objectExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		dataAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		dataHasValueEClass.getESuperTypes().add(this.getClassExpression());
		dataMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		eConnectionExpressionEClass.getESuperTypes().add(this.getExpression());
		linkSomeValuesFromEClass.getESuperTypes().add(this.getEConnectionExpression());
		linkAllValuesFromEClass.getESuperTypes().add(this.getEConnectionExpression());
		linkHasValueEClass.getESuperTypes().add(this.getEConnectionExpression());
		linkMinCardinalityEClass.getESuperTypes().add(this.getEConnectionExpression());
		linkMaxCardinalityEClass.getESuperTypes().add(this.getEConnectionExpression());
		linkExactCardinalityEClass.getESuperTypes().add(this.getEConnectionExpression());
		objectPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
		objectPropertyListEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		dataPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
		dataPropertyListEClass.getESuperTypes().add(this.getDataPropertyExpression());
		constantAnnotationEClass.getESuperTypes().add(this.getAnnotation());
		annotationByEntityEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(multiontologyEClass, Multiontology.class, "Multiontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiontology_PrefixIRI(), ecorePackage.getEString(), "prefixIRI", null, 1, 1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiontology_Version(), ecorePackage.getEString(), "version", null, 1, 1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiontology_Ontologies(), this.getOntology(), this.getOntology_Multiontology(), "ontologies", null, 1, -1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiontology_OntologyConnectors(), this.getOntologyConnector(), null, "ontologyConnectors", null, 0, -1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiontology_MultiontologyAxioms(), this.getMultiontologyAxiom(), null, "multiontologyAxioms", null, 0, -1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiontology_MultiontologyAnnotations(), this.getAnnotation(), null, "multiontologyAnnotations", null, 0, -1, Multiontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ontologyConnectorEClass, OntologyConnector.class, "OntologyConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eConnectorEClass, EConnector.class, "EConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkPropertyEClass, LinkProperty.class, "LinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkProperty_FunctionalLinkProperty(), ecorePackage.getEBoolean(), "functionalLinkProperty", "false", 1, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkProperty_InverseFunctionalLinkProperty(), ecorePackage.getEBoolean(), "inverseFunctionalLinkProperty", "false", 1, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkProperty_SourceOntology(), this.getOntology(), null, "sourceOntology", null, 1, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkProperty_TargetOntology(), this.getOntology(), null, "targetOntology", null, 1, 1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkProperty_LinkPropertyAxioms(), this.getLinkPropertyAxiom(), this.getLinkPropertyAxiom_LinkProperty(), "linkPropertyAxioms", null, 0, -1, LinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axiomEClass, Axiom.class, "Axiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiontologyAxiomEClass, MultiontologyAxiom.class, "MultiontologyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkPropertyAxiomEClass, LinkPropertyAxiom.class, "LinkPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPropertyAxiom_LinkProperty(), this.getLinkProperty(), this.getLinkProperty_LinkPropertyAxioms(), "linkProperty", null, 1, 1, LinkPropertyAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentLinkPropertyEClass, EquivalentLinkProperty.class, "EquivalentLinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentLinkProperty_LinkPropertyExpressions(), this.getLinkPropertyExpression(), null, "linkPropertyExpressions", null, 1, -1, EquivalentLinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subLinkPropertyOfEClass, SubLinkPropertyOf.class, "SubLinkPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubLinkPropertyOf_LinkPropertyExpressions(), this.getLinkPropertyExpression(), null, "linkPropertyExpressions", null, 1, -1, SubLinkPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disjointLinkPropertyEClass, DisjointLinkProperty.class, "DisjointLinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointLinkProperty_LinkPropertyExpressions(), this.getLinkPropertyExpression(), null, "linkPropertyExpressions", null, 1, -1, DisjointLinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainLinkPropertyEClass, DomainLinkProperty.class, "DomainLinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainLinkProperty_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, DomainLinkProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeLinkPropertyOfEClass, RangeLinkPropertyOf.class, "RangeLinkPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeLinkPropertyOf_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, RangeLinkPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkPropertyExpressionEClass, LinkPropertyExpression.class, "LinkPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkPropertyListEClass, LinkPropertyList.class, "LinkPropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPropertyList_LinksProperty(), this.getLinkProperty(), null, "linksProperty", null, 1, -1, LinkPropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkPropertyInverseOfEClass, LinkPropertyInverseOf.class, "LinkPropertyInverseOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPropertyInverseOf_InverseLinkPropertyOf(), this.getLinkProperty(), null, "inverseLinkPropertyOf", null, 1, 1, LinkPropertyInverseOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntology_Version(), ecorePackage.getEString(), "version", null, 1, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Classes(), this.getClass_(), this.getClass_Ontology(), "classes", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ObjectsProperty(), this.getObjectProperty(), this.getObjectProperty_Ontology(), "objectsProperty", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_DataProperty(), this.getDataProperty(), this.getDataProperty_Ontology(), "dataProperty", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Individuals(), this.getIndividual(), this.getIndividual_Ontology(), "individuals", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Literals(), this.getConstant(), this.getConstant_Ontology(), "literals", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_OntologyAxioms(), this.getOntologyAxiom(), null, "ontologyAxioms", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_OntologyAnnotations(), this.getAnnotation(), null, "ontologyAnnotations", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOntology_Multiontology(), this.getMultiontology(), this.getMultiontology_Ontologies(), "multiontology", null, 1, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Id(), ecorePackage.getEString(), "id", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Annotations(), this.getAnnotation(), this.getAnnotation_AnnotationTarget(), "annotations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classEClass, mowl.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_ClassAxioms(), this.getClassAxiom(), this.getClassAxiom_ClassAxiom(), "classAxioms", null, 0, -1, mowl.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Ontology(), this.getOntology(), this.getOntology_Classes(), "ontology", null, 1, 1, mowl.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectProperty_ObjectPropertyAxioms(), this.getObjectPropertyAxiom(), this.getObjectPropertyAxiom_ObjectPropertyAxiom(), "objectPropertyAxioms", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_FunctionalObjectProperty(), ecorePackage.getEBoolean(), "functionalObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_InverseFunctionalObjectProperty(), ecorePackage.getEBoolean(), "inverseFunctionalObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_TransitiveObjectProperty(), ecorePackage.getEBoolean(), "transitiveObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_SymmetricObjectProperty(), ecorePackage.getEBoolean(), "symmetricObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_AsymmetricObjectProperty(), ecorePackage.getEBoolean(), "asymmetricObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_ReflexiveObjectProperty(), ecorePackage.getEBoolean(), "reflexiveObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IrreflexiveObjectProperty(), ecorePackage.getEBoolean(), "irreflexiveObjectProperty", "false", 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_Ontology(), this.getOntology(), this.getOntology_ObjectsProperty(), "ontology", null, 1, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProperty_DataPropertyAxioms(), this.getDataPropertyAxiom(), this.getDataPropertyAxiom_DataPropertyAxiom(), "dataPropertyAxioms", null, 0, -1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProperty_FunctionalDataProperty(), ecorePackage.getEBoolean(), "functionalDataProperty", "false", 1, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_Ontology(), this.getOntology(), this.getOntology_DataProperty(), "ontology", null, 1, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividual_IndividualAssertions(), this.getAssertion(), this.getAssertion_IndividualAssertion(), "individualAssertions", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_Ontology(), this.getOntology(), this.getOntology_Individuals(), "ontology", null, 1, 1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyAxiomEClass, OntologyAxiom.class, "OntologyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classAxiomEClass, ClassAxiom.class, "ClassAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAxiom_ClassAxiom(), this.getClass_(), this.getClass_ClassAxioms(), "classAxiom", null, 1, 1, ClassAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointClassEClass, DisjointClass.class, "DisjointClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointClass_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, DisjointClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointUnion_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentClassEClass, EquivalentClass.class, "EquivalentClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentClass_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, EquivalentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubClassOf_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyAxiomEClass, ObjectPropertyAxiom.class, "ObjectPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyAxiom_ObjectPropertyAxiom(), this.getObjectProperty(), this.getObjectProperty_ObjectPropertyAxioms(), "objectPropertyAxiom", null, 1, 1, ObjectPropertyAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointObjectPropertyEClass, DisjointObjectProperty.class, "DisjointObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointObjectProperty_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 1, -1, DisjointObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentObjectPropertyEClass, EquivalentObjectProperty.class, "EquivalentObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentObjectProperty_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 1, -1, EquivalentObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubObjectPropertyOf_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 1, -1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inverseObjectPropertyAxiomEClass, InverseObjectPropertyAxiom.class, "InverseObjectPropertyAxiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseObjectPropertyAxiom_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 1, 1, InverseObjectPropertyAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyDomain_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyRange_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyAxiomEClass, DataPropertyAxiom.class, "DataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyAxiom_DataPropertyAxiom(), this.getDataProperty(), this.getDataProperty_DataPropertyAxioms(), "dataPropertyAxiom", null, 1, 1, DataPropertyAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyDomain_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyRange_Literal(), this.getConstant(), null, "literal", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointDataPropertyEClass, DisjointDataProperty.class, "DisjointDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointDataProperty_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, DisjointDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentDataPropertyEClass, EquivalentDataProperty.class, "EquivalentDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentDataProperty_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, EquivalentDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubDataPropertyOf_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_IndividualAssertion(), this.getIndividual(), this.getIndividual_IndividualAssertions(), "individualAssertion", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAssertion_Expressions(), this.getClassExpression(), null, "expressions", null, 1, -1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameIndividual_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(differentIndividualEClass, DifferentIndividual.class, "DifferentIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentIndividual_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, -1, DifferentIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyAssertion_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeObjectPropertyAssertion_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyAssertion_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyAssertion_TargetValue(), this.getConstant(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeDataPropertyAssertion_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getConstant(), null, "targetValue", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classListEClass, ClassList.class, "ClassList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassList_Classes(), this.getClass_(), null, "classes", null, 1, -1, ClassList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIntersectionOf_Classes(), this.getClass_(), null, "classes", null, 1, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectUnionOf_Classes(), this.getClass_(), null, "classes", null, 1, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectComplementOf_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOneOf_Individual(), this.getIndividual(), null, "individual", null, 1, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSomeValuesFrom_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSomeValuesFrom_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAllValuesFrom_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectAllValuesFrom_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasValue_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectHasValue_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMinCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMinCardinality_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMaxCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMaxCardinality_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExactCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExactCardinality_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSomeValuesFrom_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSomeValuesFrom_Literals(), this.getConstant(), null, "literals", null, 1, -1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAllValuesFrom_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAllValuesFrom_Literals(), this.getConstant(), null, "literals", null, 1, -1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataHasValue_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataHasValue_Literals(), this.getConstant(), null, "literals", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMinCardinality_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMinCardinality_Literals(), this.getConstant(), null, "literals", null, 1, -1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMaxCardinality_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMaxCardinality_Literals(), this.getConstant(), null, "literals", null, 1, -1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExactCardinality_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExactCardinality_Literals(), this.getConstant(), null, "literals", null, 1, -1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eConnectionExpressionEClass, EConnectionExpression.class, "EConnectionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkSomeValuesFromEClass, LinkSomeValuesFrom.class, "LinkSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkSomeValuesFrom_Classes(), this.getClass_(), null, "classes", null, 1, 1, LinkSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkSomeValuesFrom_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkAllValuesFromEClass, LinkAllValuesFrom.class, "LinkAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAllValuesFrom_Classes(), this.getClass_(), null, "classes", null, 1, 1, LinkAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkAllValuesFrom_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkHasValueEClass, LinkHasValue.class, "LinkHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkHasValue_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkHasValue_Individual(), this.getNamedIndividual(), null, "individual", null, 1, 1, LinkHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMinCardinalityEClass, LinkMinCardinality.class, "LinkMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkMinCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, LinkMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMinCardinality_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, LinkMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMaxCardinalityEClass, LinkMaxCardinality.class, "LinkMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkMaxCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, LinkMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMaxCardinality_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, LinkMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkExactCardinalityEClass, LinkExactCardinality.class, "LinkExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, LinkExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkExactCardinality_Classes(), this.getClass_(), null, "classes", null, 1, 1, LinkExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkExactCardinality_LinkProperties(), this.getLinkProperty(), null, "linkProperties", null, 1, 1, LinkExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyListEClass, ObjectPropertyList.class, "ObjectPropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyList_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, -1, ObjectPropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseObjectProperty_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPropertyListEClass, DataPropertyList.class, "DataPropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyList_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 1, -1, DataPropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_AnnotationProperty(), this.getAnnotationProperty(), "annotationProperty", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_AnnotationTarget(), this.getEntity(), this.getEntity_Annotations(), "annotationTarget", null, 1, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantAnnotationEClass, ConstantAnnotation.class, "ConstantAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantAnnotation_Value(), ecorePackage.getEString(), "value", null, 1, 1, ConstantAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantAnnotation_Datatype(), this.getDataType(), "datatype", null, 0, 1, ConstantAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationByEntityEClass, AnnotationByEntity.class, "AnnotationByEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationByEntity_AnnotationValue(), this.getEntity(), null, "annotationValue", null, 1, 1, AnnotationByEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_LexicalValue(), ecorePackage.getEString(), "lexicalValue", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Datatype(), this.getDataType(), "datatype", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstant_Ontology(), this.getOntology(), this.getOntology_Literals(), "ontology", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(annotationPropertyEEnum, AnnotationProperty.class, "AnnotationProperty");
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.BACKWARD_COMPATIBLE_WITH);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.COMMENT);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.DEPRECATED);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.IS_COMPATIBLE_WITH);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.IS_DEFINED);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.LABEL);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.PRIOR_VERSION);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.SEE_ALSO);
		addEEnumLiteral(annotationPropertyEEnum, AnnotationProperty.VERSION_INFO);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.ANY_URI);
		addEEnumLiteral(dataTypeEEnum, DataType.BASED64_BINARY);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.BYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE_TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE_TIME_STAMP);
		addEEnumLiteral(dataTypeEEnum, DataType.DECIMAL);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.HEX_BINARY);
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.LANGUAGE);
		addEEnumLiteral(dataTypeEEnum, DataType.LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.NAME);
		addEEnumLiteral(dataTypeEEnum, DataType.NC_NAME);
		addEEnumLiteral(dataTypeEEnum, DataType.NEGATIVE_INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.NMTOKEN);
		addEEnumLiteral(dataTypeEEnum, DataType.NON_NEGATIVE_INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.NON_POSITIVE_INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.NORMALIZED_STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.PLAIN_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.POSITIVE_INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.RATIONAL);
		addEEnumLiteral(dataTypeEEnum, DataType.REAL);
		addEEnumLiteral(dataTypeEEnum, DataType.SHORT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.TOKEN);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_BYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_INT);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_SHORT);
		addEEnumLiteral(dataTypeEEnum, DataType.XML_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });																																																																							
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (multiontologyEClass, 
		   source, 
		   new String[] {
			 "constraints", "diffOntologiesId multiontologyPrefixIRIEmpty multiontologyVersionEmpty multiontologyIdEmpty"
		   });			
		addAnnotation
		  (ontologyConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ontologyConeectorIdEmpty"
		   });			
		addAnnotation
		  (linkPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "differentOntologiesLinkProperty"
		   });			
		addAnnotation
		  (equivalentLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "equivalentLinkPropertyList equivalentLinkPropertyInverseOf"
		   });			
		addAnnotation
		  (subLinkPropertyOfEClass, 
		   source, 
		   new String[] {
			 "constraints", "subLinkPropertyOfLinkPropertyList subLinkPropertyOfLinkPropertyInverseOf"
		   });			
		addAnnotation
		  (disjointLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "subLinkPropertyOfLinkPropertyList subLinkPropertyOfLinkPropertyInverseOf"
		   });			
		addAnnotation
		  (domainLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "expressionsClassList expressionsObjectIntersectionOf expressionsObjectUnionOf expressionsObjectSomeValuesFrom expressionsObjectAllValuesFrom expressionsObjectHasValue expressionsObjectComplementOf expressionsObjectOneOf expressionsObjectMinCardinality expressionsObjectMaxCardinality expressionsObjectExactCardinality expressionsDataSomeValuesFrom expressionsDataAllValuesFrom expressionsDataHasValue expressionsDataMinCardinality expressionsDataMaxCardinality expressionsDataExactCardinality"
		   });			
		addAnnotation
		  (rangeLinkPropertyOfEClass, 
		   source, 
		   new String[] {
			 "constraints", "expressionsClassList expressionsObjectIntersectionOf expressionsObjectUnionOf expressionsObjectSomeValuesFrom expressionsObjectAllValuesFrom expressionsObjectHasValue expressionsObjectComplementOf expressionsObjectOneOf expressionsObjectMinCardinality expressionsObjectMaxCardinality expressionsObjectExactCardinality expressionsDataSomeValuesFrom expressionsDataAllValuesFrom expressionsDataHasValue expressionsDataMinCardinality expressionsDataMaxCardinality expressionsDataExactCardinality"
		   });			
		addAnnotation
		  (ontologyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ontologyIdEmpty ontologyVersionEmpty diffClassesId diffObjectPropertiesId diffDataPropertiesId diffIndividuals"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "classIdEmpty"
		   });			
		addAnnotation
		  (objectPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "objectPropertyIdEmpty"
		   });			
		addAnnotation
		  (dataPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "dataPropertyIdEmpty"
		   });			
		addAnnotation
		  (namedIndividualEClass, 
		   source, 
		   new String[] {
			 "constraints", "namedIndividualIdEmpty"
		   });			
		addAnnotation
		  (anonymousIndividualEClass, 
		   source, 
		   new String[] {
			 "constraints", "anonymousIndividualIdEmpty"
		   });			
		addAnnotation
		  (disjointClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDisjointClassesClassList localDisjointClassesObjectIntersectionOf localDisjointClassesObjectUnionOf localDisjointClassesObjectSomeValuesFrom localDisjointClassesObjectAllValuesFrom localDisjointClassesObjectHasValue localDisjointClassesObjectComplementOf localDisjointClassesObjectOneOf localDisjointClassesObjectMinCardinality localDisjointClassesObjectMaxCardinality localDisjointClassesObjectExactCardinality localDisjointClassesDataSomeValuesFrom localDisjointClassesDataAllValuesFrom localDisjointClassesDataHasValue localDisjointClassesDataMinCardinality localDisjointClassesDataMaxCardinality localDisjointClassesDataExactCardinality externalDisjointClassesLinkPropertySomeValuesFrom externalDisjointClassesLinkPropertyAllValuesFrom externalDisjointClassesLinkPropertyHasValue externalDisjointClassesLinkPropertyMinCardinality externalDisjointClassesLinkPropertyMaxCardinality externalDisjointClassesLinkPropertyExactCardinality"
		   });			
		addAnnotation
		  (disjointUnionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDisjointUnionClassesClassList localDisjointUnionClassesObjectIntersectionOf localDisjointUnionClassesObjectUnionOf localDisjointUnionClassesObjectSomeValuesFrom localDisjointUnionClassesObjectAllValuesFrom localDisjointUnionClassesObjectHasValue localDisjointUnionClassesObjectComplementOf localDisjointUnionClassesObjectOneOf localDisjointUnionClassesObjectMinCardinality localDisjointUnionClassesObjectMaxCardinality localDisjointUnionClassesObjectExactCardinality localDisjointUnionClassesDataSomeValuesFrom localDisjointUnionClassesDataAllValuesFrom localDisjointUnionClassesDataHasValue localDisjointUnionClassesDataMinCardinality localDisjointUnionClassesDataMaxCardinality localDisjointUnionClassesDataExactCardinality externalDisjointUnionClassesLinkPropertySomeValuesFrom externalDisjointUnionClassesLinkPropertyAllValuesFrom externalDisjointUnionClassesLinkPropertyHasValue externalDisjointUnionClassesLinkPropertyMinCardinality externalDisjointUnionClassesLinkPropertyMaxCardinality externalDisjointUnionClassesLinkPropertyExactCardinality"
		   });			
		addAnnotation
		  (equivalentClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "localEquivalentClassesClassList localEquivalentClassesObjectIntersectionOf localEquivalentClassesObjectUnionOf localEquivalentClassesObjectSomeValuesFrom localEquivalentClassesObjectAllValuesFrom localEquivalentClassesObjectHasValue localEquivalentClassesObjectComplementOf localEquivalentClassesObjectOneOf localEquivalentClassesObjectMinCardinality localEquivalentClassesObjectMaxCardinality localEquivalentClassesObjectExactCardinality localEquivalentClassesDataSomeValuesFrom localEquivalentClassesDataAllValuesFrom localEquivalentClassesDataHasValue localEquivalentClassesDataMinCardinality localEquivalentClassesDataMaxCardinality localEquivalentClassesDataExactCardinality externalEquivalentClassesLinkPropertySomeValuesFrom externalEquivalentClassesLinkPropertyAllValuesFrom externalEquivalentClassesLinkPropertyHasValue externalEquivalentClassesLinkPropertyMinCardinality externalEquivalentClassesLinkPropertyMaxCardinality externalEquivalentClassesLinkPropertyExactCardinality"
		   });			
		addAnnotation
		  (subClassOfEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDomainClassesClassList localDomainClassesObjectIntersectionOf localDomainClassesObjectUnionOf localDomainClassesObjectSomeValuesFrom localDomainClassesObjectAllValuesFrom localDomainClassesObjectHasValue localDomainClassesObjectComplementOf localDomainClassesObjectOneOf localDomainClassesObjectMinCardinality localDomainClassesObjectMaxCardinality localDomainClassesObjectExactCardinality localDomainClassesDataSomeValuesFrom localDomainClassesDataAllValuesFrom localDomainClassesDataHasValue localDomainClassesDataMinCardinality localDomainClassesDataMaxCardinality localDomainClassesDataExactCardinality externalDomainClassesLinkPropertySomeValuesFrom externalDomainClassesLinkPropertyAllValuesFrom externalDomainClassesLinkPropertyHasValue externalDomainClassesLinkPropertyMinCardinality externalDomainClassesLinkPropertyMaxCardinality externalDomainClassesLinkPropertyExactCardinality"
		   });			
		addAnnotation
		  (disjointObjectPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDisjointObjectPropertyObjectPropertyList localDisjointObjectPropertyInverseObjectProperty"
		   });			
		addAnnotation
		  (equivalentObjectPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "localEquivalentObjectPropertyObjectPropertyList localEquivalentObjectPropertyInverseObjectProperty"
		   });			
		addAnnotation
		  (subObjectPropertyOfEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDomainObjectPropertyObjectPropertyList localDomainObjectPropertyInverseObjectProperty"
		   });			
		addAnnotation
		  (objectPropertyDomainEClass, 
		   source, 
		   new String[] {
			 "constraints", "localObjectPropertyDomainClassList localObjectPropertyDomainObjectIntersectionOf localObjectPropertyDomainObjectUnionOf localObjectPropertyDomainObjectSomeValuesFrom localObjectPropertyDomainObjectAllValuesFrom localObjectPropertyDomainObjectHasValue localObjectPropertyDomainObjectComplementOf localObjectPropertyDomainObjectOneOf localObjectPropertyDomainObjectMinCardinality localObjectPropertyDomainObjectMaxCardinality localObjectPropertyDomainObjectExactCardinality localObjectPropertyDomainDataSomeValuesFrom localObjectPropertyDomainDataAllValuesFrom localObjectPropertyDomainDataHasValue localObjectPropertyDomainDataMinCardinality localObjectPropertyDomainDataMaxCardinality localObjectPropertyDomainDataExactCardinality"
		   });			
		addAnnotation
		  (objectPropertyRangeEClass, 
		   source, 
		   new String[] {
			 "constraints", "localObjectPropertyRangeClassList localObjectPropertyRangeObjectIntersectionOf localObjectPropertyRangeObjectUnionOf localObjectPropertyRangeObjectSomeValuesFrom localObjectPropertyRangeObjectAllValuesFrom localObjectPropertyRangeObjectHasValue localObjectPropertyRangeObjectComplementOf localObjectPropertyRangeObjectOneOf localObjectPropertyRangeObjectMinCardinality localObjectPropertyRangeObjectMaxCardinality localObjectPropertyRangeObjectExactCardinality localObjectPropertyRangeDataSomeValuesFrom localObjectPropertyRangeDataAllValuesFrom localObjectPropertyRangeDataHasValue localObjectPropertyRangeDataMinCardinality localObjectPropertyRangeDataMaxCardinality localObjectPropertyRangeDataExactCardinality"
		   });			
		addAnnotation
		  (dataPropertyDomainEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDataPropertyDomainClassList localDataPropertyDomainObjectIntersectionOf localDataPropertyDomainObjectUnionOf localDataPropertyDomainObjectSomeValuesFrom localDataPropertyDomainObjectAllValuesFrom localDataPropertyDomainObjectHasValue localDataPropertyDomainObjectComplementOf localDataPropertyDomainObjectOneOf localDataPropertyDomainObjectMinCardinality localDataPropertyDomainObjectMaxCardinality localDataPropertyDomainObjectExactCardinality localDataPropertyDomainDataSomeValuesFrom localDataPropertyDomainDataAllValuesFrom localDataPropertyDomainDataHasValue localDataPropertyDomainDataMinCardinality localDataPropertyDomainDataMaxCardinality localDataPropertyDomainDataExactCardinality"
		   });			
		addAnnotation
		  (disjointDataPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDisjointDataPropertyClassList"
		   });			
		addAnnotation
		  (equivalentDataPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "localEquivalentDataPropertyClassList"
		   });			
		addAnnotation
		  (subDataPropertyOfEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDomainDataPropertyClassList"
		   });			
		addAnnotation
		  (classAssertionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localClassesClassList localClassesObjectIntersectionOf localClassesObjectUnionOf localClassesObjectSomeValuesFrom localClassesObjectAllValuesFrom localClassesObjectHasValue localClassesObjectComplementOf localClassesObjectOneOf localClassesObjectMinCardinality localClassesObjectMaxCardinality localClassesObjectExactCardinality localClassesDataSomeValuesFrom localClassesDataAllValuesFrom localClassesDataHasValue localClassesDataMinCardinality localClassesDataMaxCardinality localClassesDataExactCardinality"
		   });			
		addAnnotation
		  (sameIndividualEClass, 
		   source, 
		   new String[] {
			 "constraints", "localSameIndividuals"
		   });			
		addAnnotation
		  (differentIndividualEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDifferentIndividuals"
		   });			
		addAnnotation
		  (objectPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localObjectPropertyAssertionObjectPropertyList localObjectPropertyAssertionInverseObjectProperty"
		   });			
		addAnnotation
		  (negativeObjectPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localNegativeObjectPropertyAssertionObjectPropertyList localNegativeObjectPropertyAssertionInverseObjectProperty"
		   });			
		addAnnotation
		  (dataPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localDataPropertyAssertionObjectPropertyList"
		   });			
		addAnnotation
		  (negativeDataPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "constraints", "localNegativeDataPropertyAssertionObjectPropertyList"
		   });			
		addAnnotation
		  (constantEClass, 
		   source, 
		   new String[] {
			 "constraints", "constantLexicalValueEmpty"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (multiontologyEClass, 
		   source, 
		   new String[] {
			 "diffOntologiesId", "self.ontologies->forAll(o1 : Ontology, o2 : Ontology | o1 <> o2 implies o1.id <> o2.id)",
			 "multiontologyPrefixIRIEmpty", "self.prefixIRI.trim().size()>0",
			 "multiontologyVersionEmpty", "self.version.trim().size()>0",
			 "multiontologyIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (ontologyConnectorEClass, 
		   source, 
		   new String[] {
			 "ontologyConeectorIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (linkPropertyEClass, 
		   source, 
		   new String[] {
			 "differentOntologiesLinkProperty", "self.sourceOntology <> self.targetOntology"
		   });			
		addAnnotation
		  (equivalentLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "equivalentLinkPropertyList", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))",
			 "equivalentLinkPropertyInverseOf", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))"
		   });			
		addAnnotation
		  (subLinkPropertyOfEClass, 
		   source, 
		   new String[] {
			 "subLinkPropertyOfLinkPropertyList", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))",
			 "subLinkPropertyOfLinkPropertyInverseOf", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))"
		   });			
		addAnnotation
		  (disjointLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "subLinkPropertyOfLinkPropertyList", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyList) implies le.oclAsType(LinkPropertyList).linksProperty->forAll(lp:LinkProperty | lp.sourceOntology = self.linkProperty.sourceOntology and lp.targetOntology = self.linkProperty.targetOntology))",
			 "subLinkPropertyOfLinkPropertyInverseOf", "\n\t\t\tself.linkPropertyExpressions->forAll(le:LinkPropertyExpression | le.oclIsKindOf(LinkPropertyInverseOf) implies (le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.sourceOntology = self.linkProperty.sourceOntology and le.oclAsType(LinkPropertyInverseOf).inverseLinkPropertyOf.targetOntology = self.linkProperty.targetOntology))"
		   });			
		addAnnotation
		  (domainLinkPropertyEClass, 
		   source, 
		   new String[] {
			 "expressionsClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.linkProperty.sourceOntology))",
			 "expressionsObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))",
			 "expressionsObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.sourceOntology))",
			 "expressionsObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)",
			 "expressionsDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.linkProperty.sourceOntology)"
		   });			
		addAnnotation
		  (rangeLinkPropertyOfEClass, 
		   source, 
		   new String[] {
			 "expressionsClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.linkProperty.targetOntology))",
			 "expressionsObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.targetOntology))",
			 "expressionsObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.linkProperty.targetOntology))",
			 "expressionsObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.linkProperty.targetOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.linkProperty.targetOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.linkProperty.targetOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.linkProperty.targetOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.linkProperty.sourceOntology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.linkProperty.targetOntology)",
			 "expressionsDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.linkProperty.targetOntology)"
		   });			
		addAnnotation
		  (ontologyEClass, 
		   source, 
		   new String[] {
			 "ontologyIdEmpty", "self.id.trim().size()>0",
			 "ontologyVersionEmpty", "self.version.trim().size()>0",
			 "diffClassesId", "self.classes->forAll(c1 : Class, c2 : Class | c1 <> c2 implies c1.id <> c2.id)",
			 "diffObjectPropertiesId", "self.objectsProperty->forAll(op1 : ObjectProperty, op2 : ObjectProperty | op1 <> op2 implies op1.id <> op2.id)",
			 "diffDataPropertiesId", "self.dataProperty->forAll(dp1 : DataProperty, dp2 : DataProperty | dp1 <> dp2 implies dp1.id <> dp2.id)",
			 "diffIndividuals", "self.individuals->forAll(i1 : NamedIndividual, i2 : NamedIndividual | i1 <> i2 implies i1.id <> i2.id)"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "classIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (objectPropertyEClass, 
		   source, 
		   new String[] {
			 "objectPropertyIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (dataPropertyEClass, 
		   source, 
		   new String[] {
			 "dataPropertyIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (namedIndividualEClass, 
		   source, 
		   new String[] {
			 "namedIndividualIdEmpty", "self.id.trim().size()>0"
		   });			
		addAnnotation
		  (anonymousIndividualEClass, 
		   source, 
		   new String[] {
			 "anonymousIndividualIdEmpty", "self.nodeID.trim().size()>0"
		   });			
		addAnnotation
		  (disjointClassEClass, 
		   source, 
		   new String[] {
			 "localDisjointClassesClassList", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))",
			 "localDisjointClassesObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDisjointClassesObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDisjointClassesObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointClassesDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "externalDisjointClassesLinkPropertySomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))",
			 "externalDisjointClassesLinkPropertyAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))",
			 "externalDisjointClassesLinkPropertyHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))",
			 "externalDisjointClassesLinkPropertyMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))",
			 "externalDisjointClassesLinkPropertyMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))",
			 "externalDisjointClassesLinkPropertyExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))"
		   });			
		addAnnotation
		  (disjointUnionEClass, 
		   source, 
		   new String[] {
			 "localDisjointUnionClassesClassList", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))",
			 "localDisjointUnionClassesObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDisjointUnionClassesObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDisjointUnionClassesObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDisjointUnionClassesDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "externalDisjointUnionClassesLinkPropertySomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))",
			 "externalDisjointUnionClassesLinkPropertyAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))",
			 "externalDisjointUnionClassesLinkPropertyHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))",
			 "externalDisjointUnionClassesLinkPropertyMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))",
			 "externalDisjointUnionClassesLinkPropertyMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))",
			 "externalDisjointUnionClassesLinkPropertyExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))"
		   });			
		addAnnotation
		  (equivalentClassEClass, 
		   source, 
		   new String[] {
			 "localEquivalentClassesClassList", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))",
			 "localEquivalentClassesObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localEquivalentClassesObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localEquivalentClassesObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localEquivalentClassesDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "externalEquivalentClassesLinkPropertySomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))",
			 "externalEquivalentClassesLinkPropertyAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))",
			 "externalEquivalentClassesLinkPropertyHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))",
			 "externalEquivalentClassesLinkPropertyMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))",
			 "externalEquivalentClassesLinkPropertyMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))",
			 "externalEquivalentClassesLinkPropertyExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))"
		   });			
		addAnnotation
		  (subClassOfEClass, 
		   source, 
		   new String[] {
			 "localDomainClassesClassList", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ClassList)) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.classAxiom.ontology))",
			 "localDomainClassesObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectIntersectionOf)) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDomainClassesObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectUnionOf)) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.classAxiom.ontology))",
			 "localDomainClassesObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectSomeValuesFrom)) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectAllValuesFrom)) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectHasValue)) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectComplementOf)) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectOneOf)) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMinCardinality)) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectMaxCardinality)) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.classAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(ObjectExactCardinality)) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataSomeValuesFrom)) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataAllValuesFrom)) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataHasValue)) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMinCardinality)) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataMaxCardinality)) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "localDomainClassesDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(ClassExpression) and sc.oclIsKindOf(DataExactCardinality)) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.classAxiom.ontology)",
			 "externalDomainClassesLinkPropertySomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkSomeValuesFrom)) implies (sc.oclAsType(LinkSomeValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkSomeValuesFrom).classes.ontology = sc.oclAsType(LinkSomeValuesFrom).linkProperties.targetOntology))",
			 "externalDomainClassesLinkPropertyAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkAllValuesFrom)) implies (sc.oclAsType(LinkAllValuesFrom).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkAllValuesFrom).classes.ontology = sc.oclAsType(LinkAllValuesFrom).linkProperties.targetOntology))",
			 "externalDomainClassesLinkPropertyHasValue", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkHasValue)) implies (sc.oclAsType(LinkHasValue).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkHasValue).individual.ontology = sc.oclAsType(LinkHasValue).linkProperties.targetOntology))",
			 "externalDomainClassesLinkPropertyMinCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMinCardinality)) implies (sc.oclAsType(LinkMinCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMinCardinality).classes.ontology = sc.oclAsType(LinkMinCardinality).linkProperties.targetOntology))",
			 "externalDomainClassesLinkPropertyMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkMaxCardinality)) implies (sc.oclAsType(LinkMaxCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkMaxCardinality).classes.ontology = sc.oclAsType(LinkMaxCardinality).linkProperties.targetOntology))",
			 "externalDomainClassesLinkPropertyExactCardinality", "\n\t\t\tself.expressions->forAll(sc: Expression | (sc.oclIsKindOf(EConnectionExpression) and sc.oclIsKindOf(LinkExactCardinality)) implies (sc.oclAsType(LinkExactCardinality).linkProperties.sourceOntology = self.classAxiom.ontology and sc.oclAsType(LinkExactCardinality).classes.ontology = sc.oclAsType(LinkExactCardinality).linkProperties.targetOntology))"
		   });			
		addAnnotation
		  (disjointObjectPropertyEClass, 
		   source, 
		   new String[] {
			 "localDisjointObjectPropertyObjectPropertyList", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))",
			 "localDisjointObjectPropertyInverseObjectProperty", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (equivalentObjectPropertyEClass, 
		   source, 
		   new String[] {
			 "localEquivalentObjectPropertyObjectPropertyList", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))",
			 "localEquivalentObjectPropertyInverseObjectProperty", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (subObjectPropertyOfEClass, 
		   source, 
		   new String[] {
			 "localDomainObjectPropertyObjectPropertyList", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))",
			 "localDomainObjectPropertyInverseObjectProperty", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.objectPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (objectPropertyDomainEClass, 
		   source, 
		   new String[] {
			 "localObjectPropertyDomainClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyDomainObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyDomainObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyDomainObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyDomainDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)"
		   });			
		addAnnotation
		  (objectPropertyRangeEClass, 
		   source, 
		   new String[] {
			 "localObjectPropertyRangeClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyRangeObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyRangeObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.objectPropertyAxiom.ontology))",
			 "localObjectPropertyRangeObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.objectPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)",
			 "localObjectPropertyRangeDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.objectPropertyAxiom.ontology)"
		   });			
		addAnnotation
		  (dataPropertyDomainEClass, 
		   source, 
		   new String[] {
			 "localDataPropertyDomainClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.dataPropertyAxiom.ontology))",
			 "localDataPropertyDomainObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))",
			 "localDataPropertyDomainObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.dataPropertyAxiom.ontology))",
			 "localDataPropertyDomainObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.dataPropertyAxiom.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)",
			 "localDataPropertyDomainDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.dataPropertyAxiom.ontology)"
		   });			
		addAnnotation
		  (disjointDataPropertyEClass, 
		   source, 
		   new String[] {
			 "localDisjointDataPropertyClassList", "\n\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (equivalentDataPropertyEClass, 
		   source, 
		   new String[] {
			 "localEquivalentDataPropertyClassList", "\n\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (subDataPropertyOfEClass, 
		   source, 
		   new String[] {
			 "localDomainDataPropertyClassList", "\n\t\t\tself.dataPropertyExpressions->forAll(sd: DataPropertyExpression | sd.oclIsKindOf(DataPropertyList) implies sd.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.dataPropertyAxiom.ontology))"
		   });			
		addAnnotation
		  (classAssertionEClass, 
		   source, 
		   new String[] {
			 "localClassesClassList", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ClassList) implies sc.oclAsType(ClassList).classes->forAll(c:Class | c.ontology = self.individualAssertion.ontology))",
			 "localClassesObjectIntersectionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectIntersectionOf) implies sc.oclAsType(ObjectIntersectionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))",
			 "localClassesObjectUnionOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectUnionOf) implies sc.oclAsType(ObjectUnionOf).classes->forAll(c:Class| c.ontology = self.individualAssertion.ontology))",
			 "localClassesObjectSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectSomeValuesFrom) implies sc.oclAsType(ObjectSomeValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectAllValuesFrom) implies sc.oclAsType(ObjectAllValuesFrom).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectHasValue) implies sc.oclAsType(ObjectHasValue).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectComplementOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectComplementOf) implies sc.oclAsType(ObjectComplementOf).classes.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectOneOf", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectOneOf) implies sc.oclAsType(ObjectOneOf).individual.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMinCardinality) implies sc.oclAsType(ObjectMinCardinality).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectMaxCardinality) implies sc.oclAsType(ObjectMaxCardinality).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesObjectExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).classes.ontology = self.individualAssertion.ontology) and\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(ObjectExactCardinality) implies sc.oclAsType(ObjectExactCardinality).objectProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataSomeValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataSomeValuesFrom) implies sc.oclAsType(DataSomeValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataAllValuesFrom", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataAllValuesFrom) implies sc.oclAsType(DataAllValuesFrom).dataProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataHasValue", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataHasValue) implies sc.oclAsType(DataHasValue).dataProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataMinCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMinCardinality) implies sc.oclAsType(DataMinCardinality).dataProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataMaxCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataMaxCardinality) implies sc.oclAsType(DataMaxCardinality).dataProperties.ontology = self.individualAssertion.ontology)",
			 "localClassesDataExactCardinality", "\n\t\t\tself.expressions->forAll(sc: ClassExpression | sc.oclIsKindOf(DataExactCardinality) implies sc.oclAsType(DataExactCardinality).dataProperties.ontology = self.individualAssertion.ontology)"
		   });			
		addAnnotation
		  (sameIndividualEClass, 
		   source, 
		   new String[] {
			 "localSameIndividuals", "\n\t\t\tself.targetIndividual->forAll(ni : NamedIndividual | ni.ontology = self.individualAssertion.ontology)"
		   });			
		addAnnotation
		  (differentIndividualEClass, 
		   source, 
		   new String[] {
			 "localDifferentIndividuals", "\n\t\t\tself.targetIndividual->forAll(ni : NamedIndividual | ni.ontology = self.individualAssertion.ontology)"
		   });			
		addAnnotation
		  (objectPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "localObjectPropertyAssertionObjectPropertyList", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))",
			 "localObjectPropertyAssertionInverseObjectProperty", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))"
		   });			
		addAnnotation
		  (negativeObjectPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "localNegativeObjectPropertyAssertionObjectPropertyList", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(ObjectPropertyList) implies so.oclAsType(ObjectPropertyList).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))",
			 "localNegativeObjectPropertyAssertionInverseObjectProperty", "\n\t\t\tself.objectPropertyExpressions->forAll(so: ObjectPropertyExpression | so.oclIsKindOf(InverseObjectProperty) implies so.oclAsType(InverseObjectProperty).objectProperties->forAll(o:ObjectProperty | o.ontology = self.individualAssertion.ontology))"
		   });			
		addAnnotation
		  (dataPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "localDataPropertyAssertionObjectPropertyList", "\n\t\t\tself.dataPropertyExpressions->forAll(so: DataPropertyExpression | so.oclIsKindOf(DataPropertyList) implies so.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.individualAssertion.ontology))"
		   });			
		addAnnotation
		  (negativeDataPropertyAssertionEClass, 
		   source, 
		   new String[] {
			 "localNegativeDataPropertyAssertionObjectPropertyList", "\n\t\t\tself.dataPropertyExpressions->forAll(so: DataPropertyExpression | so.oclIsKindOf(DataPropertyList) implies so.oclAsType(DataPropertyList).dataProperties->forAll(d:DataProperty | d.ontology = self.individualAssertion.ontology))"
		   });			
		addAnnotation
		  (constantEClass, 
		   source, 
		   new String[] {
			 "constantLexicalValueEmpty", "self.lexicalValue.trim().size()>0"
		   });
	}

} //mowlPackageImpl
