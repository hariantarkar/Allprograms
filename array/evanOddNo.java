import java.util.*;
public class evanOddNo
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(i%2==0)
			{
			System.out.println("no is evan");
			}
			else 
			{
			System.out.println("no is odd");
			}
		}
	}
}