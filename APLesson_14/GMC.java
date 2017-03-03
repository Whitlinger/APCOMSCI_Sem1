public class GMC implements Location
{
	private double xLoc; 
	private double yLoc;
	
	public GMC()
	{
		xLoc = 0;
		yLoc = 0; 
	}
	
	public GMC(double x, double y)
	{
		xLoc = x;
		yLoc = y; 
	}
	
	public int getID()
	{
		return (int)(Math.random()*899999) + 100000; 
	}
	
	public void move(double x, double y)
	{
		xLoc += x;
		yLoc += y; 
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = xLoc;
		loc[1] = yLoc;
		
		return loc; 
	}
}