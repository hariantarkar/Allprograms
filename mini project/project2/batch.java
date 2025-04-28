class  batch
{
	private int bid;
	private int startdate;
	private int enddate;
	private String batchname;
public void setbid(int bid)
{
	this.bid=bid;
}
public int getbid()
{
	return bid;
}
public void setstartdate(int startdate)
{
	this.startdate=startdate;
}
public int getstartdate()
{
	return startdate;
}
public void setenddate(int enddate)
{
	this.enddate=enddate;
}
public int getenddate()
{
	return enddate;
}
public void setBatchName(String batchname)
{
	this.batchname=batchname;
}
public String getBatchName()
{
	return batchname;
}
public void show()
{
System.out.println(getbid()+" \t"+getstartdate()+" \t"+getenddate()+" \t"+getBatchName()+" \t");
}
}



