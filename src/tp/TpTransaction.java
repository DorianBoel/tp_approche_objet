package tp;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInArray;
import static utils.GeneralUtils.formatCurrency;

import entities.Credit;
import entities.Debit;
import entities.Transaction;

public class TpTransaction {

	public static void main(String[] args) {

		// On initialise une tableau de plusieurs transactions
		Transaction[] transactions = {
			new Credit("11/06/2021", 3_000f),
			new Debit("02/08/2021", 1_899.99f),
			new Credit("22/12/2021", 200f),
			new Debit("09/02/2022", 989.99f)
		};
		
		// Affichage du contenu du tableau
		displayInArray(transactions);
		
		// Somme initiale
		float total = 0f;
		
		// Pour chaque transaction du tableau, on l'applique à la somme totale
		for (Transaction transaction : transactions) {
			total = transaction.applyTo(total);
		}
		
		// Somme totale à la fin des transactions
		display(formatCurrency(total));
		
	}

}
