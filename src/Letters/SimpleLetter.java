/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.TextContent;

/**
 * Describe a simple letter
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class SimpleLetter extends Letter<TextContent> {

	/**
	 * Standard Constructor
	 * 
	 * @param sender
	 *            the sender
	 * @param receiver
	 *            the receiver
	 * @param content
	 *            the content
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent content) {
		super(sender, receiver, content);
	}

	/**
	 * The cost of a simple letter is only one
	 * 
	 * @see Letters.Letter#getCost()
	 */
	@Override
	public float getCost() {
		return 1;
	}

	/**
	 * Receive a letter and read it
	 * 
	 * @see Letters.Letter#receiveLetter()
	 */
	@Override
	public void receiveLetter() {
		// TODO Auto-generated method stub

	}

}
