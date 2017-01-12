import java.util.Scanner;

public class CarDriver 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter the paint color:"); 
		String paint = kb.nextLine();
		System.out.println("Please enter the interior type:"); 
		String interior = kb.nextLine();
		System.out.println("Please enter the engine type:"); 
		String engine = kb.nextLine();
		System.out.println("Please enter the tires model:"); 
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires); 
		
		System.out.println("Your vehicle is ready......");
		System.out.println("PAINT:\t" + object.getPaint()); 
		System.out.println("INTERIOR:\t" + object.getInterior()); 
		System.out.println("ENGINE:\t" + object.getEngine()); 
		System.out.println("TIRES:\t" + object.getTires()); 
		
	}
	
}