//Take a numeric string input from the user (like "123.45"), convert it to a Double, multiply it by 2, and print the result.
public class StringToDouble
{
	public static void main(String x[])
	{
		String s="123.45";
		Double b=Double.valueOf(s);
		System.out.println(b);
		Double b1=b*2;
		System.out.println(" double input and multiply it by 2 : "+b1);
		
	}
}
