package tp.part3;

import static utils.GeneralUtils.displayErr;

import entities.exceptions.ReflectionException;
import entities.geo.City;
import enums.Continent;
import utils.tp.part3.ReflectionUtils;;

public class TpReflection {

	public static void main(String[] args) {
		
		// On crée une instance de ville
		City city1 = new City("Tokyo", 12_653_192, Continent.ASIA);

		try {

			// On affiche les attributs de cet objet grâce à une fonction utilitaire
			ReflectionUtils.displayAttributes(city1);

			// On essaye d'appeler cette fonction en passant null comme paramètre
			ReflectionUtils.displayAttributes(null);

		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException err) {
			displayErr(err);
		}
		
	}
	
}
