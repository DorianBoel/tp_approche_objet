package enums;

/**
 * Enumeration listing every continent on Earth.
 * 
 * @author DorianBoel
 */
public enum Continent {

	/**
	 * Represents the African continent.
	 */
	AFRICA("Afrique"),
	
	/**
	 * Represents the American continent, comprised of
	 * North and South America.
	 */
	AMERICA("Amérique"),
	
	/**
	 * Represents the Asian continent.
	 */
	ASIA("Asie"),
	
	/**
	 * Represents the European continent.
	 */
	EUROPE("Europe"),
	
	/**
	 * Represents the Oceanian continent.
	 */
	OCEANIA("Océanie");
	
	/**
	 * The continent's name.
	 */
	private String label;
	
	/**
	 * Enum constructor {@link Continent}.
	 * 
	 * @param label The continent's name
	 */
	Continent(String label) {
		this.label = label;
	}
	
	/**
	 * @return This continent's label.
	 */
	public String getLabel() {
		return label;
	}
	
}
