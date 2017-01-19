public class InventoryItems
{
	private String manu; 
	private String name; 
	private String category; 
	private int UPC; 
	private String price; 
	
	public InventoryItems()
	{
		manu = "";
		name = "";
		category = "";
		price = "";
		UPC = (int) (Math.random() * 900000000) + 100000000; 
	}
	
	public InventoryItems(String m, String n, String c, String p)
	{
		manu = m;
		name = n;
		category = c;
		price = p;
		UPC = (int) (Math.random() * 900000000) + 100000000; 
	}
	
	public InventoryItems(String m, String c)
	{
		manu = m;
		name = "Unknown";
		category = c;
		price = "Unknown";
		UPC = (int) (Math.random() * 900000000) + 100000000; 
	}
	
	public void setM(String m)
	{
		manu = m;
	}
	
	public void setN(String n)
	{
		name = n;
	}
	
	public void setC(String c)
	{
		category = c;
	}
	
	public void setP(String p)
	{
		price = p;
	}
	
	public String toString()
	{
		return "Item Info...\nManufacturer: " + manu + 
					"\nName: " + name +
					"\nCategory: " + category + 
					"\nPrice: " + price + 
					"\nUPC #: " + UPC; 
	}
}