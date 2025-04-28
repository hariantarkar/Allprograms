import java.util.*;
public class InventoryManagmentProject
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	owner o1=new owner();
	
	shop s1=new shop();
	
	employee e[]=new employee[2];
	for(int i=0;i<e.length;i++)
	{
	e[i]=new employee();
	System.out.println("enter employee  name and id and salary and presentDay:");
	String  n=sc.nextLine();
	int ie=sc.nextInt();
	int sal=sc.nextInt();
	int day=sc.nextInt();
	e[i].setName(n);
	e[i].setid(ie);
	e[i].setsalary(sal);
	e[i].setpresentDay(day);
	sc.nextLine();
	}

	product p1[]=new product[2];
	for(int i=0;i<p1.length;i++)
	{
	p1[i]=new product();
	System.out.println("enter product name and id and  price and qty:");
	String  n=sc.nextLine();
	int is=sc.nextInt();
	int pr=sc.nextInt();
	int qt=sc.nextInt();
	p1[i].setName(n);
	p1[i].setid(is);
	p1[i].setprice(pr);
	p1[i].setqty(qt);
	sc.nextLine();
	}
	
	s1.setemployee(e);
	s1.setproduct(p1);

	o1.setshop(s1);

	System.out.println("---------Employees list---------");
	o1.showemployees();
	System.out.println("_______Product list_________");
	o1.showproduct();
	
	System.out.println("Show Employee Record with Bonus Salary");
     	o1.creditSal();
        System.out.println("Show products bill with discount amount");
        o1.showProdDetailsWithDiscount();




}
}









	