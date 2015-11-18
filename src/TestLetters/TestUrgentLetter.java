/**
 * 
 */
package TestLetters;

import org.junit.Assert;

import Content.TextContent;
import Letters.Letter;
import Letters.SimpleLetter;
import Letters.UrgentLetter;

/**
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestUrgentLetter extends TestOptionLetter {
	private Letter<?> content;
	
	/* (non-Javadoc)
	 * @see TestLetters.TestLetter#getLetter()
	 */
	@Override
	protected Letter<Letter<?>> getLetter() {
		this.content = new SimpleLetter(this.sender, this.receiver, new TextContent("Marvel"));
		return new UrgentLetter(this.content);
	}

	/* (non-Javadoc)
	 * @see TestLetters.TestLetter#test_getCost()
	 */
	@Override
	public void test_getCost() {
		Assert.assertEquals(this.content.getCost() * 2, this.letter.getCost(),0);
	}

	/* (non-Javadoc)
	 * @see TestLetters.TestLetter#test_getContent()
	 */
	@Override
	public void test_getContent() {
		Assert.assertEquals(this.content, this.letter.getContent());
	}

	/* (non-Javadoc)
	 * @see TestLetters.TestLetter#test_getType()
	 */
	@Override
	public void test_getType() {
		Assert.assertEquals("a urgent letter", this.letter.getType());
	}

	/* no test is need for doAction for a urgent letter
	 * @see TestLetters.TestLetter#test_doAction()
	 */
	@Override
	public void test_doAction() {
		this.letter.doAction();
		Assert.assertTrue(true);
		Assert.assertEquals(1, this.receiver.receiveLetter);
	}

}
