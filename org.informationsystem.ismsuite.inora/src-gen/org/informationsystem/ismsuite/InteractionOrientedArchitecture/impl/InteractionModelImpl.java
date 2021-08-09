/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl#getProtocolinstance <em>Protocolinstance</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionModelImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionModelImpl extends MinimalEObjectImpl.Container implements InteractionModel {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container> container;

	/**
	 * The cached value of the '{@link #getProtocolinstance() <em>Protocolinstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolInstance> protocolinstance;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionOrientedArchitecturePackage.Literals.INTERACTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container>(
					org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container.class, this,
					InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtocolInstance> getProtocolinstance() {
		if (protocolinstance == null) {
			protocolinstance = new EObjectContainmentEList<ProtocolInstance>(ProtocolInstance.class, this,
					InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE);
		}
		return protocolinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant>(Participant.class, this,
					InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE:
			return ((InternalEList<?>) getProtocolinstance()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT:
			return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
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
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER:
			return getContainer();
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE:
			return getProtocolinstance();
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT:
			return getParticipant();
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
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER:
			getContainer().clear();
			getContainer().addAll(
					(Collection<? extends org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE:
			getProtocolinstance().clear();
			getProtocolinstance().addAll((Collection<? extends ProtocolInstance>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT:
			getParticipant().clear();
			getParticipant().addAll((Collection<? extends Participant>) newValue);
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
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER:
			getContainer().clear();
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE:
			getProtocolinstance().clear();
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT:
			getParticipant().clear();
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
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__CONTAINER:
			return container != null && !container.isEmpty();
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PROTOCOLINSTANCE:
			return protocolinstance != null && !protocolinstance.isEmpty();
		case InteractionOrientedArchitecturePackage.INTERACTION_MODEL__PARTICIPANT:
			return participant != null && !participant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionModelImpl
