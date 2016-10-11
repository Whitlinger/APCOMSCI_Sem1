import java.util.Scanner;
public class Ex_02 
{
	static double h;
	static double w;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches:"); 
		h = kb.nextDouble();
		System.out.println("Please enter your weight in pounds:");
		w = kb.nextDouble();
		
		calcBMI(); 
		System.out.printf("Your BMI is: %.1f\n", bmi); 
		System.out.println("You are " + condition + "."); 
	}
	
	public static void calcBMI()
	{
		bmi = w / h / h * 703;
		if (bmi <= 18.5)
			condition = "Underweight"; 
		else if (bmi <= 24.9)
			condition = "Normal"; 
		else if (bmi <= 29.9)
			condition = "Overweight"; 
		else if (bmi <= 34.9)
			condition = "Obese"; 
		else if (bmi <= 39.9)
			condition = "Very Obese"; 
		else if (bmi > 39.9)
			condition = "Morbidly Obese"; 
	}
}