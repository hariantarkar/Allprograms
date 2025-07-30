import java.util.*;
public class KthSmall
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
				if(a[i] > a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("enter a k value:");
		int k=sc.nextInt();
		int count=0;
			for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[i]+1)
				{
					count++;
				}
				if(count ==k)
				{
					System.out.println("Kth smallest element is "+a[i+1]);
					break;
				}
			}
		}
		
	}
}
