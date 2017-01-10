import java.lang.Math.*; 

public class MilesPerHour
{
	private int distance, hours, minutes; 
	private double mph; 
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0; 
		mph = 0; 
	}
	
	public MilesPerHour(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m; 
		mph = 0; 
	}
	
	public void setD(int d)
	{
		distance = d;
	}
	
	public void setH(int h)
	{
		hours = h;
	}
	
	public void setM(int m)
	{
		minutes = m; 
	}
	
	public double calc()
	{
		return Math.round(distance / (hours + minutes/60.0)); 
	}
	
}