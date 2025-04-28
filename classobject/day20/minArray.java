import java.util.*;
 class min
{
	
	
void showMin(int b[])
{
	int mi=b[0];
		    for(int i=0;i<5;i++)
	         {
	            		if(b[i]<mi)
				{
					mi=b[i];
				}
		     }
				System.out.println("max value is "+mi);
				
}
}

public class minArray
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
		min m=new min();
		m.showMin(a);
	}
	
}
	

	
