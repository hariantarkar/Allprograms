import java.util.*;
public class PrimeNum
{
	public static void main(String x[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a num:");
	  int num=sc.nextInt();
	  
	  System.out.println("Prime number upto "+num+" ");
	for(int i=1;i<=num;i++)
	{
		int count= 0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		System.out.println(i+" ");
		}
	}
	}
}
	
		
		