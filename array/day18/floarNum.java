import java.util.*;
public class floarNum
{
public static void main(String x[])
{
 	int a[]=new int[5];
	int i,j,temp,n,floar=0;
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
	floar=a[i];
	}
	if(a[i] == n)
	{
	floar=a[i];
	}
	if(a[0] > n)
	{
	floar=-1;
	}
	if(a[a.length-1] < n)
	{
	floar=a[a.length-1];
	}
	}System.out.println("floar is:"+floar);
}
}

	
	
		










