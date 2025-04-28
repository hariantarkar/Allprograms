import java.util.*;
public class NumDayPrint
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter 1 to 7 days :");
	int days=sc.nextInt();

	if(days<=7)
	{
	if(days==1)
	{
		System.out.println("day no is:1 monday");
	}
	if(days==2)
	{
		System.out.println("day no is:2 tusday");
	}
	if(days==3)
	{
		System.out.println("day no is:3 whensday");
	}
	if(days==4)
	{
		System.out.println("day no is:4 thousday");
	}
	if(days==5)
	{
		System.out.println("day no is:5 friday");
	}
	if(days==6)
	{
		System.out.println("day no is: 6 saturday");
	}
	if(days==7)
	{
		System.out.println("day no is: 7 sunday");
	}	
	}
	else
	{
		System.out.println("please enter a 1 to 7 num of day:");
	}
	}
}

