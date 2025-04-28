class ElectricityBill
{
	private int id;
	private String name;
	private int unit;
	private int rate;
	
	ElectricityBill()
	{
	}
	ElectricityBill(int id,String name,int unit,int rate)	
	{
		this.id=id;
		this.name=name;
		this.unit=unit;
		this.rate=rate;
	}
	void diplayInfo()
	{
		System.out.println(id+" \t"+name+" \t"+unit+"\t"+rate);
	}
	void BillCal()
	{
	int amount;
	amount=unit*rate;
	System.out.println("customer bill amount is:"+amount);
	}
}
public class ElectricityBillApp
{
	public static void main(String x[])
	{
	ElectricityBill b1=new ElectricityBill(01,"abc",10,5);
	System.out.println("Customer :-");
	System.out.println("id\tname\tunit\t rate");
	b1.diplayInfo();
	b1.BillCal();
	}
}










