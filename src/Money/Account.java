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
	 * @param f
	 *            the amount to debit
	 */
	public void withdraw(float f) {
		this.balance -= f;
	}

	/**
	 * To credit a account
	 * 
	 * @param f
	 *            amount to credit
	 */
	public void credit(float f) {
		this.balance += f;
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
