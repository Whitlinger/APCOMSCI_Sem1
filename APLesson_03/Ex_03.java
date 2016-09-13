import java.util.Scanner; 

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Please enter the number of miles you wish to convert to kilometers.");
		
		double mi = keyboard.nextDouble(); 
		double km = mi * 1.6; 
		
		System.out.println(mi + " miles is equivalent to " + km + " kilometers.");
		
		
		
		
	}
	
}