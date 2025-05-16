//Write a program that takes 3 strings (e.g., "100", "200", "300"), converts them to integers using Integer.parseInt(), and prints their sum.
public class StringToIntSum
{
	public static void main(String x[])
	{
		String s="100,200,300";
		String str[]=s.split(",");
		int sum=0;
		for(String s1:str)
		{
			int no=Integer.parseInt(s1);
			sum=sum+no;
		}
		System.out.println("sum is :"+sum);
		
	}
}
