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
	private Letter<?> content;
	
	@Override
	protected Letter<Letter<?>> getLetter() {
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
		Assert.assertEquals(0, this.receiver.sendLetter);
		this.letter.doAction();
		Assert.assertEquals(1, this.receiver.sendLetter);
	}
}
