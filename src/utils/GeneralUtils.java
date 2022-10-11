package utils;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Non-instantiable class containing various utility methods
 * for easier reusability.
 * 
 * @author DorianBoel
 */
public final class GeneralUtils {

	/**
	 * This class should not be instantiated.
	 */
	private GeneralUtils() {
		throw new UnsupportedOperationException("The class " + this.getClass().getSimpleName() + "cannot be instantiated.");
	}
	
	/**
	 * Prints a message in the console followed by an empty new line.
	 * 
	 * @param message The message to display
	 */
	public static void display(Object message) {
		System.out.println(message);
		System.out.println();
	}
	
	/**
	 * Prints each value in an array, then prints an empty new line at the end.
	 * 
	 * @param <T> The type of values in the array
	 * @param array The array from which to display values
	 */
	public static <T> void displayInArray(T[] array) {
		for (T o : array) {
			System.out.println(o);
		}
		System.out.println();
	}
	
	/**
	 * Returns a {@code String} representation of an object as
	 * though its {@link Object#toString toString} method had not been overridden.
	 * 
	 * @param o The object to convert to {@code String}
	 * @return The default string representation of the object
	 */
	public static String defaultToString(Object o) {
		return o.getClass().getName() + '@' + Integer.toHexString(o.hashCode());
	}
	
	/**
	 * Returns a formatted {@code String} of a currency
	 * value, based on the current locale format.
	 * 
	 * @param currency The currency value to be formatted
	 * @return The formatted currency value
	 */
	public static String formatCurrency(double currency) {
		return NumberFormat.getCurrencyInstance().format(currency);
	}
	
	/**
	 * Returns a formatted {@code String} of a
	 * number, based on the current locale format.
	 * 
	 * @param number The number to be formatted
	 * @return The formatted number
	 */
	public static String formatNumber(double number) {
		return NumberFormat.getNumberInstance().format(number);
	}
	
	/**
	 * Returns a formatted {@code String} of a
	 * date, based on the current locale format.
	 * 
	 * @param date The date to be formatted
	 * @return The formatted date
	 */
	public static String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
	}
	
}
