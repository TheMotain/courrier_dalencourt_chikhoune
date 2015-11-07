/**
 * 
 */
package Money;

/**
 * Manage a bank account
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class Account {
	/**
	 * Contains the balance of the Account
	 */
	private int balance;

	/**
	 * Standard constructor
	 */
	public Account() {
		balance = 0;
	}

	/**
	 * To debit a account
	 * 
	 * @param amount
	 *            the amount to debit
	 */
	public void withdraw(int amount) {
		this.balance -= amount;
	}

	/**
	 * To credit a account
	 * 
	 * @param amount
	 *            amount to credit
	 */
	public void credit(int amount) {
		this.balance += amount;
	}

	/**
	 * Get the balance of an account
	 * 
	 * @return return the balance
	 */
	public int getBalance() {
		return this.balance;
	}
}
