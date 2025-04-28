import java.util.*;
class fooditem
{	
	private String name;
	private int price;
	private int qty;
	private int cal;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return  name;
}  
public void setprice(int price)
{
	this.price=price;
}
public int getprice()
{
	return price;
}
public void setqty(int qty)
{
       this.qty=qty;
}
public int getqty()
{
	return qty;
}
public void setcal(int cal)
{
	this.cal=cal;
}
public int getcal()
{
	return cal;
}
}
public class FoodDetails
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter food name price and calories and qty");
	String fname=sc.nextLine();
	int prices=sc.nextInt();
	int cals=sc.nextInt();
	int qtys=sc.nextInt();
	fooditem fi=new fooditem();
	fi.setName(fname);
	fi.setqty(qtys);
	fi.setprice(prices);
	fi.setcal(cals);
	System.out.println("food name  :"+fi.getName());
	System.out.println("food price  :"+fi.getprice());
	System.out.println("food kg  :"+fi.getqty());
	int total=qtys=fi.getqty();
	total=qtys*prices;
	System.out.println("food multiple items total price  :"+total);
	System.out.println("food cal  :"+fi.getcal());
	
	
}
}

		









