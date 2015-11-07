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
	public static String message = "Thank for a promissory note letter whose content is a money content";
	
	public ThankLetter(Inhabitant sender, Inhabitant receiver,float amount) {
		super(sender, receiver, new TextContent(ThankLetter.message+" ("+amount+")"));
	}

}
