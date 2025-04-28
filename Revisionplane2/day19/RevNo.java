import java.util.*;
public class RevNo
{
	public static void main(String x[])
	{
		int rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			no=no/10; 
			rev=rev*10+rem;      
		}
			System.out.println("Reverse no  is: "+rev); 
	}
}
