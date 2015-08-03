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
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableParent;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.datatypes.IDatatypeEditpart;
import org.lunifera.ecview.core.common.editpart.datatypes.IDatatypeEditpart.DatatypeBridge;
import org.lunifera.ecview.core.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.presentation.DelegatingPresenterFactory;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link ElementEditpart}.
 * 
 * @param <M>
 */
public abstract class EmbeddableEditpart<M extends YEmbeddable> extends
		ElementEditpart<M> implements IEmbeddableEditpart, DatatypeBridge {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IWidgetPresentation<?> presentation;

	private EStructuralFeature datatypeFeature;

	/**
	 * The default constructor.
	 */
	protected EmbeddableEditpart() {
	}

	/**
	 * A constructor that becomes passed the datatype feature.
	 * 
	 * @param datatypeFeature
	 */
	public EmbeddableEditpart(EStructuralFeature datatypeFeature) {
		this.datatypeFeature = datatypeFeature;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IEmbeddableParent getParent() {
		YLayout yParentLayout = getModel().getParent();
		if (yParentLayout != null) {
			return yParentLayout != null ? (IEmbeddableParent) getEditpart(yParentLayout)
					: null;
		} else {
			YView yView = getModel().getView();
			if (yView != null) {
				if (yView.getContent() == getModel()) {
					return (IViewEditpart) getEditpart(yView);
				}
			}
		}
		return null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
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
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresenter();

			doInitPresentation(presentation);
		}
		return (A) presentation;
	}

	/**
	 * A hook method to initialize the presentation after creation.
	 * 
	 * @param presentation
	 */
	protected void doInitPresentation(IWidgetPresentation<?> presentation) {

	}

	@Override
	public void apply(IVisibilityHandler handler) {
		IWidgetPresentation<?> presentation = getPresentation();
		if (presentation != null) {
			presentation.apply(handler);
		}
	}

	@Override
	public void resetVisibilityProperties() {
		IWidgetPresentation<?> presentation = getPresentation();
		if (presentation != null) {
			presentation.resetVisibilityProperties();
		}
	}

	/**
	 * Returns the datatype of the model. Or <code>null</code> if no datatype is
	 * available.
	 * 
	 * @return
	 */
	protected YDatatype internalGetDatatype() {
		if (datatypeFeature == null) {
			return null;
		}
		return (YDatatype) getModel().eGet(datatypeFeature);
	}

	/**
	 * Is called to created the presenter for this edit part.
	 */
	protected <A extends IWidgetPresentation<?>> A createPresenter() {
		IViewEditpart viewEditPart = getView();
		if (viewEditPart == null) {
			LOGGER.info("View is null");
			return null;
		}
		return DelegatingPresenterFactory.getInstance().createPresentation(
				viewEditPart.getContext(), this);
	}

	@Override
	public void initialize(M model) {
		super.initialize(model);

		// directly after initialization the embeddable needs to become
		// registered at the datatype editpart. No lazy loading can be used
		// here.
		registerAtDatatype();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		if (notification.getFeature() == datatypeFeature) {
			YDatatype oldYDatatype = (YDatatype) notification.getOldValue();
			if (oldYDatatype != null) {
				// unregister the element from the old datatype
				unregisterFromDatatype(oldYDatatype);
			}

			// an register the field to the new datatype if available
			YDatatype newYDatatype = (YDatatype) notification.getNewValue();
			if (newYDatatype != null) {
				registerAtDatatype();
			}
		} else {
			super.handleModelSet(featureId, notification);
		}
	}

	/**
	 * Registers the element at the datatype. Changes on the datatype will
	 * update the embeddable.
	 */
	protected void registerAtDatatype() {
		// unregisters the datatype editpart
		YDatatype yDatatype = internalGetDatatype();
		if (yDatatype != null) {
			IDatatypeEditpart datatypeEditpart = getEditpart(yDatatype);
			datatypeEditpart.addBridge(this);

			notifyDatatypeChanged(datatypeEditpart.getCurrentState());
		}
	}

	/**
	 * Unregisters the element from the datatype. So changes on the datatype do
	 * not update the embeddable anymore.
	 */
	protected void unregisterFromDatatype(YDatatype yDatatype) {
		// unregisters the datatype editpart
		if (yDatatype != null) {
			IDatatypeEditpart datatypeEditpart = getEditpart(yDatatype);
			datatypeEditpart.removeBridge(this);
			notifyDatatypeChanged(createDatatypeUnsetEvent(datatypeEditpart));
		}
	}

	/**
	 * Create an internal event that resets the datatype information.
	 * 
	 * @param datatypeEditpart
	 * @return
	 */
	private DatatypeChangeEvent createDatatypeUnsetEvent(
			IDatatypeEditpart datatypeEditpart) {

		List<IValidatorEditpart> toRemove = new ArrayList<>(
				getDatatypeValidators());
		DatatypeChangeEvent event = new DatatypeChangeEvent(true,
				datatypeEditpart, null, null, toRemove);
		return event;
	}

	@Override
	public void notifyDatatypeChanged(DatatypeChangeEvent event) {
		IWidgetPresentation<?> presentation = getPresentation();
		if (presentation != null) {
			presentation.notifyDatatypeChanged(event);
		} else {
			LOGGER.warn("Presentation is null for " + getModel());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			// unregister the element from the datatype
			YDatatype yDatatype = internalGetDatatype();
			if (yDatatype != null) {
				unregisterFromDatatype(yDatatype);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void requestRender() {
		if (getParent() != null) {
			getParent().renderChild(this);
		} else {
			unrender();
		}
	}

	@Override
	public Object render(Object parentWidget) {
		if (getPresentation() == null) {
			throw new IllegalStateException("No presentation for " + getModel());
		}
		return getPresentation().createWidget(parentWidget);
	}

	@Override
	public void requestUnrender() {
		if (getParent() != null) {
			getParent().unrenderChild(this);
		} else {
			unrender();
		}
	}

	@Override
	public void unrender() {
		IWidgetPresentation<?> presentation = getPresentation();
		if (presentation != null) {
			presentation.unrender();
		}
	}

	@Override
	public boolean isRendered() {
		return internalGetPresentation() != null
				&& internalGetPresentation().isRendered();
	}

	@Override
	public Object getWidget() {
		IWidgetPresentation<?> presentation = getPresentation();
		if (presentation != null) {
			return presentation.getWidget();
		}
		return null;
	}

	@Override
	public void requestDispose() {
		if (getParent() != null) {
			getParent().disposeChild(this);
		} else {
			dispose();
		}
	}
}
