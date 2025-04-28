import java.util.*;
public class arrayNumRev
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
			for(i=0;i<5;i++)
			  {
				System.out.println("enter  5 element");
				a[i]=sc.nextInt();
			  }
			System.out.println("given array");
			for(i=0;i<5;i++)
	      	System.out.println("\t"+a[i]);
			
			for(i=0,j=a.length-1;i<a.length/2;i++,j--)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		System.out.println("revers array is");
		for(i=0;i<5;i++)
		{
		System.out.println("\t"+a[i]);
		}


	}
}
		
