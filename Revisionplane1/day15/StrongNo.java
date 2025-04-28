//check strong no
import java.util.*;
public class StrongNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no :");
		int no=sc.nextInt();
		int rem,fact=1,i,sum=0;
		int temp;
		temp=no;
		
		while(no>0)
		{
			rem=no%10;

			for(i=1;i<=no;i++)
			{
				fact=fact*i;
			}
				no=no/10;
				sum=sum+fact;
		}
			if(no==sum)
			{
				System.out.println("no is strong :");
			}
			else
			{
				System.out.println("no is not strong :");
			}
	}
}
