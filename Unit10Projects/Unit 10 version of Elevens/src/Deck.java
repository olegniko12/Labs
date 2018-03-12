import java.util.List;
import java.util.ArrayList;
///MyVersion
public class Deck {

	private ArrayList<Card> cards;

	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {	
		
		cards = new ArrayList<Card>();
		
		size = 0;
		
		for (String s:  suits) {
			int valueNum = 0;
			for (String r: ranks) {
				Card card = new Card (r, s, values[valueNum]);
				cards.add(card);
				valueNum++;
				size++;
			}
		}
		
		System.out.println(size);	

		//ArrayList Version
	}

	public boolean isEmpty() {
		if (size() == 0){
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		for (int i = 0; i<cards.size(); i++) {
			boolean isLooking = true;
			
			int r =  randomInRange(0,cards.size()-1);
			
			Card temp = cards.get(i);
			
			cards.set(i, cards.get(r));
			cards.set(r, temp);
						
		}
		size = cards.size();
		
	}
	
	public static int randomInRange (int min, int max){
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (!isEmpty()) {
			size--;
			return cards.get(size);
		}
		
		return null;
	}

	public String toString() {

		String rtn = "size = " + size + "\nUndealt cards: \n";		

		for (int k = size - 1; k >= 0; k--) {
			
			rtn += ("" + cards.get(k));
			
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\n";

		return rtn;
	}
}
