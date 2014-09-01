/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEmbeddable Multi Selection Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableMultiSelectionEndpoint()
 * @model
 * @generated
 */
public interface YEmbeddableMultiSelectionEndpoint extends YListBindingEndpoint, YEmbeddableBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(YMultiSelectionBindable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableMultiSelectionEndpoint_Element()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint
	 * @model opposite="multiSelectionBindingEndpoint" required="true"
	 * @generated
	 */
	YMultiSelectionBindable getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YMultiSelectionBindable value);

} // YEmbeddableMultiSelectionEndpoint