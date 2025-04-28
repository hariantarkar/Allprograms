import java.util.*;
public class CalDigitProduct
{
	public static void main(String x[])
	{
		int i=1,temp,p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt();
		while(no>0)
		{
			temp=no%10;
			p=p*temp;
			no=no/10;       
		}
		System.out.println(" product of digit is  :"+p); 
	}
}