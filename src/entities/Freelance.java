package entities;

/**
 * Represents a freelance contributor with no fixed salary.
 * 
 * @author DorianBoel
 */
public class Freelance extends Contributor {
	
	/**
	 * The number of consecutive days during which this contributor is working.
	 */
	private int workDays;
	
	/**
	 * The income this contributor receives after a complete day of work.
	 */
	private float dailyIncome;

	/**
	 * Constructor for {@link Contributor}.
	 * 
	 * Creates a new freelance contributor with the given name and work conditions.
	 * 
	 * @param lastName The contributor's last name
	 * @param firstName The contributor's first name
	 * @param workDays The number of work days for this contributor
	 * @param dailyIncome The contributor's daily income
	 */
	public Freelance(String lastName, String firstName, int workDays, float dailyIncome) {
		super(lastName, firstName);
		this.workDays = workDays;
		this.dailyIncome = dailyIncome;
	}

	/**
	 * Calculates this contributor's salary after a period of <i>n</i> 
	 * days of work, by earning the daily income value each day.
	 * 
	 * @return This contributor's total salary after a work period
	 */
	@Override
	public float getSalary() {
		return (float) workDays * dailyIncome;
	}

	/**
	 * Getter for {@link #workDays}.
	 * 
	 * @return The number of days during which this contributor works
	 */
	public int getWorkDays() {
		return workDays;
	}

	/**
	 * Getter for {@link #dailyIncome}.
	 * 
	 * @return This contributor's daily income
	 */
	public float getDailyIncome() {
		return dailyIncome;
	}

	/**
	 * Setter for {@link #workDays}.
	 * 
	 * @param workDays The new number of work days to replace the current one
	 */
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	/**
	 * Setter for {@link #dailyIncome}.
	 * 
	 * @param dailyIncome The new daily income to replace the current one
	 */
	public void setDailyIncome(float dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

}
