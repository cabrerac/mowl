/**
 */
package mowl.provider;


import java.util.Collection;
import java.util.List;

import mowl.Multiontology;
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
 * This is the item provider adapter for a {@link mowl.Multiontology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiontologyItemProvider
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
	public MultiontologyItemProvider(AdapterFactory adapterFactory) {
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

			addPrefixIRIPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Multiontology_prefixIRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Multiontology_prefixIRI_feature", "_UI_Multiontology_type"),
				 mowlPackage.Literals.MULTIONTOLOGY__PREFIX_IRI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Multiontology_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Multiontology_version_feature", "_UI_Multiontology_type"),
				 mowlPackage.Literals.MULTIONTOLOGY__VERSION,
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
			childrenFeatures.add(mowlPackage.Literals.MULTIONTOLOGY__ONTOLOGIES);
			childrenFeatures.add(mowlPackage.Literals.MULTIONTOLOGY__ONTOLOGY_CONNECTORS);
			childrenFeatures.add(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS);
			childrenFeatures.add(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS);
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
	 * This returns Multiontology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Multiontology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Multiontology)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Multiontology_type") :
			getString("_UI_Multiontology_type") + " " + label;
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

		switch (notification.getFeatureID(Multiontology.class)) {
			case mowlPackage.MULTIONTOLOGY__PREFIX_IRI:
			case mowlPackage.MULTIONTOLOGY__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case mowlPackage.MULTIONTOLOGY__ONTOLOGIES:
			case mowlPackage.MULTIONTOLOGY__ONTOLOGY_CONNECTORS:
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS:
			case mowlPackage.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS:
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
				(mowlPackage.Literals.MULTIONTOLOGY__ONTOLOGIES,
				 mowlFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__ONTOLOGY_CONNECTORS,
				 mowlFactory.eINSTANCE.createLinkProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createEquivalentLinkProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createSubLinkPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDisjointLinkProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createDomainLinkProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_AXIOMS,
				 mowlFactory.eINSTANCE.createRangeLinkPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS,
				 mowlFactory.eINSTANCE.createConstantAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.MULTIONTOLOGY__MULTIONTOLOGY_ANNOTATIONS,
				 mowlFactory.eINSTANCE.createAnnotationByEntity()));
	}

}
