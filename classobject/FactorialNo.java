import java.util.*;
class Fact
{
	Scanner sc=new Scanner(System.in);
	int fact=1,no,i;
void setNo()
{
	System.out.println("enter no");
	no=sc.nextInt();
}
void DislpayFactorial()
{
	for(i=1;i<=no;i++)
	{
	fact=fact*i;
	}
	System.out.printf("factorial is%d\n",fact);
}
}
public class FactorialNo
{
	public static void main(String x[])
	{
		Fact f=new Fact();
		f.setNo();
		f.DislpayFactorial();
	}
}





