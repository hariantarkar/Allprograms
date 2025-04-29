//Perfect Square Numbers Description: Write a program to find perfect square numbers up to n.
import java.util.*;
public class PerfectSqUpToN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ano: ");
		int no=sc.nextInt();
		
		System.out.println("perfect number square  up to "+no);
		for(int i=1;i*i<=no;i++)
		{
				System.out.print(" ->: "+( i*i ));	
			
		}
	}
}
