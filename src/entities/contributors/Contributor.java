package entities.contributors;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.formatCurrency;

import entities.Person;

/**
 * Abstract class representing a generic contributor
 * of a newspaper business organization.
 * 
 * @author DorianBoel
 */
public abstract class Contributor extends Person {

	/**
	 * Constructor for {@link Contributor}.
	 * 
	 * Creates a new contributor with the given name.
	 * 
	 * @param lastName The contributor's first name
	 * @param firstName The contributor's last name
	 */
	public Contributor(String lastName, String firstName) {
		super(lastName, firstName);
	}
	
	/**
	 * Returns this contributor's salary.
	 * 
	 * @return This contributor's salary
	 */
	public abstract float getSalary();
	
	/**
	 * Displays info pertaining to this contributor.
	 */
	public void displayInfo() {
		display(toString());
	};
	
	/**
	 * Returns a string representation of this contributor.
	 *
	 * @return A string representation of this contributor
	 */
	@Override
	public String toString() {
		return String.format(
			"%s\n%s; Salaire: %s",
			super.toString(),
			getClass().getSimpleName(),
			formatCurrency(getSalary())
		);
	}

}
