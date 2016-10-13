import java.util.Scanner; 
public class Ex_06
{
	static String username;
	static String password;
	
	public static void main(String[]args)
	{
		passCheck(); 
	}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your username:");
		username = kb.next();
		System.out.println("Please enter your password:");
		password = kb.next(); 
		
		if (username.equals("username") && password.equals("password"))
			System.out.println("You are granted access!");
		else
		{
			if (username.equals("username"))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if (password.equals("password"))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
				System.out.println("Your username and password are incorrect!");
				passCheck(); 
		}
	}
}