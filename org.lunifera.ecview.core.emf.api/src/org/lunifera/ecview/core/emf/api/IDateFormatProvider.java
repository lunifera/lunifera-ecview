package org.lunifera.ecview.core.emf.api;

import java.util.Locale;

import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution;

/**
 * Provides information about the dateformat and the resolution.
 */
public interface IDateFormatProvider {

	/**
	 * Returns the date format and resolution for the given parameters.
	 * 
	 * @param yDt
	 * @param locale
	 * @return
	 */
	Info getInfo(YDateTimeDatatype yDt, Locale locale);

	public static class Info {

		private String dateFormat;
		private YDateTimeResolution resolution;

		public Info(String dateFormat, YDateTimeResolution resolution) {
			super();
			this.dateFormat = dateFormat;
			this.resolution = resolution;
		}

		/**
		 * @return the dateFormat
		 */
		public String getDateFormat() {
			return dateFormat;
		}

		/**
		 * @return the resolution
		 */
		public YDateTimeResolution getResolution() {
			return resolution;
		}

	}

}
