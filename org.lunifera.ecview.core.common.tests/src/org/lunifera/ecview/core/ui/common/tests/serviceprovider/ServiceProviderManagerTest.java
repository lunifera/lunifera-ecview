/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.lunifera.ecview.core.ui.common.tests.serviceprovider;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.context.ContextException;
import org.lunifera.ecview.core.common.context.IConfiguration;
import org.lunifera.ecview.core.common.context.IContext;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.context.IViewSetContext;
import org.lunifera.ecview.core.common.context.ViewContext;
import org.lunifera.ecview.core.common.context.ViewSetContext;
import org.lunifera.ecview.core.common.editpart.ICommandSetEditpart;
import org.lunifera.ecview.core.common.editpart.IDialogEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.presentation.IViewPresentation;
import org.lunifera.ecview.core.common.services.DelegatingServiceProviderManager;
import org.lunifera.ecview.core.common.services.IServiceProvider;
import org.lunifera.ecview.core.common.services.IUiKitBasedService;

/**
 * Tests the {@link DelegatingServiceProviderManager}.
 */
public class ServiceProviderManagerTest {

	DelegatingServiceProviderManager manager = DelegatingServiceProviderManager
			.getInstance();
	String selector;
	InternalContext context;
	InternalViewSetContext viewSetContext;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		manager.clear();
		DummyViewEditpart viewEditpart = new DummyViewEditpart();
		DummyViewSetEditpart viewSetEditpart = new DummyViewSetEditpart();
		viewEditpart.parent = viewSetEditpart;
		context = new InternalContext(viewEditpart);
		viewSetContext = new InternalViewSetContext(viewSetEditpart);
	}

	/**
	 * Tests the add and remove delegating methods.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_serviceProvider() {
		// END SUPRESS CATCH EXCEPTION
		ServiceProvider1 serviceProvider1 = new ServiceProvider1();
		manager.addDelegate(serviceProvider1, null);
		Assert.assertTrue(manager.isFor("Provider1", context));
		Assert.assertFalse(manager.isFor("Provider2", context));
		Assert.assertEquals("Provider1",
				manager.createService("Provider1", context));
		Assert.assertNull(manager.createService("Provider2", context));
		ServiceProvider2 serviceProvider2 = new ServiceProvider2();
		manager.addDelegate(serviceProvider2, null);
		Assert.assertTrue(manager.isFor("Provider2", context));
		Assert.assertTrue(manager.isFor("Provider1", context));
		Assert.assertEquals("Provider2",
				manager.createService("Provider2", context));
		Assert.assertEquals("Provider1",
				manager.createService("Provider1", context));

		manager.removeDelegate(serviceProvider1, null);
		Assert.assertFalse(manager.isFor("Provider1", context));
		Assert.assertTrue(manager.isFor("Provider2", context));
		Assert.assertNull(manager.createService("Provider1", context));
		Assert.assertEquals("Provider2",
				manager.createService("Provider2", context));
		manager.removeDelegate(serviceProvider2, null);
		Assert.assertFalse(manager.isFor("Provider2", context));
		Assert.assertFalse(manager.isFor("Provider1", context));
		Assert.assertNull(manager.createService("Provider2", context));
		Assert.assertNull(manager.createService("Provider1", context));
	}

	/**
	 * Tests the add and remove delegating methods.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_serviceProvider_Properties() {
		// END SUPRESS CATCH EXCEPTION
		manager.clear();

		ServiceProvider1 viewProvider = new ServiceProvider1();
		ServiceProvider2 viewProvider_NoProperty = new ServiceProvider2();
		ServiceProvider3 viewSetProvider = new ServiceProvider3();

		// register for view
		manager.addDelegate(viewProvider, IServiceProvider.VIEW_PROPERTIES);
		manager.addDelegate(viewProvider_NoProperty, null);
		manager.addDelegate(viewSetProvider,
				IServiceProvider.VIEW_SET_PROPERTIES);

		Assert.assertTrue(manager.isFor("Provider1", context));
		Assert.assertFalse(manager.isFor("Provider1", viewSetContext));

		Assert.assertTrue(manager.isFor("Provider2", context));
		Assert.assertFalse(manager.isFor("Provider2", viewSetContext));

		Assert.assertFalse(manager.isFor("Provider3", context));
		Assert.assertTrue(manager.isFor("Provider3", viewSetContext));
	}

	private static class InternalContext extends ViewContext {

		public InternalContext(IViewEditpart viewEditpart) {
			super(viewEditpart);
		}

	}

	private static class InternalViewSetContext extends ViewSetContext {

		public InternalViewSetContext(IViewSetEditpart editPart) {
			super(editPart);
		}
	}

	private class ServiceProvider1 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider1".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) "Provider1";
		}

	}

	private class ServiceProvider2 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider2".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) "Provider2";
		}

	}

	private class ServiceProvider3 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider3".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) "Provider3";
		}
	}

	private static class DummyViewSetEditpart implements IViewSetEditpart {

		IViewSetContext context;

		@Override
		public String getId() {
			return null;
		}

		@Override
		public Object getModel() {
			return null;
		}

		@Override
		public boolean isDisposed() {
			return false;
		}

		@Override
		public void dispose() {

		}

		@Override
		public void addDisposeListener(Listener listener) {

		}

		@Override
		public void removeDisposeListener(Listener listener) {

		}

		@Override
		public IViewSetContext getContext() {
			return context;
		}

		@Override
		public void setContext(IViewSetContext context) {
			this.context = context;
		}

		@Override
		public List<IViewEditpart> getViews() {
			return null;
		}

		@Override
		public void addView(IViewEditpart view) {

		}

		@Override
		public void removeView(IViewEditpart view) {

		}

		@Override
		public boolean isDisposing() {
			return false;
		}

	}

	private static class DummyViewEditpart implements IViewEditpart {

		private IViewContext context;
		private IViewSetEditpart parent;

		@Override
		public String getId() {
			return null;
		}

		@Override
		public Object getModel() {
			return null;
		}

		@Override
		public boolean isDisposed() {
			return false;
		}

		@Override
		public void dispose() {

		}

		@Override
		public void addDisposeListener(Listener listener) {

		}

		@Override
		public void removeDisposeListener(Listener listener) {

		}

		@Override
		public IViewContext getContext() {
			return context;
		}

		@Override
		public void setContext(IViewContext context) throws RuntimeException {
			this.context = context;
		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public void setContent(IEmbeddableEditpart content) {

		}

		@Override
		public void setConfiguration(IConfiguration configuration) {

		}

		@Override
		public void setBindingSet(IBindingSetEditpart bindingSet) {
		}

		@Override
		public IEmbeddableEditpart getContent() {
			return null;
		}

		@Override
		public IViewSetEditpart getParent() {
			return parent;
		}

		@Override
		public <A extends IViewPresentation<?>> A getPresentation() {
			return null;
		}

		@Override
		public IBindingSetEditpart getBindingSet() {
			return null;
		}

		@Override
		public void render(Map<String, Object> options) throws ContextException {

		}

		@Override
		public void exec(Runnable runnable) {

		}

		@Override
		public Future<?> execAsync(Runnable runnable) {
			return null;
		}

		@Override
		public boolean isDisposing() {
			return false;
		}

		@Override
		public void renderChild(IEmbeddableEditpart child) {
			
		}

		@Override
		public void unrenderChild(IEmbeddableEditpart child) {
			
		}

		@Override
		public void disposeChild(IEmbeddableEditpart child) {
			
		}

		@Override
		public List<IExposedActionEditpart> getExposedActions() {
			return null;
		}

		@Override
		public ICommandSetEditpart getCommandSet() {
			return null;
		}

		@Override
		public void setCommandSet(ICommandSetEditpart commandSet) {
			
		}

		@Override
		public <A extends IUiKitBasedService> A createService(
				Class<A> serviceClass) {
			return null;
		}

		@Override
		public void openDialog(IDialogEditpart dialogEditpart,
				IBindableEndpointEditpart inputData) {
			
		}

		@Override
		public void closeDialog(IDialogEditpart dialogEditpart) {
			
		}

		@Override
		public Object findModelElement(String id) {
			return null;
		}
	}

}