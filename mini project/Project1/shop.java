class shop
{
	private product products[];
	private employee employees[];
public void setproduct(product pro[])
{
	this.products=pro;
}
public product[] getproducts()
{
	return products;
}
public void setemployee(employee employees[])
{
	this.employees=employees;
}
public employee[] getemployees()
{
	return employees;
}
	public employee[] getemployeeRecordWithBonusSalary()
	{
		for(int i=0;i<employees.length;i++)
		{
			int presenty=employees[i].getpresentDay();
			if(presenty>=30)
			{	
				int empcurrsal=employees[i].getsalary();
				int bonussal=empcurrsal*10/100;
				
				empcurrsal=empcurrsal+bonussal;
				employees[i].setsalary(empcurrsal);
			}
		}
		return employees;
	}
public product[] getBillWithDiscount()
{
	for(product all:products)
	{
	   int qty=all.getqty();
	  int rate=all.getprice();
	  int total=qty*rate;
	  if(total>500)
	  {
	    int discount=total*20/100; 
	  total=total-discount;
	  }
	all.setTotal(total);
	}
	return products;
}
}











