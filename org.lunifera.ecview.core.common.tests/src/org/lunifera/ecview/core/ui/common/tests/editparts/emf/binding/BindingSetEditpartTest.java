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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IValueBindingEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ViewEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.util.SimpleExtensionModelFactory;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class BindingSetEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private BindingFactory bindingFactory = BindingFactory.eINSTANCE;
	private SimpleExtensionModelFactory elementFactory = new SimpleExtensionModelFactory();

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
	}

	/**
	 * Tests the activation.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bindAll() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);

		assertFalse(bindingSetEditpart.isActive());
		bindingSetEditpart.activate();
		assertTrue(bindingSetEditpart.isActive());

		bindingSetEditpart.dispose();
	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getView() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = CoreModelFactory.eINSTANCE.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		view1.setBindingSet(bindingSet);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertEquals(view1Editpart, bindingSetEditpart.getView());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);

		assertFalse(bindingSetEditpart.isDisposed());
		bindingSetEditpart.dispose();
		assertTrue(bindingSetEditpart.isDisposed());

		bindingSetEditpart.isDisposed();
		bindingSetEditpart.dispose();

		try {
			bindingSetEditpart.addDisposeListener(new IDisposable.Listener() {
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
			bindingSetEditpart.activate();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingSetEditpart.isActive();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart
					.removeDisposeListener(new IDisposable.Listener() {
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

	/**
	 * Tests add and remove.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addRemoveBinding_byModel() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		YValueBinding binding = bindingFactory.createYValueBinding();
		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2 = bindingFactory.createYBeanValueBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");
		binding.setModelEndpoint(ep1);
		binding.setTargetEndpoint(ep2);
		bindingSet.addBinding(binding);

		// test binded
		bean1.setValue("test1");
		assertEquals("test1", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(binding);
		assertFalse(bindingSetEditpart.isActive());
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// remove the binding
		//
		bindingSet.removeBinding(binding);
		// test unbinded
		bean1.setValue("test2");
		assertEquals("test2", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}

	/**
	 * Tests add and remove.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addRemoveBinding_byModel_II() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2 = bindingFactory.createYBeanValueBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");

		// use helper method
		YValueBinding binding = bindingSet.addBinding(ep1, ep2);

		// test binded
		bean1.setValue("test1");
		assertEquals("test1", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(binding);
		assertFalse(bindingSetEditpart.isActive());
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// remove the binding
		//
		bindingSet.removeBinding(binding);
		// test unbinded
		bean1.setValue("test2");
		assertEquals("test2", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}

	/**
	 * Tests adding a binding. But the binding set is not initialized yet!
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addRemoveBinding_byModel__but_BindingSet_NotInitialized() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();

		YValueBinding binding = bindingFactory.createYValueBinding();
		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2 = bindingFactory.createYBeanValueBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");
		binding.setModelEndpoint(ep1);
		binding.setTargetEndpoint(ep2);
		bindingSet.addBinding(binding);

		//
		// initialize the binding set late
		//
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		// test binded
		bean1.setValue("test1");
		assertEquals("test1", bean1.getValue());
		assertEquals("value", bean2.getValue());

		// activate binding set
		bindingSetEditpart.activate();
		bean1.setValue("test2");
		assertEquals("test2", bean1.getValue());
		assertEquals("test2", bean2.getValue());

		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(binding);
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// remove the binding
		//
		bindingSet.removeBinding(binding);
		// test unbinded
		bean1.setValue("test3");
		assertEquals("test3", bean1.getValue());
		assertEquals("test2", bean2.getValue());

		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}

	/**
	 * Tests add and remove.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addRemoveBinding_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		// create binding
		YValueBinding binding = bindingFactory.createYValueBinding();
		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2 = bindingFactory.createYBeanValueBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");
		binding.setModelEndpoint(ep1);
		binding.setTargetEndpoint(ep2);

		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(binding);
		assertFalse(bindingSetEditpart.isActive());

		bindingSetEditpart.addBinding(bindingEditpart);
		// test binded
		bean1.setValue("test1");
		assertEquals("test1", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		assertFalse(bindingSetEditpart.isActive());
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// unset the layout
		//
		bindingSet.removeBinding(binding);
		// test unbinded
		bean1.setValue("test2");
		assertEquals("test2", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}

	/**
	 * Tests getBindings method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getBindings() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		// add binding 1
		YValueBinding binding = bindingFactory.createYValueBinding();
		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2 = bindingFactory.createYBeanValueBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");
		binding.setModelEndpoint(ep1);
		binding.setTargetEndpoint(ep2);
		bindingSet.addBinding(binding);

		// add binding 2
		YValueBinding binding2 = bindingFactory.createYValueBinding();
		Bean bean2_1 = new Bean("value");
		Bean bean2_2 = new Bean("value");
		YBeanValueBindingEndpoint ep2_1 = bindingFactory
				.createYBeanValueBindingEndpoint();
		YBeanValueBindingEndpoint ep2_2 = bindingFactory
				.createYBeanValueBindingEndpoint();
		ep2_1.setBean(bean2_1);
		ep2_1.setPropertyPath("value");
		ep2_2.setBean(bean2_2);
		ep2_2.setPropertyPath("value");
		binding2.setModelEndpoint(ep2_1);
		binding2.setTargetEndpoint(ep2_2);
		bindingSet.addBinding(binding2);

		List<IBindingEditpart<?>> bindings = bindingSetEditpart.getBindings();
		assertSame(binding, bindings.get(0).getModel());
		assertSame(binding2, bindings.get(1).getModel());

		// remove the binding
		//
		bindingSet.removeBinding(binding);
		bindings = bindingSetEditpart.getBindings();
		assertEquals(1, bindings.size());
		assertSame(binding2, bindings.get(0).getModel());
	}

	@Test
	public void test_findBindingsFor() {

		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		YTextField text1 = elementFactory.createTextField();

		// add binding 1
		YValueBinding binding = bindingFactory.createYValueBinding();
		Bean bean1 = new Bean("value");
		YBeanValueBindingEndpoint ep1 = bindingFactory.createYBeanValueBindingEndpoint();
		YEmbeddableValueEndpoint ep2 = text1.createValueEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		binding.setModelEndpoint(ep1);
		binding.setTargetEndpoint(ep2);
		bindingSet.addBinding(binding);

		List<IBindingEditpart<?>> result = bindingSetEditpart
				.findBindings(text1);
		Assert.assertEquals(1, result.size());
		IBindingEditpart<?> bindingResult = result.get(0);
		Assert.assertSame(bindingResult.getModelEndpoint().getModel(), ep1);
		Assert.assertSame(bindingResult.getTargetEndpoint().getModel(), ep2);
		Assert.assertSame(binding, bindingResult.getModel());

	}

	public class Bean extends AbstractBean {

		private String value;

		public Bean(String value) {
			super();
			this.value = value;
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

	}
}
