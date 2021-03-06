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
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.presentation.ILayoutPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link ILayoutEditpart}.
 * 
 * @param <M>
 */
public class LayoutEditpart<M extends YLayout> extends EmbeddableEditpart<M>
		implements ILayoutEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LayoutEditpart.class);

	private List<IEmbeddableEditpart> uiElementEditparts;

	/**
	 * Default constructor.
	 */
	public LayoutEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) CoreModelFactory.eINSTANCE.createYLayout();
	}

	@Override
	public List<IEmbeddableEditpart> getElements() {
		if (uiElementEditparts == null) {
			internalLoadElements();
		}
		return Collections.unmodifiableList(uiElementEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet,
			// but exist in the model.
			if (uiElementEditparts != null
					|| getModel().getElements().size() > 0) {
				List<IEmbeddableEditpart> tempElements = getElements();
				synchronized (uiElementEditparts) {
					for (IEmbeddableEditpart editpart : tempElements
							.toArray(new IEmbeddableEditpart[tempElements
									.size()])) {
						editpart.dispose();
					}
				}
				uiElementEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void addElement(IEmbeddableEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yLayout = getModel();
			YEmbeddable yElement = (YEmbeddable) element.getModel();
			yLayout.getElements().add(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeElement(IEmbeddableEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yLayout = getModel();
			YEmbeddable yElement = (YEmbeddable) element.getModel();
			yLayout.getElements().remove(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YLAYOUT__ELEMENTS:
			YEmbeddable yElement = (YEmbeddable) notification.getNewValue();

			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yElement);
			internalAddElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				int index = notification.getPosition();
				if (index < 0 || index >= getElements().size() - 1) {
					presenter.add(editPart);
				} else {
					presenter.insert(editPart, index);
				}
			}
			break;
		default:
			break;
		}
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YLAYOUT__ELEMENTS:
			YEmbeddable yElement = (YEmbeddable) notification.getNewValue();

			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yElement);
			internalMoveElement(editPart, notification.getPosition());

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.move(editPart, notification.getPosition());
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	protected boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YLAYOUT__ELEMENTS:
			YEmbeddable yElement = (YEmbeddable) notification.getOldValue();

			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yElement);
			internalRemoveElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.remove(editPart);
			}
			editPart.unrender();
			break;
		default:
			break;
		}
	}

	// /**
	// * {@inheritDoc}
	// */
	// protected void handleModel_Move(int featureId, Notification notification)
	// {
	// checkDisposed();
	//
	// switch (featureId) {
	// case UiModelPackage.YUI_LAYOUT__ELEMENTS:
	// YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();
	// internalAddElement((IUiEmbeddableEditpart) getEditpart(yElement));
	// break;
	// }
	// }

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddElement(IEmbeddableEditpart editpart) {
		checkDisposed();

		if (uiElementEditparts == null) {
			internalLoadElements();
		}
		if (!uiElementEditparts.contains(editpart)) {
			uiElementEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and to move the given editpart in
	 * the list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be inserted
	 * @param index
	 *            The index to move the element.
	 */
	protected void internalMoveElement(IEmbeddableEditpart editpart, int index) {
		checkDisposed();

		if (uiElementEditparts == null) {
			internalLoadElements();
		} else if (!uiElementEditparts.contains(editpart)) {
			throw new RuntimeException(String.format(
					"Editpart %s is not contained in elements",
					editpart.getId()));
		} else {
			uiElementEditparts.remove(editpart);
			uiElementEditparts.add(index, editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveElement(IEmbeddableEditpart editpart) {
		checkDisposed();

		if (uiElementEditparts != null && editpart != null) {
			uiElementEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadElements() {
		checkDisposed();

		if (uiElementEditparts == null) {
			uiElementEditparts = new ArrayList<IEmbeddableEditpart>();
			for (YEmbeddable yElement : getModel().getElements()) {
				IEmbeddableEditpart editPart = getEditpart(yElement);
				internalAddElement(editPart);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ILayoutPresentation<?> getPresentation() {
		return super.getPresentation();
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}

	@Override
	public void renderChild(IEmbeddableEditpart child) {
		int index = getElements().indexOf(child);
		if (index < 0) {
			throw new IllegalArgumentException(
					String.format(
							"The element %s is not contained in the current editpart %s",
							child.toString(), toString()));
		}

		getPresentation().insert(child, index);
	}

	@Override
	public void unrenderChild(IEmbeddableEditpart child) {
		// first remove the child presentation from the current presentation
		getPresentation().remove(child);

		// then tell the child editpart to unrender its own presentation
		child.unrender();
	}

	@Override
	public void unrender() {
		if (internalGetPresentation() == null) {
			return;
		}

		if (uiElementEditparts != null) {
			for (IEmbeddableEditpart child : uiElementEditparts
					.toArray(new IEmbeddableEditpart[uiElementEditparts.size()])) {
				getPresentation().remove(child);
				child.unrender();
			}
		}
		
		super.unrender();
	}

	@Override
	public void disposeChild(IEmbeddableEditpart child) {
		// first remove the child presentation from the current presentation
		getPresentation().remove(child);

		// then tell the child editpart to dispose itself
		child.dispose();
	}
}
