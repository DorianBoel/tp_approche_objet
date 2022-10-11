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
	
}
