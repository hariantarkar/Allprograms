class marksheet
{
	protected student student;
	int per;
public void setStudent(student student)
{
	this.student=student;
}
public void calPer(int subs[])
{
int agg=0;
	for(int i=0;i<subs.length;i++)
	{
	agg=agg+subs[i];
	}
	per=agg/subs.length;
}
}











