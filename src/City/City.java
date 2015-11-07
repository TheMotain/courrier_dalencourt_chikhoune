/**
 * 
 */
package City;

import java.util.ArrayList;

import Letters.Letter;

/**
 * Describe a city with a post box
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class City {
	/**
	 * The post box which contains all letters to send
	 */
	private ArrayList<Letter<?>> postbox;
	/**
	 * Name of the city
	 */
	public String name;

	/**
	 * Standard Constructor
	 * 
	 * @param city
	 *            name of the city
	 */
	public City(String city) {
		this.postbox = new ArrayList<Letter<?>>();
		this.name = city;
	}

	/**
	 * Put a letter in the post box
	 * 
	 * @param letter
	 *            the letter to send
	 */
	public void sendLetter(Letter<?> letter) {

	}

	/**
	 * Distribute all letters
	 */
	public void distributeLetters() {

	}

	/**
	 * Get the post box and the letters inside
	 * 
	 * @return return a array of letter
	 */
	public ArrayList<Letter<?>> getPostbox() {
		return this.postbox;
	}
}
