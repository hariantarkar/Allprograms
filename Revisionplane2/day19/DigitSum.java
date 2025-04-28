import java.util.*;
public class DigitSum
{
	public static void main(String x[])
	{
		int i=1,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		
		while(no>0)
		{
			temp=no%10;
			sum=sum+temp;
			no=no/10;       
		}
		System.out.println(" digit sum is :"+sum); 
	}
}