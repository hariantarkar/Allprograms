class product
{
private String name;
private int id;
private int price;
  public void setName(String n)
   { 
	name=n;
   }

public String getName()
{
	return name;
}
public  void setid(int i)
{
	id=i;
}
public int getid()
{
	return id;
}
public void setprice(int p)
{
	price=p;
}
public int getprice()
{
 return price;
}
}
class shop
{
	private product []prod;
	public void setprod(product ...pro)
	{
		prod=pro;
	}
public void showAllPro()
{	
	for(int i=0;i<prod.length;i++)
	{
	System.out.println(prod[i].getName()+" "+prod[i].getid()+" "+prod[i].getprice()+" ");
	}
}
}
public class productShowApp
{
	public static void main(String x[])
	{
	product p1=new product();
	p1.setName("xyz");
	p1.setid(1);
	p1.setprice(1000);
	
	product p2=new product();
	p2.setName("abc");
	p2.setid(2);
	p2.setprice(2000);

	shop s1=new shop();
	s1.setprod(p1,p2);
	s1.showAllPro();
	}
}













