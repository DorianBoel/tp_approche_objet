package entities;

/**
 * Represents a mailing address.
 * 
 * @author DorianBoel
 */
public class PostalAddress {
	
	/**
	 * The street number of the building associated with the address.
	 */
	private String houseNumber;
	
	/**
	 * The name of the street associated with the address.
	 */
	private String streetName;
	
	/**
	 * The postal code indicating the mailing zone where the address is located.
	 */
	private String postalCode;
	
	/**
	 * The name of the city the address is located in.
	 */
	private String cityName;
	
	/**
	 * Constructor for {@link PostalAddress}.
	 * 
	 * Creates a new postal address with the given info.
	 * 
	 * @param houseNumber The address's street number
	 * @param streetName The name of the street
	 * @param postalCode The address's postal code
	 * @param cityName The name of the city
	 */
	public PostalAddress(String houseNumber, String streetName, String postalCode, String cityName) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.cityName = cityName;
	}
	
	/**
	 * Returns a string representation of the address.
	 *
	 * @return A string representation of the address
	 */
	@Override
	public String toString() {
		return String.format("%s %s, %s %s", houseNumber, streetName, postalCode, cityName);
	}

	/**
	 * Getter for {@link #houseNumber}.
	 * 
	 * @return This address's street number
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Getter for {@link #streetName}.
	 * 
	 * @return The name of the street of this address
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Getter for {@link #postalCode}.
	 * 
	 * @return This address's postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Getter for {@link #cityName}.
	 * 
	 * @return The name of this address's city
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Setter for {@link #houseNumber}.
	 * 
	 * @param houseNumber The new street number to replace the current one
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * Setter for {@link #streetName}.
	 * 
	 * @param streetName The new street name to replace the current one
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Setter for {@link #postalCode}.
	 * 
	 * @param postalCode The new postal code to replace the current one
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Setter for {@link #cityName}.
	 * 
	 * @param cityName The new city name to replace the current one
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
