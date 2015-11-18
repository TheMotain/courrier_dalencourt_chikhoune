/**
 * 
 */
package TestContent;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Content.TextContent;

/**
 * Tests for TextContent class
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class TestTextContent implements TestContent {
	private TextContent textContent;
	private String message = "Hello World !";

	@Before
	public void createTextContent() {
		this.textContent = new TextContent(this.message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see TestContent.TestContent#test_getDescription()
	 */
	@Override
	@Test
	public void test_getDescription() {
		Assert.assertEquals(this.message, this.textContent.getDescription());
	}

	@Test
	public void test_getMessage() {
		Assert.assertEquals(this.message, this.textContent.getMessage());
	}
}
