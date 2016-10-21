import java.util.Scanner; 
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter an integer:"); 
		int num = kb.nextInt(); 
		System.out.println("Please enter the table size:"); 
		int size = kb.nextInt(); 
		int y = 1;
		
		for(int i = 1; i <= size; i++)
		{
			y = num * i;
			System.out.printf("x = %d   |   y = %d\n", i, y);
		}
	}
	
}