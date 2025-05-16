//Take a String input from the user (like "123"), convert it into an int using a wrapper class method  .
public class StringTOInt
{
	public static void main(String x[])
	{
		StringBuffer s= new StringBuffer("123");
		s.insert(3,"4");
		int a=Integer.parseInt(s.toString());
		System.out.println(a);
		
		
	}
}
