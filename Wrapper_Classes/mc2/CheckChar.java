//Check whether a given character is a digit or a letter using the Character wrapper class methods.
import java.util.*;
public class CheckChar
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter input");
		char ch=sc.next().charAt(0);
		
		/*if(ch >='0' && ch <= '9' )
		{
			System.out.println(ch+" is digit:");
		}
		else if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
		{
			System.out.println(ch + " is letter:");
		}
		else
		{
			System.out.println(ch+" symbol:");
		}*/
		if(Character.isDigit(ch) )
		{
			System.out.println(ch+" is digit:");
		}
		else if(Character.isLetter(ch))
		{
			System.out.println(ch + " is letter:");
		}
		else
		{
			System.out.println(ch+" symbol:");
		}
	}
}
