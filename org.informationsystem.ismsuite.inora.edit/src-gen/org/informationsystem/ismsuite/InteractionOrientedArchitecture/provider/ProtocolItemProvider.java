/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitectureFactory;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol;

/**
 * This is the item provider adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolItemProvider(AdapterFactory adapterFactory) {
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

			addProtocolinstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protocolinstance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolinstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Protocol_protocolinstance_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Protocol_protocolinstance_feature",
								"_UI_Protocol_type"),
						InteractionOrientedArchitecturePackage.Literals.PROTOCOL__PROTOCOLINSTANCE, true, false, true,
						null, null, null));
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
			childrenFeatures.add(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__ROLE);
			childrenFeatures.add(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE);
			childrenFeatures.add(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__SEQUENCEFLOW);
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
	 * This returns Protocol.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Protocol"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Protocol) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_Protocol_type")
				: getString("_UI_Protocol_type") + " " + label;
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

		switch (notification.getFeatureID(Protocol.class)) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
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

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__ROLE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createRole()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createAndGateway()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createXorGateway()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createStart()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__NODE,
				InteractionOrientedArchitectureFactory.eINSTANCE.createIntermediate()));

		newChildDescriptors
				.add(createChildParameter(InteractionOrientedArchitecturePackage.Literals.PROTOCOL__SEQUENCEFLOW,
						InteractionOrientedArchitectureFactory.eINSTANCE.createSequenceFlow()));
	}

}
