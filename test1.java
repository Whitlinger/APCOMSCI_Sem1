class test
{
	static int y;
	
	public void addition(int x)
	{
		y = 2*x + 1;
		System.out.println("2 * " + x + " + 1 = " + y);
	}
}

public class test1 extends test
{
	public static void main(String[]args)
	{
		test1 object = new test1();
		object.addition(2);
	}
}