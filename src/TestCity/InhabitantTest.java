/**
 * 
 */
package TestCity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import City.City;
import City.Inhabitant;

/**
 * Tests for Inhabitant
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class InhabitantTest {
	private Inhabitant inhabitant;
	private City city;
	
	@Before
	public void createInhabitant(){
		this.city = new City("New York");
		this.inhabitant = new Inhabitant(this.city, "Iron Man");
	}
	
	@Test
	public void test_sendLetter(){
		Assert.assertTrue(false);
	}
	
	@Test
	public void test_receiveLetter(){
		Assert.assertTrue(false);
	}
	
	@Test
	public void test_createInhabitant(){
		Assert.assertEquals(this.city, this.inhabitant.getCity());
		Assert.assertEquals("Iron Man", this.inhabitant.getName());
		Assert.assertNotNull(this.inhabitant.getBalence());
	}
	
	@Test
	public void test_withdraw(){
		int amount = 50;
		this.inhabitant.credit(amount);
		Assert.assertEquals(amount, this.inhabitant.getBalence());
		amount /= 2;
		this.inhabitant.withdraw(amount);
		Assert.assertEquals(amount, this.inhabitant.getBalence());
	}
	
	@Test
	public void test_credit(){
		int amount = 50;
		Assert.assertEquals(0, this.inhabitant.getBalence());
		this.inhabitant.credit(amount);
		Assert.assertEquals(amount, this.inhabitant.getBalence());
	}
}
