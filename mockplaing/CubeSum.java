import java.util.*;
public class CubeSum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		int rem,sum=0;
		
		for(int i=1;i<=no;i++)
		{
			
			sum=sum+(i*i*i);
		}
		System.out.println("Cube sum is : "+sum );
		
	}
}
