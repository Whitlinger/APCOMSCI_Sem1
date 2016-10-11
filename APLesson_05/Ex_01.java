import java.util.Random;
public class Ex_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int dice1 = rand.nextInt(6) + 1; 
		int dice2 = rand.nextInt(6) + 1;
		
		System.out.println("You rolled a " + dice1 + ".");
		System.out.println("The computer rolled a " + dice2 + ".");
		
		rollDice(dice1, dice2); 
		
	}
	
	public static void rollDice(int dice1, int dice2)
	{
		if (dice1 > dice2)
		{
			System.out.println("The winner is you!");
		}
	
		if (dice1 < dice2)
		{
			System.out.println("The winner is the computer!");
		}
		
		if (dice1 == dice2)
		{
			System.out.println("It's a tie!");
		}
	}

}