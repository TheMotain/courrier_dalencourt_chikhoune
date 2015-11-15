/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.TextContent;

/**
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class ThankLetter extends SimpleLetter {
	/**
	 * the message to send with a thank letter
	 */
	public final static String message = "Thank for a promissory note letter whose content is a money content";
	
	/**
	 * Standard constructor
	 * the amount receive in the promissory note
	 * @param sender
	 * the sender of the thank letter
	 * @param receiver
	 * the receiver of the thank letter
	 * @param amount
	 * the amount to thank
	 */
	public ThankLetter(Inhabitant sender, Inhabitant receiver,float amount) {
		super(sender, receiver, new TextContent(ThankLetter.message+" ("+amount+")"));
	}

	/* (non-Javadoc)
	 * @see Letters.SimpleLetter#getType()
	 */
	@Override
	public String getType() {
		return "a thank letter which is a simple letter";
	}
}
