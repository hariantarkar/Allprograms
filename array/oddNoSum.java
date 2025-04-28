import java.util.*;
public class oddNoSum
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]%2==1)
			{
			sum=sum+a[i];
			}
		}
		System.out.println("sum is odd no is:"+sum);
	}
}