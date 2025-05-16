//String buffer.
public class Demo
{
	public static void main(String x[])
	{
		StringBuffer str = new StringBuffer("Be");
		
		str.append("positive");
		System.out.println(str);
		str.insert(2,"smart:");
		System.out.println(str);
		str.delete(7,16);
		System.out.println(str);
		
		
	}
}
