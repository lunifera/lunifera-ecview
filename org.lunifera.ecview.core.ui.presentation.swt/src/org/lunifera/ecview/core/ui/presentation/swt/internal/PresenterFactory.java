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
package org.lunifera.ecview.core.ui.presentation.swt.internal;

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.presentation.IPresentationFactory;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.ui.core.editparts.extension.IBrowserEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IButtonEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ICheckboxEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IComboBoxEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IDateTimeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IGridLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IHorizontalLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ILabelEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.INumericFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextAreaEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IVerticalLayoutEditpart;
import org.lunifera.ecview.core.ui.presentation.swt.ECViewSwtRenderer;

/**
 * The presenter factory.
 */
public class PresenterFactory implements IPresentationFactory {

	@Override
	public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
		String presentationURI = uiContext.getPresentationURI();
		return presentationURI != null
				&& presentationURI.equals(ECViewSwtRenderer.UI_KIT_URI);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A createPresentation(
			IViewContext uiContext, IElementEditpart editpart) {

		A presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (A) new ViewPresentation((IViewEditpart) editpart);
		} else if (editpart instanceof ITextFieldEditpart) {
			presentation = (A) new TextFieldPresentation(editpart);
		} else if (editpart instanceof IGridLayoutEditpart) {
			presentation = (A) new GridLayoutPresentation(editpart);
		} else if (editpart instanceof IHorizontalLayoutEditpart) {
			presentation = (A) new HorizontalLayoutPresentation(editpart);
		} else if (editpart instanceof IVerticalLayoutEditpart) {
			presentation = (A) new VerticalLayoutPresentation(editpart);
		} else if (editpart instanceof ILabelEditpart) {
			presentation = (A) new LabelPresentation(editpart);
		} else if (editpart instanceof ITextAreaEditpart) {
			presentation = (A) new TextAreaPresentation(editpart);
		} else if (editpart instanceof ICheckboxEditpart) {
			presentation = (A) new CheckBoxPresentation(editpart);
		} else if (editpart instanceof IComboBoxEditpart) {
			presentation = (A) new ComboBoxPresentation(editpart);
		} else if (editpart instanceof INumericFieldEditpart) {
			presentation = (A) new NumericFieldPresentation(editpart);
		} else if (editpart instanceof IDecimalFieldEditpart) {
			presentation = (A) new DecimalFieldPresentation(editpart);
		} else if (editpart instanceof IButtonEditpart) {
			presentation = (A) new ButtonPresentation(editpart);
		} else if (editpart instanceof IDateTimeEditpart) {
			presentation = (A) new DateTimePresentation(editpart);
		} else if (editpart instanceof IBrowserEditpart) {
			presentation = (A) new BrowserPresentation(editpart);
		}

		if (presentation == null) {
			throw new IllegalArgumentException(String.format(
					"No presenter available for editpart %s[%s]", editpart
							.getClass().getName(), editpart.getId()));
		}

		return presentation;
	}

}
