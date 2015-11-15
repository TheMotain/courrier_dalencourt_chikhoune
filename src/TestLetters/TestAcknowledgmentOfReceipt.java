/**
 * 
 */
package TestLetters;

import org.junit.Assert;
import org.junit.Test;

import Content.TextContent;
import Letters.AcknowledgmentOfReceipt;
import Letters.Letter;
import Letters.SimpleLetter;

/**
 * Test for the AcknowledgmentOfReceipt class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestAcknowledgmentOfReceipt extends TestSimpleLetter {

	@Override
	protected Letter<TextContent> getLetter() {
		Letter<TextContent> letter = new AcknowledgmentOfReceipt(this.sender, this.receiver,
				new SimpleLetter(this.receiver, this.sender, new TextContent("Marvel")));
		this.content = letter.getContent();
		return letter;
	}

	@Override
	public void test_getCost() {
		Assert.assertEquals(1, this.letter.getCost(),0);
	}

	@Override
	public void test_getType() {
		Assert.assertEquals("an acknowledgment of receipt which is a simple letter",this.letter.getType());
	}

	@Test
	public void test_getMessage() {
		Assert.assertEquals(AcknowledgmentOfReceipt.message+"a simple letter whose content is a text content (Marvel)", this.letter.getContent().getMessage());
	}
}
