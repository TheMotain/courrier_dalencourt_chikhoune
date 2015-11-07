/**
 * 
 */
package Content;

/**
 * Describe a money content
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class MoneyContent implements Content {
	/**
	 * amount of the content
	 */
	private float amount;

	/**
	 * Standard Constructor
	 * 
	 * @param amount
	 *            the amount to put inside the content
	 */
	public MoneyContent(float amount) {
		this.amount = amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Content.Content#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Amount: " + this.amount;
	}

	/**
	 * get the amount contains
	 * 
	 * @return return a float value
	 */
	public float getAmount() {
		return this.amount;
	}
}
