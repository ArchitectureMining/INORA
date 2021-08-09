/**
 */
package org.informationsystem.ismsuite.InteractionOrientedArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getNode_Outgoing()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.InteractionOrientedArchitecturePackage#getNode_Incoming()
	 * @see org.informationsystem.ismsuite.InteractionOrientedArchitecture.SequenceFlow#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

} // Node
