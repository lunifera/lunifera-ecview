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
package org.lunifera.ecview.core.common.editpart.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.lunifera.ecview.core.common.context.ContextException;
import org.lunifera.ecview.core.common.context.IConfiguration;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.ICommandSetEditpart;
import org.lunifera.ecview.core.common.editpart.IDialogEditpart;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;
import org.lunifera.ecview.core.common.notification.ILifecycleEvent;
import org.lunifera.ecview.core.common.notification.ILifecycleHandler;
import org.lunifera.ecview.core.common.notification.ILifecycleService;
import org.lunifera.ecview.core.common.presentation.DelegatingPresenterFactory;
import org.lunifera.ecview.core.common.presentation.IViewPresentation;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.common.services.IUiKitBasedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation for {@link IViewEditpart}.
 * 
 * @param <M>
 */
public class ViewEditpart<M extends YView> extends ElementEditpart<M> implements
		IViewEditpart, ILifecycleHandler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ViewEditpart.class);
	private IEmbeddableEditpart content;
	private IViewContext context;
	private IConfiguration configuration;
	private IViewPresentation<?> presentation;
	private IBindingSetEditpart bindingSet;
	private ICommandSetEditpart commandSet;
	private Set<IDialogEditpart> openDialogs;
	private List<IVisibilityProcessorEditpart> vProcessorEditparts;
	private List<IExposedActionEditpart> exposedActionEditparts;

	/**
	 * Default constructor.
	 */
	public ViewEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		checkDisposed();

		M model = (M) CoreModelFactory.eINSTANCE.createYView();

		return model;
	}

	@Override
	public IViewContext getContext() {
		checkDisposed();

		return context;
	}

	@Override
	public void render(Map<String, Object> options) throws ContextException {
		checkDisposed();

		validateModel();

		if (configuration != null) {
			configuration.beforeUiRendering(getContext());
		}

		// ensure that the bean slots are initialized
		for (YBeanSlot yBeanSlot : getModel().getBeanSlots()) {
			internalAddBeanSlot(yBeanSlot);
		}

		// register the context as a bean slot
		context.createBeanSlot(BEANSLOT__ECVIEW_CONTEXT, IViewContext.class);
		context.setBean(BEANSLOT__ECVIEW_CONTEXT, getContext());

		// render the view presentation
		renderPresentation(options);

		if (configuration != null) {
			configuration.afterUiRendering(getContext());
		}

		if (configuration != null) {
			configuration.beforeBind(getContext());
		}
		// render the bindings
		renderBindings(options);

		// render the commands
		renderCommands(options);

		// render the visibility processor
		renderVisibilityProcessor(options);

		if (configuration != null) {
			configuration.afterBind(getContext());
		}

		if (getContext() != null) {
			ILifecycleService service = getContext().getService(
					ILifecycleService.class.getName());
			if (service == null) {
				throw new RuntimeException("ILifecycleService is required");
			}
			service.addHandler(this);
		}
	}

	@Override
	public void unrenderChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		// first remove the child presentation from the current presentation
		getPresentation().setContent(null);

		// then tell the child editpart to unrender its own presentation
		child.unrender();
	}

	@Override
	public void disposeChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		// first remove the child presentation from the current presentation
		getPresentation().setContent(null);

		// then tell the child editpart to dispose itself
		child.dispose();
	}

	@Override
	public void renderChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		getPresentation().setContent(child);
	}

	/**
	 * Validates the model and throws an exception if model is not valid.
	 * 
	 * @throws ContextException
	 */
	protected void validateModel() throws ContextException {
		YView yView = getModel();
		EValidator validator = EObjectValidator.INSTANCE;
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean valid = validator.validate(yView, diagnostic, null);
		if (!valid) {
			throw new ContextException(diagnostic.toString());
		}
	}

	/**
	 * Renders the presentation of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderPresentation(Map<String, Object> options)
			throws ContextException {
		checkDisposed();

		IViewPresentation<?> presentation = getPresentation();
		if (presentation == null) {
			throw new ContextException("Presenter must not be null!");
		}
		presentation.render(options);
	}

	/**
	 * Renders the bindings of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderBindings(Map<String, Object> options)
			throws ContextException {
		checkDisposed();

		IBindingSetEditpart bindingSet = getBindingSet();
		if (bindingSet == null) {
			LOGGER.info("BindingSet is null!");
		}
		// call to activate not required. Pending bindings are bound
		// automatically
	}

	/**
	 * Renders the commands of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderCommands(Map<String, Object> options)
			throws ContextException {
		checkDisposed();

		ICommandSetEditpart commandSet = getCommandSet();
		if (commandSet == null) {
			LOGGER.info("CommandSet is null!");
		}
		// call to activate not required. Pending commands are activated
		// automatically
	}

	/**
	 * Renders the visibility processor of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderVisibilityProcessor(Map<String, Object> options)
			throws ContextException {
		checkDisposed();

		for (IVisibilityProcessorEditpart editpart : getVisibilityProcessors()) {
			editpart.activate();
		}
	}

	@Override
	public void notifyLifecycle(ILifecycleEvent event) {
		IElementEditpart editPart = event.getEditpart();

		switch (event.getType()) {
		case ILifecycleEvent.TYPE_DISPOSED: {
			YElement element = (YElement) editPart.getModel();
			if (element instanceof YBindable) {
				IBindingSetEditpart bindingSet = getBindingSet();
				if (bindingSet != null) {
					List<IBindingEditpart<?>> bindings = bindingSet
							.findBindings(element);
					for (IBindingEditpart<?> binding : bindings) {
						if (!binding.isDisposed()) {
							binding.dispose();
						}
					}
				}
			}
			break;
		}
		case ILifecycleEvent.TYPE_RENDERED: {
			YElement element = (YElement) editPart.getModel();
			if (element instanceof YBindable) {
				IBindingSetEditpart bindingSet = getBindingSet();
				if (bindingSet != null) {
					List<IBindingEditpart<?>> bindings = bindingSet
							.findBindings(element);
					for (IBindingEditpart<?> binding : bindings) {
						if (!binding.isBound()) {
							binding.bind();
						}
					}
				}
			}
			break;
		}
		case ILifecycleEvent.TYPE_UNRENDERED: {
			YElement element = (YElement) editPart.getModel();
			if (element instanceof YBindable) {
				IBindingSetEditpart bindingSet = getBindingSet();
				if (bindingSet != null) {
					List<IBindingEditpart<?>> bindings = bindingSet
							.findBindings(element);
					for (IBindingEditpart<?> binding : bindings) {
						binding.unbind();
					}
				}
			}
			break;
		}
		}
	}

	@Override
	// BEGIN SUPRESS CATCH EXCEPTION
	public void setContext(IViewContext context) throws RuntimeException {
		// END SUPRESS CATCH EXCEPTION

		checkDisposed();

		if (this.context == context) {
			return;
		}

		if (this.context != null && this.context.isRendered()) {
			throw new RuntimeException(
					"Already rendered! Changing context not allowed!");
		}
		this.context = context;
	}

	@Override
	public void setConfiguration(IConfiguration configuration) {
		checkDisposed();

		this.configuration = configuration;
	}

	@Override
	public String getName() {
		return getModel().getViewName();
	}

	@Override
	public void setContent(IEmbeddableEditpart content) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YEmbeddable yElement = content != null ? (YEmbeddable) content
					.getModel() : null;
			yView.setContent(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IEmbeddableEditpart getContent() {
		if (content == null) {
			loadContent();
		}
		return content;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadContent() {
		if (content == null) {
			YEmbeddable yContent = getModel().getContent();
			internalSetContent((IEmbeddableEditpart) getEditpart(yContent));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param content
	 *            The content to be set
	 */
	protected void internalSetContent(IEmbeddableEditpart content) {
		this.content = content;
	}

	@Override
	public void setBindingSet(IBindingSetEditpart bindingSet) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YBindingSet yBindingSet = bindingSet != null ? (YBindingSet) bindingSet
					.getModel() : null;
			yView.setBindingSet(yBindingSet);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IBindingSetEditpart getBindingSet() {
		checkDisposed();

		if (bindingSet == null) {
			loadBindingSet();
		}
		return bindingSet;
	}

	/**
	 * Loads the bindingSet of the view.
	 */
	protected void loadBindingSet() {
		checkDisposed();

		if (bindingSet == null) {
			YBindingSet yBindingSet = getModel().getBindingSet();
			internalSetBindingSet((IBindingSetEditpart) getEditpart(yBindingSet));
		}
	}

	/**
	 * May be invoked by a model change and the bindingSet of the edit part
	 * should be set.
	 * 
	 * @param bindingSet
	 *            The bindingSet to be set
	 */
	protected void internalSetBindingSet(IBindingSetEditpart bindingSet) {
		checkDisposed();

		if (this.bindingSet == bindingSet) {
			return;
		}

		IBindingSetEditpart current = this.bindingSet;
		this.bindingSet = bindingSet;

		// dispose current binding set
		if (current != null) {
			current.dispose();
		}

		// activate the new binding set
		if (this.bindingSet != null && !this.bindingSet.isActive()) {
			this.bindingSet.activate();
		}
	}

	@Override
	public void setCommandSet(ICommandSetEditpart commandSet) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YCommandSet yCommandSet = commandSet != null ? (YCommandSet) commandSet
					.getModel() : null;
			yView.setCommandSet(yCommandSet);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public ICommandSetEditpart getCommandSet() {
		checkDisposed();

		if (commandSet == null) {
			loadCommandSet();
		}
		return commandSet;
	}

	/**
	 * Loads the commandSet of the view.
	 */
	protected void loadCommandSet() {
		checkDisposed();

		if (commandSet == null) {
			YCommandSet yCommandSet = getModel().getCommandSet();
			internalSetCommandSet((ICommandSetEditpart) getEditpart(yCommandSet));
		}
	}

	/**
	 * May be invoked by a model change and the commandSet of the edit part
	 * should be set.
	 * 
	 * @param commandSet
	 *            The commandSet to be set
	 */
	protected void internalSetCommandSet(ICommandSetEditpart commandSet) {
		checkDisposed();

		if (this.commandSet == commandSet) {
			return;
		}

		ICommandSetEditpart current = this.commandSet;
		this.commandSet = commandSet;

		// dispose current binding set
		if (current != null) {
			current.dispose();
		}

		// activate the new binding set
		if (this.commandSet != null && !this.commandSet.isActive()) {
			this.commandSet.activate();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW__CONTENT:

			IEmbeddableEditpart oldContent = content;
			if (oldContent != null) {
				oldContent.dispose();
				internalSetContent(null);
				if (isRendered()) {
					getPresentation().setContent(null);
				}
			}

			YEmbeddable yNewContent = (YEmbeddable) notification.getNewValue();
			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yNewContent);
			internalSetContent(editPart);

			// handle the presentation
			//
			if (isRendered()) {
				getPresentation().setContent(editPart);
			}

			// fire event
			firePropertyChangedEditpart(PROP_CONTENT, notification);
			break;
		case CoreModelPackage.YVIEW__BINDING_SET:
			YBindingSet yNewBindingSet = (YBindingSet) notification
					.getNewValue();
			IBindingSetEditpart bsEditPart = (IBindingSetEditpart) getEditpart(yNewBindingSet);
			internalSetBindingSet(bsEditPart);

			// fire event
			// firePropertyChangedEditpart(PROP_CONTENT, notification);
		case CoreModelPackage.YVIEW__COMMAND_SET:
			YCommandSet yNewCommandSet = (YCommandSet) notification
					.getNewValue();
			ICommandSetEditpart csEditPart = (ICommandSetEditpart) getEditpart(yNewCommandSet);
			internalSetCommandSet(csEditPart);

			// fire event
			// firePropertyChangedEditpart(PROP_CONTENT, notification);
		default:
			break;
		}
	}

	@Override
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW__BEAN_SLOTS:
			YBeanSlot yBeanSlot = (YBeanSlot) notification.getNewValue();
			internalAddBeanSlot(yBeanSlot);
			break;
		case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
			YVisibilityProcessor yElement = (YVisibilityProcessor) notification
					.getNewValue();
			internalAddVisibilityProcessor((IVisibilityProcessorEditpart) getEditpart(yElement));
			break;
		case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
			YExposedAction yAction = (YExposedAction) notification
					.getNewValue();
			internalAddExposedAction((IExposedActionEditpart) getEditpart(yAction));
			break;
		default:
			break;
		}
	}

	@Override
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW__BEAN_SLOTS:
			throw new IllegalStateException("Viewslots must not be removed!");
		case CoreModelPackage.YVIEW__VISIBILITY_PROCESSORS:
			YVisibilityProcessor yElement = (YVisibilityProcessor) notification
					.getNewValue();
			internalRemoveVisibilityProcessor((IVisibilityProcessorEditpart) getEditpart(yElement));
			break;
		case CoreModelPackage.YVIEW__EXPOSED_ACTIONS:
			YExposedAction yAction = (YExposedAction) notification
					.getNewValue();
			internalRemoveExposedAction((IExposedActionEditpart) getEditpart(yAction));
			break;
		default:
			break;
		}
	}

	/**
	 * Registers the given bean slot.
	 * 
	 * @param yBeanSlot
	 */
	protected void internalAddBeanSlot(YBeanSlot yBeanSlot) {
		checkDisposed();
		context.createBeanSlot(yBeanSlot.getName(), yBeanSlot.getValueType());
	}

	public List<IVisibilityProcessorEditpart> getVisibilityProcessors() {
		if (vProcessorEditparts == null) {
			internalLoadVisibilityProcessors();
		}
		return Collections.unmodifiableList(vProcessorEditparts);
	}

	public void addVisibilityProcessor(IVisibilityProcessorEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yVProcessor = getModel();
			YVisibilityProcessor yVisibilityProcessor = (YVisibilityProcessor) element
					.getModel();
			yVProcessor.getVisibilityProcessors().add(yVisibilityProcessor);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public void removeVisibilityProcessor(IVisibilityProcessorEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yVProcessor = getModel();
			YVisibilityProcessor yVisibilityProcessor = (YVisibilityProcessor) element
					.getModel();
			yVProcessor.getVisibilityProcessors().remove(yVisibilityProcessor);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of processors.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddVisibilityProcessor(
			IVisibilityProcessorEditpart editpart) {
		checkDisposed();

		if (vProcessorEditparts == null) {
			internalLoadVisibilityProcessors();
		}
		if (!vProcessorEditparts.contains(editpart)) {
			vProcessorEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of processors.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveVisibilityProcessor(
			IVisibilityProcessorEditpart editpart) {
		checkDisposed();

		if (vProcessorEditparts != null && editpart != null) {
			vProcessorEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadVisibilityProcessors() {
		checkDisposed();

		if (vProcessorEditparts == null) {
			vProcessorEditparts = new ArrayList<IVisibilityProcessorEditpart>();
			for (YVisibilityProcessor yVisibilityProcessor : getModel()
					.getVisibilityProcessors()) {
				IVisibilityProcessorEditpart editPart = getEditpart(yVisibilityProcessor);
				internalAddVisibilityProcessor(editPart);
			}
		}
	}

	public List<IExposedActionEditpart> getExposedActions() {
		if (exposedActionEditparts == null) {
			internalLoadExposedActions();
		}
		return Collections.unmodifiableList(exposedActionEditparts);
	}

	public void addExposedActions(IExposedActionEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yView = getModel();
			YExposedAction yExposedAction = (YExposedAction) element
					.getModel();
			yView.getExposedActions().add(yExposedAction);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public void removeExposedAction(IExposedActionEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yView = getModel();
			YExposedAction yExposedAction = (YExposedAction) element
					.getModel();
			yView.getExposedActions().remove(yExposedAction);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of processors.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddExposedAction(
			IExposedActionEditpart editpart) {
		checkDisposed();

		if (exposedActionEditparts == null) {
			internalLoadExposedActions();
		}
		if (!exposedActionEditparts.contains(editpart)) {
			exposedActionEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of processors.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveExposedAction(
			IExposedActionEditpart editpart) {
		checkDisposed();

		if (exposedActionEditparts != null && editpart != null) {
			exposedActionEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadExposedActions() {
		checkDisposed();

		if (exposedActionEditparts == null) {
			exposedActionEditparts = new ArrayList<IExposedActionEditpart>();
			for (YExposedAction exposedActionEditpart : getModel()
					.getExposedActions()) {
				IExposedActionEditpart editPart = getEditpart(exposedActionEditpart);
				internalAddExposedAction(editPart);
			}
		}
	}

	/**
	 * Returns true, if the editpart is currently rendered.
	 * 
	 * @return
	 */
	private boolean isRendered() {
		checkDisposed();

		return internalGetPresentation() != null
				&& internalGetPresentation().isRendered();
	}

	@Override
	protected void internalDispose() {
		try {

			if (context != null) {
				ILifecycleService service = context
						.getService(ILifecycleService.class.getName());
				if (service != null) {
					service.removeHandler(this);
				}
			}

			// remove from the parent
			IViewSetEditpart parent = getParent();
			if (parent != null) {
				parent.removeView(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

			if (getContent() != null) {
				content.dispose();
				content = null;
			}

			if (openDialogs != null) {
				for (IDialogEditpart dialog : openDialogs) {
					dialog.dispose();
				}
				openDialogs = null;
			}

			if (getBindingSet() != null) {
				bindingSet.dispose();
				bindingSet = null;
			}

			// dispose all visibility processor
			for (IVisibilityProcessorEditpart editpart : getVisibilityProcessors()) {
				editpart.dispose();
			}
			vProcessorEditparts = null;

		} finally {
			super.internalDispose();
		}
	}

	@Override
	public IViewSetEditpart getParent() {
		checkDisposed();

		YViewSet yViewSet = getModel().getRoot();
		return yViewSet != null ? (IViewSetEditpart) getEditpart(yViewSet)
				: null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		checkDisposed();

		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IViewPresentation<?>> A getPresentation() {
		checkDisposed();

		if (presentation == null) {
			presentation = createPresentation();
		}
		return (A) presentation;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 * 
	 * @param <A>
	 *            An instance of {@link IViewPresentation}
	 * 
	 * @return The created presentation.
	 */
	protected <A extends IViewPresentation<?>> A createPresentation() {
		return DelegatingPresenterFactory.getInstance().createPresentation(
				getContext(), this);
	}

	@Override
	public void exec(Runnable runnable) {
		checkDisposed();
		getPresentation().exec(runnable);
	}

	@Override
	public Future<?> execAsync(Runnable runnable) {
		checkDisposed();
		return getPresentation().execAsync(runnable);
	}

	@Override
	public <A extends IUiKitBasedService> A createService(Class<A> serviceClass) {
		return getPresentation().createService(serviceClass);
	}

	@Override
	public void openDialog(IDialogEditpart dialogEditpart,
			IBindableEndpointEditpart inputData) {
		if (dialogEditpart == null) {
			return;
		}

		if (openDialogs == null) {
			openDialogs = new HashSet<IDialogEditpart>();
		}
		openDialogs.add(dialogEditpart);

		getPresentation().openDialog(dialogEditpart, inputData);
	}

	@Override
	public void closeDialog(IDialogEditpart dialogEditpart) {
		if (dialogEditpart == null) {
			return;
		}

		if (openDialogs != null) {
			openDialogs.remove(dialogEditpart);
		}

		getPresentation().closeDialog(dialogEditpart);
	}
}
