import java.util.*;
public class CountDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int no=sc.nextInt();
		int count=0;
		
		while(no > 0)
		{
			no=no/10;
			count++;
		}
		System.out.println("Total digit is:"+count);
	}
}

		