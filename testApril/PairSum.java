import java.util.*;
public class PairSum
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter a array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int target=6;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j]) == target)
				{
					System.out.println("( "+(a[i]+","+a[j])+")");
				}
			}
		}
	}
}
