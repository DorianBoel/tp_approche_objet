package enums;

/**
 * Enumeration listing the four seasons in a year.
 * 
 * @author DorianBoel
 */
public enum Season {
	
	/**
	 * Represents the season of spring.
	 */
	SPRING("Printemps", 1),
	
	/**
	 * Represents the season of summer.
	 */
	SUMMER("Été", 2),
	
	/**
	 * Represents the season of autumn.
	 */
	AUTUMN("Automne", 3),
	
	/**
	 * Represents the season of winter.
	 */
	WINTER("Hiver", 4);
	
	/**
	 * The season's common name.
	 */
	private String name;
	
	/**
	 * The season's order in a year relative to the other seasons
	 * (1 for spring, 2 for summer etc...).
	 */
	private int order;
	
	/**
	 * Enum constructor for {@link Season}.
	 * 
	 * @param name The season's name
	 * @param order The season's order in a year
	 */
	Season(String name, int order) {
		this.name = name;
		this.order = order;
	}
	
	/**
	 * Returns the season whose name is equal to the given string value.
	 * 
	 * @param name The string corresponding to a season's name
	 * @return The resulting season if it exists, or {@code null} otherwise.
	 */
	public static Season withName(String name) {
		for (Season season : Season.values()) {
			if (season.getName().equals(name)) {
				return season;
			}
		}
		return null;
	}
	
	/**
	 * Getter for {@link #name}.
	 * 
	 * @return This season's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for {@link #order}.
	 * 
	 * @return This season's order in a year
	 */
	public int getOrder() {
		return this.order;
	}
	
}
