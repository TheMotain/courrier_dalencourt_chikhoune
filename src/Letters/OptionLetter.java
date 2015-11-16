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
public abstract class OptionLetter extends Letter<Letter<D super DecoratedLetter>> {

	public OptionLetter(Letter<?> content) {
		super(content.getSender(), content.getReceiver(), content);
	}
}
