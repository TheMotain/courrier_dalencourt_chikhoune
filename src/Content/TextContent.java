/**
 * 
 */
package Content;

/**
 * Describe a text content
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class TextContent implements Content {
	/**
	 * The message of the content
	 */
	private String message;

	/**
	 * Standard Constructor
	 * 
	 * @param message
	 *            the message
	 */
	public TextContent(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Content.Content#getDescription()
	 */
	@Override
	public String getDescription() {
		return this.message;
	}

	/**
	 * Get the message
	 * 
	 * @return return a string
	 */
	public String getMessage() {
		return this.message;
	}

}
