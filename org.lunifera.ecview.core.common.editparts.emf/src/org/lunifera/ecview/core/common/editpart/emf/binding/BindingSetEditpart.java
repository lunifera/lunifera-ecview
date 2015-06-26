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
package org.lunifera.ecview.core.common.editpart.emf.binding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public class BindingSetEditpart extends ElementEditpart<YBindingSet> implements
		IBindingSetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BindingSetEditpart.class);
	private boolean active;
	private List<IBindingEditpart<?>> bindings;
	private List<IBindingEditpart<?>> transientBindings;
	private IECViewBindingManager bindingManager;

	/**
	 * A default constructor.
	 */
	public BindingSetEditpart() {
	}

	@Override
	protected YBindingSet createModel() {
		checkDisposed();

		return BindingFactory.eINSTANCE.createYBindingSet();
	}

	@Override
	public IViewEditpart getView() {
		checkDisposed();

		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) ElementEditpart
				.findEditPartFor(yView) : null;
	}

	@Override
	public IECViewBindingManager getBindingManager() {
		IViewEditpart view = getView();
		if (view == null) {
			if (bindingManager != null) {
				return bindingManager;
			}
			throw new IllegalArgumentException(
					"View and BindingManager must not be null for now!");
		} else {
			IECViewBindingManager bm = view.getContext().getService(
					IECViewBindingManager.class.getName());
			if (bm == null) {
				bm = this.bindingManager;
			}
			return bm;
		}
	}

	@Override
	public void setBindingManager(IECViewBindingManager bindingManager) {
		this.bindingManager = bindingManager;
	}

	@Override
	public boolean isActive() {
		checkDisposed();

		return active;
	}

	@Override
	public void activate() {
		checkDisposed();

		try {
			for (IBindingEditpart<?> binding : getBindings()) {
				binding.bind();
			}

			for (IBindingEditpart<?> binding : getTransientBindings()) {
				binding.bind();
			}
		} finally {
			active = true;
		}
	}

	@Override
	public void addBinding(IBindingEditpart<?> binding) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YBindingSet yBindingSet = getModel();
			YBinding yBinding = (YBinding) binding.getModel();
			yBindingSet.addBinding(yBinding);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeBinding(IBindingEditpart<?> binding) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YBindingSet yBindingSet = getModel();
			YBinding yBinding = (YBinding) binding.getModel();
			yBindingSet.removeBinding(yBinding);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}

	}
	
	@Override
	public void addTransientBinding(IBindingEditpart<?> binding) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YBindingSet yBindingSet = getModel();
			YBinding yBinding = (YBinding) binding.getModel();
			yBindingSet.getTransientBindings().add(yBinding);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeTransientBinding(IBindingEditpart<?> binding) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YBindingSet yBindingSet = getModel();
			YBinding yBinding = (YBinding) binding.getModel();
			yBindingSet.getTransientBindings().remove(yBinding);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}

	}

	@Override
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case BindingPackage.YBINDING_SET__BINDINGS:
			YBinding yBinding = (YBinding) notification.getNewValue();

			IBindingEditpart<?> editPart = (IBindingEditpart<?>) getEditpart(yBinding);
			internalAddBinding(editPart);
			break;
		case BindingPackage.YBINDING_SET__TRANSIENT_BINDINGS:
			yBinding = (YBinding) notification.getNewValue();

			editPart = (IBindingEditpart<?>) getEditpart(yBinding);
			internalAddTransientBinding(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of bindings.
	 * 
	 * @param binding
	 *            The editpart to be added
	 */
	protected void internalAddBinding(IBindingEditpart<?> binding) {
		checkDisposed();

		ensureBindingsLoaded();
		if (!bindings.contains(binding)) {
			bindings.add(binding);

			// activates the binding
			binding.bind();
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of transientBindings.
	 * 
	 * @param binding
	 *            The editpart to be added
	 */
	protected void internalAddTransientBinding(IBindingEditpart<?> binding) {
		checkDisposed();
		ensureBindingsLoaded();
		if (!transientBindings.contains(binding)) {
			transientBindings.add(binding);

			// activates the binding
			binding.bind();
		}
	}

	@Override
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case BindingPackage.YBINDING_SET__BINDINGS:
			YBinding yBinding = (YBinding) notification.getOldValue();

			IBindingEditpart<?> editPart = (IBindingEditpart<?>) getEditpart(yBinding);
			internalRemoveBinding(editPart);
			break;
		case BindingPackage.YBINDING_SET__TRANSIENT_BINDINGS:
			yBinding = (YBinding) notification.getOldValue();

			editPart = (IBindingEditpart<?>) getEditpart(yBinding);
			internalRemoveTransientBinding(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Ensures that the internal bindings are loaded properly.
	 */
	private void ensureBindingsLoaded() {
		if (bindings == null) {
			internalLoadBindings();
		}
	}

	/**
	 * Is called to load and initialize all bindings.
	 */
	protected void internalLoadBindings() {
		checkDisposed();

		if (bindings == null) {
			bindings = new ArrayList<IBindingEditpart<?>>();
			for (YBinding yBinding : getModel().getBindings()) {
				IBindingEditpart<?> editPart = getEditpart(yBinding);
				internalAddBinding(editPart);
			}
		}
	}

	/**
	 * Ensures that the internal transientBindings are loaded properly.
	 */
	private void ensureTransientBindingsLoaded() {
		if (transientBindings == null) {
			internalLoadTransientBindings();
		}
	}

	/**
	 * Is called to load and initialize all transientBindings.
	 */
	protected void internalLoadTransientBindings() {
		checkDisposed();

		if (transientBindings == null) {
			transientBindings = new ArrayList<IBindingEditpart<?>>();
			for (YBinding yBinding : getModel().getTransientBindings()) {
				IBindingEditpart<?> editPart = getEditpart(yBinding);
				internalAddTransientBinding(editPart);
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of bindings.
	 * 
	 * @param binding
	 *            The editpart to be removed
	 */
	protected void internalRemoveBinding(IBindingEditpart<?> binding) {
		checkDisposed();

		if (bindings != null && binding != null) {
			bindings.remove(binding);
		}

		// unbinds the binding
		binding.unbind();
		binding.dispose();
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of transientBindings.
	 * 
	 * @param binding
	 *            The editpart to be removed
	 */
	protected void internalRemoveTransientBinding(IBindingEditpart<?> binding) {
		checkDisposed();

		if (transientBindings != null && binding != null) {
			transientBindings.remove(binding);
		}

		// unbinds the binding
		binding.unbind();
		binding.dispose();
	}

	@Override
	public List<IBindingEditpart<?>> getBindings() {
		ensureBindingsLoaded();
		return new ArrayList<IBindingEditpart<?>>(bindings);
	}

	public List<IBindingEditpart<?>> getTransientBindings() {
		ensureTransientBindingsLoaded();
		return new ArrayList<IBindingEditpart<?>>(transientBindings);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet, but exist in the model.
			if (bindings != null || getModel().getBindings().size() > 0) {
				List<IBindingEditpart<?>> tempElements = getBindings();
				synchronized (bindings) {
					for (IBindingEditpart<?> binding : tempElements
							.toArray(new IBindingEditpart<?>[tempElements
									.size()])) {
						binding.dispose();
					}
				}
			}
			bindings = null;

			if (transientBindings != null
					|| getModel().getTransientBindings().size() > 0) {
				List<IBindingEditpart<?>> tempElements = getTransientBindings();
				synchronized (transientBindings) {
					for (IBindingEditpart<?> binding : tempElements
							.toArray(new IBindingEditpart<?>[tempElements
									.size()])) {
						binding.dispose();
					}
				}
			}
			transientBindings = null;
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public List<IBindingEditpart<?>> findBindings(Object elementModel) {
		if (!(elementModel instanceof YElement)) {
			return Collections.emptyList();
		}

		List<IBindingEditpart<?>> result = new ArrayList<IBindingEditpart<?>>();
		YBindingSet yBindingSet = getModel();
		for (YBinding yBinding : yBindingSet.getBindings()) {
			if (yBinding.isBindsElement((YElement) elementModel)) {
				result.add((IBindingEditpart<?>) DelegatingEditPartManager
						.getInstance().getEditpart(yBinding));
			}
		}

		for (YBinding yBinding : yBindingSet.getTransientBindings()) {
			if (yBinding.isBindsElement((YElement) elementModel)) {
				result.add((IBindingEditpart<?>) DelegatingEditPartManager
						.getInstance().getEditpart(yBinding));
			}
		}

		return result;
	}

}
