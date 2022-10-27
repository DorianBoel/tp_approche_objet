package utils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Non-instantiable class containing utility methods
 * used for displaying info in the console.
 * 
 * @author DorianBoel
 */
public final class DisplayUtils extends NonInstantiable {

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
	public static <T extends Object> void displayInCollection(Collection<T> collection) {
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
	
}
