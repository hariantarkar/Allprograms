abstract class T
{
 abstract void s1 ();
 abstract void s2();
 abstract void s3();
}
class ADP extends T
{
	void s1() { }
	void s2() { }
	void s3() { }
}
class 	T1 extends ADP
{
	void s1()
	{
		System.out.println("I required s1 method:");
	}
}
class T2 extends ADP
{
		void s2()
		{
				System.out.println("I required s2 method:");
		}
}
class T3 extends ADP
{
	void s3()
	{
	System.out.println("I requied s3 method:");
}
}

public class TestAbsMethodRuleApp
{
	public static void main(String x[])
	{
	T1 t1=new T1();
	t1.s1();
	
	T2 t2=new T2();
	t2.s2();

	T3 t3=new T3();
	t3.s3();
	}
}











