import java.util.*;
public class ComEleArray
{
	public static void main(String x[])
	{
		int a[]=new int[4];
		int b[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter a second array elements:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
				
					System.out.print(" "+a[i]);
				}
			}
		}
	}
}
