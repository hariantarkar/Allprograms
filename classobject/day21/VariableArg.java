import java.util.*;
class SumVaiArg
{
	int sum=0,i;
void CalSum(int ...x)
{
	for(i=0;i<x.length;i++)
	{
	sum=sum+x[i];
	}
	System.out.println("sum is :"+sum);
}
}
public class VariableArg
{
	public static void main(String ...x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int b=sc.nextInt();
		int c=sc.nextInt();
		SumVaiArg s1=new SumVaiArg();
		s1.CalSum(b,c);
	}
}

