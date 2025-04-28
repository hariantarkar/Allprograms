/*Write a Java program to reverse a number without using loop.
Input a number: 123
Reverse number: 321*/
import java.util.*;
public class RevApp
{
	public static void main(String x[])
	{
		int rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
	
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;

			rem=no%10;
			no=no/10;
			rev=rev*10+rem;

			rem=no%10;
			no=no/10;
			rev=rev*10+rem;

	
			System.out.println("Reverse no is:"+rev);
	}
}


