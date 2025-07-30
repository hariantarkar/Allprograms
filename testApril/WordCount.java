import java.util.*;
public class WordCount
{	
	public static void main(String x[])
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter words:");
		String str=sc.nextLine();
		int count=0;
		boolean word=false;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch !=' ' && !word )
			{
				word=true;
				count++;
			}
			else if(ch == ' ')
			{
				word = false;
			}
		}
		System.out.println(count);
	}
}

