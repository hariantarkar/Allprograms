import java.util.*;
public class KthElement
{
public static void main(String x[])
{
 	int a[]=new int[7];
	int i,j,k,temp,count=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a element:");
	for(i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.println("enter k value:");
	k=sc.nextInt();

		for(i=0;i<a.length;i++)
   		{
                    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]<a[j])
		       {
		       temp=a[i];
		       a[i]=a[j];
		       a[j]=temp;
		       }
		    }
	        }
	for(i=0;i<a.length;i++)
	{

	   System.out.print(" "+a[i]);

	}
	int flag=0;
	System.out.println(" ");
	for(i=0;i<a.length-1;i++)
	{	
		if(count==k)
		{
		flag=1;
		System.out.println(" "+a[i]);
		break;
		}
		if(a[i]!=a[i+1])
		{
		count++;
		}
	}
	if(flag==0)
	System.out.println(k+"Kth position value not available:");
}
}











			