/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getProtocolInstance()
 * @model
 * @generated
 */
public interface ProtocolInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant}.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance <em>Protocolinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getProtocolInstance_Participant()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance
	 * @model opposite="protocolinstance" lower="2"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getProtocolinstance <em>Protocolinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(Protocol)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getProtocolInstance_Protocol()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Protocol#getProtocolinstance
	 * @model opposite="protocolinstance" required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // ProtocolInstance
