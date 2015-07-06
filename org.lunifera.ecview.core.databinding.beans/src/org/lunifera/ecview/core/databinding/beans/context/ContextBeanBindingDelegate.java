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
package org.lunifera.ecview.core.databinding.beans.context;

import java.beans.PropertyChangeListener;
import java.net.URI;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.beans.IBeanRegistry;
import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.binding.observables.ContextBindingDelegate;
import org.lunifera.ecview.core.common.uri.AccessibleScope;
import org.lunifera.ecview.core.common.uri.BeanScope;
import org.lunifera.ecview.core.common.uri.URIHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextBeanBindingDelegate extends ContextBindingDelegate {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ContextBeanBindingDelegate.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IBeanRegistry registry, URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		BeanScope beanScope = scope.getBeanScope();
		if (beanScope == null) {
			return false;
		}
		ISlot slot = beanScope.accessBeanSlot(registry);
		// TODO: if attribute.path == 1 --> use bean binding since slot is
		// observable
		if (slot == null || !hasPropertyChangeSupport(slot.getValueType())) {
			return false;
		}

		return true;
	}

	/**
	 * Returns true, if the bean has property change support.
	 * 
	 * @param valueType
	 * @return
	 */
	protected boolean hasPropertyChangeSupport(Class<?> valueType) {
		if (valueType == null) {
			return false;
		}
		try {
			try {
				valueType.getMethod("addPropertyChangeListener", new Class[] {
						String.class, PropertyChangeListener.class });
				return true;
			} catch (NoSuchMethodException e) {
				valueType.getMethod("addPropertyChangeListener",
						new Class[] { PropertyChangeListener.class });
				return true;
			}
		} catch (SecurityException e) {
			LOGGER.error("{}", e);
			throw new IllegalStateException(e);
		} catch (NoSuchMethodException e) {
		} catch (Throwable e) {
			LOGGER.error("{}", e);
			throw new IllegalStateException(e);
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(IBeanRegistry registry, URI bindingURI) {
		return observeValue(Realm.getDefault(), registry, bindingURI);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(Realm realm, IBeanRegistry registry,
			URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		String beanFragment = scope.getBeanFragment();

		// if value-property was references inside the slot, then return the
		// observable
		if (beanFragment == null || beanFragment.equals("")
				|| beanFragment.equals(ISlot.PROP_VALUE)) {
			return BeanProperties.value(slot.getClass(), ISlot.PROP_VALUE,
					slot.getValueType()).observe(realm, slot);
		} else {
			// normalize bean fragment
			beanFragment = AccessibleScope
					.removeSlotValueFragmentToken(beanFragment);
			if (beanFragment.equals("")) {
				// if no bean fragment was specified, then the bean slot is
				// addressed and it can not be observed since it is stable.
				return null;
			} else {
				// observe master
				//
				IObservableValue slotObservable = BeansObservables
						.observeValue(realm, slot, ISlot.PROP_VALUE);

				// observe detail
				//
				return BeansObservables.observeDetailValue(slotObservable,
						slot.getValueType(), beanFragment, null);
			}
		}
	}

	@Override
	public IObservableList observeList(IBeanRegistry registry, URI bindingURI,
			Class<?> elementType) {
		return observeList(Realm.getDefault(), registry, bindingURI,
				elementType);
	}

	@Override
	public IObservableList observeList(Realm realm, IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		String beanFragment = scope.getBeanFragment();
		// if value-property was references inside the slot, then return the
		// observable
		if (beanFragment.equals(ISlot.PROP_VALUE)) {
			return BeanProperties.list(slot.getClass(), ISlot.PROP_VALUE,
					elementType).observe(realm, slot);
		} else {
			// normalize bean fragment
			beanFragment = AccessibleScope
					.removeSlotValueFragmentToken(beanFragment);
			if (beanFragment.equals("")) {
				// if no bean fragment was specified, then the bean slot is
				// addressed and it can not be observed since it is stable.
				return null;
			} else {
				// observe master
				//
				IObservableValue slotObservable = BeanProperties.value(
						slot.getClass(), ISlot.PROP_VALUE, slot.getValueType())
						.observe(realm, slot);

				// observe detail
				//
				return BeansObservables.observeDetailList(slotObservable,
						beanFragment, elementType);
			}
		}
	}
}
