/**
 * 
 */
package Letters;

import City.Inhabitant;
import Content.MoneyContent;
import Letters.Letter.DecoratedLetter;

/**
 * Describe a promissory note. The promissory note can be decorate.
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class PromissoryNote extends Letter<MoneyContent> implements DecoratedLetter{

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
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, MoneyContent content) {
		super(sender, receiver, content);
	}

	/**
	 * return the cost of the letter. The cost is 1 + 1% of the content
	 * 
	 * @see Letters.Letter#getCost()
	 */
	@Override
	public float getCost() {
		return (float) (1 + this.content.getAmount() * 0.01);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Letters.Letter#getType()
	 */
	@Override
	public String getType() {
		return "a promissory note letter";
	}

	/* (non-Javadoc)
	 * @see Letters.Letter#getStringContent()
	 */
	@Override
	public String getStringContent() {
		return "a money content (" + this.getContent().getAmount() + ")";
	}

	/**
	 * Do the action for the letter content and send a thank letter
	 * @see Letters.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.sender.withdraw(this.content.getAmount());
		System.out.println("   - " + this.getContent().getAmount() + " euros is debited from " + this.getSender().getName() + " account whose balance is now " + this.sender.getBalence() + " euros");
		this.receiver.credit(this.content.getAmount());
		System.out.println("   + " + this.getReceiver().getName() + " account is credited with " + this.getContent().getAmount() + " euros, its balance is now " + this.receiver.getBalence() + " euros");
		this.receiver.sendLetter(new ThankLetter(this.receiver, this.sender, this.getContent().getAmount()));
	}

	@Override
	public String getDecoratedLetterType() {
		return "a promissory note";
	}

}
