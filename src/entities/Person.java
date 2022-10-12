package entities;

/**
 * Represents a person.
 * 
 * @author DorianBoel
 */
public class Person {

	/**
	 * The person's last name.
	 */
	protected String lastName;
	
	/**
	 * The person's first name.
	 */
	protected String firstName;
	
	/**
	 * The person's postal address.
	 */
	protected PostalAddress address;
	
	/**
	 * Constructor for {@link Person}.
	 * 
	 * Creates a new person with the given first and last names.
	 * 
	 * @param lastName The person's last name
	 * @param firstName The person's first name
	 */
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	/**
	 * Constructor for {@link Person}.
	 * 
	 * Creates a new person with the given name and address.
	 * 
	 * @param lastName The person's last name
	 * @param firstName The person's first name
	 * @param address The person's postal address
	 */
	public Person(String lastName, String firstName, PostalAddress address) {
		this(lastName, firstName);
		this.address = address;
	}
	
	/**
	 * Returns this person's full name with the last name to uppercase.
	 *
	 * @return This person's full name
	 */
	public String getFullName() {
		return String.format("%s %s", lastName.toUpperCase(), firstName);
	}
	
	/**
	 * Returns a string representation of the person.
	 *
	 * @return A string representation of the person
	 */
	@Override
	public String toString() {
		String addressVal = address != null ? "\nAdresse: " + address.toString() : "";
		return String.format("%s%s", getFullName(), addressVal);
	}

	/**
	 * Getter for {@link #lastName}
	 * 
	 * @return This person's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Getter for {@link #firstName}.
	 * 
	 * @return This person's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Getter for {@link #address}.
	 * 
	 * @return This person's address
	 */
	public PostalAddress getAddress() {
		return address;
	}

	/**
	 * Setter for {@link #lastName}.
	 * 
	 * @param lastName The new last name to replace the current one
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Setter for {@link #firstName}.
	 * 
	 * @param firstName The new first name to replace the current one
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Setter for {@link #address}.
	 * 
	 * @param address The new address to replace the current one
	 */
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	
}
