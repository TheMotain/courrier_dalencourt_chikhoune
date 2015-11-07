/**
 * 
 */
package TestLetters;

import org.junit.Assert;

import Content.TextContent;
import Letters.Letter;
import Letters.SimpleLetter;

/**
 * Tests of SimpleLetter class
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestSimpleLetter extends TestLetter<TextContent>{
	protected TextContent content;
	
	@Override
	protected Letter<TextContent> getLetter() {
		this.content = new TextContent("Hello World !");
		return new SimpleLetter(this.sender, this.receiver, this.content);
	}

	@Override
	public void test_getCost() {
		Assert.assertEquals(1, this.letter.getCost(),0);
	}

	@Override
	public void test_getContent() {
		Assert.assertEquals(this.content, this.letter.getContent());
	}

	@Override
	public void test_receiveLetter() {
		Assert.assertTrue(false);
	}
}
