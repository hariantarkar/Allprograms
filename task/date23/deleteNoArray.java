import java.util.*;
public class deleteNoArray
{
	public static void main(String x[])
	{
         Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter element");
		int i;
		for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		int element,count=0,k;
		System.out.println("enter element to be delete");
	     element=sc.nextInt();
		for(i=0;i<a.length-count;i++)
		{
			if(a[i]==element)
			{
			count++;
			for(k=i;k<a.length-1;k++)
			a[k]=a[k+1];
			i--;
			}
		}
		System.out.println(" ");
		for(i=0;i<a.length-count;i++)
		System.out.println(" "+a[i]);
	}
}
		
		
