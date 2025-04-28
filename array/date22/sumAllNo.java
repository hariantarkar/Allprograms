import java.util.*;
public class sumAllNo
{
	public static void main(String x[])
	{
	    int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0,i;
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
		    sum=sum+a[i];
		}
                System.out.println("sum of all element "+sum);
	}
}