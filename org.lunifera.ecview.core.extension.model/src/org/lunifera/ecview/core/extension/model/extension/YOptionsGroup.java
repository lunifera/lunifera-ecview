/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.core.YCollectionBindable;
import org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable;
import org.lunifera.ecview.core.common.model.core.YSelectionBindable;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.datatypes.YOptionsGroupDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YOptions Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getMultiSelection <em>Multi Selection</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getCaptionProperty <em>Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDescriptionProperty <em>Description Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup()
 * @model
 * @generated
 */
public interface YOptionsGroup extends YInput, YCollectionBindable, YSelectionBindable, YMultiSelectionBindable, YBeanServiceConsumer {
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YOptionsGroupDataType)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Datatype()
	 * @model
	 * @generated
	 */
	YOptionsGroupDataType getDatatype();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YOptionsGroupDataType value);

	/**
	 * Returns the value of the '<em><b>Selection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.extension.model.extension.YSelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Type</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSelectionType
	 * @see #setSelectionType(YSelectionType)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_SelectionType()
	 * @model
	 * @generated
	 */
	YSelectionType getSelectionType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelectionType <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' attribute.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSelectionType
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(YSelectionType value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Object)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Selection()
	 * @model transient="true"
	 * @generated
	 */
	Object getSelection();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Object value);

	/**
	 * Returns the value of the '<em><b>Multi Selection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Selection</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Selection</em>' attribute list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_MultiSelection()
	 * @model transient="true"
	 * @generated
	 */
	EList<Object> getMultiSelection();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Collection()
	 * @model transient="true"
	 * @generated
	 */
	EList<Object> getCollection();

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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getType <em>Type</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getEmfNsURI <em>Emf Ns URI</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_TypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getTypeQualifiedName <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Caption Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Property</em>' attribute.
	 * @see #setCaptionProperty(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_CaptionProperty()
	 * @model
	 * @generated
	 */
	String getCaptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getCaptionProperty <em>Caption Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Property</em>' attribute.
	 * @see #getCaptionProperty()
	 * @generated
	 */
	void setCaptionProperty(String value);

	/**
	 * Returns the value of the '<em><b>Image Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Property</em>' attribute.
	 * @see #setImageProperty(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_ImageProperty()
	 * @model
	 * @generated
	 */
	String getImageProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getImageProperty <em>Image Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Property</em>' attribute.
	 * @see #getImageProperty()
	 * @generated
	 */
	void setImageProperty(String value);

	/**
	 * Returns the value of the '<em><b>Description Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Property</em>' attribute.
	 * @see #setDescriptionProperty(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_DescriptionProperty()
	 * @model
	 * @generated
	 */
	String getDescriptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDescriptionProperty <em>Description Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Property</em>' attribute.
	 * @see #getDescriptionProperty()
	 * @generated
	 */
	void setDescriptionProperty(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYOptionsGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // YOptionsGroup
