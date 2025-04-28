import java.util.*;
class GreatestNo
{
void showGreatest(int x,int y)
{	
	if(x>y)
	System.out.println("x is greater"+x);
	else if(y>x)
	System.out.println("y is greater"+y);
	else
	System.out.println("no is same");
}
}
public class GreatestApp
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter two no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	GreatestNo Gn=new GreatestNo();
	Gn.showGreatest(a,b);
	}
}
	
