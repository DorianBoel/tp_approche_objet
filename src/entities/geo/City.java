package entities.geo;

import static utils.GeneralUtils.formatNumber;

import java.util.Objects;

import enums.Continent;

/**
 * Represents a town or city.
 * 
 * @author DorianBoel
 */
public class City implements Comparable<City> {
	
	/**
	 * The city's official full name.
	 */
	protected String name;
	
	/**
	 * The total number of inhabitants in the city.
	 */
	protected int population;
	
	/**
	 * The continent where this city is located.
	 */
	protected Continent continent;

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
	
	/**
	 * Constructor for {@link City}.
	 * 
	 * Creates a new city with the given name, population and continent.
	 * 
	 * @param name The city's name
	 * @param population The city's population
	 * @param continent The city's continent
	 */
	public City(String name, int population, Continent continent) {
		this(name, population);
		this.continent = continent; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof City)) {
			return false;
		}
		City cast = (City) obj;
		if (Objects.equals(name, cast.getName()) && population == cast.getPopulation()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(City city) {
		return city.getPopulation() - population;
	}
	
	@Override
	public String toString() {
		String continentStr = continent != null ? ", " + continent.getLabel() :  "";
		return String.format("%s%s, %s habitants", name, continentStr, formatNumber(population));
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
	 * Getter for {@link #continent}.
	 * 
	 * @return This continent where this city is located
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter for {@link #name}.
	 * 
	 * @param name The new name to replace the current one
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for {@link #population}.
	 * 
	 * @param population The new population value to replace the current one
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	/**
	 * Setter for {@link #continent}.
	 * 
	 * @param continent The new continent to replace the current one
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
