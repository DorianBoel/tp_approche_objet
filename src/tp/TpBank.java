package tp;

import static utils.GeneralUtils.defaultToString;
import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInArray;

import entities.Account;
import entities.RateAccount;

public class TpBank {
	
	public static void main(String[] args) {

		// Instantiation d'un compte bancaire
		Account account1 = new Account("13870352", 4943.45f);
		
		// L'adresse mémoire de l'objet 'account1' est affichée
		display(defaultToString(account1));
		
		// On affiche les infos du compte avec une méthode 'toString' redéfinie
		display(account1.toString());
		
		// Instantation d'une classe 'RateAccount' héritant de 'Account'
		RateAccount account2 = new RateAccount("14682038", 3521.78f, 4.1f);
		
		// Initialisation d'un tableau de comptes
		Account[] accounts = {account1, account2};
		
		// On affiche le contenu du tableau
		displayInArray(accounts);
		
	}
	
}
