/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBrowser Stream Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getInputStream <em>Input Stream</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBrowserStreamInput()
 * @model
 * @generated
 */
public interface YBrowserStreamInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBrowserStreamInput_Filename()
	 * @model required="true" transient="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Input Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Stream</em>' attribute.
	 * @see #setInputStream(InputStream)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBrowserStreamInput_InputStream()
	 * @model dataType="org.lunifera.ecview.core.extension.model.extension.YInputStream" required="true"
	 * @generated
	 */
	InputStream getInputStream();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getInputStream <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Stream</em>' attribute.
	 * @see #getInputStream()
	 * @generated
	 */
	void setInputStream(InputStream value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBrowserStreamInput_MimeType()
	 * @model required="true" transient="true"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // YBrowserStreamInput
