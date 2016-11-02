import java.util.Scanner;
public class Ex_02
{
	static int num; 
	static int sum;
	static int digits;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter a number:"); 
		int number = kb.nextInt(); 
		num = number;
		
		System.out.println("The average of the digits in " + number + " is " + avDigits());
	}
	
	public static double avDigits()
	{
		
		while(num > 0)
		{
			sum = sum + num % 10; 
			num /= 10; 
			digits++; 
		}
		
		return (double)(sum) / digits;
	}
}