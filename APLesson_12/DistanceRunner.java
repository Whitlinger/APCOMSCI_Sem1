import java.util.Scanner;

public class DistanceRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first x-coordinate:");
		int xOne = kb.nextInt();
		System.out.println("Please enter the first y-coordinate:");
		int yOne = kb.nextInt();
		System.out.println("Please enter the second x-coordinate:");
		int xTwo = kb.nextInt();
		System.out.println("Please enter the second y-coordinate:");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.printf("Distance = %.2f\n", object.calcDistance());
		
		object.set1(3);
		object.set2(7);
		object.set3(6);
		object.set4(11);
		
		System.out.printf("Distance = %.2f", object.calcDistance());
	}

   //Use modifiers to set new coordinates
   //print the distance just like before
}