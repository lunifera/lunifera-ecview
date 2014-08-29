/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.common.model.datatypes.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.common.model.validation.YValidator;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.common.model.datatypes.YDatatype}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YDatatypeValidator {
	boolean validate();

	boolean validateValidators(EList<YValidator> value);
}
