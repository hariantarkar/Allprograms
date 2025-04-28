class employee
{
private String name;
private String addres;
private int id;
private int salary;
  public void setName(String n)
   { 
	name=n;
   }

public String getName()
{
	return name;
}
public void setAddres( String add)
{
	addres=add;
}
public String getAddres()
{
	return addres;
}
public  void setid(int i)
{
	id=i;
}
public int getid()
{
	return id;
}
public void setsalary(int s)
{
	salary=s;
}
public int getsalary()
{
 return salary;
}
}
class Company
{
	private employee emp;
	public void setempDet(employee empl)
	{
	emp=empl;
	}
	public void showEmployeeD()
	{	

		System.out.println("employee name is  "+emp.getName());
		System.out.println("employee adsress is  "+emp.getAddres());
		System.out.println("employee id is "+emp.getid());
		System.out.println("Employee salary is "+emp.getsalary());
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
	employee em1=new employee();
	em1.setName("xyz");
	em1.setAddres("Pune");
	em1.setid(1);
	em1.setsalary(10000);
	
	Company com=new Company();
	com.setempDet(em1);
	com.showEmployeeD();
	}
}













