package entities;

import static utils.GeneralUtils.formatNumber;

import enums.Continent;

/**
 * Represents a country/nation.
 * 
 * @author DorianBoel
 */
public class Country {

	/**
	 * The country's official name.
	 */
	private String name;
	
	/**
	 * The total number of inhabitants in the country.
	 */
	private int population;
	
	/**
	 * The country's gross domestic product per capita.
	 */
	private int gdpCapita;
	
	/**
	 * The continent where the country is located.
	 */
	private Continent continent;
	
	/**
	 * Constructor for {@link Country}.
	 * 
	 * Creates a new country with the given name, population and GDP per capita.
	 * 
	 * @param name The country's name
	 * @param population The country's population
	 * @param gdpCapita The country's gross domestic product per capita
	 */
	public Country(String name, int population, int gdpCapita) {
		this.name = name;
		this.population = population;
		this.gdpCapita = gdpCapita;
	}
	
	/**
	 * Constructor for {@link Country}.
	 * 
	 * Creates a new country with the given name, population and continent.
	 * 
	 * @param name The country's name
	 * @param population The country's population
	 * @param continent The country's gross domestic product per capita
	 */
	public Country(String name, int population, Continent continent) {
		this.name = name;
		this.population = population;
		this.continent = continent;
	}
	
	/**
	 * Calculate the country's total gross domestic product.
	 * 
	 * @return The country's total gross domestic product.
	 */
	public long getTotalGdp() {
		return (long) population * gdpCapita;
	}

	@Override
	public String toString() {
		String continent = this.continent != null ? ", " + this.continent.toString() : "";
		String totalGDP = gdpCapita > 0 ? ", PIB total: " + formatNumber(getTotalGdp()) : ""; 
		return String.format(
			"%s%s, %s habitants%s",
			name,
			continent,
			formatNumber(population),
			totalGDP
		);
	}
	
	/**
	 * Getter for {@link #name}.
	 * 
	 * @return This country's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for {@link #population}.
	 * 
	 * @return This country's total population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Getter for {@link #gdpCapita}.
	 * 
	 * @return This's country's GDP per capita
	 */
	public int getGdpCapita() {
		return gdpCapita;
	}
	
	/**
	 * Getter for {@link #continent}.
	 * 
	 * @return This's country's continent
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
	 * Setter for {@link #gdpCapita}.
	 * 
	 * @param gdpCapita The new GDP value to replace the current one
	 */
	public void setGdpCapita(int gdpCapita) {
		this.gdpCapita = gdpCapita;
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
