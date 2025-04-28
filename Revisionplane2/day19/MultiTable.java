import java.util.*;
public class MultiTable
{
	public static void main(String x[])
	{
		int i=1,table;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		
		while(i<=no)
		{
			table=i*no;
			System.out.println(" Table is :"+table);
			i++;
		} 
	}
}
