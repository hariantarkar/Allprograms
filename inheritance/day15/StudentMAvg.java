class Student
{
	private int rollNum;
	private String name;
	private int marks[];
public Student(int rollNum,String name,int []marks)
{
	this.rollNum=rollNum;
	this.name=name;
	this.marks=marks;
}
	public int showCalculet()
	{
		int total=0;
		for(int mark: marks)
		{
			total=total+mark;
		}
		return total;
	}
public int calAvrage()
{
	int temp=0;
	temp=showCalculet()/marks.length;
	return temp;
}
public void AllDetails()
{
	System.out.println("stu roll num :"+rollNum);
	System.out.println("stu name :"+name);
	System.out.println("marks is :"+showCalculet());
	System.out.println("avg :"+calAvrage());
}
}
public class StudentMAvg
{
	public static void main(String x[])
	{

	int marks[]={85,90,78,92,88};
	Student stu=new Student(101,"asd",marks);
	stu.AllDetails();
	}
}
