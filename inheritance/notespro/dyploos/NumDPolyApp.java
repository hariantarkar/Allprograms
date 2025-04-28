import java.util.*;
class Num
{
protected int no;
void setValue(int no)
{
this.no=no;
}
	int getResult()
	{
	return 0;
	}
}
class Reverse extends Num
{
	int rev=0,rem;
	int getResult()
	{
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		return rev;
	}
}
class countDigit extends Num
{
int count=0;
	int getResult()
	{
		while(no!=0)
		{
			no=no/10;
			++count;
		}
	return count;
	}
}
class factorial extends Num
{
int f=1;
	int getResult()
	{
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
		return f;
	}
}
class NumHelper
{
void operation(Num num)
{
	int result=num.getResult();
	System.out.println("result is"+result);
}
}
public class NumDPolyApp
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	System.out.println("enter num");
	int no=sc.nextInt();

	NumHelper NH=new NumHelper();
	Num n=null;
		switch(choice)
		{
			case 1:
				n=new Reverse();
				n.setValue(no);
				NH.operation(n);
			break;
			case 2:
				n=new countDigit();
				n.setValue(no);
				NH.operation(n);
			break;
			case 3:
				n=new factorial();
				n.setValue(no);
				NH.operation(n);
			break;
			default:
				System.out.println("wrong choice:");
		}
	}
}



























