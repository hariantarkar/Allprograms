import java.io.*;
class Employee implements Serializable
{
    private static final long serialVersionUID = 1L;
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
	public void setSal(long sal)
	{
		this.sal=sal;
	}
	public long getSal()
	{
		return sal;
	}
}
public class ObjDSerApp
{
	public static void main(String x[])throws Exception
    {
		FileInputStream fin =new FileInputStream("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\first.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		Object obj =oin.readObject();
		if(obj != null)
		{
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}
			else
			{
			   System.out.println("no data");
			}
			oin.close();
			fin.close();
		
    }
}
			   
		
		

		