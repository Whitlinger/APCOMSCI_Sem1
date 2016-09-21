import java.util.Scanner; 

public class Ex_02
{
	public static void main(String[]args)
	{
		
		Ex_02 form = new Ex_02(); 
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter your first name:"); 
		String name1 = kb.nextLine(); 
		System.out.println("Please enter your last name"); 
		String name2 = kb.nextLine(); 
		
		System.out.println("Please enter your title:"); 
		String title = kb.nextLine(); 
		System.out.println("Please enter the school site:"); 
		String site = kb.nextLine();
		
		System.out.println("Please enter the school year:"); 
		String year = kb.nextLine(); 
		System.out.println("What is your subject?"); 
		String sub = kb.nextLine(); 
		
		
		System.out.print("***************************************");
		form.format(site, year);
		form.format(name1, name2);
		form.format (title, sub); 
		System.out.println("\n***************************************");
		
	}
	
	public void format(String word1, String word2)
	{
	
		System.out.printf("\n*%15S %20S *", word1, word2);
		
	}
}