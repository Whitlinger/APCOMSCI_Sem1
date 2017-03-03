public class Honda implements Location
{
	private double[] loc= new double[2];
	
	public Honda()
	{
		loc = new double[]{0,0};
	}
	
	public Honda(double [] n)
	{
		loc = n; 
	}
	
	public int getID()
	{
		return (int)(Math.random()*899999) + 100000; 
	}
	
	public void move(int x, int y)
	{
		loc[0] += x;
		loc[1] += y; 
	}
	
	public double[] getLoc()
	{
		return loc; 
	}
}