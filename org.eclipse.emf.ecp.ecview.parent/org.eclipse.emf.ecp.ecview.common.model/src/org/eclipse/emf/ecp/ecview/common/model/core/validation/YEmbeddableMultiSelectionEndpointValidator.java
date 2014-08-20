/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.core.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YEmbeddableMultiSelectionEndpointValidator {
	boolean validate();

	boolean validateElement(YMultiSelectionBindable value);
}
