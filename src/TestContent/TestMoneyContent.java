/**
 * 
 */
package TestContent;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Content.MoneyContent;

/**
 * Tests of MoneyContent class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TestMoneyContent implements TestContent {
	private MoneyContent moneyContent;
	private float amount = 50;
	
	@Before
	public void createMoneyContent(){
		this.moneyContent = new MoneyContent(this.amount);
	}
	
	/* (non-Javadoc)
	 * @see TestContent.TestContent#test_getDescription()
	 */
	@Override
	@Test
	public void test_getDescription() {
		Assert.assertEquals("Amount: "+this.amount, this.moneyContent.getDescription());
	}

	@Test
	public void test_getAmount(){
		Assert.assertEquals(this.amount, this.moneyContent.getAmount(),0);
	}
}
