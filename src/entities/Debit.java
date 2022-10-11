package entities;

import java.time.LocalDate;

import enums.TransactionType;

/**
 * Represents a transaction which involves a sum of money
 * being taken out of an account. 
 * 
 * @author DorianBoel
 */
public class Debit extends Transaction {

	/**
	 * Constructor for {@link Debit}
	 * 
	 * @param date The date of the debit
	 * @param amount The amount of currency withdrawn
	 */
	public Debit(LocalDate date, float amount) {
		super(date, amount);
		type = TransactionType.DEBIT;
	}

	/**
	 * Substracts this transaction's amount from a given total sum.
	 * 
	 * @param total The initial sum of money
	 * @return The new total after this transaction has been completed
	 */
	@Override
	public float applyTo(float total) {
		return total - amount;
	}

}
