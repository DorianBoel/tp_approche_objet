package entities;

import static utils.GeneralUtils.formatNumber;

/**
 * Represents a bank account with an interest rate.
 *
 * @author DorianBoel
 */
public class RateAccount extends Account {

	/**
	 * The account's rate of remuneration.
	 */
	private float payRate;
	
	/**
	 * Constructor for {@link RateAccount}.
	 * 
	 * Creates a new account with the given identifier, balance and pay rate.
	 * 
	 * @param number The account's identifier
	 * @param balance The account's starting balance
	 * @param payRate The account's rate of remuneration
	 */
	public RateAccount(String number, float balance, float payRate) {
		super(number, balance);
		this.payRate = payRate;
	}
	
	@Override
	public String toString() {
		return String.format("%s; Taux : %s%%", super.toString(), formatNumber(payRate));
	}

	/**
	 * Getter for {@link payRate}.
	 * 
	 * @return This account's pay rate
	 */
	public float getPayRate() {
		return payRate;
	}

	/**
	 * Setter for {@link payRate}.
	 * 
	 * @param payRate The new pay rate to replace the current one
	 */
	public void setPayRate(float payRate) {
		this.payRate = payRate;
	}
	
}
