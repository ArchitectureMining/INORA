/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Oriented Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getInteractionmodel <em>Interactionmodel</em>}</li>
 * </ul>
 *
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getInteractionOrientedArchitecture()
 * @model
 * @generated
 */
public interface InteractionOrientedArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getInteractionOrientedArchitecture_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Protocol> getProtocol();

	/**
	 * Returns the value of the '<em><b>Interactionmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactionmodel</em>' containment reference.
	 * @see #setInteractionmodel(InteractionModel)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getInteractionOrientedArchitecture_Interactionmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InteractionModel getInteractionmodel();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecture#getInteractionmodel <em>Interactionmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactionmodel</em>' containment reference.
	 * @see #getInteractionmodel()
	 * @generated
	 */
	void setInteractionmodel(InteractionModel value);

} // InteractionOrientedArchitecture
