/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#isInstantiating <em>Instantiating</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getFunction <em>Function</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance <em>Protocolinstance</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Instantiating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiating</em>' attribute.
	 * @see #setInstantiating(boolean)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getParticipant_Instantiating()
	 * @model
	 * @generated
	 */
	boolean isInstantiating();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#isInstantiating <em>Instantiating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiating</em>' attribute.
	 * @see #isInstantiating()
	 * @generated
	 */
	void setInstantiating(boolean value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getParticipant_Function()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Function#getParticipant
	 * @model opposite="participant" required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Protocolinstance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocolinstance</em>' reference.
	 * @see #setProtocolinstance(ProtocolInstance)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getParticipant_Protocolinstance()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.ProtocolInstance#getParticipant
	 * @model opposite="participant" required="true"
	 * @generated
	 */
	ProtocolInstance getProtocolinstance();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getProtocolinstance <em>Protocolinstance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocolinstance</em>' reference.
	 * @see #getProtocolinstance()
	 * @generated
	 */
	void setProtocolinstance(ProtocolInstance value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getParticipant_Role()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.Role#getParticipant
	 * @model opposite="participant" required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Participant#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Participant
