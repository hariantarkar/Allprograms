import java.util.*;
class Number
{
	private int num;
	Number()
	{
	}
	Number(int num)
	{
	this.num=num;
	}
	void show()
	{
		int count=0;
		for(int i=1;i<=num;i++)	
		{	
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Num is prime:");
		}
		else
		{
			System.out.println("Num is not prime:");
		}
	}
}
public class NumApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num :");
		int no=sc.nextInt();
		Number n1=new Number(no);
		n1.show();
	}
}







