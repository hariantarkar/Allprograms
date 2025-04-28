class CalOverTimeEmp
   {
	int id;
	String name;
	int overtime;
	int totalwork;
	CalOverTimeEmp(int id,String name,int totalwork,int overtime)
			{
				this.id=id;
				this.name=name;
				this.totalwork=totalwork;
				this.overtime=overtime;
			}
		public int ShowSalary()
		{
		int sal=totalwork*200;
			return sal;
		}
						public int showOvertimepay()
						{
							if(overtime>0)
							{
								int cal=overtime*50;
								return cal;
							}
							else
							{
								return 0;
							}
						}
						public int totalsal()
						{
							int temp=(ShowSalary()+ showOvertimepay());
							return temp;
						}
								public void DisplayAllInfo()
								{
									System.out.println("id :"+id);
									System.out.println("name:"+name);
									System.out.println("salary is:"+ShowSalary());
									System.out.println("over time pay:"+showOvertimepay());
									System.out.println("total salary is:"+totalsal());
									System.out.println("overtime hourse:"+overtime);
								}
}
/*class Driver
{
private CalOverTimeEmp emp;
Driver ()
{
}
public void setEmployee(CalOverTimeEmp emp)
{
this.emp=emp;
}
void OverTime()
{
int a=emp.showOvertimepay();
System.out.println("overtime is:"+a);
}
}*/

public class EmployeeOverTimePay
{
	public static void main(String x[])
	{
	CalOverTimeEmp c1=new CalOverTimeEmp(1, "xy" ,300,10);
	c1.DisplayAllInfo();
	}
}
















