/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YFormLayout}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YFormLayoutValidator {
	boolean validate();

	boolean validateCellStyles(EList<YFormLayoutCellStyle> value);
	boolean validateFillVertical(boolean value);
}
