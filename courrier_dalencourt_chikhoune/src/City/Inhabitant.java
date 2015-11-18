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
	 * Standard Constructor with credit account
	 * 
	 * @param city
	 *            the city of the inhabitant
	 * @param name
	 *            the name of the inhabitant
	 * @param balance
	 *            the account balance of the inhabitant
	 */
	public Inhabitant(City city, String name, float balance) {
		this.name = name;
		this.city = city;
		this.account = new Account();
		this.account.credit(balance);
	}

	/**
	 * Send a letter
	 * 
	 * @param letter
	 *            the letter to send
	 */
	public void sendLetter(Letter<?> letter) {
		this.city.sendLetter(letter);
		this.account.withdraw(letter.getCost());
		System.out.println(
				"-> " + this.getName() + " mails " + letter.getType() + " whose content is " + letter.getStringContent()
						+ " to " + letter.getReceiver().getName() + " for a cost of " + letter.getCost() + " euros");
		System.out.println("   - " + letter.getCost() + " are debited from " + this.getName()
				+ " account whose balance is now " + this.getBalence() + " euros");
	}

	/**
	 * Receive a letter
	 * 
	 * @param letter
	 *            the letter to receive
	 */
	public void receiveLetter(Letter<?> letter) {
		letter.receiveLetter();
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
	public float getBalence() {
		return this.account.getBalance();
	}

	/**
	 * Withdraw the amount value to the account
	 * 
	 * @param f
	 *            the amount to withdraw
	 */
	public void withdraw(float f) {
		this.account.withdraw(f);
	}

	/**
	 * Credit the amount value to the account
	 * 
	 * @param f
	 *            the amount to credit
	 */
	public void credit(float f) {
		this.account.credit(f);
	}
}
