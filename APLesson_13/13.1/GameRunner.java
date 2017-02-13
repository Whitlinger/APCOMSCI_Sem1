public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem x = new XBox("XBox"); 
		GameSystem y = new PlayStation("PlayStation"); 
		GameSystem z = new PC("PC"); 
		
		System.out.println(x + "\n\n" + y + "\n\n" + z); 
		
	}
}