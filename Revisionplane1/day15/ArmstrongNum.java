import java.util.*;
public class ArmstrongNum
{
	public static void main(String x[])
	{
		int no,temp,arm=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextInt();
		temp=no;

		while(no!=0)
		{
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		if(temp==arm)
		{
			System.out.println("NO is Armstrong:");
		}
		else
		{
			System.out.println("no is not Armstrong:");
		}
	}
}