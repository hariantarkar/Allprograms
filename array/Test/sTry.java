import java.util.*;
public class sTry
{
	public static void main(String x[])
	{
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 no");
	for(int i=0;i<5;i++)
	{
	System.out.println("enter  no");
	a[i]=sc.nextInt();
	}
	int max=a[0];
	for(int i=0;i<5;i++)
	{
	if(a[i]>max)
	max=a[i];
	}
	System.out.println("max element is"+max);
	}
}