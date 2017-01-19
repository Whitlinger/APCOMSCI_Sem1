public class TheUserClass
{
	private String firstName; 
	private String lastName; 
	private String avatar; 
	private int userID; 
	
	public TheUserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = (int) (Math.random() * 900000) + 100000;  
	}
	
	public TheUserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av; 
		userID = (int) (Math.random() * 900000) + 100000;  
	}
	
	public TheUserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined"; 
		userID = (int) (Math.random() * 900000) + 100000; 
	}
	
	public void setfN(String fN)
	{
		firstName = fN;
	}
	
	public void setlN(String lN)
	{
		lastName = lN;
	}
	
	public void setAv(String av)
	{
		avatar = av; 
	}
	
	public String toString()
	{
		return "User Info...\nFirst Name: " + firstName + 
					"\nLast Name: " + lastName +
					"\nAvatar: " + avatar + 
					"\nUser ID#: " + userID; 
	}
}