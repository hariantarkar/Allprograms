//Second Smallest and Second Largest element in an array
import java.util.*;
public class SecondLargNum
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a arrays elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max =a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{    if(a[i]>max)
			{	
				smax=max;
				max=a[i];
			}
			else if(a[i] > smax)
				smax=max;
			
		}
		System.out.println("second larg"+smax);
		
	}
}

