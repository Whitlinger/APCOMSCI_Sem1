public class Ex_06
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray(numbers);
		printArray(numbers);
		
		System.out.println("\nThe biggest number is " + getBiggest(numbers));
	}
	
	public static void fillArray(int[] numbers)
	{
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1; 
		}
	}
	
	public static void printArray(int[] numbers)
	{
		System.out.println("For the following numbers...");
		
		for(int num: numbers)
			System.out.print(num + " ");
	}
	
	public static int getBiggest(int[] numbers)
	{
		int max = 0; 
		
		for(int i = 0; i < 10; i++)
		{
			if(numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}
}