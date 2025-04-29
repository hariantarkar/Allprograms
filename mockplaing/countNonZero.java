// Count Non-Zero Digits
import java.util.*;
public class countNonZero
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		int rem,count=0;
		
		while(no > 0)
		{
			rem=no%10;
			if(rem != 0)
			{
				count++;
			}
			no=no/10;
			
		}
		System.out.println("Non-Zero Digits is:"+count);
	}
}

			