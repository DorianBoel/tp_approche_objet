package tp.part3;

import static utils.GeneralUtils.display;

import java.util.function.BiConsumer;

import entities.geo.City;

public class TpEquals {

	public static void main(String[] args) {
		
		BiConsumer<City, City> areCitiesEqualMethod = (city1, city2) ->
			display(city1.equals(city2));
			
		BiConsumer<City, City> areCitiesEqualOperator = (city1, city2) ->
			display(city1 == city2);
		
		// On instancie deux villes aux attributs identiques
		City city1 = new City("Nice", 343_000);
		City city2 = new City("Nice", 343_000);
		
		// On vérifie leur égalité
		areCitiesEqualMethod.accept(city1, city2);
		areCitiesEqualOperator.accept(city1, city2);
		
		// On change les attributs d'une des deux villes
		city2.setName("Marseille");
		city2.setPopulation(850_700);
		
		// On vérifie à nouveau
		areCitiesEqualMethod.accept(city1, city2);
		areCitiesEqualMethod.accept(city1, city2);

	}
	
}
