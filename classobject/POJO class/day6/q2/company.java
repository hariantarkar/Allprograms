class company
{
	private employee  emp[];
public void setEmployee(employee ...emp)
{
	this.emp=emp;
}
public void showEmployee()
{
for(int i=0;i<emp.length;i++)
{
System.out.println(emp[i].getid()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getcontact()+"\t"+emp[i].getAddress()+"\t"+emp[i].getsalary());
}
}
}
