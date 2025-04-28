import java.util.*;
public class CeilNum
{
public static void main(String x[])
{
 	int a[]=new int[5];
	int i,j,temp,n,ceil=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a element:");
	for(i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.println("enter a number :");
	n=sc.nextInt();

		for(i=0;i<a.length;i++)
   		{
                    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]>a[j])
		       {
		       temp=a[i];
		       a[i]=a[j];
		       a[j]=temp;
		       }
		    }
	        }
	for(i=0;i<a.length-1;i++)
	{
	if( a[i] < n && a[i+1] > n)
	{
	ceil=a[i+1];
	}
	if(a[i] == n)
	{
	ceil=a[i];
	}
	if(a[0] > n)
	{
	ceil=a[0];
	}
	if(a[a.length-1] < n)
	{
	ceil=-1;
	}
	}System.out.println("ceiling is:"+ceil);
}
}

	
	
		










