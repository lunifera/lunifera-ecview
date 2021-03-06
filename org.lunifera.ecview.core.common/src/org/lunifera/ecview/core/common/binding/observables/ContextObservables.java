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
package org.lunifera.ecview.core.common.binding.observables;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.beans.IBeanRegistry;
import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.services.IServiceRegistry;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class ContextObservables {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ContextObservables.class);
	private static ContextObservables instance = new ContextObservables();

	private final List<DelegateInfo> delegateInfos = Collections
			.synchronizedList(new ArrayList<DelegateInfo>());

	private ContextObservables() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static ContextObservables getInstance() {
		return instance;
	}

	/**
	 * Removes all delegate. Should only be used very carefully.
	 */
	public void clear() {
		delegateInfos.clear();
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(IBeanRegistry registry,
			URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(registry,
				bindingURI);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(Realm realm,
			IBeanRegistry registry, URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(realm, registry,
				bindingURI);
	}

	/**
	 * Returns an observable list tracking the nested value of the context
	 * described by the binding URI.
	 * 
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @param elementType
	 *            the element type contained in the list.
	 * @return an observable list tracking the nested value of the context
	 *         described by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableList observeList(IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {
		return ContextObservables.getInstance().doObserveList(registry,
				bindingURI, elementType);
	}

	/**
	 * Returns an observable list tracking the nested value of the context
	 * described by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @param elementType
	 *            the element type contained in the list.
	 * @return an observable list tracking the nested value of the context
	 *         described by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableList observeList(Realm realm,
			IBeanRegistry registry, URI bindingURI, Class<?> elementType) {
		return ContextObservables.getInstance().doObserveList(realm, registry,
				bindingURI, elementType);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(IBeanRegistry registry,
			URI bindingURI) {
		IContextBindingDelegate delegate = getDelegate(registry, bindingURI);
		if (delegate != null) {
			return delegate.observeValue(registry, bindingURI);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns an observable list tracking the nested value of the context
	 * described by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable list tracking the nested value of the context
	 *         described by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(Realm realm,
			IBeanRegistry registry, URI bindingURI) {
		IContextBindingDelegate delegate = getDelegate(registry, bindingURI);
		if (delegate != null) {
			return delegate.observeValue(realm, registry, bindingURI);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns an observable list tracking the nested value of the context
	 * described by the binding URI.
	 * 
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @param elementType
	 *            the element type contained in the list.
	 * @return an observable list tracking the nested value of the context
	 *         described by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableList doObserveList(IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {
		IContextBindingDelegate delegate = getDelegate(registry, bindingURI);
		if (delegate != null) {
			return delegate.observeList(registry, bindingURI, elementType);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param registry
	 *            the registry.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @param elementType
	 *            the element type contained in the list.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableList doObserveList(Realm realm,
			IBeanRegistry registry, URI bindingURI, Class<?> elementType) {
		IContextBindingDelegate delegate = getDelegate(registry, bindingURI);
		if (delegate != null) {
			return delegate.observeList(realm, registry, bindingURI, elementType);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns the delegate for the given information.
	 * 
	 * @param registry
	 * @param bindingURI
	 * @return
	 */
	public IContextBindingDelegate getDelegate(IBeanRegistry registry,
			URI bindingURI) {
		for (DelegateInfo info : delegateInfos
				.toArray(new DelegateInfo[delegateInfos.size()])) {
			IContextBindingDelegate delegate = info.delegate;
			if (delegate.isFor(registry, bindingURI)) {
				return delegate;
			}
		}
		return null;
	}

	/**
	 * Adds a new delegate to the manager. The lower the sequence the earlier
	 * the delegate will be used.
	 * 
	 * @param sequence
	 *            the sequence of the delegate
	 * @param delegate
	 *            delegate to be added
	 */
	public void addDelegate(int sequence, IContextBindingDelegate delegate) {
		if (!containsDelegate(delegate)) {
			delegateInfos.add(new DelegateInfo(sequence, delegate));
			Collections.sort(delegateInfos);
		}
	}

	/**
	 * Returns the sequence for the given delegate.
	 * 
	 * @param delegate
	 * @return
	 */
	public int getSequence(IContextBindingDelegate delegate) {
		DelegateInfo info = findDelegateInfo(delegate);
		return info != null ? info.sequence : -1;
	}

	/**
	 * Returns true if the delegate is contained in the list of delegate infos.
	 * 
	 * @param delegate
	 * @return
	 */
	protected boolean containsDelegate(IContextBindingDelegate delegate) {
		synchronized (delegateInfos) {
			for (DelegateInfo info : delegateInfos) {
				if (info.delegate == delegate) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns the delegate info if the delegate is contained in the list of
	 * delegate infos. Otherwise returns <code>null</code>.
	 * 
	 * @param info
	 * @return
	 */
	protected DelegateInfo findDelegateInfo(IContextBindingDelegate delegate) {
		synchronized (delegateInfos) {
			for (DelegateInfo info : delegateInfos) {
				if (info.delegate == delegate) {
					return info;
				}
			}
		}
		return null;
	}

	/**
	 * Removes the delegate from the manager.
	 * 
	 * @param delegate
	 *            delegate to be removed
	 */
	public void removeDelegate(IContextBindingDelegate delegate) {
		if (delegate == null) {
			return;
		}
		synchronized (delegateInfos) {
			for (Iterator<DelegateInfo> iterator = delegateInfos.iterator(); iterator
					.hasNext();) {
				DelegateInfo info = (DelegateInfo) iterator.next();
				if (info.delegate == delegate) {
					iterator.remove();
					return;
				}
			}
		}
	}

	/**
	 * The OSGi component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void activate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void deactivate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be added.
		 * @param properties
		 *            OSGi service properties.
		 */
		protected void addDelegate(IContextBindingDelegate delegate,
				Map<String, ?> properties) {
			int sequence = IServiceRegistry.PROPERTY__DEFAULT_SQUENCE;
			if (properties.containsKey(IServiceRegistry.PROPERTY__SQUENCE)) {
				sequence = (Integer) properties
						.get(IServiceRegistry.PROPERTY__SQUENCE);
			}
			ContextObservables.getInstance().addDelegate(sequence, delegate);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be removed.
		 */
		protected void removeDelegate(IContextBindingDelegate delegate) {
			ContextObservables.getInstance().removeDelegate(delegate);
		}
	}

	private static class DelegateInfo implements Comparable<DelegateInfo> {
		private final int sequence;
		private final IContextBindingDelegate delegate;

		private DelegateInfo(int sequence, IContextBindingDelegate delegate) {
			super();
			this.sequence = sequence;
			this.delegate = delegate;
		}

		@Override
		public int compareTo(DelegateInfo o) {
			return sequence - o.sequence;
		}
	}
}
