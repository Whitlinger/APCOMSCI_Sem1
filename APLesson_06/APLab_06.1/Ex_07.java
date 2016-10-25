import java.util.Scanner; 
public class Ex_07
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter a word:");
		String word = kb.next(); 
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.printf("%S\n", word.substring(i,word.length()));
		}
	}
}