import java.util.Scanner; 
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		int[] numbers = new int[10];
		
		System.out.println("Please enter 10 numbers:"); 
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = kb.nextInt(); 
		}
		
		System.out.println("Numbers..."); 
		
		for(int num: numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println("\nThe average of the above numbers is " + average(numbers));
	}
	
	public static double average(int[] numbers)
	{
		double sum = 0;
		for(int num: numbers)
		{
			sum = sum + num;
		}
		
		return sum / numbers.length; 
	}
}