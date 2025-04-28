class Driver
{
private CalOverTimeEmp emp[];
public void setEmployee(CalOverTimeEmp emp[])
{
this.emp=emp;
}
void OverTime()
{
int a=emp.showOvertimepay();
System.out.println("overtime pay is:"+a);
}
}