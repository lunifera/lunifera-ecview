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
import org.lunifera.ecview.core.common.model.core.YSelectionBindable;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getCaptionProperty <em>Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDescriptionProperty <em>Description Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox()
 * @model
 * @generated
 */
public interface YComboBox extends YInput, YCollectionBindable, YSelectionBindable, YBeanServiceConsumer {
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatadescription <em>Datadescription</em>}' reference.
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
	 * @see #setDatatype(YComboBoxDatatype)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Datatype()
	 * @model
	 * @generated
	 */
	YComboBoxDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YComboBoxDatatype value);

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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Selection()
	 * @model transient="true"
	 * @generated
	 */
	Object getSelection();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Object value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Collection()
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getType <em>Type</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getEmfNsURI <em>Emf Ns URI</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_TypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getTypeQualifiedName <em>Type Qualified Name</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_CaptionProperty()
	 * @model
	 * @generated
	 */
	String getCaptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getCaptionProperty <em>Caption Property</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_ImageProperty()
	 * @model
	 * @generated
	 */
	String getImageProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getImageProperty <em>Image Property</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_DescriptionProperty()
	 * @model
	 * @generated
	 */
	String getDescriptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDescriptionProperty <em>Description Property</em>}' attribute.
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYComboBox_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // YUiComboBox
