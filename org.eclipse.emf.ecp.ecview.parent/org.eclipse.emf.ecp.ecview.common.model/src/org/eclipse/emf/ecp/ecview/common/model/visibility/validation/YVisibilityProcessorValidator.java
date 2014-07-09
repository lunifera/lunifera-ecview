/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;

import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YVisibilityProcessorValidator {
	boolean validate();

	boolean validateOnMatch(YVisibilityProperties value);
	boolean validateParent(YVisibilityProcessable value);
}
