/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.util.InteractionOrientedArchitectureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionOrientedArchitectureItemProviderAdapterFactory
		extends InteractionOrientedArchitectureAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOrientedArchitectureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOrientedArchitectureItemProvider interactionOrientedArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionOrientedArchitectureAdapter() {
		if (interactionOrientedArchitectureItemProvider == null) {
			interactionOrientedArchitectureItemProvider = new InteractionOrientedArchitectureItemProvider(this);
		}

		return interactionOrientedArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionModelItemProvider interactionModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionModelAdapter() {
		if (interactionModelItemProvider == null) {
			interactionModelItemProvider = new InteractionModelItemProvider(this);
		}

		return interactionModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolInstanceItemProvider protocolInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtocolInstanceAdapter() {
		if (protocolInstanceItemProvider == null) {
			protocolInstanceItemProvider = new ProtocolInstanceItemProvider(this);
		}

		return protocolInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolItemProvider protocolItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtocolAdapter() {
		if (protocolItemProvider == null) {
			protocolItemProvider = new ProtocolItemProvider(this);
		}

		return protocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.AndGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndGatewayItemProvider andGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.AndGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndGatewayAdapter() {
		if (andGatewayItemProvider == null) {
			andGatewayItemProvider = new AndGatewayItemProvider(this);
		}

		return andGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.XorGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorGatewayItemProvider xorGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.XorGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXorGatewayAdapter() {
		if (xorGatewayItemProvider == null) {
			xorGatewayItemProvider = new XorGatewayItemProvider(this);
		}

		return xorGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Start} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartItemProvider startItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this);
		}

		return startItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.End} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndItemProvider endItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.End}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndAdapter() {
		if (endItemProvider == null) {
			endItemProvider = new EndItemProvider(this);
		}

		return endItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateItemProvider intermediateItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntermediateAdapter() {
		if (intermediateItemProvider == null) {
			intermediateItemProvider = new IntermediateItemProvider(this);
		}

		return intermediateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowItemProvider sequenceFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceFlowAdapter() {
		if (sequenceFlowItemProvider == null) {
			sequenceFlowItemProvider = new SequenceFlowItemProvider(this);
		}

		return sequenceFlowItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (interactionOrientedArchitectureItemProvider != null)
			interactionOrientedArchitectureItemProvider.dispose();
		if (interactionModelItemProvider != null)
			interactionModelItemProvider.dispose();
		if (containerItemProvider != null)
			containerItemProvider.dispose();
		if (functionItemProvider != null)
			functionItemProvider.dispose();
		if (participantItemProvider != null)
			participantItemProvider.dispose();
		if (roleItemProvider != null)
			roleItemProvider.dispose();
		if (protocolInstanceItemProvider != null)
			protocolInstanceItemProvider.dispose();
		if (protocolItemProvider != null)
			protocolItemProvider.dispose();
		if (messageItemProvider != null)
			messageItemProvider.dispose();
		if (andGatewayItemProvider != null)
			andGatewayItemProvider.dispose();
		if (xorGatewayItemProvider != null)
			xorGatewayItemProvider.dispose();
		if (startItemProvider != null)
			startItemProvider.dispose();
		if (endItemProvider != null)
			endItemProvider.dispose();
		if (intermediateItemProvider != null)
			intermediateItemProvider.dispose();
		if (sequenceFlowItemProvider != null)
			sequenceFlowItemProvider.dispose();
	}

}
