// Sum of First N Divisible by 3
import java.util.*;
public class CalSumDivisibleBy
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		int count=0,sum=0,current=1;
		
		while(count < no)
		{
			if(current % 3 == 0)
			{
				sum=sum+current;
				count++;
				
			}
			current++;
		}
		System.out.println("Sum of First: "+no+" N Divisible by 3 is ="+sum);
	}
}
