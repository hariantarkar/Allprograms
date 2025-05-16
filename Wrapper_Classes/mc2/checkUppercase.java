//Convert a char to a Character object and check if it is an uppercase letter using the isUpperCase() method.
public class checkUppercase
{
	public static void main(String x[])
	{
		Character ch='a';
		
		if(Character.isUpperCase(ch))
		{
			System.out.println(ch+" uppercase latter:");
		}
		else
		{
			System.out.println(ch+" not uppercase latter:");
		}
	}
}
