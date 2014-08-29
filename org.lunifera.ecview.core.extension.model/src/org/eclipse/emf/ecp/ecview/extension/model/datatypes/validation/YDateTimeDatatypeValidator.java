/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.datatypes.validation;

import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YDateTimeDatatypeValidator {
	boolean validate();

	boolean validateFormat(YDateTimeFormat value);
}
