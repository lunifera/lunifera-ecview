/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.lunifera.ecview.core.common.model.core.YValueBindable;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Reference Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getInMemoryBeanProviderQualifiedName <em>In Memory Bean Provider Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getCaptionPropertyPath <em>Caption Property Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getImagePropertyPath <em>Image Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField()
 * @model
 * @generated
 */
public interface YBeanReferenceField extends YInput, YValueBindable {
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getDatadescription <em>Datadescription</em>}' reference.
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
	 * @see #setValue(Object)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_Value()
	 * @model transient="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #setEmfNsURI(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getEmfNsURI <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #getEmfNsURI()
	 * @generated
	 */
	void setEmfNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #setTypeQualifiedName(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_TypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getTypeQualifiedName <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>In Memory Bean Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Memory Bean Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Memory Bean Provider</em>' attribute.
	 * @see #setInMemoryBeanProvider(Class)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_InMemoryBeanProvider()
	 * @model
	 * @generated
	 */
	Class<?> getInMemoryBeanProvider();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Memory Bean Provider</em>' attribute.
	 * @see #getInMemoryBeanProvider()
	 * @generated
	 */
	void setInMemoryBeanProvider(Class<?> value);

	/**
	 * Returns the value of the '<em><b>In Memory Bean Provider Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Memory Bean Provider Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Memory Bean Provider Qualified Name</em>' attribute.
	 * @see #setInMemoryBeanProviderQualifiedName(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_InMemoryBeanProviderQualifiedName()
	 * @model
	 * @generated
	 */
	String getInMemoryBeanProviderQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getInMemoryBeanProviderQualifiedName <em>In Memory Bean Provider Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Memory Bean Provider Qualified Name</em>' attribute.
	 * @see #getInMemoryBeanProviderQualifiedName()
	 * @generated
	 */
	void setInMemoryBeanProviderQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Caption Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Property Path</em>' attribute.
	 * @see #setCaptionPropertyPath(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_CaptionPropertyPath()
	 * @model
	 * @generated
	 */
	String getCaptionPropertyPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getCaptionPropertyPath <em>Caption Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Property Path</em>' attribute.
	 * @see #getCaptionPropertyPath()
	 * @generated
	 */
	void setCaptionPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Image Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Property Path</em>' attribute.
	 * @see #setImagePropertyPath(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanReferenceField_ImagePropertyPath()
	 * @model
	 * @generated
	 */
	String getImagePropertyPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField#getImagePropertyPath <em>Image Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Property Path</em>' attribute.
	 * @see #getImagePropertyPath()
	 * @generated
	 */
	void setImagePropertyPath(String value);

} // YBeanReferenceField
