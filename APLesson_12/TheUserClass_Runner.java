import java.util.Scanner; 

public class TheUserClass_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstName = kb.next();
		System.out.println("Please enter your last name:"); 
		String lastName = kb.next(); 
		System.out.println("Would you like to use a public avatar? (y/n)");
		String prompt = kb.next(); 
		
		if (prompt.equals("y"))
		{
			System.out.println("Please enter your avatar name:"); 
			String avatar = kb.next(); 
			TheUserClass object = new TheUserClass(firstName, lastName, avatar);
			System.out.println(object);
		}
		else 
		{
			TheUserClass object2 = new TheUserClass(firstName, lastName);
			System.out.println(object2);
		}
	}
}