class Shop
{
	product p[];
	Customer cust;
	private int total,sum=0;

	void setproduts(product ...prod)	
	{
		p=prod;
	}
	void setCustomer(Customer c)
	{
		cust=c;
	}
	void showbill()
	{
		System.out.println("customer id:"+cust.getCid()+
		"\t  name:"+cust.getCName()+"\t address:  "+cust.getAddress());
		System.out.println("____________________________________________________________________");

		System.out.println("pid \t\tpname\t\t  qty \t\t price\t\t total ");
		for(int i=0;i<p.length;i++)
		{

			total=p[i].getqty()*p[i].getprice();
			System.out.println(p[i].getId()+" \t\t"+p[i].getName()+
			" \t\t"+p[i].getqty()+"\t\t "+p[i].getprice()+"\t\t"+total);
			sum=sum+total;
		}
		System.out.println("____________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t  grand total"+sum);
	}
}












