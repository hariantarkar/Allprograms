class NameAndId
{	
	private int id;
	private string name;
	void setId(int i)
	{
	id=i;
	}
	void getId()
	{
	return id;
	}
	void setName(string n)
	{
	name=n;
	}
	void getName()
	{
	return name;
	}
}
public class PojoApp
{
	public static void main(String x[])
	{
		NameAndId ni=new NameAndId();
		ni.setId(1);
		int empid=ni.getId();
		ni.setName("xyz");
		int empName=ni.getName();
		System.out.println("emo id:"+empid);
		System.out.println("emp name"+empName);
	}
}