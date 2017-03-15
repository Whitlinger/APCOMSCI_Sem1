public class GMC extends Car
{
	private double xLoc; 
	private double yLoc;
	
	public GMC(double x, double y)
	{
		xLoc = x;
		yLoc = y; 
	}
	
	public void move(double x, double y)
	{
		xLoc += x;
		yLoc += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xLoc; 
		location[1] = yLoc; 
		return location;
	} 
}