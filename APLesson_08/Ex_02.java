import java.util.Scanner; 
public class Ex_02
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter the first word:"); 
		String w1 = kb.next(); 
		System.out.println("Please enter the second word:");
		String w2 = kb.next();
		System.out.println("Please enter the third word:"); 
		String w3 = kb.next(); 
		
		System.out.println(makeCenter(w1) + "\n" + makeCenter(w2) + "\n" + makeCenter(w3));
		
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else
		{
			return makeCenter(" " + word + " "); 
		}
	}
}