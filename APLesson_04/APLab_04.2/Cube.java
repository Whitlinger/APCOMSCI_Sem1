import java.util.Scanner; 
public class Cube
{
	static double side; 
	static double surf; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a side length:"); 
		side = kb.nextDouble();

		calcSurf();
		print(); 
		
	}
	
	public static void calcSurf()
	{
		surf = side * side * side; 
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with side length %.0f is %.5f.", side, surf); 
	}
}