import java.util.Arrays; 
import java.util.ArrayList;

public class Ex_01
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers)); 
		
		gFactor(numList); 
	}
	
	public static void gFactor(ArrayList<Integer> numList)
	{
		for(int i = 0; i < numList.size(); i++) 
		{
			int factor = 0;  
			
			for(int n = 2; n < numList.get(i); n++)
			{
				if(numList.get(i) % n == 0)
					factor++; 
			}
			
			if(factor <= 0)
				numList.remove(i);
		}
		
		System.out.println(numList); 
	}
}
