import java.util.*;
public class MissNo
{
	public static void main(String x[])
	{
		int a[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max=a[i];
			}
		}
		System.out.print("missing element are:");
		/*for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(" "+j);
			}
		}*/
		
		for(int i=1;i<=max;i++)
		{
			boolean miss=false;
			
			for(int j=0;j<a.length;j++)
			{
				if(a[j] == i)
				{
					miss=true;
				}
			}
			if(!miss)
			{
				System.out.print(" "+i);
			}
		}
	}
}
