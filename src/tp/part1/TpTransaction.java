package tp.part1;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInArray;
import static utils.GeneralUtils.formatCurrency;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

import entities.bank.Credit;
import entities.bank.Debit;
import entities.bank.Transaction;
import enums.TransactionType;

public class TpTransaction {

	public static void main(String[] args) {

		// On initialise une tableau de plusieurs transactions
		Transaction[] transactions = {
			new Credit(LocalDate.of(2021, 6, 11), 3_000f),
			new Debit(LocalDate.of(2021, 8, 2), 1_899.99f),
			new Credit(LocalDate.of(2021, 12, 22), 200f),
			new Debit(LocalDate.of(2022, 2, 9), 989.99f)
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
		
		try {
			Transaction tr = TransactionType.CREDIT.getConstructor().newInstance(LocalDate.of(2021, 6, 11), 3_000f);
			display(tr);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException err) {
			err.printStackTrace();
		}
		
		
	}

}
