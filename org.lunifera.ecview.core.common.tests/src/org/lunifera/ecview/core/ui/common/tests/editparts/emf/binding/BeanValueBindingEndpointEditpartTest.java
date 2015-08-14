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
package org.lunifera.ecview.core.ui.common.tests.editparts.emf.binding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.binding.IBeanValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ViewEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class BeanValueBindingEndpointEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private BindingFactory bindingFactory = BindingFactory.eINSTANCE;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager
				.addDelegate(new org.lunifera.ecview.core.common.editpart.emf.EditpartManager());
		editpartManager
				.addDelegate(new org.lunifera.ecview.core.extension.editpart.emf.EditpartManager());

		// initialize default realm
		new DefaultBindingManager.DefaultRealm();
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable_Null() {
		// END SUPRESS CATCH EXCEPTION
		YBeanValueBindingEndpoint yEndpoint = bindingFactory
				.createYBeanValueBindingEndpoint();
		IBeanValueBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		assertNull(editpart.getObservable());
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bs = bindingFactory.createYBindingSet();
		YValueBinding binding = bindingFactory.createYValueBinding();

		Bean bean = new Bean("Test");
		YBeanValueBindingEndpoint yEndpoint = bindingFactory
				.createYBeanValueBindingEndpoint();
		yEndpoint.setBean(bean);
		yEndpoint.setPropertyPath("value");
		binding.setModelEndpoint(yEndpoint);
		bs.addBinding(binding);

		IBeanValueBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableValue value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		bean.setValue("Other");

		assertEquals(1, counter[0]);
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable_Nested() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bs = bindingFactory.createYBindingSet();
		YValueBinding binding = bindingFactory.createYValueBinding();

		Bean inner = new Bean("InnerTest");
		Bean outer = new Bean(inner);
		YBeanValueBindingEndpoint yEndpoint = bindingFactory
				.createYBeanValueBindingEndpoint();
		yEndpoint.setBean(outer);
		yEndpoint.setPropertyPath("inner.value");
		binding.setModelEndpoint(yEndpoint);
		bs.addBinding(binding);

		IBeanValueBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableValue value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		inner.setValue("OtherInner");
		assertEquals(1, counter[0]);

		outer.setInner(new Bean("newInner"));
		assertEquals(2, counter[0]);
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YBeanValueBindingEndpoint yEndpoint = bindingFactory
				.createYBeanValueBindingEndpoint();
		IBeanValueBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);

		assertFalse(editpart.isDisposed());
		editpart.dispose();
		assertTrue(editpart.isDisposed());

		// call twice
		editpart.isDisposed();
		editpart.dispose();

		try {
			editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.getObservable();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			editpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	public class Bean extends AbstractBean {

		private String value;
		private Bean inner;

		public Bean(String value) {
			super();
			this.value = value;
		}

		public Bean(Bean inner) {
			super();
			this.inner = inner;
		}

		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(String value) {
			firePropertyChanged("value", this.value, this.value = value);
		}

		/**
		 * @return the inner
		 */
		public Bean getInner() {
			return inner;
		}

		/**
		 * @param inner
		 *            the inner to set
		 */
		public void setInner(Bean inner) {
			firePropertyChanged("inner", this.inner, this.inner = inner);
		}

	}
}
