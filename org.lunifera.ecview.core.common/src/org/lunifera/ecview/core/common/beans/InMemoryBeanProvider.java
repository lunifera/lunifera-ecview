package org.lunifera.ecview.core.common.beans;

import java.util.List;

/**
 * Implementations may return beans of any kind that are not persisted, but used
 * In-Memory. For instance as a suggestion list for combo boxes.
 */
public interface InMemoryBeanProvider {

	/**
	 * Returns a list of beans.
	 * 
	 * @return
	 */
	List<?> getBeans();

}
