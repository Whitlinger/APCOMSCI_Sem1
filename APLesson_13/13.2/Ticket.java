public abstract class Ticket
{
	public Ticket()
	{
	}
	
	public int getSN()
	{
		return (int) (Math.random() * 8999999) + 1000000;
	}
	
	abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSN() + "\nPrice: " + getPrice();
	}
}