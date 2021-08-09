/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl#getProtocolinstance <em>Protocolinstance</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ProtocolImpl#getSequenceflow <em>Sequenceflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolImpl extends NamedElementImpl implements Protocol {
	/**
	 * The cached value of the '{@link #getProtocolinstance() <em>Protocolinstance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolInstance> protocolinstance;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getSequenceflow() <em>Sequenceflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceflow()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> sequenceflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionOrientedArchitecturePackage.Literals.PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this,
					InteractionOrientedArchitecturePackage.PROTOCOL__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this,
					InteractionOrientedArchitecturePackage.PROTOCOL__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getSequenceflow() {
		if (sequenceflow == null) {
			sequenceflow = new EObjectContainmentEList<SequenceFlow>(SequenceFlow.class, this,
					InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW);
		}
		return sequenceflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtocolInstance> getProtocolinstance() {
		if (protocolinstance == null) {
			protocolinstance = new EObjectWithInverseResolvingEList<ProtocolInstance>(ProtocolInstance.class, this,
					InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE,
					InteractionOrientedArchitecturePackage.PROTOCOL_INSTANCE__PROTOCOL);
		}
		return protocolinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProtocolinstance()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			return ((InternalEList<?>) getProtocolinstance()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
			return ((InternalEList<?>) getRole()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
			return ((InternalEList<?>) getSequenceflow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			return getProtocolinstance();
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
			return getRole();
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
			return getNode();
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
			return getSequenceflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			getProtocolinstance().clear();
			getProtocolinstance().addAll((Collection<? extends ProtocolInstance>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
			getSequenceflow().clear();
			getSequenceflow().addAll((Collection<? extends SequenceFlow>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			getProtocolinstance().clear();
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
			getRole().clear();
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
			getNode().clear();
			return;
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
			getSequenceflow().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PROTOCOL__PROTOCOLINSTANCE:
			return protocolinstance != null && !protocolinstance.isEmpty();
		case InteractionOrientedArchitecturePackage.PROTOCOL__ROLE:
			return role != null && !role.isEmpty();
		case InteractionOrientedArchitecturePackage.PROTOCOL__NODE:
			return node != null && !node.isEmpty();
		case InteractionOrientedArchitecturePackage.PROTOCOL__SEQUENCEFLOW:
			return sequenceflow != null && !sequenceflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolImpl
