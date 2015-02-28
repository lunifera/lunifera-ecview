package org.lunifera.ecview.core.common.context;

import java.text.DecimalFormat;
import java.util.Locale;

public class I18nUtil {
	/**
	 * Formats the enum literal.
	 * 
	 * @param value
	 * @return
	 */
	public static String translateEnum(II18nService i18nService, Object value,
			Locale locale) {
		Enum<?> enumx = (Enum<?>) value;
		String i18nKey = getI18nKey(enumx.getClass().getName(), enumx);
		String result = null;
		if (i18nService != null) {
			result = i18nService.getValue(i18nKey, locale);
		}

		if (result == null || result.trim().equals("")) {
			result = enumx.name();
		}

		return result;
	}

	/**
	 * Formats the boolean value.
	 * 
	 * @param i18nService
	 * @param value
	 * @param locale
	 * @return
	 */
	public static String translateBoolean(II18nService i18nService,
			Boolean value, Locale locale) {
		if (i18nService == null) {
			return "";
		}
		String result = i18nService.getValue(Boolean.class.getName() + "."
				+ value.toString(), locale);

		if (result == null || result.trim().equals("")) {
			result = value.toString();
		}

		return result;
	}

	/**
	 * Returns the i18n key for the enum and its literal.
	 * 
	 * @param enumName
	 * @param literal
	 * @return
	 */
	public static String getI18nKey(String enumName, Enum<?> literal) {
		return enumName + "." + literal.name();
	}

	/**
	 * Returns the i18n key for the enum and its literal.
	 * 
	 * @param enumName
	 * @param literal
	 * @return
	 */
	public static String getI18nKey(Enum<?> enumX) {
		return getI18nKey(enumX.getClass().getName(), enumX);
	}

	/**
	 * Returns the i18nImageKey for the Enum name and literal.
	 * 
	 * @param enumName
	 * @param literal
	 * @return
	 */
	public static String getImageI18nKey(String enumName, Enum<?> literal) {
		return enumName + "." + literal.name() + ".image";
	}

	/**
	 * Returns the image key for the given label key.
	 * 
	 * @param i18nLabelKey
	 * @return
	 */
	public static String getImageKey(String i18nLabelKey) {
		String iconKey = i18nLabelKey + ".image";
		return iconKey;
	}

	/**
	 * Translates number values to their locale representation.
	 * 
	 * @param i18nService
	 * @param number
	 * @param locale
	 * @return
	 */
	public static String translateNumber(II18nService i18nService,
			Number number, Locale locale) {

		if (number instanceof Short || number instanceof Integer
				|| number instanceof Byte || number instanceof Long) {
			return DecimalFormat.getIntegerInstance(locale).format(number);
		} else {
			return DecimalFormat.getNumberInstance(locale).format(number);
		}
	}
}
