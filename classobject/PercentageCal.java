import java.util.*;
class Student
{
	Scanner sc=new Scanner(System.in);
	int mark,total;
	float per;
void setMark()
{
	System.out.println("enter a mark");
	mark=sc.nextInt();
}
void calPer()
{
 	per=(float)(mark/total*100);
	System.out.println(" "+per);
}
}
public class PercentageCal
{
	public static void main(String x[])
	{
		Student s=new Student();
		s.setMark();
		s.calPer();
	}
}