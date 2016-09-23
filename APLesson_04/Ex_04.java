import java.util.Scanner; 

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 volume = new Ex_04(); 
		Ex_04 form = new Ex_04(); 
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the height in inches:"); 
		double height = kb.nextInt();
		System.out.println("Please enter the length in inches:"); 
		double length = kb.nextInt(); 
		System.out.println("Please enter the width in inches:"); 
		double width = kb.nextInt(); 
		
		double v = volume.vol(height, length, width);
		
		System.out.printf("Your volume in cubic feet is %5.2f", v); 
	}
	
	public double vol(double h, double l, double w)
	{
		return (h * l * w) / 1728;
	}
	
}