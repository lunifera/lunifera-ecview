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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.context.ViewSetContext;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ViewSetEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * Tetst the {@link ViewSetEditpart}.
 * 
 * @author admin
 * 
 */
@SuppressWarnings("restriction")
public class ViewSetEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;

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
	 * Tests the context.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_context() {
		// END SUPRESS CATCH EXCEPTION
		IViewSetEditpart viewSetEditpart = (IViewSetEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI,
						IViewSetEditpart.class);
		Assert.assertNull(viewSetEditpart.getContext());

		ViewSetContext context = new ViewSetContext(viewSetEditpart);
		Assert.assertSame(context, viewSetEditpart.getContext());
		Assert.assertSame(viewSetEditpart, context.getViewSetEditpart());
	}

	/**
	 * Tests add and remove of views.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addAndRemoveView() {
		// END SUPRESS CATCH EXCEPTION

		// ...> viewSet
		// ......> view1
		YViewSet viewSet = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		viewSet.getViews().add(view1);
		IViewSetEditpart viewSetEditpart = (IViewSetEditpart) editpartManager
				.getEditpart(viewSet);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

		// ...> viewSet
		// ......> view1
		// ......> view2
		// add by model
		YView view2 = modelFactory.createYView();
		viewSet.getViews().add(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// add model twice
		viewSet.getViews().add(view2);
		Assert.assertEquals(2, viewSet.getViews().size());
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// ...> viewSet
		// ......> view1
		// ......> view2
		// ......> view3
		// add by edit part
		IViewEditpart view3Editpart = editpartManager.createEditpart(
				CoreModelPackage.eNS_URI, IViewEditpart.class);
		viewSetEditpart.addView(view3Editpart);
		Assert.assertEquals(3, viewSetEditpart.getViews().size());

		// add edit part twice
		viewSetEditpart.addView(view3Editpart);
		Assert.assertEquals(3, viewSet.getViews().size());
		Assert.assertEquals(3, viewSetEditpart.getViews().size());

		// remove by model
		viewSet.getViews().remove(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// remove by model twice
		viewSet.getViews().remove(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// remove by edit part
		viewSetEditpart.removeView(view3Editpart);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

		// remove by edit part twice
		viewSetEditpart.removeView(view3Editpart);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

	}

	/**
	 * Tests the move from embedded elements by the model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveEmbedded_byModel() {
		// END SUPRESS CATCH EXCEPTION

		// ...> viewSet1
		// ......> view1
		// ...> viewSet2
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		YViewSet viewSet2 = modelFactory.createYViewSet();
		viewSet1.getViews().add(view1);
		IViewSetEditpart viewSet1Editpart = (IViewSetEditpart) editpartManager
				.getEditpart(viewSet1);
		IViewSetEditpart viewSet2Editpart = (IViewSetEditpart) editpartManager
				.getEditpart(viewSet2);
		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertEquals(0, viewSet2Editpart.getViews().size());

		// move it
		//
		viewSet2.getViews().add(view1);
		Assert.assertEquals(0, viewSet1.getViews().size());
		Assert.assertEquals(1, viewSet2.getViews().size());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertEquals(1, viewSet2Editpart.getViews().size());
	}

	@Test
	public void test_addBeanSlotByModel() {
		IViewSetEditpart viewSetEditpart = (IViewSetEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI,
						IViewSetEditpart.class);
		ViewSetContext context = new ViewSetContext(viewSetEditpart);
		YViewSet yViewSet = (YViewSet) viewSetEditpart.getModel();
		assertNull(context.getBeanSlot("myfoo"));

		// add a bean slot
		YBeanSlot yBeanSlot = modelFactory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(List.class);
		yViewSet.getBeanSlots().add(yBeanSlot);

		ISlot slot = context.getBeanSlot("myFoo");
		assertEquals(List.class, slot.getValueType());
	}

	@Test
	public void test_removeBeanSlotByModel() {
		IViewSetEditpart viewSetEditpart = (IViewSetEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI,
						IViewSetEditpart.class);
		ViewSetContext context = new ViewSetContext(viewSetEditpart);
		YViewSet yViewSet = (YViewSet) viewSetEditpart.getModel();
		assertNull(context.getBeanSlot("myFoo"));

		// add a bean slot
		YBeanSlot yBeanSlot = modelFactory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(List.class);
		yViewSet.getBeanSlots().add(yBeanSlot);

		try {
			// remove of bean slot not possible in runtime
			yViewSet.getBeanSlots().remove(yBeanSlot);
			fail("must throw exception!");
		} catch (Exception e) {
		}
		assertNotNull(context.getBeanSlot("myFoo"));
	}

	/**
	 * Tests the move of embedded elements by the editpart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveEmbedded_byEditpart() {
		// END SUPRESS CATCH EXCEPTION

		// ...> viewSet1
		// ......> view1
		// ...> viewSet2
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		YViewSet viewSet2 = modelFactory.createYViewSet();
		viewSet1.getViews().add(view1);
		IViewSetEditpart viewSet1Editpart = editpartManager
				.getEditpart(viewSet1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IViewSetEditpart viewSet2Editpart = editpartManager
				.getEditpart(viewSet2);
		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertEquals(0, viewSet2Editpart.getViews().size());

		// move it
		//
		viewSet2Editpart.addView(view1Editpart);
		Assert.assertEquals(0, viewSet1.getViews().size());
		Assert.assertEquals(1, viewSet2.getViews().size());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertEquals(1, viewSet2Editpart.getViews().size());
	}

	/**
	 * Tests the unmodifiable state of the views.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getViews_unmodifyable() {
		// END SUPRESS CATCH EXCEPTION
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		IViewSetEditpart viewSet1Editpart = editpartManager
				.getEditpart(viewSet1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		try {
			viewSet1Editpart.getViews().add(view1Editpart);
			Assert.fail("Must be unmodifieable");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests the disposal of views.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_disposeView() {
		// END SUPRESS CATCH EXCEPTION

		// ...> viewSet1
		// ......> view1
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		viewSet1.getViews().add(view1);
		IViewSetEditpart viewSet1Editpart = editpartManager
				.getEditpart(viewSet1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertSame(viewSet1Editpart, view1Editpart.getParent());
		Assert.assertSame(viewSet1, view1.getRoot());

		// dispose the view
		//
		view1Editpart.dispose();
		Assert.assertFalse(viewSet1Editpart.isDisposed());
		Assert.assertTrue(view1Editpart.isDisposed());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertNull(view1.getRoot());
	}

	/**
	 * Tests the dispose.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION

		// ...> viewSet1
		// ......> view1
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YView view1 = modelFactory.createYView();
		viewSet1.getViews().add(view1);
		IViewSetEditpart viewSet1Editpart = editpartManager
				.getEditpart(viewSet1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		Assert.assertFalse(viewSet1Editpart.isDisposed());
		Assert.assertFalse(view1Editpart.isDisposed());
		viewSet1Editpart.dispose();
		Assert.assertTrue(viewSet1Editpart.isDisposed());
		Assert.assertTrue(view1Editpart.isDisposed());

		viewSet1Editpart.isDisposed();
		viewSet1Editpart.dispose();

		try {
			viewSet1Editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			viewSet1Editpart.addView(view1Editpart);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			viewSet1Editpart.getViews();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			viewSet1Editpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			viewSet1Editpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			viewSet1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			viewSet1Editpart.removeView(view1Editpart);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

	}
}
