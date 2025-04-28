abstract class vehicle
{
abstract void engine();
}
	class Bike extends vehicle
	{
	void engine()
	{
	System.out.println("Bike engine 100 cc:");
	}
	}
class Car extends vehicle
{
	void engine()
	{
	System.out.println("Car engine 200 cc:");
	}
}

public class vehicleApp
{
		public static void main(String x[])
		{
			Car c=new Car();
			c.engine();
				Bike b=new Bike();
				b.engine();
		}
}










