import java.util.Scanner; 
public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a side length:"); 
		int side = kb.nextInt();

		print(side, calcSurf(side)); 
		
	}
	
	public static double calcSurf(int side)
	{
		return side * 6; 
	}
	
	public static void print(int side, double surf)
	{
		System.out.printf("The surface area of a cube with side length " + side + " is %.5f.", surf); 
	}
}