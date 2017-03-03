public class Toyota implements Location
{
	private double[] loc; 
	
	public Toyota()
	{
		loc = new double[2];
	}
	
	public Toyota(String n)
	{
			loc = new double[2];
			String[]locs = n.split(", ");
			loc[0]= Double.parseDouble(locs[0]); 
			loc[1]= Double.parseDouble(locs[1]); 
	}
	
	public int getID()
	{
		return (int)(Math.random()*899999) + 100000; 
	}
	
	public void move(double x, double y)
	{
		loc[0]+=x;
		loc[0]+=y; 
	}
	
	public double[] getLoc()
	{
		return loc; 
	}
}