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
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestThankLetter extends TestSimpleLetter {
	@Override
	protected Letter<TextContent> getLetter() {
		Letter<TextContent> letter = new ThankLetter(this.sender, this.receiver, (float) 50.5);
		this.content = letter.getContent();
		return letter;
	}
	
	@Test
	public void test_getMessage(){
		System.out.println(this.letter.getContent().getMessage());
		Assert.assertEquals(ThankLetter.message+" ("+50.5+")", this.letter.getContent().getMessage());
	}
}
