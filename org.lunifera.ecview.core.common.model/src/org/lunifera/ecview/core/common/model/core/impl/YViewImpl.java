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
package org.lunifera.ecview.core.common.model.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YAlignment;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YDeviceType;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getCommandSet <em>Command Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getDialogs <em>Dialogs</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getContentAlignment <em>Content Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getVisibilityProcessors <em>Visibility Processors</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl#getExposedActions <em>Exposed Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YViewImpl extends MinimalEObjectImpl.Container implements YView {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected YViewSet root;

	/**
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected String viewName = VIEW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable content;

	/**
	 * The cached value of the '{@link #getBindingSet() <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingSet()
	 * @generated
	 * @ordered
	 */
	protected YBindingSet bindingSet;

	/**
	 * The cached value of the '{@link #getBeanSlots() <em>Bean Slots</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeanSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<YBeanSlot> beanSlots;

	/**
	 * The cached value of the '{@link #getCommandSet() <em>Command Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandSet()
	 * @generated
	 * @ordered
	 */
	protected YCommandSet commandSet;

	/**
	 * The cached value of the '{@link #getDialogs() <em>Dialogs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogs()
	 * @generated
	 * @ordered
	 */
	protected EList<YDialog> dialogs;

	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final YDeviceType DEVICE_TYPE_EDEFAULT = YDeviceType.IDE;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected YDeviceType deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentAlignment() <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final YAlignment CONTENT_ALIGNMENT_EDEFAULT = YAlignment.FILL_FILL;

	/**
	 * The cached value of the '{@link #getContentAlignment() <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAlignment()
	 * @generated
	 * @ordered
	 */
	protected YAlignment contentAlignment = CONTENT_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibilityProcessors() <em>Visibility Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<YVisibilityProcessor> visibilityProcessors;

	/**
	 * The cached value of the '{@link #getExposedActions() <em>Exposed Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<YExposedAction> exposedActions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YVIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_CLASS, oldCssClass, cssClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(String newViewName) {
		String oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (YEmbeddable)eResolveProxy(oldContent);
			if (content != oldContent) {
				InternalEObject newContent = (InternalEObject)content;
				NotificationChain msgs = oldContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, null);
				if (newContent.eInternalContainer() == null) {
					msgs = newContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(YEmbeddable newContent,
			NotificationChain msgs) {
		YEmbeddable oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(YEmbeddable newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet getBindingSet() {
		if (bindingSet != null && bindingSet.eIsProxy()) {
			InternalEObject oldBindingSet = (InternalEObject)bindingSet;
			bindingSet = (YBindingSet)eResolveProxy(oldBindingSet);
			if (bindingSet != oldBindingSet) {
				InternalEObject newBindingSet = (InternalEObject)bindingSet;
				NotificationChain msgs = oldBindingSet.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, null);
				if (newBindingSet.eInternalContainer() == null) {
					msgs = newBindingSet.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__BINDING_SET, oldBindingSet, bindingSet));
			}
		}
		return bindingSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet basicGetBindingSet() {
		return bindingSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingSet(YBindingSet newBindingSet,
			NotificationChain msgs) {
		YBindingSet oldBindingSet = bindingSet;
		bindingSet = newBindingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__BINDING_SET, oldBindingSet, newBindingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSet(YBindingSet newBindingSet) {
		if (newBindingSet != bindingSet) {
			NotificationChain msgs = null;
			if (bindingSet != null)
				msgs = ((InternalEObject)bindingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
			if (newBindingSet != null)
				msgs = ((InternalEObject)newBindingSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
			msgs = basicSetBindingSet(newBindingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__BINDING_SET, newBindingSet, newBindingSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YBeanSlot> getBeanSlots() {
		if (beanSlots == null) {
			beanSlots = new EObjectContainmentEList.Resolving<YBeanSlot>(YBeanSlot.class, this, CoreModelPackage.YVIEW__BEAN_SLOTS);
		}
		return beanSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCommandSet getCommandSetGen() {
		if (commandSet != null && commandSet.eIsProxy()) {
			InternalEObject oldCommandSet = (InternalEObject)commandSet;
			commandSet = (YCommandSet)eResolveProxy(oldCommandSet);
			if (commandSet != oldCommandSet) {
				InternalEObject newCommandSet = (InternalEObject)commandSet;
				NotificationChain msgs = oldCommandSet.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__COMMAND_SET, null, null);
				if (newCommandSet.eInternalContainer() == null) {
					msgs = newCommandSet.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__COMMAND_SET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__COMMAND_SET, oldCommandSet, commandSet));
			}
		}
		return commandSet;
	}
	
	public YCommandSet getCommandSet() {
		YCommandSet commandSet = getCommandSetGen();
		if(commandSet == null){
			commandSet = CoreModelFactory.eINSTANCE.createYCommandSet();
			setCommandSet(commandSet);
		}
		return getCommandSetGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCommandSet basicGetCommandSet() {
		return commandSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandSet(YCommandSet newCommandSet, NotificationChain msgs) {
		YCommandSet oldCommandSet = commandSet;
		commandSet = newCommandSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__COMMAND_SET, oldCommandSet, newCommandSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandSet(YCommandSet newCommandSet) {
		if (newCommandSet != commandSet) {
			NotificationChain msgs = null;
			if (commandSet != null)
				msgs = ((InternalEObject)commandSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__COMMAND_SET, null, msgs);
			if (newCommandSet != null)
				msgs = ((InternalEObject)newCommandSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__COMMAND_SET, null, msgs);
			msgs = basicSetCommandSet(newCommandSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__COMMAND_SET, newCommandSet, newCommandSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YDialog> getDialogs() {
		if (dialogs == null) {
			dialogs = new EObjectContainmentEList.Resolving<YDialog>(YDialog.class, this, CoreModelPackage.YVIEW__DIALOGS);
		}
		return dialogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDeviceType getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceType(YDeviceType newDeviceType) {
		YDeviceType oldDeviceType = deviceType;
		deviceType = newDeviceType == null ? DEVICE_TYPE_EDEFAULT : newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAlignment getContentAlignment() {
		return contentAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentAlignment(YAlignment newContentAlignment) {
		YAlignment oldContentAlignment = contentAlignment;
		contentAlignment = newContentAlignment == null ? CONTENT_ALIGNMENT_EDEFAULT : newContentAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT_ALIGNMENT, oldContentAlignment, contentAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YVisibilityProcessor> getVisibilityProcessors() {
		if (visibilityProcessors == null) {
			visibilityProcessors = new EObjectContainmentEList.Resolving<YVisibilityProcessor>(YVisibilityProcessor.class, this, CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS);
		}
		return visibilityProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YExposedAction> getExposedActions() {
		if (exposedActions == null) {
			exposedActions = new EObjectContainmentEList.Resolving<YExposedAction>(YExposedAction.class, this, CoreModelPackage.YVIEW__EXPOSED_ACTIONS);
		}
		return exposedActions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet getOrCreateBindingSetGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YBindingSet getOrCreateBindingSet() {
		YBindingSet bs = getBindingSet();
		if (bs == null) {
			bs = BindingFactory.eINSTANCE.createYBindingSet();
			setBindingSet(bs);
		}
		return getBindingSet();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet getRootGen() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (YViewSet)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * Overrides super type to ensure bidirectional proxy resolving
	 */
	@Override
	public YViewSet getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject) root;
			YViewSet oldViewSet = (YViewSet) oldRoot;
			root = (YViewSet) eResolveProxy(oldRoot);
			if (root != oldRoot) {

				// ATENTION: inverse add must be called since bidirectional
				// references uses proxy resolution for lazy linking. And the
				// views added to proxy must be added to new superType
				for (YView yView : oldViewSet.getViews()) {
					((InternalEObject) root).eInverseAdd(
							(InternalEObject) yView,
							CoreModelPackage.YVIEW_SET__VIEWS, YView.class,
							null);
				}

				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoreModelPackage.YVIEW__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(YViewSet newRoot,
			NotificationChain msgs) {
		YViewSet oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(YViewSet newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ROOT:
				if (root != null)
					msgs = ((InternalEObject)root).eInverseRemove(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
				return basicSetRoot((YViewSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ROOT:
				return basicSetRoot(null, msgs);
			case CoreModelPackage.YVIEW__CONTENT:
				return basicSetContent(null, msgs);
			case CoreModelPackage.YVIEW__BINDING_SET:
				return basicSetBindingSet(null, msgs);
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return ((InternalEList<?>)getBeanSlots()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YVIEW__COMMAND_SET:
				return basicSetCommandSet(null, msgs);
			case CoreModelPackage.YVIEW__DIALOGS:
				return ((InternalEList<?>)getDialogs()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
				return ((InternalEList<?>)getVisibilityProcessors()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
				return ((InternalEList<?>)getExposedActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ID:
				return getId();
			case CoreModelPackage.YVIEW__NAME:
				return getName();
			case CoreModelPackage.YVIEW__CSS_CLASS:
				return getCssClass();
			case CoreModelPackage.YVIEW__CSS_ID:
				return getCssID();
			case CoreModelPackage.YVIEW__MARGIN:
				return isMargin();
			case CoreModelPackage.YVIEW__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return getViewName();
			case CoreModelPackage.YVIEW__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case CoreModelPackage.YVIEW__BINDING_SET:
				if (resolve) return getBindingSet();
				return basicGetBindingSet();
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return getBeanSlots();
			case CoreModelPackage.YVIEW__COMMAND_SET:
				if (resolve) return getCommandSet();
				return basicGetCommandSet();
			case CoreModelPackage.YVIEW__DIALOGS:
				return getDialogs();
			case CoreModelPackage.YVIEW__DEVICE_TYPE:
				return getDeviceType();
			case CoreModelPackage.YVIEW__CONTENT_ALIGNMENT:
				return getContentAlignment();
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
				return getVisibilityProcessors();
			case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
				return getExposedActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YVIEW__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CSS_ID:
				setCssID((String)newValue);
				return;
			case CoreModelPackage.YVIEW__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case CoreModelPackage.YVIEW__ROOT:
				setRoot((YViewSet)newValue);
				return;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CONTENT:
				setContent((YEmbeddable)newValue);
				return;
			case CoreModelPackage.YVIEW__BINDING_SET:
				setBindingSet((YBindingSet)newValue);
				return;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				getBeanSlots().clear();
				getBeanSlots().addAll((Collection<? extends YBeanSlot>)newValue);
				return;
			case CoreModelPackage.YVIEW__COMMAND_SET:
				setCommandSet((YCommandSet)newValue);
				return;
			case CoreModelPackage.YVIEW__DIALOGS:
				getDialogs().clear();
				getDialogs().addAll((Collection<? extends YDialog>)newValue);
				return;
			case CoreModelPackage.YVIEW__DEVICE_TYPE:
				setDeviceType((YDeviceType)newValue);
				return;
			case CoreModelPackage.YVIEW__CONTENT_ALIGNMENT:
				setContentAlignment((YAlignment)newValue);
				return;
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
				getVisibilityProcessors().clear();
				getVisibilityProcessors().addAll((Collection<? extends YVisibilityProcessor>)newValue);
				return;
			case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
				getExposedActions().clear();
				getExposedActions().addAll((Collection<? extends YExposedAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__ROOT:
				setRoot((YViewSet)null);
				return;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CONTENT:
				setContent((YEmbeddable)null);
				return;
			case CoreModelPackage.YVIEW__BINDING_SET:
				setBindingSet((YBindingSet)null);
				return;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				getBeanSlots().clear();
				return;
			case CoreModelPackage.YVIEW__COMMAND_SET:
				setCommandSet((YCommandSet)null);
				return;
			case CoreModelPackage.YVIEW__DIALOGS:
				getDialogs().clear();
				return;
			case CoreModelPackage.YVIEW__DEVICE_TYPE:
				setDeviceType(DEVICE_TYPE_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CONTENT_ALIGNMENT:
				setContentAlignment(CONTENT_ALIGNMENT_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
				getVisibilityProcessors().clear();
				return;
			case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
				getExposedActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YVIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YVIEW__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case CoreModelPackage.YVIEW__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case CoreModelPackage.YVIEW__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case CoreModelPackage.YVIEW__ROOT:
				return root != null;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case CoreModelPackage.YVIEW__CONTENT:
				return content != null;
			case CoreModelPackage.YVIEW__BINDING_SET:
				return bindingSet != null;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return beanSlots != null && !beanSlots.isEmpty();
			case CoreModelPackage.YVIEW__COMMAND_SET:
				return commandSet != null;
			case CoreModelPackage.YVIEW__DIALOGS:
				return dialogs != null && !dialogs.isEmpty();
			case CoreModelPackage.YVIEW__DEVICE_TYPE:
				return deviceType != DEVICE_TYPE_EDEFAULT;
			case CoreModelPackage.YVIEW__CONTENT_ALIGNMENT:
				return contentAlignment != CONTENT_ALIGNMENT_EDEFAULT;
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
				return visibilityProcessors != null && !visibilityProcessors.isEmpty();
			case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
				return exposedActions != null && !exposedActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YVIEW__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case CoreModelPackage.YVIEW__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YVIEW__MARGIN: return CoreModelPackage.YMARGINABLE__MARGIN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return CoreModelPackage.YVIEW__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return CoreModelPackage.YVIEW__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMARGINABLE__MARGIN: return CoreModelPackage.YVIEW__MARGIN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", cssClass: ");
		result.append(cssClass);
		result.append(", cssID: ");
		result.append(cssID);
		result.append(", margin: ");
		result.append(margin);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(", deviceType: ");
		result.append(deviceType);
		result.append(", contentAlignment: ");
		result.append(contentAlignment);
		result.append(')');
		return result.toString();
	}

	@Override
	public YBeanSlot addBeanSlot(String name, Class<?> type) {
		YBeanSlot result = getBeanSlot(name);
		if (result == null) {
			result = CoreModelFactory.eINSTANCE.createYBeanSlot();
			result.setName(name);
			result.setValueType(type);
			getBeanSlots().add(result);
		}

		return result;
	}

	@Override
	public YBeanSlot getBeanSlot(String name) {
		YBeanSlot result = null;
		for (YBeanSlot ySlot : getBeanSlots()) {
			if (ySlot.getName().equals(name)) {
				result = ySlot;
				break;
			}
		}
		return result;
	}

} // YUiViewImpl
