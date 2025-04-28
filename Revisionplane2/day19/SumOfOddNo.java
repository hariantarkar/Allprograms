import java.util.*;
public class SumOfOddNo
{
	public static void main(String x[])
	{
		int i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		
		while(i<=no)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("odd num is 1 to n :"+sum);
	}
}