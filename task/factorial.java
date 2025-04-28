import java.util.*;
public class factorial
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int n,fact=1;
	n=sc.nextInt();
	while(n!=0)
	{
	fact=fact*n;
	n--;
	}
	System.out.println("factorialno is "+fact);
	}
}


