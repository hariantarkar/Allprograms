import java.util.*;
public class SumOfAllNatNo
{
	public static void main(String x[])
	{
		int i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		
		while(i<=no)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(" "+sum);
     
	}
}
