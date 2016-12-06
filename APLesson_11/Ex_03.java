public class Ex_03
{
	public static void main(String[]args)
	{
		int [][] xAndO = new int [4][4]; 
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				xAndO [i][j] = (int)(Math.random()*2 + 1); 
			}
		}
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				if(xAndO [i][j] == 1)
					System.out.print("x");
				else
					System.out.print("o");
			}
			System.out.println();
		}
		
	}
}