/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"1", "4", "9"};
		String[] suits1 = {"Spades", "Clubs"};
		int[] pV1 = {1,4,9};
		
		Deck d1 = new Deck(ranks1, suits1, pV1);
		
		System.out.println(d1);
		
		String[] ranks2 = {"3", "10", "King", "Ace"};
		String[] suits2 = {"Hearts", "Clubs"};
		int[] pV2 = {3,10,13, 14};
		
		Deck d2 = new Deck(ranks2, suits2, pV2);
		
		System.out.println(d2);
		
		String[] ranks3 = {"6", "4", "Jack", "2"};
		String[] suits3 = {"Spades", "Diamonds", "Hearts"};
		int[] pV3 = {3,10,13, 14};
		
		Deck d3 = new Deck(ranks3, suits3, pV3);
		
		System.out.println(d3);
		
	}
}
