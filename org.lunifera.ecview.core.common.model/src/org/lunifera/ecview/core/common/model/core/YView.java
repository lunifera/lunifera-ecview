/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.model.core;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getRoot <em>Root</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getCommandSet <em>Command Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getDialogs <em>Dialogs</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getContentAlignment <em>Content Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getVisibilityProcessors <em>Visibility Processors</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getExposedActions <em>Exposed Actions</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getSharedStateGroup <em>Shared State Group</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YView#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView()
 * @model
 * @generated
 */
public interface YView extends YElement, YCssAble, YMarginable {
	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_ViewName()
	 * @model
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '
	 * {@link org.lunifera.ecview.core.common.model.core.YView#getViewName
	 * <em>View Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(YEmbeddable)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YEmbeddable getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Set</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Set</em>' containment reference.
	 * @see #setBindingSet(YBindingSet)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_BindingSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YBindingSet getBindingSet();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getBindingSet <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Set</em>' containment reference.
	 * @see #getBindingSet()
	 * @generated
	 */
	void setBindingSet(YBindingSet value);

	/**
	 * Returns the value of the '<em><b>Bean Slots</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.lunifera.ecview.core.common.model.core.YBeanSlot}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slots</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bean Slots</em>' containment reference
	 *         list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_BeanSlots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBeanSlot> getBeanSlots();

	/**
	 * Returns the value of the '<em><b>Command Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Set</em>' containment reference.
	 * @see #setCommandSet(YCommandSet)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_CommandSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YCommandSet getCommandSet();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getCommandSet <em>Command Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Set</em>' containment reference.
	 * @see #getCommandSet()
	 * @generated
	 */
	void setCommandSet(YCommandSet value);

	/**
	 * Returns the value of the '<em><b>Dialogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YDialog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogs</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_Dialogs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YDialog> getDialogs();

	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * The default value is <code>"IDE"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.core.YDeviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YDeviceType
	 * @see #setDeviceType(YDeviceType)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_DeviceType()
	 * @model default="IDE"
	 * @generated
	 */
	YDeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YDeviceType
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(YDeviceType value);

	/**
	 * Returns the value of the '<em><b>Content Alignment</b></em>' attribute.
	 * The default value is <code>"FILL_FILL"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.core.YAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YAlignment
	 * @see #setContentAlignment(YAlignment)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_ContentAlignment()
	 * @model default="FILL_FILL"
	 * @generated
	 */
	YAlignment getContentAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getContentAlignment <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YAlignment
	 * @see #getContentAlignment()
	 * @generated
	 */
	void setContentAlignment(YAlignment value);

	/**
	 * Returns the value of the '<em><b>Visibility Processors</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Processors</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_VisibilityProcessors()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YVisibilityProcessor> getVisibilityProcessors();

	/**
	 * Returns the value of the '<em><b>Exposed Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YExposedAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Actions</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_ExposedActions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YExposedAction> getExposedActions();

	/**
	 * Returns the value of the '<em><b>Shared State Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared State Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared State Group</em>' attribute.
	 * @see #setSharedStateGroup(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_SharedStateGroup()
	 * @model
	 * @generated
	 */
	String getSharedStateGroup();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getSharedStateGroup <em>Shared State Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared State Group</em>' attribute.
	 * @see #getSharedStateGroup()
	 * @generated
	 */
	void setSharedStateGroup(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingSet getOrCreateBindingSet();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.ecview.core.common.model.core.YViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(YViewSet)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYView_Root()
	 * @see org.lunifera.ecview.core.common.model.core.YViewSet#getViews
	 * @model opposite="views"
	 * @generated
	 */
	YViewSet getRoot();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YView#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(YViewSet value);

	/**
	 * Adds a new bean slot for the given name and type.
	 * 
	 * @param name
	 * @param type 
	 * @return
	 */
	YBeanSlot addBeanSlot(String name, Class<?> type);
	
	
	/**
	 * Returns the bean slot for the given name. Or <code>null</code> if no bean slot is available.
	 * 
	 * @param name
	 * @return
	 */
	YBeanSlot getBeanSlot(String name);

} // YUiView
