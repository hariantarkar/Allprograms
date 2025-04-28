class productCatlog
{
	private product products[];
public void setproduct(product products[])
{
	this.products=products;
}
	public void showproducts()
	{
		for(int i=0;i<products.length;i++)
		{
		System.out.println(products[i].getid()+"\t"+products[i].getName()+
		" \t"+products[i].getprice());
		}
	}
	public void showpricecal()
	{
	int total=0;

		for(int i=0;i<products.length;i++)
		{
			System.out.println("___ ____ ____ _____ ____ ____");
			total += products[i].getprice();
		}
		System.out.println("Total price:"+total);
	}
}