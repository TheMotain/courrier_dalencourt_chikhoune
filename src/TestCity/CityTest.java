/**
 * 
 */
package TestCity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import City.City;
import City.Inhabitant;
import Content.MoneyContent;
import Letters.Letter;
import Letters.PromissoryNote;
import Letters.SimpleLetter;

/**
 * Tests for the class City
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class CityTest {
	private City city;

	@Before
	public void createCity() {
		this.city = new City("New York");
	}

	@Test
	public void test_sendLetter() {
		SimpleLetter letter = new SimpleLetter(null, null, null);
		Assert.assertEquals(0, this.city.getPostbox().size());
		this.city.sendLetter(letter);
		Assert.assertEquals(1, this.city.getPostbox().size());
		Assert.assertEquals(letter, this.city.getPostbox().get(0));
		this.city.sendLetter(new PromissoryNote(null, null,
				new MoneyContent(20)));
		Assert.assertEquals(2, this.city.getPostbox().size());
	}

	@Test
	public void test_distributeLetters() {
		Inhabitant inhabitant1 = new Inhabitant(this.city, "Dardevil", 50);
		Inhabitant inhabitant2 = new Inhabitant(this.city, "Deadpool", 50);
		Inhabitant inhabitant3 = new Inhabitant(this.city, "Star Lord", 50);
		Letter<?> letter1 = new PromissoryNote(inhabitant1, inhabitant2,
				new MoneyContent(20));
		Letter<?> letter2 = new PromissoryNote(inhabitant2, inhabitant3,
				new MoneyContent(10));
		this.city.sendLetter(letter1);
		this.city.sendLetter(letter2);
		Assert.assertFalse(this.city.getPostbox().isEmpty());
		this.city.distributeLetters();
		Assert.assertEquals(2, this.city.getPostbox().size());
		Assert.assertEquals(50 - 20, inhabitant1.getBalence(), 0);
		Assert.assertEquals(50 + 20 - 10 - 1, inhabitant2.getBalence(), 0);
		Assert.assertEquals(50 + 10 - 1, inhabitant3.getBalence(), 0);
	}
}
