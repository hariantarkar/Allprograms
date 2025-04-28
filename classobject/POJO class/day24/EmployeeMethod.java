import java.util.*;
class Employee
{
	private String name;
	private int  salary;
	private int  sal;
	private String department;
public void setName(String n)
   { name=n;
   }
   public String getName()
   { return name;
   }
public void setSalary( int s)
{
	salary=s;
	sal=salary+(salary*10)/100;
}
	public int getSalary()
	{
	return salary;
	}
	public int getUpdateSalary()
	{
	return sal;
	}

public void setDeparment(String d)
{
	department=d;
}
	public String getDepartment()
	{
	return department;
	}
}
class EmployeeMethod
{
	public static void main(String	...x)
	{
	Scanner sc=new Scanner(System.in);
	/*System.out.println("enter a name");
	String names=sc.nextLine();
	sc.nextLine();
	System.out.println("enter a salary");
	int salaree=sc.nextInt();
	System.out.println("enter a department");
	String department=sc.nextLine();*/
	Employee emp=new Employee();
	emp.setName("xyz");
	emp.setSalary(1000);
	emp.setDeparment("abc");
	System.out.println("employee name is:"+emp.getName());
	System.out.println("employee old salary is:"+emp.getSalary());
	System.out.println("employee update salary is:"+emp.getUpdateSalary());
	System.out.println("employee department is:"+emp.getDepartment());
	}
}

