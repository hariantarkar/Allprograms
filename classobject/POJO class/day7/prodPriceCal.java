import java.util.*;
public class prodPriceCal
{
	public static void main(String x[])
	{
	product p1[]=new product[2];
	productCatlog pc=new productCatlog();
	Scanner sc=new Scanner (System.in);
	for(int i=0;i<p1.length;i++)
	{
	System.out.println("enter product id  name  price");
	int id=sc.nextInt();
	String name=sc.nextLine();
	sc.nextLine();
	int price=sc.nextInt();
	p1[i]=new product();
	p1[i].setid(id);
	p1[i].setName(name);
	p1[i].setprice(price);
	}
	pc.setproduct(p1);
	
	pc.showpricecal();
	}
}