import java.io.*;
class Employee implements Serializable
{
	private int id;
	private String name;
	private long sal;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
		
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public long getSal()
	{
		return sal;
	}
}
public class ObjSerApp
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fout =new FileOutputStream("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\first.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		
		Employee emp =new Employee();
		emp.setId(1);
		emp.setName("abc");
		emp.setSal(10000);
		
		oout.writeObject(emp);
		oout.close();
		System.out.println("save");
	}
}

		