public class Ex_03
{
	public static void main(String[]args)
	{ 
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1; 
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