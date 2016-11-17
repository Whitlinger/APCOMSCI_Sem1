import java.util.Scanner;
public class Ex_07
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
		
		fillArray(words);
		printArray(words);
		
		System.out.print(" ");
		System.out.print("\nOnly: ");
		hasZs(words);
	}
	
	public static void fillArray(String[] words)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words:");
		for(int i = 0; i < 5; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray(String[] words)
	{
		System.out.print("For the words: ");
		
		for(String word: words)
			System.out.print(word + ", ");
	}
	
	public static void hasZs(String[] words)
	{
		for(String word: words)
		{
			if(word.indexOf("z") >= 0)
				System.out.print(word + ", ");
		}
		
		System.out.print("contain(s) the letter z");
	}
}