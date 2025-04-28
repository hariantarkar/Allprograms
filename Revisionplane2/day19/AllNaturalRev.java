import java.util.*;
public class AllNaturalRev
{
	public static void main(String x[])
	{
		int no;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a no:");
		no=sc.nextInt();
		while( no>=1)
		{  
			System.out.println(" "+no);
			no--;
		}
	}
}
