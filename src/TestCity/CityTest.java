/**
 * 
 */
package TestCity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import City.City;

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
	public void createCity(){
		this.city = new City("New York");
	}
	
	@Test
	public void test_sendLetter(){
		Assert.assertFalse(true);
	}
	
	@Test
	public void test_distributeLetters(){
		Assert.assertTrue(false);
	}
}
