/**
 * 
 */
package TestLetters;

import org.junit.Assert;

import Content.MoneyContent;
import Letters.Letter;
import Letters.PromissoryNote;

/**
 * Tests of the PromissoryNote class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class TestPromissoryNote extends TestLetter<MoneyContent> {
	private MoneyContent moneyContent;

	@Override
	protected Letter<MoneyContent> getLetter() {
		this.moneyContent = new MoneyContent(50);
		return new PromissoryNote(this.sender, this.receiver, this.moneyContent);
	}

	@Override
	public void test_getCost() {
		Assert.assertEquals(1 + this.moneyContent.getAmount() * 0.01,
				this.letter.getCost(), 0);
	}

	@Override
	public void test_getContent() {
		Assert.assertEquals(this.moneyContent, this.letter.getContent());
	}

	@Override
	public void test_doAction() {
		float senderBalance = this.sender.getBalence();
		float receiverBalance = this.receiver.getBalence();
		this.letter.doAction();
		Assert.assertEquals(senderBalance - this.moneyContent.getAmount(),
				this.sender.getBalence(), 0);
		Assert.assertEquals(
				receiverBalance + this.moneyContent.getAmount() - 1,
				this.receiver.getBalence(), 0);
		Assert.assertEquals(1, this.receiver.sendLetter);
	}

	@Override
	public void test_getType() {
		Assert.assertEquals("a promissory note letter", this.letter.getType());
	}
}
