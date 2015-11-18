/**
 * 
 */
package Letters;

/**
 * Abstract class for decorate a letter
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public abstract class OptionLetter extends Letter<Letter<?>> {

	/**
	 * Standard constructor
	 * 
	 * @param content
	 *            the letter decorated by the option
	 */
	public OptionLetter(Letter<?> content) {
		super(content.getSender(), content.getReceiver(), content);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getStringContent()
	 */
	@Override
	public String getStringContent() {
		return this.content.getType() + " whose content is "
				+ this.content.getStringContent();
	}
}
