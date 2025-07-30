import java.util.*;
public class SecondLargest
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
				System.out.println( " "+a[i]);
		}
		System.out.println("Second Largest element is:"+a[1]);
		
	}
}
