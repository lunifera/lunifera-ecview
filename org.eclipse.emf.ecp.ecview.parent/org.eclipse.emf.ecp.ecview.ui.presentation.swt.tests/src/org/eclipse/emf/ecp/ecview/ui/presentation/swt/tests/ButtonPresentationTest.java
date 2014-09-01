/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests;

import static org.junit.Assert.*;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.listener.YButtonClickListener;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IButtonEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ButtonFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class ButtonPresentationTest {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	/**
	 * Tests rendering issues.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_isRendered_unrender_byModel() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> YButton
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YButton yButton = factory.createButton();
		yGridlayout.addElement(yButton);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IButtonEditpart buttonEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yButton);
		IWidgetPresentation<Control> presentation = buttonEditpart
				.getPresentation();
		assertTrue(presentation.isRendered());
		assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yButton);
		assertFalse(presentation.isRendered());
		assertFalse(presentation.isDisposed());
	}

	/**
	 * Tests the internal structure.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YButton
		YView yView = factory.createView();
		YButton yButton = factory.createButton();
		yView.setContent(yButton);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IButtonEditpart buttonEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yButton);
		IWidgetPresentation<Control> presentation = buttonEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();

		Button button = (Button) unwrapButton(baseComposite);

		assertEquals(1, baseComposite.getChildren().length);

		// assert layout and layout data
		GridLayout layout = (GridLayout) baseComposite.getLayout();
		assertEquals(2, layout.numColumns);
		assertEquals(0, layout.marginBottom);
		assertEquals(0, layout.marginLeft);
		assertEquals(0, layout.marginRight);
		assertEquals(0, layout.marginTop);
		assertEquals(5, layout.marginHeight);
		assertEquals(5, layout.marginWidth);

		GridData data = (GridData) button.getLayoutData();
		assertEquals(SWT.FILL, data.horizontalAlignment);
		assertEquals(SWT.FILL, data.verticalAlignment);
		assertEquals(true, data.grabExcessHorizontalSpace);
		assertEquals(true, data.grabExcessVerticalSpace);
		assertEquals(false, data.exclude);
		assertEquals(0, data.horizontalIndent);
		assertEquals(1, data.horizontalSpan);
		assertEquals(0, data.minimumHeight);
		assertEquals(0, data.minimumWidth);
		assertEquals(0, data.verticalIndent);
		assertEquals(1, data.verticalSpan);
		assertEquals(-1, data.widthHint);
	}

	/**
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure__CSS() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YButton
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YButton yButton1 = factory.createButton();
		yButton1.setCssID("ID_0815");
		yButton1.setCssClass("anyOtherClass");
		yLayout.addElement(yButton1);
		YButton yButton2 = factory.createButton();
		yLayout.addElement(yButton2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IButtonEditpart button1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yButton1);
		IButtonEditpart button2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yButton2);
		IWidgetPresentation<Control> button1Presentation = button1Editpart
				.getPresentation();
		IWidgetPresentation<Control> button2Presentation = button2Editpart
				.getPresentation();
		Composite button1BaseComposite = (Composite) button1Presentation
				.getWidget();
		Composite button2BaseComposite = (Composite) button2Presentation
				.getWidget();

		Button button1 = (Button) unwrapButton(button1BaseComposite);
		Button button2 = (Button) unwrapButton(button2BaseComposite);

		// assert css class
		assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL_BASE,
				WidgetElement.getCSSClass(button1BaseComposite));
		assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL_BASE,
				WidgetElement.getCSSClass(button2BaseComposite));

		assertEquals("anyOtherClass", WidgetElement.getCSSClass(button1));
		assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL,
				WidgetElement.getCSSClass(button2));

		// assert css id
		assertEquals("ID_0815",
				WidgetElement.getID(button1BaseComposite));
		assertNull(WidgetElement.getID(button1));
		assertEquals(button2Editpart.getId(),
				WidgetElement.getID(button2BaseComposite));
		assertNull(WidgetElement.getID(button2));
	}

	/**
	 * Tests rendering issues.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_clickListener() throws Exception {
		// END SUPRESS CATCH EXCEPTION

		final int[] clicks = new int[1];

		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> YButton
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YButton yButton = factory.createButton();
		yGridlayout.addElement(yButton);
		yButton.addClickListener(new YButtonClickListener() {
			@Override
			public void clicked(YButton listener) {
				clicks[0]++;
			}
		});
		assertEquals(0, clicks[0]);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IButtonEditpart buttonEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yButton);
		IWidgetPresentation<Control> presentation = buttonEditpart
				.getPresentation();
		Button button = unwrapButton(presentation.getWidget());

		// fire selection event
		button.notifyListeners(SWT.Selection, null);
		assertEquals(1, clicks[0]);
		clicks[0] = 0;

		YButtonClickListener listener = new YButtonClickListener() {
			@Override
			public void clicked(YButton listener) {
				clicks[0]++;
			}
		};
		yButton.addClickListener(listener);
		button.notifyListeners(SWT.Selection, null);
		assertEquals(2, clicks[0]);
		clicks[0] = 0;

		// add same listener twice --> nothing happens
		yButton.addClickListener(listener);
		button.notifyListeners(SWT.Selection, null);
		assertEquals(2, clicks[0]);
		clicks[0] = 0;

		// remove listener again
		yButton.removeClickListener(listener);
		button.notifyListeners(SWT.Selection, null);
		assertEquals(1, clicks[0]);
		clicks[0] = 0;
	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	private Button unwrapButton(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return (Button) composite.getChildren()[0];
		}
		return (Button) control;
	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return control
	 */
	@SuppressWarnings("unchecked")
	protected Control getControl(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (IWidgetPresentation<Control>) ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}