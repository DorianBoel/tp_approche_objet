package enums;

/**
 * Enumeration listing the existing types of 
 * transactions for a bank account.
 * 
 * @author DorianBoel
 */
public enum TransactionType {

	/**
	 * The type of a {@link entities.bank.Credit Credit} transaction.
	 */
	CREDIT("crédit"),
	
	/**
	 * The type of a {@link entities.bank.Debit Debit} transaction.
	 */
	DEBIT("débit");
	
	/**
	 * The label identifying a transaction type.
	 */
	private String label;
	
	/**
	 * Enum constructor for {@link TransactionType}.
	 * 
	 * @param label The transaction type's label
	 */
	TransactionType(String label) {
		this.label = label;
	}

	/**
	 * Getter for {@link #label}.
	 * 
	 * @return This transaction type's label.
	 */
	public String getLabel() {
		return label;
	}
	
}
