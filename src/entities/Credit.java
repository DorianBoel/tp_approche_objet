package entities;

import enums.TransactionType;

/**
 * Represents a transaction which involves a sum of money
 * being added to an account. 
 * 
 * @author DorianBoel
 */
public class Credit extends Transaction {

	/**
	 * Constructor for {@link Credit}
	 * 
	 * @param date The date of the credit
	 * @param amount The amount of currency added
	 */
	public Credit(String date, float amount) {
		super(date, amount);
		type = TransactionType.CREDIT;
	}

	/**
	 * Adds this transaction's amount to a given total sum.
	 * 
	 * @param total The initial sum of money
	 * @return The new total after this transaction has been completed
	 */
	@Override
	public float applyTo(float total) {
		return total + amount;
	}

}
