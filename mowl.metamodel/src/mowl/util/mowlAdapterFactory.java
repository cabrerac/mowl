/**
 */
package mowl.util;

import mowl.Annotation;
import mowl.AnnotationByEntity;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage
 * @generated
 */
public class mowlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static mowlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mowlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mowlSwitch<Adapter> modelSwitch =
		new mowlSwitch<Adapter>() {
			@Override
			public Adapter caseMultiontology(Multiontology object) {
				return createMultiontologyAdapter();
			}
			@Override
			public Adapter caseOntologyConnector(OntologyConnector object) {
				return createOntologyConnectorAdapter();
			}
			@Override
			public Adapter caseEConnector(EConnector object) {
				return createEConnectorAdapter();
			}
			@Override
			public Adapter caseLinkProperty(LinkProperty object) {
				return createLinkPropertyAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseMultiontologyAxiom(MultiontologyAxiom object) {
				return createMultiontologyAxiomAdapter();
			}
			@Override
			public Adapter caseLinkPropertyAxiom(LinkPropertyAxiom object) {
				return createLinkPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseEquivalentLinkProperty(EquivalentLinkProperty object) {
				return createEquivalentLinkPropertyAdapter();
			}
			@Override
			public Adapter caseSubLinkPropertyOf(SubLinkPropertyOf object) {
				return createSubLinkPropertyOfAdapter();
			}
			@Override
			public Adapter caseDisjointLinkProperty(DisjointLinkProperty object) {
				return createDisjointLinkPropertyAdapter();
			}
			@Override
			public Adapter caseDomainLinkProperty(DomainLinkProperty object) {
				return createDomainLinkPropertyAdapter();
			}
			@Override
			public Adapter caseRangeLinkPropertyOf(RangeLinkPropertyOf object) {
				return createRangeLinkPropertyOfAdapter();
			}
			@Override
			public Adapter caseLinkPropertyExpression(LinkPropertyExpression object) {
				return createLinkPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseLinkPropertyList(LinkPropertyList object) {
				return createLinkPropertyListAdapter();
			}
			@Override
			public Adapter caseLinkPropertyInverseOf(LinkPropertyInverseOf object) {
				return createLinkPropertyInverseOfAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseClass(mowl.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseObjectProperty(ObjectProperty object) {
				return createObjectPropertyAdapter();
			}
			@Override
			public Adapter caseDataProperty(DataProperty object) {
				return createDataPropertyAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseNamedIndividual(NamedIndividual object) {
				return createNamedIndividualAdapter();
			}
			@Override
			public Adapter caseAnonymousIndividual(AnonymousIndividual object) {
				return createAnonymousIndividualAdapter();
			}
			@Override
			public Adapter caseOntologyAxiom(OntologyAxiom object) {
				return createOntologyAxiomAdapter();
			}
			@Override
			public Adapter caseClassAxiom(ClassAxiom object) {
				return createClassAxiomAdapter();
			}
			@Override
			public Adapter caseDisjointClass(DisjointClass object) {
				return createDisjointClassAdapter();
			}
			@Override
			public Adapter caseDisjointUnion(DisjointUnion object) {
				return createDisjointUnionAdapter();
			}
			@Override
			public Adapter caseEquivalentClass(EquivalentClass object) {
				return createEquivalentClassAdapter();
			}
			@Override
			public Adapter caseSubClassOf(SubClassOf object) {
				return createSubClassOfAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
				return createObjectPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseDisjointObjectProperty(DisjointObjectProperty object) {
				return createDisjointObjectPropertyAdapter();
			}
			@Override
			public Adapter caseEquivalentObjectProperty(EquivalentObjectProperty object) {
				return createEquivalentObjectPropertyAdapter();
			}
			@Override
			public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object) {
				return createSubObjectPropertyOfAdapter();
			}
			@Override
			public Adapter caseInverseObjectPropertyAxiom(InverseObjectPropertyAxiom object) {
				return createInverseObjectPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object) {
				return createObjectPropertyDomainAdapter();
			}
			@Override
			public Adapter caseObjectPropertyRange(ObjectPropertyRange object) {
				return createObjectPropertyRangeAdapter();
			}
			@Override
			public Adapter caseDataPropertyAxiom(DataPropertyAxiom object) {
				return createDataPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseDataPropertyDomain(DataPropertyDomain object) {
				return createDataPropertyDomainAdapter();
			}
			@Override
			public Adapter caseDataPropertyRange(DataPropertyRange object) {
				return createDataPropertyRangeAdapter();
			}
			@Override
			public Adapter caseDisjointDataProperty(DisjointDataProperty object) {
				return createDisjointDataPropertyAdapter();
			}
			@Override
			public Adapter caseEquivalentDataProperty(EquivalentDataProperty object) {
				return createEquivalentDataPropertyAdapter();
			}
			@Override
			public Adapter caseSubDataPropertyOf(SubDataPropertyOf object) {
				return createSubDataPropertyOfAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseClassAssertion(ClassAssertion object) {
				return createClassAssertionAdapter();
			}
			@Override
			public Adapter caseSameIndividual(SameIndividual object) {
				return createSameIndividualAdapter();
			}
			@Override
			public Adapter caseDifferentIndividual(DifferentIndividual object) {
				return createDifferentIndividualAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
				return createObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
				return createNegativeObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseDataPropertyAssertion(DataPropertyAssertion object) {
				return createDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
				return createNegativeDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseClassExpression(ClassExpression object) {
				return createClassExpressionAdapter();
			}
			@Override
			public Adapter caseClassList(ClassList object) {
				return createClassListAdapter();
			}
			@Override
			public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object) {
				return createObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseObjectUnionOf(ObjectUnionOf object) {
				return createObjectUnionOfAdapter();
			}
			@Override
			public Adapter caseObjectComplementOf(ObjectComplementOf object) {
				return createObjectComplementOfAdapter();
			}
			@Override
			public Adapter caseObjectOneOf(ObjectOneOf object) {
				return createObjectOneOfAdapter();
			}
			@Override
			public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
				return createObjectSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
				return createObjectAllValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectHasValue(ObjectHasValue object) {
				return createObjectHasValueAdapter();
			}
			@Override
			public Adapter caseObjectMinCardinality(ObjectMinCardinality object) {
				return createObjectMinCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectMaxCardinality(ObjectMaxCardinality object) {
				return createObjectMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectExactCardinality(ObjectExactCardinality object) {
				return createObjectExactCardinalityAdapter();
			}
			@Override
			public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object) {
				return createDataSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseDataAllValuesFrom(DataAllValuesFrom object) {
				return createDataAllValuesFromAdapter();
			}
			@Override
			public Adapter caseDataHasValue(DataHasValue object) {
				return createDataHasValueAdapter();
			}
			@Override
			public Adapter caseDataMinCardinality(DataMinCardinality object) {
				return createDataMinCardinalityAdapter();
			}
			@Override
			public Adapter caseDataMaxCardinality(DataMaxCardinality object) {
				return createDataMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseDataExactCardinality(DataExactCardinality object) {
				return createDataExactCardinalityAdapter();
			}
			@Override
			public Adapter caseEConnectionExpression(EConnectionExpression object) {
				return createEConnectionExpressionAdapter();
			}
			@Override
			public Adapter caseLinkSomeValuesFrom(LinkSomeValuesFrom object) {
				return createLinkSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseLinkAllValuesFrom(LinkAllValuesFrom object) {
				return createLinkAllValuesFromAdapter();
			}
			@Override
			public Adapter caseLinkHasValue(LinkHasValue object) {
				return createLinkHasValueAdapter();
			}
			@Override
			public Adapter caseLinkMinCardinality(LinkMinCardinality object) {
				return createLinkMinCardinalityAdapter();
			}
			@Override
			public Adapter caseLinkMaxCardinality(LinkMaxCardinality object) {
				return createLinkMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseLinkExactCardinality(LinkExactCardinality object) {
				return createLinkExactCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object) {
				return createObjectPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyList(ObjectPropertyList object) {
				return createObjectPropertyListAdapter();
			}
			@Override
			public Adapter caseInverseObjectProperty(InverseObjectProperty object) {
				return createInverseObjectPropertyAdapter();
			}
			@Override
			public Adapter caseDataPropertyExpression(DataPropertyExpression object) {
				return createDataPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseDataPropertyList(DataPropertyList object) {
				return createDataPropertyListAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseConstantAnnotation(ConstantAnnotation object) {
				return createConstantAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationByEntity(AnnotationByEntity object) {
				return createAnnotationByEntityAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mowl.Multiontology <em>Multiontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Multiontology
	 * @generated
	 */
	public Adapter createMultiontologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.OntologyConnector <em>Ontology Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.OntologyConnector
	 * @generated
	 */
	public Adapter createOntologyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EConnector <em>EConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EConnector
	 * @generated
	 */
	public Adapter createEConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkProperty
	 * @generated
	 */
	public Adapter createLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.MultiontologyAxiom <em>Multiontology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.MultiontologyAxiom
	 * @generated
	 */
	public Adapter createMultiontologyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkPropertyAxiom <em>Link Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkPropertyAxiom
	 * @generated
	 */
	public Adapter createLinkPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EquivalentLinkProperty <em>Equivalent Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EquivalentLinkProperty
	 * @generated
	 */
	public Adapter createEquivalentLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.SubLinkPropertyOf <em>Sub Link Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.SubLinkPropertyOf
	 * @generated
	 */
	public Adapter createSubLinkPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DisjointLinkProperty <em>Disjoint Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DisjointLinkProperty
	 * @generated
	 */
	public Adapter createDisjointLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DomainLinkProperty <em>Domain Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DomainLinkProperty
	 * @generated
	 */
	public Adapter createDomainLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.RangeLinkPropertyOf <em>Range Link Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.RangeLinkPropertyOf
	 * @generated
	 */
	public Adapter createRangeLinkPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkPropertyExpression <em>Link Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkPropertyExpression
	 * @generated
	 */
	public Adapter createLinkPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkPropertyList <em>Link Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkPropertyList
	 * @generated
	 */
	public Adapter createLinkPropertyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkPropertyInverseOf <em>Link Property Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkPropertyInverseOf
	 * @generated
	 */
	public Adapter createLinkPropertyInverseOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.NamedIndividual
	 * @generated
	 */
	public Adapter createNamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.AnonymousIndividual
	 * @generated
	 */
	public Adapter createAnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.OntologyAxiom <em>Ontology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.OntologyAxiom
	 * @generated
	 */
	public Adapter createOntologyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ClassAxiom
	 * @generated
	 */
	public Adapter createClassAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DisjointClass <em>Disjoint Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DisjointClass
	 * @generated
	 */
	public Adapter createDisjointClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DisjointUnion
	 * @generated
	 */
	public Adapter createDisjointUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EquivalentClass <em>Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EquivalentClass
	 * @generated
	 */
	public Adapter createEquivalentClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.SubClassOf
	 * @generated
	 */
	public Adapter createSubClassOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyAxiom
	 * @generated
	 */
	public Adapter createObjectPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DisjointObjectProperty <em>Disjoint Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DisjointObjectProperty
	 * @generated
	 */
	public Adapter createDisjointObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EquivalentObjectProperty <em>Equivalent Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EquivalentObjectProperty
	 * @generated
	 */
	public Adapter createEquivalentObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.SubObjectPropertyOf
	 * @generated
	 */
	public Adapter createSubObjectPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.InverseObjectPropertyAxiom <em>Inverse Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.InverseObjectPropertyAxiom
	 * @generated
	 */
	public Adapter createInverseObjectPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyDomain
	 * @generated
	 */
	public Adapter createObjectPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyRange
	 * @generated
	 */
	public Adapter createObjectPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyAxiom
	 * @generated
	 */
	public Adapter createDataPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyDomain
	 * @generated
	 */
	public Adapter createDataPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyRange
	 * @generated
	 */
	public Adapter createDataPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DisjointDataProperty <em>Disjoint Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DisjointDataProperty
	 * @generated
	 */
	public Adapter createDisjointDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EquivalentDataProperty <em>Equivalent Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EquivalentDataProperty
	 * @generated
	 */
	public Adapter createEquivalentDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.SubDataPropertyOf
	 * @generated
	 */
	public Adapter createSubDataPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ClassAssertion
	 * @generated
	 */
	public Adapter createClassAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.SameIndividual
	 * @generated
	 */
	public Adapter createSameIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DifferentIndividual <em>Different Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DifferentIndividual
	 * @generated
	 */
	public Adapter createDifferentIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.NegativeObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyAssertion
	 * @generated
	 */
	public Adapter createDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.NegativeDataPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ClassExpression
	 * @generated
	 */
	public Adapter createClassExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ClassList <em>Class List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ClassList
	 * @generated
	 */
	public Adapter createClassListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectUnionOf
	 * @generated
	 */
	public Adapter createObjectUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectComplementOf
	 * @generated
	 */
	public Adapter createObjectComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectOneOf
	 * @generated
	 */
	public Adapter createObjectOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectSomeValuesFrom
	 * @generated
	 */
	public Adapter createObjectSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectAllValuesFrom
	 * @generated
	 */
	public Adapter createObjectAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectHasValue
	 * @generated
	 */
	public Adapter createObjectHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectMinCardinality
	 * @generated
	 */
	public Adapter createObjectMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectMaxCardinality
	 * @generated
	 */
	public Adapter createObjectMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectExactCardinality
	 * @generated
	 */
	public Adapter createObjectExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataSomeValuesFrom
	 * @generated
	 */
	public Adapter createDataSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataAllValuesFrom
	 * @generated
	 */
	public Adapter createDataAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataHasValue
	 * @generated
	 */
	public Adapter createDataHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataMinCardinality
	 * @generated
	 */
	public Adapter createDataMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataMaxCardinality
	 * @generated
	 */
	public Adapter createDataMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataExactCardinality
	 * @generated
	 */
	public Adapter createDataExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.EConnectionExpression <em>EConnection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.EConnectionExpression
	 * @generated
	 */
	public Adapter createEConnectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkSomeValuesFrom <em>Link Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkSomeValuesFrom
	 * @generated
	 */
	public Adapter createLinkSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkAllValuesFrom <em>Link All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkAllValuesFrom
	 * @generated
	 */
	public Adapter createLinkAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkHasValue <em>Link Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkHasValue
	 * @generated
	 */
	public Adapter createLinkHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkMinCardinality <em>Link Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkMinCardinality
	 * @generated
	 */
	public Adapter createLinkMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkMaxCardinality <em>Link Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkMaxCardinality
	 * @generated
	 */
	public Adapter createLinkMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.LinkExactCardinality <em>Link Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.LinkExactCardinality
	 * @generated
	 */
	public Adapter createLinkExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyExpression
	 * @generated
	 */
	public Adapter createObjectPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ObjectPropertyList <em>Object Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ObjectPropertyList
	 * @generated
	 */
	public Adapter createObjectPropertyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.InverseObjectProperty <em>Inverse Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.InverseObjectProperty
	 * @generated
	 */
	public Adapter createInverseObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyExpression
	 * @generated
	 */
	public Adapter createDataPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.DataPropertyList <em>Data Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.DataPropertyList
	 * @generated
	 */
	public Adapter createDataPropertyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.ConstantAnnotation <em>Constant Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.ConstantAnnotation
	 * @generated
	 */
	public Adapter createConstantAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.AnnotationByEntity <em>Annotation By Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.AnnotationByEntity
	 * @generated
	 */
	public Adapter createAnnotationByEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mowl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mowl.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //mowlAdapterFactory
