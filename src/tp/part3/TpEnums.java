package tp.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.geo.City;
import enums.Continent;
import enums.Season;
import utils.DisplayUtils;

public class TpEnums {

	public static void main(String[] args) {
		
		// On affiche toutes les saisons grâce à une boucle
		DisplayUtils.displayInArray(Season.values());
		
		// On recherche la saison dont le nom d'instance correspond à une chaîne
		String seasonInstanceName = "SUMMER";
		Season seasonInstance = Season.valueOf(seasonInstanceName);
		DisplayUtils.display(seasonInstance);
		
		// On recherche la saison dont l'attribut nom correspond à une chaîne
		String seasonName = "Hiver";
		Season seasonInstance2 = Season.withName(seasonName);
		DisplayUtils.display(seasonInstance2);
		
		// On initialise une liste de villes avec le continent dans leurs paramètres
		List<City> cities = new ArrayList<>(
			Arrays.asList(
				new City("New York", 8_804_190, Continent.AMERICA),
				new City("Paris", 2_165_423, Continent.EUROPE),
				new City("Beijing", 1_411_778_724 , Continent.ASIA),
				new City("Moscow", 12_455_682, Continent.EUROPE),
				new City("Berlin", 3_664_088, Continent.EUROPE),
				new City("Sydney", 4_959_107, Continent.OCEANIA),
				new City("Sao Paulo", 213_317_639, Continent.AMERICA),
				new City("Dakar", 2_646_503, Continent.AFRICA)
			)
		);
		
		// Contenu de la liste
		DisplayUtils.displayInCollection(cities);
		
	}
	
}
