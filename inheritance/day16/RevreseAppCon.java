//Q1. Write a java program to create class name ReverseApp using contsructor name as :
import java.util.*;
class ReverseApp
{
int a;
ReverseApp(int a)
{
}
	void setA()
	{
		this.a=a;
	}
		void show()
		{
		int rem,rev=0;
			while(a!=0)
			{
				rem=a%10;
				a=a/10;
				rev=rev*10+rem;
				}
				System.out.println("revrese no is:"+rev);	
			}
		}
public class RevreseAppCon
{
	public static void main(String x[])
	{
		ReverseApp r1=new ReverseApp();
		r1.setA(35);
		r1.show();
	}
}













