/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import java.io.InputStream;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YBrowserStreamInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBrowser Stream Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBrowserStreamInputImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBrowserStreamInputImpl#getInputStream <em>Input Stream</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBrowserStreamInputImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBrowserStreamInputImpl extends MinimalEObjectImpl.Container implements YBrowserStreamInput {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputStream() <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStream()
	 * @generated
	 * @ordered
	 */
	protected static final InputStream INPUT_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputStream() <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStream()
	 * @generated
	 * @ordered
	 */
	protected InputStream inputStream = INPUT_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBrowserStreamInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YBROWSER_STREAM_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBROWSER_STREAM_INPUT__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream getInputStream() {
		return inputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputStream(InputStream newInputStream) {
		InputStream oldInputStream = inputStream;
		inputStream = newInputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBROWSER_STREAM_INPUT__INPUT_STREAM, oldInputStream, inputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBROWSER_STREAM_INPUT__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__FILENAME:
				return getFilename();
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__INPUT_STREAM:
				return getInputStream();
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__MIME_TYPE:
				return getMimeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__FILENAME:
				setFilename((String)newValue);
				return;
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__INPUT_STREAM:
				setInputStream((InputStream)newValue);
				return;
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__MIME_TYPE:
				setMimeType((String)newValue);
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
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__INPUT_STREAM:
				setInputStream(INPUT_STREAM_EDEFAULT);
				return;
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
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
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__INPUT_STREAM:
				return INPUT_STREAM_EDEFAULT == null ? inputStream != null : !INPUT_STREAM_EDEFAULT.equals(inputStream);
			case ExtensionModelPackage.YBROWSER_STREAM_INPUT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filename: ");
		result.append(filename);
		result.append(", inputStream: ");
		result.append(inputStream);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} //YBrowserStreamInputImpl
