import java.util.Scanner;
public class Ex_03
{
	static int num;
	static int rev; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter a number:"); 
		int number = kb.nextInt(); 
		num = number;
		
		getReverse(); 
		
		System.out.print(number + " rerversed is " + rev);
	}
	
	public static void getReverse()
	{
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			num /= 10; 
		}
	}
}