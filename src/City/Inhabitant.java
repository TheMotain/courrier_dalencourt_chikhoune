/**
 * 
 */
package City;

import Letters.Letter;
import Money.Account;

/**
 * Manage a Inhabitant
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class Inhabitant {
	/**
	 * The name of the Inhabitant
	 */
	private String name;
	/**
	 * The city of the Inhabitant
	 */
	private City city;
	/**
	 * The account of the Inhabitant
	 */
	private Account account;

	/**
	 * Standard Constructor
	 * 
	 * @param city
	 *            the city of the inhabitant
	 * @param name
	 *            the name of the inhabitant
	 */
	public Inhabitant(City city, String name) {
		this.name = name;
		this.city = city;
		this.account = new Account();
	}

	/**
	 * Send a letter
	 * 
	 * @param letter
	 *            the letter to send
	 */
	public void sendLetter(Letter<?> letter) {
		this.city.sendLetter(letter);
	}

	/**
	 * Receive a letter
	 * 
	 * @param letter
	 *            the letter to receive
	 */
	public void receiveLetter(Letter<?> letter) {

	}

	/**
	 * Get the city of the inhabitant
	 * 
	 * @return the city
	 */
	public City getCity() {
		return this.city;
	}

	/**
	 * Get the name of the inhabitant
	 * 
	 * @return return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Get the balance account of the inhabitant
	 * 
	 * @return the balance
	 */
	public int getBalence() {
		return this.account.getBalance();
	}

	/**
	 * Withdraw the amount value to the account
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	public void withdraw(int amount) {
		this.account.withdraw(amount);
	}

	/**
	 * Credit the amount value to the account
	 * 
	 * @param amount
	 *            the amount to credit
	 */
	public void credit(int amount) {
		this.account.credit(amount);
	}
}
