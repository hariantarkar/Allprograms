//Demonstrate the difference between parseInt() and valueOf() using Integer wrapper class.
public class DiffParseAvalueOf
{
	public static void main(String x[])
	{
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println("using a parseInt method:"+a);
		
		a=Integer.valueOf(s);
		System.out.println("using a valueOf method:"+a);
	}
}
