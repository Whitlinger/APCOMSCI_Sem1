import java.util.Scanner;
public class qfive
{
	static int var1;
	static int var2;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a number:");
		var1 = kb.nextInt();
		System.out.println("Please enter another number:"); 
		var2 = kb.nextInt();
		System.out.println(var1 + " - " + var2 + " = " + sub()); 
		
	}
	
	public static int sub()
	{
		return var1 - var2; 
	}

}