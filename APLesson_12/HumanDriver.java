import java.util.Scanner;

public class HumanDriver 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Please enter hair color:"); 
		String hair = kb.nextLine();
		System.out.println("Please enter eye color:"); 
		String eyes = kb.nextLine();
		System.out.println("Please enter skin color:"); 
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin); 
		
		System.out.println("\nMy info......");
		System.out.println("HAIR:\t" + object.getHair()); 
		System.out.println("EYES:\t" + object.getEyes()); 
		System.out.println("SKIN:\t" + object.getSkin()); 
		
		object.setHES("rainbow", "diamond", "blue");
		System.out.println("\nFriend's info......");
		System.out.println("HAIR:\t" + object.getHair()); 
		System.out.println("EYES:\t" + object.getEyes()); 
		System.out.println("SKIN:\t" + object.getSkin()); 
	}
	
}