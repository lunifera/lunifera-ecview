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
package org.lunifera.ecview.core.ui.common.tests.editparts.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.core.databinding.observable.IObservable;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.context.ConfigurationAdapter;
import org.lunifera.ecview.core.common.context.ContextException;
import org.lunifera.ecview.core.common.context.IContext;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.context.ViewContext;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IDialogEditpart;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.lunifera.ecview.core.common.editpart.emf.ViewEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityPropertiesEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.presentation.DelegatingPresenterFactory;
import org.lunifera.ecview.core.common.presentation.IPresentationFactory;
import org.lunifera.ecview.core.common.presentation.IViewPresentation;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.common.services.IUiKitBasedService;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class ViewEditpartTest {

	private DelegatingPresenterFactory presenterFactory = DelegatingPresenterFactory
			.getInstance();
	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;
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
		presenterFactory.clear();
		presenterFactory.addDelegate(new PresenterFactory());
	}

	/**
	 * Tests the context.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_context() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		assertNull(viewEditpart.getContext());

		ViewContext context = new ViewContext(viewEditpart);
		assertSame(context, viewEditpart.getContext());
		assertSame(viewEditpart, context.getViewEditpart());
	}

	/**
	 * Tests setContent by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setContent_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		assertNull(view1Editpart.getContent());
		assertNull(layout1Editpart.getParent());
		assertNull(layout1Editpart.getView());

	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setContent_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		assertNull(view1Editpart.getContent());
		assertNull(layout1Editpart.getParent());
		assertNull(layout1Editpart.getView());

	}

	/**
	 * Tests move content by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveContent_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YView view2 = modelFactory.createYView();
		view2.setContent(layout1);
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);

		assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view2Editpart, layout1Editpart.getView());
	}

	/**
	 * Tests move content by edit part.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveContent_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YView view2 = modelFactory.createYView();
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		view2Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view2Editpart, layout1Editpart.getView());
	}

	/**
	 * Tests dispose content.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_disposeContent() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		assertSame(view1Editpart, layout1Editpart.getView());
		assertSame(view1, layout1.getView());

		// dispose the layout
		//
		layout1Editpart.dispose();
		assertFalse(view1Editpart.isDisposed());
		assertTrue(layout1Editpart.isDisposed());

		assertNull(view1Editpart.getContent());
		assertNull(layout1.getParent());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YView view1 = modelFactory.createYView();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		assertFalse(view1Editpart.isDisposed());
		view1Editpart.dispose();
		assertTrue(view1Editpart.isDisposed());

		view1Editpart.isDisposed();
		view1Editpart.dispose();

		try {
			view1Editpart.addDisposeListener(new IDisposable.Listener() {
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
			view1Editpart.setContent(null);
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			view1Editpart.getContent();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.removeDisposeListener(new IDisposable.Listener() {
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
	 * Tests setContent by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBindingSet_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		view1.setBindingSet(bindingSet);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertFalse(bindingSetEditpart.isActive());

		assertSame(bindingSetEditpart, view1Editpart.getBindingSet());
		// parent is null if it is the view
		assertSame(view1Editpart, bindingSetEditpart.getView());
		assertTrue(bindingSetEditpart.isActive());

		// unset the binding set
		//
		view1.setBindingSet(null);
		assertNull(view1Editpart.getBindingSet());
		assertTrue(bindingSetEditpart.isDisposed());
	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBindingSet_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertFalse(bindingSetEditpart.isActive());

		view1Editpart.setBindingSet(bindingSetEditpart);
		assertSame(bindingSetEditpart, view1Editpart.getBindingSet());
		// parent is null if it is the view
		assertSame(view1Editpart, bindingSetEditpart.getView());
		assertTrue(bindingSetEditpart.isActive());

		// unset the layout
		//
		view1.setBindingSet(null);
		assertNull(view1Editpart.getBindingSet());
		assertTrue(bindingSetEditpart.isDisposed());
	}

	/**
	 * Tests setContent by editPart.
	 * 
	 * @throws ContextException
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_configuration() throws ContextException {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		final List<String> callOrder = new ArrayList<String>();
		view1Editpart.setConfiguration(new ConfigurationAdapter() {
			@Override
			public void beforeUiRendering(IContext context) {
				callOrder.add("beforeUiRendering");
			}

			@Override
			public void afterUiRendering(IContext context) {
				callOrder.add("afterUiRendering");
			}

			@Override
			public void beforeBind(IContext context) {
				callOrder.add("beforeBind");
			}

			@Override
			public void afterBind(IContext context) {
				callOrder.add("afterBind");
			}
		});

		view1Editpart.render(null);

		assertEquals("beforeUiRendering", callOrder.get(0));
		assertEquals("afterUiRendering", callOrder.get(1));
		assertEquals("beforeBind", callOrder.get(2));
		assertEquals("afterBind", callOrder.get(3));

	}

	/**
	 * IMPORTANT: Each UI-Kit has to implement this test method too.
	 */
	@Test
	public void testExec() {
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);

		context.exec(new Runnable() {
			@Override
			public void run() {
			}
		});
	}


	@Test
	public void test_addBeanSlotByModel() {
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);
		YView yView = (YView) viewEditpart.getModel();
		assertNull(context.getBeanSlot("myfoo"));

		// add a bean slot
		YBeanSlot yBeanSlot = modelFactory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(List.class);
		yView.getBeanSlots().add(yBeanSlot);

		ISlot slot = context.getBeanSlot("myFoo");
		assertEquals(List.class, slot.getValueType());
	}

	@Test
	public void test_removeBeanSlotByModel() {
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);
		YView yView = (YView) viewEditpart.getModel();
		assertNull(context.getBeanSlot("myFoo"));

		// add a bean slot
		YBeanSlot yBeanSlot = modelFactory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(List.class);
		yView.getBeanSlots().add(yBeanSlot);

		try {
			// remove of bean slot not possible in runtime
			yView.getBeanSlots().remove(yBeanSlot);
			fail("must throw exception!");
		} catch (Exception e) {
		}
		assertNotNull(context.getBeanSlot("myFoo"));
	}

	/**
	 * A helper presentation.
	 */
	@SuppressWarnings("rawtypes")
	private static class Presentation implements IViewPresentation {

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
		public void unrender() {

		}

		@Override
		public Object createWidget(Object parent) {
			return null;
		}

		@Override
		public Object getWidget() {
			return null;
		}

		@Override
		public boolean isRendered() {
			return false;
		}

		@Override
		public void render(Map options) {

		}

		@Override
		public Object getModel() {
			return null;
		}

		@Override
		public IViewContext getViewContext() {
			return null;
		}

		@Override
		public IObservable getObservableValue(Object model) {
			return null;
		}

		@Override
		public void exec(Runnable runnable) {
			runnable.run();
		}

		@Override
		public Future execAsync(Runnable runnable) {
			ExecutorService executor = Executors.newSingleThreadExecutor();
			return executor.submit(runnable);
		}

		@Override
		public Set getUIBindings() {
			return null;
		}

		@Override
		public void resetVisibilityProperties() {
			
		}

		@Override
		public void notifyDatatypeChanged(DatatypeChangeEvent event) {
			
			
		}

		@Override
		public boolean isDisposing() {
			
			return false;
		}

		@Override
		public void apply(IVisibilityHandler handler) {
			
			
		}

		@Override
		public void setContent(IEmbeddableEditpart editpart) {
			
			
		}

		@Override
		public IEmbeddableEditpart getContent() {
			
			return null;
		}

		@Override
		public IUiKitBasedService createService(Class serviceClass) {
			
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
		public void requestFocus(IElementEditpart toFocus) {
			
			
		}

	}

	/**
	 * A helper presenter factory.
	 */
	private static class PresenterFactory implements IPresentationFactory {

		@Override
		public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A extends IWidgetPresentation<?>> A createPresentation(
				IViewContext uiContext, IElementEditpart editpart) {
			return (A) new Presentation();
		}
	}
}
