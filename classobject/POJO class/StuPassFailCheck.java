import java.util.*;
class Student
{
	private String name;
	private String Subject;
	private int mark;
	
	public void setName(String n)
	{
	name=n;
	}
	public	String getName()
	{
	return name;
	}
   public void setSubject(String s)
  {
	Subject=s;
  }
  public String getSubject()
  {
	return Subject;
  }
       public void setMark(int m)
	{
	mark=m;
	}
	public int getMark()
	{
	return mark;
	}
}
public class StuPassFailCheck
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	Student s1=new Student();	
	s1.setName("xyz");
	System.out.println("student name is :"+s1.getName());
	s1.setSubject("marathi");
	System.out.println("Student subject name :"+s1.getSubject());
	//System.out.println("enter a mark");
	//mark=sc.nextInt();
	s1.setMark(50);
	int mark=s1.getMark();
	if(mark>=40)
	{
	System.out.println("Student is pass");
	}
	else
	{
	System.out.println("Student is fail");
	}
	}
}




