/**
 * 
 */
package City;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Content.MoneyContent;
import Content.TextContent;
import Letters.Letter;
import Letters.PromissoryNote;
import Letters.RegisteredLetter;
import Letters.SimpleLetter;
import Letters.UrgentLetter;

/**
 * Contains the main method of the program
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 * 
 */
public class Main {
	/**
	 * Main function
	 * 
	 * @param args
	 *            arguments of the main function
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		City city = new City("Lille");
		System.out.println("Create " + city.name);
		List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		int nbLetterToSend;
		int nbDay = 20;
		int nbInhabitants = 100;
		Inhabitant sender;
		Inhabitant receiver;
		Random random = new Random();
		Letter<?> letter;
		for (int i = 0; i < nbInhabitants; i++)
			inhabitants.add(new Inhabitant(city, "Inhabitant-" + i, 5000));
		System.out.println("Create " + nbInhabitants + " inhabitants");
		System.out.println("Mailing letters for " + nbDay + " days");
		for (int i = 1; i <= nbDay; i++) {
			System.out
					.println("***************************************************");
			System.out.println("Day " + i);
			city.distributeLetters();
			nbLetterToSend = random.nextInt(9) + 1;
			for (int j = 0; j < nbLetterToSend; j++) {
				sender = inhabitants.get(random.nextInt(nbInhabitants));
				receiver = inhabitants.get(random.nextInt(nbInhabitants));
				letter = sendLetter(sender, receiver, random, 3);
				if (sender.getBalence() > letter.getCost())
					sender.sendLetter(letter);
				else
					j--;
			}
		}
		System.out
				.println("***************************************************");
		for (int i = 0; i < nbInhabitants; i++) {
			System.out.println(inhabitants.get(i).getName() + " balance = "
					+ inhabitants.get(i).getBalence());
		}
	}

	/**
	 * The main factory for create a letter
	 * 
	 * @param sender
	 *            the sender of the letter
	 * @param receiver
	 *            the receiver of the letter
	 * @param random
	 *            a random class object for generate a random integer
	 * @param max
	 *            the value for the max random if >= 3 include option letter
	 * @return return a new letter
	 */
	public static Letter<?> sendLetter(Inhabitant sender, Inhabitant receiver,
			Random random, int max) {
		Letter<?> letter = null;
		switch (random.nextInt(max)) {
		case 0:
			letter = new SimpleLetter(sender, receiver, new TextContent(
					"bla bla"));
			break;
		case 1:
			letter = new PromissoryNote(sender, receiver, new MoneyContent(
					random.nextInt(1000)));
			break;
		case 2:
			letter = sendOptionLetter(sender, receiver, random);
			break;
		default:
			letter = new SimpleLetter(sender, receiver, new TextContent(
					"bla bla"));
			break;
		}
		return letter;
	}

	/**
	 * Second factory for create a letter with option. The factory can not
	 * create an urgent urgent letter
	 * 
	 * @param sender
	 *            the sender of the letter
	 * @param receiver
	 *            the receiver
	 * @param random
	 *            a random class object for generate a random integer
	 * @return return a new letter
	 */
	public static Letter<?> sendOptionLetter(Inhabitant sender,
			Inhabitant receiver, Random random) {
		Letter<?> letter = null;
		switch (random.nextInt(2)) {
		case 0:
			letter = new RegisteredLetter(sendLetter(sender, receiver, random,
					2));
			break;
		case 1:
			letter = new UrgentLetter(sendLetter(sender, receiver, random, 2));
			break;
		default:
			letter = new UrgentLetter(sendLetter(sender, receiver, random, 2));
		}
		return letter;
	}
}