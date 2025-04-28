import java.util.*;
public class ElementSum
{
	public static void main(String x[])
	{
	int a[]=new int[5];
	int i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter 5 element");
		for(i=0;i<5;i++)
		{	
			System.out.println("enter a no:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("sum of element is:"+sum);
	}
}
	
	