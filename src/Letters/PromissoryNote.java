/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.MoneyContent;

/**
 * Describe a promissory note
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class PromissoryNote extends Letter<MoneyContent> {

	/**
	 * Standard Constructor
	 * @param sender
	 * the sender
	 * @param receiver
	 * the receiver
	 * @param content
	 * the content
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, MoneyContent content) {
		super(sender, receiver, content);
	}

	/**
	 * return the cost of the letter. The cost is 1 + 1% of the content
	 * @see Letters.Letter#getCost()
	 */
	@Override
	public float getCost() {
		return (float) (1 + this.content.getAmount() * 0.01);
	}

	/**
	 * Credit the receiver and send a thank letter
	 * 
	 * @see Letters.Letter#receiveLetter()
	 */
	@Override
	public void receiveLetter() {
		// TODO Auto-generated method stub
		
	}

}
