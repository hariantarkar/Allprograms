import java.util.*;
public class AllNatural
{
	public static void main(String x[])
	{
		int i=1,no;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a no:");
		no=sc.nextInt();
		while(i<=no)
		{  
			System.out.println(" "+i);
			i++;
		}
	}
}
