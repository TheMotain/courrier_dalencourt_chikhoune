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
public abstract class Letter<C extends Content> implements Content{

	public interface DecoratedLetter{
		public String getDecoratedLetterType();
	}
	
	/**
	 * Cost of the letter
	 */
	protected float cost;
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
	public abstract float getCost();

	/**
	 * Open the letter
	 */
	public void receiveLetter(){
		System.out.println("<- " + this.getReceiver().getName() + " receive " + this.getType() + " whose content is " + this.getStringContent() + " from " + this.getSender().getName());
		this.doAction();
	}
	
	/**
	 * Do the action with the content of the letter
	 */
	public abstract void doAction();

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
	
	/**
	 * Get the type of the letter
	 * @return
	 * return a string
	 */
	public abstract String getType();

	/**
	 * Get a string witch contains the content of the letter
	 * @return
	 * Return a String
	 */
	public abstract String getStringContent();
	
	/* (non-Javadoc)
	 * @see Content.Content#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a letter content";
	}
}
