import java.util.Scanner;

public class MilesPerHour_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the distance:"); 
		int distance = kb.nextInt();
		System.out.println("Please enter the hours:"); 
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes:"); 
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.calc() + " mph");
		
		distance = 18;
		hours = 4; 
		minutes = 30; 
		
		object.setD(18);
		object.setH(4);
		object.setM(30); 

		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.calc() + " mph");
		
		
	}
	
}