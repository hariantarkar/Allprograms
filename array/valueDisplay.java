import java.util.*;
public class valueDisplay
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
		System.out.println("givan array element is ");
		for(i=0;i<5;i++)
		{
		System.out.println("   "+a[i]);
		}
	}
}
		
		