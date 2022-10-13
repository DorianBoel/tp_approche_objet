package entities.bank;

import static utils.GeneralUtils.formatCurrency;

/**
 * Represents a bank account.
 *
 * @author DorianBoel
 */
public class Account {

	/**
	 * The bank account's unique identifier.
	 */
	protected String number;
	
	/**
	 * The account's current balance;
	 */
	protected float balance;

	/**
	 * Constructor for {@link Account}.
	 * 
	 * Creates a new account with the given identifier and balance.
	 * 
	 * @param number The account's identifier
	 * @param balance The account's starting balance
	 */
	public Account(String number, float balance) {
		this.number = number;
		this.balance = balance;
	}
	
	/**
	 * Returns a string representation of the account.
	 *
	 * @return A string representation of the account
	 */
	@Override
	public String toString() {
		return String.format("Compte n°%s; Solde: %s", number, formatCurrency(balance));
	}

	/**
	 * Getter for {@link #number}.
	 * 
	 * @return This account's number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Getter for {@link #balance}.
	 * 
	 * @return This account's balance
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * Setter for {@link #number}.
	 * 
	 * @param number The new account number to replace the current one
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Setter for {@link #balance}.
	 * 
	 * @param balance The new account balance to replace the current one
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
