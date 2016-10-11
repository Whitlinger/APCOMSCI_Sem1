import java.util.Scanner; 
public class Ex_02
{
	static double dis;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter Item 1:");
		String i1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double p1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter Item 2:");
		String i2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double p2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter Item 3:");
		String i3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double p3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter Item 4:");
		String i4 = kb.nextLine();
		System.out.println("Please enter the price:");
		double p4 = kb.nextDouble();
		
		double subtotal = p1 + p2 + p3 + p4;
		String sub = "SUBTOTAL"; 
		
		discount(subtotal); 
		String dc = "DISCOUNT";
		double tax = subtotal * 0.075;
		String tax1 = "TAX";
		double total = subtotal - dis + tax;
		String total1 = "TOTAL";
		
		System.out.println("<<<<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>>"); 
		format(i1, p1); 
		format(i2, p2); 
		format(i3, p3); 
		format(i4, p4); 
		System.out.println("\n"); 
		format(sub, subtotal); 
		format(dc, dis); 
		format(tax1, tax);
		format(total1, total);
		System.out.println("\n"); 
		System.out.println("\n===== Thank you for shopping with us! =====");
	}
	
	public static void discount(double subtotal)
	{
		if(subtotal >= 2000)
		{
			dis = subtotal * .15;
		}
		
		if(subtotal < 2000)
		{
			dis = 0;
		}
	}
	
	public static void format(String i, double p)
	{
		System.out.printf("\n%15S............%7.2f", i, p);
	}
}