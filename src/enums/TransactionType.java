package enums;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

import entities.bank.Credit;
import entities.bank.Debit;
import entities.bank.Transaction;

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
	CREDIT("crédit", Credit.class),
	
	/**
	 * The type of a {@link entities.bank.Debit Debit} transaction.
	 */
	DEBIT("débit", Debit.class);
	
	/**
	 * The label identifying a transaction type.
	 */
	private String label;
	
	private Class<? extends Transaction> c;
	
	/**
	 * Enum constructor for {@link TransactionType}.
	 * 
	 * @param label The transaction type's label
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	private TransactionType(String label, Class<? extends Transaction> cl) {
		this.label = label;
		this.c = cl;
	}

	/**
	 * Getter for {@link #label}.
	 * 
	 * @return This transaction type's label.
	 */
	public String getLabel() {
		return label;
	}
	
	public Constructor<? extends Transaction> getConstructor() throws NoSuchMethodException, SecurityException {
		return c.getConstructor(LocalDate.class, float.class);
	}
	
}
