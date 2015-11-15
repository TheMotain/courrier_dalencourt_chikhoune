/**
 * 
 */
package TestLetters;

import org.junit.Assert;

import City.Inhabitant;
import Content.TextContent;
import Letters.Letter;
import Letters.RegisteredLetter;
import Letters.SimpleLetter;

/**
 * Test for the RegisteredLetter class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestRegisteredLetter extends TestOptionLetter {
	class Receiver extends Inhabitant{
		public int numberOfLetterSent;
		
		public Receiver(Inhabitant inhabitant) {
			super(inhabitant.getCity(), inhabitant.getName());
			this.numberOfLetterSent = 0;
		}

		@Override
		public void sendLetter(Letter<?> letter) {
			this.numberOfLetterSent++;
			super.sendLetter(letter);
		}
	}
	
	private Letter<?> content;
	
	@Override
	protected Letter<Letter<?>> getLetter() {
		this.receiver = new Receiver(this.receiver);
		this.content = new SimpleLetter(this.sender,this.receiver, new TextContent("Marvel"));
		return new RegisteredLetter(this.content);
	}

	@Override
	public void test_getCost() {
		Assert.assertEquals(content.getCost()+15, this.letter.getCost(),0);
	}

	@Override
	public void test_getContent() {
		Assert.assertEquals(this.content,this.letter.getContent());
	}

	@Override
	public void test_getType() {
		Assert.assertEquals("a registered letter", this.letter.getType());
	}

	/* call on the TD receiverSendsAcknowledgment
	 * @see TestLetters.TestLetter#test_doAction()
	 */
	@Override
	public void test_doAction() {
		Assert.assertEquals(0, ((Receiver)this.receiver).numberOfLetterSent);
		this.letter.doAction();
		Assert.assertEquals(1, ((Receiver)this.receiver).numberOfLetterSent);
	}
}
