/**
 */
package mowl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mowl.mowlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface mowlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mowl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///mowl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mowl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	mowlPackage eINSTANCE = mowl.impl.mowlPackageImpl.init();

	/**
	 * The meta object id for the '{@link mowl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EntityImpl
	 * @see mowl.impl.mowlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mowl.impl.MultiontologyImpl <em>Multiontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.MultiontologyImpl
	 * @see mowl.impl.mowlPackageImpl#getMultiontology()
	 * @generated
	 */
	int MULTIONTOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Prefix IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__PREFIX_IRI = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__VERSION = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ontologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__ONTOLOGIES = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ontology Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__ONTOLOGY_CONNECTORS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multiontology Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multiontology Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multiontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Multiontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.OntologyConnectorImpl <em>Ontology Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.OntologyConnectorImpl
	 * @see mowl.impl.mowlPackageImpl#getOntologyConnector()
	 * @generated
	 */
	int ONTOLOGY_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_CONNECTOR__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_CONNECTOR__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Ontology Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_CONNECTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ontology Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_CONNECTOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EConnectorImpl <em>EConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EConnectorImpl
	 * @see mowl.impl.mowlPackageImpl#getEConnector()
	 * @generated
	 */
	int ECONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__ID = ONTOLOGY_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__ANNOTATIONS = ONTOLOGY_CONNECTOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>EConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR_FEATURE_COUNT = ONTOLOGY_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR_OPERATION_COUNT = ONTOLOGY_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkPropertyImpl <em>Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkProperty()
	 * @generated
	 */
	int LINK_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__ID = ECONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__ANNOTATIONS = ECONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Functional Link Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY = ECONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse Functional Link Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY = ECONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__SOURCE_ONTOLOGY = ECONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__TARGET_ONTOLOGY = ECONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link Property Axioms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY__LINK_PROPERTY_AXIOMS = ECONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_FEATURE_COUNT = ECONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_OPERATION_COUNT = ECONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.AxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.MultiontologyAxiomImpl <em>Multiontology Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.MultiontologyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getMultiontologyAxiom()
	 * @generated
	 */
	int MULTIONTOLOGY_AXIOM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_AXIOM__ID = AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Multiontology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiontology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIONTOLOGY_AXIOM_OPERATION_COUNT = AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkPropertyAxiomImpl <em>Link Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkPropertyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkPropertyAxiom()
	 * @generated
	 */
	int LINK_PROPERTY_AXIOM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_AXIOM__ID = MULTIONTOLOGY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_AXIOM__ANNOTATIONS = MULTIONTOLOGY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_AXIOM__LINK_PROPERTY = MULTIONTOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_AXIOM_FEATURE_COUNT = MULTIONTOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_AXIOM_OPERATION_COUNT = MULTIONTOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EquivalentLinkPropertyImpl <em>Equivalent Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EquivalentLinkPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getEquivalentLinkProperty()
	 * @generated
	 */
	int EQUIVALENT_LINK_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY__ID = LINK_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY__ANNOTATIONS = LINK_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY__LINK_PROPERTY = LINK_PROPERTY_AXIOM__LINK_PROPERTY;

	/**
	 * The feature id for the '<em><b>Link Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY_FEATURE_COUNT = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_LINK_PROPERTY_OPERATION_COUNT = LINK_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.SubLinkPropertyOfImpl <em>Sub Link Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.SubLinkPropertyOfImpl
	 * @see mowl.impl.mowlPackageImpl#getSubLinkPropertyOf()
	 * @generated
	 */
	int SUB_LINK_PROPERTY_OF = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF__ID = LINK_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF__ANNOTATIONS = LINK_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF__LINK_PROPERTY = LINK_PROPERTY_AXIOM__LINK_PROPERTY;

	/**
	 * The feature id for the '<em><b>Link Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Link Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF_FEATURE_COUNT = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Link Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LINK_PROPERTY_OF_OPERATION_COUNT = LINK_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DisjointLinkPropertyImpl <em>Disjoint Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DisjointLinkPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getDisjointLinkProperty()
	 * @generated
	 */
	int DISJOINT_LINK_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY__ID = LINK_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY__ANNOTATIONS = LINK_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY__LINK_PROPERTY = LINK_PROPERTY_AXIOM__LINK_PROPERTY;

	/**
	 * The feature id for the '<em><b>Link Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY_FEATURE_COUNT = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disjoint Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_LINK_PROPERTY_OPERATION_COUNT = LINK_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DomainLinkPropertyImpl <em>Domain Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DomainLinkPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getDomainLinkProperty()
	 * @generated
	 */
	int DOMAIN_LINK_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY__ID = LINK_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY__ANNOTATIONS = LINK_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY__LINK_PROPERTY = LINK_PROPERTY_AXIOM__LINK_PROPERTY;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY__EXPRESSIONS = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY_FEATURE_COUNT = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LINK_PROPERTY_OPERATION_COUNT = LINK_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.RangeLinkPropertyOfImpl <em>Range Link Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.RangeLinkPropertyOfImpl
	 * @see mowl.impl.mowlPackageImpl#getRangeLinkPropertyOf()
	 * @generated
	 */
	int RANGE_LINK_PROPERTY_OF = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF__ID = LINK_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF__ANNOTATIONS = LINK_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF__LINK_PROPERTY = LINK_PROPERTY_AXIOM__LINK_PROPERTY;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF__EXPRESSIONS = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Link Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF_FEATURE_COUNT = LINK_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range Link Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_LINK_PROPERTY_OF_OPERATION_COUNT = LINK_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 50;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkPropertyExpressionImpl <em>Link Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkPropertyExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkPropertyExpression()
	 * @generated
	 */
	int LINK_PROPERTY_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Link Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkPropertyListImpl <em>Link Property List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkPropertyListImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkPropertyList()
	 * @generated
	 */
	int LINK_PROPERTY_LIST = 13;

	/**
	 * The feature id for the '<em><b>Links Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_LIST__LINKS_PROPERTY = LINK_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_LIST_FEATURE_COUNT = LINK_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_LIST_OPERATION_COUNT = LINK_PROPERTY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkPropertyInverseOfImpl <em>Link Property Inverse Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkPropertyInverseOfImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkPropertyInverseOf()
	 * @generated
	 */
	int LINK_PROPERTY_INVERSE_OF = 14;

	/**
	 * The feature id for the '<em><b>Inverse Link Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF = LINK_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Property Inverse Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_INVERSE_OF_FEATURE_COUNT = LINK_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Property Inverse Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_INVERSE_OF_OPERATION_COUNT = LINK_PROPERTY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.OntologyImpl
	 * @see mowl.impl.mowlPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__VERSION = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CLASSES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objects Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__OBJECTS_PROPERTY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__DATA_PROPERTY = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__INDIVIDUALS = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__LITERALS = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ontology Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ONTOLOGY_AXIOMS = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ontology Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ONTOLOGY_ANNOTATIONS = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multiontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__MULTIONTOLOGY = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ClassImpl
	 * @see mowl.impl.mowlPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axioms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_AXIOMS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ONTOLOGY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectProperty()
	 * @generated
	 */
	int OBJECT_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axioms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inverse Functional Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitive Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Symmetric Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Asymmetric Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reflexive Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Irreflexive Object Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__ONTOLOGY = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axioms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DATA_PROPERTY_AXIOMS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Data Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ONTOLOGY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.IndividualImpl
	 * @see mowl.impl.mowlPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 20;

	/**
	 * The feature id for the '<em><b>Individual Assertions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INDIVIDUAL_ASSERTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ONTOLOGY = 1;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mowl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.NamedIndividualImpl
	 * @see mowl.impl.mowlPackageImpl#getNamedIndividual()
	 * @generated
	 */
	int NAMED_INDIVIDUAL = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__ANNOTATIONS = ENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__INDIVIDUAL_ASSERTIONS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__ONTOLOGY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.AnonymousIndividualImpl
	 * @see mowl.impl.mowlPackageImpl#getAnonymousIndividual()
	 * @generated
	 */
	int ANONYMOUS_INDIVIDUAL = 22;

	/**
	 * The feature id for the '<em><b>Individual Assertions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__INDIVIDUAL_ASSERTIONS = INDIVIDUAL__INDIVIDUAL_ASSERTIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__ONTOLOGY = INDIVIDUAL__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__NODE_ID = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_OPERATION_COUNT = INDIVIDUAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.OntologyAxiomImpl <em>Ontology Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.OntologyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getOntologyAxiom()
	 * @generated
	 */
	int ONTOLOGY_AXIOM = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_AXIOM__ID = AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Ontology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ontology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_AXIOM_OPERATION_COUNT = AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ClassAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getClassAxiom()
	 * @generated
	 */
	int CLASS_AXIOM = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__ID = ONTOLOGY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__ANNOTATIONS = ONTOLOGY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__CLASS_AXIOM = ONTOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM_FEATURE_COUNT = ONTOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM_OPERATION_COUNT = ONTOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DisjointClassImpl <em>Disjoint Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DisjointClassImpl
	 * @see mowl.impl.mowlPackageImpl#getDisjointClass()
	 * @generated
	 */
	int DISJOINT_CLASS = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS__ID = CLASS_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS__ANNOTATIONS = CLASS_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS__CLASS_AXIOM = CLASS_AXIOM__CLASS_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS__EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disjoint Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASS_OPERATION_COUNT = CLASS_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DisjointUnionImpl
	 * @see mowl.impl.mowlPackageImpl#getDisjointUnion()
	 * @generated
	 */
	int DISJOINT_UNION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__ID = CLASS_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__ANNOTATIONS = CLASS_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__CLASS_AXIOM = CLASS_AXIOM__CLASS_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disjoint Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OPERATION_COUNT = CLASS_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EquivalentClassImpl <em>Equivalent Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EquivalentClassImpl
	 * @see mowl.impl.mowlPackageImpl#getEquivalentClass()
	 * @generated
	 */
	int EQUIVALENT_CLASS = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS__ID = CLASS_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS__ANNOTATIONS = CLASS_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS__CLASS_AXIOM = CLASS_AXIOM__CLASS_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS__EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASS_OPERATION_COUNT = CLASS_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.SubClassOfImpl
	 * @see mowl.impl.mowlPackageImpl#getSubClassOf()
	 * @generated
	 */
	int SUB_CLASS_OF = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__ID = CLASS_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__ANNOTATIONS = CLASS_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Class Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__CLASS_AXIOM = CLASS_AXIOM__CLASS_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Class Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Class Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF_OPERATION_COUNT = CLASS_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyAxiom()
	 * @generated
	 */
	int OBJECT_PROPERTY_AXIOM = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM__ID = ONTOLOGY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM__ANNOTATIONS = ONTOLOGY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM = ONTOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM_FEATURE_COUNT = ONTOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM_OPERATION_COUNT = ONTOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DisjointObjectPropertyImpl <em>Disjoint Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DisjointObjectPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getDisjointObjectProperty()
	 * @generated
	 */
	int DISJOINT_OBJECT_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disjoint Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTY_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EquivalentObjectPropertyImpl <em>Equivalent Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EquivalentObjectPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getEquivalentObjectProperty()
	 * @generated
	 */
	int EQUIVALENT_OBJECT_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTY_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.SubObjectPropertyOfImpl
	 * @see mowl.impl.mowlPackageImpl#getSubObjectPropertyOf()
	 * @generated
	 */
	int SUB_OBJECT_PROPERTY_OF = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Object Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Object Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.InverseObjectPropertyAxiomImpl <em>Inverse Object Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.InverseObjectPropertyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getInverseObjectPropertyAxiom()
	 * @generated
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Object Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inverse Object Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inverse Object Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_AXIOM_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyDomainImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyDomain()
	 * @generated
	 */
	int OBJECT_PROPERTY_DOMAIN = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyRangeImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyRange()
	 * @generated
	 */
	int OBJECT_PROPERTY_RANGE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__ID = OBJECT_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_AXIOM = OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE_OPERATION_COUNT = OBJECT_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyAxiomImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyAxiom()
	 * @generated
	 */
	int DATA_PROPERTY_AXIOM = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM__ID = ONTOLOGY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM__ANNOTATIONS = ONTOLOGY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM = ONTOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM_FEATURE_COUNT = ONTOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM_OPERATION_COUNT = ONTOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyDomainImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyDomain()
	 * @generated
	 */
	int DATA_PROPERTY_DOMAIN = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__ID = DATA_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__DATA_PROPERTY_AXIOM = DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN_OPERATION_COUNT = DATA_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyRangeImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyRange()
	 * @generated
	 */
	int DATA_PROPERTY_RANGE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__ID = DATA_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__DATA_PROPERTY_AXIOM = DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__LITERAL = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE_OPERATION_COUNT = DATA_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DisjointDataPropertyImpl <em>Disjoint Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DisjointDataPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getDisjointDataProperty()
	 * @generated
	 */
	int DISJOINT_DATA_PROPERTY = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY__ID = DATA_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY__DATA_PROPERTY_AXIOM = DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disjoint Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTY_OPERATION_COUNT = DATA_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EquivalentDataPropertyImpl <em>Equivalent Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EquivalentDataPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getEquivalentDataProperty()
	 * @generated
	 */
	int EQUIVALENT_DATA_PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY__ID = DATA_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY__DATA_PROPERTY_AXIOM = DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equivalent Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTY_OPERATION_COUNT = DATA_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.SubDataPropertyOfImpl
	 * @see mowl.impl.mowlPackageImpl#getSubDataPropertyOf()
	 * @generated
	 */
	int SUB_DATA_PROPERTY_OF = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__ID = DATA_PROPERTY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Property Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__DATA_PROPERTY_AXIOM = DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM;

	/**
	 * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Data Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Data Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF_OPERATION_COUNT = DATA_PROPERTY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.AssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ID = ONTOLOGY_AXIOM__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATIONS = ONTOLOGY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__INDIVIDUAL_ASSERTION = ONTOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = ONTOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = ONTOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ClassAssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getClassAssertion()
	 * @generated
	 */
	int CLASS_ASSERTION = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__EXPRESSIONS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.SameIndividualImpl <em>Same Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.SameIndividualImpl
	 * @see mowl.impl.mowlPackageImpl#getSameIndividual()
	 * @generated
	 */
	int SAME_INDIVIDUAL = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Same Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DifferentIndividualImpl <em>Different Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DifferentIndividualImpl
	 * @see mowl.impl.mowlPackageImpl#getDifferentIndividual()
	 * @generated
	 */
	int DIFFERENT_INDIVIDUAL = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Different Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Different Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUAL_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyAssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyAssertion()
	 * @generated
	 */
	int OBJECT_PROPERTY_ASSERTION = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.NegativeObjectPropertyAssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Negative Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Negative Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyAssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyAssertion()
	 * @generated
	 */
	int DATA_PROPERTY_ASSERTION = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.NegativeDataPropertyAssertionImpl
	 * @see mowl.impl.mowlPackageImpl#getNegativeDataPropertyAssertion()
	 * @generated
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individual Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__INDIVIDUAL_ASSERTION = ASSERTION__INDIVIDUAL_ASSERTION;

	/**
	 * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Negative Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Negative Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ClassExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getClassExpression()
	 * @generated
	 */
	int CLASS_EXPRESSION = 51;

	/**
	 * The number of structural features of the '<em>Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ClassListImpl <em>Class List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ClassListImpl
	 * @see mowl.impl.mowlPackageImpl#getClassList()
	 * @generated
	 */
	int CLASS_LIST = 52;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectIntersectionOfImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectIntersectionOf()
	 * @generated
	 */
	int OBJECT_INTERSECTION_OF = 53;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectUnionOfImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectUnionOf()
	 * @generated
	 */
	int OBJECT_UNION_OF = 54;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectComplementOfImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectComplementOf()
	 * @generated
	 */
	int OBJECT_COMPLEMENT_OF = 55;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectOneOfImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectOneOf()
	 * @generated
	 */
	int OBJECT_ONE_OF = 56;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__INDIVIDUAL = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectSomeValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectSomeValuesFrom()
	 * @generated
	 */
	int OBJECT_SOME_VALUES_FROM = 57;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectAllValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectAllValuesFrom()
	 * @generated
	 */
	int OBJECT_ALL_VALUES_FROM = 58;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectHasValueImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectHasValue()
	 * @generated
	 */
	int OBJECT_HAS_VALUE = 59;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__INDIVIDUAL = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectMinCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectMinCardinality()
	 * @generated
	 */
	int OBJECT_MIN_CARDINALITY = 60;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectMaxCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectMaxCardinality()
	 * @generated
	 */
	int OBJECT_MAX_CARDINALITY = 61;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectExactCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectExactCardinality()
	 * @generated
	 */
	int OBJECT_EXACT_CARDINALITY = 62;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__CLASSES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataSomeValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getDataSomeValuesFrom()
	 * @generated
	 */
	int DATA_SOME_VALUES_FROM = 63;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataAllValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getDataAllValuesFrom()
	 * @generated
	 */
	int DATA_ALL_VALUES_FROM = 64;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataHasValueImpl
	 * @see mowl.impl.mowlPackageImpl#getDataHasValue()
	 * @generated
	 */
	int DATA_HAS_VALUE = 65;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataMinCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getDataMinCardinality()
	 * @generated
	 */
	int DATA_MIN_CARDINALITY = 66;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataMaxCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getDataMaxCardinality()
	 * @generated
	 */
	int DATA_MAX_CARDINALITY = 67;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataExactCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getDataExactCardinality()
	 * @generated
	 */
	int DATA_EXACT_CARDINALITY = 68;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__DATA_PROPERTIES = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__LITERALS = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY_OPERATION_COUNT = CLASS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.EConnectionExpressionImpl <em>EConnection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.EConnectionExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getEConnectionExpression()
	 * @generated
	 */
	int ECONNECTION_EXPRESSION = 69;

	/**
	 * The number of structural features of the '<em>EConnection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EConnection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkSomeValuesFromImpl <em>Link Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkSomeValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkSomeValuesFrom()
	 * @generated
	 */
	int LINK_SOME_VALUES_FROM = 70;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SOME_VALUES_FROM__CLASSES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SOME_VALUES_FROM__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SOME_VALUES_FROM_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SOME_VALUES_FROM_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkAllValuesFromImpl <em>Link All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkAllValuesFromImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkAllValuesFrom()
	 * @generated
	 */
	int LINK_ALL_VALUES_FROM = 71;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ALL_VALUES_FROM__CLASSES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ALL_VALUES_FROM__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ALL_VALUES_FROM_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ALL_VALUES_FROM_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkHasValueImpl <em>Link Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkHasValueImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkHasValue()
	 * @generated
	 */
	int LINK_HAS_VALUE = 72;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HAS_VALUE__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HAS_VALUE__INDIVIDUAL = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HAS_VALUE_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HAS_VALUE_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkMinCardinalityImpl <em>Link Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkMinCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkMinCardinality()
	 * @generated
	 */
	int LINK_MIN_CARDINALITY = 73;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MIN_CARDINALITY__CLASSES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MIN_CARDINALITY__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MIN_CARDINALITY__CARDINALITY = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MIN_CARDINALITY_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MIN_CARDINALITY_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkMaxCardinalityImpl <em>Link Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkMaxCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkMaxCardinality()
	 * @generated
	 */
	int LINK_MAX_CARDINALITY = 74;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAX_CARDINALITY__CLASSES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAX_CARDINALITY__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAX_CARDINALITY__CARDINALITY = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAX_CARDINALITY_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAX_CARDINALITY_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.LinkExactCardinalityImpl <em>Link Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.LinkExactCardinalityImpl
	 * @see mowl.impl.mowlPackageImpl#getLinkExactCardinality()
	 * @generated
	 */
	int LINK_EXACT_CARDINALITY = 75;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXACT_CARDINALITY__CARDINALITY = ECONNECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXACT_CARDINALITY__CLASSES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXACT_CARDINALITY__LINK_PROPERTIES = ECONNECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXACT_CARDINALITY_FEATURE_COUNT = ECONNECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXACT_CARDINALITY_OPERATION_COUNT = ECONNECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyExpression()
	 * @generated
	 */
	int OBJECT_PROPERTY_EXPRESSION = 76;

	/**
	 * The number of structural features of the '<em>Object Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ObjectPropertyListImpl <em>Object Property List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ObjectPropertyListImpl
	 * @see mowl.impl.mowlPackageImpl#getObjectPropertyList()
	 * @generated
	 */
	int OBJECT_PROPERTY_LIST = 77;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_LIST_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_LIST_OPERATION_COUNT = OBJECT_PROPERTY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.InverseObjectPropertyImpl
	 * @see mowl.impl.mowlPackageImpl#getInverseObjectProperty()
	 * @generated
	 */
	int INVERSE_OBJECT_PROPERTY = 78;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inverse Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inverse Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTY_OPERATION_COUNT = OBJECT_PROPERTY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyExpressionImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyExpression()
	 * @generated
	 */
	int DATA_PROPERTY_EXPRESSION = 79;

	/**
	 * The number of structural features of the '<em>Data Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.DataPropertyListImpl <em>Data Property List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.DataPropertyListImpl
	 * @see mowl.impl.mowlPackageImpl#getDataPropertyList()
	 * @generated
	 */
	int DATA_PROPERTY_LIST = 80;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_LIST__DATA_PROPERTIES = DATA_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_LIST_FEATURE_COUNT = DATA_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_LIST_OPERATION_COUNT = DATA_PROPERTY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.AnnotationImpl
	 * @see mowl.impl.mowlPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 81;

	/**
	 * The feature id for the '<em><b>Annotation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Annotation Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ConstantAnnotationImpl <em>Constant Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ConstantAnnotationImpl
	 * @see mowl.impl.mowlPackageImpl#getConstantAnnotation()
	 * @generated
	 */
	int CONSTANT_ANNOTATION = 82;

	/**
	 * The feature id for the '<em><b>Annotation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION__ANNOTATION_PROPERTY = ANNOTATION__ANNOTATION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Annotation Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION__ANNOTATION_TARGET = ANNOTATION__ANNOTATION_TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION__VALUE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION__DATATYPE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.AnnotationByEntityImpl <em>Annotation By Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.AnnotationByEntityImpl
	 * @see mowl.impl.mowlPackageImpl#getAnnotationByEntity()
	 * @generated
	 */
	int ANNOTATION_BY_ENTITY = 83;

	/**
	 * The feature id for the '<em><b>Annotation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BY_ENTITY__ANNOTATION_PROPERTY = ANNOTATION__ANNOTATION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Annotation Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BY_ENTITY__ANNOTATION_TARGET = ANNOTATION__ANNOTATION_TARGET;

	/**
	 * The feature id for the '<em><b>Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BY_ENTITY__ANNOTATION_VALUE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation By Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BY_ENTITY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation By Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BY_ENTITY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mowl.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.impl.ConstantImpl
	 * @see mowl.impl.mowlPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 84;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__LEXICAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ONTOLOGY = 2;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mowl.AnnotationProperty <em>Annotation Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.AnnotationProperty
	 * @see mowl.impl.mowlPackageImpl#getAnnotationProperty()
	 * @generated
	 */
	int ANNOTATION_PROPERTY = 85;

	/**
	 * The meta object id for the '{@link mowl.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mowl.DataType
	 * @see mowl.impl.mowlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 86;


	/**
	 * Returns the meta object for class '{@link mowl.Multiontology <em>Multiontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiontology</em>'.
	 * @see mowl.Multiontology
	 * @generated
	 */
	EClass getMultiontology();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Multiontology#getPrefixIRI <em>Prefix IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix IRI</em>'.
	 * @see mowl.Multiontology#getPrefixIRI()
	 * @see #getMultiontology()
	 * @generated
	 */
	EAttribute getMultiontology_PrefixIRI();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Multiontology#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mowl.Multiontology#getVersion()
	 * @see #getMultiontology()
	 * @generated
	 */
	EAttribute getMultiontology_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Multiontology#getOntologies <em>Ontologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontologies</em>'.
	 * @see mowl.Multiontology#getOntologies()
	 * @see #getMultiontology()
	 * @generated
	 */
	EReference getMultiontology_Ontologies();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Multiontology#getOntologyConnectors <em>Ontology Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology Connectors</em>'.
	 * @see mowl.Multiontology#getOntologyConnectors()
	 * @see #getMultiontology()
	 * @generated
	 */
	EReference getMultiontology_OntologyConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Multiontology#getMultiontologyAxioms <em>Multiontology Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiontology Axioms</em>'.
	 * @see mowl.Multiontology#getMultiontologyAxioms()
	 * @see #getMultiontology()
	 * @generated
	 */
	EReference getMultiontology_MultiontologyAxioms();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Multiontology#getMultiontologyAnnotations <em>Multiontology Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiontology Annotations</em>'.
	 * @see mowl.Multiontology#getMultiontologyAnnotations()
	 * @see #getMultiontology()
	 * @generated
	 */
	EReference getMultiontology_MultiontologyAnnotations();

	/**
	 * Returns the meta object for class '{@link mowl.OntologyConnector <em>Ontology Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Connector</em>'.
	 * @see mowl.OntologyConnector
	 * @generated
	 */
	EClass getOntologyConnector();

	/**
	 * Returns the meta object for class '{@link mowl.EConnector <em>EConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EConnector</em>'.
	 * @see mowl.EConnector
	 * @generated
	 */
	EClass getEConnector();

	/**
	 * Returns the meta object for class '{@link mowl.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property</em>'.
	 * @see mowl.LinkProperty
	 * @generated
	 */
	EClass getLinkProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.LinkProperty#isFunctionalLinkProperty <em>Functional Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Link Property</em>'.
	 * @see mowl.LinkProperty#isFunctionalLinkProperty()
	 * @see #getLinkProperty()
	 * @generated
	 */
	EAttribute getLinkProperty_FunctionalLinkProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.LinkProperty#isInverseFunctionalLinkProperty <em>Inverse Functional Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Functional Link Property</em>'.
	 * @see mowl.LinkProperty#isInverseFunctionalLinkProperty()
	 * @see #getLinkProperty()
	 * @generated
	 */
	EAttribute getLinkProperty_InverseFunctionalLinkProperty();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkProperty#getSourceOntology <em>Source Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ontology</em>'.
	 * @see mowl.LinkProperty#getSourceOntology()
	 * @see #getLinkProperty()
	 * @generated
	 */
	EReference getLinkProperty_SourceOntology();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkProperty#getTargetOntology <em>Target Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ontology</em>'.
	 * @see mowl.LinkProperty#getTargetOntology()
	 * @see #getLinkProperty()
	 * @generated
	 */
	EReference getLinkProperty_TargetOntology();

	/**
	 * Returns the meta object for the reference list '{@link mowl.LinkProperty#getLinkPropertyAxioms <em>Link Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link Property Axioms</em>'.
	 * @see mowl.LinkProperty#getLinkPropertyAxioms()
	 * @see #getLinkProperty()
	 * @generated
	 */
	EReference getLinkProperty_LinkPropertyAxioms();

	/**
	 * Returns the meta object for class '{@link mowl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see mowl.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.MultiontologyAxiom <em>Multiontology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiontology Axiom</em>'.
	 * @see mowl.MultiontologyAxiom
	 * @generated
	 */
	EClass getMultiontologyAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.LinkPropertyAxiom <em>Link Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property Axiom</em>'.
	 * @see mowl.LinkPropertyAxiom
	 * @generated
	 */
	EClass getLinkPropertyAxiom();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkPropertyAxiom#getLinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Property</em>'.
	 * @see mowl.LinkPropertyAxiom#getLinkProperty()
	 * @see #getLinkPropertyAxiom()
	 * @generated
	 */
	EReference getLinkPropertyAxiom_LinkProperty();

	/**
	 * Returns the meta object for class '{@link mowl.EquivalentLinkProperty <em>Equivalent Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Link Property</em>'.
	 * @see mowl.EquivalentLinkProperty
	 * @generated
	 */
	EClass getEquivalentLinkProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.EquivalentLinkProperty#getLinkPropertyExpressions <em>Link Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Property Expressions</em>'.
	 * @see mowl.EquivalentLinkProperty#getLinkPropertyExpressions()
	 * @see #getEquivalentLinkProperty()
	 * @generated
	 */
	EReference getEquivalentLinkProperty_LinkPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.SubLinkPropertyOf <em>Sub Link Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Link Property Of</em>'.
	 * @see mowl.SubLinkPropertyOf
	 * @generated
	 */
	EClass getSubLinkPropertyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.SubLinkPropertyOf#getLinkPropertyExpressions <em>Link Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Property Expressions</em>'.
	 * @see mowl.SubLinkPropertyOf#getLinkPropertyExpressions()
	 * @see #getSubLinkPropertyOf()
	 * @generated
	 */
	EReference getSubLinkPropertyOf_LinkPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.DisjointLinkProperty <em>Disjoint Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Link Property</em>'.
	 * @see mowl.DisjointLinkProperty
	 * @generated
	 */
	EClass getDisjointLinkProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DisjointLinkProperty#getLinkPropertyExpressions <em>Link Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Property Expressions</em>'.
	 * @see mowl.DisjointLinkProperty#getLinkPropertyExpressions()
	 * @see #getDisjointLinkProperty()
	 * @generated
	 */
	EReference getDisjointLinkProperty_LinkPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.DomainLinkProperty <em>Domain Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Link Property</em>'.
	 * @see mowl.DomainLinkProperty
	 * @generated
	 */
	EClass getDomainLinkProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DomainLinkProperty#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.DomainLinkProperty#getExpressions()
	 * @see #getDomainLinkProperty()
	 * @generated
	 */
	EReference getDomainLinkProperty_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.RangeLinkPropertyOf <em>Range Link Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Link Property Of</em>'.
	 * @see mowl.RangeLinkPropertyOf
	 * @generated
	 */
	EClass getRangeLinkPropertyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.RangeLinkPropertyOf#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.RangeLinkPropertyOf#getExpressions()
	 * @see #getRangeLinkPropertyOf()
	 * @generated
	 */
	EReference getRangeLinkPropertyOf_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.LinkPropertyExpression <em>Link Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property Expression</em>'.
	 * @see mowl.LinkPropertyExpression
	 * @generated
	 */
	EClass getLinkPropertyExpression();

	/**
	 * Returns the meta object for class '{@link mowl.LinkPropertyList <em>Link Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property List</em>'.
	 * @see mowl.LinkPropertyList
	 * @generated
	 */
	EClass getLinkPropertyList();

	/**
	 * Returns the meta object for the reference list '{@link mowl.LinkPropertyList#getLinksProperty <em>Links Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links Property</em>'.
	 * @see mowl.LinkPropertyList#getLinksProperty()
	 * @see #getLinkPropertyList()
	 * @generated
	 */
	EReference getLinkPropertyList_LinksProperty();

	/**
	 * Returns the meta object for class '{@link mowl.LinkPropertyInverseOf <em>Link Property Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property Inverse Of</em>'.
	 * @see mowl.LinkPropertyInverseOf
	 * @generated
	 */
	EClass getLinkPropertyInverseOf();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkPropertyInverseOf#getInverseLinkPropertyOf <em>Inverse Link Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse Link Property Of</em>'.
	 * @see mowl.LinkPropertyInverseOf#getInverseLinkPropertyOf()
	 * @see #getLinkPropertyInverseOf()
	 * @generated
	 */
	EReference getLinkPropertyInverseOf_InverseLinkPropertyOf();

	/**
	 * Returns the meta object for class '{@link mowl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see mowl.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Ontology#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mowl.Ontology#getVersion()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see mowl.Ontology#getClasses()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getObjectsProperty <em>Objects Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects Property</em>'.
	 * @see mowl.Ontology#getObjectsProperty()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ObjectsProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Property</em>'.
	 * @see mowl.Ontology#getDataProperty()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_DataProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see mowl.Ontology#getIndividuals()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Individuals();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see mowl.Ontology#getLiterals()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Literals();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getOntologyAxioms <em>Ontology Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology Axioms</em>'.
	 * @see mowl.Ontology#getOntologyAxioms()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_OntologyAxioms();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology Annotations</em>'.
	 * @see mowl.Ontology#getOntologyAnnotations()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_OntologyAnnotations();

	/**
	 * Returns the meta object for the container reference '{@link mowl.Ontology#getMultiontology <em>Multiontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Multiontology</em>'.
	 * @see mowl.Ontology#getMultiontology()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Multiontology();

	/**
	 * Returns the meta object for class '{@link mowl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see mowl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mowl.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the reference list '{@link mowl.Entity#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see mowl.Entity#getAnnotations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Annotations();

	/**
	 * Returns the meta object for class '{@link mowl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see mowl.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link mowl.Class#getClassAxioms <em>Class Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Axioms</em>'.
	 * @see mowl.Class#getClassAxioms()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassAxioms();

	/**
	 * Returns the meta object for the container reference '{@link mowl.Class#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see mowl.Class#getOntology()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Ontology();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property</em>'.
	 * @see mowl.ObjectProperty
	 * @generated
	 */
	EClass getObjectProperty();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ObjectProperty#getObjectPropertyAxioms <em>Object Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Property Axioms</em>'.
	 * @see mowl.ObjectProperty#getObjectPropertyAxioms()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_ObjectPropertyAxioms();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isFunctionalObjectProperty <em>Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Object Property</em>'.
	 * @see mowl.ObjectProperty#isFunctionalObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_FunctionalObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isInverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Functional Object Property</em>'.
	 * @see mowl.ObjectProperty#isInverseFunctionalObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_InverseFunctionalObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isTransitiveObjectProperty <em>Transitive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive Object Property</em>'.
	 * @see mowl.ObjectProperty#isTransitiveObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_TransitiveObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isSymmetricObjectProperty <em>Symmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetric Object Property</em>'.
	 * @see mowl.ObjectProperty#isSymmetricObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_SymmetricObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isAsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asymmetric Object Property</em>'.
	 * @see mowl.ObjectProperty#isAsymmetricObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_AsymmetricObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reflexive Object Property</em>'.
	 * @see mowl.ObjectProperty#isReflexiveObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_ReflexiveObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectProperty#isIrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Irreflexive Object Property</em>'.
	 * @see mowl.ObjectProperty#isIrreflexiveObjectProperty()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IrreflexiveObjectProperty();

	/**
	 * Returns the meta object for the container reference '{@link mowl.ObjectProperty#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see mowl.ObjectProperty#getOntology()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_Ontology();

	/**
	 * Returns the meta object for class '{@link mowl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see mowl.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataProperty#getDataPropertyAxioms <em>Data Property Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Property Axioms</em>'.
	 * @see mowl.DataProperty#getDataPropertyAxioms()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_DataPropertyAxioms();

	/**
	 * Returns the meta object for the attribute '{@link mowl.DataProperty#isFunctionalDataProperty <em>Functional Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Data Property</em>'.
	 * @see mowl.DataProperty#isFunctionalDataProperty()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_FunctionalDataProperty();

	/**
	 * Returns the meta object for the container reference '{@link mowl.DataProperty#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see mowl.DataProperty#getOntology()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_Ontology();

	/**
	 * Returns the meta object for class '{@link mowl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see mowl.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference list '{@link mowl.Individual#getIndividualAssertions <em>Individual Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individual Assertions</em>'.
	 * @see mowl.Individual#getIndividualAssertions()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_IndividualAssertions();

	/**
	 * Returns the meta object for the container reference '{@link mowl.Individual#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see mowl.Individual#getOntology()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Ontology();

	/**
	 * Returns the meta object for class '{@link mowl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Individual</em>'.
	 * @see mowl.NamedIndividual
	 * @generated
	 */
	EClass getNamedIndividual();

	/**
	 * Returns the meta object for class '{@link mowl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Individual</em>'.
	 * @see mowl.AnonymousIndividual
	 * @generated
	 */
	EClass getAnonymousIndividual();

	/**
	 * Returns the meta object for the attribute '{@link mowl.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see mowl.AnonymousIndividual#getNodeID()
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	EAttribute getAnonymousIndividual_NodeID();

	/**
	 * Returns the meta object for class '{@link mowl.OntologyAxiom <em>Ontology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Axiom</em>'.
	 * @see mowl.OntologyAxiom
	 * @generated
	 */
	EClass getOntologyAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.ClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Axiom</em>'.
	 * @see mowl.ClassAxiom
	 * @generated
	 */
	EClass getClassAxiom();

	/**
	 * Returns the meta object for the reference '{@link mowl.ClassAxiom#getClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Axiom</em>'.
	 * @see mowl.ClassAxiom#getClassAxiom()
	 * @see #getClassAxiom()
	 * @generated
	 */
	EReference getClassAxiom_ClassAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.DisjointClass <em>Disjoint Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Class</em>'.
	 * @see mowl.DisjointClass
	 * @generated
	 */
	EClass getDisjointClass();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DisjointClass#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.DisjointClass#getExpressions()
	 * @see #getDisjointClass()
	 * @generated
	 */
	EReference getDisjointClass_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Union</em>'.
	 * @see mowl.DisjointUnion
	 * @generated
	 */
	EClass getDisjointUnion();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DisjointUnion#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.DisjointUnion#getExpressions()
	 * @see #getDisjointUnion()
	 * @generated
	 */
	EReference getDisjointUnion_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.EquivalentClass <em>Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Class</em>'.
	 * @see mowl.EquivalentClass
	 * @generated
	 */
	EClass getEquivalentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.EquivalentClass#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.EquivalentClass#getExpressions()
	 * @see #getEquivalentClass()
	 * @generated
	 */
	EReference getEquivalentClass_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class Of</em>'.
	 * @see mowl.SubClassOf
	 * @generated
	 */
	EClass getSubClassOf();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.SubClassOf#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.SubClassOf#getExpressions()
	 * @see #getSubClassOf()
	 * @generated
	 */
	EReference getSubClassOf_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Axiom</em>'.
	 * @see mowl.ObjectPropertyAxiom
	 * @generated
	 */
	EClass getObjectPropertyAxiom();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectPropertyAxiom#getObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Property Axiom</em>'.
	 * @see mowl.ObjectPropertyAxiom#getObjectPropertyAxiom()
	 * @see #getObjectPropertyAxiom()
	 * @generated
	 */
	EReference getObjectPropertyAxiom_ObjectPropertyAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.DisjointObjectProperty <em>Disjoint Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Object Property</em>'.
	 * @see mowl.DisjointObjectProperty
	 * @generated
	 */
	EClass getDisjointObjectProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DisjointObjectProperty#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
	 * @see mowl.DisjointObjectProperty#getObjectPropertyExpressions()
	 * @see #getDisjointObjectProperty()
	 * @generated
	 */
	EReference getDisjointObjectProperty_ObjectPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.EquivalentObjectProperty <em>Equivalent Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Object Property</em>'.
	 * @see mowl.EquivalentObjectProperty
	 * @generated
	 */
	EClass getEquivalentObjectProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.EquivalentObjectProperty#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
	 * @see mowl.EquivalentObjectProperty#getObjectPropertyExpressions()
	 * @see #getEquivalentObjectProperty()
	 * @generated
	 */
	EReference getEquivalentObjectProperty_ObjectPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Object Property Of</em>'.
	 * @see mowl.SubObjectPropertyOf
	 * @generated
	 */
	EClass getSubObjectPropertyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.SubObjectPropertyOf#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
	 * @see mowl.SubObjectPropertyOf#getObjectPropertyExpressions()
	 * @see #getSubObjectPropertyOf()
	 * @generated
	 */
	EReference getSubObjectPropertyOf_ObjectPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.InverseObjectPropertyAxiom <em>Inverse Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Object Property Axiom</em>'.
	 * @see mowl.InverseObjectPropertyAxiom
	 * @generated
	 */
	EClass getInverseObjectPropertyAxiom();

	/**
	 * Returns the meta object for the reference '{@link mowl.InverseObjectPropertyAxiom#getObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Property</em>'.
	 * @see mowl.InverseObjectPropertyAxiom#getObjectProperty()
	 * @see #getInverseObjectPropertyAxiom()
	 * @generated
	 */
	EReference getInverseObjectPropertyAxiom_ObjectProperty();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Domain</em>'.
	 * @see mowl.ObjectPropertyDomain
	 * @generated
	 */
	EClass getObjectPropertyDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.ObjectPropertyDomain#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.ObjectPropertyDomain#getExpressions()
	 * @see #getObjectPropertyDomain()
	 * @generated
	 */
	EReference getObjectPropertyDomain_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Range</em>'.
	 * @see mowl.ObjectPropertyRange
	 * @generated
	 */
	EClass getObjectPropertyRange();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.ObjectPropertyRange#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.ObjectPropertyRange#getExpressions()
	 * @see #getObjectPropertyRange()
	 * @generated
	 */
	EReference getObjectPropertyRange_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Axiom</em>'.
	 * @see mowl.DataPropertyAxiom
	 * @generated
	 */
	EClass getDataPropertyAxiom();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataPropertyAxiom#getDataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Property Axiom</em>'.
	 * @see mowl.DataPropertyAxiom#getDataPropertyAxiom()
	 * @see #getDataPropertyAxiom()
	 * @generated
	 */
	EReference getDataPropertyAxiom_DataPropertyAxiom();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Domain</em>'.
	 * @see mowl.DataPropertyDomain
	 * @generated
	 */
	EClass getDataPropertyDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DataPropertyDomain#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.DataPropertyDomain#getExpressions()
	 * @see #getDataPropertyDomain()
	 * @generated
	 */
	EReference getDataPropertyDomain_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Range</em>'.
	 * @see mowl.DataPropertyRange
	 * @generated
	 */
	EClass getDataPropertyRange();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataPropertyRange#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see mowl.DataPropertyRange#getLiteral()
	 * @see #getDataPropertyRange()
	 * @generated
	 */
	EReference getDataPropertyRange_Literal();

	/**
	 * Returns the meta object for class '{@link mowl.DisjointDataProperty <em>Disjoint Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Data Property</em>'.
	 * @see mowl.DisjointDataProperty
	 * @generated
	 */
	EClass getDisjointDataProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.DisjointDataProperty#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
	 * @see mowl.DisjointDataProperty#getDataPropertyExpressions()
	 * @see #getDisjointDataProperty()
	 * @generated
	 */
	EReference getDisjointDataProperty_DataPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.EquivalentDataProperty <em>Equivalent Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Data Property</em>'.
	 * @see mowl.EquivalentDataProperty
	 * @generated
	 */
	EClass getEquivalentDataProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.EquivalentDataProperty#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
	 * @see mowl.EquivalentDataProperty#getDataPropertyExpressions()
	 * @see #getEquivalentDataProperty()
	 * @generated
	 */
	EReference getEquivalentDataProperty_DataPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Data Property Of</em>'.
	 * @see mowl.SubDataPropertyOf
	 * @generated
	 */
	EClass getSubDataPropertyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.SubDataPropertyOf#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
	 * @see mowl.SubDataPropertyOf#getDataPropertyExpressions()
	 * @see #getSubDataPropertyOf()
	 * @generated
	 */
	EReference getSubDataPropertyOf_DataPropertyExpressions();

	/**
	 * Returns the meta object for class '{@link mowl.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see mowl.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the reference '{@link mowl.Assertion#getIndividualAssertion <em>Individual Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Individual Assertion</em>'.
	 * @see mowl.Assertion#getIndividualAssertion()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_IndividualAssertion();

	/**
	 * Returns the meta object for class '{@link mowl.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Assertion</em>'.
	 * @see mowl.ClassAssertion
	 * @generated
	 */
	EClass getClassAssertion();

	/**
	 * Returns the meta object for the containment reference list '{@link mowl.ClassAssertion#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see mowl.ClassAssertion#getExpressions()
	 * @see #getClassAssertion()
	 * @generated
	 */
	EReference getClassAssertion_Expressions();

	/**
	 * Returns the meta object for class '{@link mowl.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Individual</em>'.
	 * @see mowl.SameIndividual
	 * @generated
	 */
	EClass getSameIndividual();

	/**
	 * Returns the meta object for the reference list '{@link mowl.SameIndividual#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Individual</em>'.
	 * @see mowl.SameIndividual#getTargetIndividual()
	 * @see #getSameIndividual()
	 * @generated
	 */
	EReference getSameIndividual_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link mowl.DifferentIndividual <em>Different Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different Individual</em>'.
	 * @see mowl.DifferentIndividual
	 * @generated
	 */
	EClass getDifferentIndividual();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DifferentIndividual#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Individual</em>'.
	 * @see mowl.DifferentIndividual#getTargetIndividual()
	 * @see #getDifferentIndividual()
	 * @generated
	 */
	EReference getDifferentIndividual_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Assertion</em>'.
	 * @see mowl.ObjectPropertyAssertion
	 * @generated
	 */
	EClass getObjectPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link mowl.ObjectPropertyAssertion#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Property Expressions</em>'.
	 * @see mowl.ObjectPropertyAssertion#getObjectPropertyExpressions()
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 */
	EReference getObjectPropertyAssertion_ObjectPropertyExpressions();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Individual</em>'.
	 * @see mowl.ObjectPropertyAssertion#getTargetIndividual()
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 */
	EReference getObjectPropertyAssertion_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link mowl.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Object Property Assertion</em>'.
	 * @see mowl.NegativeObjectPropertyAssertion
	 * @generated
	 */
	EClass getNegativeObjectPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link mowl.NegativeObjectPropertyAssertion#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Property Expressions</em>'.
	 * @see mowl.NegativeObjectPropertyAssertion#getObjectPropertyExpressions()
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpressions();

	/**
	 * Returns the meta object for the reference '{@link mowl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Individual</em>'.
	 * @see mowl.NegativeObjectPropertyAssertion#getTargetIndividual()
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeObjectPropertyAssertion_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Assertion</em>'.
	 * @see mowl.DataPropertyAssertion
	 * @generated
	 */
	EClass getDataPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link mowl.DataPropertyAssertion#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Property Expressions</em>'.
	 * @see mowl.DataPropertyAssertion#getDataPropertyExpressions()
	 * @see #getDataPropertyAssertion()
	 * @generated
	 */
	EReference getDataPropertyAssertion_DataPropertyExpressions();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see mowl.DataPropertyAssertion#getTargetValue()
	 * @see #getDataPropertyAssertion()
	 * @generated
	 */
	EReference getDataPropertyAssertion_TargetValue();

	/**
	 * Returns the meta object for class '{@link mowl.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Data Property Assertion</em>'.
	 * @see mowl.NegativeDataPropertyAssertion
	 * @generated
	 */
	EClass getNegativeDataPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link mowl.NegativeDataPropertyAssertion#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Property Expressions</em>'.
	 * @see mowl.NegativeDataPropertyAssertion#getDataPropertyExpressions()
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeDataPropertyAssertion_DataPropertyExpressions();

	/**
	 * Returns the meta object for the reference '{@link mowl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see mowl.NegativeDataPropertyAssertion#getTargetValue()
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeDataPropertyAssertion_TargetValue();

	/**
	 * Returns the meta object for class '{@link mowl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see mowl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link mowl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Expression</em>'.
	 * @see mowl.ClassExpression
	 * @generated
	 */
	EClass getClassExpression();

	/**
	 * Returns the meta object for class '{@link mowl.ClassList <em>Class List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class List</em>'.
	 * @see mowl.ClassList
	 * @generated
	 */
	EClass getClassList();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ClassList#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see mowl.ClassList#getClasses()
	 * @see #getClassList()
	 * @generated
	 */
	EReference getClassList_Classes();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Intersection Of</em>'.
	 * @see mowl.ObjectIntersectionOf
	 * @generated
	 */
	EClass getObjectIntersectionOf();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ObjectIntersectionOf#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see mowl.ObjectIntersectionOf#getClasses()
	 * @see #getObjectIntersectionOf()
	 * @generated
	 */
	EReference getObjectIntersectionOf_Classes();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Union Of</em>'.
	 * @see mowl.ObjectUnionOf
	 * @generated
	 */
	EClass getObjectUnionOf();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ObjectUnionOf#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see mowl.ObjectUnionOf#getClasses()
	 * @see #getObjectUnionOf()
	 * @generated
	 */
	EReference getObjectUnionOf_Classes();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Complement Of</em>'.
	 * @see mowl.ObjectComplementOf
	 * @generated
	 */
	EClass getObjectComplementOf();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectComplementOf#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectComplementOf#getClasses()
	 * @see #getObjectComplementOf()
	 * @generated
	 */
	EReference getObjectComplementOf_Classes();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object One Of</em>'.
	 * @see mowl.ObjectOneOf
	 * @generated
	 */
	EClass getObjectOneOf();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ObjectOneOf#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individual</em>'.
	 * @see mowl.ObjectOneOf#getIndividual()
	 * @see #getObjectOneOf()
	 * @generated
	 */
	EReference getObjectOneOf_Individual();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Some Values From</em>'.
	 * @see mowl.ObjectSomeValuesFrom
	 * @generated
	 */
	EClass getObjectSomeValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectSomeValuesFrom#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectSomeValuesFrom#getClasses()
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	EReference getObjectSomeValuesFrom_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectSomeValuesFrom#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectSomeValuesFrom#getObjectProperties()
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	EReference getObjectSomeValuesFrom_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object All Values From</em>'.
	 * @see mowl.ObjectAllValuesFrom
	 * @generated
	 */
	EClass getObjectAllValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectAllValuesFrom#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectAllValuesFrom#getClasses()
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	EReference getObjectAllValuesFrom_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectAllValuesFrom#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectAllValuesFrom#getObjectProperties()
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	EReference getObjectAllValuesFrom_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Has Value</em>'.
	 * @see mowl.ObjectHasValue
	 * @generated
	 */
	EClass getObjectHasValue();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectHasValue#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectHasValue#getObjectProperties()
	 * @see #getObjectHasValue()
	 * @generated
	 */
	EReference getObjectHasValue_ObjectProperties();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectHasValue#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Individual</em>'.
	 * @see mowl.ObjectHasValue#getIndividual()
	 * @see #getObjectHasValue()
	 * @generated
	 */
	EReference getObjectHasValue_Individual();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Min Cardinality</em>'.
	 * @see mowl.ObjectMinCardinality
	 * @generated
	 */
	EClass getObjectMinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.ObjectMinCardinality#getCardinality()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EAttribute getObjectMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectMinCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectMinCardinality#getClasses()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EReference getObjectMinCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectMinCardinality#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectMinCardinality#getObjectProperties()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EReference getObjectMinCardinality_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Max Cardinality</em>'.
	 * @see mowl.ObjectMaxCardinality
	 * @generated
	 */
	EClass getObjectMaxCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.ObjectMaxCardinality#getCardinality()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EAttribute getObjectMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectMaxCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectMaxCardinality#getClasses()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EReference getObjectMaxCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectMaxCardinality#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectMaxCardinality#getObjectProperties()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EReference getObjectMaxCardinality_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exact Cardinality</em>'.
	 * @see mowl.ObjectExactCardinality
	 * @generated
	 */
	EClass getObjectExactCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.ObjectExactCardinality#getCardinality()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EAttribute getObjectExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectExactCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.ObjectExactCardinality#getClasses()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EReference getObjectExactCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.ObjectExactCardinality#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.ObjectExactCardinality#getObjectProperties()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EReference getObjectExactCardinality_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Some Values From</em>'.
	 * @see mowl.DataSomeValuesFrom
	 * @generated
	 */
	EClass getDataSomeValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataSomeValuesFrom#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataSomeValuesFrom#getDataProperties()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_DataProperties();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataSomeValuesFrom#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals</em>'.
	 * @see mowl.DataSomeValuesFrom#getLiterals()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data All Values From</em>'.
	 * @see mowl.DataAllValuesFrom
	 * @generated
	 */
	EClass getDataAllValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataAllValuesFrom#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataAllValuesFrom#getDataProperties()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_DataProperties();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataAllValuesFrom#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals</em>'.
	 * @see mowl.DataAllValuesFrom#getLiterals()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Has Value</em>'.
	 * @see mowl.DataHasValue
	 * @generated
	 */
	EClass getDataHasValue();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataHasValue#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataHasValue#getDataProperties()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_DataProperties();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataHasValue#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literals</em>'.
	 * @see mowl.DataHasValue#getLiterals()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Min Cardinality</em>'.
	 * @see mowl.DataMinCardinality
	 * @generated
	 */
	EClass getDataMinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.DataMinCardinality#getCardinality()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EAttribute getDataMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataMinCardinality#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataMinCardinality#getDataProperties()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_DataProperties();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataMinCardinality#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals</em>'.
	 * @see mowl.DataMinCardinality#getLiterals()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Max Cardinality</em>'.
	 * @see mowl.DataMaxCardinality
	 * @generated
	 */
	EClass getDataMaxCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.DataMaxCardinality#getCardinality()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EAttribute getDataMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataMaxCardinality#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataMaxCardinality#getDataProperties()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_DataProperties();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataMaxCardinality#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals</em>'.
	 * @see mowl.DataMaxCardinality#getLiterals()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exact Cardinality</em>'.
	 * @see mowl.DataExactCardinality
	 * @generated
	 */
	EClass getDataExactCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.DataExactCardinality#getCardinality()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EAttribute getDataExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.DataExactCardinality#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Properties</em>'.
	 * @see mowl.DataExactCardinality#getDataProperties()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_DataProperties();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataExactCardinality#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals</em>'.
	 * @see mowl.DataExactCardinality#getLiterals()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_Literals();

	/**
	 * Returns the meta object for class '{@link mowl.EConnectionExpression <em>EConnection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EConnection Expression</em>'.
	 * @see mowl.EConnectionExpression
	 * @generated
	 */
	EClass getEConnectionExpression();

	/**
	 * Returns the meta object for class '{@link mowl.LinkSomeValuesFrom <em>Link Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Some Values From</em>'.
	 * @see mowl.LinkSomeValuesFrom
	 * @generated
	 */
	EClass getLinkSomeValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkSomeValuesFrom#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.LinkSomeValuesFrom#getClasses()
	 * @see #getLinkSomeValuesFrom()
	 * @generated
	 */
	EReference getLinkSomeValuesFrom_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkSomeValuesFrom#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkSomeValuesFrom#getLinkProperties()
	 * @see #getLinkSomeValuesFrom()
	 * @generated
	 */
	EReference getLinkSomeValuesFrom_LinkProperties();

	/**
	 * Returns the meta object for class '{@link mowl.LinkAllValuesFrom <em>Link All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link All Values From</em>'.
	 * @see mowl.LinkAllValuesFrom
	 * @generated
	 */
	EClass getLinkAllValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkAllValuesFrom#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.LinkAllValuesFrom#getClasses()
	 * @see #getLinkAllValuesFrom()
	 * @generated
	 */
	EReference getLinkAllValuesFrom_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkAllValuesFrom#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkAllValuesFrom#getLinkProperties()
	 * @see #getLinkAllValuesFrom()
	 * @generated
	 */
	EReference getLinkAllValuesFrom_LinkProperties();

	/**
	 * Returns the meta object for class '{@link mowl.LinkHasValue <em>Link Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Has Value</em>'.
	 * @see mowl.LinkHasValue
	 * @generated
	 */
	EClass getLinkHasValue();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkHasValue#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkHasValue#getLinkProperties()
	 * @see #getLinkHasValue()
	 * @generated
	 */
	EReference getLinkHasValue_LinkProperties();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkHasValue#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Individual</em>'.
	 * @see mowl.LinkHasValue#getIndividual()
	 * @see #getLinkHasValue()
	 * @generated
	 */
	EReference getLinkHasValue_Individual();

	/**
	 * Returns the meta object for class '{@link mowl.LinkMinCardinality <em>Link Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Min Cardinality</em>'.
	 * @see mowl.LinkMinCardinality
	 * @generated
	 */
	EClass getLinkMinCardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkMinCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.LinkMinCardinality#getClasses()
	 * @see #getLinkMinCardinality()
	 * @generated
	 */
	EReference getLinkMinCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkMinCardinality#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkMinCardinality#getLinkProperties()
	 * @see #getLinkMinCardinality()
	 * @generated
	 */
	EReference getLinkMinCardinality_LinkProperties();

	/**
	 * Returns the meta object for the attribute '{@link mowl.LinkMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.LinkMinCardinality#getCardinality()
	 * @see #getLinkMinCardinality()
	 * @generated
	 */
	EAttribute getLinkMinCardinality_Cardinality();

	/**
	 * Returns the meta object for class '{@link mowl.LinkMaxCardinality <em>Link Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Max Cardinality</em>'.
	 * @see mowl.LinkMaxCardinality
	 * @generated
	 */
	EClass getLinkMaxCardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkMaxCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.LinkMaxCardinality#getClasses()
	 * @see #getLinkMaxCardinality()
	 * @generated
	 */
	EReference getLinkMaxCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkMaxCardinality#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkMaxCardinality#getLinkProperties()
	 * @see #getLinkMaxCardinality()
	 * @generated
	 */
	EReference getLinkMaxCardinality_LinkProperties();

	/**
	 * Returns the meta object for the attribute '{@link mowl.LinkMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.LinkMaxCardinality#getCardinality()
	 * @see #getLinkMaxCardinality()
	 * @generated
	 */
	EAttribute getLinkMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for class '{@link mowl.LinkExactCardinality <em>Link Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Exact Cardinality</em>'.
	 * @see mowl.LinkExactCardinality
	 * @generated
	 */
	EClass getLinkExactCardinality();

	/**
	 * Returns the meta object for the attribute '{@link mowl.LinkExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mowl.LinkExactCardinality#getCardinality()
	 * @see #getLinkExactCardinality()
	 * @generated
	 */
	EAttribute getLinkExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkExactCardinality#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see mowl.LinkExactCardinality#getClasses()
	 * @see #getLinkExactCardinality()
	 * @generated
	 */
	EReference getLinkExactCardinality_Classes();

	/**
	 * Returns the meta object for the reference '{@link mowl.LinkExactCardinality#getLinkProperties <em>Link Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Properties</em>'.
	 * @see mowl.LinkExactCardinality#getLinkProperties()
	 * @see #getLinkExactCardinality()
	 * @generated
	 */
	EReference getLinkExactCardinality_LinkProperties();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Expression</em>'.
	 * @see mowl.ObjectPropertyExpression
	 * @generated
	 */
	EClass getObjectPropertyExpression();

	/**
	 * Returns the meta object for class '{@link mowl.ObjectPropertyList <em>Object Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property List</em>'.
	 * @see mowl.ObjectPropertyList
	 * @generated
	 */
	EClass getObjectPropertyList();

	/**
	 * Returns the meta object for the reference list '{@link mowl.ObjectPropertyList#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Properties</em>'.
	 * @see mowl.ObjectPropertyList#getObjectProperties()
	 * @see #getObjectPropertyList()
	 * @generated
	 */
	EReference getObjectPropertyList_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.InverseObjectProperty <em>Inverse Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Object Property</em>'.
	 * @see mowl.InverseObjectProperty
	 * @generated
	 */
	EClass getInverseObjectProperty();

	/**
	 * Returns the meta object for the reference '{@link mowl.InverseObjectProperty#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Properties</em>'.
	 * @see mowl.InverseObjectProperty#getObjectProperties()
	 * @see #getInverseObjectProperty()
	 * @generated
	 */
	EReference getInverseObjectProperty_ObjectProperties();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Expression</em>'.
	 * @see mowl.DataPropertyExpression
	 * @generated
	 */
	EClass getDataPropertyExpression();

	/**
	 * Returns the meta object for class '{@link mowl.DataPropertyList <em>Data Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property List</em>'.
	 * @see mowl.DataPropertyList
	 * @generated
	 */
	EClass getDataPropertyList();

	/**
	 * Returns the meta object for the reference list '{@link mowl.DataPropertyList#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Properties</em>'.
	 * @see mowl.DataPropertyList#getDataProperties()
	 * @see #getDataPropertyList()
	 * @generated
	 */
	EReference getDataPropertyList_DataProperties();

	/**
	 * Returns the meta object for class '{@link mowl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see mowl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Annotation#getAnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Property</em>'.
	 * @see mowl.Annotation#getAnnotationProperty()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_AnnotationProperty();

	/**
	 * Returns the meta object for the reference list '{@link mowl.Annotation#getAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotation Target</em>'.
	 * @see mowl.Annotation#getAnnotationTarget()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotationTarget();

	/**
	 * Returns the meta object for class '{@link mowl.ConstantAnnotation <em>Constant Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Annotation</em>'.
	 * @see mowl.ConstantAnnotation
	 * @generated
	 */
	EClass getConstantAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ConstantAnnotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mowl.ConstantAnnotation#getValue()
	 * @see #getConstantAnnotation()
	 * @generated
	 */
	EAttribute getConstantAnnotation_Value();

	/**
	 * Returns the meta object for the attribute '{@link mowl.ConstantAnnotation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see mowl.ConstantAnnotation#getDatatype()
	 * @see #getConstantAnnotation()
	 * @generated
	 */
	EAttribute getConstantAnnotation_Datatype();

	/**
	 * Returns the meta object for class '{@link mowl.AnnotationByEntity <em>Annotation By Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation By Entity</em>'.
	 * @see mowl.AnnotationByEntity
	 * @generated
	 */
	EClass getAnnotationByEntity();

	/**
	 * Returns the meta object for the reference '{@link mowl.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation Value</em>'.
	 * @see mowl.AnnotationByEntity#getAnnotationValue()
	 * @see #getAnnotationByEntity()
	 * @generated
	 */
	EReference getAnnotationByEntity_AnnotationValue();

	/**
	 * Returns the meta object for class '{@link mowl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see mowl.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Constant#getLexicalValue <em>Lexical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Value</em>'.
	 * @see mowl.Constant#getLexicalValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_LexicalValue();

	/**
	 * Returns the meta object for the attribute '{@link mowl.Constant#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see mowl.Constant#getDatatype()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Datatype();

	/**
	 * Returns the meta object for the container reference '{@link mowl.Constant#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see mowl.Constant#getOntology()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Ontology();

	/**
	 * Returns the meta object for enum '{@link mowl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Annotation Property</em>'.
	 * @see mowl.AnnotationProperty
	 * @generated
	 */
	EEnum getAnnotationProperty();

	/**
	 * Returns the meta object for enum '{@link mowl.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see mowl.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mowlFactory getmowlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mowl.impl.MultiontologyImpl <em>Multiontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.MultiontologyImpl
		 * @see mowl.impl.mowlPackageImpl#getMultiontology()
		 * @generated
		 */
		EClass MULTIONTOLOGY = eINSTANCE.getMultiontology();

		/**
		 * The meta object literal for the '<em><b>Prefix IRI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIONTOLOGY__PREFIX_IRI = eINSTANCE.getMultiontology_PrefixIRI();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIONTOLOGY__VERSION = eINSTANCE.getMultiontology_Version();

		/**
		 * The meta object literal for the '<em><b>Ontologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIONTOLOGY__ONTOLOGIES = eINSTANCE.getMultiontology_Ontologies();

		/**
		 * The meta object literal for the '<em><b>Ontology Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIONTOLOGY__ONTOLOGY_CONNECTORS = eINSTANCE.getMultiontology_OntologyConnectors();

		/**
		 * The meta object literal for the '<em><b>Multiontology Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS = eINSTANCE.getMultiontology_MultiontologyAxioms();

		/**
		 * The meta object literal for the '<em><b>Multiontology Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS = eINSTANCE.getMultiontology_MultiontologyAnnotations();

		/**
		 * The meta object literal for the '{@link mowl.impl.OntologyConnectorImpl <em>Ontology Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.OntologyConnectorImpl
		 * @see mowl.impl.mowlPackageImpl#getOntologyConnector()
		 * @generated
		 */
		EClass ONTOLOGY_CONNECTOR = eINSTANCE.getOntologyConnector();

		/**
		 * The meta object literal for the '{@link mowl.impl.EConnectorImpl <em>EConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EConnectorImpl
		 * @see mowl.impl.mowlPackageImpl#getEConnector()
		 * @generated
		 */
		EClass ECONNECTOR = eINSTANCE.getEConnector();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkPropertyImpl <em>Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkProperty()
		 * @generated
		 */
		EClass LINK_PROPERTY = eINSTANCE.getLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Functional Link Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_PROPERTY__FUNCTIONAL_LINK_PROPERTY = eINSTANCE.getLinkProperty_FunctionalLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Inverse Functional Link Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_PROPERTY__INVERSE_FUNCTIONAL_LINK_PROPERTY = eINSTANCE.getLinkProperty_InverseFunctionalLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Source Ontology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY__SOURCE_ONTOLOGY = eINSTANCE.getLinkProperty_SourceOntology();

		/**
		 * The meta object literal for the '<em><b>Target Ontology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY__TARGET_ONTOLOGY = eINSTANCE.getLinkProperty_TargetOntology();

		/**
		 * The meta object literal for the '<em><b>Link Property Axioms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY__LINK_PROPERTY_AXIOMS = eINSTANCE.getLinkProperty_LinkPropertyAxioms();

		/**
		 * The meta object literal for the '{@link mowl.impl.AxiomImpl <em>Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.AxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getAxiom()
		 * @generated
		 */
		EClass AXIOM = eINSTANCE.getAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.MultiontologyAxiomImpl <em>Multiontology Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.MultiontologyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getMultiontologyAxiom()
		 * @generated
		 */
		EClass MULTIONTOLOGY_AXIOM = eINSTANCE.getMultiontologyAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkPropertyAxiomImpl <em>Link Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkPropertyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkPropertyAxiom()
		 * @generated
		 */
		EClass LINK_PROPERTY_AXIOM = eINSTANCE.getLinkPropertyAxiom();

		/**
		 * The meta object literal for the '<em><b>Link Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY_AXIOM__LINK_PROPERTY = eINSTANCE.getLinkPropertyAxiom_LinkProperty();

		/**
		 * The meta object literal for the '{@link mowl.impl.EquivalentLinkPropertyImpl <em>Equivalent Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EquivalentLinkPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getEquivalentLinkProperty()
		 * @generated
		 */
		EClass EQUIVALENT_LINK_PROPERTY = eINSTANCE.getEquivalentLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Link Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS = eINSTANCE.getEquivalentLinkProperty_LinkPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.SubLinkPropertyOfImpl <em>Sub Link Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.SubLinkPropertyOfImpl
		 * @see mowl.impl.mowlPackageImpl#getSubLinkPropertyOf()
		 * @generated
		 */
		EClass SUB_LINK_PROPERTY_OF = eINSTANCE.getSubLinkPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Link Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LINK_PROPERTY_OF__LINK_PROPERTY_EXPRESSIONS = eINSTANCE.getSubLinkPropertyOf_LinkPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.DisjointLinkPropertyImpl <em>Disjoint Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DisjointLinkPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getDisjointLinkProperty()
		 * @generated
		 */
		EClass DISJOINT_LINK_PROPERTY = eINSTANCE.getDisjointLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Link Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_LINK_PROPERTY__LINK_PROPERTY_EXPRESSIONS = eINSTANCE.getDisjointLinkProperty_LinkPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.DomainLinkPropertyImpl <em>Domain Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DomainLinkPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getDomainLinkProperty()
		 * @generated
		 */
		EClass DOMAIN_LINK_PROPERTY = eINSTANCE.getDomainLinkProperty();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_LINK_PROPERTY__EXPRESSIONS = eINSTANCE.getDomainLinkProperty_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.RangeLinkPropertyOfImpl <em>Range Link Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.RangeLinkPropertyOfImpl
		 * @see mowl.impl.mowlPackageImpl#getRangeLinkPropertyOf()
		 * @generated
		 */
		EClass RANGE_LINK_PROPERTY_OF = eINSTANCE.getRangeLinkPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_LINK_PROPERTY_OF__EXPRESSIONS = eINSTANCE.getRangeLinkPropertyOf_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkPropertyExpressionImpl <em>Link Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkPropertyExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkPropertyExpression()
		 * @generated
		 */
		EClass LINK_PROPERTY_EXPRESSION = eINSTANCE.getLinkPropertyExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkPropertyListImpl <em>Link Property List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkPropertyListImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkPropertyList()
		 * @generated
		 */
		EClass LINK_PROPERTY_LIST = eINSTANCE.getLinkPropertyList();

		/**
		 * The meta object literal for the '<em><b>Links Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY_LIST__LINKS_PROPERTY = eINSTANCE.getLinkPropertyList_LinksProperty();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkPropertyInverseOfImpl <em>Link Property Inverse Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkPropertyInverseOfImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkPropertyInverseOf()
		 * @generated
		 */
		EClass LINK_PROPERTY_INVERSE_OF = eINSTANCE.getLinkPropertyInverseOf();

		/**
		 * The meta object literal for the '<em><b>Inverse Link Property Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PROPERTY_INVERSE_OF__INVERSE_LINK_PROPERTY_OF = eINSTANCE.getLinkPropertyInverseOf_InverseLinkPropertyOf();

		/**
		 * The meta object literal for the '{@link mowl.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.OntologyImpl
		 * @see mowl.impl.mowlPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__VERSION = eINSTANCE.getOntology_Version();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CLASSES = eINSTANCE.getOntology_Classes();

		/**
		 * The meta object literal for the '<em><b>Objects Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__OBJECTS_PROPERTY = eINSTANCE.getOntology_ObjectsProperty();

		/**
		 * The meta object literal for the '<em><b>Data Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__DATA_PROPERTY = eINSTANCE.getOntology_DataProperty();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__INDIVIDUALS = eINSTANCE.getOntology_Individuals();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__LITERALS = eINSTANCE.getOntology_Literals();

		/**
		 * The meta object literal for the '<em><b>Ontology Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__ONTOLOGY_AXIOMS = eINSTANCE.getOntology_OntologyAxioms();

		/**
		 * The meta object literal for the '<em><b>Ontology Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__ONTOLOGY_ANNOTATIONS = eINSTANCE.getOntology_OntologyAnnotations();

		/**
		 * The meta object literal for the '<em><b>Multiontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__MULTIONTOLOGY = eINSTANCE.getOntology_Multiontology();

		/**
		 * The meta object literal for the '{@link mowl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EntityImpl
		 * @see mowl.impl.mowlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ANNOTATIONS = eINSTANCE.getEntity_Annotations();

		/**
		 * The meta object literal for the '{@link mowl.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ClassImpl
		 * @see mowl.impl.mowlPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Class Axioms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_AXIOMS = eINSTANCE.getClass_ClassAxioms();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ONTOLOGY = eINSTANCE.getClass_Ontology();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectProperty()
		 * @generated
		 */
		EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Object Property Axioms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS = eINSTANCE.getObjectProperty_ObjectPropertyAxioms();

		/**
		 * The meta object literal for the '<em><b>Functional Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_FunctionalObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Inverse Functional Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_InverseFunctionalObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Transitive Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_TransitiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Symmetric Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_SymmetricObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Asymmetric Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_AsymmetricObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Reflexive Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_ReflexiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Irreflexive Object Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getObjectProperty_IrreflexiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__ONTOLOGY = eINSTANCE.getObjectProperty_Ontology();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '<em><b>Data Property Axioms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__DATA_PROPERTY_AXIOMS = eINSTANCE.getDataProperty_DataPropertyAxioms();

		/**
		 * The meta object literal for the '<em><b>Functional Data Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__FUNCTIONAL_DATA_PROPERTY = eINSTANCE.getDataProperty_FunctionalDataProperty();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__ONTOLOGY = eINSTANCE.getDataProperty_Ontology();

		/**
		 * The meta object literal for the '{@link mowl.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.IndividualImpl
		 * @see mowl.impl.mowlPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Individual Assertions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__INDIVIDUAL_ASSERTIONS = eINSTANCE.getIndividual_IndividualAssertions();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__ONTOLOGY = eINSTANCE.getIndividual_Ontology();

		/**
		 * The meta object literal for the '{@link mowl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.NamedIndividualImpl
		 * @see mowl.impl.mowlPackageImpl#getNamedIndividual()
		 * @generated
		 */
		EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

		/**
		 * The meta object literal for the '{@link mowl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.AnonymousIndividualImpl
		 * @see mowl.impl.mowlPackageImpl#getAnonymousIndividual()
		 * @generated
		 */
		EClass ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividual();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMOUS_INDIVIDUAL__NODE_ID = eINSTANCE.getAnonymousIndividual_NodeID();

		/**
		 * The meta object literal for the '{@link mowl.impl.OntologyAxiomImpl <em>Ontology Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.OntologyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getOntologyAxiom()
		 * @generated
		 */
		EClass ONTOLOGY_AXIOM = eINSTANCE.getOntologyAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ClassAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getClassAxiom()
		 * @generated
		 */
		EClass CLASS_AXIOM = eINSTANCE.getClassAxiom();

		/**
		 * The meta object literal for the '<em><b>Class Axiom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_AXIOM__CLASS_AXIOM = eINSTANCE.getClassAxiom_ClassAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.DisjointClassImpl <em>Disjoint Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DisjointClassImpl
		 * @see mowl.impl.mowlPackageImpl#getDisjointClass()
		 * @generated
		 */
		EClass DISJOINT_CLASS = eINSTANCE.getDisjointClass();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_CLASS__EXPRESSIONS = eINSTANCE.getDisjointClass_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DisjointUnionImpl
		 * @see mowl.impl.mowlPackageImpl#getDisjointUnion()
		 * @generated
		 */
		EClass DISJOINT_UNION = eINSTANCE.getDisjointUnion();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_UNION__EXPRESSIONS = eINSTANCE.getDisjointUnion_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.EquivalentClassImpl <em>Equivalent Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EquivalentClassImpl
		 * @see mowl.impl.mowlPackageImpl#getEquivalentClass()
		 * @generated
		 */
		EClass EQUIVALENT_CLASS = eINSTANCE.getEquivalentClass();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_CLASS__EXPRESSIONS = eINSTANCE.getEquivalentClass_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.SubClassOfImpl
		 * @see mowl.impl.mowlPackageImpl#getSubClassOf()
		 * @generated
		 */
		EClass SUB_CLASS_OF = eINSTANCE.getSubClassOf();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_OF__EXPRESSIONS = eINSTANCE.getSubClassOf_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyAxiom()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_AXIOM = eINSTANCE.getObjectPropertyAxiom();

		/**
		 * The meta object literal for the '<em><b>Object Property Axiom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY_AXIOM = eINSTANCE.getObjectPropertyAxiom_ObjectPropertyAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.DisjointObjectPropertyImpl <em>Disjoint Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DisjointObjectPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getDisjointObjectProperty()
		 * @generated
		 */
		EClass DISJOINT_OBJECT_PROPERTY = eINSTANCE.getDisjointObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getDisjointObjectProperty_ObjectPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.EquivalentObjectPropertyImpl <em>Equivalent Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EquivalentObjectPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getEquivalentObjectProperty()
		 * @generated
		 */
		EClass EQUIVALENT_OBJECT_PROPERTY = eINSTANCE.getEquivalentObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getEquivalentObjectProperty_ObjectPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.SubObjectPropertyOfImpl
		 * @see mowl.impl.mowlPackageImpl#getSubObjectPropertyOf()
		 * @generated
		 */
		EClass SUB_OBJECT_PROPERTY_OF = eINSTANCE.getSubObjectPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getSubObjectPropertyOf_ObjectPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.InverseObjectPropertyAxiomImpl <em>Inverse Object Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.InverseObjectPropertyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getInverseObjectPropertyAxiom()
		 * @generated
		 */
		EClass INVERSE_OBJECT_PROPERTY_AXIOM = eINSTANCE.getInverseObjectPropertyAxiom();

		/**
		 * The meta object literal for the '<em><b>Object Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_OBJECT_PROPERTY_AXIOM__OBJECT_PROPERTY = eINSTANCE.getInverseObjectPropertyAxiom_ObjectProperty();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyDomainImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyDomain()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_DOMAIN = eINSTANCE.getObjectPropertyDomain();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_DOMAIN__EXPRESSIONS = eINSTANCE.getObjectPropertyDomain_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyRangeImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyRange()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_RANGE = eINSTANCE.getObjectPropertyRange();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_RANGE__EXPRESSIONS = eINSTANCE.getObjectPropertyRange_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyAxiomImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyAxiom()
		 * @generated
		 */
		EClass DATA_PROPERTY_AXIOM = eINSTANCE.getDataPropertyAxiom();

		/**
		 * The meta object literal for the '<em><b>Data Property Axiom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_AXIOM__DATA_PROPERTY_AXIOM = eINSTANCE.getDataPropertyAxiom_DataPropertyAxiom();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyDomainImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyDomain()
		 * @generated
		 */
		EClass DATA_PROPERTY_DOMAIN = eINSTANCE.getDataPropertyDomain();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_DOMAIN__EXPRESSIONS = eINSTANCE.getDataPropertyDomain_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyRangeImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyRange()
		 * @generated
		 */
		EClass DATA_PROPERTY_RANGE = eINSTANCE.getDataPropertyRange();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_RANGE__LITERAL = eINSTANCE.getDataPropertyRange_Literal();

		/**
		 * The meta object literal for the '{@link mowl.impl.DisjointDataPropertyImpl <em>Disjoint Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DisjointDataPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getDisjointDataProperty()
		 * @generated
		 */
		EClass DISJOINT_DATA_PROPERTY = eINSTANCE.getDisjointDataProperty();

		/**
		 * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDisjointDataProperty_DataPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.EquivalentDataPropertyImpl <em>Equivalent Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EquivalentDataPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getEquivalentDataProperty()
		 * @generated
		 */
		EClass EQUIVALENT_DATA_PROPERTY = eINSTANCE.getEquivalentDataProperty();

		/**
		 * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_DATA_PROPERTY__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getEquivalentDataProperty_DataPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.SubDataPropertyOfImpl
		 * @see mowl.impl.mowlPackageImpl#getSubDataPropertyOf()
		 * @generated
		 */
		EClass SUB_DATA_PROPERTY_OF = eINSTANCE.getSubDataPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DATA_PROPERTY_OF__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getSubDataPropertyOf_DataPropertyExpressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.AssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Individual Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__INDIVIDUAL_ASSERTION = eINSTANCE.getAssertion_IndividualAssertion();

		/**
		 * The meta object literal for the '{@link mowl.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ClassAssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getClassAssertion()
		 * @generated
		 */
		EClass CLASS_ASSERTION = eINSTANCE.getClassAssertion();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ASSERTION__EXPRESSIONS = eINSTANCE.getClassAssertion_Expressions();

		/**
		 * The meta object literal for the '{@link mowl.impl.SameIndividualImpl <em>Same Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.SameIndividualImpl
		 * @see mowl.impl.mowlPackageImpl#getSameIndividual()
		 * @generated
		 */
		EClass SAME_INDIVIDUAL = eINSTANCE.getSameIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_INDIVIDUAL__TARGET_INDIVIDUAL = eINSTANCE.getSameIndividual_TargetIndividual();

		/**
		 * The meta object literal for the '{@link mowl.impl.DifferentIndividualImpl <em>Different Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DifferentIndividualImpl
		 * @see mowl.impl.mowlPackageImpl#getDifferentIndividual()
		 * @generated
		 */
		EClass DIFFERENT_INDIVIDUAL = eINSTANCE.getDifferentIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_INDIVIDUAL__TARGET_INDIVIDUAL = eINSTANCE.getDifferentIndividual_TargetIndividual();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyAssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyAssertion()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_ASSERTION = eINSTANCE.getObjectPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getObjectPropertyAssertion_ObjectPropertyExpressions();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_TargetIndividual();

		/**
		 * The meta object literal for the '{@link mowl.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.NegativeObjectPropertyAssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getNegativeObjectPropertyAssertion()
		 * @generated
		 */
		EClass NEGATIVE_OBJECT_PROPERTY_ASSERTION = eINSTANCE.getNegativeObjectPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getNegativeObjectPropertyAssertion_ObjectPropertyExpressions();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_TargetIndividual();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyAssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyAssertion()
		 * @generated
		 */
		EClass DATA_PROPERTY_ASSERTION = eINSTANCE.getDataPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataPropertyAssertion_DataPropertyExpressions();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getDataPropertyAssertion_TargetValue();

		/**
		 * The meta object literal for the '{@link mowl.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.NegativeDataPropertyAssertionImpl
		 * @see mowl.impl.mowlPackageImpl#getNegativeDataPropertyAssertion()
		 * @generated
		 */
		EClass NEGATIVE_DATA_PROPERTY_ASSERTION = eINSTANCE.getNegativeDataPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getNegativeDataPropertyAssertion_DataPropertyExpressions();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getNegativeDataPropertyAssertion_TargetValue();

		/**
		 * The meta object literal for the '{@link mowl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ClassExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getClassExpression()
		 * @generated
		 */
		EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.ClassListImpl <em>Class List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ClassListImpl
		 * @see mowl.impl.mowlPackageImpl#getClassList()
		 * @generated
		 */
		EClass CLASS_LIST = eINSTANCE.getClassList();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LIST__CLASSES = eINSTANCE.getClassList_Classes();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectIntersectionOfImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectIntersectionOf()
		 * @generated
		 */
		EClass OBJECT_INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INTERSECTION_OF__CLASSES = eINSTANCE.getObjectIntersectionOf_Classes();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectUnionOfImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectUnionOf()
		 * @generated
		 */
		EClass OBJECT_UNION_OF = eINSTANCE.getObjectUnionOf();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_UNION_OF__CLASSES = eINSTANCE.getObjectUnionOf_Classes();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectComplementOfImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectComplementOf()
		 * @generated
		 */
		EClass OBJECT_COMPLEMENT_OF = eINSTANCE.getObjectComplementOf();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COMPLEMENT_OF__CLASSES = eINSTANCE.getObjectComplementOf_Classes();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectOneOfImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectOneOf()
		 * @generated
		 */
		EClass OBJECT_ONE_OF = eINSTANCE.getObjectOneOf();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ONE_OF__INDIVIDUAL = eINSTANCE.getObjectOneOf_Individual();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectSomeValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectSomeValuesFrom()
		 * @generated
		 */
		EClass OBJECT_SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SOME_VALUES_FROM__CLASSES = eINSTANCE.getObjectSomeValuesFrom_Classes();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTIES = eINSTANCE.getObjectSomeValuesFrom_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectAllValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectAllValuesFrom()
		 * @generated
		 */
		EClass OBJECT_ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ALL_VALUES_FROM__CLASSES = eINSTANCE.getObjectAllValuesFrom_Classes();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTIES = eINSTANCE.getObjectAllValuesFrom_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectHasValueImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectHasValue()
		 * @generated
		 */
		EClass OBJECT_HAS_VALUE = eINSTANCE.getObjectHasValue();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_VALUE__OBJECT_PROPERTIES = eINSTANCE.getObjectHasValue_ObjectProperties();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_VALUE__INDIVIDUAL = eINSTANCE.getObjectHasValue_Individual();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectMinCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectMinCardinality()
		 * @generated
		 */
		EClass OBJECT_MIN_CARDINALITY = eINSTANCE.getObjectMinCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MIN_CARDINALITY__CLASSES = eINSTANCE.getObjectMinCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MIN_CARDINALITY__OBJECT_PROPERTIES = eINSTANCE.getObjectMinCardinality_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectMaxCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectMaxCardinality()
		 * @generated
		 */
		EClass OBJECT_MAX_CARDINALITY = eINSTANCE.getObjectMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAX_CARDINALITY__CLASSES = eINSTANCE.getObjectMaxCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAX_CARDINALITY__OBJECT_PROPERTIES = eINSTANCE.getObjectMaxCardinality_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectExactCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectExactCardinality()
		 * @generated
		 */
		EClass OBJECT_EXACT_CARDINALITY = eINSTANCE.getObjectExactCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getObjectExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXACT_CARDINALITY__CLASSES = eINSTANCE.getObjectExactCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTIES = eINSTANCE.getObjectExactCardinality_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataSomeValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getDataSomeValuesFrom()
		 * @generated
		 */
		EClass DATA_SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__DATA_PROPERTIES = eINSTANCE.getDataSomeValuesFrom_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__LITERALS = eINSTANCE.getDataSomeValuesFrom_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataAllValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getDataAllValuesFrom()
		 * @generated
		 */
		EClass DATA_ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__DATA_PROPERTIES = eINSTANCE.getDataAllValuesFrom_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__LITERALS = eINSTANCE.getDataAllValuesFrom_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataHasValueImpl
		 * @see mowl.impl.mowlPackageImpl#getDataHasValue()
		 * @generated
		 */
		EClass DATA_HAS_VALUE = eINSTANCE.getDataHasValue();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__DATA_PROPERTIES = eINSTANCE.getDataHasValue_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__LITERALS = eINSTANCE.getDataHasValue_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataMinCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getDataMinCardinality()
		 * @generated
		 */
		EClass DATA_MIN_CARDINALITY = eINSTANCE.getDataMinCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getDataMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__DATA_PROPERTIES = eINSTANCE.getDataMinCardinality_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__LITERALS = eINSTANCE.getDataMinCardinality_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataMaxCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getDataMaxCardinality()
		 * @generated
		 */
		EClass DATA_MAX_CARDINALITY = eINSTANCE.getDataMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getDataMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__DATA_PROPERTIES = eINSTANCE.getDataMaxCardinality_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__LITERALS = eINSTANCE.getDataMaxCardinality_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataExactCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getDataExactCardinality()
		 * @generated
		 */
		EClass DATA_EXACT_CARDINALITY = eINSTANCE.getDataExactCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getDataExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__DATA_PROPERTIES = eINSTANCE.getDataExactCardinality_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__LITERALS = eINSTANCE.getDataExactCardinality_Literals();

		/**
		 * The meta object literal for the '{@link mowl.impl.EConnectionExpressionImpl <em>EConnection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.EConnectionExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getEConnectionExpression()
		 * @generated
		 */
		EClass ECONNECTION_EXPRESSION = eINSTANCE.getEConnectionExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkSomeValuesFromImpl <em>Link Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkSomeValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkSomeValuesFrom()
		 * @generated
		 */
		EClass LINK_SOME_VALUES_FROM = eINSTANCE.getLinkSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_SOME_VALUES_FROM__CLASSES = eINSTANCE.getLinkSomeValuesFrom_Classes();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_SOME_VALUES_FROM__LINK_PROPERTIES = eINSTANCE.getLinkSomeValuesFrom_LinkProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkAllValuesFromImpl <em>Link All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkAllValuesFromImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkAllValuesFrom()
		 * @generated
		 */
		EClass LINK_ALL_VALUES_FROM = eINSTANCE.getLinkAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ALL_VALUES_FROM__CLASSES = eINSTANCE.getLinkAllValuesFrom_Classes();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ALL_VALUES_FROM__LINK_PROPERTIES = eINSTANCE.getLinkAllValuesFrom_LinkProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkHasValueImpl <em>Link Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkHasValueImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkHasValue()
		 * @generated
		 */
		EClass LINK_HAS_VALUE = eINSTANCE.getLinkHasValue();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HAS_VALUE__LINK_PROPERTIES = eINSTANCE.getLinkHasValue_LinkProperties();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HAS_VALUE__INDIVIDUAL = eINSTANCE.getLinkHasValue_Individual();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkMinCardinalityImpl <em>Link Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkMinCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkMinCardinality()
		 * @generated
		 */
		EClass LINK_MIN_CARDINALITY = eINSTANCE.getLinkMinCardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MIN_CARDINALITY__CLASSES = eINSTANCE.getLinkMinCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MIN_CARDINALITY__LINK_PROPERTIES = eINSTANCE.getLinkMinCardinality_LinkProperties();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getLinkMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkMaxCardinalityImpl <em>Link Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkMaxCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkMaxCardinality()
		 * @generated
		 */
		EClass LINK_MAX_CARDINALITY = eINSTANCE.getLinkMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MAX_CARDINALITY__CLASSES = eINSTANCE.getLinkMaxCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MAX_CARDINALITY__LINK_PROPERTIES = eINSTANCE.getLinkMaxCardinality_LinkProperties();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getLinkMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '{@link mowl.impl.LinkExactCardinalityImpl <em>Link Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.LinkExactCardinalityImpl
		 * @see mowl.impl.mowlPackageImpl#getLinkExactCardinality()
		 * @generated
		 */
		EClass LINK_EXACT_CARDINALITY = eINSTANCE.getLinkExactCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getLinkExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_EXACT_CARDINALITY__CLASSES = eINSTANCE.getLinkExactCardinality_Classes();

		/**
		 * The meta object literal for the '<em><b>Link Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_EXACT_CARDINALITY__LINK_PROPERTIES = eINSTANCE.getLinkExactCardinality_LinkProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyExpression()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.ObjectPropertyListImpl <em>Object Property List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ObjectPropertyListImpl
		 * @see mowl.impl.mowlPackageImpl#getObjectPropertyList()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_LIST = eINSTANCE.getObjectPropertyList();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_LIST__OBJECT_PROPERTIES = eINSTANCE.getObjectPropertyList_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.InverseObjectPropertyImpl
		 * @see mowl.impl.mowlPackageImpl#getInverseObjectProperty()
		 * @generated
		 */
		EClass INVERSE_OBJECT_PROPERTY = eINSTANCE.getInverseObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTIES = eINSTANCE.getInverseObjectProperty_ObjectProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyExpressionImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyExpression()
		 * @generated
		 */
		EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

		/**
		 * The meta object literal for the '{@link mowl.impl.DataPropertyListImpl <em>Data Property List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.DataPropertyListImpl
		 * @see mowl.impl.mowlPackageImpl#getDataPropertyList()
		 * @generated
		 */
		EClass DATA_PROPERTY_LIST = eINSTANCE.getDataPropertyList();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_LIST__DATA_PROPERTIES = eINSTANCE.getDataPropertyList_DataProperties();

		/**
		 * The meta object literal for the '{@link mowl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.AnnotationImpl
		 * @see mowl.impl.mowlPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotation Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ANNOTATION_PROPERTY = eINSTANCE.getAnnotation_AnnotationProperty();

		/**
		 * The meta object literal for the '<em><b>Annotation Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATION_TARGET = eINSTANCE.getAnnotation_AnnotationTarget();

		/**
		 * The meta object literal for the '{@link mowl.impl.ConstantAnnotationImpl <em>Constant Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ConstantAnnotationImpl
		 * @see mowl.impl.mowlPackageImpl#getConstantAnnotation()
		 * @generated
		 */
		EClass CONSTANT_ANNOTATION = eINSTANCE.getConstantAnnotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ANNOTATION__VALUE = eINSTANCE.getConstantAnnotation_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ANNOTATION__DATATYPE = eINSTANCE.getConstantAnnotation_Datatype();

		/**
		 * The meta object literal for the '{@link mowl.impl.AnnotationByEntityImpl <em>Annotation By Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.AnnotationByEntityImpl
		 * @see mowl.impl.mowlPackageImpl#getAnnotationByEntity()
		 * @generated
		 */
		EClass ANNOTATION_BY_ENTITY = eINSTANCE.getAnnotationByEntity();

		/**
		 * The meta object literal for the '<em><b>Annotation Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_BY_ENTITY__ANNOTATION_VALUE = eINSTANCE.getAnnotationByEntity_AnnotationValue();

		/**
		 * The meta object literal for the '{@link mowl.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.impl.ConstantImpl
		 * @see mowl.impl.mowlPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Lexical Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__LEXICAL_VALUE = eINSTANCE.getConstant_LexicalValue();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__DATATYPE = eINSTANCE.getConstant_Datatype();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__ONTOLOGY = eINSTANCE.getConstant_Ontology();

		/**
		 * The meta object literal for the '{@link mowl.AnnotationProperty <em>Annotation Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.AnnotationProperty
		 * @see mowl.impl.mowlPackageImpl#getAnnotationProperty()
		 * @generated
		 */
		EEnum ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

		/**
		 * The meta object literal for the '{@link mowl.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mowl.DataType
		 * @see mowl.impl.mowlPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //mowlPackage
