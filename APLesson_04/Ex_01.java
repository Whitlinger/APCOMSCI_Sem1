import java.util.Scanner; 

public class Ex_01
{
	public static void main(String[]args)
	{
		
		Ex_01 form = new Ex_01(); 
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter item 1:"); 
		String item1 = kb.nextLine(); 
		System.out.println("Please enter the price:"); 
		double price1 = kb.nextDouble(); 
		
		System.out.println("Please enter item 2:"); 
		kb.nextLine();
		String item2 = kb.nextLine(); 
		System.out.println("Please enter the price:"); 
		double price2 = kb.nextDouble(); 
		
		System.out.println("Please enter item 3:"); 
		kb.nextLine();
		String item3 = kb.nextLine(); 
		System.out.println("Please enter the price:"); 
		double price3 = kb.nextDouble(); 
		
		String sub = "SUBTOTAL:";
		double sub1 = price1 + price2 + price3;
		String tax = "TAX:";
		double tax1 = sub1 * 0.075; 
		String total = "TOTAL:";
		double total1 = sub1 + tax1; 
		
		
		System.out.println("-.-.-.-.-.-.-._RECEIPT_.-.-.-.-.-.-.-");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format (sub, sub1); 
		form.format (tax, tax1);
		form.format (total, total1); 
		System.out.printf("\n_____________________________________");
		System.out.printf("\n*THANK YOU FOR YOUR SUPPORT*");
		
	}
	
	public void format(String item, double price)
	{
	
		System.out.printf("\n*%15S ........ %10.2f", item, price);
		
	}
}