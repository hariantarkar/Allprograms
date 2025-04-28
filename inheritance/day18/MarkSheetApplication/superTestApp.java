public class superTestApp
{
public static void main(String x[])
{
		student s1=new student();
		s1.setId(10);
		s1.setName("asd");
		s1.setStd("Eight");

student s2=new student();
s2.setId(11);
s2.setName("aaa");
s2.setStd("Nine");

		student s3=new student(13,"bb","Ten");


	int a[]=new int[]{70,67,66,89,99,58};

	Eight e1=new Eight();
	e1.setStudent(s1);
	e1.calPer(a);
	e1.showEigthResult();

		Nine n1=new Nine();
		n1.setStudent(s2);
		n1.calPer(a);
		n1.showNineResult();

	Ten t1=new Ten();
	t1.setStudent(s3);
	t1.SetAddmision(2024);
	t1.calPer(a);
	t1.showTenResult();

}
}


