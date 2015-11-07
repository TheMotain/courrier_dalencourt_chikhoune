/**
 * 
 */
package TestLetters;

import org.junit.Before;

import City.City;
import City.Inhabitant;
import Content.Content;
import Letters.Letter;

/**
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public abstract class TestLetter<C extends Content> {
	protected Letter<C> letter;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	@Before
	public void createTestLetter(){
		City city = new City("New York");
		this.sender = new Inhabitant(city,"Hulk");
		this.sender.credit(50)
		this.receiver = new Inhabitant(city,"Thor");
		this.receiver.credit(50);
		this.letter = getLetter();
	}
	
	protected abstract Letter<C> getLetter();
}
