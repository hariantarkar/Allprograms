import java.util.*;
 class evanOdd
{
	int i,evan,odd,count1=0,count2=0;
	
void showevanOdd(int b[])
{
	
		    for(int i=0;i<10;i++)
	            {
	            		if(b[i]%2==0)
				{
					count1++;
				//System.out.println("evan no is "+count1);
				}
				else
				{
				count2++;
				//System.out.println("odd no is "+count2);	

				}
		     }
				System.out.println("evan no is "+count1);
				System.out.println("odd no is "+count2);	
			
}
}

public class evanOddApp
{
	public static void main(String c[])
	{
		int a[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
	    	{
		    System.out.println("enter 10 element");
		      a[i]=sc.nextInt();
		}
		evanOdd ed=new evanOdd();
		ed.showevanOdd(a);
	}
	
}
	

