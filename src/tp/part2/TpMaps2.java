package tp.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.geo.City;
import entities.geo.Country;
import enums.Continent;

import static utils.GeneralUtils.displayInMap;

public class TpMaps2 {

	public static void main(String[] args) {

		// Initialisation d'une liste de villes
		List<City> cityList = new ArrayList<>(Arrays.asList(
			new City("Nice", 343_000),
			new City("Carcassonne", 47_800),
			new City("Narbonne", 53_400),
			new City("Lyon", 484_000),
			new City("Foix", 9_700),
			new City("Pau", 77_200),
			new City("Marseille", 850_700),
			new City("Tarbes", 40_600)
		));
		
		// Initialisation d'une nouvelle map
		Map<String, City> cityMap = new HashMap<>();

		// On associe chaque ville à son nom dans la map
		for (City city : cityList) {
			cityMap.put(city.getName(), city);
		}
		
		// On supprime la ville ayant le moins d'habitants
		String minPopulationCityKey = "";
		int minValue = Integer.MAX_VALUE;
		for (String key : cityMap.keySet()) {
			City city = cityMap.get(key);
			if (city.getPopulation() < minValue) {
				minValue = city.getPopulation();
				minPopulationCityKey = key;
			}
		}
		cityMap.remove(minPopulationCityKey);
		
		// Map finale
		displayInMap(cityMap);
		
		// Initialisation d'une liste de pays
		List<Country> countryList = new ArrayList<>(Arrays.asList(
			new Country("France", Continent.EUROPE, 65_000_000),
			new Country("Allemagne", Continent.EUROPE, 80_000_000),
			new Country("Belqique", Continent.EUROPE, 10_000_000),
			new Country("Russie", Continent.ASIA, 150_000_000),
			new Country("Chine", Continent.ASIA, 1_400_000_000),
			new Country("Indonesia", Continent.OCEANIA, 220_000_000),
			new Country("Australia", Continent.OCEANIA, 20_000_000)
		));
		
		// Initialisation d'une nouvelle map
		Map<Continent, Integer> countriesPerContinent = new HashMap<>();
		
		// On compte le nombre de pays par continent dans la liste
		for (Country country1 : countryList) {
			Continent continent = country1.getContinent();
			int countryCount = 0;
			for (Country country2 : countryList) {
				if (country2.getContinent().equals(continent)) {
					countryCount++;
				}
			}
			// On rajoute la paire obtenue à la map 
			countriesPerContinent.put(continent, countryCount);
		}
		
		// Map obtenue
		displayInMap(countriesPerContinent);
		
	}

}
