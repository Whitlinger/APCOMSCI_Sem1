import java.util.Scanner; 
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter a number:"); 
		int num = kb.nextInt();
		System.out.println("Please enter a multiple:");
		int mult = kb.nextInt(); 
		
		for(int i = mult; i <= num; i += mult)
		{
			System.out.print(i + "\t"); 
		}
	}
}