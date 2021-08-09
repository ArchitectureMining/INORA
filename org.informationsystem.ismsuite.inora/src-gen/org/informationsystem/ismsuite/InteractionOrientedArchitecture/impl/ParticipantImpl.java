/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl#isInstantiating <em>Instantiating</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl#getProtocolinstance <em>Protocolinstance</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ParticipantImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The default value of the '{@link #isInstantiating() <em>Instantiating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstantiating() <em>Instantiating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiating()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiating = INSTANTIATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The cached value of the '{@link #getProtocolinstance() <em>Protocolinstance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolinstance()
	 * @generated
	 * @ordered
	 */
	protected ProtocolInstance protocolinstance;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionOrientedArchitecturePackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstantiating() {
		return instantiating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiating(boolean newInstantiating) {
		boolean oldInstantiating = instantiating;
		instantiating = newInstantiating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__INSTANTIATING, oldInstantiating,
					instantiating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (Function) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION, oldFunction, newFunction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject) function).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.FUNCTION__PARTICIPANT, Function.class, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject) newFunction).eInverseAdd(this,
						InteractionOrientedArchitecturePackage.FUNCTION__PARTICIPANT, Function.class, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolInstance getProtocolinstance() {
		if (protocolinstance != null && protocolinstance.eIsProxy()) {
			InternalEObject oldProtocolinstance = (InternalEObject) protocolinstance;
			protocolinstance = (ProtocolInstance) eResolveProxy(oldProtocolinstance);
			if (protocolinstance != oldProtocolinstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE, oldProtocolinstance,
							protocolinstance));
			}
		}
		return protocolinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolInstance basicGetProtocolinstance() {
		return protocolinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolinstance(ProtocolInstance newProtocolinstance, NotificationChain msgs) {
		ProtocolInstance oldProtocolinstance = protocolinstance;
		protocolinstance = newProtocolinstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE, oldProtocolinstance,
					newProtocolinstance);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolinstance(ProtocolInstance newProtocolinstance) {
		if (newProtocolinstance != protocolinstance) {
			NotificationChain msgs = null;
			if (protocolinstance != null)
				msgs = ((InternalEObject) protocolinstance).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.PROTOCOL_INSTANCE__PARTICIPANT, ProtocolInstance.class,
						msgs);
			if (newProtocolinstance != null)
				msgs = ((InternalEObject) newProtocolinstance).eInverseAdd(this,
						InteractionOrientedArchitecturePackage.PROTOCOL_INSTANCE__PARTICIPANT, ProtocolInstance.class,
						msgs);
			msgs = basicSetProtocolinstance(newProtocolinstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE, newProtocolinstance,
					newProtocolinstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (Role) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE, oldRole, newRole);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject) role).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.ROLE__PARTICIPANT, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject) newRole).eInverseAdd(this,
						InteractionOrientedArchitecturePackage.ROLE__PARTICIPANT, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			if (function != null)
				msgs = ((InternalEObject) function).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.FUNCTION__PARTICIPANT, Function.class, msgs);
			return basicSetFunction((Function) otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			if (protocolinstance != null)
				msgs = ((InternalEObject) protocolinstance).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.PROTOCOL_INSTANCE__PARTICIPANT, ProtocolInstance.class,
						msgs);
			return basicSetProtocolinstance((ProtocolInstance) otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			if (role != null)
				msgs = ((InternalEObject) role).eInverseRemove(this,
						InteractionOrientedArchitecturePackage.ROLE__PARTICIPANT, Role.class, msgs);
			return basicSetRole((Role) otherEnd, msgs);
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
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			return basicSetFunction(null, msgs);
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			return basicSetProtocolinstance(null, msgs);
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			return basicSetRole(null, msgs);
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
		case InteractionOrientedArchitecturePackage.PARTICIPANT__INSTANTIATING:
			return isInstantiating();
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			if (resolve)
				return getProtocolinstance();
			return basicGetProtocolinstance();
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			if (resolve)
				return getRole();
			return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.PARTICIPANT__INSTANTIATING:
			setInstantiating((Boolean) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			setFunction((Function) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			setProtocolinstance((ProtocolInstance) newValue);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			setRole((Role) newValue);
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
		case InteractionOrientedArchitecturePackage.PARTICIPANT__INSTANTIATING:
			setInstantiating(INSTANTIATING_EDEFAULT);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			setFunction((Function) null);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			setProtocolinstance((ProtocolInstance) null);
			return;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			setRole((Role) null);
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
		case InteractionOrientedArchitecturePackage.PARTICIPANT__INSTANTIATING:
			return instantiating != INSTANTIATING_EDEFAULT;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__FUNCTION:
			return function != null;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__PROTOCOLINSTANCE:
			return protocolinstance != null;
		case InteractionOrientedArchitecturePackage.PARTICIPANT__ROLE:
			return role != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Instantiating: ");
		result.append(instantiating);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
