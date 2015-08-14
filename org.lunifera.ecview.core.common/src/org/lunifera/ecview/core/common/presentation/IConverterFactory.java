package org.lunifera.ecview.core.common.presentation;

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IConverterEditpart;

/**
 * Is used to create UI-Kit specific converters.
 */
public interface IConverterFactory {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param uiContext
	 *            contains information about the current ui instance
	 * @param editpart
	 *            the editpart for which a converter should be created.
	 * @return result
	 */
	boolean isFor(IViewContext uiContext, IConverterEditpart editpart);

	/**
	 * Is used to create a new instance of a converter.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @param uiContext
	 *            contains information about the current ui instance
	 * @param editpart
	 *            the editpart for which a converter should be created.
	 * @return converter
	 * 
	 * @throws IllegalArgumentException
	 *             if no presentation could be created.
	 */
	Object createConverter(IViewContext uiContext, IConverterEditpart editpart)
			throws IllegalArgumentException;
}
