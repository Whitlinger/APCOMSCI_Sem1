import java.util.Scanner; 
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a sentence:"); 
		String word = kb.nextLine(); 
	
		System.out.println(replace(word)); 
	}

	public static String replace(String word)
	{
		while(word.indexOf(" ")>0)
		{
			word = word.substring(0,word.indexOf(" ")) + "_" + word.substring(word.indexOf(" ") + 1); 
			replace(word);
		}
		return word;
	}
}