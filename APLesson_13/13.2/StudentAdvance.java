public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int n)
	{
		super(n);
	}
	
	public double getPrice()
	{
		if(super.getDL() <= 10)
		{
			return 15.00;
		}
		else
			return 20.00; 
	}
	
	public String toString()
	{
		return "Serial #: " + getSN() + "\nPrice: " + getPrice() + "\n(STUDENT ID REQUIRED)"; 
	}
}