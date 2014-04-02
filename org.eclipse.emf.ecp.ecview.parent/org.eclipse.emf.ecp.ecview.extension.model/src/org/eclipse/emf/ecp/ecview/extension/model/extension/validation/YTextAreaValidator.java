/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.validation;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YTextAreaValidator {
	boolean validate();

	boolean validateDatadescription(YDatadescription value);
	boolean validateDatatype(YTextAreaDatatype value);
	boolean validateValue(String value);
}
