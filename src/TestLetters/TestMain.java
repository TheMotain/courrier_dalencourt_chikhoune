/**
 * 
 */
package TestLetters;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import Letters.Letter;
import Letters.Main;
import Letters.OptionLetter;

/**
 * Test for the Main class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestMain {

	@Test
	public void test_sendLetter_no_option(){
		Letter<?> letter = null;
		Random random = new Random();
		for(int i = 0 ; i < 100; i++){
			letter = Main.sendLetter(null, null, random, 2);
			Assert.assertNotEquals(OptionLetter.class, letter.getClass());
			Assert.assertNotEquals(Letter.class, letter.getClass());
		}
	}
	
	@Test
	public void test_sendLette_option_no_suboption(){
		Letter<?> letter = null;
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			letter = Main.sendLetter(null, null, random, 3);
			Assert.assertNotEquals(OptionLetter.class, letter.getContent().getClass());
		}
	}
	
	@Test
	public void test_sendOptionLetter_no_suboption(){
		Letter<?> letter = null;
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			letter = Main.sendOptionLetter(null, null, random);
			Assert.assertNotEquals(OptionLetter.class, letter.getContent().getClass());
		}
	}
}
