/**
 * 
 */
package Letters;

/**
 * Describe an urgent letter and his behavior
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class UrgentLetter extends OptionLetter {

	/**
	 * Standard Constructor
	 * 
	 * @param content
	 *            initial letter
	 */
	public UrgentLetter(Letter<?> content) {
		super(content);
	}

	/**
	 * return the cost of an urgent letter. The cost is the cost of the letter *
	 * 2
	 * 
	 * @see Letters.Letter#getCost()
	 */
	@Override
	public float getCost() {
		return this.content.getCost() * 2;
	}

	/**
	 * just call the doAction of the content letter
	 * 
	 * @see Letters.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.content.doAction();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getType()
	 */
	@Override
	public String getType() {
		return "a urgent letter";
	}
}
