/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionModel;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Oriented Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.InteractionOrientedArchitectureImpl#getInteractionmodel <em>Interactionmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionOrientedArchitectureImpl extends MinimalEObjectImpl.Container
		implements InteractionOrientedArchitecture {
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocol;

	/**
	 * The cached value of the '{@link #getInteractionmodel() <em>Interactionmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionmodel()
	 * @generated
	 * @ordered
	 */
	protected InteractionModel interactionmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOrientedArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionOrientedArchitecturePackage.Literals.INTERACTION_ORIENTED_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Protocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Protocol>(Protocol.class, this,
					InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionModel getInteractionmodel() {
		return interactionmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionmodel(InteractionModel newInteractionmodel, NotificationChain msgs) {
		InteractionModel oldInteractionmodel = interactionmodel;
		interactionmodel = newInteractionmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL,
					oldInteractionmodel, newInteractionmodel);
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
	public void setInteractionmodel(InteractionModel newInteractionmodel) {
		if (newInteractionmodel != interactionmodel) {
			NotificationChain msgs = null;
			if (interactionmodel != null)
				msgs = ((InternalEObject) interactionmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL,
						null, msgs);
			if (newInteractionmodel != null)
				msgs = ((InternalEObject) newInteractionmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL,
						null, msgs);
			msgs = basicSetInteractionmodel(newInteractionmodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL,
					newInteractionmodel, newInteractionmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL:
			return ((InternalEList<?>) getProtocol()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL:
			return basicSetInteractionmodel(null, msgs);
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
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL:
			return getProtocol();
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL:
			return getInteractionmodel();
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
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL:
			getProtocol().clear();
			getProtocol().addAll((Collection<? extends Protocol>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL:
			setInteractionmodel((InteractionModel) newValue);
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
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL:
			getProtocol().clear();
			return;
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL:
			setInteractionmodel((InteractionModel) null);
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
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__PROTOCOL:
			return protocol != null && !protocol.isEmpty();
		case InteractionOrientedArchitecturePackage.INTERACTION_ORIENTED_ARCHITECTURE__INTERACTIONMODEL:
			return interactionmodel != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionOrientedArchitectureImpl
