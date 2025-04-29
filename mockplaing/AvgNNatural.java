//Calculate Average of First N Natural Numbers
import java.util.*;
public class AvgNNatural
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		
		int sum=(no*(no+1)/2);
		
		float avg=(float)sum/no;
		
		System.out.println("Average of First N Natural Numbers is "+avg);
	}
}
