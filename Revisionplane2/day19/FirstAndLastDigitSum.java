import java.util.*;
public class FirstAndLastDigitSum
{
	public static void main(String x[])
	{
		int last=0,first,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		last=no%10;
		first=no;
		
		while(first>=10)
		{
			first=first/10;       
		}
			temp=first+last;
			System.out.println("First is:   "+first+"    Last is:"+last); 
			System.out.println("Sum of first and last digit:"+temp); 
	}
}
