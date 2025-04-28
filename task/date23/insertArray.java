import java.util.*;
public class insertArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[6];
		 System.out.println("enter 5 element");
		int i,value,index;
		 for(i=0;i<a.length-1;i++)
		 {
		 a[i]=sc.nextInt();
		 }
		 System.out.println("enter value and index to be inserted");
		 value=sc.nextInt();
		 index=sc.nextInt();
			for(i=a.length-1;i>index;i--)
			{
			a[i]=a[i-1];
			}
		a[index]=value;
		System.out.println(" ");
		   for(i=0;i<a.length;i++)
			System.out.println(" "+a[i]);		
	}
}





