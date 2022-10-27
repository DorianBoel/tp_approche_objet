package tp.part3;

import static utils.GeneralUtils.annotatedToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.geo.Country;
import enums.Continent;
import utils.DisplayUtils;

public class TpAnnotations {

	public static void main(String[] args) {
		
		// Initialisation d'une liste contenant plusieurs instances de ville
		List<Country> countries = new ArrayList<>(Arrays.asList(
			new Country("USA", Continent.AMERICA, 334_805_000),
			new Country("France", Continent.EUROPE, 65_585_000),
			new Country("Germany", Continent.EUROPE, 83_884_000),
			new Country("UK", Continent.EUROPE, 68_498_000),
			new Country("Italy", Continent.EUROPE, 60_263_000),
			new Country("Japan", Continent.ASIA, 125_585_000),
			new Country("China", Continent.ASIA, 1_448_471_000),
			new Country("Russia", Continent.ASIA, 145_806_000),
			new Country("India", Continent.ASIA, 1_406_632_000)
		));
	
		try {
			
			// Affichage des données à l'aide de la méthode toString et des annotations
			for (Country country : countries) {				
				DisplayUtils.display(annotatedToString(country));
			}
			
		} catch (IllegalArgumentException | IllegalAccessException err) {
			DisplayUtils.displayErr(err);
		}
	}
	
}
