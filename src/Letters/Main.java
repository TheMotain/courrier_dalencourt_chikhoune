/**
 * 
 */
package Letters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import City.City;
import City.Inhabitant;
import Content.MoneyContent;
import Content.TextContent;

/**
 * Contains the main method of the program
 * 
 * @author Alex Dalencourt
 * @author Sellenia Chikhoune
 *
 */
public class Main {
	public static void main(String[] args) {
		City city = new City("Lille");
		System.out.println("Create " + city.name);
		List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		int nbLetterToSend;
		int nbDay = 6;
		int nbInhabitants = 100;
		Inhabitant sender;
		Inhabitant receiver;
		Letter<?> letter;
		Random r = new Random();
		for (int i = 0; i < nbInhabitants; i++)
			inhabitants.add(new Inhabitant(city, "Inhabitant-" + i, 5000));
		System.out.println("Create " + nbInhabitants + " inhabitants");
		System.out.println("Mailing letters for " + nbDay + " days");
		for (int i = 1; i <= nbDay; i++) {
			System.out.println("***************************************************");
			System.out.println("Day " + i);
			city.distributeLetters();
			nbLetterToSend = r.nextInt(9) + 1;
			for (int j = 0; j < nbLetterToSend; j++) {
				sender = inhabitants.get(r.nextInt(nbInhabitants));
				receiver = inhabitants.get(r.nextInt(nbInhabitants));
				switch (r.nextInt(2)) {
				case 0:
					letter = new SimpleLetter(sender, receiver, new TextContent("bla bla"));
					break;
				case 1:
					letter = new PromissoryNote(sender, receiver, new MoneyContent(r.nextInt(1000)));
					break;
				default:
					letter = new SimpleLetter(sender, receiver, new TextContent("bla bla"));
					break;
				}
				sender.sendLetter(letter);
			}
		}
	}
}