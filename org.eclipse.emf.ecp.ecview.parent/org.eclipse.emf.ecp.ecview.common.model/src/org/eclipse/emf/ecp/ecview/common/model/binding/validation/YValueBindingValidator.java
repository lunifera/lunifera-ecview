/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.validation;

import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YValueBindingValidator {
	boolean validate();

	boolean validateTargetEndpoint(YValueBindingEndpoint value);
	boolean validateModelEndpoint(YValueBindingEndpoint value);
}