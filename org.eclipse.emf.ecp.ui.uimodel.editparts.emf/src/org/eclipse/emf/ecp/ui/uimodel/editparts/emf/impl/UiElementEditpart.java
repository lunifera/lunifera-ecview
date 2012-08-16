/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.disposal.IDisposable;
import org.eclipse.emf.ecp.ui.uimodel.editparts.util.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.editparts.util.IUiElementEditpartProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the main edit part. <br>
 * The whole ui is based on an ui model which is built by emf.
 * And each edit part is based on an {@link EObject} (ui model element) that is given in the initialize
 * method and contains all information required to render the ui element. The edit part is just the
 * controller that renders the ui but the informations how to render is given by the EObject.
 * <p>
 * For general, edit parts have 3 different kind of methods. <br>
 * <h3>API</h3> API are public methods that are declared by the interfaces. They can be used to create the ui based on
 * the edit parts like
 * <p>
 * <code>
 * layoutEditpart.addElement(element)
 * </code>
 * <p>
 * Internally these methods do not handle the calls directly, but will delegate to the underlying EMF model. What means,
 * that the implementation of the public methods do not create ui, but just changes the EObject.
 * 
 * <h3>EMF adpater</h3>
 * Since each edit part inherits {@link Adapter} and observes all the notifications from the assigned element, the
 * changes made by the public API methods will notify the {@link #notifyChanged(Notification)} method that delegates the
 * call to the handleModel_... methods.<br>
 * 
 * <h3>Internal methods</h3> The handleModel_... methods interpret the model change and invoke the internal... methods.
 * These are responsible to make the changes to the user interface.
 * 
 * <h3>Advantage</h3> The advantage of that pattern is to provide a very flexible API. The ui can be built up by the
 * edit parts, but it can be also defined based on the underlying emf model. And each change of the model will be
 * detected by the edit parts that are using the information to reflect them to the ui.
 * <p>
 * 
 * @param <M>
 */
public abstract class UiElementEditpart<M extends YUiElement> extends AdapterImpl implements IUiElementEditpart,
	IUiElementEditpartProvider {

	private static final Logger logger = LoggerFactory.getLogger(UiElementEditpart.class);

	private boolean disposed;
	private List<IDisposable.Listener> disposeListeners;
	private M model;
	private String id;

	/**
	 * Returns the edit part for the given model yElement.
	 * 
	 * @param yElement
	 * @return
	 */
	public static <A extends IUiElementEditpart> A findEditPartFor(YUiElement yElement) {
		return EditpartManager.findEditPartFor(yElement);
	}

	protected UiElementEditpart() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getId() {
		checkDisposed();

		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public M getModel() {
		checkDisposed();

		return model;
	}

	/**
	 * Is called to initialize this edit part
	 * 
	 * @param element
	 */
	public void initialize(M model) {
		checkDisposed();

		if (this.model != null) {
			logger.error("Editparts must only be initialized once!");
			throw new IllegalStateException("Editparts must only be initialized once!");
		}

		for (Adapter adapter : model.eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				logger.error("For a modelelement instance only one editpart can be created!");
				throw new RuntimeException("For a modelelement instance only one editpart can be created!");
			}
		}

		this.model = model;
		this.id = model.getId();

		registerAdapter(this);
	}

	/**
	 * Returns an existing edit part or creates a new one.
	 * 
	 * @param <A>
	 * @param yElement
	 * @return
	 */
	public <A extends IUiElementEditpart> A getEditpart(YUiElement yElement) {
		A editPart = findEditPartFor(yElement);
		if (editPart != null) {
			return editPart;
		}
		return DelegatingEditPartManager.getInstance().getEditpart(yElement);
	}

	/**
	 * Implementation of {@link IUiElementEditpartProvider} and returns <code>this</code> in that special case.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public IUiElementEditpart getEditpart() {
		checkDisposed();

		return this;
	}

	/**
	 * Registers an adapter at the model element.
	 * 
	 * @param adapter
	 */
	protected void registerAdapter(Adapter adapter) {
		checkDisposed();

		if (!model.eAdapters().contains(adapter)) {
			model.eAdapters().add(adapter);
		}
	}

	/**
	 * Unregisters an adapter at the model element.
	 * 
	 * @param adapter
	 */
	protected void unregisterAdapter(Adapter adapter) {
		model.eAdapters().remove(adapter);
	}

	/**
	 * Is called by the emf model element, if state changed.
	 */
	public void notifyChanged(Notification notification) {
		checkDisposed();

		int featureId = notification.getFeatureID(YUiElement.class);
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleModel_Add(featureId, notification);
			break;
		case Notification.REMOVE:
			handleModel_Remove(featureId, notification);
			break;
		case Notification.SET:
			handleModel_Set(featureId, notification);
			break;
		}
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the add-event to be handled by subclasses.
	 * 
	 * @param featureId
	 * @param notification
	 */
	protected void handleModel_Add(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the remove-event to be handled by subclasses.
	 * 
	 * @param featureId
	 * @param notification
	 */
	protected void handleModel_Remove(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the set-event to be handled by subclasses.
	 * 
	 * @param featureId
	 * @param notification
	 */
	protected void handleModel_Set(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		if (!isDisposed()) {
			internalDispose();
		}
	}

	protected void internalDispose() {
		disposed = true;

		// unregisters the observer from observing the model
		unregisterAdapter(this);
	}

	/**
	 * Checks whether the element is disposed. Throws a DisposeException is the element is disposed.
	 * 
	 * @throws DisposeException
	 */
	protected void checkDisposed() {
		IDisposable.DisposableUtil.checkDisposed(this);
	}

	@Override
	public void addDisposeListener(Listener listener) {
		checkDisposed();

		if (listener == null) {
			return;
		}

		if (disposeListeners == null) {
			disposeListeners = new ArrayList<IDisposable.Listener>();
		}

		if (!disposeListeners.contains(listener)) {
			disposeListeners.add(listener);
		}
	}

	@Override
	public void removeDisposeListener(Listener listener) {
		checkDisposed();

		if (listener == null || disposeListeners == null) {
			return;
		}

		disposeListeners.remove(listener);
	}

	/**
	 * Notifies all listeners about the disposal of that elemenyElement
	 **/
	protected void notifyDisposeListeners() {
		if (disposeListeners == null) {
			return;
		}

		for (IDisposable.Listener listener : disposeListeners
			.toArray(new IDisposable.Listener[disposeListeners.size()])) {
			listener.notifyDisposed(this);
		}
	}
}
