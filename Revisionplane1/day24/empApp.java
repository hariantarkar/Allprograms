class employee
{
	private  int empId;
	private String empName;
	private double salary;
	employee(int empId, String empName,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(empId+" \t"+empName+" \t"+salary);
		System.out.println("-------------------------");
		if(salary<50000)
		{
			double increment = salary * 0.10;
			salary=salary+increment;
			System.out.println("salary incremented is:"+salary);
		}
		else
		{
		System.out.println("salary not increment:");
		}	 
	}
}
public class  empApp
{
	public static void main(String x[])
	{
		System.out.println("-------------------------");
		employee e1=new employee(1,"abc",40000);
		e1.display();
	}
}

 