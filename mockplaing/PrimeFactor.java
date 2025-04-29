import java.util.*;
public class PrimeFactor
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ente a no:");
		int no=sc.nextInt();
	
		System.out.println("Prime Factor is:");
	
		while(no%2==0)
		{
			System.out.println(2+" ");
			no/=2;
		}
		for(int i=3;i<=no;i+=2)
		{
			if(no%i==0)
			{
				System.out.println(i+" ");
				no/=i;
			}
		}
		if(no > 2)
		{
			System.out.println(no);
		}
	}
}
