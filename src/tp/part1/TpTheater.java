package tp.part1;

import static utils.GeneralUtils.formatCurrency;
import static utils.GeneralUtils.randomInt;

import entities.general.Theater;
import utils.DisplayUtils;

public class TpTheater {

	public static void main(String[] args) {
		
		// Instanciation d'un nouveau théâtre
		Theater theater1 = new Theater("Théâtre Molière", 500);
		
		// On définie combien coûte une place
		float price = 12.99f;
		
		// On inscrit un certain nombre de personnes jusqu'à ce que la capacité max soit atteinte
		try {
			while (true) {
				theater1.register(randomInt(10, 25), price);
				theater1.displayRegistrationInfo();
			}
		} catch (Exception err) {
			DisplayUtils.displayErr(err);
		}

		// On affiche le nombre total de clients inscrits puis la recette totale du théâtre suite aux inscriptions
		DisplayUtils.display(theater1.getRegisteredCustomerCount());
		DisplayUtils.display(formatCurrency(theater1.getIncome()));
		
	}

}
