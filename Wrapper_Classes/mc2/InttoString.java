//Use the toString() method of a wrapper class to convert a number into a string and show that it's now a string by concatenating with another string.
public class InttoString
{
	public static void main(String x[])
	{
		int a=123;
		String s =Integer.toString(a);
		System.out.println(s+" Type of "+s.getClass().getName());
		
		
	}
}
