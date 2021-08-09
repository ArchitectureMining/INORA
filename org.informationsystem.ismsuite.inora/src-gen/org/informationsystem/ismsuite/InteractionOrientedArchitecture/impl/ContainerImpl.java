/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function;
import org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.impl.ContainerImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedElementImpl
		implements org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container {
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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionOrientedArchitecturePackage.Literals.CONTAINER;
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
					InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this,
					InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
		case InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
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
		case InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER:
			return getContainer();
		case InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION:
			return getFunction();
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
		case InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER:
			getContainer().clear();
			getContainer().addAll(
					(Collection<? extends org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container>) newValue);
			return;
		case InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Function>) newValue);
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
		case InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER:
			getContainer().clear();
			return;
		case InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION:
			getFunction().clear();
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
		case InteractionOrientedArchitecturePackage.CONTAINER__CONTAINER:
			return container != null && !container.isEmpty();
		case InteractionOrientedArchitecturePackage.CONTAINER__FUNCTION:
			return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
