package entities;

/**
 * Represents a contributor with a fixed monthly salary.
 *
 * @author DorianBoel
 */
public class Salaried extends Contributor {
	
	/**
	 * The contributor's monthly salary.
	 */
	float salary;

	/**
	 * Constructor for {@link Salaried}.
	 * 
	 * Creates a new salaried contributor with the given name and salary.
	 * 
	 * @param lastName The contributor's last name
	 * @param firstName The contributor's first name
	 * @param salary The contributor's salary
	 */
	public Salaried(String lastName, String firstName, float salary) {
		super(lastName, firstName);
		this.salary = salary;
	}
	
	/**
	 * Getter for {@link #salary}.
	 * 
	 * @return This contributor's salary
	 */
	@Override
	public float getSalary() {
		return salary;
	}
	
	/**
	 * Setter for {@link #salary}.
	 * 
	 * @param salary The new salary to replace the current one
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
