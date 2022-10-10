package entities;

public class Person {

	private String lastName;
	private String firstName;
	private PostalAddress address;
	
	public Person(String lastName, String firstName, PostalAddress address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format(
			"""
			%s %s
			Address : %s""", lastName, firstName, address.toString()
		);
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public PostalAddress getAddress() {
		return address;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	
}
