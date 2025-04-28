class Person
{
	private String name;
	private int age;
	
	public void setName(String n)
	{
	name=n;
	}
	public	String getName()
	{
	return name;
	}
   public void setAge(int ag)
  {
	age=ag;
  }
  public int getAge()
  {
	return age;
  }
}
public class VoteEligibleCheck
{
	public static void main(String x[])
	{
	Person p1=new Person();
	p1.setName("xyz");
	System.out.println("person name is"+p1.getName());
	p1.setAge(20);
	int age=p1.getAge();
	if(age>=18)
	{
	System.out.println(" person is Eligible for vote ");
	}
	else
	{
	System.out.println(" person is not Eligible  for vote");
	}
	}
}












