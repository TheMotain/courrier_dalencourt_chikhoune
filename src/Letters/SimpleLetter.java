/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.TextContent;

/**
 * Describe a simple letter. A simple letter can be decorate.
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
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,
			TextContent content) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getType()
	 */
	@Override
	public String getType() {
		return "a simple letter";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getStringContent()
	 */
	@Override
	public String getStringContent() {
		return "a text content (" + this.content.getMessage() + ")";
	}

	/**
	 * do nothing for a simple letter
	 * 
	 * @see Letters.Letter#doAction()
	 */
	@Override
	public void doAction() {
	}

}
