package entities.geo;

/**
 * Represents a city with additional 
 * geographical and administrative information.
 * 
 * @author DorianBoel
 */
public class CensusCity extends City {
	
	/**
	 * The numerical code referring to the department
	 * the city belongs to.
	 */
	private String departmentCode;
	
	/**
	 * The name of the region the city belongs to.
	 */
	private String regionName;

	/**
	 * Constructor for {@link CensusCity}.
	 * 
	 * Creates a new city instance with the given attributes.
	 * 
	 * @param name The city's name
	 * @param population The city's population
	 * @param departmentCode The city's department code
	 * @param regionName The name of the city's region
	 */
	public CensusCity(String name, int population, String departmentCode, String regionName) {
		super(name, population);
		this.departmentCode = departmentCode;
		this.regionName = regionName;
	}

	/**
	 * Getter for {@link #departmentCode}.
	 * 
	 * @return The unique code of the department this city belongs to
	 */
	public String getDepartmentCode() {
		return this.departmentCode;
	}

	/**
	 * Getter for {@link #regionName}.
	 * 
	 * @return The name of the region this city belongs to
	 */
	public String getRegionName() {
		return this.regionName;
	}

	/**
	 * Setter for {@link #departmentCode}
	 * 
	 * @param departmentCode The new department code to replace the current one
	 */
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	/**
	 * Setter for {@link #regionName}
	 * 
	 * @param regionName The new region name to replace the current one
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
}
