/**
 */
package org.lunifera.ecview.core.common.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YKey Stroke Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getKeyCode <em>Key Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getModifierKeys <em>Modifier Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYKeyStrokeDefinition()
 * @model
 * @generated
 */
public interface YKeyStrokeDefinition extends YElement {
	/**
	 * Returns the value of the '<em><b>Key Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.core.YKeyCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Code</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyCode
	 * @see #setKeyCode(YKeyCode)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYKeyStrokeDefinition_KeyCode()
	 * @model
	 * @generated
	 */
	YKeyCode getKeyCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getKeyCode <em>Key Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Code</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyCode
	 * @see #getKeyCode()
	 * @generated
	 */
	void setKeyCode(YKeyCode value);

	/**
	 * Returns the value of the '<em><b>Modifier Keys</b></em>' attribute list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YModifierKey}.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.core.YModifierKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier Keys</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier Keys</em>' attribute list.
	 * @see org.lunifera.ecview.core.common.model.core.YModifierKey
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYKeyStrokeDefinition_ModifierKeys()
	 * @model
	 * @generated
	 */
	EList<YModifierKey> getModifierKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

} // YKeyStrokeDefinition
