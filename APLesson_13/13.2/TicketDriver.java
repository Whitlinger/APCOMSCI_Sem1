public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket w = new Walkup();
		Ticket a = new Advance(7);
		Ticket s = new StudentAdvance(10);
		
		System.out.println(w + "\n\n" + a + "\n\n" + s); 
	}
}