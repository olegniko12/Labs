/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("5", "Clubs", 5);
		System.out.println(card1);
		
		Card card2 = new Card("King", "Spades", 13);
		System.out.println(card2);
		
		Card card3 = new Card("Ace", "Hearts", 14);
		System.out.println(card3);
		
	}
}
