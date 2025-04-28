import java.util.*;
class Customer
{	private int id;
	private String name;
	private int mobile;
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
 		return id;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}  
public void setMobile(int mobile)
{
	this.mobile=mobile;
}
public int getMobile()
{
	return mobile;
}
}
class product 
{
	 private int id;
	private String name;
	private int qty;
	private int rate;
	private int total;
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setName(String name)
{
 	this.name=name;
}
public String getName()
{
	return name;
}
public void setqty(int qty)
{
	this.qty=qty;
}
public int getqty()
{
	return qty;
}
public void setrate(int rate)
{
	this.rate=rate;
}
public int getrate()
{
	return rate;
}
public void settotal(int total)
{
	this.total=total;
}
public int gettotal()
{
	return total;
}
}
class bill
{
	private Customer c;
	private product []p;
public void setcalBill(Customer c)
{
	this.c=c;

}
public void setprBill(product ...p)
{
	this.p=p;

}

public void showcalBill()
{	
	System.out.println("Customer Id:"+c.getId());
	System.out.println("Customer Name:"+c.getName());
	System.out.println("Mobile:"+c.getMobile());
	System.out.println("                                           ");
	
	for(int i=0;i<p.length;i++)
	{
	System.out.println("id: name :qty: rate:  total:");   
	System.out.println(p[i].getId()+"   "+p[i].getName()+"    "+p[i].getqty()+"   "+p[i].getrate()+"     "+p[i].gettotal());
	
	System.out.println("                  complete: ");
	System.out.println("--------------------------------------------------------------- ");

	}
}
}
public class BillApplication
{
	public static void main(String x[])
	{
	int a[]=new int[2];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customer id  and mobileand name");
	int ie=sc.nextInt();
	int mo=sc.nextInt();
	String n=sc.nextLine();
		//sc.nextLine();

	Customer c1=new Customer();
	c1.setId(ie);
	c1.setName(n);
	c1.setMobile(mo);
	sc.nextLine();

	product pr=new product();
	int qt,rates;
	for(int i=0;i<a.length;i++)
	{
	//pr[i]=new product();
	System.out.println("enter product nameand id and qty and rate ");
	String names=sc.nextLine();
	int ide=sc.nextInt();
	 qt=sc.nextInt();
	 rates=sc.nextInt();
	//int totals=sc.nextInt();
	//sc.nextLine();

	pr.setId(ide);
	pr.setName(names);
	pr.setqty(qt);
	pr.setrate(rates);
	int totals=qt*rates;
	pr.settotal(totals);
	sc.nextLine();
	}
	bill b1=new bill();
	b1.setcalBill(c1);
	b1.setprBill(pr);
	b1.showcalBill();
}
}

		









