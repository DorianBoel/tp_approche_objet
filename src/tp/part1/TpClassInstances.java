package tp.part1;

import entities.general.Person;
import entities.general.PostalAddress;
import utils.DisplayUtils;

public class TpClassInstances {

	public static void main(String[] args) {

		// On instantie deux adresses différentes
		PostalAddress address1 = new PostalAddress("5", "avenue Ferdinand de Lesseps", "38000", "Grenoble");
		PostalAddress address2 = new PostalAddress("71", "rue Pierre de Coubertin", "31100", "Toulouse");
		
		DisplayUtils.display(address1);
		DisplayUtils.display(address2);
		
		// On instantie deux nouvelles personnes avec les adresses existantes
		Person person1 = new Person("Pucepré", "Jean-Paul", address1);
		Person person2 = new Person("Kouyanski", "Aimé");
		person2.setAddress(address2);
		
		// Affichage du nom complet d'une personne avec une méthode de classe
		DisplayUtils.display(person1.getFullName());
		DisplayUtils.display(person2.getFullName());
		
	}

}
