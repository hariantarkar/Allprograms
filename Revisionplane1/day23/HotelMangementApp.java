import java.util.*;
class staff
{
	private int staffID;
	private String name;
	private int role;
	private int salary;
public void setid(int staffID)
{
	this.staffID=staffID;
}
public int getid()
{
	return staffID;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setrole(int role)
{
	this.role=role;
}
public int getrole()
{
	return role;
}
public void setsalary(int salary)
{
	this.salary=salary;
}
public int getsalary()
{
	return salary;
}
}
class HotelMangement
{
	private staff st[];
	public void setStaff(staff st[])
	{
		this.st=st;
	}
		void display()
		{
			for(int i=0;i<st.length;i++)
			{
				System.out.println(st[i].getid()+"\t "+st[i].getName()+
				"\t "+st[i].getrole()+"\t "+st[i].getsalary());
			}
			int temp=0;
			for(int i=0;i<st.length;i++)
			{
				temp=temp+st[i].getsalary();
			}
			System.out.println("total sal is :"+temp);
		}
}
public class HotelMangementApp
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	staff s1[]=new staff[2];
	HotelMangement h1=new HotelMangement();
	System.out.println("enter id and name and role and salary:");
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=new staff();
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int role=sc.nextInt();
			int sal=sc.nextInt();
			s1[i].setid(id);
			s1[i].setName(name);
			s1[i].setrole(role);
			s1[i].setsalary(sal);
		}
			h1.setStaff(s1);
			System.out.println("id name role salary: ");
			System.out.println("----------------------------------------:");
			h1.display();
	}
}












