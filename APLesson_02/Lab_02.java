public class Lab_02
{
	public static void main(String[]args)
	{
		int taco = 9;
		int tuesdays = 4; 
		int rad = taco * tuesdays;
		int cool = taco;
		int beans = tuesdays;
		
		System.out.println(cool + " multiplied by " + beans + " is " + rad);
		
		System.out.println("");
		
		String name = "James Buchanan";
		String address = "1600 Pennsylvania Ave NW"; 
		String city = "Washington, DC";
		String zip = "DC 20500";
		
		System.out.println(name + "\n" + address + "\n" + city + ", " + zip);
		
		System.out.println("");
		
		int length = 6;
		int width = 8; 
		int height = 3;
		int area = height * width * 2 + length * (2 * height + 2 * width);
		
		System.out.println("The surface area of your rectangle is " + area);
		
		
	}
	
}