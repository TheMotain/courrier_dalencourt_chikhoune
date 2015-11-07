/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.Content;

/**
 * Manage a generic letter
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public abstract class Letter<C extends Content> {
	/**
	 * Cost of the letter
	 */
	protected int cost;
	/**
	 * Content of the letter
	 */
	protected C content;
	/**
	 * Sender of the letter
	 */
	protected Inhabitant sender;
	/**
	 * Receiver of the letter;
	 */
	protected Inhabitant receiver;

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
	public Letter(Inhabitant sender, Inhabitant receiver, C content) {
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.cost = this.getCost();
	}

	/**
	 * Get the cost of the letter
	 * 
	 * @return return the cost
	 */
	public abstract int getCost();

	/**
	 * Do the action to receive a letter
	 */
	public abstract void receiveLetter();

	/**
	 * Get the content of the letter
	 * 
	 * @return return the content
	 */
	public C getContent() {
		return this.content;
	}

	/**
	 * Get the sender of the letter
	 * 
	 * @return return the sender
	 */
	public Inhabitant getSender() {
		return this.sender;
	}

	/**
	 * Get the receiver of the letter
	 * 
	 * @return return the receiver
	 */
	public Inhabitant getReceiver() {
		return this.receiver;
	}
}
