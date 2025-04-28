public class prodPriceCal
{
	public void main(String x[])
	{
	product p1[]=new product[2];
	productCatlog pc=new productCatlog();
	Scanerr sc=new Scanner (System.in);
	System.out.println("enter product id  name  price");
	for(int i=0;i<p1.length;i++)
	{
	p1[i]=new product();
	p1[i].setid();
	p1[i].setName();
	p1[i].setprice();
	}
	pc.setproduct(p1);
	
	pc.showpricecal();
	}
}