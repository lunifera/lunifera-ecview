/**
 */
package org.lunifera.ecview.core.common.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDelegate Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YDelegateConverter#getConverterId <em>Converter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYDelegateConverter()
 * @model
 * @generated
 */
public interface YDelegateConverter extends YConverter {
	/**
	 * Returns the value of the '<em><b>Converter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter Id</em>' attribute.
	 * @see #setConverterId(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYDelegateConverter_ConverterId()
	 * @model required="true"
	 * @generated
	 */
	String getConverterId();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YDelegateConverter#getConverterId <em>Converter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converter Id</em>' attribute.
	 * @see #getConverterId()
	 * @generated
	 */
	void setConverterId(String value);

} // YDelegateConverter
