/**
 * 
 */
package TestLetters;

import org.junit.Assert;
import org.junit.Test;

import Content.TextContent;
import Letters.Letter;
import Letters.ThankLetter;

/**
 * Class for test ThankLetter class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class TestThankLetter extends TestSimpleLetter {

	@Override
	protected Letter<TextContent> getLetter() {
		Letter<TextContent> letter = new ThankLetter(this.sender,
				this.receiver, (float) 50.5);
		this.content = letter.getContent();
		return letter;
	}

	@Test
	public void test_getMessage() {
		System.out.println(this.letter.getContent().getMessage());
		Assert.assertEquals(ThankLetter.message + " (" + 50.5 + ")",
				this.letter.getContent().getMessage());
	}

	@Override
	public void test_getType() {
		Assert.assertEquals("a thank letter which is a simple letter",
				this.letter.getType());
	}

	@Override
	public void test_getCost() {
		Assert.assertEquals(1, this.letter.getCost(), 0);
	}
}
