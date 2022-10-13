package utils.tp.part1;

import enums.ArithmeticOperationType;

/**
 * Utility class used to perform basic arithmetic operations.
 *
 * @author DorianBoel
 */
public final class Operations {

	/**
	 * This class should not be instantiated.
	 */
	private Operations() {
		throw new UnsupportedOperationException("The class " + this.getClass().getSimpleName() + "cannot be instantiated.");
	}
	
	/**
	 * Calculates an arithmetic operation of a given type between
	 * two given numbers.
	 * 
	 * @param x The first number
	 * @param y The second number
	 * @param operation The type of operation to perform
	 * @return The result of the operation
	 * @throws UnsupportedOperationException If the given operation type is not recognized
	 */
	public static double calculate(double x, double y, ArithmeticOperationType operation) throws Exception {
		double result;
		switch(operation) {
			case ADDITION -> result = x + y;
			case SUBSTRACTION -> result = x - y;
			case MULTIPLICATION -> result = x * y;
			case DIVISION -> result = x / y;
			default -> throw new Exception("Unknow operation");
		}
		return result;
	}
	
}
