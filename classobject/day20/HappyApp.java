import java.util.*;
class HappyNo
{
	int i,sum=0,d,a;
void showHappNum(int no)
{
	for(i=no;i>9; )
	{
	for(a=i;a>0;a=a/10)
	{
	d=a%10;
	sum=sum+(d*d);
	}
	i=sum;
	}
	if(i==1)
	{
	System.out.println("No is Happy");
	}
	else
	{
	System.out.println("No Is Not Happy");
	}
}
}
public class HappyApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		HappyNo Happy=new HappyNo();
		Happy.showHappNum(num);
	}
}






