import java.util.*;
public class maxNo
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int i,max=a[0];
		Scanner sc=new Scanner(System.in);
		  for(i=0;i<5;i++)
	    	{
		    System.out.println("enter 5 element");
		      a[i]=sc.nextInt();
		    }
		     for(i=0;i<5;i++)
	         {
	            if(a[i]>max)
				{
					max=a[i];
				}
		     }
				System.out.println("max value is "+max);
				
	}
}