import java.util.*;
public class ReplaceOccurr
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String str=sc.nextLine();
		
		System.out.println("enter a character to replace:");
		char toreplace=sc.next().charAt(0);

		System.out.println("enter the replacement character :");
		char replace=sc.next().charAt(0);
		
		String result="";
	
		for(int i=0;i<str.length();i++)
		{
			char currentChar=str.charAt(i);
			
			if(currentChar == toreplace)
			{
				result +=replace;
			}
			else
			{
				result += currentChar;
			}
		}
		System.out.println(" "+result);
	}
}
	