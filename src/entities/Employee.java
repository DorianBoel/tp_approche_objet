package entities;

import static utils.GeneralUtils.formatCurrency;

/**
 * Represents the employee of a company.
 * 
 * @author DorianBoel
 */
public class Employee extends Person {
	
	/**
	 * The employee's monthly salary
	 */
	double salary;

	/**
	 * Constructor for {@link Employee}.
	 * 
	 * Creates a new employee with the given name and salary.
	 * 
	 * @param lastName The employee's last name
	 * @param firstName The employee's first name
	 * @param salary The employee's salary
	 */
	public Employee(String lastName, String firstName, double salary) {
		super(lastName, firstName);
		this.salary = salary;
	}
	
	/**
	 * Returns a string representation of the person.
	 *
	 * @return A string representation of the person
	 */
	@Override
	public String toString() {
		return String.format("%s\nSalaire: %s", super.toString(), formatCurrency(salary));
	}

	/**
	 * Getter for {@link #salary}.
	 * 
	 * @return This employee's salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Setter for {@link #salary}.
	 * 
	 * @param salary The new salary to replace the current one
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
