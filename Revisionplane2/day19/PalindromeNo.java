import java.util.*;
public class PalindromeNo
{
	public static void main(String x[])
	{
		int rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		int temp=no;

		while(no>0)
		{
			rem=no%10;
			no=no/10; 
			rev=rev*10+rem;      
		}
		if(temp==rev)
		{
			System.out.println("no is palindrome :");
		}
		else
		{
			System.out.println("no is not palindrome:");
		}
	}
}