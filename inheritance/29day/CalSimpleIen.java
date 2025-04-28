class SimpleIen
{
	private int principle;
	private int rate;
	private int time;
	SimpleIen(int principle,int rate,int time)
	{	
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}
		public void show()
		{
			int temp=(principle*rate*time)/100;
			System.out.println("Simple intrest is:"+temp);
		}
}
public class CalSimpleIen
{
	public static void main(String x[])
	{
		SimpleIen s1=new SimpleIen(1000,4,2);
		s1.show();
	}
}










