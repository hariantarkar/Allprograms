import java.util.*;
public class  multiTable 	
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter anum:");
		int num=sc.nextInt();
		int temp=1;
		for(int i=1;i<=10;i++)
		{
			temp=num*i;
			System.out.println(" "+temp );
		}
	}
}

		