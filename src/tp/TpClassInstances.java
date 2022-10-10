package tp;

import entities.Person;
import entities.PostalAddress;
import static utils.GeneralUtils.*;

public class TpClassInstances {

	public static void main(String[] args) {

		// On instantie deux adresses différentes
		PostalAddress address1 = new PostalAddress("5", "avenue Ferdinand de Lesseps", "38000", "Grenoble");
		PostalAddress address2 = new PostalAddress("71", "rue Pierre de Coubertin", "31100", "Toulouse");
		
		
		display(address1.toString());
		display(address2.toString());
		
		// On instantie deux nouvelles personnes avec les adresses existantes
		Person person1 = new Person("Pucepré", "Jean-Paul", address1);
		Person person2 = new Person("Kouyanski", "Aimé", address2);
		
		display(person1.toString());
		display(person2.toString());
		
	}

}
