package entities;

import static utils.GeneralUtils.formatNumber;

/**
 * Represents a town or city.
 * 
 * @author DorianBoel
 */
public class City {
	
	/**
	 * The city's official full name.
	 */
	private String name;
	
	/**
	 * The total number of inhabitants.
	 */
	private int population;

	/**
	 * Constructor for {@link City}.
	 * 
	 * Creates a new city with the given name and population.
	 * 
	 * @param name The city's name
	 * @param population The city's population
	 */
	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", name, formatNumber(population));
	}

	/**
	 * Getter for {@link #name}.
	 * 
	 * @return This city's official name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for {@link #population}.
	 * 
	 * @return This city's total population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter for {@link #name}
	 * 
	 * @param name The new name to replace the current one
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for {@link #population}
	 * 
	 * @param population The new population value to replace the current one
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

}
