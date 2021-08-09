/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionOrientedArchitectureFactoryImpl extends EFactoryImpl
		implements InteractionOrientedArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOrientedArchitectureFactory init() {
		try {
			InteractionOrientedArchitectureFactory theInteractionOrientedArchitectureFactory = (InteractionOrientedArchitectureFactory) EPackage.Registry.INSTANCE
					.getEFactory(InteractionOrientedArchitecturePackage.eNS_URI);
			if (theInteractionOrientedArchitectureFactory != null) {
				return theInteractionOrientedArchitectureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionOrientedArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOrientedArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE:
			return createInteractionOrientedArchitecture();
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL:
			return createInteractionModel();
		case InteractionOrientedArchitecturePackage.CONTAINER:
			return createContainer();
		case InteractionOrientedArchitecturePackage.FUNCTION:
			return createFunction();
		case InteractionOrientedArchitecturePackage.PARTICIPANT:
			return createParticipant();
		case InteractionOrientedArchitecturePackage.ROLE:
			return createRole();
		case InteractionOrientedArchitecturePackage.PROTOCOL_INSTANCE:
			return createProtocolInstance();
		case InteractionOrientedArchitecturePackage.PROTOCOL:
			return createProtocol();
		case InteractionOrientedArchitecturePackage.MESSAGE:
			return createMessage();
		case InteractionOrientedArchitecturePackage.AND_GATEWAY:
			return createAndGateway();
		case InteractionOrientedArchitecturePackage.XOR_GATEWAY:
			return createXorGateway();
		case InteractionOrientedArchitecturePackage.START:
			return createStart();
		case InteractionOrientedArchitecturePackage.END:
			return createEnd();
		case InteractionOrientedArchitecturePackage.INTERMEDIATE:
			return createIntermediate();
		case InteractionOrientedArchitecturePackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionOrientedArchitecture createInteractionOrientedArchitecture() {
		InteractionOrientedArchitectureImpl interactionOrientedArchitecture = new InteractionOrientedArchitectureImpl();
		return interactionOrientedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionModel createInteractionModel() {
		InteractionModelImpl interactionModel = new InteractionModelImpl();
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolInstance createProtocolInstance() {
		ProtocolInstanceImpl protocolInstance = new ProtocolInstanceImpl();
		return protocolInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndGateway createAndGateway() {
		AndGatewayImpl andGateway = new AndGatewayImpl();
		return andGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XorGateway createXorGateway() {
		XorGatewayImpl xorGateway = new XorGatewayImpl();
		return xorGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intermediate createIntermediate() {
		IntermediateImpl intermediate = new IntermediateImpl();
		return intermediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionOrientedArchitecturePackage getInteractionOrientedArchitecturePackage() {
		return (InteractionOrientedArchitecturePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionOrientedArchitecturePackage getPackage() {
		return InteractionOrientedArchitecturePackage.eINSTANCE;
	}

} //InteractionOrientedArchitectureFactoryImpl
