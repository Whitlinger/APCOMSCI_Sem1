import java.util.Scanner; 
public class Ex_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word:"); 
		String word = kb.next(); 
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.printf("%S\n", word.substring(i));
		}
	}
}