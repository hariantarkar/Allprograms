class Student 
{
	private String name;
	private int rollNumber;
	private int marks;
	
	Student(String name,int  rollNumber,int marks)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	void display()
	{
		System.out.println(name+" \t"+rollNumber+"\t "+marks);
		System.out.println("-----------------------");
		if(marks >40 )
		{	
			System.out.println("student is pass:");
		}
		else
		{
			System.out.println("student is not  pass:");
		}
	}
}
public class StudentApp
{
	public static void main(String x[])
	{
		Student s1=new Student("abc",1,50);
		System.out.println("name  rollnum  marks");
		System.out.println("-----------------------");

		s1.display();
	}
}
