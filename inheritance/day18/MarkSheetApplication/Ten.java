class Ten extends marksheet
{
	int year;
	public void SetAddmision(int year)
	{
	this.year=year;
	}
	public void showTenResult()
	{
	System.out.println("student information:");
	System.out.println(" Id     Name     Std  ");
	System.out.println(":-----------------------:");
System.out.println(student.getId()+" \t"+student.getName()+
" \t"+student.getStd());
	System.out.println("student percentage is:"+per);
	System.out.println("   ");
	}
	public void calPer(int subs[])
	{
	if(year<=2015)
	{
	super.calPer(subs);
	}
	else
	{
	int agg=0;
	for(int i=0;i<subs.length;i++)
	{
	for(int j=(i+1);j<subs.length;j++)
	{
	if(subs[i]<=subs[j])
	{
	int temp=subs[i];
	subs[i]=subs[j];
	subs[j]=temp;
	}
	}
	}

	System.out.println("Array desending");
	for(int i=0;i<(subs.length-1);i++)
	{
	agg=agg+subs[i];
	} 
	per=agg/(subs.length-1);
	}
	}
}