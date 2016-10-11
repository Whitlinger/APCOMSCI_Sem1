import java.util.Scanner;
public class Ex_01 
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your grade for Math:");
		String g1 = kb.next(); 
		System.out.println("Please enter your grade for Science:");
		String g2 = kb.next(); 
		System.out.println("Please enter your grade for English:");
		String g3 = kb.next(); 
		System.out.println("Please enter your grade for History:");
		String g4 = kb.next(); 
		System.out.println("Please enter your grade for Foreign Language:");
		String g5 = kb.next(); 
		System.out.println("Please enter your grade for Computer Science:");
		String g6 = kb.next(); 
		System.out.println("Please enter your grade for Physical Education:");
		String g7 = kb.next(); 
		
		double gpa = (calcPoints(g1) + calcPoints(g2) + calcPoints(g3) + calcPoints(g4) + calcPoints(g5) + calcPoints(g6) + calcPoints(g7)) / 7; 
		
		System.out.printf("Your GPA is %.2f.", gpa); 
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4; 
		if (grade.equals("B"))
			return 3; 
		if (grade.equals("C"))
			return 2; 
		if (grade.equals("D"))
			return 1;		
		return 0;
	}
	
}