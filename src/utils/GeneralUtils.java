package utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import entities.annotations.ToString;

/**
 * Non-instantiable class containing various utility methods
 * for easier reusability.
 * 
 * @author DorianBoel
 */
public final class GeneralUtils extends NonInstantiable {

	/**
	 * This class should not be instantiated.
	 */
	private GeneralUtils() {
		super();
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
	 * Prints a message in the console as an error followed by an empty new line.
	 * 
	 * @param message The error message to display
	 */
	public static void displayErr(Object message) {
		System.err.println(message);
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
	 * Prints each value in a {@link Collection} object, then prints an empty new line at the end.
	 * 
	 * @param <T> The type of values in the collection
	 * @param collection The collection from which to display values
	 */
	public static <T> void displayInCollection(Collection<T> collection) {
		displayInArray(Objects.requireNonNull(collection).toArray());
	}
	
	/**
	 * Prints each key-value pair in a {@link Map}, then prints an empty new line at the end.
	 * 
	 * @param <K> The type of keys in the map
	 * @param <V> The type of values in the map
	 * @param map The map from which to display pairs
	 */
	public static <K, V> void displayInMap(Map<K, V> map) {
		for (K key : map.keySet()) {
			System.out.println(String.format("%s : %s", String.valueOf(key), String.valueOf(map.get(key))));
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
	public static String toStringDefault(Object o) {
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
	
	/**
	 * Adds a given {@code double} value to the end of an array,
	 * increasing its length by one.
	 * 
	 * @param value A {@code double} value to be added to the array
	 * @param array An array to add the new value to
	 * @return The array with the newly added value at the end
	 */
	public static double[] pushToArray(double value, double[] array) {
		double[] newArr = new double[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		newArr[newArr.length - 1] = value;
		return newArr;
	}
	
	/**
	 * Adds a given value to the end of an array of objects,
	 * increasing its length by one.
	 * 
	 * @param <T> The type of objects in the array
	 * @param value An object to be added to the array
	 * @param array An array to add the new value to
	 * @return The array with the newly added value at the end
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> T[] pushToArray(T value, T[] array) {
		T[] newArr = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length + 1);
		for (int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		newArr[newArr.length - 1] = value;
		return newArr;
	}
	
	/**
	 * Returns a random integer between 0 and the given maximum value.
	 * 
	 * @param max The maximum value a generated number can have
	 * @return A randomly generated integer
	 */
	public static int randomInt(int max) {
		return (int) Math.floor(Math.random() * (max + 1));
	}
	
	/**
	 * Returns a random integer between two given values.
	 * 
	 * @param min The minimum value a generated number can have
	 * @param max The maximum value a generated number can have
	 * @return A randomly generated integer
	 */
	public static int randomInt(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
	
	/**
	 * Returns a {@code String} representation of a given object
	 * containing only attributes annotated with the {@link ToString} annotation.
	 * The resulting string format follows the annotation's parameters.
	 * 
	 * @param obj The object to convert to string
	 * @return The string reprensentation of the object
	 * @throws IllegalArgumentException If this {@code Field} object
	 * is enforcing Java language access control and the underlying
     * field is inaccessible
	 * @throws IllegalAccessException If the specified object is not an
     * instance of the class or interface declaring the underlying
     * field (or a subclass or implementor thereof)
	 */
	public static String annotatedToString(Object obj) throws IllegalArgumentException, IllegalAccessException {
		if (obj == null) {
			return Objects.toString(obj);
		}
		Class<?> objClass = obj.getClass();
		StringBuilder strBuilder = new StringBuilder(objClass.getSimpleName() + "\n");
		for (Field field : objClass.getDeclaredFields()) {
			field.setAccessible(true);
			ToString annotation = field.getAnnotation(ToString.class);
			if (annotation != null) {
				String value =
					annotation.uppercase() ?
					Objects.toString(field.get(obj)).toUpperCase() :
					Objects.toString(field.get(obj));
				strBuilder.append(String.format("%s%s ", value, annotation.separator()));
			}
		}
		strBuilder.deleteCharAt(strBuilder.length() - 1);
		return strBuilder.toString();
	}
	
}
