//Find the largest number in an array.
import java.util.*;
public class FindLargNum
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
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > largest )
			{
				largest=a[i];
		
			}
		}
			System.out.println("largest number is:"+largest);
	}
}

