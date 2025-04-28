import java.util.*;
public class maxMinNo//check
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
			int  min=a[0];
		     for(i=0;i<5;i++)
	           {
	            if(a[i]>max)
				{
					max=a[i];
				}
				if(min>=a[i])
				{
					min=a[i];
				}
		     }
				System.out.println("max value is "+max);
				System.out.println("min value is "+min);
	}
}