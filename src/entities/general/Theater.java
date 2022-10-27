package entities.general;

import utils.DisplayUtils;

/**
 * Represents a theater business.
 *
 * @author DorianBoel
 */
public class Theater {

	/**
	 * The official name referring to the theater.
	 */
	private String name;
	
	/**
	 * The maximum amount of people the theater can hold in the audience.
	 */
	private int capacity;
	
	/**
	 * The current amount of customers registered to attend an upcoming event in the theater.
	 */
	private int registeredCustomerCount = 0;
	
	/**
	 * The current total income of the theater.
	 */
	private float income = 0;
	
	/**
	 * Constructor for {@link Theater}.
	 * 
	 * Creates a new theater with the given name and capacity.
	 * 
	 * @param name The name of the theater
	 * @param capacity The maximum capacity of the theater
	 */
	public Theater(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	/**
	 * Registers a given number of people to be a part of the theater's audience.
	 * Also calculates the received income following the registration
	 * depending on the price of a ticket.
	 * 
	 * @param peopleNum The number of new customers to register
	 * @param price The price of a ticket
	 * @throws Exception If the number of registered customers would become larger
	 * than the theater's maximum capacity
	 */
	public void register(int peopleNum, float price) throws Exception {
		if (this.registeredCustomerCount + peopleNum > this.capacity) {
			throw new Exception("Inscription annulée: Pas assez de places disponibles");
		}
		this.registeredCustomerCount += peopleNum;
		this.income += peopleNum * price;
	}
	
	/**
	 * Displays the current amount of registered customers and the
	 * number of remaining available seats.
	 */
	public void displayRegistrationInfo() {
		DisplayUtils.display(String.format(
			"Personnes inscrites: %d, places restantes: %d",
			registeredCustomerCount,
			capacity - registeredCustomerCount
		));
	}

	/**
	 * Getter for {@link #name}.
	 * 
	 * @return This theater's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for {@link #capacity}.
	 * 
	 * @return This theater's maximum capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Getter for {@link #registeredCustomerCount}.
	 * 
	 * @return The current amount of registered customers
	 */
	public int getRegisteredCustomerCount() {
		return registeredCustomerCount;
	}

	/**
	 * Getter for {@link #income}.
	 * 
	 * @return The current total income of this theater
	 */
	public float getIncome() {
		return income;
	}

	/**
	 * Setter for {@link #name}.
	 * 
	 * @param name The new name to replace the current one.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for {@link #capacity}.
	 * 
	 * @param name The new capacity to replace the current one.
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
