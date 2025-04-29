import java.util.*;
public class SumSqNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			sum=sum+(i*i);
		}
		System.out.println("Sum of Squares of First N Natural Numbers: "+sum);
		
	}
	
}
