import java.util.List;
import java.util.ArrayList;

public class Deck {

	private Card[] cards;
	
	private Card[] currentDeck;
 	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new Card[ranks.length * suits.length];
		int cardNum = 0;

		for (String s: suits) {
			int valueNum = 0;
			for (String r: ranks) {
				Card card = new Card (r, s, values[valueNum]);
				cards[cardNum] = card;
				valueNum++;
				cardNum++;
			}
		}
		
		/*
		ArrayList<Card> cards = new ArrayList<Card>();
		
		for (String s:  suits) {
			for (int i = 0; i < ranks.length; i++) {
				Card card = new Card (ranks[i], s, values[i]);
				cards.add(card);
			}
		}
		
		//size = cards.size();
		*/		
		
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
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (!isEmpty()) {
			size--;
			return cards[size];
		}
		
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
