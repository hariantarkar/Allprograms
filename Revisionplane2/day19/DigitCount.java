import java.util.*;
public class DigitCount
{
	public static void main(String x[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		while(no>0)
		{
			no=no/10;
			count++;
		}
			System.out.println(" digit is :"+count); 
	}
}