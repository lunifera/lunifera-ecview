/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.lunifera.ecview.core.common.model.core.YValueBindable;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText Search Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYTextSearchField()
 * @model
 * @generated
 */
public interface YTextSearchField extends YInput, YValueBindable {
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYTextSearchField_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYTextSearchField_Value()
	 * @model transient="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.extension.model.extension.YSearchWildcards}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSearchWildcards
	 * @see #setWildcard(YSearchWildcards)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYTextSearchField_Wildcard()
	 * @model transient="true"
	 * @generated
	 */
	YSearchWildcards getWildcard();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getWildcard <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSearchWildcards
	 * @see #getWildcard()
	 * @generated
	 */
	void setWildcard(YSearchWildcards value);

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYTextSearchField_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

} // YTextSearchField
