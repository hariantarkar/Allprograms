import java.util.*;
public class  FactNum
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num:");
	int num=sc.nextInt();
	
	int fact= 1;
	
	for(int i=1;i<=num;i++)
	{
		fact*=i;
	}
	System.out.println("FActorial: "+fact);
	}
}