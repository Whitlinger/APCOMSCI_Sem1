import java.util.Scanner; 
public class Ex_05
{
	static String c1; 
	static String c2; 
	static String c3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You are trapped in a locked room. There is nothing in the room, except for 1 RED key and 1 GREEN key. What do you do?"); 
		System.out.println("A. Use the RED key.\nB. Use the GREEN key."); 
		c1 = kb.next(); 
		
		if (c1.equals("A") || c1.equals("a"))
		{
			System.out.println("You use the red key on the door, and it unlocks. You step out into a dark hallway. Do you go LEFT or RIGHT?"); 
			System.out.println("A. Go LEFT.\nB. Go RIGHT."); 
			c2 = kb.next(); 
			if (c2.equals("A") || c2.equals("a"))
			{
				System.out.println("You turn left and wander down a dark corrider that seems to stretch on for eternity. At last, you see a door with an exit sign. But before you can open it, you hear snarling behind you. There's a fire extinguisher by the door. Do you grab it?");
				System.out.println("A. GRAB.\nB. DON'T GRAB.");
				c3 = kb.next(); 
				if (c3.equals("B") || c3.equals("b"))
				{
					System.out.println("You hesitate, and the snarling sound grows louder. Something bounds toward you, and you realize it's a puppy. The sound wasn't snarling, but the yelps of an excited dog. You pet it briefly, before opening the door and making your way back to the outside world.\nGOOD END.");
				}
				else 
					System.out.println("You grab the fire extinguisher as the snarling sound grows louder, and swing it at whatever is running towards you. A startled whimper comes from the creature, and you realize it's just a puppy. Shouting comes from somewhere within the building, and the puppy's owner appears with an AK-47 in his arms. You've just hurt his puppy, and he does NOT look happy.\nBAD END");
			}
			else 
				System.out.println("You turn right, and bump into a man holding an AK-47. He starts shouting at you in a language you can't understand, and raises his firearm. You gulp. This isn't going to be pretty.\nBAD END.");
		}
		else 
			System.out.println("You use the green key on the door. An alarm starts blaring overhead, and you know you're pretty screwed.\nBAD END"); 
	}
}