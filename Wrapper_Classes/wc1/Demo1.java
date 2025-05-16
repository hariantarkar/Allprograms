//String builder.
public class Demo1
{
	public static void main(String x[])
	{
		StringBuilder str = new StringBuilder("Be");
		
		str.append("smart");
		System.out.println(str);
		str.insert(2,"positive");
		System.out.println(str);
		str.delete(10,14);
		System.out.println(str);
		
		
	}
}

		