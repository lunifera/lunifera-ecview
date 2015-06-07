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

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;

/**
 * See {@link ElementEditpart}.
 * 
 * @param <M>
 */
public class ExposedActionEditpart extends ElementEditpart<YExposedAction>
		implements IExposedActionEditpart {

	/**
	 * The default constructor.
	 */
	protected ExposedActionEditpart() {
	}

	@Override
	protected YExposedAction createModel() {
		return CoreModelFactory.eINSTANCE.createYExposedAction();
	}

	@Override
	public String getIconName() {
		return getModel().getIcon();
	}

	@Override
	public String getDescription() {
		II18nService service = getView().getContext().getService(
				II18nService.ID);
		if (service == null) {
			String label = getModel().getLabel();
			if (label != null && !label.equals("")) {
				return label;
			} else {
				return getModel().getName();
			}
		} else {
			String labelI18nKey = getModel().getLabelI18nKey();
			if (labelI18nKey != null && !labelI18nKey.equals("")) {
				String value = service.getValue(labelI18nKey, getView()
						.getContext().getLocale());
				if (value == null) {
					String label = getModel().getLabel();
					if (label != null && !label.equals("")) {
						return label;
					} else {
						return getModel().getName();
					}
				} else {
					return value;
				}
			}
		}
		return getModel().getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IElementEditpart getParent() {
		YElement yParent = (YElement) getModel().eContainer();
		if (yParent != null) {
			return yParent != null ? (IElementEditpart) getEditpart(yParent)
					: null;
		}
		return null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
	}

	@Override
	public void apply(IVisibilityHandler handler) {
		getModel().setEnabled(handler.isEnabled());
	}

	@Override
	public void resetVisibilityProperties() {
		getModel().setEnabled(getModel().isInitialEnabled());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {

		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void requestDispose() {
		// if (getParent() != null) {
		// getParent().disposeChild(this);
		// } else {
		// dispose();
		// }
	}

}
