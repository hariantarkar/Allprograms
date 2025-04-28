class  Car
{
	private int speed;
	private int fuel;
	Car()
	{
		speed=60;
		fuel=50;
	}
	void drive()
	{
		System.out.println("fuel  :"+fuel);
		if(fuel > 10)
	{
		fuel=fuel-10;
		System.out.println("updated fuel is:"+fuel);
	}
	}
}
public class CarApp
{
	public static void main(String x[])
	{
		Car c1=new Car();
		System.out.println("first drive:");
		c1.drive();
		System.out.println("second drive:");
		c1.drive();
	}
}












