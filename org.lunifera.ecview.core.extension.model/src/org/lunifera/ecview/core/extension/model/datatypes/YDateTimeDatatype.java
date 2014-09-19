/**
 */
package org.lunifera.ecview.core.extension.model.datatypes;

import org.lunifera.ecview.core.common.model.datatypes.YDatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDate Time Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype#getFormat <em>Format</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYDateTimeDatatype()
 * @model
 * @generated
 */
public interface YDateTimeDatatype extends YDatatype {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"DATE"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat
	 * @see #setFormat(YDateTimeFormat)
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYDateTimeDatatype_Format()
	 * @model default="DATE"
	 * @generated
	 */
	YDateTimeFormat getFormat();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(YDateTimeFormat value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution
	 * @see #setResolution(YDateTimeResolution)
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYDateTimeDatatype_Resolution()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	YDateTimeResolution getResolution();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(YDateTimeResolution value);

} // YDateTimeDatatype
