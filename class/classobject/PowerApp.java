import java.util.*;
class Power
{
	Scanner sc=new Scanner(System.in);
	int base,index;
	int p=1;
void setBaseIndex()
{
	System.out.println("enter base and index");
	base=sc.nextInt();
	index=sc.nextInt();
}
void showPower()
{
	for(int i=1;i<=index;i++)
	{
	p=p*base;
	}
	System.out.printf("power is %d\n",p);
}
}
public class PowerApp
{
	public static void main(String x[])
	{
		Power p1=new Power();
		p1.setBaseIndex();
		p1.showPower();
	}
}