package tp.part2;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.City;

public class TpLists2 {

	public static void main(String[] args) {
		
		// Initialisation d'une liste contenant plusieurs instances de ville
		List<City> cities = new ArrayList<>(Arrays.asList(
			new City("Nice", 343000),
			new City("Carcassonne", 47800),
			new City("Narbonne", 53400),
			new City("Lyon", 484000),
			new City("Foix", 9700),
			new City("Pau", 77200),
			new City("Marseille", 850700),
			new City("Tarbes", 40600)
		));
		
		// On recherche la ville ayant le plus grand nombre d'habitants
		City maxPopulationCity = null;
		int maxValue = Integer.MIN_VALUE;
		for (City city : cities) {
			if (city.getPopulation() > maxValue) {
				maxValue = city.getPopulation();
				maxPopulationCity = city;
			}
		}
		display(maxPopulationCity);
		
		// On recherche la ville ayant le plus petit nombre d'habitants
		City minPopulationCity = null;
		int minValue = Integer.MAX_VALUE;
		for (City city : cities) {
			if (city.getPopulation() < minValue) {
				minValue = city.getPopulation();
				minPopulationCity = city;
			}
		}
		
		// On la supprime de la liste
		cities.remove(minPopulationCity);
		
		// On met en majuscules le nom de toutes les villes ayant plus de 100 000 habitants
		for (City city : cities) {
			if (city.getPopulation() > 100_000) {
				city.setName(city.getName().toUpperCase());
			}
		}
		
		// Liste finale
		displayInCollection(cities);
		
	}
	
}
