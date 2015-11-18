package TestLetters;

import org.junit.Assert;
import org.junit.Test;

import Letters.Letter;

/**
 * Test for the OptionLetter class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public abstract class TestOptionLetter extends TestLetter<Letter<?>> {
	protected Letter<?> content;
	
	@Test
	public void test_getStringContent() {
		
		System.out.println(this.letter.getStringContent());
		final String stringContent = this.content.getType()
				+ " whose content is "
				+ this.content.getStringContent();
		System.out.println(stringContent);
		Assert.assertEquals(stringContent, this.letter.getStringContent());
	}
}
