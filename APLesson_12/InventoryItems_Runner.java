import java.util.Scanner; 

public class InventoryItems_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the item manufacturer:");
		String manu = kb.next(); 
		System.out.println("Please enter the item category:"); 
		String category = kb.next(); 
		System.out.println("Would you like to enter the name and price information? (y/n)");
		String prompt = kb.next(); 
		
		if (prompt.equals("y"))
		{
			System.out.println("Please enter the item name:");
			String name = kb.next();
			System.out.println("Please enter the item price:"); 
			String price = kb.next(); 
			InventoryItems object = new InventoryItems(manu, name, category, price);
			System.out.println(object);
		}
		else 
		{
			InventoryItems object2 = new InventoryItems(manu, category);
			System.out.println(object2);
		}
	}
}