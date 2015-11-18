/**
 * 
 */
package Letters;

/**
 * Describe the behavior of a registered letter
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class RegisteredLetter extends OptionLetter {

	/**
	 * Standard constructor
	 * 
	 * @param content
	 *            the initial letter
	 */
	public RegisteredLetter(Letter<?> content) {
		super(content);
	}

	/**
	 * Return the cost of a registered letter. The cost is the cost of the
	 * letter + 15
	 * 
	 * @see Letters.Letter#getCost()
	 */
	@Override
	public float getCost() {
		return this.content.getCost() + 15;
	}

	/**
	 * do the action to the content and send a acknowledgment of receipt from
	 * the receiver to the sender
	 * 
	 * @see Letters.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.content.doAction();
		this.receiver.sendLetter(new AcknowledgmentOfReceipt(this.receiver,
				this.sender, content));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getType()
	 */
	@Override
	public String getType() {
		return "a registered letter";
	}

}
