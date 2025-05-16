//Check if a given character is a whitespace or not using Character.isWhitespace() method.
import java.util.*;
public class checkWhiteSpace
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter character:");
		char ch=sc.next().charAt(0);
		if(Character.isWhitespace(ch))
		{
			System.out.println("character is whitespace:");
		}
		else
		{
			System.out.println("character is not whitespace:");
		}
	}
}
