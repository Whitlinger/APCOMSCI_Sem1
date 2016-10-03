import java.util.Scanner; 
public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first number:"); 
		int n1 = kb.nextInt();
		System.out.println("Please enter the second number:"); 
		int n2 = kb.nextInt();
		System.out.println("Please enter the third number:"); 
		int n3 = kb.nextInt(); 
		
		print(n1, n2, n3, average(n1, n2, n3)); 
	}
	
	public static double average(int n1, int n2, int n3)
	{
		return (n1 + n2 + n3) / 3;
	}
	
	public static void print(int n1, int n2, int n3, double avg)
	{
		System.out.printf("The average of " + n1 + ", " + n2 + ", and " + n3 + " is %.5f.", avg); 
	}
}