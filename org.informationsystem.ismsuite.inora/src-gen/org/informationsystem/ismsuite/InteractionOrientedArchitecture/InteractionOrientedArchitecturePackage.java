/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionOrientedArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InteractionOrientedArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/InteractionOrientedArchitecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InteractionOrientedArchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionOrientedArchitecturePackage eINSTANCE = org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl <em>Interaction Oriented Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getInteractionOrientedArchitecture()
	 * @generated
	 */
	int INTERACTION_ORIENTED_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Interactionmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL = 1;

	/**
	 * The number of structural features of the '<em>Interaction Oriented Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ORIENTED_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interaction Oriented Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ORIENTED_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NamedElementImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl <em>Interaction Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getInteractionModel()
	 * @generated
	 */
	int INTERACTION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Protocolinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__PROTOCOLINSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__PARTICIPANT = 2;

	/**
	 * The number of structural features of the '<em>Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.FunctionImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARTICIPANT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEPENDENCY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 5;

	/**
	 * The feature id for the '<em><b>Instantiating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INSTANTIATING = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Protocolinstance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PROTOCOLINSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.RoleImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARTICIPANT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolInstanceImpl <em>Protocol Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolInstanceImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getProtocolInstance()
	 * @generated
	 */
	int PROTOCOL_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANCE__PARTICIPANT = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANCE__PROTOCOL = 1;

	/**
	 * The number of structural features of the '<em>Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocolinstance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROTOCOLINSTANCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NODE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequenceflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__SEQUENCEFLOW = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NodeImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.MessageImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVER = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.GatewayImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.AndGatewayImpl <em>And Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.AndGatewayImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getAndGateway()
	 * @generated
	 */
	int AND_GATEWAY = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The number of structural features of the '<em>And Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.XorGatewayImpl <em>Xor Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.XorGatewayImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getXorGateway()
	 * @generated
	 */
	int XOR_GATEWAY = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The number of structural features of the '<em>Xor Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EventImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING = NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.StartImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getStart()
	 * @generated
	 */
	int START = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LABEL = EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__INCOMING = EVENT__INCOMING;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EndImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getEnd()
	 * @generated
	 */
	int END = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LABEL = EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INCOMING = EVENT__INCOMING;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.IntermediateImpl <em>Intermediate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.IntermediateImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getIntermediate()
	 * @generated
	 */
	int INTERMEDIATE = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__LABEL = EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__PROTOCOL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__FUNCTION = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermediate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intermediate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.SequenceFlowImpl
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__FROM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture <em>Interaction Oriented Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Oriented Architecture</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture
	 * @generated
	 */
	EClass getInteractionOrientedArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getProtocol()
	 * @see #getInteractionOrientedArchitecture()
	 * @generated
	 */
	EReference getInteractionOrientedArchitecture_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getInteractionmodel <em>Interactionmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interactionmodel</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getInteractionmodel()
	 * @see #getInteractionOrientedArchitecture()
	 * @generated
	 */
	EReference getInteractionOrientedArchitecture_Interactionmodel();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement#getLabel()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Model</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel
	 * @generated
	 */
	EClass getInteractionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getContainer()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getProtocolinstance <em>Protocolinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocolinstance</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getProtocolinstance()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_Protocolinstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel#getParticipant()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_Participant();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getContainer()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getFunction()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Function();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getParticipant()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Participant();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getDependency()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Dependency();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#isInstantiating <em>Instantiating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiating</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#isInstantiating()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Instantiating();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getFunction()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Function();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance <em>Protocolinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocolinstance</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Protocolinstance();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getRole()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Role();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role#getParticipant()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Participant();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance <em>Protocol Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Instance</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance
	 * @generated
	 */
	EClass getProtocolInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getParticipant()
	 * @see #getProtocolInstance()
	 * @generated
	 */
	EReference getProtocolInstance_Participant();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getProtocol()
	 * @see #getProtocolInstance()
	 * @generated
	 */
	EReference getProtocolInstance_Protocol();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getRole()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getNode()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getSequenceflow <em>Sequenceflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequenceflow</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getSequenceflow()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Sequenceflow();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message#getSender()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Message#getReceiver()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Receiver();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.AndGateway <em>And Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gateway</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.AndGateway
	 * @generated
	 */
	EClass getAndGateway();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.XorGateway <em>Xor Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Gateway</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.XorGateway
	 * @generated
	 */
	EClass getXorGateway();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate <em>Intermediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate
	 * @generated
	 */
	EClass getIntermediate();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate#getProtocol()
	 * @see #getIntermediate()
	 * @generated
	 */
	EReference getIntermediate_Protocol();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Intermediate#getFunction()
	 * @see #getIntermediate()
	 * @generated
	 */
	EReference getIntermediate_Function();

	/**
	 * Returns the meta object for class '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getFrom()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_From();

	/**
	 * Returns the meta object for the reference '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getTo()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_To();

	/**
	 * Returns the meta object for the reference list '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getProtocolinstance <em>Protocolinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protocolinstance</em>'.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getProtocolinstance()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Protocolinstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionOrientedArchitectureFactory getInteractionOrientedArchitectureFactory();

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
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl <em>Interaction Oriented Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getInteractionOrientedArchitecture()
		 * @generated
		 */
		EClass INTERACTION_ORIENTED_ARCHITECTURE = eINSTANCE.getInteractionOrientedArchitecture();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL = eINSTANCE
				.getInteractionOrientedArchitecture_Protocol();

		/**
		 * The meta object literal for the '<em><b>Interactionmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL = eINSTANCE
				.getInteractionOrientedArchitecture_Interactionmodel();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NamedElementImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__LABEL = eINSTANCE.getNamedElement_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl <em>Interaction Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getInteractionModel()
		 * @generated
		 */
		EClass INTERACTION_MODEL = eINSTANCE.getInteractionModel();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__CONTAINER = eINSTANCE.getInteractionModel_Container();

		/**
		 * The meta object literal for the '<em><b>Protocolinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__PROTOCOLINSTANCE = eINSTANCE.getInteractionModel_Protocolinstance();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__PARTICIPANT = eINSTANCE.getInteractionModel_Participant();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINER = eINSTANCE.getContainer_Container();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__FUNCTION = eINSTANCE.getContainer_Function();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.FunctionImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARTICIPANT = eINSTANCE.getFunction_Participant();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DEPENDENCY = eINSTANCE.getFunction_Dependency();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Instantiating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__INSTANTIATING = eINSTANCE.getParticipant_Instantiating();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__FUNCTION = eINSTANCE.getParticipant_Function();

		/**
		 * The meta object literal for the '<em><b>Protocolinstance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PROTOCOLINSTANCE = eINSTANCE.getParticipant_Protocolinstance();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__ROLE = eINSTANCE.getParticipant_Role();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.RoleImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARTICIPANT = eINSTANCE.getRole_Participant();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolInstanceImpl <em>Protocol Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolInstanceImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getProtocolInstance()
		 * @generated
		 */
		EClass PROTOCOL_INSTANCE = eINSTANCE.getProtocolInstance();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_INSTANCE__PARTICIPANT = eINSTANCE.getProtocolInstance_Participant();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_INSTANCE__PROTOCOL = eINSTANCE.getProtocolInstance_Protocol();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__ROLE = eINSTANCE.getProtocol_Role();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__NODE = eINSTANCE.getProtocol_Node();

		/**
		 * The meta object literal for the '<em><b>Sequenceflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__SEQUENCEFLOW = eINSTANCE.getProtocol_Sequenceflow();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.NodeImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.MessageImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVER = eINSTANCE.getMessage_Receiver();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.GatewayImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.AndGatewayImpl <em>And Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.AndGatewayImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getAndGateway()
		 * @generated
		 */
		EClass AND_GATEWAY = eINSTANCE.getAndGateway();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.XorGatewayImpl <em>Xor Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.XorGatewayImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getXorGateway()
		 * @generated
		 */
		EClass XOR_GATEWAY = eINSTANCE.getXorGateway();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EventImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.StartImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.EndImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.IntermediateImpl <em>Intermediate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.IntermediateImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getIntermediate()
		 * @generated
		 */
		EClass INTERMEDIATE = eINSTANCE.getIntermediate();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE__PROTOCOL = eINSTANCE.getIntermediate_Protocol();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE__FUNCTION = eINSTANCE.getIntermediate_Function();

		/**
		 * The meta object literal for the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.SequenceFlowImpl
		 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitecturePackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__FROM = eINSTANCE.getSequenceFlow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TO = eINSTANCE.getSequenceFlow_To();

		/**
		 * The meta object literal for the '<em><b>Protocolinstance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__PROTOCOLINSTANCE = eINSTANCE.getProtocol_Protocolinstance();

	}

} //InteractionOrientedArchitecturePackage
