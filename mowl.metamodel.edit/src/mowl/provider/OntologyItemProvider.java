/**
 */
package mowl.provider;


import java.util.Collection;
import java.util.List;

import mowl.Ontology;
import mowl.mowlFactory;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mowl.Ontology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyItemProvider
	extends EntityItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_version_feature", "_UI_Ontology_type"),
				 mowlPackage.Literals.ONTOLOGY__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__CLASSES);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__OBJECTS_PROPERTY);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__DATA_PROPERTY);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__INDIVIDUALS);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__LITERALS);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS);
			childrenFeatures.add(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_ANNOTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Ontology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ontology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ontology)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Ontology_type") :
			getString("_UI_Ontology_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Ontology.class)) {
			case mowlPackage.ONTOLOGY__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case mowlPackage.ONTOLOGY__CLASSES:
			case mowlPackage.ONTOLOGY__OBJECTS_PROPERTY:
			case mowlPackage.ONTOLOGY__DATA_PROPERTY:
			case mowlPackage.ONTOLOGY__INDIVIDUALS:
			case mowlPackage.ONTOLOGY__LITERALS:
			case mowlPackage.ONTOLOGY__ONTOLOGY_AXIOMS:
			case mowlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__CLASSES,
				 mowlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__OBJECTS_PROPERTY,
				 mowlFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__DATA_PROPERTY,
				 mowlFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__INDIVIDUALS,
				 mowlFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__INDIVIDUALS,
				 mowlFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__LITERALS,
				 mowlFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDisjointClass()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDisjointUnion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createEquivalentClass()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createSubClassOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDisjointObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createEquivalentObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createSubObjectPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createInverseObjectPropertyAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createObjectPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createObjectPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDataPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDataPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDisjointDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createEquivalentDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createSubDataPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createClassAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createSameIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDifferentIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createNegativeObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createNegativeDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_ANNOTATIONS,
				 mowlFactory.eINSTANCE.createConstantAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.ONTOLOGY__ONTOLOGY_ANNOTATIONS,
				 mowlFactory.eINSTANCE.createAnnotationByEntity()));
	}

}
