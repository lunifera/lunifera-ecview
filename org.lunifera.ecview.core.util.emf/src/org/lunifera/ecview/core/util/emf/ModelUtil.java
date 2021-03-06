
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



package org.lunifera.ecview.core.util.emf;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.Binding;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.context.IViewSetContext;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IValueBindingEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YEnumListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YValueBindable;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.notification.ILifecycleService;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.common.uri.URIHelper;

public class ModelUtil {

	/**
	 * Returns the editpart for the given element.
	 * 
	 * @param yElement
	 * @return editpart - the controller class of the element
	 */
	public static <A extends IElementEditpart> A getEditpart(YElement yElement) {
		return DelegatingEditPartManager.getInstance().getEditpart(yElement);
	}

	/**
	 * Returns the presentation for the given embeddable.
	 * 
	 * @param yElement
	 * @return Presentation - the class that renders the UI for the element
	 */
	public static IWidgetPresentation<?> getPresentation(YEmbeddable yElement) {
		IEmbeddableEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yElement);
		return editpart != null ? editpart.getPresentation() : null;
	}

	/**
	 * Returns the value binding for the given bindable.
	 * 
	 * @param bindable
	 * @return
	 */
	public static Binding getValueBinding(YValueBindable bindable) {
		if (bindable == null || bindable.getValueBindingEndpoint() == null) {
			return null;
		}
		IValueBindingEditpart bindingEditpart = getValueBindingEditpart(bindable);
		Binding binding = bindingEditpart.getBinding();
		return binding;
	}

	/**
	 * Returns the binding editpart for the given bindable.
	 * 
	 * @param bindable
	 * @return
	 */
	public static IValueBindingEditpart getValueBindingEditpart(
			YValueBindable bindable) {
		if (bindable == null || bindable.getValueBindingEndpoint() == null) {
			return null;
		}

		YBinding yBinding = bindable.getValueBindingEndpoint().getBinding();
		IValueBindingEditpart bindingEditpart = getEditpart(yBinding);
		return bindingEditpart;
	}

	/**
	 * Returns the value endpoint editpart for the given bindable.
	 * 
	 * @param bindable
	 * @return
	 */
	public static IEmbeddableValueBindingEndpointEditpart getValueEndpointEditpart(
			YValueBindable bindable) {
		if (bindable == null || bindable.getValueBindingEndpoint() == null) {
			return null;
		}

		YEmbeddableValueEndpoint yBinding = bindable.getValueBindingEndpoint();
		return getValueEndpointEditpart(yBinding);
	}

	/**
	 * Returns the value endpoint editpart for the given endpoint.
	 * 
	 * @param bindable
	 * @return
	 */
	public static IEmbeddableValueBindingEndpointEditpart getValueEndpointEditpart(
			YEmbeddableValueEndpoint endpoint) {
		IEmbeddableValueBindingEndpointEditpart bindingEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(endpoint);
		return bindingEditpart;
	}

	/**
	 * Returns all bindings that are attached to the UI widget. These bindings
	 * connect the ECView model to the widgets. For bindings from domain model
	 * to ECView model see {@link #getModelBindingEditparts(YEmbeddable)}. No
	 * bindingEditparts are available for that kind of binding.
	 * 
	 * @param bindable
	 * @return
	 */
	public static Set<Binding> getUIBindings(YEmbeddable yEmbeddable) {
		IWidgetPresentation<?> presentation = getPresentation(yEmbeddable);
		return presentation.getUIBindings();
	}

	/**
	 * Returns all bindings that are wire the domain model with the ECView
	 * model. The ECView model is bound to the UI widgets by the UI bindings.
	 * See {@link #getUIBindings(YEmbeddable)}.
	 * 
	 * @param bindable
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<IValueBindingEditpart> getModelBindingEditparts(
			YEmbeddable yEmbeddable) {
		YBindingSet bindingset = yEmbeddable.getView().getBindingSet();
		if (bindingset == null) {
			return Collections.emptyList();
		}

		IBindingSetEditpart bindingSetEditpart = getEditpart(bindingset);
		return (List<IValueBindingEditpart>) (bindingSetEditpart != null ? bindingSetEditpart
				.findBindings(yEmbeddable) : Collections.emptyList());
	}

	/**
	 * Returns the widget that is associated with the given embeddable.
	 * 
	 * @param bindable
	 * @return
	 */
	public static Object getWidget(YEmbeddable yEmbeddable) {
		IWidgetPresentation<?> presentation = getPresentation(yEmbeddable);
		return presentation.getWidget();
	}
	
	/**
	 * Returns the view context for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewContext getViewContext(YView yView) {
		IViewEditpart viewEditpart = getViewEditpart(yView);
		return viewEditpart != null ? viewEditpart.getContext() : null;
	}
	
	/**
	 * Returns the view editpart for the given yView.
	 * 
	 * @param yView
	 * @return
	 */
	public static IViewEditpart getViewEditpart(YView yView) {
		return getEditpart(yView);
	}

	/**
	 * Returns the view context for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewContext getViewContext(YEmbeddable yEmbeddable) {
		IViewEditpart viewEditpart = getViewEditpart(yEmbeddable);
		return viewEditpart != null ? viewEditpart.getContext() : null;
	}

	/**
	 * Returns the view editpart for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewEditpart getViewEditpart(YEmbeddable yEmbeddable) {
		IEmbeddableEditpart editpart = getEditpart(yEmbeddable);
		return editpart != null ? editpart.getView() : null;
	}

	/**
	 * Returns the viewSet context for the given embeddable, if available.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewSetContext getViewSetContext(YEmbeddable yEmbeddable) {
		IViewSetEditpart viewSetEditpart = getViewSetEditpart(yEmbeddable);
		return viewSetEditpart != null ? viewSetEditpart.getContext() : null;
	}

	/**
	 * Returns the viewSet editpart for the given embeddable, if available.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewSetEditpart getViewSetEditpart(YEmbeddable yEmbeddable) {
		IViewEditpart viewEditpart = getViewEditpart(yEmbeddable);
		if (viewEditpart == null) {
			return null;
		}
		return viewEditpart.getParent() != null ? viewEditpart.getParent()
				: null;
	}

	/**
	 * Create a new view model element using the editpart factory.
	 * 
	 * @return
	 */
	public static YView creatViewByEditpart() {
		IViewEditpart editpart = DelegatingEditPartManager.getInstance()
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		// the editpart is attached to the model as an adapter
		return (YView) editpart.getModel();
	}

	/**
	 * Create a new view set model element using the editpart factory.
	 * 
	 * @return
	 */
	public static YViewSet creatViewSetByEditpart() {
		IViewSetEditpart editpart = DelegatingEditPartManager.getInstance()
				.createEditpart(CoreModelPackage.eNS_URI,
						IViewSetEditpart.class);
		// the editpart is attached to the model as an adapter
		return (YViewSet) editpart.getModel();
	}

	/**
	 * Create a new view set model element using the editpart factory.
	 * 
	 * @return
	 */
	public static IViewEditpart addNewViewByEditpart(
			IViewSetEditpart viewSetEditpart) {
		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance()
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		viewSetEditpart.addView(viewEditpart);
		return viewEditpart;
	}

	/**
	 * Returns the {@link ILifecycleService} registered with the context.
	 * 
	 * @param context
	 * @return
	 */
	public static ILifecycleService getLifecylceService(IViewContext context) {
		return context.getService(ILifecycleService.class.getName());
	}

	/**
	 * Returns the {@link IECViewBindingManager} registered with the context.
	 * 
	 * @param context
	 * @return
	 */
	public static IECViewBindingManager getBindingManager(IViewContext context) {
		return context.getService(IECViewBindingManager.class.getName());
	}

	/**
	 * Returns the URI for the given bean slot. The URI may be used with the
	 * {@link URIHelper} to access the bean slot.
	 * 
	 * @param yBeanSlot
	 * @return
	 */
	public static URI getURI(YBeanSlot yBeanSlot) {
		EObject container = yBeanSlot.eContainer();
		URI uri = null;
		if (container instanceof YView) {
			uri = URIHelper.view().bean(yBeanSlot.getName()).toURI();
		} else if (container instanceof YViewSet) {
			uri = URIHelper.viewset().bean(yBeanSlot.getName()).toURI();
		} else {
			throw new RuntimeException(container + " is not a valid type!");
		}

		return uri;
	}

	/**
	 * Returns the URI for the given bean slot endpoint. The URI may be used
	 * with the {@link URIHelper} to access the bean the URI points to.
	 * 
	 * @param yBeanSlotBindingEndpoint
	 * @return
	 */
	public static URI getURI(YBeanSlotValueBindingEndpoint yBeanSlotEndpoint) {

		YBeanSlot beanSlot = yBeanSlotEndpoint.getBeanSlot();
		if (beanSlot == null) {
			throw new IllegalArgumentException("BeanSlot mus not be null!");
		}
		EObject container = beanSlot.eContainer();
		URI uri = null;
		if (container instanceof YView) {
			uri = URIHelper.view().bean(beanSlot.getName())
					.fragment(yBeanSlotEndpoint.getAttributePath()).toURI();
		} else if (container instanceof YViewSet) {
			uri = URIHelper.viewset().bean(beanSlot.getName())
					.fragment(yBeanSlotEndpoint.getAttributePath()).toURI();
		} else {
			throw new RuntimeException(container + " is not a valid type!");
		}

		return uri;
	}

	/**
	 * Creates and {@link YEnumListBindingEndpoint} for the given enum.
	 * 
	 * @param xEnum
	 * @return
	 */
	public static YEnumListBindingEndpoint getEnumListBinding(
			Class<? extends Enum<?>> xEnum) {
		YEnumListBindingEndpoint yEndpoint = BindingFactory.eINSTANCE
				.createYEnumListBindingEndpoint();
		yEndpoint.setEnum(xEnum);
		return yEndpoint;
	}

}
