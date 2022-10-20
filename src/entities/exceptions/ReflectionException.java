package entities.exceptions;

/**
 * Indicates that an error occured during a class
 * reflection related operation.
 * 
 * @author DorianBoel
 */
public class ReflectionException extends Exception {

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for {@link ReflectionException}.
	 * 
	 * Creates a new exception with the given message.
	 * 
	 * @param message The error message
	 */
	public ReflectionException(String message) {
		super(message);
	}
	
}
