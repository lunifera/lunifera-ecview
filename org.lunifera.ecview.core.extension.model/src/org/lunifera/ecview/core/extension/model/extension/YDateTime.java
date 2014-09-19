/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import java.util.Date;

import org.lunifera.ecview.core.common.model.core.YValueBindable;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YDate Time</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYDateTime()
 * @model
 * @generated
 */
public interface YDateTime extends YInput, YValueBindable {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YDateTimeDatatype)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYDateTime_Datatype()
	 * @model
	 * @generated
	 */
	YDateTimeDatatype getDatatype();

	/**
	 * Sets the value of the '
	 * {@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatatype
	 * <em>Datatype</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YDateTimeDatatype value);

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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYDateTime_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYDateTime_Value()
	 * @model transient="true"
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

	/**
	 * Sets the date format of the field.
	 * 
	 * @param format
	 */
	void setDateFormat(YDateTimeFormat format);
	
	/**
	 * Sets the date time resolution of the field.
	 * 
	 * @param resolution
	 */
	void setResolution(YDateTimeResolution resolution);

} // YDateTime
