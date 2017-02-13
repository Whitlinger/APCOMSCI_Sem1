public class GameSystem 
{
	private String platform; 
	private int serialNo; 
	
	public GameSystem()
	{
		platform = "";
		serialNo = ((int) Math.random() * 8999999) + 1000000;
	}
	
	public GameSystem(String p)
	{
		platform =  p; 
		serialNo = (int) (Math.random() * 8999999) + 1000000; 
	}
	
	public String getPlatform()
	{
		return platform; 
	}
	
	public int getSN()
	{
		return serialNo; 
	}
}