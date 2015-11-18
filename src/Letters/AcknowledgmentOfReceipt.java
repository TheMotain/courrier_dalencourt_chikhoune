/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.TextContent;

/**
 * Describe a acknowledgment of receipt
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class AcknowledgmentOfReceipt extends SimpleLetter {
	/**
	 * Standard part of the content of an acknowledgment of receipt
	 */
	public final static String message = "acknowledgment of receipt for a registered letter whose content is ";

	/**
	 * Standard constructor
	 * 
	 * @param sender
	 *            the sender
	 * @param receiver
	 *            the receiver
	 * @param content
	 *            the content of the registered letter
	 */
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver,
			Letter<?> content) {
		super(sender, receiver, new TextContent(AcknowledgmentOfReceipt.message
				+ content.getType() + " whose content is "
				+ content.getStringContent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.SimpleLetter#getType()
	 */
	@Override
	public String getType() {
		return "an acknowledgment of receipt which is a simple letter";
	}
}
