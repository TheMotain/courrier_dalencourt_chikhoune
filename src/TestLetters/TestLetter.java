/**
 * 
 */
package TestLetters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import City.City;
import City.Inhabitant;
import Content.Content;
import Letters.Letter;
import TestContent.TestContent;

/**
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public abstract class TestLetter<C extends Content> implements TestContent{
	protected class InhabitantForTest extends Inhabitant{
		public int sendLetter = 0;
		public int receiveLetter = 0;
		
		public InhabitantForTest(City city, String name) {
			super(city, name);
		}

		@Override
		public void sendLetter(Letter<?> letter) {
			super.sendLetter(letter);
			this.sendLetter++;
		}

		@Override
		public void receiveLetter(Letter<?> letter) {
			super.receiveLetter(letter);
			this.receiveLetter++;
		}
		
	}
	
	protected Letter<C> letter;
	protected InhabitantForTest sender;
	protected InhabitantForTest receiver;
	
	@Before
	public void createTestLetter(){
		City city = new City("New York");
		this.sender = new InhabitantForTest(city,"Hulk");
		this.sender.credit(50);
		this.receiver = new InhabitantForTest(city,"Thor");
		this.receiver.credit(50);
		this.letter = getLetter();
	}
	
	protected abstract Letter<C> getLetter();
	
	@Test
	public abstract void test_getCost();
	
	@Test
	public abstract void test_getContent();
	
	@Test
	public abstract void test_getType();
	
	@Test
	public void test_receiveLetter(){
		
	}
	
	@Test
	public void test_getReceiver(){
		Assert.assertEquals(this.receiver, this.letter.getReceiver());
	}
	
	@Test
	public void test_getSender(){
		Assert.assertEquals(this.sender, this.letter.getSender());
	}
	
	@Test
	public abstract void test_doAction();

	@Test
	public void test_getDescription() {
		Assert.assertEquals("This is a letter content", this.letter.getDescription());
	}
}
