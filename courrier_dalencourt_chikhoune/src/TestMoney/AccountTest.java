/**
 * 
 */
package TestMoney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Money.Account;

/**
 * Tests of Account class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class AccountTest {
	private Account account;

	@Before
	public void createAccount() {
		this.account = new Account();
	}

	@Test
	public void test_1_credit() {
		int amount = 50;
		Assert.assertEquals(0, this.account.getBalance(),0);
		this.account.credit(amount);
		Assert.assertEquals(amount, this.account.getBalance(),0);
	}

	@Test
	public void test_2_withdraw() {
		int amount = 50;
		this.account.credit(amount);
		Assert.assertEquals(amount, this.account.getBalance(),0);
		amount /= 2;
		this.account.withdraw(amount);
		Assert.assertEquals(amount, this.account.getBalance(),0);
	}
}
