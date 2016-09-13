import java.util.Scanner; 

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("What is your name? ");
		
		String name = keyboard.nextLine();
		System.out.println("Wow, how do you go out in public with a name like " + name + "? You should consider entering the Witness Protection Program."); 
		
		System.out.println("How old are you, " + name + "?");
		
		int num = keyboard.nextInt();
		System.out.println(num + " already? Gee, I'm sorry...I should have known better than to ask about sensitive information.");
		
		System.out.println("So, what do you do for fun?");
		
		keyboard.nextLine();
		
		String fun = keyboard.nextLine();
		System.out.println("Man, you must be reaaaally bored with your life to actually " + fun + " for fun.");
		
		System.out.println("At least you have good taste in music, right? What's your favorite genre?");
		
		String music = keyboard.nextLine();
		System.out.println("Darn! I was hoping you wouldn't say " + music + ", but I guess we can't all be perfect.");
		
		System.out.println("How many siblings do you have, then?");
		
		int sib = keyboard.nextInt();
		System.out.println(sib + "? That's a shame.");
		
		System.out.println("What do you want to be when you grow up?");
		
		keyboard.nextLine();
		
		String growup = keyboard.nextLine(); 
		System.out.println("Isn't being a " + growup + " a little too ambitious for you?" );
		
		System.out.println("Whew. Good luck being you, " + name + ". Cheers.");
		
		
	}
	
}