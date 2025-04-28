import java.util.*;
public class valueDislpay
{
	public static void main(String x[])
	{
	    int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter 5 element");

		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array element is");
		for(i=0;i<5;i++)
		{
		System.out.print(" "+a[i]);
		}
	}
}