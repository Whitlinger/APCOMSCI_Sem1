public class Ex_08
{
	public static void main(String[]args)
	{ 
		String word1 = "Na";
		int num1 = 4;
		String word2 = "Hey";
		int num2 = 3;
		String word3 = "Goodbye!";
		int num3 = 1;
		
		sing(word1, num1);
		System.out.println("");
		sing(word1, num1);
		System.out.println("");
		sing(word2, num2);
		System.out.println("");
		sing(word3, num3); 
	}
	
	public static void sing(String word, int num)
	{
		for(int i = 1; i <= num; i++)
		{
			System.out.print(word + " ");
		}
	}
}