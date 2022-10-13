package entities.bank;

import static utils.GeneralUtils.formatCurrency;
import static utils.GeneralUtils.formatDate;

import java.time.LocalDate;

import enums.TransactionType;

/**
 * Abstract class representing a transaction
 * regarding a bank account.
 * 
 * @author DorianBoel
 */
public abstract class Transaction {

	/**
	 * The date at which the transaction was carried out.
	 */
	protected LocalDate date;
	
	/**
	 * The amount of currency transferred during the transaction.
	 */
	protected float amount;
	
	/**
	 * The type of the transaction.
	 */
	protected TransactionType type;

	/**
	 * Constructor for {@link Transaction}.
	 * 
	 * @param date The date of the transaction
	 * @param amount The amount transferred
	 */
	public Transaction(LocalDate date, float amount) {
		this.date = date;
		this.amount = amount;
	}
	
	/**
	 * Applies this transaction to a given total sum.
	 * 
	 * @param total The initial sum of money
	 * @return The new total after this transaction has been completed
	 */
	public abstract float applyTo(float total);
	
	/**
	 * Returns a string representation of the transaction.
	 *
	 * @return A string representation of the transaction
	 */
	@Override
	public String toString() {
		return String.format("%s %s; Montant: %s", formatDate(date), type.getLabel(), formatCurrency(amount));
	}

	/**
	 * Getter for {@link date}.
	 * 
	 * @return The date at which this transaction was carried out
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Getter for {@link amount}.
	 * 
	 * @return The amount transferred during this transaction
	 */
	public float getAmount() {
		return amount;
	}
	
	/**
	 * Getter for {@link #type}.
	 * 
	 * @return This transaction's type
	 */
	public TransactionType getType() {
		return type;
	}

	/**
	 * Setter for {@link #date}.
	 * 
	 * @param date The new date to replace the current one
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Setter for {@link #amount}.
	 * 
	 * @param amount The new amount to replace the current one
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
