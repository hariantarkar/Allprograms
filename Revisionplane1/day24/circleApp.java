class circle
{
	private int radius;
	circle(int radius)
	{
	this.radius=radius;
	}
		void display()
		{
		double temp;
		double pi=3.14;
		temp=2*pi*radius;
		System.out.println("circumference of circle is:"+temp);
		}
}
public class circleApp
{
	public static void main(String x[])
	{
		circle c1=new circle(3);
		c1.display();
	}
}
