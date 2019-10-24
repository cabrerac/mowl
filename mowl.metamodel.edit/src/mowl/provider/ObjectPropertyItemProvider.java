/**
 */
package mowl.provider;


import java.util.Collection;
import java.util.List;

import mowl.ObjectProperty;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link mowl.ObjectProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectPropertyItemProvider
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
	public ObjectPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addObjectPropertyAxiomsPropertyDescriptor(object);
			addFunctionalObjectPropertyPropertyDescriptor(object);
			addInverseFunctionalObjectPropertyPropertyDescriptor(object);
			addTransitiveObjectPropertyPropertyDescriptor(object);
			addSymmetricObjectPropertyPropertyDescriptor(object);
			addAsymmetricObjectPropertyPropertyDescriptor(object);
			addReflexiveObjectPropertyPropertyDescriptor(object);
			addIrreflexiveObjectPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Object Property Axioms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyAxiomsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_objectPropertyAxioms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_objectPropertyAxioms_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__OBJECT_PROPERTY_AXIOMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functional Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_functionalObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_functionalObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse Functional Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverseFunctionalObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_inverseFunctionalObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_inverseFunctionalObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_transitiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_transitiveObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symmetric Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymmetricObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_symmetricObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_symmetricObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asymmetric Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsymmetricObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_asymmetricObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_asymmetricObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reflexive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReflexiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_reflexiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_reflexiveObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Irreflexive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIrreflexiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectProperty_irreflexiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectProperty_irreflexiveObjectProperty_feature", "_UI_ObjectProperty_type"),
				 mowlPackage.Literals.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ObjectProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectProperty)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectProperty_type") :
			getString("_UI_ObjectProperty_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectProperty.class)) {
			case mowlPackage.OBJECT_PROPERTY__FUNCTIONAL_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__TRANSITIVE_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__SYMMETRIC_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__ASYMMETRIC_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__REFLEXIVE_OBJECT_PROPERTY:
			case mowlPackage.OBJECT_PROPERTY__IRREFLEXIVE_OBJECT_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
