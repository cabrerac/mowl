/**
 */
package mowl.provider;


import java.util.Collection;
import java.util.List;

import mowl.DisjointClass;
import mowl.mowlFactory;
import mowl.mowlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mowl.DisjointClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DisjointClassItemProvider
	extends ClassAxiomItemProvider
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
	public DisjointClassItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS);
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
	 * This returns DisjointClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DisjointClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DisjointClass)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DisjointClass_type") :
			getString("_UI_DisjointClass_type") + " " + label;
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

		switch (notification.getFeatureID(DisjointClass.class)) {
			case mowlPackage.DISJOINT_CLASS__EXPRESSIONS:
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
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkPropertyList()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkPropertyInverseOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createClassList()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createLinkExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createObjectPropertyList()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createInverseObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(mowlPackage.Literals.DISJOINT_CLASS__EXPRESSIONS,
				 mowlFactory.eINSTANCE.createDataPropertyList()));
	}

}
