
import java.util.*;
public class RevWord
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer((str+" "));
		String words[]=str.split(" ");
		System.out.println("Before reverse words is:   "+str);
		for(String word:words)
		{
			for(int i=(word.length()-1);i>=0;i--)
			{
				sb.append(word.charAt(i));
			}
			sb.append(" ");
			
		}
		str=sb.toString();
		System.out.println("After reverse words  is    : "+str);
		
	}
}
