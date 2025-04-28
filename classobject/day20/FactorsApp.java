import java.util.*;
class Factors
{

void showFactors(int no)
{
	for(int i=2;i<no;i +=1)
	{
	while(no%i==0)
	{
	no=no/i;
	System.out.println(i);
	}
	}
}
}
public class FactorsApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		Factors f=new Factors();
		f.showFactors(num);
	}
}