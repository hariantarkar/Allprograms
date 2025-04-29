import java.util.*;
public class RevNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int no=sc.nextInt();
		int rem,rev=0;
		
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
			System.out.println("Reverse no is :"+rev);
	}
}

			