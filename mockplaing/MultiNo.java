// Multiplication of Numbers from 1 to N
import java.util.*;
public class MultiNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		int temp=0;
		
		for(int i=1;i<=no;i++)
		{
			temp=temp+(i*i);
		}	
		System.out.println("Multiplication of Numbers from 1 to N is"+temp);
	}
}

 