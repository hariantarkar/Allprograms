import java.util.*;
class primeNo
{
	boolean isprime(int num)
	{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num % i==0)
		{
			count++;
		}
	}
	return count==2;
	}
}
public class primeNum1
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int num=sc.nextInt();

		primeNo p1=new primeNo();
		boolean b=p1.isprime(num);
		if(b)
		{
			System.out.println("num is prime:");
		}
		else
		{
			System.out.println("num is not prime:");
		}
	}
}








