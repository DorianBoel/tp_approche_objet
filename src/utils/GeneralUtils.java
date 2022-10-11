package utils;

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
	 * Returns a {@code String} representation of an object as
	 * though its {@link Object#toString toString} method had not been overridden.
	 * 
	 * @param o The object to convert to {@code String}
	 * @return The default string representation of the object
	 */
	public static String defaultToString(Object o) {
		return o.getClass().getName() + '@' + Integer.toHexString(o.hashCode());
	}
	
}
