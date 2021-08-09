/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getContainer <em>Container</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getContainer_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getContainer_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

} // Container
