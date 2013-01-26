/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ICheckboxEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.INumericFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITableEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextAreaEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
public class EditpartManager extends AbstractEditpartManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(ExtensionModelPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(ExtensionModelPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(ITextFieldEditpart.class)) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IGridLayoutEditpart.class)) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITableEditpart.class)) {
			result = createNewInstance(TableEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ILabelEditpart.class)) {
			result = createNewInstance(LabelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITextAreaEditpart.class)) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ICheckboxEditpart.class)) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INumericFieldEditpart.class)) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDecimalFieldEditpart.class)) {
			result = createNewInstance(DecimalFieldEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof YTextField) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (yElement instanceof YGridLayout) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (yElement instanceof YHorizontalLayout) {
			result = createNewInstance(HorizontalLayoutEditpart.class);
		} else if (yElement instanceof YVerticalLayout) {
			result = createNewInstance(VerticalLayoutEditpart.class);
		} else if (yElement instanceof YTable) {
			result = createNewInstance(TableEditpart.class);
		} else if (yElement instanceof YLabel) {
			result = createNewInstance(LabelEditpart.class);
		} else if (yElement instanceof YTextArea) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (yElement instanceof YCheckBox) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (yElement instanceof YComboBox) {
			result = createNewInstance(ComboBoxEditpart.class);
		} else if (yElement instanceof YList) {
			result = createNewInstance(ListEditpart.class);
		} else if (yElement instanceof YNumericField) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (yElement instanceof YDecimalField) {
			result = createNewInstance(DecimalFieldEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the editpart for which an instance should be
	 *            created.
	 * @return editPart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}
}