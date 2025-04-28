class CarMileage
{
	private String model;	
	private int  milesdriven;
	private int fuel;
	private int fuelused;

	CarMileage()
	{
	}
	CarMileage(String model,int milesdriven,int fuel,int fuelused)
	{
	this.model=model;
	this.milesdriven=milesdriven;
	this.fuel=fuel;
	this.fuelused=fuelused;
	}
	void calculateMieage()
	{
	int temp;
	System.out.println(model+" \t"+milesdriven+"\t \t"+fuel+" \t"+fuelused);
	if(fuel>0)
	{
	temp=milesdriven/fuelused;
	System.out.println(" mileage calculation is: "+temp);
	}
	else
	{
		System.out.println("fuel is zero:");
	}
}
}
public class CarMileageApp
{
	public static void main(String x[])
	{
		CarMileage c1=new CarMileage("mh23",30,10,5);
		System.out.println("model\tmilesdriven\tfuel\tfuelused");
		c1.calculateMieage();
	}
}









