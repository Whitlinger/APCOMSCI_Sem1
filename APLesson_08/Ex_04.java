import java.util.Scanner;
public class Ex_04
{
	static int i;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a word:"); 
		String word = kb.next();
		
		tree(word);
	}
	
	public static String tree(String word)
	{
		if(i < word.length())
		{
			i++;
			System.out.printf("%10s\n", word.substring(0, i));
			tree(word);
		}
		return " ";
	}
}