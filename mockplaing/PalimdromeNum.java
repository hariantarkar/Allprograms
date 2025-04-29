import java.util.*;
public class PalimdromeNum
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number :");
	int no=sc.nextInt();
	int rem,rev=0;
	int temp=no;
	while(no!=0)
	{
		rem=no%10;
		no=no/10;
		rev=rev*10+rem;
	}
	if(rev==temp)
	{
	System.out.println("no is palimdrome:");
	}
	else
	{
	System.out.println("no is not palimdrome:");
	}
	}
}

	