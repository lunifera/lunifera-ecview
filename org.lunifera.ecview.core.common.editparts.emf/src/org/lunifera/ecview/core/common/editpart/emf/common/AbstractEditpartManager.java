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
package org.lunifera.ecview.core.common.editpart.emf.common;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.editpart.IEditPartManager;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IElementEditpartProvider;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base implementation of {@link IEditPartManager}.
 */
public abstract class AbstractEditpartManager implements IEditPartManager {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(AbstractEditpartManager.class);

	/**
	 * Returns the edit part for the given model yElement.
	 * 
	 * @param <A>
	 *            an instance of IUiElementEditpart
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	public static <A extends IElementEditpart> A findEditPartFor(
			YElement yElement) {
		if (yElement == null) {
			return null;
		}

		IElementEditpartProvider editPartProvider = null;
		for (Adapter adapter : ((EObject) yElement).eAdapters()) {
			if (adapter instanceof IElementEditpartProvider) {
				editPartProvider = (IElementEditpartProvider) adapter;
				// only break, if the editpart is for the given model element
				if (yElement == editPartProvider.getEditpart().getModel()) {
					break;
				}
			}
		}

		return editPartProvider != null ? (A) editPartProvider.getEditpart()
				: null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A getEditpart(Object yElement) {
		IElementEditpart editPart = findEditpart(yElement);
		return (A) (editPart != null ? editPart : createEditpart(yElement));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A findEditpart(Object yElement) {
		return (A) findEditPartFor((YElement) yElement);
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of IUiElementEditpart
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	protected abstract <A extends IElementEditpart> A createEditpart(
			Object yElement);

	/**
	 * Creates a new instance of the required edit part.
	 * 
	 * @param <A>
	 *            An instance of {@link IElementEditpart}
	 * @param type
	 *            the type of the editpart to be returned
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createNewInstance(
			Class<? extends IElementEditpart> type) {
		A result = null;
		ElementEditpart<YElement> editPart = null;
		try {
			editPart = (ElementEditpart<YElement>) newInstance(type);
		} catch (InstantiationException e) {
			LOGGER.error("{}", e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			LOGGER.error("{}", e);
			throw new RuntimeException(e);
		}
		result = (A) editPart;
		return result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            the type of the editpart to be created
	 * @return editpart
	 * 
	 * @throws InstantiationException
	 *             exception
	 * @throws IllegalAccessException
	 *             exception
	 */
	protected abstract IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException;

	/**
	 * Casts element to eObject.
	 * 
	 * @param element
	 * @return
	 */
	protected EObject castEObject(Object element) {
		return (EObject) element;
	}

	/**
	 * Asserts that only one IUiElementEditpartProvider exists for the given
	 * element.
	 * 
	 * @param element
	 *            the model element
	 */
	protected void assertOneEditpartForModelelement(Object element) {
		YElement yElement = (YElement) element;
		for (Adapter adapter : castEObject(yElement).eAdapters()) {
			if (adapter instanceof IElementEditpartProvider) {
				LOGGER.error("For a modelelement instance only one editpart can be created!");
				throw new RuntimeException(
						"For a modelelement instance only one editpart can be created!");
			}
		}
	}
}