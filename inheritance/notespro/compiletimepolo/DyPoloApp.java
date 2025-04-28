class Value
{
int a,b;
void setValue(int x,int y)
{
a=x;
b=y;
}
	int getResult()
	{
	return 0;
	}
}
class Add extends Value
{
	int getResult()
	{
		return a+b;
	}
}
class Mul extends Value
{
	int getResult()
	{
		return a*b;
	}
}
class calculator
{
void perfromshow(Add ad)
{
	int result=ad.getResult();
	System.out.println("result is:"+result);
}
	void perfromshow(Mul mt,String msg)
	{
		int result=mt.getResult();
		System.out.println("massage is :"+msg+result);
	}

}
public class DyPoloApp
{
	public static void main(String x[])
	{
		calculator c1=new calculator();
		Add a1=new Add();
		a1.setValue(1,5);
		c1.perfromshow(a1);
		Mul m1=new Mul();
		m1.setValue(90,2);
		c1.perfromshow(m1,"multi: ");

	}
}














