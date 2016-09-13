import java.util.Scanner; 

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Please enter your height in inches.");
		
		double h = keyboard.nextDouble();
		System.out.println("Please enter your weight in pounds.");
		
		double w = keyboard.nextDouble();
		
		double bmi = w / h / h * 703;
		
		System.out.println("Your BMI is " + bmi + ".");
		
		
		
	}
	
}