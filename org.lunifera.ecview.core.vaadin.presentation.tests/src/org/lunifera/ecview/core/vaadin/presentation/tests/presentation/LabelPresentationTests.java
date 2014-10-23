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
package org.lunifera.ecview.core.vaadin.presentation.tests.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.common.context.ContextException;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.util.SimpleExtensionModelFactory;
import org.lunifera.ecview.core.ui.core.editparts.extension.ILabelEditpart;
import org.lunifera.ecview.core.vaadin.presentation.VaadinRenderer;
import org.lunifera.ecview.core.vaadin.presentation.internal.AbstractVaadinWidgetPresenter;
import org.lunifera.ecview.core.vaadin.presentation.internal.LabelPresentation;
import org.lunifera.ecview.core.vaadin.presentation.tests.model.ValueBean;
import org.osgi.framework.BundleException;
import org.osgi.service.cm.ConfigurationException;

import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * Tests the {@link LabelPresentation}.
 */
@SuppressWarnings("restriction")
public class LabelPresentationTests {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private CssLayout rootLayout = new CssLayout();

	/**
	 * Setup tests.
	 * 
	 * @throws ConfigurationException
	 * @throws BundleException
	 */
	@Before
	public void setup() throws ConfigurationException, BundleException {
		UI.setCurrent(new DefaultUI());
		UI.getCurrent().setContent(rootLayout);
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
		// .........> yLabel
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YLabel yLabel = factory.createLabel();
		yGridlayout.getElements().add(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart textEditpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = textEditpart
				.getPresentation();
		assertTrue(presentation.isRendered());
		assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yLabel);
		assertFalse(presentation.isRendered());
		assertFalse(presentation.isDisposed());
	}

	/**
	 * Tests the internal structure.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yLabel
		YView yView = factory.createView();
		YLabel yLabel = factory.createLabel();
		yView.setContent(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart textEditpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = textEditpart
				.getPresentation();
		ComponentContainer baseComponentContainer = (ComponentContainer) presentation
				.getWidget();

		Label label = (Label) unwrapLabel(baseComponentContainer);
		assertEquals(1, baseComponentContainer.getComponentCount());

		// assert layout
		CssLayout layout = (CssLayout) baseComponentContainer;
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
		// ......> yLabel
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YLabel yLabel1 = factory.createLabel();
		yLabel1.setCssID("ID_0815");
		yLabel1.setCssClass("anyOtherClass");
		yLayout.getElements().add(yLabel1);
		YLabel yLabel2 = factory.createLabel();
		yLayout.getElements().add(yLabel2);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart text1Editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel1);
		ILabelEditpart text2Editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel2);
		IWidgetPresentation<Component> text1Presentation = text1Editpart
				.getPresentation();
		IWidgetPresentation<Component> text2Presentation = text2Editpart
				.getPresentation();
		ComponentContainer text1BaseComponentContainer = (ComponentContainer) text1Presentation
				.getWidget();
		ComponentContainer text2BaseComponentContainer = (ComponentContainer) text2Presentation
				.getWidget();

		Label label1 = (Label) unwrapLabel(text1BaseComponentContainer);
		Label label2 = (Label) unwrapLabel(text2BaseComponentContainer);

		// assert css class
		assertTrue(text1BaseComponentContainer.getStyleName().contains(
				AbstractVaadinWidgetPresenter.CSS_CLASS_CONTROL_BASE));
		assertTrue(text2BaseComponentContainer.getStyleName().contains(
				AbstractVaadinWidgetPresenter.CSS_CLASS_CONTROL_BASE));

		assertTrue(label1.getStyleName().contains("anyOtherClass"));
		assertTrue(label2.getStyleName().contains(
				AbstractVaadinWidgetPresenter.CSS_CLASS_CONTROL));

		// assert css id
		assertEquals("ID_0815", text1BaseComponentContainer.getId());
		assertNull(label1.getId());
		assertEquals(text2Editpart.getId(), text2BaseComponentContainer.getId());
		assertNull(label2.getId());
	}

	/**
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_Bindings() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yLabel
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YLabel yLabel1 = factory.createLabel();
		yLayout.getElements().add(yLabel1);
		YLabel yLabel2 = factory.createLabel();
		yLayout.getElements().add(yLabel2);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart label1Editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel1);
		ILabelEditpart label2Editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel2);
		IWidgetPresentation<Component> text1Presentation = label1Editpart
				.getPresentation();
		IWidgetPresentation<Component> text2Presentation = label2Editpart
				.getPresentation();
		ComponentContainer text1BaseComponentContainer = (ComponentContainer) text1Presentation
				.getWidget();
		ComponentContainer text2BaseComponentContainer = (ComponentContainer) text2Presentation
				.getWidget();
		Label label1 = (Label) unwrapLabel(text1BaseComponentContainer);
		Label label2 = (Label) unwrapLabel(text2BaseComponentContainer);

		// start tests
		//
		assertTrue(label1.isVisible());
		assertTrue(label1.isEnabled());
		assertFalse(label1.isReadOnly());

		assertTrue(label2.isVisible());
		assertTrue(label2.isEnabled());
		assertFalse(label2.isReadOnly());

		yLabel1.setVisible(false);
		assertFalse(label1.isVisible());

		yLabel1.setEnabled(false);
		assertFalse(label1.isEnabled());

	}

	/**
	 * Test the automatic disposal of bindings
	 * 
	 * @throws ContextException
	 */
	@Test
	public void testBindingIsDisposed() throws ContextException {
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YLabel yLabel = factory.createLabel();
		yGridlayout.getElements().add(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart textEditpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = textEditpart
				.getPresentation();
		assertTrue(presentation.isRendered());
		assertFalse(presentation.isDisposed());
		assertEquals(3, presentation.getUIBindings().size());

		presentation.dispose();
		assertFalse(presentation.isRendered());
		assertTrue(presentation.isDisposed());
		assertEquals(0, presentation.getUIBindings().size());
	}

	@Test
	public void test_i18n() throws ContextException {

		// switch the global locale to german
		Locale.setDefault(Locale.GERMAN);

		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YLabel yLabel = factory.createLabel();
		yGridlayout.getElements().add(yLabel);

		// set the i18n key
		yLabel.setLabelI18nKey(TestI18nService.KEY__AGE);

		// prepare the I18nService and pass it to the renderer
		Map<String, Object> parameter = new HashMap<String, Object>();
		Map<String, Object> services = new HashMap<String, Object>();
		parameter.put(IViewContext.PARAM_SERVICES, services);
		services.put(II18nService.ID, new TestI18nService());

		VaadinRenderer renderer = new VaadinRenderer();
		IViewContext context = renderer.render(rootLayout, yView, parameter);
		ILabelEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		LabelPresentation presentation = editpart.getPresentation();

		assertEquals("Alter", presentation.getWidget().getCaption());

		context.setLocale(Locale.ENGLISH);
		assertEquals("Age", presentation.getWidget().getCaption());
	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_Readonly_Binding() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YLabel yLabel = factory.createLabel();
		yLayout.getElements().add(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = editpart
				.getPresentation();
		Label label = (Label) unwrapLabel(presentation.getWidget());

		ValueBean bean = new ValueBean(false);
		YBeanValueBindingEndpoint yBeanBinding = factory
				.createBeanBindingEndpoint();
		yBeanBinding.setBean(bean);
		yBeanBinding.setPropertyPath("boolValue");
		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yLabel.createEditableEndpoint(), yBeanBinding);

		// test binding
		assertFalse(yLabel.isEditable());
		assertFalse(!label.isReadOnly());
		assertFalse(bean.isBoolValue());

		bean.setBoolValue(true);
		assertTrue(yLabel.isEditable());
		assertTrue(!label.isReadOnly());
		assertTrue(bean.isBoolValue());
	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_Visible_Binding() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YLabel yLabel = factory.createLabel();
		yLayout.getElements().add(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = editpart
				.getPresentation();
		Label label = (Label) unwrapLabel(presentation.getWidget());

		ValueBean bean = new ValueBean(false);
		YBeanValueBindingEndpoint yBeanBinding = factory
				.createBeanBindingEndpoint();
		yBeanBinding.setBean(bean);
		yBeanBinding.setPropertyPath("boolValue");
		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yLabel.createVisibleEndpoint(), yBeanBinding);

		// test binding
		assertFalse(yLabel.isVisible());
		assertFalse(label.isVisible());
		assertFalse(bean.isBoolValue());

		bean.setBoolValue(true);
		assertTrue(yLabel.isVisible());
		assertTrue(label.isVisible());
		assertTrue(bean.isBoolValue());
	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_Enabled_Binding() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YLabel yLabel = factory.createLabel();
		yLayout.getElements().add(yLabel);

		VaadinRenderer renderer = new VaadinRenderer();
		renderer.render(rootLayout, yView, null);

		ILabelEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yLabel);
		IWidgetPresentation<Component> presentation = editpart
				.getPresentation();
		Label label = (Label) unwrapLabel(presentation.getWidget());

		ValueBean bean = new ValueBean(false);
		YBeanValueBindingEndpoint yBeanBinding = factory
				.createBeanBindingEndpoint();
		yBeanBinding.setBean(bean);
		yBeanBinding.setPropertyPath("boolValue");
		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yLabel.createEnabledEndpoint(), yBeanBinding);

		// test binding
		assertFalse(yLabel.isEnabled());
		assertFalse(label.isEnabled());
		assertFalse(bean.isBoolValue());

		bean.setBoolValue(true);
		assertTrue(yLabel.isEnabled());
		assertTrue(label.isEnabled());
		assertTrue(bean.isBoolValue());
	}

	/**
	 * Unwraps the component from its parent composite.
	 * 
	 * @param component
	 * @return
	 */
	private Component unwrapLabel(Component component) {
		if (component instanceof ComponentContainer) {
			ComponentContainer composite = (ComponentContainer) component;
			Iterator<Component> iter = composite.iterator();
			return iter.next();
		}
		return component;
	}

	/**
	 * Returns the component for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return component
	 */
	@SuppressWarnings("unchecked")
	protected Component getComponent(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		IWidgetPresentation<Component> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (IWidgetPresentation<Component>) ((IViewEditpart) editpart)
					.getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Component widget = presentation.getWidget();
		return widget;
	}
}
