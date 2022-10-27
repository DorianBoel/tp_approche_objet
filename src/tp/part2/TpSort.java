package tp.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import entities.geo.City;
import utils.DisplayUtils;
import utils.tp.part2.CityComparators;

public class TpSort {

	public static void main(String[] args) {
		
		// Initialisation d'une liste contenant plusieurs instances de ville
		List<City> cities = new ArrayList<>(Arrays.asList(
			new City("Nice", 343_000),
			new City("Carcassonne", 47_800),
			new City("Narbonne", 53_400),
			new City("Lyon", 484_000),
			new City("Foix", 9_700),
			new City("Pau", 77_200),
			new City("Marseille", 850_700),
			new City("Tarbes", 40_600)
		));
		
		// On trie la liste par ordre décroissant de population
		Collections.sort(cities);
		DisplayUtils.displayInCollection(cities);
		
		// On trie ensuite la liste par ordre alphabétique de nom
		Collections.sort(cities, CityComparators.NAME_COMPARATOR_ALPHABETICAL);
		DisplayUtils.displayInCollection(cities);
		
		// On trie à nouveau la liste par ordre croissant de population en utilisant un comparator
		cities.sort(CityComparators.POPULATION_COMPARATOR_ASCENDING);
		DisplayUtils.displayInCollection(cities);

	}
	
}
