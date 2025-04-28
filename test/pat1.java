import java.util.*;
public class pat1 
{
	public static void main(String x[])
	{
	int i,j,no;//varible initilization.
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	 no=sc.nextInt();//input accept
		for(i=1;i<=9;i++)
		{
			for( j=1;j<=5;j++)
			{
			if(i==1&&j==5||i==2&&j==4||i==3&&j==3||i==4&&j==2)
			{
			System.out.printf(" 1 ");
			}
			else
			{
			System.out.printf("  ");
			}
			}
		System.out.println(" ");
		}
	}
}