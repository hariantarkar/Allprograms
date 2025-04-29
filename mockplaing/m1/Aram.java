import java.util.*;
public class Aram
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a num:");
		int num=sc.nextInt();
		int temp=num;
		int rem,arm=0;
		
		while(num > 0)
		{
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(temp==arm)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}
}
