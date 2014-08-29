/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.lunifera.ecview.core.common.model.core.YValueBindable;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBoolean Search Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBooleanSearchField()
 * @model
 * @generated
 */
public interface YBooleanSearchField extends YInput, YValueBindable {
	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBooleanSearchField_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption
	 * @see #setValue(YBooleanSearchOption)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBooleanSearchField_Value()
	 * @model transient="true"
	 * @generated
	 */
	YBooleanSearchOption getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption
	 * @see #getValue()
	 * @generated
	 */
	void setValue(YBooleanSearchOption value);

} // YBooleanSearchField
