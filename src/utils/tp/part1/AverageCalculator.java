package utils.tp.part1;

import static utils.GeneralUtils.pushToArray;

/**
 * A utility class used to calculate the average of an
 * array of numbers within each instance. 
 * 
 * @author DorianBoel
 */
public class AverageCalculator {

	/**
	 * The array of numbers from which to calculate the average value.
	 */
	private double[] numberArray = {};
	
	/**
	 * Adds a new number to the array of numbers belonging to this instance.
	 * 
	 * @param num A new number to add to the array
	 */
	public void push(double num) {
		numberArray = pushToArray(num, numberArray);
	}
	
	/**
	 * Adds a each value in an array of numbers to the array belonging to this instance.
	 * 
	 * @param num A new array of numbers whose values to add to the array
	 */
	public void push(double[] numArray) {
		for (double num : numArray) {			
			push(num);
		}
	}
	
	/**
	 * Calculates the average value of all current values
	 * included in the array of numbers.
	 * 
	 * @return The resulting average value
	 */
	public double calculateAverage() {
		double average = 0;
		for (double num : numberArray) {
			average += num;
		}
		return average / numberArray.length;
	}
	
	/**
	 * Getter for {@link #numberArray}.
	 * 
	 * @return This instance's array of numbers
	 */
	public double[] getNumberArray() {
		return numberArray;
	}
	
}
