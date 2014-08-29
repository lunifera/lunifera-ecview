package org.lunifera.ecview.core.common.notification;

import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IValueBindingEditpart;

/**
 * Lifecycle events are sent by different editparts to notify the
 * {@link IViewEditpart} about it. A common case is, that an
 * {@link IEmbeddableEditpart} becomes disposed and the view need to dispose the
 * {@link IValueBindingEditpart} too, since the binding editPart is not part of the
 * containment tree of the embeddable..
 */
public interface ILifecycleEvent {

	public static final String TYPE_RENDERED = "rendered";
	public static final String TYPE_UNRENDERED = "unrendered";
	public static final String TYPE_DISPOSED = "disposed";

	/**
	 * Returns the editpart that sent the event.
	 * 
	 * @return
	 */
	IElementEditpart getEditpart();

	/**
	 * Returns the type of the event.
	 * 
	 * @return
	 */
	String getType();
}
