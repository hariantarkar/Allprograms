class Vehicles
{
	private String  Vmodel;
	private String  VRegnumber;
	private double Vspeed;
	private double Fuelcapacity;
	private double Fuelconsumption;
Vehicles()
{
}
 Vehicles(String Vmodel,String VRegnumber,double Vspeed,double Fuelcapacity,double  Fuelconsumption)
{
	this.Vmodel=Vmodel;
	this.VRegnumber= VRegnumber;
	this.Vspeed=Vspeed;
	this.Fuelcapacity=Fuelcapacity;
	this.Fuelconsumption=Fuelconsumption;

}
public void setVmodel(String Vmodel)
{
	this.Vmodel=Vmodel;
}
public String  getVmodel()
{
	return Vmodel;
}
public void setVRegnumber(String VRegnumber)
{
	this.VRegnumber=VRegnumber;
}
public String getVRegnumber()
{
	return VRegnumber;
}
public void setVspeed(double Vspeed)
{
	this.Vspeed=Vspeed;
}
public double getVspeed()
{
	return Vspeed;
}
public void setFuelcapacity(double Fuelcapacity)
{
	this.Fuelcapacity=Fuelcapacity;
}
public double getFuelcapacity()
{
	return Fuelcapacity;
}
public void setFuelconsumption(double Fuelconsumption)
{
	this.Fuelconsumption=Fuelconsumption;
}
public double getFuelconsumption()
{
	return Fuelconsumption;
}
public double getfuelNeeded(double distance)
{
        return distance / Fuelconsumption;
}
public double distanceCovered(double time)
{
	return Vspeed * time;
}
 void display()
{
System.out.println(" Vehicle model is:"+ Vmodel);
System.out.println("Vehicle Registration number:"+VRegnumber);
System.out.println(" Vehicle speed  is:"+Vspeed+"   :km/hour");
System.out.println("Fuel capacity  is:"+Fuelcapacity+"  :liters");
System.out.println("Fuel consumption is:"+Fuelconsumption+" kilo meter/liter");
}
}
class Truck extends Vehicles
{
Truck()
{
}
private double Cargoweightlimit; 
Truck(String Vmodel,String VRegnumber,double Vspeed,double Fuelcapacity,double  Fuelconsumption,double Cargoweightlimit)
{
super(Vmodel,VRegnumber,Vspeed,Fuelcapacity,Fuelconsumption);
this.Cargoweightlimit=Cargoweightlimit;
} 
public void setCargoweightlimit(double Cargoweightlimit)
{
this.Cargoweightlimit=Cargoweightlimit;
}
public double getCargoweightlimit()
{
	return Cargoweightlimit;
}
public void display()
{
super.display();
System.out.println("Cargo weight limit:"+ Cargoweightlimit +"   :Kilo grams");
}
}
class Bus extends Vehicles
{
private int No_of_passengers;
Bus(String Vmodel,String VRegnumber,double Vspeed,double Fuelcapacity,double  Fuelconsumption,int  No_of_passengers)
{
super(Vmodel,VRegnumber,Vspeed,Fuelcapacity,Fuelconsumption);
this.No_of_passengers=No_of_passengers;
}
public void setNopassengers(int No_of_passengers)
{
this.No_of_passengers=No_of_passengers;
}
public int getNopassengers()
{
return No_of_passengers;
}
public void display()
{
super.display();
System.out.println("no of passenger is:"+No_of_passengers);
}
}
public class TransportApplication
{
public static void main(String x[])
{

Truck t1=new Truck();//("Vol MH23", "AB123", 80, 400, 5, 2000);
t1.setVmodel("mh23beed");
t1.setVRegnumber("xyz43");
t1.setVspeed(90);
t1.setFuelcapacity(500);
t1.setFuelconsumption(6);
t1.setCargoweightlimit(1000);
System.out.println("--------------->: Truck Details :<-------------");
t1.display();
System.out.println(" fuel Needed is 40:"+t1.getfuelNeeded(40)+"   :in kilo miters");
System.out.println("distance coverd in 3 housre:"+t1.distanceCovered(3)+"    :kilo meter");



 Bus b1 = new Bus("school model", "abc56", 60, 200, 6, 30);
System.out.println("----------------------------------------------------");
System.out.println("---------------->: Bus details :<-----------------");
b1.display();
System.out.println("fuel Needed is 20: "+b1.getfuelNeeded(20)+"    :in kilo meters");
System.out.println("distance coverd in 2 housre:"+t1.distanceCovered(2)+"   :kilo meter");
}
}


















