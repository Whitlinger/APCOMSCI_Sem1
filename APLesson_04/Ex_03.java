import java.util.Scanner; 

public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 loan = new Ex_03(); 
		Ex_03 form = new Ex_03(); 
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your loan amount:"); 
		double Principal = kb.nextDouble();
		System.out.println("Please enter your interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Please enter the number of times the laon is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Please enter the life of the loan in years:"); 
		double time = kb.nextDouble();
		
		double pay = loan.payment(rate, Principal, number, time); 
		
		System.out.printf("Your total monthly payment is $%6.2f.", pay); 
	}
	
	public double payment(double r, double P, double n, double t)
	{
		double total = Math.pow(1 + r / n, n * t);
		
		return P * total / (t * 12); 
	}
	
}