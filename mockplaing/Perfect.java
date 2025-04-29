import java.util.*;
public class Perfect
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entera no:");
		int no=sc.nextInt();
		int sum=0;
		int temp=no;
		
		for(int i=1;i<=no/2;i++)
		{
			if(no%i==0)
			{
			sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
	}
}

