/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card x = new Card("Ace", "Spades", 1); 
		Card y = new Card("Queen", "Hearts", 12); 
		Card z = new Card("Ace", "Spades", 1); 
		
		System.out.println("x matches y: " + x.matches(y));
		System.out.println("x matches z: " + x.matches(z));    
		System.out.println("x: " + x.toString());
		
	}
}
