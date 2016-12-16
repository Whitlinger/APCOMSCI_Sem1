import java.util.Scanner; 

public class Ex_05
{
	static int bulletCount; 
	static int CLIPSIZE = 16; 
	static int shotCount = 16; 
	static String[] clip;
	static int CLIPS = 6; 
	static int condition = 1;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		bulletCount = 96; 
		clip = new String[CLIPSIZE]; 
		printClip(); 
		
		while(condition == 1)
		{
			System.out.println("\nAction(R or S):"); 
			String action = kb.next(); 
			
			if(action.equals("R"))
				reload(); 
			else if(action.equals("S"))
			{	
				System.out.println(shoot());
			}
			else
				System.out.println("???");
		}
		
		System.out.println("OUT OF BULLETS");
		
	}
	
	public static void printClip()
	{
		System.out.print("Bullets: " + bulletCount + "\nClip:\t");
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = " * ";
			System.out.print(clip[i]);
		}
	}
	
	public static void resetClip()
	{
		System.out.print("Bullets: " + bulletCount + "\nClip:\t");
			
			clip[shotCount-1] = "[]";
			
		for(int i = 0; i < clip.length; i++)
		{
			System.out.print(clip[i]);
		}
		shotCount--;
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			bulletCount--; 
			resetClip(); 
			System.out.println("");
			return "BOOM!!!";
		}
		else
			return "Reload!!!";
	}
	
	public static void reload()
	{
		if(CLIPS > 0)
		{
			if(shotCount != 0)
			{
				bulletCount -= 16; 
				printClip(); 
			}
			else
			{
				CLIPS--;
				shotCount = 16;
				printClip(); 
			}
		}
		else
			condition = 0; 
	}
	
	
}

