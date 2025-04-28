class owner
{
	private shop shop;
public void setshop(shop shop)
{
	this.shop=shop;
}
public shop getshop()
{
	return shop;
}
public void showemployees()
{
	 employee employees[]=shop.getemployees();
for(int i=0;i<employees.length;i++)
{
System.out.println(employees[i].getid()+"\t "+employees[i].getName()+" \t"+employees[i].getsalary()+" \t"+employees[i].getpresentDay());
}
}
public void showproduct()
{
	product products[]=shop.getproducts();
for(int i=0;i<products.length;i++)
{
System.out.println(products[i].getid()+" \t"+products[i].getName()+ "\t "+products[i].getprice()+ " \t"+products[i].getqty());
}
}

public void creditSal()
{
employee emp[]=shop.getemployeeRecordWithBonusSalary();
for(employee e:emp)
{
System.out.println(e.getid()+"\t"+e.getName()+"\t"+e.getsalary());
}
}
public void showProdDetailsWithDiscount()
   {  product p[]=shop.getBillWithDiscount();
	for(product pp:p)
	{
	 System.out.println(pp.getid()+"\t"+pp.getName()+"\t"+pp.getqty()+"\t"+pp.getprice()+"\t"+ (pp.getqty()*pp.getprice())+"\t"+pp.getTotal());
	}

   }

}




