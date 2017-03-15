public class Toyota extends Car 
{
	public Toyota(String n)
	{
			location = new double[2];
			String[]locs = n.split(", ");
			location[0]= Double.parseDouble(locs[0]); 
			location[1]= Double.parseDouble(locs[1]); 
	}
}