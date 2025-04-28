class A
{
	A()
	{
	System.out.println("I am parent constracter");
	}
}
class B extends A
{
	B()
	{
	System.out.println("I am chaild constarcter");
	}
}
public class firstApp
{
	public static void main(String x[])
	{
		B b1=new B();
	}
}