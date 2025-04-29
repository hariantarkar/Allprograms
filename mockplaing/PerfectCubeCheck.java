//Check for Perfect Cube
import java.util.*;
public class PerfectCubeCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		boolean p=false;
		
		for(int i=1;i<=no;i++)
		{
			if((i*i*i)==no)
			{
				p=true;
				break;
			}
		}
			if(p)
			{
				System.out.println("Num is perfect cube");
			}
			else
			{
				System.out.println("Num is not  perfect cube");
			}
	}
}
