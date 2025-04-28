import java.util.*;
public class MinNo//check
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		  for(i=0;i<5;i++)
	    	{
		    System.out.println("enter 5 element");
		      a[i]=sc.nextInt();
		    }
                 int min=a[0];
		     for(i=0;i<5;i++)
	         {
				if(a[i]<min)
				{
					min=a[i];
				}
		     }
				System.out.println("min value is "+min);
	}
}
