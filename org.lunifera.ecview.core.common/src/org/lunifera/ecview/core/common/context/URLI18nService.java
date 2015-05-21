package org.lunifera.ecview.core.common.context;

import java.net.URL;
import java.util.Locale;

import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.i18n.I18nRegistry;

/**
 * The I18nService uses the given URLs to add property files.
 * <p>
 * See {@link I18nRegistry} for details about the file name pattern.
 */
public class URLI18nService extends AbstractDisposable implements II18nService {

	private I18nRegistry registry = new I18nRegistry();

	/**
	 * Append the translations.
	 * @param url
	 */
	public void append(URL url) {
		checkDisposed();
		registry.addResource(url);
	}

	@Override
	public String getValue(String i18nKey, Locale locale) {
		checkDisposed();
		return registry.findTranslation(locale, i18nKey);
	}

	@Override
	protected void internalDispose() {
		registry = null;
	}

}
