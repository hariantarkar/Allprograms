import java.util.*;
public class DigitSum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >='0' && ch<='9')
			{
				int ascii=(int)ch;
				int num=ascii-48;
				sum=sum+num;
			}
		}
		System.out.println("sum of digit is"+sum);
	}
}
