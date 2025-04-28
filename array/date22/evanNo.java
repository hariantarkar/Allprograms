import java.util.*;
public class evanNo
{
	public static void main(String x[])
	{
	    int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
			System.out.println("evan no is "+a[i]);
			}
		}
	}
}