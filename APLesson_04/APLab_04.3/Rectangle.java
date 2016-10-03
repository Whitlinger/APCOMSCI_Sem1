import java.util.Scanner; 
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a length in ft:"); 
		int l = kb.nextInt();
		System.out.println("Please enter a width in ft:"); 
		int w = kb.nextInt(); 
		
		print(calcPerim(l, w)); 
		
	}
	
	public static double calcPerim(int l, int w)
	{
		return 2 * (l + w); 
	}
	
	public static void print(double per)
	{
		System.out.printf("Your rectangle is %.5f ft around.", per); 
	}
}