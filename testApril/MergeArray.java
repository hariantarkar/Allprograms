import java.util.*;
public class MergeArray
{
	public static void main(String x[])
	{
		int a[]=new int[3];
		int b[]=new int[3];
		
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
		int merge[]=new int [a.length+b.length];
		
			for(int i=0;i<a.length;i++)
			{
				merge[i]=a[i];
			}
		for(int j=0;j<b.length;j++)
		{
			merge[a.length+ j]=b[j];			
		}
		for(int m=0;m<merge.length;m++)
		{
			System.out.print(" "+merge[m]);
		}
		
	}
}
