/**
 * 
 */
package City;

import java.util.ArrayList;
import java.util.List;

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
	private List<Letter<?>> postbox;
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
		this.postbox.add(letter);
	}

	/**
	 * Distribute all letters
	 */
	public void distributeLetters() {
		List<Letter<?>> bag = new ArrayList<Letter<?>>(this.postbox);
		Letter<?> tmp;
		this.postbox.clear();
		while (!bag.isEmpty()) {
			tmp = bag.remove(0);
			tmp.getReceiver().receiveLetter(tmp);
		}
	}

	/**
	 * Get the post box and the letters inside
	 * 
	 * @return return a array of letter
	 */
	public List<Letter<?>> getPostbox() {
		return this.postbox;
	}
}
