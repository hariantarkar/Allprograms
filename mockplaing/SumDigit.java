import java.util.*;
public class SumDigit
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num:");
	int num=sc.nextInt();
	int rem,sum=0;
	
	for(int i=0;i<=num;i++)
	{
		rem=num%10;
		sum+=rem;
		num=num/10;
	}
		System.out.println("sum of Digit is:"+sum);
	}
}
	