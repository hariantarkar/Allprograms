import java.util.*;
public class maxArray
{
	public static void main(String x[])
	{
	   int a[]=new int[5];
	   int i=0;
	   Scanner sc=new Scanner (System.in);
	   System.out.println("enter no");
	   for(i=0;i<a.length;i++)
	   a[i]=sc.nextInt();
	   int max=a[0];
	   for(i=0;i<a.length;i++)
	   {
		if(a[i]>max)
		max=a[i];
	   }
	    System.out.println("max no is"+max);
	}
}