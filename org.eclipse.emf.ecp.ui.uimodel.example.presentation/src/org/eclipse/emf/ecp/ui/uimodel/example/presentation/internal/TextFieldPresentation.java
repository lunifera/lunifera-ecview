/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class TextFieldPresentation extends AbstractSWTWidgetPresenter {

	private final IUiTextFieldEditpart editpart;
	@SuppressWarnings("unused")
	private final YUiTextField model;
	private Text control;

	public TextFieldPresentation(IUiElementEditpart editpart) {
		this.editpart = (IUiTextFieldEditpart) editpart;
		this.model = (YUiTextField) editpart.getModel();
	}

	/**
	 * Returns the view context.
	 * 
	 * @return
	 */
	protected IViewContext getViewContext() {
		return editpart.getView().getContext();
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return
	 */
	public IUiElementEditpart getEditpart() {
		return editpart;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (control == null) {
			control = new Text((Composite) parent, SWT.BORDER);
		}
		return control;
	}

	@Override
	public Control getWidget() {
		return control;
	}

	@Override
	public boolean isRendered() {
		return control != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (control != null) {
			control.dispose();
			control = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		// unrender the ui control
		unrender();
	}
}