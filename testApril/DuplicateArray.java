import java.util.*;
public class DuplicateArray
{
	public static void main(String x[])
	{
		int a[]=new int[7];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		System.out.print("Dupliacte array elements are:  ");	
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				
				if(a[i] == a[j] )
				{
					count++;
					System.out.print( " "+a[i]);	
				}
			}
		}
		 System.out.println("   duplicate element count  is "+count);
	}
}
