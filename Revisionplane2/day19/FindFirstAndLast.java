import java.util.*;
public class FindFirstAndLast
{
	public static void main(String x[])
	{
		int last=0,first;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		last=no%10;
		first=no;
		
		while(first>=10)
		{
			first=first/10;       
		}
		System.out.println("First is:   "+first+"   Last is:"+last); 
	}
}