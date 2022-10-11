package tp;

import entities.Account;

import static utils.GeneralUtils.defaultToString;
import static utils.GeneralUtils.display;

public class TpBank {
	
	public static void main(String[] args) {

		// Instantiation d'un compte bancaire
		Account account1 = new Account("13870352", 4943.45f);
		
		// L'adresse mémoire de l'objet 'account1' est affichée
		display(defaultToString(account1));		
		
		// On affiche les infos du compte avec une méthode 'toString' redéfinie
		display(account1.toString());
		
	}
	
}
