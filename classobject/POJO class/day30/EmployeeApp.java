import java.util.*;
class Employee
{
    private int id;
	private String name;
	
	public void setId(int i)
	{ id=i;
	}
	public int getId()
	{ return id;
	}
	public void setName(String n)
	{ name=n;
	}
	public String getName()
	{ return name;
	}
}
public class EmployeeApp
{
   public static void main(String x[])
   {
       Employee emp[]=new Employee[5]; //array of reference
	   Scanner xyz = new Scanner(System.in);
	   for(int i=0;i<emp.length;i++)
	   {
		     emp[i]=new Employee();//array of objects
			 System.out.println("Enter name and id of employee");
			 String name=xyz.nextLine();
			 int id=xyz.nextInt();
			 emp[i].setName(name);
			 emp[i].setId(id);
			 xyz.nextLine();
	   }
	   System.out.println("Display employee data");
	   for(int i=0; i<emp.length;i++)
	   {
		    System.out.println(emp[i].getId()+"\t"+emp[i].getName());
	   }
}
}
