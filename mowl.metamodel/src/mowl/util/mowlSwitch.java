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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mowl.mowlPackage
 * @generated
 */
public class mowlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static mowlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mowlSwitch() {
		if (modelPackage == null) {
			modelPackage = mowlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case mowlPackage.MULTIONTOLOGY: {
				Multiontology multiontology = (Multiontology)theEObject;
				T result = caseMultiontology(multiontology);
				if (result == null) result = caseEntity(multiontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ONTOLOGY_CONNECTOR: {
				OntologyConnector ontologyConnector = (OntologyConnector)theEObject;
				T result = caseOntologyConnector(ontologyConnector);
				if (result == null) result = caseEntity(ontologyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ECONNECTOR: {
				EConnector eConnector = (EConnector)theEObject;
				T result = caseEConnector(eConnector);
				if (result == null) result = caseOntologyConnector(eConnector);
				if (result == null) result = caseEntity(eConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_PROPERTY: {
				LinkProperty linkProperty = (LinkProperty)theEObject;
				T result = caseLinkProperty(linkProperty);
				if (result == null) result = caseEConnector(linkProperty);
				if (result == null) result = caseOntologyConnector(linkProperty);
				if (result == null) result = caseEntity(linkProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = caseEntity(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.MULTIONTOLOGY_AXIOM: {
				MultiontologyAxiom multiontologyAxiom = (MultiontologyAxiom)theEObject;
				T result = caseMultiontologyAxiom(multiontologyAxiom);
				if (result == null) result = caseAxiom(multiontologyAxiom);
				if (result == null) result = caseEntity(multiontologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_PROPERTY_AXIOM: {
				LinkPropertyAxiom linkPropertyAxiom = (LinkPropertyAxiom)theEObject;
				T result = caseLinkPropertyAxiom(linkPropertyAxiom);
				if (result == null) result = caseMultiontologyAxiom(linkPropertyAxiom);
				if (result == null) result = caseAxiom(linkPropertyAxiom);
				if (result == null) result = caseEntity(linkPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.EQUIVALENT_LINK_PROPERTY: {
				EquivalentLinkProperty equivalentLinkProperty = (EquivalentLinkProperty)theEObject;
				T result = caseEquivalentLinkProperty(equivalentLinkProperty);
				if (result == null) result = caseLinkPropertyAxiom(equivalentLinkProperty);
				if (result == null) result = caseMultiontologyAxiom(equivalentLinkProperty);
				if (result == null) result = caseAxiom(equivalentLinkProperty);
				if (result == null) result = caseEntity(equivalentLinkProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.SUB_LINK_PROPERTY_OF: {
				SubLinkPropertyOf subLinkPropertyOf = (SubLinkPropertyOf)theEObject;
				T result = caseSubLinkPropertyOf(subLinkPropertyOf);
				if (result == null) result = caseLinkPropertyAxiom(subLinkPropertyOf);
				if (result == null) result = caseMultiontologyAxiom(subLinkPropertyOf);
				if (result == null) result = caseAxiom(subLinkPropertyOf);
				if (result == null) result = caseEntity(subLinkPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DISJOINT_LINK_PROPERTY: {
				DisjointLinkProperty disjointLinkProperty = (DisjointLinkProperty)theEObject;
				T result = caseDisjointLinkProperty(disjointLinkProperty);
				if (result == null) result = caseLinkPropertyAxiom(disjointLinkProperty);
				if (result == null) result = caseMultiontologyAxiom(disjointLinkProperty);
				if (result == null) result = caseAxiom(disjointLinkProperty);
				if (result == null) result = caseEntity(disjointLinkProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DOMAIN_LINK_PROPERTY: {
				DomainLinkProperty domainLinkProperty = (DomainLinkProperty)theEObject;
				T result = caseDomainLinkProperty(domainLinkProperty);
				if (result == null) result = caseLinkPropertyAxiom(domainLinkProperty);
				if (result == null) result = caseMultiontologyAxiom(domainLinkProperty);
				if (result == null) result = caseAxiom(domainLinkProperty);
				if (result == null) result = caseEntity(domainLinkProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.RANGE_LINK_PROPERTY_OF: {
				RangeLinkPropertyOf rangeLinkPropertyOf = (RangeLinkPropertyOf)theEObject;
				T result = caseRangeLinkPropertyOf(rangeLinkPropertyOf);
				if (result == null) result = caseLinkPropertyAxiom(rangeLinkPropertyOf);
				if (result == null) result = caseMultiontologyAxiom(rangeLinkPropertyOf);
				if (result == null) result = caseAxiom(rangeLinkPropertyOf);
				if (result == null) result = caseEntity(rangeLinkPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_PROPERTY_EXPRESSION: {
				LinkPropertyExpression linkPropertyExpression = (LinkPropertyExpression)theEObject;
				T result = caseLinkPropertyExpression(linkPropertyExpression);
				if (result == null) result = caseExpression(linkPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_PROPERTY_LIST: {
				LinkPropertyList linkPropertyList = (LinkPropertyList)theEObject;
				T result = caseLinkPropertyList(linkPropertyList);
				if (result == null) result = caseLinkPropertyExpression(linkPropertyList);
				if (result == null) result = caseExpression(linkPropertyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_PROPERTY_INVERSE_OF: {
				LinkPropertyInverseOf linkPropertyInverseOf = (LinkPropertyInverseOf)theEObject;
				T result = caseLinkPropertyInverseOf(linkPropertyInverseOf);
				if (result == null) result = caseLinkPropertyExpression(linkPropertyInverseOf);
				if (result == null) result = caseExpression(linkPropertyInverseOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseEntity(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CLASS: {
				mowl.Class class_ = (mowl.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseEntity(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseEntity(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseEntity(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.NAMED_INDIVIDUAL: {
				NamedIndividual namedIndividual = (NamedIndividual)theEObject;
				T result = caseNamedIndividual(namedIndividual);
				if (result == null) result = caseEntity(namedIndividual);
				if (result == null) result = caseIndividual(namedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ANONYMOUS_INDIVIDUAL: {
				AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
				T result = caseAnonymousIndividual(anonymousIndividual);
				if (result == null) result = caseIndividual(anonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ONTOLOGY_AXIOM: {
				OntologyAxiom ontologyAxiom = (OntologyAxiom)theEObject;
				T result = caseOntologyAxiom(ontologyAxiom);
				if (result == null) result = caseAxiom(ontologyAxiom);
				if (result == null) result = caseEntity(ontologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CLASS_AXIOM: {
				ClassAxiom classAxiom = (ClassAxiom)theEObject;
				T result = caseClassAxiom(classAxiom);
				if (result == null) result = caseOntologyAxiom(classAxiom);
				if (result == null) result = caseAxiom(classAxiom);
				if (result == null) result = caseEntity(classAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DISJOINT_CLASS: {
				DisjointClass disjointClass = (DisjointClass)theEObject;
				T result = caseDisjointClass(disjointClass);
				if (result == null) result = caseClassAxiom(disjointClass);
				if (result == null) result = caseOntologyAxiom(disjointClass);
				if (result == null) result = caseAxiom(disjointClass);
				if (result == null) result = caseEntity(disjointClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DISJOINT_UNION: {
				DisjointUnion disjointUnion = (DisjointUnion)theEObject;
				T result = caseDisjointUnion(disjointUnion);
				if (result == null) result = caseClassAxiom(disjointUnion);
				if (result == null) result = caseOntologyAxiom(disjointUnion);
				if (result == null) result = caseAxiom(disjointUnion);
				if (result == null) result = caseEntity(disjointUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.EQUIVALENT_CLASS: {
				EquivalentClass equivalentClass = (EquivalentClass)theEObject;
				T result = caseEquivalentClass(equivalentClass);
				if (result == null) result = caseClassAxiom(equivalentClass);
				if (result == null) result = caseOntologyAxiom(equivalentClass);
				if (result == null) result = caseAxiom(equivalentClass);
				if (result == null) result = caseEntity(equivalentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.SUB_CLASS_OF: {
				SubClassOf subClassOf = (SubClassOf)theEObject;
				T result = caseSubClassOf(subClassOf);
				if (result == null) result = caseClassAxiom(subClassOf);
				if (result == null) result = caseOntologyAxiom(subClassOf);
				if (result == null) result = caseAxiom(subClassOf);
				if (result == null) result = caseEntity(subClassOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_AXIOM: {
				ObjectPropertyAxiom objectPropertyAxiom = (ObjectPropertyAxiom)theEObject;
				T result = caseObjectPropertyAxiom(objectPropertyAxiom);
				if (result == null) result = caseOntologyAxiom(objectPropertyAxiom);
				if (result == null) result = caseAxiom(objectPropertyAxiom);
				if (result == null) result = caseEntity(objectPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DISJOINT_OBJECT_PROPERTY: {
				DisjointObjectProperty disjointObjectProperty = (DisjointObjectProperty)theEObject;
				T result = caseDisjointObjectProperty(disjointObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(disjointObjectProperty);
				if (result == null) result = caseOntologyAxiom(disjointObjectProperty);
				if (result == null) result = caseAxiom(disjointObjectProperty);
				if (result == null) result = caseEntity(disjointObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.EQUIVALENT_OBJECT_PROPERTY: {
				EquivalentObjectProperty equivalentObjectProperty = (EquivalentObjectProperty)theEObject;
				T result = caseEquivalentObjectProperty(equivalentObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(equivalentObjectProperty);
				if (result == null) result = caseOntologyAxiom(equivalentObjectProperty);
				if (result == null) result = caseAxiom(equivalentObjectProperty);
				if (result == null) result = caseEntity(equivalentObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.SUB_OBJECT_PROPERTY_OF: {
				SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
				T result = caseSubObjectPropertyOf(subObjectPropertyOf);
				if (result == null) result = caseObjectPropertyAxiom(subObjectPropertyOf);
				if (result == null) result = caseOntologyAxiom(subObjectPropertyOf);
				if (result == null) result = caseAxiom(subObjectPropertyOf);
				if (result == null) result = caseEntity(subObjectPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.INVERSE_OBJECT_PROPERTY_AXIOM: {
				InverseObjectPropertyAxiom inverseObjectPropertyAxiom = (InverseObjectPropertyAxiom)theEObject;
				T result = caseInverseObjectPropertyAxiom(inverseObjectPropertyAxiom);
				if (result == null) result = caseObjectPropertyAxiom(inverseObjectPropertyAxiom);
				if (result == null) result = caseOntologyAxiom(inverseObjectPropertyAxiom);
				if (result == null) result = caseAxiom(inverseObjectPropertyAxiom);
				if (result == null) result = caseEntity(inverseObjectPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_DOMAIN: {
				ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
				T result = caseObjectPropertyDomain(objectPropertyDomain);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyDomain);
				if (result == null) result = caseOntologyAxiom(objectPropertyDomain);
				if (result == null) result = caseAxiom(objectPropertyDomain);
				if (result == null) result = caseEntity(objectPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_RANGE: {
				ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
				T result = caseObjectPropertyRange(objectPropertyRange);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyRange);
				if (result == null) result = caseOntologyAxiom(objectPropertyRange);
				if (result == null) result = caseAxiom(objectPropertyRange);
				if (result == null) result = caseEntity(objectPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_AXIOM: {
				DataPropertyAxiom dataPropertyAxiom = (DataPropertyAxiom)theEObject;
				T result = caseDataPropertyAxiom(dataPropertyAxiom);
				if (result == null) result = caseOntologyAxiom(dataPropertyAxiom);
				if (result == null) result = caseAxiom(dataPropertyAxiom);
				if (result == null) result = caseEntity(dataPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_DOMAIN: {
				DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
				T result = caseDataPropertyDomain(dataPropertyDomain);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyDomain);
				if (result == null) result = caseOntologyAxiom(dataPropertyDomain);
				if (result == null) result = caseAxiom(dataPropertyDomain);
				if (result == null) result = caseEntity(dataPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_RANGE: {
				DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
				T result = caseDataPropertyRange(dataPropertyRange);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyRange);
				if (result == null) result = caseOntologyAxiom(dataPropertyRange);
				if (result == null) result = caseAxiom(dataPropertyRange);
				if (result == null) result = caseEntity(dataPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DISJOINT_DATA_PROPERTY: {
				DisjointDataProperty disjointDataProperty = (DisjointDataProperty)theEObject;
				T result = caseDisjointDataProperty(disjointDataProperty);
				if (result == null) result = caseDataPropertyAxiom(disjointDataProperty);
				if (result == null) result = caseOntologyAxiom(disjointDataProperty);
				if (result == null) result = caseAxiom(disjointDataProperty);
				if (result == null) result = caseEntity(disjointDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.EQUIVALENT_DATA_PROPERTY: {
				EquivalentDataProperty equivalentDataProperty = (EquivalentDataProperty)theEObject;
				T result = caseEquivalentDataProperty(equivalentDataProperty);
				if (result == null) result = caseDataPropertyAxiom(equivalentDataProperty);
				if (result == null) result = caseOntologyAxiom(equivalentDataProperty);
				if (result == null) result = caseAxiom(equivalentDataProperty);
				if (result == null) result = caseEntity(equivalentDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.SUB_DATA_PROPERTY_OF: {
				SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
				T result = caseSubDataPropertyOf(subDataPropertyOf);
				if (result == null) result = caseDataPropertyAxiom(subDataPropertyOf);
				if (result == null) result = caseOntologyAxiom(subDataPropertyOf);
				if (result == null) result = caseAxiom(subDataPropertyOf);
				if (result == null) result = caseEntity(subDataPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseOntologyAxiom(assertion);
				if (result == null) result = caseAxiom(assertion);
				if (result == null) result = caseEntity(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CLASS_ASSERTION: {
				ClassAssertion classAssertion = (ClassAssertion)theEObject;
				T result = caseClassAssertion(classAssertion);
				if (result == null) result = caseAssertion(classAssertion);
				if (result == null) result = caseOntologyAxiom(classAssertion);
				if (result == null) result = caseAxiom(classAssertion);
				if (result == null) result = caseEntity(classAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.SAME_INDIVIDUAL: {
				SameIndividual sameIndividual = (SameIndividual)theEObject;
				T result = caseSameIndividual(sameIndividual);
				if (result == null) result = caseAssertion(sameIndividual);
				if (result == null) result = caseOntologyAxiom(sameIndividual);
				if (result == null) result = caseAxiom(sameIndividual);
				if (result == null) result = caseEntity(sameIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DIFFERENT_INDIVIDUAL: {
				DifferentIndividual differentIndividual = (DifferentIndividual)theEObject;
				T result = caseDifferentIndividual(differentIndividual);
				if (result == null) result = caseAssertion(differentIndividual);
				if (result == null) result = caseOntologyAxiom(differentIndividual);
				if (result == null) result = caseAxiom(differentIndividual);
				if (result == null) result = caseEntity(differentIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_ASSERTION: {
				ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
				T result = caseObjectPropertyAssertion(objectPropertyAssertion);
				if (result == null) result = caseAssertion(objectPropertyAssertion);
				if (result == null) result = caseOntologyAxiom(objectPropertyAssertion);
				if (result == null) result = caseAxiom(objectPropertyAssertion);
				if (result == null) result = caseEntity(objectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: {
				NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
				T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseOntologyAxiom(negativeObjectPropertyAssertion);
				if (result == null) result = caseAxiom(negativeObjectPropertyAssertion);
				if (result == null) result = caseEntity(negativeObjectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_ASSERTION: {
				DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
				T result = caseDataPropertyAssertion(dataPropertyAssertion);
				if (result == null) result = caseAssertion(dataPropertyAssertion);
				if (result == null) result = caseOntologyAxiom(dataPropertyAssertion);
				if (result == null) result = caseAxiom(dataPropertyAssertion);
				if (result == null) result = caseEntity(dataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: {
				NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
				T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseOntologyAxiom(negativeDataPropertyAssertion);
				if (result == null) result = caseAxiom(negativeDataPropertyAssertion);
				if (result == null) result = caseEntity(negativeDataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CLASS_EXPRESSION: {
				ClassExpression classExpression = (ClassExpression)theEObject;
				T result = caseClassExpression(classExpression);
				if (result == null) result = caseExpression(classExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CLASS_LIST: {
				ClassList classList = (ClassList)theEObject;
				T result = caseClassList(classList);
				if (result == null) result = caseClassExpression(classList);
				if (result == null) result = caseExpression(classList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_INTERSECTION_OF: {
				ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
				T result = caseObjectIntersectionOf(objectIntersectionOf);
				if (result == null) result = caseClassExpression(objectIntersectionOf);
				if (result == null) result = caseExpression(objectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_UNION_OF: {
				ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
				T result = caseObjectUnionOf(objectUnionOf);
				if (result == null) result = caseClassExpression(objectUnionOf);
				if (result == null) result = caseExpression(objectUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_COMPLEMENT_OF: {
				ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
				T result = caseObjectComplementOf(objectComplementOf);
				if (result == null) result = caseClassExpression(objectComplementOf);
				if (result == null) result = caseExpression(objectComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_ONE_OF: {
				ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
				T result = caseObjectOneOf(objectOneOf);
				if (result == null) result = caseClassExpression(objectOneOf);
				if (result == null) result = caseExpression(objectOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_SOME_VALUES_FROM: {
				ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
				T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
				if (result == null) result = caseClassExpression(objectSomeValuesFrom);
				if (result == null) result = caseExpression(objectSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_ALL_VALUES_FROM: {
				ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
				T result = caseObjectAllValuesFrom(objectAllValuesFrom);
				if (result == null) result = caseClassExpression(objectAllValuesFrom);
				if (result == null) result = caseExpression(objectAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_HAS_VALUE: {
				ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
				T result = caseObjectHasValue(objectHasValue);
				if (result == null) result = caseClassExpression(objectHasValue);
				if (result == null) result = caseExpression(objectHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_MIN_CARDINALITY: {
				ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
				T result = caseObjectMinCardinality(objectMinCardinality);
				if (result == null) result = caseClassExpression(objectMinCardinality);
				if (result == null) result = caseExpression(objectMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_MAX_CARDINALITY: {
				ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
				T result = caseObjectMaxCardinality(objectMaxCardinality);
				if (result == null) result = caseClassExpression(objectMaxCardinality);
				if (result == null) result = caseExpression(objectMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_EXACT_CARDINALITY: {
				ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
				T result = caseObjectExactCardinality(objectExactCardinality);
				if (result == null) result = caseClassExpression(objectExactCardinality);
				if (result == null) result = caseExpression(objectExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_SOME_VALUES_FROM: {
				DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
				T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
				if (result == null) result = caseClassExpression(dataSomeValuesFrom);
				if (result == null) result = caseExpression(dataSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_ALL_VALUES_FROM: {
				DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
				T result = caseDataAllValuesFrom(dataAllValuesFrom);
				if (result == null) result = caseClassExpression(dataAllValuesFrom);
				if (result == null) result = caseExpression(dataAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_HAS_VALUE: {
				DataHasValue dataHasValue = (DataHasValue)theEObject;
				T result = caseDataHasValue(dataHasValue);
				if (result == null) result = caseClassExpression(dataHasValue);
				if (result == null) result = caseExpression(dataHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_MIN_CARDINALITY: {
				DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
				T result = caseDataMinCardinality(dataMinCardinality);
				if (result == null) result = caseClassExpression(dataMinCardinality);
				if (result == null) result = caseExpression(dataMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_MAX_CARDINALITY: {
				DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
				T result = caseDataMaxCardinality(dataMaxCardinality);
				if (result == null) result = caseClassExpression(dataMaxCardinality);
				if (result == null) result = caseExpression(dataMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_EXACT_CARDINALITY: {
				DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
				T result = caseDataExactCardinality(dataExactCardinality);
				if (result == null) result = caseClassExpression(dataExactCardinality);
				if (result == null) result = caseExpression(dataExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ECONNECTION_EXPRESSION: {
				EConnectionExpression eConnectionExpression = (EConnectionExpression)theEObject;
				T result = caseEConnectionExpression(eConnectionExpression);
				if (result == null) result = caseExpression(eConnectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_SOME_VALUES_FROM: {
				LinkSomeValuesFrom linkSomeValuesFrom = (LinkSomeValuesFrom)theEObject;
				T result = caseLinkSomeValuesFrom(linkSomeValuesFrom);
				if (result == null) result = caseEConnectionExpression(linkSomeValuesFrom);
				if (result == null) result = caseExpression(linkSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_ALL_VALUES_FROM: {
				LinkAllValuesFrom linkAllValuesFrom = (LinkAllValuesFrom)theEObject;
				T result = caseLinkAllValuesFrom(linkAllValuesFrom);
				if (result == null) result = caseEConnectionExpression(linkAllValuesFrom);
				if (result == null) result = caseExpression(linkAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_HAS_VALUE: {
				LinkHasValue linkHasValue = (LinkHasValue)theEObject;
				T result = caseLinkHasValue(linkHasValue);
				if (result == null) result = caseEConnectionExpression(linkHasValue);
				if (result == null) result = caseExpression(linkHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_MIN_CARDINALITY: {
				LinkMinCardinality linkMinCardinality = (LinkMinCardinality)theEObject;
				T result = caseLinkMinCardinality(linkMinCardinality);
				if (result == null) result = caseEConnectionExpression(linkMinCardinality);
				if (result == null) result = caseExpression(linkMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_MAX_CARDINALITY: {
				LinkMaxCardinality linkMaxCardinality = (LinkMaxCardinality)theEObject;
				T result = caseLinkMaxCardinality(linkMaxCardinality);
				if (result == null) result = caseEConnectionExpression(linkMaxCardinality);
				if (result == null) result = caseExpression(linkMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.LINK_EXACT_CARDINALITY: {
				LinkExactCardinality linkExactCardinality = (LinkExactCardinality)theEObject;
				T result = caseLinkExactCardinality(linkExactCardinality);
				if (result == null) result = caseEConnectionExpression(linkExactCardinality);
				if (result == null) result = caseExpression(linkExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_EXPRESSION: {
				ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
				T result = caseObjectPropertyExpression(objectPropertyExpression);
				if (result == null) result = caseExpression(objectPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.OBJECT_PROPERTY_LIST: {
				ObjectPropertyList objectPropertyList = (ObjectPropertyList)theEObject;
				T result = caseObjectPropertyList(objectPropertyList);
				if (result == null) result = caseObjectPropertyExpression(objectPropertyList);
				if (result == null) result = caseExpression(objectPropertyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.INVERSE_OBJECT_PROPERTY: {
				InverseObjectProperty inverseObjectProperty = (InverseObjectProperty)theEObject;
				T result = caseInverseObjectProperty(inverseObjectProperty);
				if (result == null) result = caseObjectPropertyExpression(inverseObjectProperty);
				if (result == null) result = caseExpression(inverseObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_EXPRESSION: {
				DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
				T result = caseDataPropertyExpression(dataPropertyExpression);
				if (result == null) result = caseExpression(dataPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.DATA_PROPERTY_LIST: {
				DataPropertyList dataPropertyList = (DataPropertyList)theEObject;
				T result = caseDataPropertyList(dataPropertyList);
				if (result == null) result = caseDataPropertyExpression(dataPropertyList);
				if (result == null) result = caseExpression(dataPropertyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CONSTANT_ANNOTATION: {
				ConstantAnnotation constantAnnotation = (ConstantAnnotation)theEObject;
				T result = caseConstantAnnotation(constantAnnotation);
				if (result == null) result = caseAnnotation(constantAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.ANNOTATION_BY_ENTITY: {
				AnnotationByEntity annotationByEntity = (AnnotationByEntity)theEObject;
				T result = caseAnnotationByEntity(annotationByEntity);
				if (result == null) result = caseAnnotation(annotationByEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mowlPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiontology(Multiontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyConnector(OntologyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EConnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EConnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEConnector(EConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkProperty(LinkProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiontology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiontology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiontologyAxiom(MultiontologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPropertyAxiom(LinkPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Link Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentLinkProperty(EquivalentLinkProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Link Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLinkPropertyOf(SubLinkPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Link Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointLinkProperty(DisjointLinkProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Link Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainLinkProperty(DomainLinkProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Link Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Link Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeLinkPropertyOf(RangeLinkPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPropertyExpression(LinkPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPropertyList(LinkPropertyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property Inverse Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property Inverse Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPropertyInverseOf(LinkPropertyInverseOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(mowl.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIndividual(NamedIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIndividual(AnonymousIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyAxiom(OntologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAxiom(ClassAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointClass(DisjointClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointUnion(DisjointUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentClass(EquivalentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubClassOf(SubClassOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointObjectProperty(DisjointObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentObjectProperty(EquivalentObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubObjectPropertyOf(SubObjectPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Object Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Object Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseObjectPropertyAxiom(InverseObjectPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyDomain(ObjectPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyRange(ObjectPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAxiom(DataPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyDomain(DataPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyRange(DataPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointDataProperty(DisjointDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentDataProperty(EquivalentDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDataPropertyOf(SubDataPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAssertion(ClassAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameIndividual(SameIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentIndividual(DifferentIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAssertion(DataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExpression(ClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassList(ClassList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIntersectionOf(ObjectIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnionOf(ObjectUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComplementOf(ObjectComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOneOf(ObjectOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasValue(ObjectHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMinCardinality(ObjectMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMaxCardinality(ObjectMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExactCardinality(ObjectExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSomeValuesFrom(DataSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAllValuesFrom(DataAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataHasValue(DataHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMinCardinality(DataMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMaxCardinality(DataMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExactCardinality(DataExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EConnection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EConnection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEConnectionExpression(EConnectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkSomeValuesFrom(LinkSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAllValuesFrom(LinkAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkHasValue(LinkHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkMinCardinality(LinkMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkMaxCardinality(LinkMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkExactCardinality(LinkExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyExpression(ObjectPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyList(ObjectPropertyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseObjectProperty(InverseObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyExpression(DataPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyList(DataPropertyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantAnnotation(ConstantAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation By Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation By Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationByEntity(AnnotationByEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //mowlSwitch
