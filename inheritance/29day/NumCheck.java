class noCheck
{
	private int a;
	private int b;
	public noCheck(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
		public void show()
		{
		if(a>b)
		{
			System.out.println(" a is grater:");
		}
		else if(a<b)
		{
			System.out.println("b is grater :");
		}
			else
			{
				System.out.println("both are equals:");
			}
		}
}
public class NumCheck
{
	public static void main(String x[])
	{
		noCheck n1 = new noCheck(10,9);
		n1.show();
	}
}















