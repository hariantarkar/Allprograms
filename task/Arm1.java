import java.util.*;
public class Arm1
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int rem,i,arm=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		temp=a[i];
		while(a[i]>0)
		{	for(i=0;i<a.length;i++)
			{
			rem=a[i]%10;
			arm=(arm*rem*rem)+arm;
			a[i]=a[i]/10;
			}
		}
		if(temp==arm)
		{
			System.out.println("NO is ARMSTRONG");
		}
		else
		{
			System.out.println("NO is Not ARMSTRONG");
		}
	}
}