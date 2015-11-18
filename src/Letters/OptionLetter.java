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

	public OptionLetter(Letter<?> content) {
		super(content.getSender(), content.getReceiver(), content);
	}
}
