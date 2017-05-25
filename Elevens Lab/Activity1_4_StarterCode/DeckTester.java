/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d1 = new Deck(rank, suit, value);
		System.out.println(d1); 
		
		
	}
}
